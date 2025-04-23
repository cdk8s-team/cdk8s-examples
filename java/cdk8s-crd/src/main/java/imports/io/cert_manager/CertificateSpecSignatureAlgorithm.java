package imports.io.cert_manager;

/**
 * Signature algorith to use.
 * <p>
 * Allowed values for RSA keys: SHA256WithRSA, SHA384WithRSA, SHA512WithRSA.
 * Allowed values for ECDSA keys: ECDSAWithSHA256, ECDSAWithSHA384, ECDSAWithSHA512.
 * Allowed values for Ed25519 keys: PureEd25519.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.86.1 (build defb235)", date = "2025-04-23T10:37:21.380Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecSignatureAlgorithm")
public enum CertificateSpecSignatureAlgorithm {
    /**
     * SHA256WithRSA.
     */
    SHA256_WITH_RSA,
    /**
     * SHA384WithRSA.
     */
    SHA384_WITH_RSA,
    /**
     * SHA512WithRSA.
     */
    SHA512_WITH_RSA,
    /**
     * ECDSAWithSHA256.
     */
    ECDSA_WITH_SHA256,
    /**
     * ECDSAWithSHA384.
     */
    ECDSA_WITH_SHA384,
    /**
     * ECDSAWithSHA512.
     */
    ECDSA_WITH_SHA512,
    /**
     * PureEd25519.
     */
    PURE_ED25519,
}
