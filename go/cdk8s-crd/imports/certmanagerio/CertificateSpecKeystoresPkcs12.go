package certmanagerio


// PKCS12 configures options for storing a PKCS12 keystore in the `spec.secretName` Secret resource.
type CertificateSpecKeystoresPkcs12 struct {
	// Create enables PKCS12 keystore creation for the Certificate.
	//
	// If true, a file named `keystore.p12` will be created in the target Secret resource, encrypted using the password stored in `passwordSecretRef`. The keystore file will be updated immediately. If the issuer provided a CA certificate, a file named `truststore.p12` will also be created in the target Secret resource, encrypted using the password stored in `passwordSecretRef` containing the issuing Certificate Authority
	Create *bool `field:"required" json:"create" yaml:"create"`
	// PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the PKCS12 keystore.
	PasswordSecretRef *CertificateSpecKeystoresPkcs12PasswordSecretRef `field:"required" json:"passwordSecretRef" yaml:"passwordSecretRef"`
	// Profile specifies the key and certificate encryption algorithms and the HMAC algorithm used to create the PKCS12 keystore.
	//
	// Default value is `LegacyRC2` for backward compatibility.
	// If provided, allowed values are: `LegacyRC2`: Deprecated. Not supported by default in OpenSSL 3 or Java 20. `LegacyDES`: Less secure algorithm. Use this option for maximal compatibility. `Modern2023`: Secure algorithm. Use this option in case you have to always use secure algorithms (eg. because of company policy). Please note that the security of the algorithm is not that important in reality, because the unencrypted certificate and private key are also stored in the Secret.
	Profile CertificateSpecKeystoresPkcs12Profile `field:"optional" json:"profile" yaml:"profile"`
}

