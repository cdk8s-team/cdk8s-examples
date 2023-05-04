package imports.k8s;

/**
 * CSINodeDriver holds information about the specification of one CSI driver installed on a node.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.754Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiNodeDriver")
@software.amazon.jsii.Jsii.Proxy(CsiNodeDriver.Jsii$Proxy.class)
public interface CsiNodeDriver extends software.amazon.jsii.JsiiSerializable {

    /**
     * This is the name of the CSI driver that this object refers to.
     * <p>
     * This MUST be the same name returned by the CSI GetPluginName() call for that driver.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * nodeID of the node from the driver point of view.
     * <p>
     * This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNodeId();

    /**
     * allocatable represents the volume resources of a node that are available for scheduling.
     * <p>
     * This field is beta.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.VolumeNodeResources getAllocatable() {
        return null;
    }

    /**
     * topologyKeys is the list of keys supported by the driver.
     * <p>
     * When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTopologyKeys() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiNodeDriver}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiNodeDriver}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiNodeDriver> {
        java.lang.String name;
        java.lang.String nodeId;
        imports.k8s.VolumeNodeResources allocatable;
        java.util.List<java.lang.String> topologyKeys;

        /**
         * Sets the value of {@link CsiNodeDriver#getName}
         * @param name This is the name of the CSI driver that this object refers to. This parameter is required.
         *             This MUST be the same name returned by the CSI GetPluginName() call for that driver.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CsiNodeDriver#getNodeId}
         * @param nodeId nodeID of the node from the driver point of view. This parameter is required.
         *               This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
         * @return {@code this}
         */
        public Builder nodeId(java.lang.String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Sets the value of {@link CsiNodeDriver#getAllocatable}
         * @param allocatable allocatable represents the volume resources of a node that are available for scheduling.
         *                    This field is beta.
         * @return {@code this}
         */
        public Builder allocatable(imports.k8s.VolumeNodeResources allocatable) {
            this.allocatable = allocatable;
            return this;
        }

        /**
         * Sets the value of {@link CsiNodeDriver#getTopologyKeys}
         * @param topologyKeys topologyKeys is the list of keys supported by the driver.
         *                     When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
         * @return {@code this}
         */
        public Builder topologyKeys(java.util.List<java.lang.String> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiNodeDriver}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiNodeDriver build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CsiNodeDriver}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiNodeDriver {
        private final java.lang.String name;
        private final java.lang.String nodeId;
        private final imports.k8s.VolumeNodeResources allocatable;
        private final java.util.List<java.lang.String> topologyKeys;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeId = software.amazon.jsii.Kernel.get(this, "nodeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allocatable = software.amazon.jsii.Kernel.get(this, "allocatable", software.amazon.jsii.NativeType.forClass(imports.k8s.VolumeNodeResources.class));
            this.topologyKeys = software.amazon.jsii.Kernel.get(this, "topologyKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.nodeId = java.util.Objects.requireNonNull(builder.nodeId, "nodeId is required");
            this.allocatable = builder.allocatable;
            this.topologyKeys = builder.topologyKeys;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNodeId() {
            return this.nodeId;
        }

        @Override
        public final imports.k8s.VolumeNodeResources getAllocatable() {
            return this.allocatable;
        }

        @Override
        public final java.util.List<java.lang.String> getTopologyKeys() {
            return this.topologyKeys;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("nodeId", om.valueToTree(this.getNodeId()));
            if (this.getAllocatable() != null) {
                data.set("allocatable", om.valueToTree(this.getAllocatable()));
            }
            if (this.getTopologyKeys() != null) {
                data.set("topologyKeys", om.valueToTree(this.getTopologyKeys()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CsiNodeDriver"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiNodeDriver.Jsii$Proxy that = (CsiNodeDriver.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!nodeId.equals(that.nodeId)) return false;
            if (this.allocatable != null ? !this.allocatable.equals(that.allocatable) : that.allocatable != null) return false;
            return this.topologyKeys != null ? this.topologyKeys.equals(that.topologyKeys) : that.topologyKeys == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.nodeId.hashCode());
            result = 31 * result + (this.allocatable != null ? this.allocatable.hashCode() : 0);
            result = 31 * result + (this.topologyKeys != null ? this.topologyKeys.hashCode() : 0);
            return result;
        }
    }
}
