package imports.k8s;

/**
 * Spec to control the desired behavior of rolling update.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.938Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RollingUpdateDeployment")
@software.amazon.jsii.Jsii.Proxy(RollingUpdateDeployment.Jsii$Proxy.class)
public interface RollingUpdateDeployment extends software.amazon.jsii.JsiiSerializable {

    /**
     * The maximum number of pods that can be scheduled above the desired number of pods.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     * <p>
     * Default: 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getMaxSurge() {
        return null;
    }

    /**
     * The maximum number of pods that can be unavailable during the update.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     * <p>
     * Default: 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getMaxUnavailable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RollingUpdateDeployment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RollingUpdateDeployment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RollingUpdateDeployment> {
        imports.k8s.IntOrString maxSurge;
        imports.k8s.IntOrString maxUnavailable;

        /**
         * Sets the value of {@link RollingUpdateDeployment#getMaxSurge}
         * @param maxSurge The maximum number of pods that can be scheduled above the desired number of pods.
         *                 Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
         * @return {@code this}
         */
        public Builder maxSurge(imports.k8s.IntOrString maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        /**
         * Sets the value of {@link RollingUpdateDeployment#getMaxUnavailable}
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update.
         *                       Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
         * @return {@code this}
         */
        public Builder maxUnavailable(imports.k8s.IntOrString maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RollingUpdateDeployment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RollingUpdateDeployment build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RollingUpdateDeployment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RollingUpdateDeployment {
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
            struct.set("fqn", om.valueToTree("k8s.RollingUpdateDeployment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RollingUpdateDeployment.Jsii$Proxy that = (RollingUpdateDeployment.Jsii$Proxy) o;

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
