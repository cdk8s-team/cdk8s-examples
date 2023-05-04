package imports.k8s;

/**
 * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.882Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodFailurePolicyOnPodConditionsPattern")
@software.amazon.jsii.Jsii.Proxy(PodFailurePolicyOnPodConditionsPattern.Jsii$Proxy.class)
public interface PodFailurePolicyOnPodConditionsPattern extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the required Pod condition status.
     * <p>
     * To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
     * <p>
     * Default: True.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStatus();

    /**
     * Specifies the required Pod condition type.
     * <p>
     * To match a pod condition it is required that specified type equals the pod condition type.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link PodFailurePolicyOnPodConditionsPattern}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodFailurePolicyOnPodConditionsPattern}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodFailurePolicyOnPodConditionsPattern> {
        java.lang.String status;
        java.lang.String type;

        /**
         * Sets the value of {@link PodFailurePolicyOnPodConditionsPattern#getStatus}
         * @param status Specifies the required Pod condition status. This parameter is required.
         *               To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link PodFailurePolicyOnPodConditionsPattern#getType}
         * @param type Specifies the required Pod condition type. This parameter is required.
         *             To match a pod condition it is required that specified type equals the pod condition type.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodFailurePolicyOnPodConditionsPattern}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodFailurePolicyOnPodConditionsPattern build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodFailurePolicyOnPodConditionsPattern}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodFailurePolicyOnPodConditionsPattern {
        private final java.lang.String status;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.status = java.util.Objects.requireNonNull(builder.status, "status is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("status", om.valueToTree(this.getStatus()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodFailurePolicyOnPodConditionsPattern"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodFailurePolicyOnPodConditionsPattern.Jsii$Proxy that = (PodFailurePolicyOnPodConditionsPattern.Jsii$Proxy) o;

            if (!status.equals(that.status)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.status.hashCode();
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
