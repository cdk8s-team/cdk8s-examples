package imports.k8s;

/**
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.848Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HorizontalPodAutoscalerSpecV2")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerSpecV2.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerSpecV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * <p>
     * It cannot be less that minReplicas.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxReplicas();

    /**
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CrossVersionObjectReferenceV2 getScaleTargetRef();

    /**
     * behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
     * <p>
     * If not set, the default HPAScalingRules for scale up and scale down are used.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HorizontalPodAutoscalerBehaviorV2 getBehavior() {
        return null;
    }

    /**
     * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).
     * <p>
     * The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.MetricSpecV2> getMetrics() {
        return null;
    }

    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * <p>
     * It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReplicas() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerSpecV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerSpecV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerSpecV2> {
        java.lang.Number maxReplicas;
        imports.k8s.CrossVersionObjectReferenceV2 scaleTargetRef;
        imports.k8s.HorizontalPodAutoscalerBehaviorV2 behavior;
        java.util.List<imports.k8s.MetricSpecV2> metrics;
        java.lang.Number minReplicas;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecV2#getMaxReplicas}
         * @param maxReplicas maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. This parameter is required.
         *                    It cannot be less that minReplicas.
         * @return {@code this}
         */
        public Builder maxReplicas(java.lang.Number maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecV2#getScaleTargetRef}
         * @param scaleTargetRef scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count. This parameter is required.
         * @return {@code this}
         */
        public Builder scaleTargetRef(imports.k8s.CrossVersionObjectReferenceV2 scaleTargetRef) {
            this.scaleTargetRef = scaleTargetRef;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecV2#getBehavior}
         * @param behavior behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
         *                 If not set, the default HPAScalingRules for scale up and scale down are used.
         * @return {@code this}
         */
        public Builder behavior(imports.k8s.HorizontalPodAutoscalerBehaviorV2 behavior) {
            this.behavior = behavior;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecV2#getMetrics}
         * @param metrics metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).
         *                The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder metrics(java.util.List<? extends imports.k8s.MetricSpecV2> metrics) {
            this.metrics = (java.util.List<imports.k8s.MetricSpecV2>)metrics;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerSpecV2#getMinReplicas}
         * @param minReplicas minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
         *                    It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
         * @return {@code this}
         */
        public Builder minReplicas(java.lang.Number minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerSpecV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerSpecV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerSpecV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerSpecV2 {
        private final java.lang.Number maxReplicas;
        private final imports.k8s.CrossVersionObjectReferenceV2 scaleTargetRef;
        private final imports.k8s.HorizontalPodAutoscalerBehaviorV2 behavior;
        private final java.util.List<imports.k8s.MetricSpecV2> metrics;
        private final java.lang.Number minReplicas;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxReplicas = software.amazon.jsii.Kernel.get(this, "maxReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.scaleTargetRef = software.amazon.jsii.Kernel.get(this, "scaleTargetRef", software.amazon.jsii.NativeType.forClass(imports.k8s.CrossVersionObjectReferenceV2.class));
            this.behavior = software.amazon.jsii.Kernel.get(this, "behavior", software.amazon.jsii.NativeType.forClass(imports.k8s.HorizontalPodAutoscalerBehaviorV2.class));
            this.metrics = software.amazon.jsii.Kernel.get(this, "metrics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.MetricSpecV2.class)));
            this.minReplicas = software.amazon.jsii.Kernel.get(this, "minReplicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxReplicas = java.util.Objects.requireNonNull(builder.maxReplicas, "maxReplicas is required");
            this.scaleTargetRef = java.util.Objects.requireNonNull(builder.scaleTargetRef, "scaleTargetRef is required");
            this.behavior = builder.behavior;
            this.metrics = (java.util.List<imports.k8s.MetricSpecV2>)builder.metrics;
            this.minReplicas = builder.minReplicas;
        }

        @Override
        public final java.lang.Number getMaxReplicas() {
            return this.maxReplicas;
        }

        @Override
        public final imports.k8s.CrossVersionObjectReferenceV2 getScaleTargetRef() {
            return this.scaleTargetRef;
        }

        @Override
        public final imports.k8s.HorizontalPodAutoscalerBehaviorV2 getBehavior() {
            return this.behavior;
        }

        @Override
        public final java.util.List<imports.k8s.MetricSpecV2> getMetrics() {
            return this.metrics;
        }

        @Override
        public final java.lang.Number getMinReplicas() {
            return this.minReplicas;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxReplicas", om.valueToTree(this.getMaxReplicas()));
            data.set("scaleTargetRef", om.valueToTree(this.getScaleTargetRef()));
            if (this.getBehavior() != null) {
                data.set("behavior", om.valueToTree(this.getBehavior()));
            }
            if (this.getMetrics() != null) {
                data.set("metrics", om.valueToTree(this.getMetrics()));
            }
            if (this.getMinReplicas() != null) {
                data.set("minReplicas", om.valueToTree(this.getMinReplicas()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HorizontalPodAutoscalerSpecV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerSpecV2.Jsii$Proxy that = (HorizontalPodAutoscalerSpecV2.Jsii$Proxy) o;

            if (!maxReplicas.equals(that.maxReplicas)) return false;
            if (!scaleTargetRef.equals(that.scaleTargetRef)) return false;
            if (this.behavior != null ? !this.behavior.equals(that.behavior) : that.behavior != null) return false;
            if (this.metrics != null ? !this.metrics.equals(that.metrics) : that.metrics != null) return false;
            return this.minReplicas != null ? this.minReplicas.equals(that.minReplicas) : that.minReplicas == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxReplicas.hashCode();
            result = 31 * result + (this.scaleTargetRef.hashCode());
            result = 31 * result + (this.behavior != null ? this.behavior.hashCode() : 0);
            result = 31 * result + (this.metrics != null ? this.metrics.hashCode() : 0);
            result = 31 * result + (this.minReplicas != null ? this.minReplicas.hashCode() : 0);
            return result;
        }
    }
}
