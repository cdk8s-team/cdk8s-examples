package imports.k8s;

/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver.
 * <p>
 * The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.889Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PolicyRulesWithSubjectsV1Beta2")
@software.amazon.jsii.Jsii.Proxy(PolicyRulesWithSubjectsV1Beta2.Jsii$Proxy.class)
public interface PolicyRulesWithSubjectsV1Beta2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about.
     * <p>
     * There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.SubjectV1Beta2> getSubjects();

    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NonResourcePolicyRuleV1Beta2> getNonResourceRules() {
        return null;
    }

    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource.
     * <p>
     * At least one of <code>resourceRules</code> and <code>nonResourceRules</code> has to be non-empty.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ResourcePolicyRuleV1Beta2> getResourceRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PolicyRulesWithSubjectsV1Beta2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PolicyRulesWithSubjectsV1Beta2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PolicyRulesWithSubjectsV1Beta2> {
        java.util.List<imports.k8s.SubjectV1Beta2> subjects;
        java.util.List<imports.k8s.NonResourcePolicyRuleV1Beta2> nonResourceRules;
        java.util.List<imports.k8s.ResourcePolicyRuleV1Beta2> resourceRules;

        /**
         * Sets the value of {@link PolicyRulesWithSubjectsV1Beta2#getSubjects}
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. This parameter is required.
         *                 There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder subjects(java.util.List<? extends imports.k8s.SubjectV1Beta2> subjects) {
            this.subjects = (java.util.List<imports.k8s.SubjectV1Beta2>)subjects;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRulesWithSubjectsV1Beta2#getNonResourceRules}
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder nonResourceRules(java.util.List<? extends imports.k8s.NonResourcePolicyRuleV1Beta2> nonResourceRules) {
            this.nonResourceRules = (java.util.List<imports.k8s.NonResourcePolicyRuleV1Beta2>)nonResourceRules;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRulesWithSubjectsV1Beta2#getResourceRules}
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource.
         *                      At least one of <code>resourceRules</code> and <code>nonResourceRules</code> has to be non-empty.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder resourceRules(java.util.List<? extends imports.k8s.ResourcePolicyRuleV1Beta2> resourceRules) {
            this.resourceRules = (java.util.List<imports.k8s.ResourcePolicyRuleV1Beta2>)resourceRules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PolicyRulesWithSubjectsV1Beta2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PolicyRulesWithSubjectsV1Beta2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PolicyRulesWithSubjectsV1Beta2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PolicyRulesWithSubjectsV1Beta2 {
        private final java.util.List<imports.k8s.SubjectV1Beta2> subjects;
        private final java.util.List<imports.k8s.NonResourcePolicyRuleV1Beta2> nonResourceRules;
        private final java.util.List<imports.k8s.ResourcePolicyRuleV1Beta2> resourceRules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.subjects = software.amazon.jsii.Kernel.get(this, "subjects", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.SubjectV1Beta2.class)));
            this.nonResourceRules = software.amazon.jsii.Kernel.get(this, "nonResourceRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NonResourcePolicyRuleV1Beta2.class)));
            this.resourceRules = software.amazon.jsii.Kernel.get(this, "resourceRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ResourcePolicyRuleV1Beta2.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subjects = (java.util.List<imports.k8s.SubjectV1Beta2>)java.util.Objects.requireNonNull(builder.subjects, "subjects is required");
            this.nonResourceRules = (java.util.List<imports.k8s.NonResourcePolicyRuleV1Beta2>)builder.nonResourceRules;
            this.resourceRules = (java.util.List<imports.k8s.ResourcePolicyRuleV1Beta2>)builder.resourceRules;
        }

        @Override
        public final java.util.List<imports.k8s.SubjectV1Beta2> getSubjects() {
            return this.subjects;
        }

        @Override
        public final java.util.List<imports.k8s.NonResourcePolicyRuleV1Beta2> getNonResourceRules() {
            return this.nonResourceRules;
        }

        @Override
        public final java.util.List<imports.k8s.ResourcePolicyRuleV1Beta2> getResourceRules() {
            return this.resourceRules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("subjects", om.valueToTree(this.getSubjects()));
            if (this.getNonResourceRules() != null) {
                data.set("nonResourceRules", om.valueToTree(this.getNonResourceRules()));
            }
            if (this.getResourceRules() != null) {
                data.set("resourceRules", om.valueToTree(this.getResourceRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PolicyRulesWithSubjectsV1Beta2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PolicyRulesWithSubjectsV1Beta2.Jsii$Proxy that = (PolicyRulesWithSubjectsV1Beta2.Jsii$Proxy) o;

            if (!subjects.equals(that.subjects)) return false;
            if (this.nonResourceRules != null ? !this.nonResourceRules.equals(that.nonResourceRules) : that.nonResourceRules != null) return false;
            return this.resourceRules != null ? this.resourceRules.equals(that.resourceRules) : that.resourceRules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.subjects.hashCode();
            result = 31 * result + (this.nonResourceRules != null ? this.nonResourceRules.hashCode() : 0);
            result = 31 * result + (this.resourceRules != null ? this.resourceRules.hashCode() : 0);
            return result;
        }
    }
}
