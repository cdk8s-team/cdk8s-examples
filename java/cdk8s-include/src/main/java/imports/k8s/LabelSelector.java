package imports.k8s;

/**
 * A label selector is a label query over a set of resources.
 * <p>
 * The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.917Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.LabelSelector")
@software.amazon.jsii.Jsii.Proxy(LabelSelector.Jsii$Proxy.class)
public interface LabelSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * matchExpressions is a list of label selector requirements.
     * <p>
     * The requirements are ANDed.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.LabelSelectorRequirement> getMatchExpressions() {
        return null;
    }

    /**
     * matchLabels is a map of {key,value} pairs.
     * <p>
     * A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMatchLabels() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LabelSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LabelSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LabelSelector> {
        java.util.List<imports.k8s.LabelSelectorRequirement> matchExpressions;
        java.util.Map<java.lang.String, java.lang.String> matchLabels;

        /**
         * Sets the value of {@link LabelSelector#getMatchExpressions}
         * @param matchExpressions matchExpressions is a list of label selector requirements.
         *                         The requirements are ANDed.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder matchExpressions(java.util.List<? extends imports.k8s.LabelSelectorRequirement> matchExpressions) {
            this.matchExpressions = (java.util.List<imports.k8s.LabelSelectorRequirement>)matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link LabelSelector#getMatchLabels}
         * @param matchLabels matchLabels is a map of {key,value} pairs.
         *                    A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
         * @return {@code this}
         */
        public Builder matchLabels(java.util.Map<java.lang.String, java.lang.String> matchLabels) {
            this.matchLabels = matchLabels;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LabelSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LabelSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LabelSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LabelSelector {
        private final java.util.List<imports.k8s.LabelSelectorRequirement> matchExpressions;
        private final java.util.Map<java.lang.String, java.lang.String> matchLabels;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelectorRequirement.class)));
            this.matchLabels = software.amazon.jsii.Kernel.get(this, "matchLabels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = (java.util.List<imports.k8s.LabelSelectorRequirement>)builder.matchExpressions;
            this.matchLabels = builder.matchLabels;
        }

        @Override
        public final java.util.List<imports.k8s.LabelSelectorRequirement> getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getMatchLabels() {
            return this.matchLabels;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }
            if (this.getMatchLabels() != null) {
                data.set("matchLabels", om.valueToTree(this.getMatchLabels()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LabelSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LabelSelector.Jsii$Proxy that = (LabelSelector.Jsii$Proxy) o;

            if (this.matchExpressions != null ? !this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions != null) return false;
            return this.matchLabels != null ? this.matchLabels.equals(that.matchLabels) : that.matchLabels == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            result = 31 * result + (this.matchLabels != null ? this.matchLabels.hashCode() : 0);
            return result;
        }
    }
}
