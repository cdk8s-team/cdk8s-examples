package imports.k8s;

/**
 * Subject contains a reference to the object or user identities a role binding applies to.
 * <p>
 * This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.944Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Subject")
@software.amazon.jsii.Jsii.Proxy(Subject.Jsii$Proxy.class)
public interface Subject extends software.amazon.jsii.JsiiSerializable {

    /**
     * Kind of object being referenced.
     * <p>
     * Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name of the object being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * APIGroup holds the API group of the referenced subject.
     * <p>
     * Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * <p>
     * Default: for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiGroup() {
        return null;
    }

    /**
     * Namespace of the referenced object.
     * <p>
     * If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Subject}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Subject}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Subject> {
        java.lang.String kind;
        java.lang.String name;
        java.lang.String apiGroup;
        java.lang.String namespace;

        /**
         * Sets the value of {@link Subject#getKind}
         * @param kind Kind of object being referenced. This parameter is required.
         *             Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link Subject#getName}
         * @param name Name of the object being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Subject#getApiGroup}
         * @param apiGroup APIGroup holds the API group of the referenced subject.
         *                 Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
         * @return {@code this}
         */
        public Builder apiGroup(java.lang.String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        /**
         * Sets the value of {@link Subject#getNamespace}
         * @param namespace Namespace of the referenced object.
         *                  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Subject}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Subject build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Subject}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Subject {
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
            struct.set("fqn", om.valueToTree("k8s.Subject"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Subject.Jsii$Proxy that = (Subject.Jsii$Proxy) o;

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
