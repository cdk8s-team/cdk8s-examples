package k8s


// ResourceClaimSpec defines how a resource is to be allocated.
type ResourceClaimSpecV1Alpha1 struct {
	// ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
	ResourceClassName *string `field:"required" json:"resourceClassName" yaml:"resourceClassName"`
	// Allocation can start immediately or when a Pod wants to use the resource.
	//
	// "WaitForFirstConsumer" is the default.
	AllocationMode *string `field:"optional" json:"allocationMode" yaml:"allocationMode"`
	// ParametersRef references a separate object with arbitrary parameters that will be used by the driver when allocating a resource for the claim.
	//
	// The object must be in the same namespace as the ResourceClaim.
	ParametersRef *ResourceClaimParametersReferenceV1Alpha1 `field:"optional" json:"parametersRef" yaml:"parametersRef"`
}

