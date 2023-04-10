package imports.k8s;

/**
 * HPAScalingRules configures the scaling behavior for one direction.
 * <p>
 * These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.848Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HpaScalingRulesV2")
@software.amazon.jsii.Jsii.Proxy(HpaScalingRulesV2.Jsii$Proxy.class)
public interface HpaScalingRulesV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * policies is a list of potential scaling polices which can be used during scaling.
     * <p>
     * At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.HpaScalingPolicyV2> getPolicies() {
        return null;
    }

    /**
     * selectPolicy is used to specify which policy should be used.
     * <p>
     * If not set, the default value Max is used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelectPolicy() {
        return null;
    }

    /**
     * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down.
     * <p>
     * StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getStabilizationWindowSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HpaScalingRulesV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HpaScalingRulesV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HpaScalingRulesV2> {
        java.util.List<imports.k8s.HpaScalingPolicyV2> policies;
        java.lang.String selectPolicy;
        java.lang.Number stabilizationWindowSeconds;

        /**
         * Sets the value of {@link HpaScalingRulesV2#getPolicies}
         * @param policies policies is a list of potential scaling polices which can be used during scaling.
         *                 At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder policies(java.util.List<? extends imports.k8s.HpaScalingPolicyV2> policies) {
            this.policies = (java.util.List<imports.k8s.HpaScalingPolicyV2>)policies;
            return this;
        }

        /**
         * Sets the value of {@link HpaScalingRulesV2#getSelectPolicy}
         * @param selectPolicy selectPolicy is used to specify which policy should be used.
         *                     If not set, the default value Max is used.
         * @return {@code this}
         */
        public Builder selectPolicy(java.lang.String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }

        /**
         * Sets the value of {@link HpaScalingRulesV2#getStabilizationWindowSeconds}
         * @param stabilizationWindowSeconds StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down.
         *                                   StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
         * @return {@code this}
         */
        public Builder stabilizationWindowSeconds(java.lang.Number stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HpaScalingRulesV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HpaScalingRulesV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HpaScalingRulesV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HpaScalingRulesV2 {
        private final java.util.List<imports.k8s.HpaScalingPolicyV2> policies;
        private final java.lang.String selectPolicy;
        private final java.lang.Number stabilizationWindowSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.policies = software.amazon.jsii.Kernel.get(this, "policies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.HpaScalingPolicyV2.class)));
            this.selectPolicy = software.amazon.jsii.Kernel.get(this, "selectPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stabilizationWindowSeconds = software.amazon.jsii.Kernel.get(this, "stabilizationWindowSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.policies = (java.util.List<imports.k8s.HpaScalingPolicyV2>)builder.policies;
            this.selectPolicy = builder.selectPolicy;
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
        }

        @Override
        public final java.util.List<imports.k8s.HpaScalingPolicyV2> getPolicies() {
            return this.policies;
        }

        @Override
        public final java.lang.String getSelectPolicy() {
            return this.selectPolicy;
        }

        @Override
        public final java.lang.Number getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPolicies() != null) {
                data.set("policies", om.valueToTree(this.getPolicies()));
            }
            if (this.getSelectPolicy() != null) {
                data.set("selectPolicy", om.valueToTree(this.getSelectPolicy()));
            }
            if (this.getStabilizationWindowSeconds() != null) {
                data.set("stabilizationWindowSeconds", om.valueToTree(this.getStabilizationWindowSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HpaScalingRulesV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HpaScalingRulesV2.Jsii$Proxy that = (HpaScalingRulesV2.Jsii$Proxy) o;

            if (this.policies != null ? !this.policies.equals(that.policies) : that.policies != null) return false;
            if (this.selectPolicy != null ? !this.selectPolicy.equals(that.selectPolicy) : that.selectPolicy != null) return false;
            return this.stabilizationWindowSeconds != null ? this.stabilizationWindowSeconds.equals(that.stabilizationWindowSeconds) : that.stabilizationWindowSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.policies != null ? this.policies.hashCode() : 0;
            result = 31 * result + (this.selectPolicy != null ? this.selectPolicy.hashCode() : 0);
            result = 31 * result + (this.stabilizationWindowSeconds != null ? this.stabilizationWindowSeconds.hashCode() : 0);
            return result;
        }
    }
}
