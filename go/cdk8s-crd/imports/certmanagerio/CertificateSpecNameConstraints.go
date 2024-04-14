package certmanagerio


// x.509 certificate NameConstraint extension which MUST NOT be used in a non-CA certificate. More Info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.10.
//
// This is an Alpha Feature and is only enabled with the
// `--feature-gates=NameConstraints=true` option set on both
// the controller and webhook components.
type CertificateSpecNameConstraints struct {
	// if true then the name constraints are marked critical.
	Critical *bool `field:"optional" json:"critical" yaml:"critical"`
	// Excluded contains the constraints which must be disallowed.
	//
	// Any name matching a
	// restriction in the excluded field is invalid regardless
	// of information appearing in the permitted.
	Excluded *CertificateSpecNameConstraintsExcluded `field:"optional" json:"excluded" yaml:"excluded"`
	// Permitted contains the constraints in which the names must be located.
	Permitted *CertificateSpecNameConstraintsPermitted `field:"optional" json:"permitted" yaml:"permitted"`
}

