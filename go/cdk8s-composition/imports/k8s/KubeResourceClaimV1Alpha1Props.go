package k8s


// ResourceClaim describes which resources are needed by a resource consumer.
//
// Its status tracks whether the resource has been allocated and what the resulting attributes are.
//
// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
type KubeResourceClaimV1Alpha1Props struct {
	// Spec describes the desired attributes of a resource that then needs to be allocated.
	//
	// It can only be set once when creating the ResourceClaim.
	Spec *ResourceClaimSpecV1Alpha1 `field:"required" json:"spec" yaml:"spec"`
	// Standard object metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

