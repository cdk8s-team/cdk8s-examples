// elasticsearchk8selasticco
package elasticsearchk8selasticco

import (
	_init_ "example.com/cdk8s-plus-elasticsearch-query/imports/elasticsearchk8selasticco/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

type ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests interface {
	Value() interface{}
}

// The jsii proxy struct for ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests
type jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests struct {
	_ byte // padding
}

func (j *jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests_FromNumber(value *float64) ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests {
	_init_.Initialize()

	if err := validateElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests_FromString(value *string) ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests {
	_init_.Initialize()

	if err := validateElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

