package imports.k8s;

/**
 * ServiceReference holds a reference to Service.legacy.k8s.io.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.949Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceReference")
@software.amazon.jsii.Jsii.Proxy(ServiceReference.Jsii$Proxy.class)
public interface ServiceReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * `name` is the name of the service.
     * <p>
     * Required
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * `namespace` is the namespace of the service.
     * <p>
     * Required
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNamespace();

    /**
     * `path` is an optional URL path which will be sent in any request to this service.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * If specified, the port on the service that hosting webhook.
     * <p>
     * Default to 443 for backward compatibility. <code>port</code> should be a valid port number (1-65535, inclusive).
     * <p>
     * Default: 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceReference}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceReference> {
        java.lang.String name;
        java.lang.String namespace;
        java.lang.String path;
        java.lang.Number port;

        /**
         * Sets the value of {@link ServiceReference#getName}
         * @param name `name` is the name of the service. This parameter is required.
         *             Required
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ServiceReference#getNamespace}
         * @param namespace `namespace` is the namespace of the service. This parameter is required.
         *                  Required
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ServiceReference#getPath}
         * @param path `path` is an optional URL path which will be sent in any request to this service.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link ServiceReference#getPort}
         * @param port If specified, the port on the service that hosting webhook.
         *             Default to 443 for backward compatibility. <code>port</code> should be a valid port number (1-65535, inclusive).
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceReference build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceReference}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceReference {
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.lang.String path;
        private final java.lang.Number port;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.namespace = java.util.Objects.requireNonNull(builder.namespace, "namespace is required");
            this.path = builder.path;
            this.port = builder.port;
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
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("namespace", om.valueToTree(this.getNamespace()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceReference.Jsii$Proxy that = (ServiceReference.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!namespace.equals(that.namespace)) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            return this.port != null ? this.port.equals(that.port) : that.port == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.namespace.hashCode());
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            return result;
        }
    }
}
