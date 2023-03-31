package imports.k8s;

/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.947Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ScopedResourceSelectorRequirement")
@software.amazon.jsii.Jsii.Proxy(ScopedResourceSelectorRequirement.Jsii$Proxy.class)
public interface ScopedResourceSelectorRequirement extends software.amazon.jsii.JsiiSerializable {

    /**
     * Represents a scope's relationship to a set of values.
     * <p>
     * Valid operators are In, NotIn, Exists, DoesNotExist.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOperator();

    /**
     * The name of the scope that the selector applies to.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getScopeName();

    /**
     * An array of string values.
     * <p>
     * If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValues() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ScopedResourceSelectorRequirement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ScopedResourceSelectorRequirement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ScopedResourceSelectorRequirement> {
        java.lang.String operator;
        java.lang.String scopeName;
        java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link ScopedResourceSelectorRequirement#getOperator}
         * @param operator Represents a scope's relationship to a set of values. This parameter is required.
         *                 Valid operators are In, NotIn, Exists, DoesNotExist.
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link ScopedResourceSelectorRequirement#getScopeName}
         * @param scopeName The name of the scope that the selector applies to. This parameter is required.
         * @return {@code this}
         */
        public Builder scopeName(java.lang.String scopeName) {
            this.scopeName = scopeName;
            return this;
        }

        /**
         * Sets the value of {@link ScopedResourceSelectorRequirement#getValues}
         * @param values An array of string values.
         *               If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ScopedResourceSelectorRequirement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ScopedResourceSelectorRequirement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ScopedResourceSelectorRequirement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ScopedResourceSelectorRequirement {
        private final java.lang.String operator;
        private final java.lang.String scopeName;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scopeName = software.amazon.jsii.Kernel.get(this, "scopeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.operator = java.util.Objects.requireNonNull(builder.operator, "operator is required");
            this.scopeName = java.util.Objects.requireNonNull(builder.scopeName, "scopeName is required");
            this.values = builder.values;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final java.lang.String getScopeName() {
            return this.scopeName;
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

            data.set("operator", om.valueToTree(this.getOperator()));
            data.set("scopeName", om.valueToTree(this.getScopeName()));
            if (this.getValues() != null) {
                data.set("values", om.valueToTree(this.getValues()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ScopedResourceSelectorRequirement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ScopedResourceSelectorRequirement.Jsii$Proxy that = (ScopedResourceSelectorRequirement.Jsii$Proxy) o;

            if (!operator.equals(that.operator)) return false;
            if (!scopeName.equals(that.scopeName)) return false;
            return this.values != null ? this.values.equals(that.values) : that.values == null;
        }

        @Override
        public final int hashCode() {
            int result = this.operator.hashCode();
            result = 31 * result + (this.scopeName.hashCode());
            result = 31 * result + (this.values != null ? this.values.hashCode() : 0);
            return result;
        }
    }
}
