package imports.k8s;

/**
 * CustomResourceDefinition represents a resource that should be exposed on the API server.
 * <p>
 * Its name MUST be in the format &lt;.spec.name&gt;.&lt;.spec.group&gt;.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.875Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeCustomResourceDefinitionProps")
@software.amazon.jsii.Jsii.Proxy(KubeCustomResourceDefinitionProps.Jsii$Proxy.class)
public interface KubeCustomResourceDefinitionProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * spec describes how the user wants the resources to appear.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CustomResourceDefinitionSpec getSpec();

    /**
     * Standard object's metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeCustomResourceDefinitionProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeCustomResourceDefinitionProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeCustomResourceDefinitionProps> {
        imports.k8s.CustomResourceDefinitionSpec spec;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubeCustomResourceDefinitionProps#getSpec}
         * @param spec spec describes how the user wants the resources to appear. This parameter is required.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.CustomResourceDefinitionSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link KubeCustomResourceDefinitionProps#getMetadata}
         * @param metadata Standard object's metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeCustomResourceDefinitionProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeCustomResourceDefinitionProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeCustomResourceDefinitionProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeCustomResourceDefinitionProps {
        private final imports.k8s.CustomResourceDefinitionSpec spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceDefinitionSpec.class));
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
        public final imports.k8s.CustomResourceDefinitionSpec getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.KubeCustomResourceDefinitionProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeCustomResourceDefinitionProps.Jsii$Proxy that = (KubeCustomResourceDefinitionProps.Jsii$Proxy) o;

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
