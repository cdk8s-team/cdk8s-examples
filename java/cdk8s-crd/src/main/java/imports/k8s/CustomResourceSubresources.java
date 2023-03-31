package imports.k8s;

/**
 * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.834Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceSubresources")
@software.amazon.jsii.Jsii.Proxy(CustomResourceSubresources.Jsii$Proxy.class)
public interface CustomResourceSubresources extends software.amazon.jsii.JsiiSerializable {

    /**
     * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CustomResourceSubresourceScale getScale() {
        return null;
    }

    /**
     * status indicates the custom resource should serve a `/status` subresource.
     * <p>
     * When enabled: 1. requests to the custom resource primary endpoint ignore changes to the <code>status</code> stanza of the object. 2. requests to the custom resource <code>/status</code> subresource ignore changes to anything other than the <code>status</code> stanza of the object.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceSubresources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceSubresources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceSubresources> {
        imports.k8s.CustomResourceSubresourceScale scale;
        java.lang.Object status;

        /**
         * Sets the value of {@link CustomResourceSubresources#getScale}
         * @param scale scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
         * @return {@code this}
         */
        public Builder scale(imports.k8s.CustomResourceSubresourceScale scale) {
            this.scale = scale;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceSubresources#getStatus}
         * @param status status indicates the custom resource should serve a `/status` subresource.
         *               When enabled: 1. requests to the custom resource primary endpoint ignore changes to the <code>status</code> stanza of the object. 2. requests to the custom resource <code>/status</code> subresource ignore changes to anything other than the <code>status</code> stanza of the object.
         * @return {@code this}
         */
        public Builder status(java.lang.Object status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceSubresources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceSubresources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CustomResourceSubresources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceSubresources {
        private final imports.k8s.CustomResourceSubresourceScale scale;
        private final java.lang.Object status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.scale = software.amazon.jsii.Kernel.get(this, "scale", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceSubresourceScale.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.scale = builder.scale;
            this.status = builder.status;
        }

        @Override
        public final imports.k8s.CustomResourceSubresourceScale getScale() {
            return this.scale;
        }

        @Override
        public final java.lang.Object getStatus() {
            return this.status;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getScale() != null) {
                data.set("scale", om.valueToTree(this.getScale()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceSubresources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceSubresources.Jsii$Proxy that = (CustomResourceSubresources.Jsii$Proxy) o;

            if (this.scale != null ? !this.scale.equals(that.scale) : that.scale != null) return false;
            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.scale != null ? this.scale.hashCode() : 0;
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            return result;
        }
    }
}
