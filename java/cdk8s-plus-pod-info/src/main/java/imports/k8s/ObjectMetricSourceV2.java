package imports.k8s;

/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.930Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ObjectMetricSourceV2")
@software.amazon.jsii.Jsii.Proxy(ObjectMetricSourceV2.Jsii$Proxy.class)
public interface ObjectMetricSourceV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * describedObject specifies the descriptions of a object,such as kind,name apiVersion.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CrossVersionObjectReferenceV2 getDescribedObject();

    /**
     * metric identifies the target metric by name and selector.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.MetricIdentifierV2 getMetric();

    /**
     * target specifies the target value for the given metric.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.MetricTargetV2 getTarget();

    /**
     * @return a {@link Builder} of {@link ObjectMetricSourceV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ObjectMetricSourceV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ObjectMetricSourceV2> {
        imports.k8s.CrossVersionObjectReferenceV2 describedObject;
        imports.k8s.MetricIdentifierV2 metric;
        imports.k8s.MetricTargetV2 target;

        /**
         * Sets the value of {@link ObjectMetricSourceV2#getDescribedObject}
         * @param describedObject describedObject specifies the descriptions of a object,such as kind,name apiVersion. This parameter is required.
         * @return {@code this}
         */
        public Builder describedObject(imports.k8s.CrossVersionObjectReferenceV2 describedObject) {
            this.describedObject = describedObject;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMetricSourceV2#getMetric}
         * @param metric metric identifies the target metric by name and selector. This parameter is required.
         * @return {@code this}
         */
        public Builder metric(imports.k8s.MetricIdentifierV2 metric) {
            this.metric = metric;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMetricSourceV2#getTarget}
         * @param target target specifies the target value for the given metric. This parameter is required.
         * @return {@code this}
         */
        public Builder target(imports.k8s.MetricTargetV2 target) {
            this.target = target;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ObjectMetricSourceV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ObjectMetricSourceV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ObjectMetricSourceV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ObjectMetricSourceV2 {
        private final imports.k8s.CrossVersionObjectReferenceV2 describedObject;
        private final imports.k8s.MetricIdentifierV2 metric;
        private final imports.k8s.MetricTargetV2 target;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.describedObject = software.amazon.jsii.Kernel.get(this, "describedObject", software.amazon.jsii.NativeType.forClass(imports.k8s.CrossVersionObjectReferenceV2.class));
            this.metric = software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.k8s.MetricIdentifierV2.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.k8s.MetricTargetV2.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.describedObject = java.util.Objects.requireNonNull(builder.describedObject, "describedObject is required");
            this.metric = java.util.Objects.requireNonNull(builder.metric, "metric is required");
            this.target = java.util.Objects.requireNonNull(builder.target, "target is required");
        }

        @Override
        public final imports.k8s.CrossVersionObjectReferenceV2 getDescribedObject() {
            return this.describedObject;
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

            data.set("describedObject", om.valueToTree(this.getDescribedObject()));
            data.set("metric", om.valueToTree(this.getMetric()));
            data.set("target", om.valueToTree(this.getTarget()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ObjectMetricSourceV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ObjectMetricSourceV2.Jsii$Proxy that = (ObjectMetricSourceV2.Jsii$Proxy) o;

            if (!describedObject.equals(that.describedObject)) return false;
            if (!metric.equals(that.metric)) return false;
            return this.target.equals(that.target);
        }

        @Override
        public final int hashCode() {
            int result = this.describedObject.hashCode();
            result = 31 * result + (this.metric.hashCode());
            result = 31 * result + (this.target.hashCode());
            return result;
        }
    }
}
