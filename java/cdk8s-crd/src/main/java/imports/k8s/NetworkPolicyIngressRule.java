package imports.k8s;

/**
 * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector.
 * <p>
 * The traffic must match both ports and from.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.927Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NetworkPolicyIngressRule")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyIngressRule.Jsii$Proxy.class)
public interface NetworkPolicyIngressRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * List of sources which should be able to access the pods selected for this rule.
     * <p>
     * Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NetworkPolicyPeer> getFrom() {
        return null;
    }

    /**
     * List of ports which should be made accessible on the pods selected for this rule.
     * <p>
     * Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NetworkPolicyPort> getPorts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyIngressRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyIngressRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicyIngressRule> {
        java.util.List<imports.k8s.NetworkPolicyPeer> from;
        java.util.List<imports.k8s.NetworkPolicyPort> ports;

        /**
         * Sets the value of {@link NetworkPolicyIngressRule#getFrom}
         * @param from List of sources which should be able to access the pods selected for this rule.
         *             Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder from(java.util.List<? extends imports.k8s.NetworkPolicyPeer> from) {
            this.from = (java.util.List<imports.k8s.NetworkPolicyPeer>)from;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyIngressRule#getPorts}
         * @param ports List of ports which should be made accessible on the pods selected for this rule.
         *              Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ports(java.util.List<? extends imports.k8s.NetworkPolicyPort> ports) {
            this.ports = (java.util.List<imports.k8s.NetworkPolicyPort>)ports;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyIngressRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicyIngressRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyIngressRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyIngressRule {
        private final java.util.List<imports.k8s.NetworkPolicyPeer> from;
        private final java.util.List<imports.k8s.NetworkPolicyPort> ports;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NetworkPolicyPeer.class)));
            this.ports = software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NetworkPolicyPort.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.from = (java.util.List<imports.k8s.NetworkPolicyPeer>)builder.from;
            this.ports = (java.util.List<imports.k8s.NetworkPolicyPort>)builder.ports;
        }

        @Override
        public final java.util.List<imports.k8s.NetworkPolicyPeer> getFrom() {
            return this.from;
        }

        @Override
        public final java.util.List<imports.k8s.NetworkPolicyPort> getPorts() {
            return this.ports;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFrom() != null) {
                data.set("from", om.valueToTree(this.getFrom()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NetworkPolicyIngressRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyIngressRule.Jsii$Proxy that = (NetworkPolicyIngressRule.Jsii$Proxy) o;

            if (this.from != null ? !this.from.equals(that.from) : that.from != null) return false;
            return this.ports != null ? this.ports.equals(that.ports) : that.ports == null;
        }

        @Override
        public final int hashCode() {
            int result = this.from != null ? this.from.hashCode() : 0;
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            return result;
        }
    }
}
