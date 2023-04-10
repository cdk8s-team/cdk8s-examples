package imports.k8s;

/**
 * MetricIdentifier defines the name and optionally selector for a metric.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.923Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MetricIdentifierV2")
@software.amazon.jsii.Jsii.Proxy(MetricIdentifierV2.Jsii$Proxy.class)
public interface MetricIdentifierV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * name is the name of the given metric.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * <p>
     * When unset, just the metricName will be used to gather metrics.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetricIdentifierV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricIdentifierV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricIdentifierV2> {
        java.lang.String name;
        imports.k8s.LabelSelector selector;

        /**
         * Sets the value of {@link MetricIdentifierV2#getName}
         * @param name name is the name of the given metric. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link MetricIdentifierV2#getSelector}
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
         *                 When unset, just the metricName will be used to gather metrics.
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricIdentifierV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricIdentifierV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricIdentifierV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricIdentifierV2 {
        private final java.lang.String name;
        private final imports.k8s.LabelSelector selector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.selector = builder.selector;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.MetricIdentifierV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricIdentifierV2.Jsii$Proxy that = (MetricIdentifierV2.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.selector != null ? this.selector.equals(that.selector) : that.selector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            return result;
        }
    }
}
