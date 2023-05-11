package k8s


// ResourceClaimParametersReference contains enough information to let you locate the parameters for a ResourceClaim.
//
// The object must be in the same namespace as the ResourceClaim.
type ResourceClaimParametersReferenceV1Alpha1 struct {
	// Kind is the type of resource being referenced.
	//
	// This is the same value as in the parameter object's metadata, for example "ConfigMap".
	Kind *string `field:"required" json:"kind" yaml:"kind"`
	// Name is the name of resource being referenced.
	Name *string `field:"required" json:"name" yaml:"name"`
	// APIGroup is the group for the resource being referenced.
	//
	// It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
	ApiGroup *string `field:"optional" json:"apiGroup" yaml:"apiGroup"`
}

