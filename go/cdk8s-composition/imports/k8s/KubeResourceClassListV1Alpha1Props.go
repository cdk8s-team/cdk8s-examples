package k8s


// ResourceClassList is a collection of classes.
type KubeResourceClassListV1Alpha1Props struct {
	// Items is the list of resource classes.
	Items *[]*KubeResourceClassV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

