// elasticsearchk8selasticco
package elasticsearchk8selasticco

import (
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

// Elasticsearch represents an Elasticsearch resource in a Kubernetes cluster.
type ElasticsearchProps struct {
	Metadata *cdk8s.ApiObjectMetadata `field:"optional" json:"metadata" yaml:"metadata"`
	// ElasticsearchSpec holds the specification of an Elasticsearch cluster.
	Spec *ElasticsearchSpec `field:"optional" json:"spec" yaml:"spec"`
}

