package imports.k8s;

/**
 * NetworkPolicyPort describes a port to allow traffic on.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.869Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NetworkPolicyPort")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyPort.Jsii$Proxy.class)
public interface NetworkPolicyPort extends software.amazon.jsii.JsiiSerializable {

    /**
     * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy.
     * <p>
     * This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getEndPort() {
        return null;
    }

    /**
     * The port on the given protocol.
     * <p>
     * This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getPort() {
        return null;
    }

    /**
     * The protocol (TCP, UDP, or SCTP) which traffic must match.
     * <p>
     * If not specified, this field defaults to TCP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyPort}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyPort}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicyPort> {
        java.lang.Number endPort;
        imports.k8s.IntOrString port;
        java.lang.String protocol;

        /**
         * Sets the value of {@link NetworkPolicyPort#getEndPort}
         * @param endPort If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy.
         *                This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port.
         * @return {@code this}
         */
        public Builder endPort(java.lang.Number endPort) {
            this.endPort = endPort;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyPort#getPort}
         * @param port The port on the given protocol.
         *             This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
         * @return {@code this}
         */
        public Builder port(imports.k8s.IntOrString port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyPort#getProtocol}
         * @param protocol The protocol (TCP, UDP, or SCTP) which traffic must match.
         *                 If not specified, this field defaults to TCP.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyPort}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicyPort build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyPort}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyPort {
        private final java.lang.Number endPort;
        private final imports.k8s.IntOrString port;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endPort = software.amazon.jsii.Kernel.get(this, "endPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endPort = builder.endPort;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        @Override
        public final java.lang.Number getEndPort() {
            return this.endPort;
        }

        @Override
        public final imports.k8s.IntOrString getPort() {
            return this.port;
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

            if (this.getEndPort() != null) {
                data.set("endPort", om.valueToTree(this.getEndPort()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NetworkPolicyPort"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyPort.Jsii$Proxy that = (NetworkPolicyPort.Jsii$Proxy) o;

            if (this.endPort != null ? !this.endPort.equals(that.endPort) : that.endPort != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            return this.protocol != null ? this.protocol.equals(that.protocol) : that.protocol == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endPort != null ? this.endPort.hashCode() : 0;
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            return result;
        }
    }
}
