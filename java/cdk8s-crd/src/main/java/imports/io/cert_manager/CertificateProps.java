package imports.io.cert_manager;

/**
 * A Certificate resource should be created to ensure an up to date and signed x509 certificate is stored in the Kubernetes Secret resource named in `spec.secretName`. The stored certificate will be renewed before it expires (as configured by `spec.renewBefore`).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.745Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateProps")
@software.amazon.jsii.Jsii.Proxy(CertificateProps.Jsii$Proxy.class)
public interface CertificateProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Desired state of the Certificate resource.
     */
    @org.jetbrains.annotations.NotNull imports.io.cert_manager.CertificateSpec getSpec();

    /**
     */
    default @org.jetbrains.annotations.Nullable org.cdk8s.ApiObjectMetadata getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateProps> {
        imports.io.cert_manager.CertificateSpec spec;
        org.cdk8s.ApiObjectMetadata metadata;

        /**
         * Sets the value of {@link CertificateProps#getSpec}
         * @param spec Desired state of the Certificate resource. This parameter is required.
         * @return {@code this}
         */
        public Builder spec(imports.io.cert_manager.CertificateSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link CertificateProps#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(org.cdk8s.ApiObjectMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateProps {
        private final imports.io.cert_manager.CertificateSpec spec;
        private final org.cdk8s.ApiObjectMetadata metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpec.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(org.cdk8s.ApiObjectMetadata.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(builder.spec, "spec is required");
            this.metadata = builder.metadata;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpec getSpec() {
            return this.spec;
        }

        @Override
        public final org.cdk8s.ApiObjectMetadata getMetadata() {
            return this.metadata;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateProps.Jsii$Proxy that = (CertificateProps.Jsii$Proxy) o;

            if (!spec.equals(that.spec)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.spec.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
