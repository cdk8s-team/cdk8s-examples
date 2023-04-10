package imports.k8s;

/**
 * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.917Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.LabelSelectorRequirement")
@software.amazon.jsii.Jsii.Proxy(LabelSelectorRequirement.Jsii$Proxy.class)
public interface LabelSelectorRequirement extends software.amazon.jsii.JsiiSerializable {

    /**
     * key is the label key that the selector applies to.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * operator represents a key's relationship to a set of values.
     * <p>
     * Valid operators are In, NotIn, Exists and DoesNotExist.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOperator();

    /**
     * values is an array of string values.
     * <p>
     * If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValues() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LabelSelectorRequirement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LabelSelectorRequirement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LabelSelectorRequirement> {
        java.lang.String key;
        java.lang.String operator;
        java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link LabelSelectorRequirement#getKey}
         * @param key key is the label key that the selector applies to. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link LabelSelectorRequirement#getOperator}
         * @param operator operator represents a key's relationship to a set of values. This parameter is required.
         *                 Valid operators are In, NotIn, Exists and DoesNotExist.
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link LabelSelectorRequirement#getValues}
         * @param values values is an array of string values.
         *               If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LabelSelectorRequirement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LabelSelectorRequirement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LabelSelectorRequirement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LabelSelectorRequirement {
        private final java.lang.String key;
        private final java.lang.String operator;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.operator = java.util.Objects.requireNonNull(builder.operator, "operator is required");
            this.values = builder.values;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("operator", om.valueToTree(this.getOperator()));
            if (this.getValues() != null) {
                data.set("values", om.valueToTree(this.getValues()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LabelSelectorRequirement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LabelSelectorRequirement.Jsii$Proxy that = (LabelSelectorRequirement.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (!operator.equals(that.operator)) return false;
            return this.values != null ? this.values.equals(that.values) : that.values == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.operator.hashCode());
            result = 31 * result + (this.values != null ? this.values.hashCode() : 0);
            return result;
        }
    }
}
