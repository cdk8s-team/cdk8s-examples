package kibanak8selasticco


// KibanaSpec holds the specification of a Kibana instance.
type KibanaSpec struct {
	// Version of Kibana.
	Version *string `field:"required" json:"version" yaml:"version"`
	// Config holds the Kibana configuration.
	//
	// See: https://www.elastic.co/guide/en/kibana/current/settings.html
	Config interface{} `field:"optional" json:"config" yaml:"config"`
	// Count of Kibana instances to deploy.
	Count *float64 `field:"optional" json:"count" yaml:"count"`
	// ElasticsearchRef is a reference to an Elasticsearch cluster running in the same Kubernetes cluster.
	ElasticsearchRef *KibanaSpecElasticsearchRef `field:"optional" json:"elasticsearchRef" yaml:"elasticsearchRef"`
	// HTTP holds the HTTP layer configuration for Kibana.
	Http *KibanaSpecHttp `field:"optional" json:"http" yaml:"http"`
	// Image is the Kibana Docker image to deploy.
	Image *string `field:"optional" json:"image" yaml:"image"`
	// PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Kibana pods.
	PodTemplate interface{} `field:"optional" json:"podTemplate" yaml:"podTemplate"`
	// SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Kibana.
	SecureSettings *[]*KibanaSpecSecureSettings `field:"optional" json:"secureSettings" yaml:"secureSettings"`
	// ServiceAccountName is used to check access from the current resource to a resource (eg.
	//
	// Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
	ServiceAccountName *string `field:"optional" json:"serviceAccountName" yaml:"serviceAccountName"`
}

