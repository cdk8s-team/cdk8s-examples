package imports.io.cert_manager;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.86.1 (build defb235)", date = "2024-01-04T09:05:26.263Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecOtherNames")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecOtherNames.Jsii$Proxy.class)
public interface CertificateSpecOtherNames extends software.amazon.jsii.JsiiSerializable {

    /**
     * OID is the object identifier for the otherName SAN.
     * <p>
     * The object identifier must be expressed as a dotted string, for example, "1.2.840.113556.1.4.221".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOid() {
        return null;
    }

    /**
     * utf8Value is the string value of the otherName SAN.
     * <p>
     * The utf8Value accepts any valid UTF8 string to set as value for the otherName SAN.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUtf8Value() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecOtherNames}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecOtherNames}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecOtherNames> {
        java.lang.String oid;
        java.lang.String utf8Value;

        /**
         * Sets the value of {@link CertificateSpecOtherNames#getOid}
         * @param oid OID is the object identifier for the otherName SAN.
         *            The object identifier must be expressed as a dotted string, for example, "1.2.840.113556.1.4.221".
         * @return {@code this}
         */
        public Builder oid(java.lang.String oid) {
            this.oid = oid;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecOtherNames#getUtf8Value}
         * @param utf8Value utf8Value is the string value of the otherName SAN.
         *                  The utf8Value accepts any valid UTF8 string to set as value for the otherName SAN.
         * @return {@code this}
         */
        public Builder utf8Value(java.lang.String utf8Value) {
            this.utf8Value = utf8Value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecOtherNames}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecOtherNames build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecOtherNames}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecOtherNames {
        private final java.lang.String oid;
        private final java.lang.String utf8Value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.oid = software.amazon.jsii.Kernel.get(this, "oid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.utf8Value = software.amazon.jsii.Kernel.get(this, "utf8Value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.oid = builder.oid;
            this.utf8Value = builder.utf8Value;
        }

        @Override
        public final java.lang.String getOid() {
            return this.oid;
        }

        @Override
        public final java.lang.String getUtf8Value() {
            return this.utf8Value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOid() != null) {
                data.set("oid", om.valueToTree(this.getOid()));
            }
            if (this.getUtf8Value() != null) {
                data.set("utf8Value", om.valueToTree(this.getUtf8Value()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecOtherNames"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecOtherNames.Jsii$Proxy that = (CertificateSpecOtherNames.Jsii$Proxy) o;

            if (this.oid != null ? !this.oid.equals(that.oid) : that.oid != null) return false;
            return this.utf8Value != null ? this.utf8Value.equals(that.utf8Value) : that.utf8Value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.oid != null ? this.oid.hashCode() : 0;
            result = 31 * result + (this.utf8Value != null ? this.utf8Value.hashCode() : 0);
            return result;
        }
    }
}
