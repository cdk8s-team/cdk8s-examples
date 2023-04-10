// elasticsearchk8selasticco
package elasticsearchk8selasticco


// PersistentVolumeClaim is a user's request for and claim to a persistent volume.
type ElasticsearchSpecNodeSetsVolumeClaimTemplates struct {
	// APIVersion defines the versioned schema of this representation of an object.
	//
	// Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `field:"optional" json:"apiVersion" yaml:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents.
	//
	// Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `field:"optional" json:"kind" yaml:"kind"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata interface{} `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the desired characteristics of a volume requested by a pod author.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
	Spec *ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec `field:"optional" json:"spec" yaml:"spec"`
	// Status represents the current information/status of a persistent volume claim.
	//
	// Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
	Status *ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus `field:"optional" json:"status" yaml:"status"`
}

