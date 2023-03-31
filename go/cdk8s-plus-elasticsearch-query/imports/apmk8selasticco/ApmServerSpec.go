// apmk8selasticco
package apmk8selasticco


// ApmServerSpec holds the specification of an APM Server.
type ApmServerSpec struct {
	// Version of the APM Server.
	Version *string `field:"required" json:"version" yaml:"version"`
	// Config holds the APM Server configuration.
	//
	// See: https://www.elastic.co/guide/en/apm/server/current/configuring-howto-apm-server.html
	Config interface{} `field:"optional" json:"config" yaml:"config"`
	// Count of APM Server instances to deploy.
	Count *float64 `field:"optional" json:"count" yaml:"count"`
	// ElasticsearchRef is a reference to the output Elasticsearch cluster running in the same Kubernetes cluster.
	ElasticsearchRef *ApmServerSpecElasticsearchRef `field:"optional" json:"elasticsearchRef" yaml:"elasticsearchRef"`
	// HTTP holds the HTTP layer configuration for the APM Server resource.
	Http *ApmServerSpecHttp `field:"optional" json:"http" yaml:"http"`
	// Image is the APM Server Docker image to deploy.
	Image *string `field:"optional" json:"image" yaml:"image"`
	// PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the APM Server pods.
	PodTemplate interface{} `field:"optional" json:"podTemplate" yaml:"podTemplate"`
	// SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for APM Server.
	SecureSettings *[]*ApmServerSpecSecureSettings `field:"optional" json:"secureSettings" yaml:"secureSettings"`
	// ServiceAccountName is used to check access from the current resource to a resource (eg.
	//
	// Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
	ServiceAccountName *string `field:"optional" json:"serviceAccountName" yaml:"serviceAccountName"`
}

