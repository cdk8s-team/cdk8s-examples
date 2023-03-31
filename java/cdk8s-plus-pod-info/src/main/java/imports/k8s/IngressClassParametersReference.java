package imports.k8s;

/**
 * IngressClassParametersReference identifies an API object.
 * <p>
 * This can be used to specify a cluster or namespace-scoped resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.850Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IngressClassParametersReference")
@software.amazon.jsii.Jsii.Proxy(IngressClassParametersReference.Jsii$Proxy.class)
public interface IngressClassParametersReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * Kind is the type of resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name is the name of resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * APIGroup is the group for the resource being referenced.
     * <p>
     * If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiGroup() {
        return null;
    }

    /**
     * Namespace is the namespace of the resource being referenced.
     * <p>
     * This field is required when scope is set to "Namespace" and must be unset when scope is set to "Cluster".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * Scope represents if this refers to a cluster or namespace scoped resource.
     * <p>
     * This may be set to "Cluster" (default) or "Namespace".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getScope() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressClassParametersReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressClassParametersReference}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressClassParametersReference> {
        java.lang.String kind;
        java.lang.String name;
        java.lang.String apiGroup;
        java.lang.String namespace;
        java.lang.String scope;

        /**
         * Sets the value of {@link IngressClassParametersReference#getKind}
         * @param kind Kind is the type of resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassParametersReference#getName}
         * @param name Name is the name of resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassParametersReference#getApiGroup}
         * @param apiGroup APIGroup is the group for the resource being referenced.
         *                 If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
         * @return {@code this}
         */
        public Builder apiGroup(java.lang.String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassParametersReference#getNamespace}
         * @param namespace Namespace is the namespace of the resource being referenced.
         *                  This field is required when scope is set to "Namespace" and must be unset when scope is set to "Cluster".
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassParametersReference#getScope}
         * @param scope Scope represents if this refers to a cluster or namespace scoped resource.
         *              This may be set to "Cluster" (default) or "Namespace".
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressClassParametersReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressClassParametersReference build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressClassParametersReference}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressClassParametersReference {
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.String apiGroup;
        private final java.lang.String namespace;
        private final java.lang.String scope;

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
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.scope = builder.scope;
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
        public final java.lang.String getScope() {
            return this.scope;
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
            if (this.getScope() != null) {
                data.set("scope", om.valueToTree(this.getScope()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressClassParametersReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressClassParametersReference.Jsii$Proxy that = (IngressClassParametersReference.Jsii$Proxy) o;

            if (!kind.equals(that.kind)) return false;
            if (!name.equals(that.name)) return false;
            if (this.apiGroup != null ? !this.apiGroup.equals(that.apiGroup) : that.apiGroup != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            return this.scope != null ? this.scope.equals(that.scope) : that.scope == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kind.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.apiGroup != null ? this.apiGroup.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.scope != null ? this.scope.hashCode() : 0);
            return result;
        }
    }
}
