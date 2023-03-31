// apmk8selasticco
package apmk8selasticco

import (
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

// ApmServer represents an APM Server resource in a Kubernetes cluster.
type ApmServerProps struct {
	Metadata *cdk8s.ApiObjectMetadata `field:"optional" json:"metadata" yaml:"metadata"`
	// ApmServerSpec holds the specification of an APM Server.
	Spec *ApmServerSpec `field:"optional" json:"spec" yaml:"spec"`
}

