package imports.k8s;

/**
 * PodFailurePolicy describes how failed pods influence the backoffLimit.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.935Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodFailurePolicy")
@software.amazon.jsii.Jsii.Proxy(PodFailurePolicy.Jsii$Proxy.class)
public interface PodFailurePolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of pod failure policy rules.
     * <p>
     * The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.PodFailurePolicyRule> getRules();

    /**
     * @return a {@link Builder} of {@link PodFailurePolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodFailurePolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodFailurePolicy> {
        java.util.List<imports.k8s.PodFailurePolicyRule> rules;

        /**
         * Sets the value of {@link PodFailurePolicy#getRules}
         * @param rules A list of pod failure policy rules. This parameter is required.
         *              The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.k8s.PodFailurePolicyRule> rules) {
            this.rules = (java.util.List<imports.k8s.PodFailurePolicyRule>)rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodFailurePolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodFailurePolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodFailurePolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodFailurePolicy {
        private final java.util.List<imports.k8s.PodFailurePolicyRule> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.PodFailurePolicyRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rules = (java.util.List<imports.k8s.PodFailurePolicyRule>)java.util.Objects.requireNonNull(builder.rules, "rules is required");
        }

        @Override
        public final java.util.List<imports.k8s.PodFailurePolicyRule> getRules() {
            return this.rules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rules", om.valueToTree(this.getRules()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodFailurePolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodFailurePolicy.Jsii$Proxy that = (PodFailurePolicy.Jsii$Proxy) o;

            return this.rules.equals(that.rules);
        }

        @Override
        public final int hashCode() {
            int result = this.rules.hashCode();
            return result;
        }
    }
}
