package elasticsearchk8selasticco


// KeyToPath defines how to map a key in a Secret object to a filesystem path.
type ElasticsearchSpecSecureSettingsEntries struct {
	// Key is the key contained in the secret.
	Key *string `field:"required" json:"key" yaml:"key"`
	// Path is the relative file path to map the key to.
	//
	// Path must not be an absolute file path and must not contain any ".." components.
	Path *string `field:"optional" json:"path" yaml:"path"`
}

