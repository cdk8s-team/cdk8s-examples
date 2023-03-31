package imports.k8s;

/**
 * PodTemplate describes a template for creating copies of a predefined pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.898Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePodTemplateProps")
@software.amazon.jsii.Jsii.Proxy(KubePodTemplateProps.Jsii$Proxy.class)
public interface KubePodTemplateProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Template defines the pods that will be created from this pod template.
     * <p>
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodTemplateSpec getTemplate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubePodTemplateProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubePodTemplateProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubePodTemplateProps> {
        imports.k8s.ObjectMeta metadata;
        imports.k8s.PodTemplateSpec template;

        /**
         * Sets the value of {@link KubePodTemplateProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubePodTemplateProps#getTemplate}
         * @param template Template defines the pods that will be created from this pod template.
         *                 https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder template(imports.k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubePodTemplateProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubePodTemplateProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubePodTemplateProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubePodTemplateProps {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.PodTemplateSpec template;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.k8s.PodTemplateSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.template = builder.template;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getTemplate() != null) {
                data.set("template", om.valueToTree(this.getTemplate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubePodTemplateProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubePodTemplateProps.Jsii$Proxy that = (KubePodTemplateProps.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.template != null ? this.template.equals(that.template) : that.template == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.template != null ? this.template.hashCode() : 0);
            return result;
        }
    }
}
