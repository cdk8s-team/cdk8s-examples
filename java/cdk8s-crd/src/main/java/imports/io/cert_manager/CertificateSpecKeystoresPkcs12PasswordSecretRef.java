package imports.io.cert_manager;

/**
 * PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the PKCS12 keystore.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.750Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecKeystoresPkcs12PasswordSecretRef")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecKeystoresPkcs12PasswordSecretRef.Jsii$Proxy.class)
public interface CertificateSpecKeystoresPkcs12PasswordSecretRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the resource being referred to.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * The key of the entry in the Secret resource's `data` field to be used.
     * <p>
     * Some instances of this field may be defaulted, in others it may be required.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecKeystoresPkcs12PasswordSecretRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecKeystoresPkcs12PasswordSecretRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecKeystoresPkcs12PasswordSecretRef> {
        java.lang.String name;
        java.lang.String key;

        /**
         * Sets the value of {@link CertificateSpecKeystoresPkcs12PasswordSecretRef#getName}
         * @param name Name of the resource being referred to. This parameter is required.
         *             More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecKeystoresPkcs12PasswordSecretRef#getKey}
         * @param key The key of the entry in the Secret resource's `data` field to be used.
         *            Some instances of this field may be defaulted, in others it may be required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecKeystoresPkcs12PasswordSecretRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecKeystoresPkcs12PasswordSecretRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecKeystoresPkcs12PasswordSecretRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecKeystoresPkcs12PasswordSecretRef {
        private final java.lang.String name;
        private final java.lang.String key;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.key = builder.key;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecKeystoresPkcs12PasswordSecretRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecKeystoresPkcs12PasswordSecretRef.Jsii$Proxy that = (CertificateSpecKeystoresPkcs12PasswordSecretRef.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.key != null ? this.key.equals(that.key) : that.key == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.key != null ? this.key.hashCode() : 0);
            return result;
        }
    }
}
