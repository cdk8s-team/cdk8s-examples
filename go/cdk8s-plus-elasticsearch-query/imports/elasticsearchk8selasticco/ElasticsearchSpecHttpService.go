package elasticsearchk8selasticco


// Service defines the template for the associated Kubernetes Service object.
type ElasticsearchSpecHttpService struct {
	// ObjectMeta is the metadata of the service.
	//
	// The name and namespace provided here are managed by ECK and will be ignored.
	Metadata interface{} `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec is the specification of the service.
	Spec *ElasticsearchSpecHttpServiceSpec `field:"optional" json:"spec" yaml:"spec"`
}

