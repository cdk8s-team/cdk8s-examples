package imports.k8s;

/**
 * IngressClass represents the class of the Ingress, referenced by the Ingress Spec.
 * <p>
 * The <code>ingressclass.kubernetes.io/is-default-class</code> annotation can be used to indicate that an IngressClass should be considered default. When a single IngressClass resource has this annotation set to true, new Ingress resources without a class specified will be assigned this default class.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.889Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeIngressClassProps")
@software.amazon.jsii.Jsii.Proxy(KubeIngressClassProps.Jsii$Proxy.class)
public interface KubeIngressClassProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Spec is the desired state of the IngressClass.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IngressClassSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeIngressClassProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeIngressClassProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeIngressClassProps> {
        imports.k8s.ObjectMeta metadata;
        imports.k8s.IngressClassSpec spec;

        /**
         * Sets the value of {@link KubeIngressClassProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeIngressClassProps#getSpec}
         * @param spec Spec is the desired state of the IngressClass.
         *             More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder spec(imports.k8s.IngressClassSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeIngressClassProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeIngressClassProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeIngressClassProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeIngressClassProps {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.IngressClassSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.IngressClassSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.spec = builder.spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.IngressClassSpec getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeIngressClassProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeIngressClassProps.Jsii$Proxy that = (KubeIngressClassProps.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
