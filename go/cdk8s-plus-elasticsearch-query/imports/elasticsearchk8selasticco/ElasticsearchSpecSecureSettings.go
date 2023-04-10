// elasticsearchk8selasticco
package elasticsearchk8selasticco


// SecretSource defines a data source based on a Kubernetes Secret.
type ElasticsearchSpecSecureSettings struct {
	// SecretName is the name of the secret.
	SecretName *string `field:"required" json:"secretName" yaml:"secretName"`
	// Entries define how to project each key-value pair in the secret to filesystem paths.
	//
	// If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.
	Entries *[]*ElasticsearchSpecSecureSettingsEntries `field:"optional" json:"entries" yaml:"entries"`
}

