package imports.k8s;

/**
 * ResourceClaimTemplateSpec contains the metadata and fields for a ResourceClaim.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.893Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceClaimTemplateSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ResourceClaimTemplateSpecV1Alpha1.Jsii$Proxy.class)
public interface ResourceClaimTemplateSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Spec for the ResourceClaim.
     * <p>
     * The entire content is copied unchanged into the ResourceClaim that gets created from this template. The same fields as in a ResourceClaim are also valid here.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.ResourceClaimSpecV1Alpha1 getSpec();

    /**
     * ObjectMeta may contain labels and annotations that will be copied into the PVC when creating it.
     * <p>
     * No other fields are allowed and will be rejected during validation.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceClaimTemplateSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceClaimTemplateSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceClaimTemplateSpecV1Alpha1> {
        imports.k8s.ResourceClaimSpecV1Alpha1 spec;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link ResourceClaimTemplateSpecV1Alpha1#getSpec}
         * @param spec Spec for the ResourceClaim. This parameter is required.
         *             The entire content is copied unchanged into the ResourceClaim that gets created from this template. The same fields as in a ResourceClaim are also valid here.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.ResourceClaimSpecV1Alpha1 spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClaimTemplateSpecV1Alpha1#getMetadata}
         * @param metadata ObjectMeta may contain labels and annotations that will be copied into the PVC when creating it.
         *                 No other fields are allowed and will be rejected during validation.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceClaimTemplateSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceClaimTemplateSpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceClaimTemplateSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceClaimTemplateSpecV1Alpha1 {
        private final imports.k8s.ResourceClaimSpecV1Alpha1 spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceClaimSpecV1Alpha1.class));
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
        public final imports.k8s.ResourceClaimSpecV1Alpha1 getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.ResourceClaimTemplateSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceClaimTemplateSpecV1Alpha1.Jsii$Proxy that = (ResourceClaimTemplateSpecV1Alpha1.Jsii$Proxy) o;

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
