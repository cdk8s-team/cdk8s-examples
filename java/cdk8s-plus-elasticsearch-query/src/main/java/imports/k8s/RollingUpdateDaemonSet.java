package imports.k8s;

/**
 * Spec to control the desired behavior of daemon set rolling update.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.938Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RollingUpdateDaemonSet")
@software.amazon.jsii.Jsii.Proxy(RollingUpdateDaemonSet.Jsii$Proxy.class)
public interface RollingUpdateDaemonSet extends software.amazon.jsii.JsiiSerializable {

    /**
     * The maximum number of nodes with an existing available DaemonSet pod that can have an updated DaemonSet pod during during an update.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up to a minimum of 1. Default value is 0. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their a new pod created before the old pod is marked as deleted. The update starts by launching new pods on 30% of nodes. Once an updated pod is available (Ready for at least minReadySeconds) the old DaemonSet pod on that node is marked deleted. If the old pod becomes unavailable for any reason (Ready transitions to false, is evicted, or is drained) an updated pod is immediatedly created on that node without considering surge limits. Allowing surge implies the possibility that the resources consumed by the daemonset on any given node can double if the readiness check fails, and so resource intensive daemonsets should take into account that they may cause evictions during disruption.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getMaxSurge() {
        return null;
    }

    /**
     * The maximum number of DaemonSet pods that can be unavailable during the update.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0 if MaxSurge is 0 Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getMaxUnavailable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RollingUpdateDaemonSet}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RollingUpdateDaemonSet}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RollingUpdateDaemonSet> {
        imports.k8s.IntOrString maxSurge;
        imports.k8s.IntOrString maxUnavailable;

        /**
         * Sets the value of {@link RollingUpdateDaemonSet#getMaxSurge}
         * @param maxSurge The maximum number of nodes with an existing available DaemonSet pod that can have an updated DaemonSet pod during during an update.
         *                 Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up to a minimum of 1. Default value is 0. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their a new pod created before the old pod is marked as deleted. The update starts by launching new pods on 30% of nodes. Once an updated pod is available (Ready for at least minReadySeconds) the old DaemonSet pod on that node is marked deleted. If the old pod becomes unavailable for any reason (Ready transitions to false, is evicted, or is drained) an updated pod is immediatedly created on that node without considering surge limits. Allowing surge implies the possibility that the resources consumed by the daemonset on any given node can double if the readiness check fails, and so resource intensive daemonsets should take into account that they may cause evictions during disruption.
         * @return {@code this}
         */
        public Builder maxSurge(imports.k8s.IntOrString maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        /**
         * Sets the value of {@link RollingUpdateDaemonSet#getMaxUnavailable}
         * @param maxUnavailable The maximum number of DaemonSet pods that can be unavailable during the update.
         *                       Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0 if MaxSurge is 0 Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
         * @return {@code this}
         */
        public Builder maxUnavailable(imports.k8s.IntOrString maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RollingUpdateDaemonSet}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RollingUpdateDaemonSet build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RollingUpdateDaemonSet}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RollingUpdateDaemonSet {
        private final imports.k8s.IntOrString maxSurge;
        private final imports.k8s.IntOrString maxUnavailable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxSurge = software.amazon.jsii.Kernel.get(this, "maxSurge", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
            this.maxUnavailable = software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxSurge = builder.maxSurge;
            this.maxUnavailable = builder.maxUnavailable;
        }

        @Override
        public final imports.k8s.IntOrString getMaxSurge() {
            return this.maxSurge;
        }

        @Override
        public final imports.k8s.IntOrString getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxSurge() != null) {
                data.set("maxSurge", om.valueToTree(this.getMaxSurge()));
            }
            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RollingUpdateDaemonSet"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RollingUpdateDaemonSet.Jsii$Proxy that = (RollingUpdateDaemonSet.Jsii$Proxy) o;

            if (this.maxSurge != null ? !this.maxSurge.equals(that.maxSurge) : that.maxSurge != null) return false;
            return this.maxUnavailable != null ? this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxSurge != null ? this.maxSurge.hashCode() : 0;
            result = 31 * result + (this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0);
            return result;
        }
    }
}
