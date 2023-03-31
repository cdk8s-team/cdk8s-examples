// kibanak8selasticco
package kibanak8selasticco


// SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.
type KibanaSpecHttpTlsSelfSignedCertificate struct {
	// Disabled indicates that the provisioning of the self-signed certifcate should be disabled.
	Disabled *bool `field:"optional" json:"disabled" yaml:"disabled"`
	// SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.
	SubjectAltNames *[]*KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames `field:"optional" json:"subjectAltNames" yaml:"subjectAltNames"`
}
