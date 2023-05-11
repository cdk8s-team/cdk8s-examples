package elasticsearchk8selasticco


// SubjectAlternativeName represents a SAN entry in a x509 certificate.
type ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames struct {
	// DNS is the DNS name of the subject.
	Dns *string `field:"optional" json:"dns" yaml:"dns"`
	// IP is the IP address of the subject.
	Ip *string `field:"optional" json:"ip" yaml:"ip"`
}

