package main

import (
	"example.com/cdk8s-composition/imports/k8s"
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

type WebServiceProps struct {
	Image         *string
	Replicas      *float64
	Port          *float64
	ContainerPort *float64
}

func NewWebService(scope constructs.Construct, id *string, props *WebServiceProps) constructs.Construct {

	me := constructs.NewConstruct(scope, id)

	replicas := props.Replicas
	if replicas == nil {
		replicas = jsii.Number(1)
	}

	port := props.Port
	if port == nil {
		port = jsii.Number(80)
	}

	containerPort := props.ContainerPort
	if containerPort == nil {
		containerPort = jsii.Number(8080)
	}

	label := map[string]*string{"app": cdk8s.Names_ToLabelValue(me, nil)}

	k8s.NewKubeService(me, jsii.String("service"), &k8s.KubeServiceProps{
		Spec: &k8s.ServiceSpec{
			Type:     jsii.String("LoadBalancer"),
			Ports:    &[]*k8s.ServicePort{{Port: port, TargetPort: k8s.IntOrString_FromNumber(containerPort)}},
			Selector: &label,
		},
	})

	k8s.NewKubeDeployment(me, jsii.String("deployment"), &k8s.KubeDeploymentProps{
		Spec: &k8s.DeploymentSpec{
			Replicas: replicas,
			Selector: &k8s.LabelSelector{
				MatchLabels: &label,
			},
			Template: &k8s.PodTemplateSpec{
				Metadata: &k8s.ObjectMeta{Labels: &label},
				Spec: &k8s.PodSpec{
					Containers: &[]*k8s.Container{
						{
							Name:  jsii.String("web"),
							Image: props.Image,
							Ports: &[]*k8s.ContainerPort{{ContainerPort: containerPort}},
						},
					},
				},
			},
		},
	})

	return me
}
