package k8s


// PodSchedulingList is a collection of Pod scheduling objects.
type KubePodSchedulingListV1Alpha1Props struct {
	// Items is the list of PodScheduling objects.
	Items *[]*KubePodSchedulingV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

