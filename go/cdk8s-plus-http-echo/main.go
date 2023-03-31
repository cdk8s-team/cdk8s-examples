package main

import (
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
	"github.com/cdk8s-team/cdk8s-plus-go/cdk8splus26/v2"
)

func NewHttpEcho(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	ingress := cdk8splus26.NewIngress(chart, jsii.String("ingress"), nil)

	// TODO check why it is required to pass cdk8splus26.HttpIngressPathType_PREFIX
	ingress.AddRule(jsii.String("/"), EchoBackend(chart, "root"), cdk8splus26.HttpIngressPathType_PREFIX)
	ingress.AddRule(jsii.String("/foo"), EchoBackend(chart, "foo"), cdk8splus26.HttpIngressPathType_PREFIX)
	ingress.AddRule(jsii.String("/foo/bar"), EchoBackend(chart, "foo-bar"), cdk8splus26.HttpIngressPathType_PREFIX)

	ingress.AddHostDefaultBackend(jsii.String("my.host"), EchoBackend(chart, "my.host/hey"))

	return chart
}

func EchoBackend(scope constructs.Construct, text string) cdk8splus26.IngressBackend {

	deploy := cdk8splus26.NewDeployment(scope, jsii.String(text), &cdk8splus26.DeploymentProps{
		Containers: &[]*cdk8splus26.ContainerProps{
			{
				Image:      jsii.String("hashicorp/http-echo"),
				Args:       &[]*string{jsii.String("-text"), jsii.String(text)},
				PortNumber: jsii.Number(5678),
			},
		},
	})

	return cdk8splus26.IngressBackend_FromService(deploy.ExposeViaService(&cdk8splus26.DeploymentExposeViaServiceOptions{
		Ports: &[]*cdk8splus26.ServicePort{{Port: jsii.Number(5678)}}}), nil)

}

func main() {
	app := cdk8s.NewApp(nil)
	NewHttpEcho(app, "http-echo")
	app.Synth()
}
