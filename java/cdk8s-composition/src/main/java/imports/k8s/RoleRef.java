package imports.k8s;

/**
 * RoleRef contains information that points to the role being used.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.946Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RoleRef")
@software.amazon.jsii.Jsii.Proxy(RoleRef.Jsii$Proxy.class)
public interface RoleRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIGroup is the group for the resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getApiGroup();

    /**
     * Kind is the type of resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name is the name of resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link RoleRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RoleRef}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RoleRef> {
        java.lang.String apiGroup;
        java.lang.String kind;
        java.lang.String name;

        /**
         * Sets the value of {@link RoleRef#getApiGroup}
         * @param apiGroup APIGroup is the group for the resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder apiGroup(java.lang.String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        /**
         * Sets the value of {@link RoleRef#getKind}
         * @param kind Kind is the type of resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link RoleRef#getName}
         * @param name Name is the name of resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RoleRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RoleRef build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RoleRef}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RoleRef {
        private final java.lang.String apiGroup;
        private final java.lang.String kind;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiGroup = software.amazon.jsii.Kernel.get(this, "apiGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiGroup = java.util.Objects.requireNonNull(builder.apiGroup, "apiGroup is required");
            this.kind = java.util.Objects.requireNonNull(builder.kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.lang.String getApiGroup() {
            return this.apiGroup;
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiGroup", om.valueToTree(this.getApiGroup()));
            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RoleRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RoleRef.Jsii$Proxy that = (RoleRef.Jsii$Proxy) o;

            if (!apiGroup.equals(that.apiGroup)) return false;
            if (!kind.equals(that.kind)) return false;
            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.apiGroup.hashCode();
            result = 31 * result + (this.kind.hashCode());
            result = 31 * result + (this.name.hashCode());
            return result;
        }
    }
}
