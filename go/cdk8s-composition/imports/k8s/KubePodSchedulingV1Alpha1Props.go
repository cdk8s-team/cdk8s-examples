package k8s


// PodScheduling objects hold information that is needed to schedule a Pod with ResourceClaims that use "WaitForFirstConsumer" allocation mode.
//
// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
type KubePodSchedulingV1Alpha1Props struct {
	// Spec describes where resources for the Pod are needed.
	Spec *PodSchedulingSpecV1Alpha1 `field:"required" json:"spec" yaml:"spec"`
	// Standard object metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

