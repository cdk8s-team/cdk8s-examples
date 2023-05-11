package elasticsearchk8selasticco


// UpdateStrategy specifies how updates to the cluster should be performed.
type ElasticsearchSpecUpdateStrategy struct {
	// ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.
	ChangeBudget *ElasticsearchSpecUpdateStrategyChangeBudget `field:"optional" json:"changeBudget" yaml:"changeBudget"`
}

