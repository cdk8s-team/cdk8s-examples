// elasticsearchk8selasticco
package elasticsearchk8selasticco


// RoleSource references roles to create in the Elasticsearch cluster.
type ElasticsearchSpecAuthRoles struct {
	// SecretName is the name of the secret.
	SecretName *string `field:"optional" json:"secretName" yaml:"secretName"`
}

