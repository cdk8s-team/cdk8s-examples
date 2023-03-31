// elasticsearchk8selasticco
package elasticsearchk8selasticco

import (
	_init_ "example.com/cdk8s-plus-elasticsearch-query/imports/elasticsearchk8selasticco/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

type ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity interface {
	Value() interface{}
}

// The jsii proxy struct for ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity
type jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity struct {
	_ byte // padding
}

func (j *jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity_FromNumber(value *float64) ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity {
	_init_.Initialize()

	if err := validateElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity_FromString(value *string) ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity {
	_init_.Initialize()

	if err := validateElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

