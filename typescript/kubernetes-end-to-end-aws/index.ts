import { Construct } from 'constructs';
import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';
import * as aws from 'aws-cdk-lib';
import * as eks from 'aws-cdk-lib/aws-eks';
import * as kubectl from '@aws-cdk/lambda-layer-kubectl-v25'

export class KubernetesEnd2End extends aws.Stack {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // AWS CDK provides a construct library for defining EKS clusters. All you need to do
    // is specify a version, and it will create a 2 node cluster inside a dedicated VPC.
    const cluster = new eks.Cluster(this, 'Cluster', {
      version: eks.KubernetesVersion.V1_25,

      // In order to access applications inside the clusters from the internet,
      // the cluster needs the ability to provision on-demand AWS load balancers that
      // route to internal Kubernetes resources.
      // (see https://github.com/aws/aws-cdk/tree/main/packages/aws-cdk-lib/aws-eks#alb-controller)
      albController: {
        version: eks.AlbControllerVersion.V2_4_1,
      },

      // In addition, the `eks.Cluster` construct is able to apply Kubernetes manifests onto the
      // cluster (we will use that capability later) via the `kubectl` utility.
      // Kubernetes recommends to always match the version of `kubectl` to the version of your
      // cluster.
      kubectlLayer: new kubectl.KubectlV25Layer(this, 'Kubectl'),

    });

    // Kubernetes clusters often contain common middleware that has cross-application concerns
    // such as observability, certificate management, and more. Such middleware can be easily 
    // installed with [helm](https://helm.sh/), which is natively supported by the `eks.Cluster` construct.
    // In this example, we install KubeView, a visualizer that helps you understand the relationships 
    // between Kubernetes resources in your cluster.
    // (see https://artifacthub.io/packages/helm/kubeview/kubeview)
    cluster.addHelmChart('KubeView', {
      repository: 'https://benc-uk.github.io/kubeview/charts',
      chart: 'kubeview',
      namespace: 'kube-system',
      values: {
        // control the service name since we will need to
        // reference to it from our app
        fullnameOverride: 'kubeview'
      }
    });

    // Kubeview is exposed via an ELB, and to access it, we need to fetch its generated DNS address.
    // The address is stored in the state of the Kubernetes service that is backed by the ELB, and 
    // can be fetched using the `getServiceLoadBalancerAddress` method:
    const kubeViewAddress = cluster.getServiceLoadBalancerAddress('kubeview', {
      namespace: 'kube-system',
    });

    // We also define a CloudFormation output for this value, so that we can see it once
    // deployment finishes successfully.
    new aws.CfnOutput(this, 'KubeViewEndpoint', {
      value: `http://${kubeViewAddress}`
    });

    // Now its time to define our kuberntes workload. We use a very simple 
    // http server that responds with a welcome message. To define this workload, 
    // we'll use cdk8s-plus.
    const chart = new k8s.Chart(new k8s.App(), 'HttpEcho');
    const deployment = new kplus.Deployment(chart, 'Deployment', {
      containers: [{
        image: 'paulbouwer/hello-kubernetes:1.5',
        portNumber: 8080,
        securityContext: {
          // required because the default image runs with a root user
          // and cdk8s-plus forbids that by default.
          user: 1005,
        }
      }],
    });

    // To expose this deployment to the outside world, we will use a
    // Kubernetes ingress resource:    
    const ingress = new kplus.Ingress(chart, 'Ingress');
    const service = deployment.exposeViaService({ serviceType: kplus.ServiceType.NODE_PORT });
    ingress.addRule('/', kplus.IngressBackend.fromService(service));

    // Deploying this workload onto the cluster is done via the `addCdk8sChart` method:
    const httpServer = cluster.addCdk8sChart(chart.node.id, chart, {

      // Ingress resources need to be specially annotated for them to be picked up and 
      // implemented by the AWS Load Balancer Controller. Setting this property to `true` will make the cluster 
      // automatically detect `Ingress` resources, and add the necessary annotation.
      ingressAlb: true,

      // By default, the provisioned ALB is `internal`, so we need explicitly 
      // make it `internet-facing`      
      ingressAlbScheme: eks.AlbScheme.INTERNET_FACING,

    });

    // the deletion of `httpServer` is what instructs the controller to delete the ELB.
    // so we need to make sure this happens before the controller is deleted.
    httpServer.node.addDependency(cluster.albController ?? []);

    // And, similarly to the KubeView endpoint, we need to fetch the generated address of the ALB,
    // this time from the state of the ingress resource.
    const appAddress = cluster.getIngressLoadBalancerAddress(ingress.name);

    // We also define a CloudFormation output for this value, so that we can see it once
    // deployment finishes successfully.
    new aws.CfnOutput(this, 'ApplicationEndpoint', {
      value: `http://${appAddress}`,
    })

  }

}

const app = new aws.App();
new KubernetesEnd2End(app, 'kubernetes-end-to-end');
app.synth();
