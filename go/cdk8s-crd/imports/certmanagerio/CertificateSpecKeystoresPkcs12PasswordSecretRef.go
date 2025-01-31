package certmanagerio


// PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the PKCS#12 keystore.
//
// Mutually exclusive with password.
// One of password or passwordSecretRef must provide a password with a non-zero length.
type CertificateSpecKeystoresPkcs12PasswordSecretRef struct {
	// Name of the resource being referred to.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
	Name *string `field:"required" json:"name" yaml:"name"`
	// The key of the entry in the Secret resource's `data` field to be used.
	//
	// Some instances of this field may be defaulted, in others it may be
	// required.
	Key *string `field:"optional" json:"key" yaml:"key"`
}

