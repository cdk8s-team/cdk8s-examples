package k8s


// ParamRef references a parameter resource.
type ParamRefV1Alpha1 struct {
	// Name of the resource being referenced.
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Namespace of the referenced resource.
	//
	// Should be empty for the cluster-scoped resources.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

