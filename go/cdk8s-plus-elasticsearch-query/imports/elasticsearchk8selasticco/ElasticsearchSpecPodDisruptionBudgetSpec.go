// elasticsearchk8selasticco
package elasticsearchk8selasticco


// Spec is the specification of the PDB.
type ElasticsearchSpecPodDisruptionBudgetSpec struct {
	// An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
	MaxUnavailable ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable `field:"optional" json:"maxUnavailable" yaml:"maxUnavailable"`
	// An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
	MinAvailable ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable `field:"optional" json:"minAvailable" yaml:"minAvailable"`
	// Label query over pods whose evictions are managed by the disruption budget.
	Selector *ElasticsearchSpecPodDisruptionBudgetSpecSelector `field:"optional" json:"selector" yaml:"selector"`
}

