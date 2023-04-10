// elasticsearchk8selasticco
package elasticsearchk8selasticco


// Auth contains user authentication and authorization security settings for Elasticsearch.
type ElasticsearchSpecAuth struct {
	// FileRealm to propagate to the Elasticsearch cluster.
	FileRealm *[]*ElasticsearchSpecAuthFileRealm `field:"optional" json:"fileRealm" yaml:"fileRealm"`
	// Roles to propagate to the Elasticsearch cluster.
	Roles *[]*ElasticsearchSpecAuthRoles `field:"optional" json:"roles" yaml:"roles"`
}

