package imports.io.cert_manager;

/**
 * PKCS12 configures options for storing a PKCS12 keystore in the `spec.secretName` Secret resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.749Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecKeystoresPkcs12")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecKeystoresPkcs12.Jsii$Proxy.class)
public interface CertificateSpecKeystoresPkcs12 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Create enables PKCS12 keystore creation for the Certificate.
     * <p>
     * If true, a file named <code>keystore.p12</code> will be created in the target Secret resource, encrypted using the password stored in <code>passwordSecretRef</code>. The keystore file will be updated immediately. A file named <code>truststore.p12</code> will also be created in the target Secret resource, encrypted using the password stored in <code>passwordSecretRef</code> containing the issuing Certificate Authority
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getCreate();

    /**
     * PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the PKCS12 keystore.
     */
    @org.jetbrains.annotations.NotNull imports.io.cert_manager.CertificateSpecKeystoresPkcs12PasswordSecretRef getPasswordSecretRef();

    /**
     * @return a {@link Builder} of {@link CertificateSpecKeystoresPkcs12}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecKeystoresPkcs12}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecKeystoresPkcs12> {
        java.lang.Boolean create;
        imports.io.cert_manager.CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef;

        /**
         * Sets the value of {@link CertificateSpecKeystoresPkcs12#getCreate}
         * @param create Create enables PKCS12 keystore creation for the Certificate. This parameter is required.
         *               If true, a file named <code>keystore.p12</code> will be created in the target Secret resource, encrypted using the password stored in <code>passwordSecretRef</code>. The keystore file will be updated immediately. A file named <code>truststore.p12</code> will also be created in the target Secret resource, encrypted using the password stored in <code>passwordSecretRef</code> containing the issuing Certificate Authority
         * @return {@code this}
         */
        public Builder create(java.lang.Boolean create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecKeystoresPkcs12#getPasswordSecretRef}
         * @param passwordSecretRef PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the PKCS12 keystore. This parameter is required.
         * @return {@code this}
         */
        public Builder passwordSecretRef(imports.io.cert_manager.CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef) {
            this.passwordSecretRef = passwordSecretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecKeystoresPkcs12}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecKeystoresPkcs12 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecKeystoresPkcs12}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecKeystoresPkcs12 {
        private final java.lang.Boolean create;
        private final imports.io.cert_manager.CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.passwordSecretRef = software.amazon.jsii.Kernel.get(this, "passwordSecretRef", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecKeystoresPkcs12PasswordSecretRef.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.create = java.util.Objects.requireNonNull(builder.create, "create is required");
            this.passwordSecretRef = java.util.Objects.requireNonNull(builder.passwordSecretRef, "passwordSecretRef is required");
        }

        @Override
        public final java.lang.Boolean getCreate() {
            return this.create;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecKeystoresPkcs12PasswordSecretRef getPasswordSecretRef() {
            return this.passwordSecretRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("create", om.valueToTree(this.getCreate()));
            data.set("passwordSecretRef", om.valueToTree(this.getPasswordSecretRef()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecKeystoresPkcs12"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecKeystoresPkcs12.Jsii$Proxy that = (CertificateSpecKeystoresPkcs12.Jsii$Proxy) o;

            if (!create.equals(that.create)) return false;
            return this.passwordSecretRef.equals(that.passwordSecretRef);
        }

        @Override
        public final int hashCode() {
            int result = this.create.hashCode();
            result = 31 * result + (this.passwordSecretRef.hashCode());
            return result;
        }
    }
}
