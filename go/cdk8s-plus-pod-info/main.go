package main

import (
	"fmt"
	"strconv"

	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
	"github.com/cdk8s-team/cdk8s-plus-go/cdk8splus26/v2"
)

func NewPodInfo(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	portNumber := 9898

	deployment := cdk8splus26.NewDeployment(chart, jsii.String("Deployment"), nil)

	deployment.Metadata().AddAnnotation(jsii.String("prometheus.io/scrape"), jsii.String("true"))
	deployment.Metadata().AddAnnotation(jsii.String("prometheus.io/port"), jsii.String(strconv.FormatInt(int64(portNumber), 10)))

	container := deployment.AddContainer(&cdk8splus26.ContainerProps{
		Image: jsii.String("stefanprodan/podinfo:3.0.0"),
		Command: &[]*string{
			jsii.String("./podinfo"),
			jsii.String(fmt.Sprintf("--port=%d", portNumber)),
			jsii.String("--level=info"),
			jsii.String("--random-error=true"),
		},
		ImagePullPolicy: cdk8splus26.ImagePullPolicy_IF_NOT_PRESENT,
		PortNumber:      jsii.Number(portNumber),
		Liveness: cdk8splus26.Probe_FromCommand(&[]*string{jsii.String("podcli"), jsii.String("check"), jsii.String("http"), jsii.String(fmt.Sprintf("localhost:%d/healthz", portNumber))}, &cdk8splus26.CommandProbeOptions{
			InitialDelaySeconds: cdk8s.Duration_Seconds(jsii.Number(1)),
			TimeoutSeconds:      cdk8s.Duration_Seconds(jsii.Number(5)),
		}),
		Readiness: cdk8splus26.Probe_FromCommand(&[]*string{jsii.String("podcli"), jsii.String("check"), jsii.String("http"), jsii.String(fmt.Sprintf("localhost:%d/readyz", portNumber))}, &cdk8splus26.CommandProbeOptions{
			InitialDelaySeconds: cdk8s.Duration_Seconds(jsii.Number(1)),
			TimeoutSeconds:      cdk8s.Duration_Seconds(jsii.Number(5)),
		}),
	})
	container.Env().AddVariable(jsii.String("PODINFO_UI_MESSAGE"), cdk8splus26.EnvValue_FromValue(jsii.String("this is my podinfo message")))
	container.Mount(jsii.String("/data"), cdk8splus26.Volume_FromEmptyDir(chart, jsii.String("data"), jsii.String("data"), nil), nil)

	cdk8splus26.NewHorizontalPodAutoscaler(chart, jsii.String("HPA"), &cdk8splus26.HorizontalPodAutoscalerProps{
		Target:      deployment,
		MaxReplicas: jsii.Number(100),
		MinReplicas: jsii.Number(2),
		Metrics:     &[]cdk8splus26.Metric{cdk8splus26.Metric_ResourceCpu(cdk8splus26.MetricTarget_AverageUtilization(jsii.Number(80)))},
	})

	service := deployment.ExposeViaService(nil)

	service.ExposeViaIngress(jsii.String("/*"), nil)

	return chart

}

func main() {
	app := cdk8s.NewApp(nil)
	NewPodInfo(app, "pod-info")
	app.Synth()
}
