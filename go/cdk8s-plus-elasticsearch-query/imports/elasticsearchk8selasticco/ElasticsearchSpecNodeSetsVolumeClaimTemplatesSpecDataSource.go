package elasticsearchk8selasticco


// This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source.
//
// If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
type ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource struct {
	// Kind is the type of resource being referenced.
	Kind *string `field:"required" json:"kind" yaml:"kind"`
	// Name is the name of resource being referenced.
	Name *string `field:"required" json:"name" yaml:"name"`
	// APIGroup is the group for the resource being referenced.
	//
	// If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
	ApiGroup *string `field:"optional" json:"apiGroup" yaml:"apiGroup"`
}

