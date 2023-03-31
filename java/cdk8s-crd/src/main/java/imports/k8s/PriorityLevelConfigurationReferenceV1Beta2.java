package imports.k8s;

/**
 * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.942Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PriorityLevelConfigurationReferenceV1Beta2")
@software.amazon.jsii.Jsii.Proxy(PriorityLevelConfigurationReferenceV1Beta2.Jsii$Proxy.class)
public interface PriorityLevelConfigurationReferenceV1Beta2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * `name` is the name of the priority level configuration being referenced Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link PriorityLevelConfigurationReferenceV1Beta2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PriorityLevelConfigurationReferenceV1Beta2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PriorityLevelConfigurationReferenceV1Beta2> {
        java.lang.String name;

        /**
         * Sets the value of {@link PriorityLevelConfigurationReferenceV1Beta2#getName}
         * @param name `name` is the name of the priority level configuration being referenced Required. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PriorityLevelConfigurationReferenceV1Beta2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PriorityLevelConfigurationReferenceV1Beta2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PriorityLevelConfigurationReferenceV1Beta2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PriorityLevelConfigurationReferenceV1Beta2 {
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PriorityLevelConfigurationReferenceV1Beta2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PriorityLevelConfigurationReferenceV1Beta2.Jsii$Proxy that = (PriorityLevelConfigurationReferenceV1Beta2.Jsii$Proxy) o;

            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            return result;
        }
    }
}
