// elasticsearchk8selasticco
package elasticsearchk8selasticco


// sessionAffinityConfig contains the configurations of session affinity.
type ElasticsearchSpecTransportServiceSpecSessionAffinityConfig struct {
	// clientIP contains the configurations of Client IP based session affinity.
	ClientIp *ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp `field:"optional" json:"clientIp" yaml:"clientIp"`
}

