package k8s


// PodResourceClaim references exactly one ResourceClaim through a ClaimSource.
//
// It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
type PodResourceClaim struct {
	// Name uniquely identifies this resource claim inside the pod.
	//
	// This must be a DNS_LABEL.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Source describes where to find the ResourceClaim.
	Source *ClaimSource `field:"optional" json:"source" yaml:"source"`
}

