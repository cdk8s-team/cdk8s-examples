package imports.k8s;

/**
 * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.939Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ScopeSelector")
@software.amazon.jsii.Jsii.Proxy(ScopeSelector.Jsii$Proxy.class)
public interface ScopeSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of scope selector requirements by scope of the resources.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ScopedResourceSelectorRequirement> getMatchExpressions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ScopeSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ScopeSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ScopeSelector> {
        java.util.List<imports.k8s.ScopedResourceSelectorRequirement> matchExpressions;

        /**
         * Sets the value of {@link ScopeSelector#getMatchExpressions}
         * @param matchExpressions A list of scope selector requirements by scope of the resources.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder matchExpressions(java.util.List<? extends imports.k8s.ScopedResourceSelectorRequirement> matchExpressions) {
            this.matchExpressions = (java.util.List<imports.k8s.ScopedResourceSelectorRequirement>)matchExpressions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ScopeSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ScopeSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ScopeSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ScopeSelector {
        private final java.util.List<imports.k8s.ScopedResourceSelectorRequirement> matchExpressions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ScopedResourceSelectorRequirement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = (java.util.List<imports.k8s.ScopedResourceSelectorRequirement>)builder.matchExpressions;
        }

        @Override
        public final java.util.List<imports.k8s.ScopedResourceSelectorRequirement> getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ScopeSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ScopeSelector.Jsii$Proxy that = (ScopeSelector.Jsii$Proxy) o;

            return this.matchExpressions != null ? this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            return result;
        }
    }
}
