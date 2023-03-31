package imports.k8s;

/**
 * MetricTarget defines the target value, average value, or average utilization of a specific metric.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.923Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MetricTargetV2")
@software.amazon.jsii.Jsii.Proxy(MetricTargetV2.Jsii$Proxy.class)
public interface MetricTargetV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * type represents whether the metric type is Utilization, Value, or AverageValue.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * <p>
     * Currently only valid for Resource metric source type
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getAverageUtilization() {
        return null;
    }

    /**
     * averageValue is the target value of the average of the metric across all relevant pods (as a quantity).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getAverageValue() {
        return null;
    }

    /**
     * value is the target value of the metric (as a quantity).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Quantity getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetricTargetV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricTargetV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricTargetV2> {
        java.lang.String type;
        java.lang.Number averageUtilization;
        imports.k8s.Quantity averageValue;
        imports.k8s.Quantity value;

        /**
         * Sets the value of {@link MetricTargetV2#getType}
         * @param type type represents whether the metric type is Utilization, Value, or AverageValue. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link MetricTargetV2#getAverageUtilization}
         * @param averageUtilization averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
         *                           Currently only valid for Resource metric source type
         * @return {@code this}
         */
        public Builder averageUtilization(java.lang.Number averageUtilization) {
            this.averageUtilization = averageUtilization;
            return this;
        }

        /**
         * Sets the value of {@link MetricTargetV2#getAverageValue}
         * @param averageValue averageValue is the target value of the average of the metric across all relevant pods (as a quantity).
         * @return {@code this}
         */
        public Builder averageValue(imports.k8s.Quantity averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        /**
         * Sets the value of {@link MetricTargetV2#getValue}
         * @param value value is the target value of the metric (as a quantity).
         * @return {@code this}
         */
        public Builder value(imports.k8s.Quantity value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricTargetV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricTargetV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricTargetV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricTargetV2 {
        private final java.lang.String type;
        private final java.lang.Number averageUtilization;
        private final imports.k8s.Quantity averageValue;
        private final imports.k8s.Quantity value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.averageUtilization = software.amazon.jsii.Kernel.get(this, "averageUtilization", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.averageValue = software.amazon.jsii.Kernel.get(this, "averageValue", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.averageUtilization = builder.averageUtilization;
            this.averageValue = builder.averageValue;
            this.value = builder.value;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getAverageUtilization() {
            return this.averageUtilization;
        }

        @Override
        public final imports.k8s.Quantity getAverageValue() {
            return this.averageValue;
        }

        @Override
        public final imports.k8s.Quantity getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getAverageUtilization() != null) {
                data.set("averageUtilization", om.valueToTree(this.getAverageUtilization()));
            }
            if (this.getAverageValue() != null) {
                data.set("averageValue", om.valueToTree(this.getAverageValue()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.MetricTargetV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricTargetV2.Jsii$Proxy that = (MetricTargetV2.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.averageUtilization != null ? !this.averageUtilization.equals(that.averageUtilization) : that.averageUtilization != null) return false;
            if (this.averageValue != null ? !this.averageValue.equals(that.averageValue) : that.averageValue != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.averageUtilization != null ? this.averageUtilization.hashCode() : 0);
            result = 31 * result + (this.averageValue != null ? this.averageValue.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
