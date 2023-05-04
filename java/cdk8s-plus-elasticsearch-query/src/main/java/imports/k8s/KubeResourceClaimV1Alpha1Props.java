package imports.k8s;

/**
 * ResourceClaim describes which resources are needed by a resource consumer.
 * <p>
 * Its status tracks whether the resource has been allocated and what the resulting attributes are.
 * <p>
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.846Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeResourceClaimV1Alpha1Props")
@software.amazon.jsii.Jsii.Proxy(KubeResourceClaimV1Alpha1Props.Jsii$Proxy.class)
public interface KubeResourceClaimV1Alpha1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * Spec describes the desired attributes of a resource that then needs to be allocated.
     * <p>
     * It can only be set once when creating the ResourceClaim.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.ResourceClaimSpecV1Alpha1 getSpec();

    /**
     * Standard object metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeResourceClaimV1Alpha1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeResourceClaimV1Alpha1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeResourceClaimV1Alpha1Props> {
        imports.k8s.ResourceClaimSpecV1Alpha1 spec;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubeResourceClaimV1Alpha1Props#getSpec}
         * @param spec Spec describes the desired attributes of a resource that then needs to be allocated. This parameter is required.
         *             It can only be set once when creating the ResourceClaim.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.ResourceClaimSpecV1Alpha1 spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link KubeResourceClaimV1Alpha1Props#getMetadata}
         * @param metadata Standard object metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeResourceClaimV1Alpha1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeResourceClaimV1Alpha1Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeResourceClaimV1Alpha1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeResourceClaimV1Alpha1Props {
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
            struct.set("fqn", om.valueToTree("k8s.KubeResourceClaimV1Alpha1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeResourceClaimV1Alpha1Props.Jsii$Proxy that = (KubeResourceClaimV1Alpha1Props.Jsii$Proxy) o;

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
