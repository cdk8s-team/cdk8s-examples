package imports.k8s;

/**
 * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.880Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PersistentVolumeClaimTemplate")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeClaimTemplate.Jsii$Proxy.class)
public interface PersistentVolumeClaimTemplate extends software.amazon.jsii.JsiiSerializable {

    /**
     * The specification for the PersistentVolumeClaim.
     * <p>
     * The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.PersistentVolumeClaimSpec getSpec();

    /**
     * May contain labels and annotations that will be copied into the PVC when creating it.
     * <p>
     * No other fields are allowed and will be rejected during validation.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeClaimTemplate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeClaimTemplate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeClaimTemplate> {
        imports.k8s.PersistentVolumeClaimSpec spec;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link PersistentVolumeClaimTemplate#getSpec}
         * @param spec The specification for the PersistentVolumeClaim. This parameter is required.
         *             The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.PersistentVolumeClaimSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimTemplate#getMetadata}
         * @param metadata May contain labels and annotations that will be copied into the PVC when creating it.
         *                 No other fields are allowed and will be rejected during validation.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeClaimTemplate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeClaimTemplate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeClaimTemplate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeClaimTemplate {
        private final imports.k8s.PersistentVolumeClaimSpec spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.PersistentVolumeClaimSpec.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
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
        public final imports.k8s.PersistentVolumeClaimSpec getSpec() {
            return this.spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
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
            struct.set("fqn", om.valueToTree("k8s.PersistentVolumeClaimTemplate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeClaimTemplate.Jsii$Proxy that = (PersistentVolumeClaimTemplate.Jsii$Proxy) o;

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
