package certmanagerio


// Permitted contains the constraints in which the names must be located.
type CertificateSpecNameConstraintsPermitted struct {
	// DNSDomains is a list of DNS domains that are permitted or excluded.
	DnsDomains *[]*string `field:"optional" json:"dnsDomains" yaml:"dnsDomains"`
	// EmailAddresses is a list of Email Addresses that are permitted or excluded.
	EmailAddresses *[]*string `field:"optional" json:"emailAddresses" yaml:"emailAddresses"`
	// IPRanges is a list of IP Ranges that are permitted or excluded.
	//
	// This should be a valid CIDR notation.
	IpRanges *[]*string `field:"optional" json:"ipRanges" yaml:"ipRanges"`
	// URIDomains is a list of URI domains that are permitted or excluded.
	UriDomains *[]*string `field:"optional" json:"uriDomains" yaml:"uriDomains"`
}

