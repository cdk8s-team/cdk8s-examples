package imports.k8s;

/**
 * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met.
 * <p>
 * One of OnExitCodes and onPodConditions, but not both, can be used in each rule.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.935Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodFailurePolicyRule")
@software.amazon.jsii.Jsii.Proxy(PodFailurePolicyRule.Jsii$Proxy.class)
public interface PodFailurePolicyRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the action taken on a pod failure when the requirements are satisfied.
     * <p>
     * Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
     * running pods are terminated.
     * <p>
     * <ul>
     * <li>Ignore: indicates that the counter towards the .backoffLimit is not
     * incremented and a replacement pod is created.</li>
     * <li>Count: indicates that the pod is handled in the default way - the
     * counter towards the .backoffLimit is incremented.
     * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAction();

    /**
     * Represents the requirement on the pod conditions.
     * <p>
     * The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.PodFailurePolicyOnPodConditionsPattern> getOnPodConditions();

    /**
     * Represents the requirement on the container exit codes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodFailurePolicyOnExitCodesRequirement getOnExitCodes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodFailurePolicyRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodFailurePolicyRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodFailurePolicyRule> {
        java.lang.String action;
        java.util.List<imports.k8s.PodFailurePolicyOnPodConditionsPattern> onPodConditions;
        imports.k8s.PodFailurePolicyOnExitCodesRequirement onExitCodes;

        /**
         * Sets the value of {@link PodFailurePolicyRule#getAction}
         * @param action Specifies the action taken on a pod failure when the requirements are satisfied. This parameter is required.
         *               Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
         *               running pods are terminated.
         *               <p>
         *               <ul>
         *               <li>Ignore: indicates that the counter towards the .backoffLimit is not
         *               incremented and a replacement pod is created.</li>
         *               <li>Count: indicates that the pod is handled in the default way - the
         *               counter towards the .backoffLimit is incremented.
         *               Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.</li>
         *               </ul>
         * @return {@code this}
         */
        public Builder action(java.lang.String action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link PodFailurePolicyRule#getOnPodConditions}
         * @param onPodConditions Represents the requirement on the pod conditions. This parameter is required.
         *                        The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder onPodConditions(java.util.List<? extends imports.k8s.PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
            this.onPodConditions = (java.util.List<imports.k8s.PodFailurePolicyOnPodConditionsPattern>)onPodConditions;
            return this;
        }

        /**
         * Sets the value of {@link PodFailurePolicyRule#getOnExitCodes}
         * @param onExitCodes Represents the requirement on the container exit codes.
         * @return {@code this}
         */
        public Builder onExitCodes(imports.k8s.PodFailurePolicyOnExitCodesRequirement onExitCodes) {
            this.onExitCodes = onExitCodes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodFailurePolicyRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodFailurePolicyRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodFailurePolicyRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodFailurePolicyRule {
        private final java.lang.String action;
        private final java.util.List<imports.k8s.PodFailurePolicyOnPodConditionsPattern> onPodConditions;
        private final imports.k8s.PodFailurePolicyOnExitCodesRequirement onExitCodes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.onPodConditions = software.amazon.jsii.Kernel.get(this, "onPodConditions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.PodFailurePolicyOnPodConditionsPattern.class)));
            this.onExitCodes = software.amazon.jsii.Kernel.get(this, "onExitCodes", software.amazon.jsii.NativeType.forClass(imports.k8s.PodFailurePolicyOnExitCodesRequirement.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = java.util.Objects.requireNonNull(builder.action, "action is required");
            this.onPodConditions = (java.util.List<imports.k8s.PodFailurePolicyOnPodConditionsPattern>)java.util.Objects.requireNonNull(builder.onPodConditions, "onPodConditions is required");
            this.onExitCodes = builder.onExitCodes;
        }

        @Override
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override
        public final java.util.List<imports.k8s.PodFailurePolicyOnPodConditionsPattern> getOnPodConditions() {
            return this.onPodConditions;
        }

        @Override
        public final imports.k8s.PodFailurePolicyOnExitCodesRequirement getOnExitCodes() {
            return this.onExitCodes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            data.set("onPodConditions", om.valueToTree(this.getOnPodConditions()));
            if (this.getOnExitCodes() != null) {
                data.set("onExitCodes", om.valueToTree(this.getOnExitCodes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodFailurePolicyRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodFailurePolicyRule.Jsii$Proxy that = (PodFailurePolicyRule.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!onPodConditions.equals(that.onPodConditions)) return false;
            return this.onExitCodes != null ? this.onExitCodes.equals(that.onExitCodes) : that.onExitCodes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.onPodConditions.hashCode());
            result = 31 * result + (this.onExitCodes != null ? this.onExitCodes.hashCode() : 0);
            return result;
        }
    }
}
