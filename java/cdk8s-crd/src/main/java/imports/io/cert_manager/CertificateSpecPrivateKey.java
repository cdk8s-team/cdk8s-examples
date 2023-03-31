package imports.io.cert_manager;

/**
 * Options to control private keys used for the Certificate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.750Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecPrivateKey")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecPrivateKey.Jsii$Proxy.class)
public interface CertificateSpecPrivateKey extends software.amazon.jsii.JsiiSerializable {

    /**
     * Algorithm is the private key algorithm of the corresponding private key for this certificate.
     * <p>
     * If provided, allowed values are either <code>RSA</code>,<code>Ed25519</code> or <code>ECDSA</code> If <code>algorithm</code> is specified and <code>size</code> is not provided, key size of 256 will be used for <code>ECDSA</code> key algorithm and key size of 2048 will be used for <code>RSA</code> key algorithm. key size is ignored when using the <code>Ed25519</code> key algorithm.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecPrivateKeyAlgorithm getAlgorithm() {
        return null;
    }

    /**
     * The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in.
     * <p>
     * If provided, allowed values are <code>PKCS1</code> and <code>PKCS8</code> standing for PKCS#1 and PKCS#8, respectively. Defaults to <code>PKCS1</code> if not specified.
     * <p>
     * Default: PKCS1` if not specified.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecPrivateKeyEncoding getEncoding() {
        return null;
    }

    /**
     * RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.
     * <p>
     * If set to Never, a private key will only be generated if one does not already exist in the target <code>spec.secretName</code>. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to Always, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is 'Never' for backward compatibility.
     * <p>
     * Default: Never' for backward compatibility.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecPrivateKeyRotationPolicy getRotationPolicy() {
        return null;
    }

    /**
     * Size is the key bit size of the corresponding private key for this certificate.
     * <p>
     * If <code>algorithm</code> is set to <code>RSA</code>, valid values are <code>2048</code>, <code>4096</code> or <code>8192</code>, and will default to <code>2048</code> if not specified. If <code>algorithm</code> is set to <code>ECDSA</code>, valid values are <code>256</code>, <code>384</code> or <code>521</code>, and will default to <code>256</code> if not specified. If <code>algorithm</code> is set to <code>Ed25519</code>, Size is ignored. No other values are allowed.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSize() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecPrivateKey}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecPrivateKey}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecPrivateKey> {
        imports.io.cert_manager.CertificateSpecPrivateKeyAlgorithm algorithm;
        imports.io.cert_manager.CertificateSpecPrivateKeyEncoding encoding;
        imports.io.cert_manager.CertificateSpecPrivateKeyRotationPolicy rotationPolicy;
        java.lang.Number size;

        /**
         * Sets the value of {@link CertificateSpecPrivateKey#getAlgorithm}
         * @param algorithm Algorithm is the private key algorithm of the corresponding private key for this certificate.
         *                  If provided, allowed values are either <code>RSA</code>,<code>Ed25519</code> or <code>ECDSA</code> If <code>algorithm</code> is specified and <code>size</code> is not provided, key size of 256 will be used for <code>ECDSA</code> key algorithm and key size of 2048 will be used for <code>RSA</code> key algorithm. key size is ignored when using the <code>Ed25519</code> key algorithm.
         * @return {@code this}
         */
        public Builder algorithm(imports.io.cert_manager.CertificateSpecPrivateKeyAlgorithm algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecPrivateKey#getEncoding}
         * @param encoding The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in.
         *                 If provided, allowed values are <code>PKCS1</code> and <code>PKCS8</code> standing for PKCS#1 and PKCS#8, respectively. Defaults to <code>PKCS1</code> if not specified.
         * @return {@code this}
         */
        public Builder encoding(imports.io.cert_manager.CertificateSpecPrivateKeyEncoding encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecPrivateKey#getRotationPolicy}
         * @param rotationPolicy RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.
         *                       If set to Never, a private key will only be generated if one does not already exist in the target <code>spec.secretName</code>. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to Always, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is 'Never' for backward compatibility.
         * @return {@code this}
         */
        public Builder rotationPolicy(imports.io.cert_manager.CertificateSpecPrivateKeyRotationPolicy rotationPolicy) {
            this.rotationPolicy = rotationPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecPrivateKey#getSize}
         * @param size Size is the key bit size of the corresponding private key for this certificate.
         *             If <code>algorithm</code> is set to <code>RSA</code>, valid values are <code>2048</code>, <code>4096</code> or <code>8192</code>, and will default to <code>2048</code> if not specified. If <code>algorithm</code> is set to <code>ECDSA</code>, valid values are <code>256</code>, <code>384</code> or <code>521</code>, and will default to <code>256</code> if not specified. If <code>algorithm</code> is set to <code>Ed25519</code>, Size is ignored. No other values are allowed.
         * @return {@code this}
         */
        public Builder size(java.lang.Number size) {
            this.size = size;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecPrivateKey}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecPrivateKey build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecPrivateKey}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecPrivateKey {
        private final imports.io.cert_manager.CertificateSpecPrivateKeyAlgorithm algorithm;
        private final imports.io.cert_manager.CertificateSpecPrivateKeyEncoding encoding;
        private final imports.io.cert_manager.CertificateSpecPrivateKeyRotationPolicy rotationPolicy;
        private final java.lang.Number size;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.algorithm = software.amazon.jsii.Kernel.get(this, "algorithm", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecPrivateKeyAlgorithm.class));
            this.encoding = software.amazon.jsii.Kernel.get(this, "encoding", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecPrivateKeyEncoding.class));
            this.rotationPolicy = software.amazon.jsii.Kernel.get(this, "rotationPolicy", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecPrivateKeyRotationPolicy.class));
            this.size = software.amazon.jsii.Kernel.get(this, "size", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.algorithm = builder.algorithm;
            this.encoding = builder.encoding;
            this.rotationPolicy = builder.rotationPolicy;
            this.size = builder.size;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecPrivateKeyAlgorithm getAlgorithm() {
            return this.algorithm;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecPrivateKeyEncoding getEncoding() {
            return this.encoding;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecPrivateKeyRotationPolicy getRotationPolicy() {
            return this.rotationPolicy;
        }

        @Override
        public final java.lang.Number getSize() {
            return this.size;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAlgorithm() != null) {
                data.set("algorithm", om.valueToTree(this.getAlgorithm()));
            }
            if (this.getEncoding() != null) {
                data.set("encoding", om.valueToTree(this.getEncoding()));
            }
            if (this.getRotationPolicy() != null) {
                data.set("rotationPolicy", om.valueToTree(this.getRotationPolicy()));
            }
            if (this.getSize() != null) {
                data.set("size", om.valueToTree(this.getSize()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecPrivateKey"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecPrivateKey.Jsii$Proxy that = (CertificateSpecPrivateKey.Jsii$Proxy) o;

            if (this.algorithm != null ? !this.algorithm.equals(that.algorithm) : that.algorithm != null) return false;
            if (this.encoding != null ? !this.encoding.equals(that.encoding) : that.encoding != null) return false;
            if (this.rotationPolicy != null ? !this.rotationPolicy.equals(that.rotationPolicy) : that.rotationPolicy != null) return false;
            return this.size != null ? this.size.equals(that.size) : that.size == null;
        }

        @Override
        public final int hashCode() {
            int result = this.algorithm != null ? this.algorithm.hashCode() : 0;
            result = 31 * result + (this.encoding != null ? this.encoding.hashCode() : 0);
            result = 31 * result + (this.rotationPolicy != null ? this.rotationPolicy.hashCode() : 0);
            result = 31 * result + (this.size != null ? this.size.hashCode() : 0);
            return result;
        }
    }
}
