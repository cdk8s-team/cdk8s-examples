package main

import (
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

func NewRedis(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	cdk8s.NewHelm(chart, jsii.String("redis"), &cdk8s.HelmProps{
		Chart:   jsii.String("bitnami/redis"),
		Version: jsii.String("17.9.2"),
		Values: &map[string]interface{}{
			"auth": map[string]string{
				"password": "sdweqweq",
			},
			"sentinel": map[string]bool{
				"enabled": true,
			},
		},
	})

	return chart
}

func main() {
	app := cdk8s.NewApp(nil)
	NewRedis(app, "redis")
	app.Synth()
}
