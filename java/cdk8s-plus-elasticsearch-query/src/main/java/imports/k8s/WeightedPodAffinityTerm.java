package imports.k8s;

/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.987Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.WeightedPodAffinityTerm")
@software.amazon.jsii.Jsii.Proxy(WeightedPodAffinityTerm.Jsii$Proxy.class)
public interface WeightedPodAffinityTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required.
     * <p>
     * A pod affinity term, associated with the corresponding weight.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.PodAffinityTerm getPodAffinityTerm();

    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getWeight();

    /**
     * @return a {@link Builder} of {@link WeightedPodAffinityTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WeightedPodAffinityTerm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WeightedPodAffinityTerm> {
        imports.k8s.PodAffinityTerm podAffinityTerm;
        java.lang.Number weight;

        /**
         * Sets the value of {@link WeightedPodAffinityTerm#getPodAffinityTerm}
         * @param podAffinityTerm Required. This parameter is required.
         *                        A pod affinity term, associated with the corresponding weight.
         * @return {@code this}
         */
        public Builder podAffinityTerm(imports.k8s.PodAffinityTerm podAffinityTerm) {
            this.podAffinityTerm = podAffinityTerm;
            return this;
        }

        /**
         * Sets the value of {@link WeightedPodAffinityTerm#getWeight}
         * @param weight weight associated with matching the corresponding podAffinityTerm, in the range 1-100. This parameter is required.
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WeightedPodAffinityTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WeightedPodAffinityTerm build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link WeightedPodAffinityTerm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WeightedPodAffinityTerm {
        private final imports.k8s.PodAffinityTerm podAffinityTerm;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podAffinityTerm = software.amazon.jsii.Kernel.get(this, "podAffinityTerm", software.amazon.jsii.NativeType.forClass(imports.k8s.PodAffinityTerm.class));
            this.weight = software.amazon.jsii.Kernel.get(this, "weight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podAffinityTerm = java.util.Objects.requireNonNull(builder.podAffinityTerm, "podAffinityTerm is required");
            this.weight = java.util.Objects.requireNonNull(builder.weight, "weight is required");
        }

        @Override
        public final imports.k8s.PodAffinityTerm getPodAffinityTerm() {
            return this.podAffinityTerm;
        }

        @Override
        public final java.lang.Number getWeight() {
            return this.weight;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("podAffinityTerm", om.valueToTree(this.getPodAffinityTerm()));
            data.set("weight", om.valueToTree(this.getWeight()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.WeightedPodAffinityTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WeightedPodAffinityTerm.Jsii$Proxy that = (WeightedPodAffinityTerm.Jsii$Proxy) o;

            if (!podAffinityTerm.equals(that.podAffinityTerm)) return false;
            return this.weight.equals(that.weight);
        }

        @Override
        public final int hashCode() {
            int result = this.podAffinityTerm.hashCode();
            result = 31 * result + (this.weight.hashCode());
            return result;
        }
    }
}
