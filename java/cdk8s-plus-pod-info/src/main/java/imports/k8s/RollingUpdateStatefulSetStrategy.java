package imports.k8s;

/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.946Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RollingUpdateStatefulSetStrategy")
@software.amazon.jsii.Jsii.Proxy(RollingUpdateStatefulSetStrategy.Jsii$Proxy.class)
public interface RollingUpdateStatefulSetStrategy extends software.amazon.jsii.JsiiSerializable {

    /**
     * The maximum number of pods that can be unavailable during the update.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
     * <p>
     * Default: 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getMaxUnavailable() {
        return null;
    }

    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned for updates.
     * <p>
     * During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPartition() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RollingUpdateStatefulSetStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RollingUpdateStatefulSetStrategy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RollingUpdateStatefulSetStrategy> {
        imports.k8s.IntOrString maxUnavailable;
        java.lang.Number partition;

        /**
         * Sets the value of {@link RollingUpdateStatefulSetStrategy#getMaxUnavailable}
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update.
         *                       Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. This can not be 0. Defaults to 1. This field is alpha-level and is only honored by servers that enable the MaxUnavailableStatefulSet feature. The field applies to all pods in the range 0 to Replicas-1. That means if there is any unavailable pod in the range 0 to Replicas-1, it will be counted towards MaxUnavailable.
         * @return {@code this}
         */
        public Builder maxUnavailable(imports.k8s.IntOrString maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Sets the value of {@link RollingUpdateStatefulSetStrategy#getPartition}
         * @param partition Partition indicates the ordinal at which the StatefulSet should be partitioned for updates.
         *                  During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.
         * @return {@code this}
         */
        public Builder partition(java.lang.Number partition) {
            this.partition = partition;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RollingUpdateStatefulSetStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RollingUpdateStatefulSetStrategy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RollingUpdateStatefulSetStrategy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RollingUpdateStatefulSetStrategy {
        private final imports.k8s.IntOrString maxUnavailable;
        private final java.lang.Number partition;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxUnavailable = software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
            this.partition = software.amazon.jsii.Kernel.get(this, "partition", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxUnavailable = builder.maxUnavailable;
            this.partition = builder.partition;
        }

        @Override
        public final imports.k8s.IntOrString getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public final java.lang.Number getPartition() {
            return this.partition;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }
            if (this.getPartition() != null) {
                data.set("partition", om.valueToTree(this.getPartition()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RollingUpdateStatefulSetStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RollingUpdateStatefulSetStrategy.Jsii$Proxy that = (RollingUpdateStatefulSetStrategy.Jsii$Proxy) o;

            if (this.maxUnavailable != null ? !this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable != null) return false;
            return this.partition != null ? this.partition.equals(that.partition) : that.partition == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0;
            result = 31 * result + (this.partition != null ? this.partition.hashCode() : 0);
            return result;
        }
    }
}
