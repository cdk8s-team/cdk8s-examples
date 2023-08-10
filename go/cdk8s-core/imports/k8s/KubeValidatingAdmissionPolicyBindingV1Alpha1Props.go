package k8s


// ValidatingAdmissionPolicyBinding binds the ValidatingAdmissionPolicy with paramerized resources.
//
// ValidatingAdmissionPolicyBinding and parameter CRDs together define how cluster administrators configure policies for clusters.
type KubeValidatingAdmissionPolicyBindingV1Alpha1Props struct {
	// Standard object metadata;
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior of the ValidatingAdmissionPolicyBinding.
	Spec *ValidatingAdmissionPolicyBindingSpecV1Alpha1 `field:"optional" json:"spec" yaml:"spec"`
}

