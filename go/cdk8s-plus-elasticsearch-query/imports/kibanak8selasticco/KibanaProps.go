// kibanak8selasticco
package kibanak8selasticco

import (
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

// Kibana represents a Kibana resource in a Kubernetes cluster.
type KibanaProps struct {
	Metadata *cdk8s.ApiObjectMetadata `field:"optional" json:"metadata" yaml:"metadata"`
	// KibanaSpec holds the specification of a Kibana instance.
	Spec *KibanaSpec `field:"optional" json:"spec" yaml:"spec"`
}

