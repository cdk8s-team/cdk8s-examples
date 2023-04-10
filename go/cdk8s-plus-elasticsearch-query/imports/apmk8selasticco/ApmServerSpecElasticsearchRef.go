// apmk8selasticco
package apmk8selasticco


// ElasticsearchRef is a reference to the output Elasticsearch cluster running in the same Kubernetes cluster.
type ApmServerSpecElasticsearchRef struct {
	// Name of the Kubernetes object.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Namespace of the Kubernetes object.
	//
	// If empty, defaults to the current namespace.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

