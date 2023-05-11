package apmk8selasticco

import (
	_init_ "example.com/cdk8s-plus-elasticsearch-query/imports/apmk8selasticco/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the pods targeted by the service.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
type ApmServerSpecHttpServiceSpecPortsTargetPort interface {
	Value() interface{}
}

// The jsii proxy struct for ApmServerSpecHttpServiceSpecPortsTargetPort
type jsiiProxy_ApmServerSpecHttpServiceSpecPortsTargetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ApmServerSpecHttpServiceSpecPortsTargetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ApmServerSpecHttpServiceSpecPortsTargetPort_FromNumber(value *float64) ApmServerSpecHttpServiceSpecPortsTargetPort {
	_init_.Initialize()

	if err := validateApmServerSpecHttpServiceSpecPortsTargetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ApmServerSpecHttpServiceSpecPortsTargetPort

	_jsii_.StaticInvoke(
		"apmk8selasticco.ApmServerSpecHttpServiceSpecPortsTargetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ApmServerSpecHttpServiceSpecPortsTargetPort_FromString(value *string) ApmServerSpecHttpServiceSpecPortsTargetPort {
	_init_.Initialize()

	if err := validateApmServerSpecHttpServiceSpecPortsTargetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ApmServerSpecHttpServiceSpecPortsTargetPort

	_jsii_.StaticInvoke(
		"apmk8selasticco.ApmServerSpecHttpServiceSpecPortsTargetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

