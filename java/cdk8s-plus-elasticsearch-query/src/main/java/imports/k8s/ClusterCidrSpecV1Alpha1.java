package imports.k8s;

/**
 * ClusterCIDRSpec defines the desired state of ClusterCIDR.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.748Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ClusterCidrSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ClusterCidrSpecV1Alpha1.Jsii$Proxy.class)
public interface ClusterCidrSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * PerNodeHostBits defines the number of host bits to be configured per node.
     * <p>
     * A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPerNodeHostBits();

    /**
     * IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIpv4() {
        return null;
    }

    /**
     * IPv6 defines an IPv6 IP block in CIDR notation(e.g. "2001:db8::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIpv6() {
        return null;
    }

    /**
     * NodeSelector defines which nodes the config is applicable to.
     * <p>
     * An empty or nil NodeSelector selects all nodes. This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeSelector getNodeSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterCidrSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterCidrSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClusterCidrSpecV1Alpha1> {
        java.lang.Number perNodeHostBits;
        java.lang.String ipv4;
        java.lang.String ipv6;
        imports.k8s.NodeSelector nodeSelector;

        /**
         * Sets the value of {@link ClusterCidrSpecV1Alpha1#getPerNodeHostBits}
         * @param perNodeHostBits PerNodeHostBits defines the number of host bits to be configured per node. This parameter is required.
         *                        A subnet mask determines how much of the address is used for network bits and host bits. For example an IPv4 address of 192.168.0.0/24, splits the address into 24 bits for the network portion and 8 bits for the host portion. To allocate 256 IPs, set this field to 8 (a /24 mask for IPv4 or a /120 for IPv6). Minimum value is 4 (16 IPs). This field is immutable.
         * @return {@code this}
         */
        public Builder perNodeHostBits(java.lang.Number perNodeHostBits) {
            this.perNodeHostBits = perNodeHostBits;
            return this;
        }

        /**
         * Sets the value of {@link ClusterCidrSpecV1Alpha1#getIpv4}
         * @param ipv4 IPv4 defines an IPv4 IP block in CIDR notation(e.g. "10.0.0.0/8"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
         * @return {@code this}
         */
        public Builder ipv4(java.lang.String ipv4) {
            this.ipv4 = ipv4;
            return this;
        }

        /**
         * Sets the value of {@link ClusterCidrSpecV1Alpha1#getIpv6}
         * @param ipv6 IPv6 defines an IPv6 IP block in CIDR notation(e.g. "2001:db8::/64"). At least one of IPv4 and IPv6 must be specified. This field is immutable.
         * @return {@code this}
         */
        public Builder ipv6(java.lang.String ipv6) {
            this.ipv6 = ipv6;
            return this;
        }

        /**
         * Sets the value of {@link ClusterCidrSpecV1Alpha1#getNodeSelector}
         * @param nodeSelector NodeSelector defines which nodes the config is applicable to.
         *                     An empty or nil NodeSelector selects all nodes. This field is immutable.
         * @return {@code this}
         */
        public Builder nodeSelector(imports.k8s.NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterCidrSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClusterCidrSpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ClusterCidrSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterCidrSpecV1Alpha1 {
        private final java.lang.Number perNodeHostBits;
        private final java.lang.String ipv4;
        private final java.lang.String ipv6;
        private final imports.k8s.NodeSelector nodeSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.perNodeHostBits = software.amazon.jsii.Kernel.get(this, "perNodeHostBits", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv4 = software.amazon.jsii.Kernel.get(this, "ipv4", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipv6 = software.amazon.jsii.Kernel.get(this, "ipv6", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeSelector = software.amazon.jsii.Kernel.get(this, "nodeSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.perNodeHostBits = java.util.Objects.requireNonNull(builder.perNodeHostBits, "perNodeHostBits is required");
            this.ipv4 = builder.ipv4;
            this.ipv6 = builder.ipv6;
            this.nodeSelector = builder.nodeSelector;
        }

        @Override
        public final java.lang.Number getPerNodeHostBits() {
            return this.perNodeHostBits;
        }

        @Override
        public final java.lang.String getIpv4() {
            return this.ipv4;
        }

        @Override
        public final java.lang.String getIpv6() {
            return this.ipv6;
        }

        @Override
        public final imports.k8s.NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("perNodeHostBits", om.valueToTree(this.getPerNodeHostBits()));
            if (this.getIpv4() != null) {
                data.set("ipv4", om.valueToTree(this.getIpv4()));
            }
            if (this.getIpv6() != null) {
                data.set("ipv6", om.valueToTree(this.getIpv6()));
            }
            if (this.getNodeSelector() != null) {
                data.set("nodeSelector", om.valueToTree(this.getNodeSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClusterCidrSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterCidrSpecV1Alpha1.Jsii$Proxy that = (ClusterCidrSpecV1Alpha1.Jsii$Proxy) o;

            if (!perNodeHostBits.equals(that.perNodeHostBits)) return false;
            if (this.ipv4 != null ? !this.ipv4.equals(that.ipv4) : that.ipv4 != null) return false;
            if (this.ipv6 != null ? !this.ipv6.equals(that.ipv6) : that.ipv6 != null) return false;
            return this.nodeSelector != null ? this.nodeSelector.equals(that.nodeSelector) : that.nodeSelector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.perNodeHostBits.hashCode();
            result = 31 * result + (this.ipv4 != null ? this.ipv4.hashCode() : 0);
            result = 31 * result + (this.ipv6 != null ? this.ipv6.hashCode() : 0);
            result = 31 * result + (this.nodeSelector != null ? this.nodeSelector.hashCode() : 0);
            return result;
        }
    }
}
