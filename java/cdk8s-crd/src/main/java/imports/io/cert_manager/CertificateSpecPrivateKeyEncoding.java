package imports.io.cert_manager;

/**
 * The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in.
 * <p>
 * If provided, allowed values are <code>PKCS1</code> and <code>PKCS8</code> standing for PKCS#1 and PKCS#8, respectively. Defaults to <code>PKCS1</code> if not specified.
 * <p>
 * Default: PKCS1` if not specified.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.751Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecPrivateKeyEncoding")
public enum CertificateSpecPrivateKeyEncoding {
    /**
     * PKCS1.
     */
    PKCS1,
    /**
     * PKCS8.
     */
    PKCS8,
}
