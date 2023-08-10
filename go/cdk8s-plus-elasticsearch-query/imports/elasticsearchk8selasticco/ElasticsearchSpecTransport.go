package elasticsearchk8selasticco


// Transport holds transport layer settings for Elasticsearch.
type ElasticsearchSpecTransport struct {
	// Service defines the template for the associated Kubernetes Service object.
	Service *ElasticsearchSpecTransportService `field:"optional" json:"service" yaml:"service"`
}

