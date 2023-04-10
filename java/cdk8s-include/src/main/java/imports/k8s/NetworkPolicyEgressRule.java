package imports.k8s;

/**
 * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector.
 * <p>
 * The traffic must match both ports and to. This type is beta-level in 1.8
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.926Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NetworkPolicyEgressRule")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyEgressRule.Jsii$Proxy.class)
public interface NetworkPolicyEgressRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * List of destination ports for outgoing traffic.
     * <p>
     * Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NetworkPolicyPort> getPorts() {
        return null;
    }

    /**
     * List of destinations for outgoing traffic of pods selected for this rule.
     * <p>
     * Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NetworkPolicyPeer> getTo() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyEgressRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyEgressRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicyEgressRule> {
        java.util.List<imports.k8s.NetworkPolicyPort> ports;
        java.util.List<imports.k8s.NetworkPolicyPeer> to;

        /**
         * Sets the value of {@link NetworkPolicyEgressRule#getPorts}
         * @param ports List of destination ports for outgoing traffic.
         *              Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ports(java.util.List<? extends imports.k8s.NetworkPolicyPort> ports) {
            this.ports = (java.util.List<imports.k8s.NetworkPolicyPort>)ports;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyEgressRule#getTo}
         * @param to List of destinations for outgoing traffic of pods selected for this rule.
         *           Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder to(java.util.List<? extends imports.k8s.NetworkPolicyPeer> to) {
            this.to = (java.util.List<imports.k8s.NetworkPolicyPeer>)to;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyEgressRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicyEgressRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyEgressRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyEgressRule {
        private final java.util.List<imports.k8s.NetworkPolicyPort> ports;
        private final java.util.List<imports.k8s.NetworkPolicyPeer> to;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ports = software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NetworkPolicyPort.class)));
            this.to = software.amazon.jsii.Kernel.get(this, "to", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NetworkPolicyPeer.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ports = (java.util.List<imports.k8s.NetworkPolicyPort>)builder.ports;
            this.to = (java.util.List<imports.k8s.NetworkPolicyPeer>)builder.to;
        }

        @Override
        public final java.util.List<imports.k8s.NetworkPolicyPort> getPorts() {
            return this.ports;
        }

        @Override
        public final java.util.List<imports.k8s.NetworkPolicyPeer> getTo() {
            return this.to;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }
            if (this.getTo() != null) {
                data.set("to", om.valueToTree(this.getTo()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NetworkPolicyEgressRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyEgressRule.Jsii$Proxy that = (NetworkPolicyEgressRule.Jsii$Proxy) o;

            if (this.ports != null ? !this.ports.equals(that.ports) : that.ports != null) return false;
            return this.to != null ? this.to.equals(that.to) : that.to == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ports != null ? this.ports.hashCode() : 0;
            result = 31 * result + (this.to != null ? this.to.hashCode() : 0);
            return result;
        }
    }
}
