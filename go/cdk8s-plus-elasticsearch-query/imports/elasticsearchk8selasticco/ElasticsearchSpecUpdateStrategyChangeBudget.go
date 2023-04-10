// elasticsearchk8selasticco
package elasticsearchk8selasticco


// ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.
type ElasticsearchSpecUpdateStrategyChangeBudget struct {
	// MaxSurge is the maximum number of new pods that can be created exceeding the original number of pods defined in the specification.
	//
	// MaxSurge is only taken into consideration when scaling up. Setting a negative value will disable the restriction. Defaults to unbounded if not specified.
	MaxSurge *float64 `field:"optional" json:"maxSurge" yaml:"maxSurge"`
	// MaxUnavailable is the maximum number of pods that can be unavailable (not ready) during the update due to circumstances under the control of the operator.
	//
	// Setting a negative value will disable this restriction. Defaults to 1 if not specified.
	MaxUnavailable *float64 `field:"optional" json:"maxUnavailable" yaml:"maxUnavailable"`
}

