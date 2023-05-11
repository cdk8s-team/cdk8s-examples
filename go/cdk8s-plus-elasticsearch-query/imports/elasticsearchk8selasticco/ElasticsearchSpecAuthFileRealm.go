package elasticsearchk8selasticco


// FileRealmSource references users to create in the Elasticsearch cluster.
type ElasticsearchSpecAuthFileRealm struct {
	// SecretName is the name of the secret.
	SecretName *string `field:"optional" json:"secretName" yaml:"secretName"`
}

