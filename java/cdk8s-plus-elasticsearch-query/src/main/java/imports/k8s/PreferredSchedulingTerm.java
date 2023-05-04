package imports.k8s;

/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.890Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PreferredSchedulingTerm")
@software.amazon.jsii.Jsii.Proxy(PreferredSchedulingTerm.Jsii$Proxy.class)
public interface PreferredSchedulingTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * A node selector term, associated with the corresponding weight.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.NodeSelectorTerm getPreference();

    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getWeight();

    /**
     * @return a {@link Builder} of {@link PreferredSchedulingTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PreferredSchedulingTerm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PreferredSchedulingTerm> {
        imports.k8s.NodeSelectorTerm preference;
        java.lang.Number weight;

        /**
         * Sets the value of {@link PreferredSchedulingTerm#getPreference}
         * @param preference A node selector term, associated with the corresponding weight. This parameter is required.
         * @return {@code this}
         */
        public Builder preference(imports.k8s.NodeSelectorTerm preference) {
            this.preference = preference;
            return this;
        }

        /**
         * Sets the value of {@link PreferredSchedulingTerm#getWeight}
         * @param weight Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100. This parameter is required.
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PreferredSchedulingTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PreferredSchedulingTerm build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PreferredSchedulingTerm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PreferredSchedulingTerm {
        private final imports.k8s.NodeSelectorTerm preference;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.preference = software.amazon.jsii.Kernel.get(this, "preference", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelectorTerm.class));
            this.weight = software.amazon.jsii.Kernel.get(this, "weight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.preference = java.util.Objects.requireNonNull(builder.preference, "preference is required");
            this.weight = java.util.Objects.requireNonNull(builder.weight, "weight is required");
        }

        @Override
        public final imports.k8s.NodeSelectorTerm getPreference() {
            return this.preference;
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

            data.set("preference", om.valueToTree(this.getPreference()));
            data.set("weight", om.valueToTree(this.getWeight()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PreferredSchedulingTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PreferredSchedulingTerm.Jsii$Proxy that = (PreferredSchedulingTerm.Jsii$Proxy) o;

            if (!preference.equals(that.preference)) return false;
            return this.weight.equals(that.weight);
        }

        @Override
        public final int hashCode() {
            int result = this.preference.hashCode();
            result = 31 * result + (this.weight.hashCode());
            return result;
        }
    }
}
