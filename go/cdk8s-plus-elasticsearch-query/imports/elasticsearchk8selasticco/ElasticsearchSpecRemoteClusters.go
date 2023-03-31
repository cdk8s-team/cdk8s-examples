// elasticsearchk8selasticco
package elasticsearchk8selasticco


// RemoteCluster declares a remote Elasticsearch cluster connection.
type ElasticsearchSpecRemoteClusters struct {
	// Name is the name of the remote cluster as it is set in the Elasticsearch settings.
	//
	// The name is expected to be unique for each remote clusters.
	Name *string `field:"required" json:"name" yaml:"name"`
	// ElasticsearchRef is a reference to an Elasticsearch cluster running within the same k8s cluster.
	ElasticsearchRef *ElasticsearchSpecRemoteClustersElasticsearchRef `field:"optional" json:"elasticsearchRef" yaml:"elasticsearchRef"`
}

