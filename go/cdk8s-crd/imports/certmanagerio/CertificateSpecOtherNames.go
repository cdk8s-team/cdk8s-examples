package certmanagerio


type CertificateSpecOtherNames struct {
	// OID is the object identifier for the otherName SAN.
	//
	// The object identifier must be expressed as a dotted string, for example, "1.2.840.113556.1.4.221".
	Oid *string `field:"optional" json:"oid" yaml:"oid"`
	// utf8Value is the string value of the otherName SAN.
	//
	// The utf8Value accepts any valid UTF8 string to set as value for the otherName SAN.
	Utf8Value *string `field:"optional" json:"utf8Value" yaml:"utf8Value"`
}

