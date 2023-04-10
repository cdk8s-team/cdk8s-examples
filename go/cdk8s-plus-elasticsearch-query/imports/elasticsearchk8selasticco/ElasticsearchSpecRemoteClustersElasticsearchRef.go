// elasticsearchk8selasticco
package elasticsearchk8selasticco


// ElasticsearchRef is a reference to an Elasticsearch cluster running within the same k8s cluster.
type ElasticsearchSpecRemoteClustersElasticsearchRef struct {
	// Name of the Kubernetes object.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Namespace of the Kubernetes object.
	//
	// If empty, defaults to the current namespace.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

