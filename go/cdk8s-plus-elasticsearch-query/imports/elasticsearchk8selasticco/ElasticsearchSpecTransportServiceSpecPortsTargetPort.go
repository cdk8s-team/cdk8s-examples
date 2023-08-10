package elasticsearchk8selasticco

import (
	_init_ "example.com/cdk8s-plus-elasticsearch-query/imports/elasticsearchk8selasticco/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the pods targeted by the service.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
type ElasticsearchSpecTransportServiceSpecPortsTargetPort interface {
	Value() interface{}
}

// The jsii proxy struct for ElasticsearchSpecTransportServiceSpecPortsTargetPort
type jsiiProxy_ElasticsearchSpecTransportServiceSpecPortsTargetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ElasticsearchSpecTransportServiceSpecPortsTargetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ElasticsearchSpecTransportServiceSpecPortsTargetPort_FromNumber(value *float64) ElasticsearchSpecTransportServiceSpecPortsTargetPort {
	_init_.Initialize()

	if err := validateElasticsearchSpecTransportServiceSpecPortsTargetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecTransportServiceSpecPortsTargetPort

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportServiceSpecPortsTargetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ElasticsearchSpecTransportServiceSpecPortsTargetPort_FromString(value *string) ElasticsearchSpecTransportServiceSpecPortsTargetPort {
	_init_.Initialize()

	if err := validateElasticsearchSpecTransportServiceSpecPortsTargetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecTransportServiceSpecPortsTargetPort

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportServiceSpecPortsTargetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

