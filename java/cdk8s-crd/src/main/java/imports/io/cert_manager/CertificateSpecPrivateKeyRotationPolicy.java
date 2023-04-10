package imports.io.cert_manager;

/**
 * RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.
 * <p>
 * If set to Never, a private key will only be generated if one does not already exist in the target <code>spec.secretName</code>. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to Always, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is 'Never' for backward compatibility.
 * <p>
 * Default: Never' for backward compatibility.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.751Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecPrivateKeyRotationPolicy")
public enum CertificateSpecPrivateKeyRotationPolicy {
    /**
     * Never.
     */
    NEVER,
    /**
     * Always.
     */
    ALWAYS,
}
