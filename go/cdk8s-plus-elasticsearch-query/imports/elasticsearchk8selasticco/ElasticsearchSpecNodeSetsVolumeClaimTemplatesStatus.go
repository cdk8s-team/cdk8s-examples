// elasticsearchk8selasticco
package elasticsearchk8selasticco


// Status represents the current information/status of a persistent volume claim.
//
// Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
type ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus struct {
	// AccessModes contains the actual access modes the volume backing the PVC has.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
	AccessModes *[]*string `field:"optional" json:"accessModes" yaml:"accessModes"`
	// Represents the actual resources of the underlying volume.
	Capacity *map[string]ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity `field:"optional" json:"capacity" yaml:"capacity"`
	// Current Condition of persistent volume claim.
	//
	// If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
	Conditions *[]*ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions `field:"optional" json:"conditions" yaml:"conditions"`
	// Phase represents the current phase of PersistentVolumeClaim.
	Phase *string `field:"optional" json:"phase" yaml:"phase"`
}

