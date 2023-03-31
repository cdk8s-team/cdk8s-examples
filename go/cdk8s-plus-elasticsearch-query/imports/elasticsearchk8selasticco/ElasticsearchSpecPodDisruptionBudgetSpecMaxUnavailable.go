// elasticsearchk8selasticco
package elasticsearchk8selasticco

import (
	_init_ "example.com/cdk8s-plus-elasticsearch-query/imports/elasticsearchk8selasticco/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
type ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable interface {
	Value() interface{}
}

// The jsii proxy struct for ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable
type jsiiProxy_ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable struct {
	_ byte // padding
}

func (j *jsiiProxy_ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable_FromNumber(value *float64) ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable {
	_init_.Initialize()

	if err := validateElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable_FromString(value *string) ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable {
	_init_.Initialize()

	if err := validateElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable

	_jsii_.StaticInvoke(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

