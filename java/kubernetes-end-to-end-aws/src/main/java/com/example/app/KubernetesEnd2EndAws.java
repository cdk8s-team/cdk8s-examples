package com.example.app;

import org.cdk8s.plus25.*;

import software.amazon.awscdk.App;
import software.amazon.awscdk.CfnOutput;
import software.amazon.awscdk.CfnOutputProps;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.cdk.lambdalayer.kubectl.v25.KubectlV25Layer;
import software.amazon.awscdk.services.eks.AlbControllerOptions;
import software.amazon.awscdk.services.eks.AlbControllerVersion;
import software.amazon.awscdk.services.eks.AlbScheme;
import software.amazon.awscdk.services.eks.Cluster;
import software.amazon.awscdk.services.eks.ClusterProps;
import software.amazon.awscdk.services.eks.HelmChartOptions;
import software.amazon.awscdk.services.eks.KubernetesManifest;
import software.amazon.awscdk.services.eks.KubernetesManifestOptions;
import software.amazon.awscdk.services.eks.KubernetesVersion;
import software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions;
import software.constructs.Construct;

import org.cdk8s.Chart;
import java.util.Collections;
import java.util.List;

public class KubernetesEnd2EndAws extends Stack {

        public KubernetesEnd2EndAws(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public KubernetesEnd2EndAws(final Construct scope, final String id, final StackProps props) {
                super(scope, id, props);

                // AWS CDK provides a construct library for defining EKS clusters. All you need
                // to do
                // is specify a version, and it will create a 2 node cluster inside a dedicated
                // VPC.
                // this can also be an imported cluster that has been pre-created with the AWS
                // CDK.
                Cluster cluster = new Cluster(this, "Cluster", ClusterProps.builder()
                                .version(KubernetesVersion.V1_25)

                                // In order to access applications inside the clusters from the internet,
                                // the cluster needs the ability to provision on-demand AWS load balancers that
                                // route to internal Kubernetes resources.
                                // (see
                                // https://github.com/aws/aws-cdk/tree/main/packages/aws-cdk-lib/aws-eks#alb-controller)
                                .albController(AlbControllerOptions.builder()
                                                .version(AlbControllerVersion.V2_4_1)
                                                .build())

                                // In addition, the `eks.Cluster` construct is able to apply Kubernetes
                                // manifests onto the
                                // cluster (we will use that capability later) via the `kubectl` utility.
                                // Kubernetes recommends to always match the version of `kubectl` to the version
                                // of your
                                // cluster.
                                .kubectlLayer(new KubectlV25Layer(this, "Kubectl"))
                                .build());

                // Kubernetes clusters often contain common middleware that has
                // cross-application concerns
                // such as observability, certificate management, and more. Such middleware can
                // be easily
                // installed with [helm](https://helm.sh/), which is natively supported by the
                // `eks.Cluster` construct.
                // In this example, we install KubeView, a visualizer that helps you understand
                // the relationships
                // between Kubernetes resources in your cluster.
                // (see https://artifacthub.io/packages/helm/kubeview/kubeview)
                cluster.addHelmChart("KubeView", HelmChartOptions.builder()
                                .repository("https://benc-uk.github.io/kubeview/charts")
                                .chart("kubeview")
                                .namespace("kube-system")
                                // control the service name since we will need to
                                // reference to it from our app
                                .values(Collections.singletonMap("fullnameOverride", "kubeview"))
                                .build());

                // Kubeview is exposed via an ELB, and to access it, we need to fetch its
                // generated DNS address.
                // The address is stored in the state of the Kubernetes service that is backed
                // by the ELB, and
                // can be fetched using the `getServiceLoadBalancerAddress` method:
                String kubeViewAddress = cluster.getServiceLoadBalancerAddress("kubeview",
                                ServiceLoadBalancerAddressOptions.builder()
                                                .namespace("kube-system")
                                                .build());

                // We also define a CloudFormation output for this value, so that we can see it
                // once
                // deployment finishes successfully.
                new CfnOutput(this, "KubeViewEndpoint", CfnOutputProps.builder()
                                .value("http://" + kubeViewAddress)
                                .build());

                // Now its time to define our kuberntes workload. We use a very simple
                // http server that responds with a welcome message. To define this workload,
                // we'll use cdk8s-plus.
                Chart chart = new Chart(new org.cdk8s.App(), "HttpEcho");
                Deployment deployment = new Deployment(chart, "Deployment", DeploymentProps.builder()
                                .containers(List.of(ContainerProps.builder()
                                                .image("paulbouwer/hello-kubernetes:1.5")
                                                .portNumber(8080)
                                                .securityContext(ContainerSecurityContextProps.builder()
                                                                .user(1005)
                                                                .build())
                                                .build()))
                                .build());

                // To expose this deployment to the outside world, we will use a
                // Kubernetes ingress resource:
                Ingress ingress = new Ingress(chart, "Ingress");
                Service service = deployment.exposeViaService(ExposeDeploymentViaIngressOptions.builder()
                                .serviceType(ServiceType.NODE_PORT)
                                .build());
                ingress.addRule("/", IngressBackend.fromService(service));

                // Deploying this workload onto the cluster is done via the `addCdk8sChart`
                // method:
                KubernetesManifest httpServer = cluster.addCdk8sChart(chart.getNode().getId(), chart,
                                KubernetesManifestOptions.builder()
                                                // Ingress resources need to be specially annotated for them to be
                                                // picked up and
                                                // implemented by the AWS Load Balancer Controller. Setting this
                                                // property to `true` will make the cluster
                                                // automatically detect `Ingress` resources, and add the necessary
                                                // annotation.
                                                .ingressAlb(true)

                                                // By default, the provisioned ALB is `internal`, so we need explicitly
                                                // make it `internet-facing`
                                                .ingressAlbScheme(AlbScheme.INTERNET_FACING)
                                                .build());

                // the deletion of `httpServer` is what instructs the controller to delete the
                // ELB.
                // so we need to make sure this happens before the controller is deleted.
                httpServer.getNode().addDependency(cluster.getAlbController());

                // And, similarly to the KubeView endpoint, we need to fetch the generated
                // address of the ALB,
                // this time from the state of the ingress resource.
                String appAddress = cluster.getIngressLoadBalancerAddress(ingress.getName());

                // We also define a CloudFormation output for this value, so that we can see it
                // once
                // deployment finishes successfully.
                new CfnOutput(this, "ApplicationEndpoint", CfnOutputProps.builder()
                                .value("http://" + appAddress)
                                .build());

        }

        public static void main(String[] args) {

                final App app = new App();
                new KubernetesEnd2EndAws(app, "kubernetes-end-to-end-aws");
                app.synth();

        }
}