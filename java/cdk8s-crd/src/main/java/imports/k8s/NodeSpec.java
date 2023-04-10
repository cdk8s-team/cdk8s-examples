package imports.k8s;

/**
 * NodeSpec describes the attributes that a node is created with.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.929Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NodeSpec")
@software.amazon.jsii.Jsii.Proxy(NodeSpec.Jsii$Proxy.class)
public interface NodeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Deprecated: Previously used to specify the source of the node's configuration for the DynamicKubeletConfig feature.
     * <p>
     * This feature is removed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeConfigSource getConfigSource() {
        return null;
    }

    /**
     * Deprecated.
     * <p>
     * Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalId() {
        return null;
    }

    /**
     * PodCIDR represents the pod IP range assigned to the node.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPodCidr() {
        return null;
    }

    /**
     * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node.
     * <p>
     * If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPodCidRs() {
        return null;
    }

    /**
     * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProviderId() {
        return null;
    }

    /**
     * If specified, the node's taints.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.Taint> getTaints() {
        return null;
    }

    /**
     * Unschedulable controls node schedulability of new pods.
     * <p>
     * By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUnschedulable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NodeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NodeSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NodeSpec> {
        imports.k8s.NodeConfigSource configSource;
        java.lang.String externalId;
        java.lang.String podCidr;
        java.util.List<java.lang.String> podCidRs;
        java.lang.String providerId;
        java.util.List<imports.k8s.Taint> taints;
        java.lang.Boolean unschedulable;

        /**
         * Sets the value of {@link NodeSpec#getConfigSource}
         * @param configSource Deprecated: Previously used to specify the source of the node's configuration for the DynamicKubeletConfig feature.
         *                     This feature is removed.
         * @return {@code this}
         */
        public Builder configSource(imports.k8s.NodeConfigSource configSource) {
            this.configSource = configSource;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getExternalId}
         * @param externalId Deprecated.
         *                   Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
         * @return {@code this}
         */
        public Builder externalId(java.lang.String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getPodCidr}
         * @param podCidr PodCIDR represents the pod IP range assigned to the node.
         * @return {@code this}
         */
        public Builder podCidr(java.lang.String podCidr) {
            this.podCidr = podCidr;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getPodCidRs}
         * @param podCidRs podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node.
         *                 If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
         * @return {@code this}
         */
        public Builder podCidRs(java.util.List<java.lang.String> podCidRs) {
            this.podCidRs = podCidRs;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getProviderId}
         * @param providerId ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>.
         * @return {@code this}
         */
        public Builder providerId(java.lang.String providerId) {
            this.providerId = providerId;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getTaints}
         * @param taints If specified, the node's taints.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder taints(java.util.List<? extends imports.k8s.Taint> taints) {
            this.taints = (java.util.List<imports.k8s.Taint>)taints;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getUnschedulable}
         * @param unschedulable Unschedulable controls node schedulability of new pods.
         *                      By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
         * @return {@code this}
         */
        public Builder unschedulable(java.lang.Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NodeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NodeSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NodeSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NodeSpec {
        private final imports.k8s.NodeConfigSource configSource;
        private final java.lang.String externalId;
        private final java.lang.String podCidr;
        private final java.util.List<java.lang.String> podCidRs;
        private final java.lang.String providerId;
        private final java.util.List<imports.k8s.Taint> taints;
        private final java.lang.Boolean unschedulable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configSource = software.amazon.jsii.Kernel.get(this, "configSource", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeConfigSource.class));
            this.externalId = software.amazon.jsii.Kernel.get(this, "externalId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.podCidr = software.amazon.jsii.Kernel.get(this, "podCidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.podCidRs = software.amazon.jsii.Kernel.get(this, "podCidRs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.providerId = software.amazon.jsii.Kernel.get(this, "providerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.taints = software.amazon.jsii.Kernel.get(this, "taints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Taint.class)));
            this.unschedulable = software.amazon.jsii.Kernel.get(this, "unschedulable", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configSource = builder.configSource;
            this.externalId = builder.externalId;
            this.podCidr = builder.podCidr;
            this.podCidRs = builder.podCidRs;
            this.providerId = builder.providerId;
            this.taints = (java.util.List<imports.k8s.Taint>)builder.taints;
            this.unschedulable = builder.unschedulable;
        }

        @Override
        public final imports.k8s.NodeConfigSource getConfigSource() {
            return this.configSource;
        }

        @Override
        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        @Override
        public final java.lang.String getPodCidr() {
            return this.podCidr;
        }

        @Override
        public final java.util.List<java.lang.String> getPodCidRs() {
            return this.podCidRs;
        }

        @Override
        public final java.lang.String getProviderId() {
            return this.providerId;
        }

        @Override
        public final java.util.List<imports.k8s.Taint> getTaints() {
            return this.taints;
        }

        @Override
        public final java.lang.Boolean getUnschedulable() {
            return this.unschedulable;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigSource() != null) {
                data.set("configSource", om.valueToTree(this.getConfigSource()));
            }
            if (this.getExternalId() != null) {
                data.set("externalId", om.valueToTree(this.getExternalId()));
            }
            if (this.getPodCidr() != null) {
                data.set("podCidr", om.valueToTree(this.getPodCidr()));
            }
            if (this.getPodCidRs() != null) {
                data.set("podCidRs", om.valueToTree(this.getPodCidRs()));
            }
            if (this.getProviderId() != null) {
                data.set("providerId", om.valueToTree(this.getProviderId()));
            }
            if (this.getTaints() != null) {
                data.set("taints", om.valueToTree(this.getTaints()));
            }
            if (this.getUnschedulable() != null) {
                data.set("unschedulable", om.valueToTree(this.getUnschedulable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NodeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NodeSpec.Jsii$Proxy that = (NodeSpec.Jsii$Proxy) o;

            if (this.configSource != null ? !this.configSource.equals(that.configSource) : that.configSource != null) return false;
            if (this.externalId != null ? !this.externalId.equals(that.externalId) : that.externalId != null) return false;
            if (this.podCidr != null ? !this.podCidr.equals(that.podCidr) : that.podCidr != null) return false;
            if (this.podCidRs != null ? !this.podCidRs.equals(that.podCidRs) : that.podCidRs != null) return false;
            if (this.providerId != null ? !this.providerId.equals(that.providerId) : that.providerId != null) return false;
            if (this.taints != null ? !this.taints.equals(that.taints) : that.taints != null) return false;
            return this.unschedulable != null ? this.unschedulable.equals(that.unschedulable) : that.unschedulable == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configSource != null ? this.configSource.hashCode() : 0;
            result = 31 * result + (this.externalId != null ? this.externalId.hashCode() : 0);
            result = 31 * result + (this.podCidr != null ? this.podCidr.hashCode() : 0);
            result = 31 * result + (this.podCidRs != null ? this.podCidRs.hashCode() : 0);
            result = 31 * result + (this.providerId != null ? this.providerId.hashCode() : 0);
            result = 31 * result + (this.taints != null ? this.taints.hashCode() : 0);
            result = 31 * result + (this.unschedulable != null ? this.unschedulable.hashCode() : 0);
            return result;
        }
    }
}
