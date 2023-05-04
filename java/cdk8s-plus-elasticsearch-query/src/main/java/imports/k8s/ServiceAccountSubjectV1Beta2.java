package imports.k8s;

/**
 * ServiceAccountSubject holds detailed information for service-account-kind subject.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.940Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceAccountSubjectV1Beta2")
@software.amazon.jsii.Jsii.Proxy(ServiceAccountSubjectV1Beta2.Jsii$Proxy.class)
public interface ServiceAccountSubjectV1Beta2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * `namespace` is the namespace of matching ServiceAccount objects.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNamespace();

    /**
     * @return a {@link Builder} of {@link ServiceAccountSubjectV1Beta2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceAccountSubjectV1Beta2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceAccountSubjectV1Beta2> {
        java.lang.String name;
        java.lang.String namespace;

        /**
         * Sets the value of {@link ServiceAccountSubjectV1Beta2#getName}
         * @param name `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. This parameter is required.
         *             Required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountSubjectV1Beta2#getNamespace}
         * @param namespace `namespace` is the namespace of matching ServiceAccount objects. This parameter is required.
         *                  Required.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceAccountSubjectV1Beta2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceAccountSubjectV1Beta2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceAccountSubjectV1Beta2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceAccountSubjectV1Beta2 {
        private final java.lang.String name;
        private final java.lang.String namespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.namespace = java.util.Objects.requireNonNull(builder.namespace, "namespace is required");
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("namespace", om.valueToTree(this.getNamespace()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceAccountSubjectV1Beta2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceAccountSubjectV1Beta2.Jsii$Proxy that = (ServiceAccountSubjectV1Beta2.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.namespace.equals(that.namespace);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.namespace.hashCode());
            return result;
        }
    }
}
