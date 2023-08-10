package apmk8selasticco


// Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.
//
// The referenced secret should contain the following:
// - `ca.crt`: The certificate authority (optional). - `tls.crt`: The certificate (or a chain). - `tls.key`: The private key to the first certificate in the certificate chain.
type ApmServerSpecHttpTlsCertificate struct {
	// SecretName is the name of the secret.
	SecretName *string `field:"optional" json:"secretName" yaml:"secretName"`
}

