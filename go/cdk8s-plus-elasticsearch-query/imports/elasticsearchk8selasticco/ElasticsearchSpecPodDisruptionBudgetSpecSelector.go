package elasticsearchk8selasticco


// Label query over pods whose evictions are managed by the disruption budget.
type ElasticsearchSpecPodDisruptionBudgetSpecSelector struct {
	// matchExpressions is a list of label selector requirements.
	//
	// The requirements are ANDed.
	MatchExpressions *[]*ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions `field:"optional" json:"matchExpressions" yaml:"matchExpressions"`
	// matchLabels is a map of {key,value} pairs.
	//
	// A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
	MatchLabels *map[string]*string `field:"optional" json:"matchLabels" yaml:"matchLabels"`
}

