package certmanagerio


// Signature algorith to use.
//
// Allowed values for RSA keys: SHA256WithRSA, SHA384WithRSA, SHA512WithRSA.
// Allowed values for ECDSA keys: ECDSAWithSHA256, ECDSAWithSHA384, ECDSAWithSHA512.
// Allowed values for Ed25519 keys: PureEd25519.
type CertificateSpecSignatureAlgorithm string

const (
	// SHA256WithRSA.
	CertificateSpecSignatureAlgorithm_SHA256_WITH_RSA CertificateSpecSignatureAlgorithm = "SHA256_WITH_RSA"
	// SHA384WithRSA.
	CertificateSpecSignatureAlgorithm_SHA384_WITH_RSA CertificateSpecSignatureAlgorithm = "SHA384_WITH_RSA"
	// SHA512WithRSA.
	CertificateSpecSignatureAlgorithm_SHA512_WITH_RSA CertificateSpecSignatureAlgorithm = "SHA512_WITH_RSA"
	// ECDSAWithSHA256.
	CertificateSpecSignatureAlgorithm_ECDSA_WITH_SHA256 CertificateSpecSignatureAlgorithm = "ECDSA_WITH_SHA256"
	// ECDSAWithSHA384.
	CertificateSpecSignatureAlgorithm_ECDSA_WITH_SHA384 CertificateSpecSignatureAlgorithm = "ECDSA_WITH_SHA384"
	// ECDSAWithSHA512.
	CertificateSpecSignatureAlgorithm_ECDSA_WITH_SHA512 CertificateSpecSignatureAlgorithm = "ECDSA_WITH_SHA512"
	// PureEd25519.
	CertificateSpecSignatureAlgorithm_PURE_ED25519 CertificateSpecSignatureAlgorithm = "PURE_ED25519"
)

