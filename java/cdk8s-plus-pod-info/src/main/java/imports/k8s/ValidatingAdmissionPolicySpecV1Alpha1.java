package imports.k8s;

/**
 * ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.959Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ValidatingAdmissionPolicySpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ValidatingAdmissionPolicySpecV1Alpha1.Jsii$Proxy.class)
public interface ValidatingAdmissionPolicySpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Validations contain CEL expressions which is used to apply the validation.
     * <p>
     * A minimum of one validation is required for a policy definition. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.ValidationV1Alpha1> getValidations();

    /**
     * FailurePolicy defines how to handle failures for the admission policy.
     * <p>
     * Failures can occur from invalid or mis-configured policy definitions or bindings. A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource. Allowed values are Ignore or Fail. Defaults to Fail.
     * <p>
     * Default: Fail.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFailurePolicy() {
        return null;
    }

    /**
     * MatchConstraints specifies what resources this policy is designed to validate.
     * <p>
     * The AdmissionPolicy cares about a request if it matches <em>all</em> Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.MatchResourcesV1Alpha1 getMatchConstraints() {
        return null;
    }

    /**
     * ParamKind specifies the kind of resources used to parameterize this policy.
     * <p>
     * If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ParamKindV1Alpha1 getParamKind() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidatingAdmissionPolicySpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidatingAdmissionPolicySpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidatingAdmissionPolicySpecV1Alpha1> {
        java.util.List<imports.k8s.ValidationV1Alpha1> validations;
        java.lang.String failurePolicy;
        imports.k8s.MatchResourcesV1Alpha1 matchConstraints;
        imports.k8s.ParamKindV1Alpha1 paramKind;

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Alpha1#getValidations}
         * @param validations Validations contain CEL expressions which is used to apply the validation. This parameter is required.
         *                    A minimum of one validation is required for a policy definition. Required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder validations(java.util.List<? extends imports.k8s.ValidationV1Alpha1> validations) {
            this.validations = (java.util.List<imports.k8s.ValidationV1Alpha1>)validations;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Alpha1#getFailurePolicy}
         * @param failurePolicy FailurePolicy defines how to handle failures for the admission policy.
         *                      Failures can occur from invalid or mis-configured policy definitions or bindings. A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource. Allowed values are Ignore or Fail. Defaults to Fail.
         * @return {@code this}
         */
        public Builder failurePolicy(java.lang.String failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Alpha1#getMatchConstraints}
         * @param matchConstraints MatchConstraints specifies what resources this policy is designed to validate.
         *                         The AdmissionPolicy cares about a request if it matches <em>all</em> Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
         * @return {@code this}
         */
        public Builder matchConstraints(imports.k8s.MatchResourcesV1Alpha1 matchConstraints) {
            this.matchConstraints = matchConstraints;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingAdmissionPolicySpecV1Alpha1#getParamKind}
         * @param paramKind ParamKind specifies the kind of resources used to parameterize this policy.
         *                  If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
         * @return {@code this}
         */
        public Builder paramKind(imports.k8s.ParamKindV1Alpha1 paramKind) {
            this.paramKind = paramKind;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidatingAdmissionPolicySpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidatingAdmissionPolicySpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ValidatingAdmissionPolicySpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidatingAdmissionPolicySpecV1Alpha1 {
        private final java.util.List<imports.k8s.ValidationV1Alpha1> validations;
        private final java.lang.String failurePolicy;
        private final imports.k8s.MatchResourcesV1Alpha1 matchConstraints;
        private final imports.k8s.ParamKindV1Alpha1 paramKind;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.validations = software.amazon.jsii.Kernel.get(this, "validations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ValidationV1Alpha1.class)));
            this.failurePolicy = software.amazon.jsii.Kernel.get(this, "failurePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.matchConstraints = software.amazon.jsii.Kernel.get(this, "matchConstraints", software.amazon.jsii.NativeType.forClass(imports.k8s.MatchResourcesV1Alpha1.class));
            this.paramKind = software.amazon.jsii.Kernel.get(this, "paramKind", software.amazon.jsii.NativeType.forClass(imports.k8s.ParamKindV1Alpha1.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.validations = (java.util.List<imports.k8s.ValidationV1Alpha1>)java.util.Objects.requireNonNull(builder.validations, "validations is required");
            this.failurePolicy = builder.failurePolicy;
            this.matchConstraints = builder.matchConstraints;
            this.paramKind = builder.paramKind;
        }

        @Override
        public final java.util.List<imports.k8s.ValidationV1Alpha1> getValidations() {
            return this.validations;
        }

        @Override
        public final java.lang.String getFailurePolicy() {
            return this.failurePolicy;
        }

        @Override
        public final imports.k8s.MatchResourcesV1Alpha1 getMatchConstraints() {
            return this.matchConstraints;
        }

        @Override
        public final imports.k8s.ParamKindV1Alpha1 getParamKind() {
            return this.paramKind;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("validations", om.valueToTree(this.getValidations()));
            if (this.getFailurePolicy() != null) {
                data.set("failurePolicy", om.valueToTree(this.getFailurePolicy()));
            }
            if (this.getMatchConstraints() != null) {
                data.set("matchConstraints", om.valueToTree(this.getMatchConstraints()));
            }
            if (this.getParamKind() != null) {
                data.set("paramKind", om.valueToTree(this.getParamKind()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ValidatingAdmissionPolicySpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidatingAdmissionPolicySpecV1Alpha1.Jsii$Proxy that = (ValidatingAdmissionPolicySpecV1Alpha1.Jsii$Proxy) o;

            if (!validations.equals(that.validations)) return false;
            if (this.failurePolicy != null ? !this.failurePolicy.equals(that.failurePolicy) : that.failurePolicy != null) return false;
            if (this.matchConstraints != null ? !this.matchConstraints.equals(that.matchConstraints) : that.matchConstraints != null) return false;
            return this.paramKind != null ? this.paramKind.equals(that.paramKind) : that.paramKind == null;
        }

        @Override
        public final int hashCode() {
            int result = this.validations.hashCode();
            result = 31 * result + (this.failurePolicy != null ? this.failurePolicy.hashCode() : 0);
            result = 31 * result + (this.matchConstraints != null ? this.matchConstraints.hashCode() : 0);
            result = 31 * result + (this.paramKind != null ? this.paramKind.hashCode() : 0);
            return result;
        }
    }
}
