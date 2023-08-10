package apmk8selasticco


// HTTP holds the HTTP layer configuration for the APM Server resource.
type ApmServerSpecHttp struct {
	// Service defines the template for the associated Kubernetes Service object.
	Service *ApmServerSpecHttpService `field:"optional" json:"service" yaml:"service"`
	// TLS defines options for configuring TLS for HTTP.
	Tls *ApmServerSpecHttpTls `field:"optional" json:"tls" yaml:"tls"`
}

