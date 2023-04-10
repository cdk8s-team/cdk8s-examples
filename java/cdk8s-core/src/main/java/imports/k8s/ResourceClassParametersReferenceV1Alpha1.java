package imports.k8s;

/**
 * ResourceClassParametersReference contains enough information to let you locate the parameters for a ResourceClass.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.945Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceClassParametersReferenceV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ResourceClassParametersReferenceV1Alpha1.Jsii$Proxy.class)
public interface ResourceClassParametersReferenceV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Kind is the type of resource being referenced.
     * <p>
     * This is the same value as in the parameter object's metadata.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name is the name of resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * APIGroup is the group for the resource being referenced.
     * <p>
     * It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiGroup() {
        return null;
    }

    /**
     * Namespace that contains the referenced resource.
     * <p>
     * Must be empty for cluster-scoped resources and non-empty for namespaced resources.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceClassParametersReferenceV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceClassParametersReferenceV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceClassParametersReferenceV1Alpha1> {
        java.lang.String kind;
        java.lang.String name;
        java.lang.String apiGroup;
        java.lang.String namespace;

        /**
         * Sets the value of {@link ResourceClassParametersReferenceV1Alpha1#getKind}
         * @param kind Kind is the type of resource being referenced. This parameter is required.
         *             This is the same value as in the parameter object's metadata.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClassParametersReferenceV1Alpha1#getName}
         * @param name Name is the name of resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClassParametersReferenceV1Alpha1#getApiGroup}
         * @param apiGroup APIGroup is the group for the resource being referenced.
         *                 It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
         * @return {@code this}
         */
        public Builder apiGroup(java.lang.String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClassParametersReferenceV1Alpha1#getNamespace}
         * @param namespace Namespace that contains the referenced resource.
         *                  Must be empty for cluster-scoped resources and non-empty for namespaced resources.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceClassParametersReferenceV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceClassParametersReferenceV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceClassParametersReferenceV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceClassParametersReferenceV1Alpha1 {
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.String apiGroup;
        private final java.lang.String namespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.apiGroup = software.amazon.jsii.Kernel.get(this, "apiGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kind = java.util.Objects.requireNonNull(builder.kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.apiGroup = builder.apiGroup;
            this.namespace = builder.namespace;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getApiGroup() {
            return this.apiGroup;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getApiGroup() != null) {
                data.set("apiGroup", om.valueToTree(this.getApiGroup()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceClassParametersReferenceV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceClassParametersReferenceV1Alpha1.Jsii$Proxy that = (ResourceClassParametersReferenceV1Alpha1.Jsii$Proxy) o;

            if (!kind.equals(that.kind)) return false;
            if (!name.equals(that.name)) return false;
            if (this.apiGroup != null ? !this.apiGroup.equals(that.apiGroup) : that.apiGroup != null) return false;
            return this.namespace != null ? this.namespace.equals(that.namespace) : that.namespace == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kind.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.apiGroup != null ? this.apiGroup.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            return result;
        }
    }
}
