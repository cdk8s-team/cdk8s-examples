package main

import (
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

func NewWebServices(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	NewWebService(chart, jsii.String("hello"), &WebServiceProps{
		Image:    jsii.String("paulbouwer/hello-kubernetes:1.7"),
		Replicas: jsii.Number(2),
	})

	NewWebService(chart, jsii.String("ghost"), &WebServiceProps{
		Image:         jsii.String("ghost"),
		ContainerPort: jsii.Number(2368),
	})

	return chart
}

func main() {
	app := cdk8s.NewApp(nil)
	NewWebServices(app, "web-services")
	app.Synth()
}
