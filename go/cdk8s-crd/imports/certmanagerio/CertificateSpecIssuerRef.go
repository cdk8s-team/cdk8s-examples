package certmanagerio


// Reference to the issuer responsible for issuing the certificate.
//
// If the issuer is namespace-scoped, it must be in the same namespace
// as the Certificate. If the issuer is cluster-scoped, it can be used
// from any namespace.
//
// The `name` field of the reference must always be specified.
type CertificateSpecIssuerRef struct {
	// Name of the resource being referred to.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Group of the resource being referred to.
	Group *string `field:"optional" json:"group" yaml:"group"`
	// Kind of the resource being referred to.
	Kind *string `field:"optional" json:"kind" yaml:"kind"`
}

