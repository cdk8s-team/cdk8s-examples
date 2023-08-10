package main

import (
	"fmt"

	"github.com/aws/aws-cdk-go/awscdk/v2"
	"github.com/aws/aws-cdk-go/awscdk/v2/awseks"
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
	"github.com/cdk8s-team/cdk8s-plus-go/cdk8splus25/v2"
	"github.com/cdklabs/awscdk-kubectl-go/kubectlv25/v2"
)

func NewKubernetesEndToEndAws(scope constructs.Construct, id string) awscdk.Stack {

	stack := awscdk.NewStack(scope, &id, nil)

	// AWS CDK provides a construct library for defining EKS clusters. All you need to do
	// is specify a version, and it will create a 2 node cluster inside a dedicated VPC.
	// this can also be an imported cluster that has been pre-created with the AWS CDK.
	cluster := awseks.NewCluster(stack, jsii.String("Cluster"), &awseks.ClusterProps{
		Version: awseks.KubernetesVersion_V1_25(),

		// In order to access applications inside the clusters from the internet,
		// the cluster needs the ability to provision on-demand AWS load balancers that
		// route to internal Kubernetes resources.
		// (see https://github.com/aws/aws-cdk/tree/main/packages/aws-cdk-lib/aws-eks#alb-controller)
		AlbController: &awseks.AlbControllerOptions{
			Version: awseks.AlbControllerVersion_V2_4_1(),
		},

		// In addition, the `eks.Cluster` construct is able to apply Kubernetes manifests onto the
		// cluster (we will use that capability later) via the `kubectl` utility.
		// Kubernetes recommends to always match the version of `kubectl` to the version of your
		// cluster.
		KubectlLayer: kubectlv25.NewKubectlV25Layer(stack, jsii.String("Kubectl")),
	})

	// Kubernetes clusters often contain common middleware that has cross-application concerns
	// such as observability, certificate management, and more. Such middleware can be easily
	// installed with [helm](https://helm.sh/), which is natively supported by the `eks.Cluster` construct.
	// In this example, we install KubeView, a visualizer that helps you understand the relationships
	// between Kubernetes resources in your cluster.
	// (see https://artifacthub.io/packages/helm/kubeview/kubeview)
	cluster.AddHelmChart(jsii.String("Kubeview"), &awseks.HelmChartOptions{
		Repository: jsii.String("https://benc-uk.github.io/kubeview/charts"),
		Chart:      jsii.String("kubeview"),
		Namespace:  jsii.String("kube-system"),
		Values: &map[string]interface{}{
			"fullnameOverride": "kubeview",
		},
	})

	// Kubeview is exposed via an ELB, and to access it, we need to fetch its generated DNS address.
	// The address is stored in the state of the Kubernetes service that is backed by the ELB, and
	// can be fetched using the `getServiceLoadBalancerAddress` method:
	kubeViewAddress := cluster.GetServiceLoadBalancerAddress(jsii.String("kubeview"), &awseks.ServiceLoadBalancerAddressOptions{
		Namespace: jsii.String("kube-system"),
	})

	// We also define a CloudFormation output for this value, so that we can see it once
	// deployment finishes successfully.
	awscdk.NewCfnOutput(stack, jsii.String("KubeViewEndpoint"), &awscdk.CfnOutputProps{
		Value: jsii.String(fmt.Sprintf("http://%s", *kubeViewAddress)),
	})

	// Now its time to define our kuberntes workload. We use a very simple
	// http server that responds with a welcome message. To define this workload,
	// we'll use cdk8s-plus.
	chart := cdk8s.NewChart(cdk8s.NewApp(nil), jsii.String("HttpEcho"), nil)
	deployment := cdk8splus25.NewDeployment(chart, jsii.String("Deployment"), &cdk8splus25.DeploymentProps{
		Containers: &[]*cdk8splus25.ContainerProps{{
			Image:      jsii.String("paulbouwer/hello-kubernetes:1.5"),
			PortNumber: jsii.Number(8080),
			SecurityContext: &cdk8splus25.ContainerSecurityContextProps{
				// required because the default image runs with a root user
				// and cdk8s-plus forbids that by default.
				User: jsii.Number(1005),
			},
		}},
	})

	// To expose this deployment to the outside world, we will use a
	// Kubernetes ingress resource:
	ingress := cdk8splus25.NewIngress(chart, jsii.String("Ingress"), nil)
	service := deployment.ExposeViaService(&cdk8splus25.DeploymentExposeViaServiceOptions{
		ServiceType: cdk8splus25.ServiceType_NODE_PORT,
	})
	ingress.AddRule(jsii.String("/"), cdk8splus25.IngressBackend_FromService(service, nil), cdk8splus25.HttpIngressPathType_PREFIX)

	// Deploying this workload onto the cluster is done via the `addCdk8sChart` method:
	httpServer := cluster.AddCdk8sChart(chart.Node().Id(), chart, &awseks.KubernetesManifestOptions{
		// Ingress resources need to be specially annotated for them to be picked up and
		// implemented by the AWS Load Balancer Controller. Setting this property to `true` will make the cluster
		// automatically detect `Ingress` resources, and add the necessary annotation.
		IngressAlb: jsii.Bool(true),

		// By default, the provisioned ALB is `internal`, so we need explicitly
		// make it `internet-facing`
		IngressAlbScheme: awseks.AlbScheme_INTERNET_FACING,
	})

	// the deletion of `httpServer` is what instructs the controller to delete the ELB.
	// so we need to make sure this happens before the controller is deleted.
	httpServer.Node().AddDependency(cluster.AlbController())

	// And, similarly to the KubeView endpoint, we need to fetch the generated address of the ALB,
	// this time from the state of the ingress resource.
	appAddress := cluster.GetIngressLoadBalancerAddress(ingress.Name(), nil)

	// We also define a CloudFormation output for this value, so that we can see it once
	// deployment finishes successfully.
	awscdk.NewCfnOutput(stack, jsii.String("ApplicationEndpoint"), &awscdk.CfnOutputProps{
		Value: jsii.String(fmt.Sprintf("http://%s", *appAddress)),
	})

	return stack

}

func main() {
	app := awscdk.NewApp(nil)
	NewKubernetesEndToEndAws(app, "kubernetes-end-to-end-aws")
	app.Synth(nil)
}
