package elasticsearchk8selasticco


// NodeSet is the specification for a group of Elasticsearch nodes sharing the same configuration and a Pod template.
type ElasticsearchSpecNodeSets struct {
	// Count of Elasticsearch nodes to deploy.
	Count *float64 `field:"required" json:"count" yaml:"count"`
	// Name of this set of nodes.
	//
	// Becomes a part of the Elasticsearch node.name setting.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Config holds the Elasticsearch configuration.
	Config interface{} `field:"optional" json:"config" yaml:"config"`
	// PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Pods belonging to this NodeSet.
	PodTemplate interface{} `field:"optional" json:"podTemplate" yaml:"podTemplate"`
	// VolumeClaimTemplates is a list of persistent volume claims to be used by each Pod in this NodeSet.
	//
	// Every claim in this list must have a matching volumeMount in one of the containers defined in the PodTemplate. Items defined here take precedence over any default claims added by the operator with the same name. See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-volume-claim-templates.html
	VolumeClaimTemplates *[]*ElasticsearchSpecNodeSetsVolumeClaimTemplates `field:"optional" json:"volumeClaimTemplates" yaml:"volumeClaimTemplates"`
}

