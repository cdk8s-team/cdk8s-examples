package main

import (
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

func NewDashboard(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	cdk8s.NewInclude(chart, jsii.String("dashboard"), &cdk8s.IncludeProps{
		Url: jsii.String("https://raw.githubusercontent.com/kubernetes/dashboard/v2.7.0/aio/deploy/recommended.yaml"),
	})

	return chart
}

func main() {
	app := cdk8s.NewApp(nil)
	NewDashboard(app, "dashboard")
	app.Synth()
}
