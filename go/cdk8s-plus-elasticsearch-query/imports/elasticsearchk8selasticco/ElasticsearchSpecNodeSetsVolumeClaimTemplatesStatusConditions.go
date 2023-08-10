package elasticsearchk8selasticco

import (
	"time"
)

// PersistentVolumeClaimCondition contails details about state of pvc.
type ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions struct {
	Status *string `field:"required" json:"status" yaml:"status"`
	// PersistentVolumeClaimConditionType is a valid value of PersistentVolumeClaimCondition.Type.
	Type *string `field:"required" json:"type" yaml:"type"`
	// Last time we probed the condition.
	LastProbeTime *time.Time `field:"optional" json:"lastProbeTime" yaml:"lastProbeTime"`
	// Last time the condition transitioned from one status to another.
	LastTransitionTime *time.Time `field:"optional" json:"lastTransitionTime" yaml:"lastTransitionTime"`
	// Human-readable message indicating details about last transition.
	Message *string `field:"optional" json:"message" yaml:"message"`
	// Unique, this should be a short, machine understandable string that gives the reason for condition's last transition.
	//
	// If it reports "ResizeStarted" that means the underlying persistent volume is being resized.
	Reason *string `field:"optional" json:"reason" yaml:"reason"`
}

