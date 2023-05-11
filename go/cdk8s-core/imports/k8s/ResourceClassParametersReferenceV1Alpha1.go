package k8s


// ResourceClassParametersReference contains enough information to let you locate the parameters for a ResourceClass.
type ResourceClassParametersReferenceV1Alpha1 struct {
	// Kind is the type of resource being referenced.
	//
	// This is the same value as in the parameter object's metadata.
	Kind *string `field:"required" json:"kind" yaml:"kind"`
	// Name is the name of resource being referenced.
	Name *string `field:"required" json:"name" yaml:"name"`
	// APIGroup is the group for the resource being referenced.
	//
	// It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
	ApiGroup *string `field:"optional" json:"apiGroup" yaml:"apiGroup"`
	// Namespace that contains the referenced resource.
	//
	// Must be empty for cluster-scoped resources and non-empty for namespaced resources.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

