package imports.io.cert_manager;

/**
 * IssuerRef is a reference to the issuer for this certificate.
 * <p>
 * If the <code>kind</code> field is not set, or set to <code>Issuer</code>, an Issuer resource with the given name in the same namespace as the Certificate will be used. If the <code>kind</code> field is set to <code>ClusterIssuer</code>, a ClusterIssuer with the provided name will be used. The <code>name</code> field in this stanza is required at all times.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.749Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecIssuerRef")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecIssuerRef.Jsii$Proxy.class)
public interface CertificateSpecIssuerRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the resource being referred to.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Group of the resource being referred to.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * Kind of the resource being referred to.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecIssuerRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecIssuerRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecIssuerRef> {
        java.lang.String name;
        java.lang.String group;
        java.lang.String kind;

        /**
         * Sets the value of {@link CertificateSpecIssuerRef#getName}
         * @param name Name of the resource being referred to. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecIssuerRef#getGroup}
         * @param group Group of the resource being referred to.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecIssuerRef#getKind}
         * @param kind Kind of the resource being referred to.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecIssuerRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecIssuerRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecIssuerRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecIssuerRef {
        private final java.lang.String name;
        private final java.lang.String group;
        private final java.lang.String kind;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.group = builder.group;
            this.kind = builder.kind;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecIssuerRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecIssuerRef.Jsii$Proxy that = (CertificateSpecIssuerRef.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            return this.kind != null ? this.kind.equals(that.kind) : that.kind == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            return result;
        }
    }
}
