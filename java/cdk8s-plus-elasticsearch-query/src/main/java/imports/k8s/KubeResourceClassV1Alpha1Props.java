package imports.k8s;

/**
 * ResourceClass is used by administrators to influence how resources are allocated.
 * <p>
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.847Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeResourceClassV1Alpha1Props")
@software.amazon.jsii.Jsii.Proxy(KubeResourceClassV1Alpha1Props.Jsii$Proxy.class)
public interface KubeResourceClassV1Alpha1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
     * <p>
     * Resource drivers have a unique name in forward domain order (acme.example.com).
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriverName();

    /**
     * Standard object metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class.
     * <p>
     * A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceClassParametersReferenceV1Alpha1 getParametersRef() {
        return null;
    }

    /**
     * Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
     * <p>
     * Setting this field is optional. If null, all nodes are candidates.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeSelector getSuitableNodes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeResourceClassV1Alpha1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeResourceClassV1Alpha1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeResourceClassV1Alpha1Props> {
        java.lang.String driverName;
        imports.k8s.ObjectMeta metadata;
        imports.k8s.ResourceClassParametersReferenceV1Alpha1 parametersRef;
        imports.k8s.NodeSelector suitableNodes;

        /**
         * Sets the value of {@link KubeResourceClassV1Alpha1Props#getDriverName}
         * @param driverName DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class. This parameter is required.
         *                   Resource drivers have a unique name in forward domain order (acme.example.com).
         * @return {@code this}
         */
        public Builder driverName(java.lang.String driverName) {
            this.driverName = driverName;
            return this;
        }

        /**
         * Sets the value of {@link KubeResourceClassV1Alpha1Props#getMetadata}
         * @param metadata Standard object metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeResourceClassV1Alpha1Props#getParametersRef}
         * @param parametersRef ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class.
         *                      A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
         * @return {@code this}
         */
        public Builder parametersRef(imports.k8s.ResourceClassParametersReferenceV1Alpha1 parametersRef) {
            this.parametersRef = parametersRef;
            return this;
        }

        /**
         * Sets the value of {@link KubeResourceClassV1Alpha1Props#getSuitableNodes}
         * @param suitableNodes Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
         *                      Setting this field is optional. If null, all nodes are candidates.
         * @return {@code this}
         */
        public Builder suitableNodes(imports.k8s.NodeSelector suitableNodes) {
            this.suitableNodes = suitableNodes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeResourceClassV1Alpha1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeResourceClassV1Alpha1Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeResourceClassV1Alpha1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeResourceClassV1Alpha1Props {
        private final java.lang.String driverName;
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.ResourceClassParametersReferenceV1Alpha1 parametersRef;
        private final imports.k8s.NodeSelector suitableNodes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driverName = software.amazon.jsii.Kernel.get(this, "driverName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.parametersRef = software.amazon.jsii.Kernel.get(this, "parametersRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceClassParametersReferenceV1Alpha1.class));
            this.suitableNodes = software.amazon.jsii.Kernel.get(this, "suitableNodes", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driverName = java.util.Objects.requireNonNull(builder.driverName, "driverName is required");
            this.metadata = builder.metadata;
            this.parametersRef = builder.parametersRef;
            this.suitableNodes = builder.suitableNodes;
        }

        @Override
        public final java.lang.String getDriverName() {
            return this.driverName;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.ResourceClassParametersReferenceV1Alpha1 getParametersRef() {
            return this.parametersRef;
        }

        @Override
        public final imports.k8s.NodeSelector getSuitableNodes() {
            return this.suitableNodes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driverName", om.valueToTree(this.getDriverName()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getParametersRef() != null) {
                data.set("parametersRef", om.valueToTree(this.getParametersRef()));
            }
            if (this.getSuitableNodes() != null) {
                data.set("suitableNodes", om.valueToTree(this.getSuitableNodes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeResourceClassV1Alpha1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeResourceClassV1Alpha1Props.Jsii$Proxy that = (KubeResourceClassV1Alpha1Props.Jsii$Proxy) o;

            if (!driverName.equals(that.driverName)) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.parametersRef != null ? !this.parametersRef.equals(that.parametersRef) : that.parametersRef != null) return false;
            return this.suitableNodes != null ? this.suitableNodes.equals(that.suitableNodes) : that.suitableNodes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driverName.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.parametersRef != null ? this.parametersRef.hashCode() : 0);
            result = 31 * result + (this.suitableNodes != null ? this.suitableNodes.hashCode() : 0);
            return result;
        }
    }
}
