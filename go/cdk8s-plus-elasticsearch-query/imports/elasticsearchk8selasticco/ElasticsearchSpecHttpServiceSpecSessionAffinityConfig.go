package elasticsearchk8selasticco


// sessionAffinityConfig contains the configurations of session affinity.
type ElasticsearchSpecHttpServiceSpecSessionAffinityConfig struct {
	// clientIP contains the configurations of Client IP based session affinity.
	ClientIp *ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp `field:"optional" json:"clientIp" yaml:"clientIp"`
}

