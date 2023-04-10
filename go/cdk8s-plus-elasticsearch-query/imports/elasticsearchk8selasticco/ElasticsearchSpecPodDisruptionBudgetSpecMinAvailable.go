// elasticsearchk8selasticco
package elasticsearchk8selasticco

import (
	_init_ "example.com/cdk8s-plus-elasticsearch-query/imports/elasticsearchk8selasticco/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
type ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable interface {
	Value() interface{}
}

// The jsii proxy struct for ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable
type jsiiProxy_ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable struct {
	_ byte // padding
}

func (j *jsiiProxy_ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable_FromNumber(value *float64) ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable {
	_init_.Initialize()

	if err := validateElasticsearchSpecPodDisruptionBudgetSpecMinAvailable_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable_FromString(value *string) ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable {
	_init_.Initialize()

	if err := validateElasticsearchSpecPodDisruptionBudgetSpecMinAvailable_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

