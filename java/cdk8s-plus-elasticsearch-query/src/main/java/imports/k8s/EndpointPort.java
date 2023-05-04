package imports.k8s;

/**
 * EndpointPort is a tuple that describes a single port.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.765Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EndpointPort")
@software.amazon.jsii.Jsii.Proxy(EndpointPort.Jsii$Proxy.class)
public interface EndpointPort extends software.amazon.jsii.JsiiSerializable {

    /**
     * The port number of the endpoint.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPort();

    /**
     * The application protocol for this port.
     * <p>
     * This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAppProtocol() {
        return null;
    }

    /**
     * The name of this port.
     * <p>
     * This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * The IP protocol for this port.
     * <p>
     * Must be UDP, TCP, or SCTP. Default is TCP.
     * <p>
     * Default: TCP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointPort}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointPort}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EndpointPort> {
        java.lang.Number port;
        java.lang.String appProtocol;
        java.lang.String name;
        java.lang.String protocol;

        /**
         * Sets the value of {@link EndpointPort#getPort}
         * @param port The port number of the endpoint. This parameter is required.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPort#getAppProtocol}
         * @param appProtocol The application protocol for this port.
         *                    This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
         * @return {@code this}
         */
        public Builder appProtocol(java.lang.String appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPort#getName}
         * @param name The name of this port.
         *             This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPort#getProtocol}
         * @param protocol The IP protocol for this port.
         *                 Must be UDP, TCP, or SCTP. Default is TCP.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointPort}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EndpointPort build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EndpointPort}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointPort {
        private final java.lang.Number port;
        private final java.lang.String appProtocol;
        private final java.lang.String name;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.appProtocol = software.amazon.jsii.Kernel.get(this, "appProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(builder.port, "port is required");
            this.appProtocol = builder.appProtocol;
            this.name = builder.name;
            this.protocol = builder.protocol;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getAppProtocol() {
            return this.appProtocol;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            if (this.getAppProtocol() != null) {
                data.set("appProtocol", om.valueToTree(this.getAppProtocol()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointPort"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointPort.Jsii$Proxy that = (EndpointPort.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            if (this.appProtocol != null ? !this.appProtocol.equals(that.appProtocol) : that.appProtocol != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.protocol != null ? this.protocol.equals(that.protocol) : that.protocol == null;
        }

        @Override
        public final int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.appProtocol != null ? this.appProtocol.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            return result;
        }
    }
}
