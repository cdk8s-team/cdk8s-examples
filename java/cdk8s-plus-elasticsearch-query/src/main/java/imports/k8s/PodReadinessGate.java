package imports.k8s;

/**
 * PodReadinessGate contains the reference to a pod condition.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.884Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodReadinessGate")
@software.amazon.jsii.Jsii.Proxy(PodReadinessGate.Jsii$Proxy.class)
public interface PodReadinessGate extends software.amazon.jsii.JsiiSerializable {

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getConditionType();

    /**
     * @return a {@link Builder} of {@link PodReadinessGate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodReadinessGate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodReadinessGate> {
        java.lang.String conditionType;

        /**
         * Sets the value of {@link PodReadinessGate#getConditionType}
         * @param conditionType ConditionType refers to a condition in the pod's condition list with matching type. This parameter is required.
         * @return {@code this}
         */
        public Builder conditionType(java.lang.String conditionType) {
            this.conditionType = conditionType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodReadinessGate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodReadinessGate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodReadinessGate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodReadinessGate {
        private final java.lang.String conditionType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.conditionType = software.amazon.jsii.Kernel.get(this, "conditionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.conditionType = java.util.Objects.requireNonNull(builder.conditionType, "conditionType is required");
        }

        @Override
        public final java.lang.String getConditionType() {
            return this.conditionType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("conditionType", om.valueToTree(this.getConditionType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodReadinessGate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodReadinessGate.Jsii$Proxy that = (PodReadinessGate.Jsii$Proxy) o;

            return this.conditionType.equals(that.conditionType);
        }

        @Override
        public final int hashCode() {
            int result = this.conditionType.hashCode();
            return result;
        }
    }
}
