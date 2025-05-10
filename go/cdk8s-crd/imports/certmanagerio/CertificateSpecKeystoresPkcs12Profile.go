package certmanagerio


// Profile specifies the key and certificate encryption algorithms and the HMAC algorithm used to create the PKCS12 keystore.
//
// Default value is `LegacyRC2` for backward compatibility.
//
// If provided, allowed values are:
// `LegacyRC2`: Deprecated. Not supported by default in OpenSSL 3 or Java 20.
// `LegacyDES`: Less secure algorithm. Use this option for maximal compatibility.
// `Modern2023`: Secure algorithm. Use this option in case you have to always use secure algorithms
// (e.g., because of company policy). Please note that the security of the algorithm is not that important
// in reality, because the unencrypted certificate and private key are also stored in the Secret.
type CertificateSpecKeystoresPkcs12Profile string

const (
	// LegacyRC2.
	CertificateSpecKeystoresPkcs12Profile_LEGACY_RC2 CertificateSpecKeystoresPkcs12Profile = "LEGACY_RC2"
	// LegacyDES.
	CertificateSpecKeystoresPkcs12Profile_LEGACY_DES CertificateSpecKeystoresPkcs12Profile = "LEGACY_DES"
	// Modern2023.
	CertificateSpecKeystoresPkcs12Profile_MODERN2023 CertificateSpecKeystoresPkcs12Profile = "MODERN2023"
)

