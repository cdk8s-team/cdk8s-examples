package imports.io.cert_manager;

/**
 * KeyUsage specifies valid usage contexts for keys.
 * <p>
 * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3 https://tools.ietf.org/html/rfc5280#section-4.2.1.12
 * Valid KeyUsage values are as follows: "signing", "digital signature", "content commitment", "key encipherment", "key agreement", "data encipherment", "cert sign", "crl sign", "encipher only", "decipher only", "any", "server auth", "client auth", "code signing", "email protection", "s/mime", "ipsec end system", "ipsec tunnel", "ipsec user", "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.752Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecUsages")
public enum CertificateSpecUsages {
    /**
     * signing.
     */
    SIGNING,
    /**
     * digital signature.
     */
    DIGITAL_SIGNATURE,
    /**
     * content commitment.
     */
    CONTENT_COMMITMENT,
    /**
     * key encipherment.
     */
    KEY_ENCIPHERMENT,
    /**
     * key agreement.
     */
    KEY_AGREEMENT,
    /**
     * data encipherment.
     */
    DATA_ENCIPHERMENT,
    /**
     * cert sign.
     */
    CERT_SIGN,
    /**
     * crl sign.
     */
    CRL_SIGN,
    /**
     * encipher only.
     */
    ENCIPHER_ONLY,
    /**
     * decipher only.
     */
    DECIPHER_ONLY,
    /**
     * any.
     */
    ANY,
    /**
     * server auth.
     */
    SERVER_AUTH,
    /**
     * client auth.
     */
    CLIENT_AUTH,
    /**
     * code signing.
     */
    CODE_SIGNING,
    /**
     * email protection.
     */
    EMAIL_PROTECTION,
    /**
     * s/mime.
     */
    S_MIME,
    /**
     * ipsec end system.
     */
    IPSEC_END_SYSTEM,
    /**
     * ipsec tunnel.
     */
    IPSEC_TUNNEL,
    /**
     * ipsec user.
     */
    IPSEC_USER,
    /**
     * timestamping.
     */
    TIMESTAMPING,
    /**
     * ocsp signing.
     */
    OCSP_SIGNING,
    /**
     * microsoft sgc.
     */
    MICROSOFT_SGC,
    /**
     * netscape sgc.
     */
    NETSCAPE_SGC,
}
