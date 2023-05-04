package imports.k8s;

/**
 * ResourceFieldSelector represents container resources (cpu, memory) and their output format.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.893Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceFieldSelector")
@software.amazon.jsii.Jsii.Proxy(ResourceFieldSelector.Jsii$Proxy.class)
public interface ResourceFieldSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required: resource to select.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResource();

    /**
     * Container name: required for volumes, optional for env vars.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContainerName() {
        return null;
    }

    /**
     * Specifies the output format of the exposed resources, defaults to "1".
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getDivisor() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceFieldSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceFieldSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceFieldSelector> {
        java.lang.String resource;
        java.lang.String containerName;
        imports.k8s.Quantity divisor;

        /**
         * Sets the value of {@link ResourceFieldSelector#getResource}
         * @param resource Required: resource to select. This parameter is required.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link ResourceFieldSelector#getContainerName}
         * @param containerName Container name: required for volumes, optional for env vars.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link ResourceFieldSelector#getDivisor}
         * @param divisor Specifies the output format of the exposed resources, defaults to "1".
         * @return {@code this}
         */
        public Builder divisor(imports.k8s.Quantity divisor) {
            this.divisor = divisor;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceFieldSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceFieldSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceFieldSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceFieldSelector {
        private final java.lang.String resource;
        private final java.lang.String containerName;
        private final imports.k8s.Quantity divisor;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerName = software.amazon.jsii.Kernel.get(this, "containerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.divisor = software.amazon.jsii.Kernel.get(this, "divisor", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resource = java.util.Objects.requireNonNull(builder.resource, "resource is required");
            this.containerName = builder.containerName;
            this.divisor = builder.divisor;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public final imports.k8s.Quantity getDivisor() {
            return this.divisor;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resource", om.valueToTree(this.getResource()));
            if (this.getContainerName() != null) {
                data.set("containerName", om.valueToTree(this.getContainerName()));
            }
            if (this.getDivisor() != null) {
                data.set("divisor", om.valueToTree(this.getDivisor()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceFieldSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceFieldSelector.Jsii$Proxy that = (ResourceFieldSelector.Jsii$Proxy) o;

            if (!resource.equals(that.resource)) return false;
            if (this.containerName != null ? !this.containerName.equals(that.containerName) : that.containerName != null) return false;
            return this.divisor != null ? this.divisor.equals(that.divisor) : that.divisor == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resource.hashCode();
            result = 31 * result + (this.containerName != null ? this.containerName.hashCode() : 0);
            result = 31 * result + (this.divisor != null ? this.divisor.hashCode() : 0);
            return result;
        }
    }
}
