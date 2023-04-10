// elasticsearchk8selasticco
package elasticsearchk8selasticco


// PodDisruptionBudget provides access to the default pod disruption budget for the Elasticsearch cluster.
//
// The default budget selects all cluster pods and sets `maxUnavailable` to 1. To disable, set `PodDisruptionBudget` to the empty value (`{}` in YAML).
type ElasticsearchSpecPodDisruptionBudget struct {
	// ObjectMeta is the metadata of the PDB.
	//
	// The name and namespace provided here are managed by ECK and will be ignored.
	Metadata interface{} `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec is the specification of the PDB.
	Spec *ElasticsearchSpecPodDisruptionBudgetSpec `field:"optional" json:"spec" yaml:"spec"`
}

