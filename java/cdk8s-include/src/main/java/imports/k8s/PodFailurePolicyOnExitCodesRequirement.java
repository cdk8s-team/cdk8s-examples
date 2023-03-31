package imports.k8s;

/**
 * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes.
 * <p>
 * In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.935Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodFailurePolicyOnExitCodesRequirement")
@software.amazon.jsii.Jsii.Proxy(PodFailurePolicyOnExitCodesRequirement.Jsii$Proxy.class)
public interface PodFailurePolicyOnExitCodesRequirement extends software.amazon.jsii.JsiiSerializable {

    /**
     * Represents the relationship between the container exit code(s) and the specified values.
     * <p>
     * Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code
     * (might be multiple if there are multiple containers not restricted
     * by the 'containerName' field) is in the set of specified values.
     * <p>
     * <ul>
     * <li>NotIn: the requirement is satisfied if at least one container exit code
     * (might be multiple if there are multiple containers not restricted
     * by the 'containerName' field) is not in the set of specified values.
     * Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOperator();

    /**
     * Specifies the set of values.
     * <p>
     * Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getValues();

    /**
     * Restricts the check for exit codes to the container with the specified name.
     * <p>
     * When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContainerName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodFailurePolicyOnExitCodesRequirement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodFailurePolicyOnExitCodesRequirement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodFailurePolicyOnExitCodesRequirement> {
        java.lang.String operator;
        java.util.List<java.lang.Number> values;
        java.lang.String containerName;

        /**
         * Sets the value of {@link PodFailurePolicyOnExitCodesRequirement#getOperator}
         * @param operator Represents the relationship between the container exit code(s) and the specified values. This parameter is required.
         *                 Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code
         *                 (might be multiple if there are multiple containers not restricted
         *                 by the 'containerName' field) is in the set of specified values.
         *                 <p>
         *                 <ul>
         *                 <li>NotIn: the requirement is satisfied if at least one container exit code
         *                 (might be multiple if there are multiple containers not restricted
         *                 by the 'containerName' field) is not in the set of specified values.
         *                 Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.</li>
         *                 </ul>
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link PodFailurePolicyOnExitCodesRequirement#getValues}
         * @param values Specifies the set of values. This parameter is required.
         *               Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder values(java.util.List<? extends java.lang.Number> values) {
            this.values = (java.util.List<java.lang.Number>)values;
            return this;
        }

        /**
         * Sets the value of {@link PodFailurePolicyOnExitCodesRequirement#getContainerName}
         * @param containerName Restricts the check for exit codes to the container with the specified name.
         *                      When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodFailurePolicyOnExitCodesRequirement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodFailurePolicyOnExitCodesRequirement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodFailurePolicyOnExitCodesRequirement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodFailurePolicyOnExitCodesRequirement {
        private final java.lang.String operator;
        private final java.util.List<java.lang.Number> values;
        private final java.lang.String containerName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class)));
            this.containerName = software.amazon.jsii.Kernel.get(this, "containerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.operator = java.util.Objects.requireNonNull(builder.operator, "operator is required");
            this.values = (java.util.List<java.lang.Number>)java.util.Objects.requireNonNull(builder.values, "values is required");
            this.containerName = builder.containerName;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final java.util.List<java.lang.Number> getValues() {
            return this.values;
        }

        @Override
        public final java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("operator", om.valueToTree(this.getOperator()));
            data.set("values", om.valueToTree(this.getValues()));
            if (this.getContainerName() != null) {
                data.set("containerName", om.valueToTree(this.getContainerName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodFailurePolicyOnExitCodesRequirement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodFailurePolicyOnExitCodesRequirement.Jsii$Proxy that = (PodFailurePolicyOnExitCodesRequirement.Jsii$Proxy) o;

            if (!operator.equals(that.operator)) return false;
            if (!values.equals(that.values)) return false;
            return this.containerName != null ? this.containerName.equals(that.containerName) : that.containerName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.operator.hashCode();
            result = 31 * result + (this.values.hashCode());
            result = 31 * result + (this.containerName != null ? this.containerName.hashCode() : 0);
            return result;
        }
    }
}
