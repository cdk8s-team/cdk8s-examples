package imports.io.cert_manager;

/**
 * Keystores configures additional keystore output formats stored in the `secretName` Secret resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.749Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecKeystores")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecKeystores.Jsii$Proxy.class)
public interface CertificateSpecKeystores extends software.amazon.jsii.JsiiSerializable {

    /**
     * JKS configures options for storing a JKS keystore in the `spec.secretName` Secret resource.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecKeystoresJks getJks() {
        return null;
    }

    /**
     * PKCS12 configures options for storing a PKCS12 keystore in the `spec.secretName` Secret resource.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecKeystoresPkcs12 getPkcs12() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecKeystores}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecKeystores}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecKeystores> {
        imports.io.cert_manager.CertificateSpecKeystoresJks jks;
        imports.io.cert_manager.CertificateSpecKeystoresPkcs12 pkcs12;

        /**
         * Sets the value of {@link CertificateSpecKeystores#getJks}
         * @param jks JKS configures options for storing a JKS keystore in the `spec.secretName` Secret resource.
         * @return {@code this}
         */
        public Builder jks(imports.io.cert_manager.CertificateSpecKeystoresJks jks) {
            this.jks = jks;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecKeystores#getPkcs12}
         * @param pkcs12 PKCS12 configures options for storing a PKCS12 keystore in the `spec.secretName` Secret resource.
         * @return {@code this}
         */
        public Builder pkcs12(imports.io.cert_manager.CertificateSpecKeystoresPkcs12 pkcs12) {
            this.pkcs12 = pkcs12;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecKeystores}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecKeystores build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecKeystores}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecKeystores {
        private final imports.io.cert_manager.CertificateSpecKeystoresJks jks;
        private final imports.io.cert_manager.CertificateSpecKeystoresPkcs12 pkcs12;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jks = software.amazon.jsii.Kernel.get(this, "jks", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecKeystoresJks.class));
            this.pkcs12 = software.amazon.jsii.Kernel.get(this, "pkcs12", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecKeystoresPkcs12.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jks = builder.jks;
            this.pkcs12 = builder.pkcs12;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecKeystoresJks getJks() {
            return this.jks;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecKeystoresPkcs12 getPkcs12() {
            return this.pkcs12;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getJks() != null) {
                data.set("jks", om.valueToTree(this.getJks()));
            }
            if (this.getPkcs12() != null) {
                data.set("pkcs12", om.valueToTree(this.getPkcs12()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecKeystores"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecKeystores.Jsii$Proxy that = (CertificateSpecKeystores.Jsii$Proxy) o;

            if (this.jks != null ? !this.jks.equals(that.jks) : that.jks != null) return false;
            return this.pkcs12 != null ? this.pkcs12.equals(that.pkcs12) : that.pkcs12 == null;
        }

        @Override
        public final int hashCode() {
            int result = this.jks != null ? this.jks.hashCode() : 0;
            result = 31 * result + (this.pkcs12 != null ? this.pkcs12.hashCode() : 0);
            return result;
        }
    }
}
