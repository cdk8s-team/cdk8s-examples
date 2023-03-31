package imports.k8s;

/**
 * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.942Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PriorityLevelConfigurationSpecV1Beta2")
@software.amazon.jsii.Jsii.Proxy(PriorityLevelConfigurationSpecV1Beta2.Jsii$Proxy.class)
public interface PriorityLevelConfigurationSpecV1Beta2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * `type` indicates whether this priority level is subject to limitation on request execution.
     * <p>
     * A value of <code>"Exempt"</code> means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of <code>"Limited"</code> means that (a) requests of this priority level <em>are</em> subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * `limited` specifies how requests are handled for a Limited priority level.
     * <p>
     * This field must be non-empty if and only if <code>type</code> is <code>"Limited"</code>.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LimitedPriorityLevelConfigurationV1Beta2 getLimited() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PriorityLevelConfigurationSpecV1Beta2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PriorityLevelConfigurationSpecV1Beta2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PriorityLevelConfigurationSpecV1Beta2> {
        java.lang.String type;
        imports.k8s.LimitedPriorityLevelConfigurationV1Beta2 limited;

        /**
         * Sets the value of {@link PriorityLevelConfigurationSpecV1Beta2#getType}
         * @param type `type` indicates whether this priority level is subject to limitation on request execution. This parameter is required.
         *             A value of <code>"Exempt"</code> means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of <code>"Limited"</code> means that (a) requests of this priority level <em>are</em> subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link PriorityLevelConfigurationSpecV1Beta2#getLimited}
         * @param limited `limited` specifies how requests are handled for a Limited priority level.
         *                This field must be non-empty if and only if <code>type</code> is <code>"Limited"</code>.
         * @return {@code this}
         */
        public Builder limited(imports.k8s.LimitedPriorityLevelConfigurationV1Beta2 limited) {
            this.limited = limited;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PriorityLevelConfigurationSpecV1Beta2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PriorityLevelConfigurationSpecV1Beta2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PriorityLevelConfigurationSpecV1Beta2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PriorityLevelConfigurationSpecV1Beta2 {
        private final java.lang.String type;
        private final imports.k8s.LimitedPriorityLevelConfigurationV1Beta2 limited;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limited = software.amazon.jsii.Kernel.get(this, "limited", software.amazon.jsii.NativeType.forClass(imports.k8s.LimitedPriorityLevelConfigurationV1Beta2.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.limited = builder.limited;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.k8s.LimitedPriorityLevelConfigurationV1Beta2 getLimited() {
            return this.limited;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getLimited() != null) {
                data.set("limited", om.valueToTree(this.getLimited()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PriorityLevelConfigurationSpecV1Beta2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PriorityLevelConfigurationSpecV1Beta2.Jsii$Proxy that = (PriorityLevelConfigurationSpecV1Beta2.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.limited != null ? this.limited.equals(that.limited) : that.limited == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.limited != null ? this.limited.hashCode() : 0);
            return result;
        }
    }
}
