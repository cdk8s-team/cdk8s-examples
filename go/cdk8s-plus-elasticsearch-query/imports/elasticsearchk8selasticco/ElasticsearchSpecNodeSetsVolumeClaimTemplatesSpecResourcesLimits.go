package elasticsearchk8selasticco

import (
	_init_ "example.com/cdk8s-plus-elasticsearch-query/imports/elasticsearchk8selasticco/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

type ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits interface {
	Value() interface{}
}

// The jsii proxy struct for ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits
type jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits struct {
	_ byte // padding
}

func (j *jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits_FromNumber(value *float64) ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits {
	_init_.Initialize()

	if err := validateElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits_FromString(value *string) ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits {
	_init_.Initialize()

	if err := validateElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

