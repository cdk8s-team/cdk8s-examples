package imports.k8s;

/**
 * IngressServiceBackend references a Kubernetes Service as a Backend.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.851Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IngressServiceBackend")
@software.amazon.jsii.Jsii.Proxy(IngressServiceBackend.Jsii$Proxy.class)
public interface IngressServiceBackend extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the referenced service.
     * <p>
     * The service must exist in the same namespace as the Ingress object.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Port of the referenced service.
     * <p>
     * A port name or port number is required for a IngressServiceBackend.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ServiceBackendPort getPort() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressServiceBackend}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressServiceBackend}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressServiceBackend> {
        java.lang.String name;
        imports.k8s.ServiceBackendPort port;

        /**
         * Sets the value of {@link IngressServiceBackend#getName}
         * @param name Name is the referenced service. This parameter is required.
         *             The service must exist in the same namespace as the Ingress object.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link IngressServiceBackend#getPort}
         * @param port Port of the referenced service.
         *             A port name or port number is required for a IngressServiceBackend.
         * @return {@code this}
         */
        public Builder port(imports.k8s.ServiceBackendPort port) {
            this.port = port;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressServiceBackend}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressServiceBackend build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressServiceBackend}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressServiceBackend {
        private final java.lang.String name;
        private final imports.k8s.ServiceBackendPort port;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(imports.k8s.ServiceBackendPort.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.port = builder.port;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.k8s.ServiceBackendPort getPort() {
            return this.port;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressServiceBackend"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressServiceBackend.Jsii$Proxy that = (IngressServiceBackend.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.port != null ? this.port.equals(that.port) : that.port == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            return result;
        }
    }
}
