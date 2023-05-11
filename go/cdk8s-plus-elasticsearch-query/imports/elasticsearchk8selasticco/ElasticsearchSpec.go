package elasticsearchk8selasticco


// ElasticsearchSpec holds the specification of an Elasticsearch cluster.
type ElasticsearchSpec struct {
	// NodeSets allow specifying groups of Elasticsearch nodes sharing the same configuration and Pod templates.
	//
	// See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-orchestration.html
	NodeSets *[]*ElasticsearchSpecNodeSets `field:"required" json:"nodeSets" yaml:"nodeSets"`
	// Version of Elasticsearch.
	Version *string `field:"required" json:"version" yaml:"version"`
	// Auth contains user authentication and authorization security settings for Elasticsearch.
	Auth *ElasticsearchSpecAuth `field:"optional" json:"auth" yaml:"auth"`
	// HTTP holds HTTP layer settings for Elasticsearch.
	Http *ElasticsearchSpecHttp `field:"optional" json:"http" yaml:"http"`
	// Image is the Elasticsearch Docker image to deploy.
	Image *string `field:"optional" json:"image" yaml:"image"`
	// PodDisruptionBudget provides access to the default pod disruption budget for the Elasticsearch cluster.
	//
	// The default budget selects all cluster pods and sets `maxUnavailable` to 1. To disable, set `PodDisruptionBudget` to the empty value (`{}` in YAML).
	PodDisruptionBudget *ElasticsearchSpecPodDisruptionBudget `field:"optional" json:"podDisruptionBudget" yaml:"podDisruptionBudget"`
	// RemoteClusters enables you to establish uni-directional connections to a remote Elasticsearch cluster.
	RemoteClusters *[]*ElasticsearchSpecRemoteClusters `field:"optional" json:"remoteClusters" yaml:"remoteClusters"`
	// SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Elasticsearch.
	SecureSettings *[]*ElasticsearchSpecSecureSettings `field:"optional" json:"secureSettings" yaml:"secureSettings"`
	// ServiceAccountName is used to check access from the current resource to a resource (eg.
	//
	// a remote Elasticsearch cluster) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
	ServiceAccountName *string `field:"optional" json:"serviceAccountName" yaml:"serviceAccountName"`
	// Transport holds transport layer settings for Elasticsearch.
	Transport *ElasticsearchSpecTransport `field:"optional" json:"transport" yaml:"transport"`
	// UpdateStrategy specifies how updates to the cluster should be performed.
	UpdateStrategy *ElasticsearchSpecUpdateStrategy `field:"optional" json:"updateStrategy" yaml:"updateStrategy"`
}

