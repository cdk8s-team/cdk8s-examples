package certmanagerio


// Requested set of X509 certificate subject attributes.
//
// More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6
// The common name attribute is specified separately in the `commonName` field. Cannot be set if the `literalSubject` field is set.
type CertificateSpecSubject struct {
	// Countries to be used on the Certificate.
	Countries *[]*string `field:"optional" json:"countries" yaml:"countries"`
	// Cities to be used on the Certificate.
	Localities *[]*string `field:"optional" json:"localities" yaml:"localities"`
	// Organizational Units to be used on the Certificate.
	OrganizationalUnits *[]*string `field:"optional" json:"organizationalUnits" yaml:"organizationalUnits"`
	// Organizations to be used on the Certificate.
	Organizations *[]*string `field:"optional" json:"organizations" yaml:"organizations"`
	// Postal codes to be used on the Certificate.
	PostalCodes *[]*string `field:"optional" json:"postalCodes" yaml:"postalCodes"`
	// State/Provinces to be used on the Certificate.
	Provinces *[]*string `field:"optional" json:"provinces" yaml:"provinces"`
	// Serial number to be used on the Certificate.
	SerialNumber *string `field:"optional" json:"serialNumber" yaml:"serialNumber"`
	// Street addresses to be used on the Certificate.
	StreetAddresses *[]*string `field:"optional" json:"streetAddresses" yaml:"streetAddresses"`
}

