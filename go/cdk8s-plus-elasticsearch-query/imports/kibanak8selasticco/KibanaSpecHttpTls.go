// kibanak8selasticco
package kibanak8selasticco


// TLS defines options for configuring TLS for HTTP.
type KibanaSpecHttpTls struct {
	// Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.
	//
	// The referenced secret should contain the following:
	// - `ca.crt`: The certificate authority (optional). - `tls.crt`: The certificate (or a chain). - `tls.key`: The private key to the first certificate in the certificate chain.
	Certificate *KibanaSpecHttpTlsCertificate `field:"optional" json:"certificate" yaml:"certificate"`
	// SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.
	SelfSignedCertificate *KibanaSpecHttpTlsSelfSignedCertificate `field:"optional" json:"selfSignedCertificate" yaml:"selfSignedCertificate"`
}

