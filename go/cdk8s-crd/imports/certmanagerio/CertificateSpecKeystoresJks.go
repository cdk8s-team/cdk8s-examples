package certmanagerio


// JKS configures options for storing a JKS keystore in the `spec.secretName` Secret resource.
type CertificateSpecKeystoresJks struct {
	// Create enables JKS keystore creation for the Certificate.
	//
	// If true, a file named `keystore.jks` will be created in the target
	// Secret resource, encrypted using the password stored in
	// `passwordSecretRef` or `password`.
	// The keystore file will be updated immediately.
	// If the issuer provided a CA certificate, a file named `truststore.jks`
	// will also be created in the target Secret resource, encrypted using the
	// password stored in `passwordSecretRef`
	// containing the issuing Certificate Authority.
	Create *bool `field:"required" json:"create" yaml:"create"`
	// Alias specifies the alias of the key in the keystore, required by the JKS format.
	//
	// If not provided, the default alias `certificate` will be used.
	Alias *string `field:"optional" json:"alias" yaml:"alias"`
	// Password provides a literal password used to encrypt the JKS keystore.
	//
	// Mutually exclusive with passwordSecretRef.
	// One of password or passwordSecretRef must provide a password with a non-zero length.
	Password *string `field:"optional" json:"password" yaml:"password"`
	// PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the JKS keystore.
	//
	// Mutually exclusive with password.
	// One of password or passwordSecretRef must provide a password with a non-zero length.
	PasswordSecretRef *CertificateSpecKeystoresJksPasswordSecretRef `field:"optional" json:"passwordSecretRef" yaml:"passwordSecretRef"`
}

