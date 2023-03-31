// kibanak8selasticco
package kibanak8selasticco


// HTTP holds the HTTP layer configuration for Kibana.
type KibanaSpecHttp struct {
	// Service defines the template for the associated Kubernetes Service object.
	Service *KibanaSpecHttpService `field:"optional" json:"service" yaml:"service"`
	// TLS defines options for configuring TLS for HTTP.
	Tls *KibanaSpecHttpTls `field:"optional" json:"tls" yaml:"tls"`
}

