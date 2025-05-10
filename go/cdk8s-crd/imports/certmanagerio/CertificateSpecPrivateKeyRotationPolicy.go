package certmanagerio


// RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.
//
// If set to `Never`, a private key will only be generated if one does not
// already exist in the target `spec.secretName`. If one does exist but it
// does not have the correct algorithm or size, a warning will be raised
// to await user intervention.
// If set to `Always`, a private key matching the specified requirements
// will be generated whenever a re-issuance occurs.
// Default is `Always`.
// The default was changed from `Never` to `Always` in cert-manager >=v1.18.0.
// The new default can be disabled by setting the
// `--feature-gates=DefaultPrivateKeyRotationPolicyAlways=false` option on
// the controller component.
// Default: Always`.
//
type CertificateSpecPrivateKeyRotationPolicy string

const (
	// Never.
	CertificateSpecPrivateKeyRotationPolicy_NEVER CertificateSpecPrivateKeyRotationPolicy = "NEVER"
	// Always.
	CertificateSpecPrivateKeyRotationPolicy_ALWAYS CertificateSpecPrivateKeyRotationPolicy = "ALWAYS"
)

