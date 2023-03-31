package imports.io.cert_manager;

/**
 * Algorithm is the private key algorithm of the corresponding private key for this certificate.
 * <p>
 * If provided, allowed values are either <code>RSA</code>,<code>Ed25519</code> or <code>ECDSA</code> If <code>algorithm</code> is specified and <code>size</code> is not provided, key size of 256 will be used for <code>ECDSA</code> key algorithm and key size of 2048 will be used for <code>RSA</code> key algorithm. key size is ignored when using the <code>Ed25519</code> key algorithm.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.751Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecPrivateKeyAlgorithm")
public enum CertificateSpecPrivateKeyAlgorithm {
    /**
     * RSA.
     */
    RSA,
    /**
     * ECDSA.
     */
    ECDSA,
    /**
     * Ed25519.
     */
    ED25519,
}
