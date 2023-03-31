package imports.k8s;

/**
 * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.945Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceAttributes")
@software.amazon.jsii.Jsii.Proxy(ResourceAttributes.Jsii$Proxy.class)
public interface ResourceAttributes extends software.amazon.jsii.JsiiSerializable {

    /**
     * Group is the API Group of the Resource.
     * <p>
     * "*" means all.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * Name is the name of the resource being requested for a "get" or deleted for a "delete".
     * <p>
     * "" (empty) means all.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Namespace is the namespace of the action being requested.
     * <p>
     * Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * Resource is one of the existing resource types.
     * <p>
     * "*" means all.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResource() {
        return null;
    }

    /**
     * Subresource is one of the existing resource types.
     * <p>
     * "" means none.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubresource() {
        return null;
    }

    /**
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.
     * <p>
     * "*" means all.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVerb() {
        return null;
    }

    /**
     * Version is the API Version of the Resource.
     * <p>
     * "*" means all.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceAttributes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceAttributes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceAttributes> {
        java.lang.String group;
        java.lang.String name;
        java.lang.String namespace;
        java.lang.String resource;
        java.lang.String subresource;
        java.lang.String verb;
        java.lang.String version;

        /**
         * Sets the value of {@link ResourceAttributes#getGroup}
         * @param group Group is the API Group of the Resource.
         *              "*" means all.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link ResourceAttributes#getName}
         * @param name Name is the name of the resource being requested for a "get" or deleted for a "delete".
         *             "" (empty) means all.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ResourceAttributes#getNamespace}
         * @param namespace Namespace is the namespace of the action being requested.
         *                  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ResourceAttributes#getResource}
         * @param resource Resource is one of the existing resource types.
         *                 "*" means all.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link ResourceAttributes#getSubresource}
         * @param subresource Subresource is one of the existing resource types.
         *                    "" means none.
         * @return {@code this}
         */
        public Builder subresource(java.lang.String subresource) {
            this.subresource = subresource;
            return this;
        }

        /**
         * Sets the value of {@link ResourceAttributes#getVerb}
         * @param verb Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.
         *             "*" means all.
         * @return {@code this}
         */
        public Builder verb(java.lang.String verb) {
            this.verb = verb;
            return this;
        }

        /**
         * Sets the value of {@link ResourceAttributes#getVersion}
         * @param version Version is the API Version of the Resource.
         *                "*" means all.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceAttributes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceAttributes build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceAttributes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceAttributes {
        private final java.lang.String group;
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.lang.String resource;
        private final java.lang.String subresource;
        private final java.lang.String verb;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subresource = software.amazon.jsii.Kernel.get(this, "subresource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.verb = software.amazon.jsii.Kernel.get(this, "verb", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.group = builder.group;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.resource = builder.resource;
            this.subresource = builder.subresource;
            this.verb = builder.verb;
            this.version = builder.version;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.String getSubresource() {
            return this.subresource;
        }

        @Override
        public final java.lang.String getVerb() {
            return this.verb;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }
            if (this.getSubresource() != null) {
                data.set("subresource", om.valueToTree(this.getSubresource()));
            }
            if (this.getVerb() != null) {
                data.set("verb", om.valueToTree(this.getVerb()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceAttributes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceAttributes.Jsii$Proxy that = (ResourceAttributes.Jsii$Proxy) o;

            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.resource != null ? !this.resource.equals(that.resource) : that.resource != null) return false;
            if (this.subresource != null ? !this.subresource.equals(that.subresource) : that.subresource != null) return false;
            if (this.verb != null ? !this.verb.equals(that.verb) : that.verb != null) return false;
            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public final int hashCode() {
            int result = this.group != null ? this.group.hashCode() : 0;
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.resource != null ? this.resource.hashCode() : 0);
            result = 31 * result + (this.subresource != null ? this.subresource.hashCode() : 0);
            result = 31 * result + (this.verb != null ? this.verb.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            return result;
        }
    }
}
