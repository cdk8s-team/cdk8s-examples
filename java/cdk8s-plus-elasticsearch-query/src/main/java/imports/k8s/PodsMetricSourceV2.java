package imports.k8s;

/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 * <p>
 * The values will be averaged together before being compared to the target value.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.887Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodsMetricSourceV2")
@software.amazon.jsii.Jsii.Proxy(PodsMetricSourceV2.Jsii$Proxy.class)
public interface PodsMetricSourceV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * metric identifies the target metric by name and selector.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.MetricIdentifierV2 getMetric();

    /**
     * target specifies the target value for the given metric.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.MetricTargetV2 getTarget();

    /**
     * @return a {@link Builder} of {@link PodsMetricSourceV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodsMetricSourceV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodsMetricSourceV2> {
        imports.k8s.MetricIdentifierV2 metric;
        imports.k8s.MetricTargetV2 target;

        /**
         * Sets the value of {@link PodsMetricSourceV2#getMetric}
         * @param metric metric identifies the target metric by name and selector. This parameter is required.
         * @return {@code this}
         */
        public Builder metric(imports.k8s.MetricIdentifierV2 metric) {
            this.metric = metric;
            return this;
        }

        /**
         * Sets the value of {@link PodsMetricSourceV2#getTarget}
         * @param target target specifies the target value for the given metric. This parameter is required.
         * @return {@code this}
         */
        public Builder target(imports.k8s.MetricTargetV2 target) {
            this.target = target;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodsMetricSourceV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodsMetricSourceV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodsMetricSourceV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodsMetricSourceV2 {
        private final imports.k8s.MetricIdentifierV2 metric;
        private final imports.k8s.MetricTargetV2 target;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metric = software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.k8s.MetricIdentifierV2.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.k8s.MetricTargetV2.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metric = java.util.Objects.requireNonNull(builder.metric, "metric is required");
            this.target = java.util.Objects.requireNonNull(builder.target, "target is required");
        }

        @Override
        public final imports.k8s.MetricIdentifierV2 getMetric() {
            return this.metric;
        }

        @Override
        public final imports.k8s.MetricTargetV2 getTarget() {
            return this.target;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metric", om.valueToTree(this.getMetric()));
            data.set("target", om.valueToTree(this.getTarget()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodsMetricSourceV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodsMetricSourceV2.Jsii$Proxy that = (PodsMetricSourceV2.Jsii$Proxy) o;

            if (!metric.equals(that.metric)) return false;
            return this.target.equals(that.target);
        }

        @Override
        public final int hashCode() {
            int result = this.metric.hashCode();
            result = 31 * result + (this.target.hashCode());
            return result;
        }
    }
}
