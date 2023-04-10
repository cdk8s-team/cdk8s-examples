// elasticsearchk8selasticco
package elasticsearchk8selasticco


// HTTP holds HTTP layer settings for Elasticsearch.
type ElasticsearchSpecHttp struct {
	// Service defines the template for the associated Kubernetes Service object.
	Service *ElasticsearchSpecHttpService `field:"optional" json:"service" yaml:"service"`
	// TLS defines options for configuring TLS for HTTP.
	Tls *ElasticsearchSpecHttpTls `field:"optional" json:"tls" yaml:"tls"`
}

