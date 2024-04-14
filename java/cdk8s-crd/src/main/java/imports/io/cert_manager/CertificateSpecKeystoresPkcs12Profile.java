package imports.io.cert_manager;

/**
 * Profile specifies the key and certificate encryption algorithms and the HMAC algorithm used to create the PKCS12 keystore.
 * <p>
 * Default value is <code>LegacyRC2</code> for backward compatibility.
 * If provided, allowed values are: <code>LegacyRC2</code>: Deprecated. Not supported by default in OpenSSL 3 or Java 20. <code>LegacyDES</code>: Less secure algorithm. Use this option for maximal compatibility. <code>Modern2023</code>: Secure algorithm. Use this option in case you have to always use secure algorithms (eg. because of company policy). Please note that the security of the algorithm is not that important in reality, because the unencrypted certificate and private key are also stored in the Secret.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.86.1 (build defb235)", date = "2024-01-04T09:05:26.259Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecKeystoresPkcs12Profile")
public enum CertificateSpecKeystoresPkcs12Profile {
    /**
     * LegacyRC2.
     */
    LEGACY_RC2,
    /**
     * LegacyDES.
     */
    LEGACY_DES,
    /**
     * Modern2023.
     */
    MODERN2023,
}
