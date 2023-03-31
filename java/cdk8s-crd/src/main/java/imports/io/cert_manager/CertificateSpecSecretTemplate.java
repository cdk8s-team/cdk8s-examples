package imports.io.cert_manager;

/**
 * SecretTemplate defines annotations and labels to be copied to the Certificate's Secret.
 * <p>
 * Labels and annotations on the Secret will be changed as they appear on the SecretTemplate when added or removed. SecretTemplate annotations are added in conjunction with, and cannot overwrite, the base set of annotations cert-manager sets on the Certificate's Secret.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.751Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecSecretTemplate")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecSecretTemplate.Jsii$Proxy.class)
public interface CertificateSpecSecretTemplate extends software.amazon.jsii.JsiiSerializable {

    /**
     * Annotations is a key value map to be copied to the target Kubernetes Secret.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return null;
    }

    /**
     * Labels is a key value map to be copied to the target Kubernetes Secret.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecSecretTemplate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecSecretTemplate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecSecretTemplate> {
        java.util.Map<java.lang.String, java.lang.String> annotations;
        java.util.Map<java.lang.String, java.lang.String> labels;

        /**
         * Sets the value of {@link CertificateSpecSecretTemplate#getAnnotations}
         * @param annotations Annotations is a key value map to be copied to the target Kubernetes Secret.
         * @return {@code this}
         */
        public Builder annotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSecretTemplate#getLabels}
         * @param labels Labels is a key value map to be copied to the target Kubernetes Secret.
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecSecretTemplate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecSecretTemplate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecSecretTemplate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecSecretTemplate {
        private final java.util.Map<java.lang.String, java.lang.String> annotations;
        private final java.util.Map<java.lang.String, java.lang.String> labels;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.annotations = software.amazon.jsii.Kernel.get(this, "annotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.labels = software.amazon.jsii.Kernel.get(this, "labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.annotations = builder.annotations;
            this.labels = builder.labels;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
            return this.annotations;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLabels() {
            return this.labels;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAnnotations() != null) {
                data.set("annotations", om.valueToTree(this.getAnnotations()));
            }
            if (this.getLabels() != null) {
                data.set("labels", om.valueToTree(this.getLabels()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecSecretTemplate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecSecretTemplate.Jsii$Proxy that = (CertificateSpecSecretTemplate.Jsii$Proxy) o;

            if (this.annotations != null ? !this.annotations.equals(that.annotations) : that.annotations != null) return false;
            return this.labels != null ? this.labels.equals(that.labels) : that.labels == null;
        }

        @Override
        public final int hashCode() {
            int result = this.annotations != null ? this.annotations.hashCode() : 0;
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            return result;
        }
    }
}
