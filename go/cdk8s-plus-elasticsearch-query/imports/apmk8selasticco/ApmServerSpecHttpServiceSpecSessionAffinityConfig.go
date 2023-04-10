// apmk8selasticco
package apmk8selasticco


// sessionAffinityConfig contains the configurations of session affinity.
type ApmServerSpecHttpServiceSpecSessionAffinityConfig struct {
	// clientIP contains the configurations of Client IP based session affinity.
	ClientIp *ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp `field:"optional" json:"clientIp" yaml:"clientIp"`
}

