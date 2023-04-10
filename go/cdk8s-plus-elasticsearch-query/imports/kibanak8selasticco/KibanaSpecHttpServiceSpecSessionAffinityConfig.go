// kibanak8selasticco
package kibanak8selasticco


// sessionAffinityConfig contains the configurations of session affinity.
type KibanaSpecHttpServiceSpecSessionAffinityConfig struct {
	// clientIP contains the configurations of Client IP based session affinity.
	ClientIp *KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp `field:"optional" json:"clientIp" yaml:"clientIp"`
}

