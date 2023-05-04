package imports.k8s;

/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.765Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EndpointHints")
@software.amazon.jsii.Jsii.Proxy(EndpointHints.Jsii$Proxy.class)
public interface EndpointHints extends software.amazon.jsii.JsiiSerializable {

    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ForZone> getForZones() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointHints}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointHints}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EndpointHints> {
        java.util.List<imports.k8s.ForZone> forZones;

        /**
         * Sets the value of {@link EndpointHints#getForZones}
         * @param forZones forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder forZones(java.util.List<? extends imports.k8s.ForZone> forZones) {
            this.forZones = (java.util.List<imports.k8s.ForZone>)forZones;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointHints}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EndpointHints build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EndpointHints}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointHints {
        private final java.util.List<imports.k8s.ForZone> forZones;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.forZones = software.amazon.jsii.Kernel.get(this, "forZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ForZone.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.forZones = (java.util.List<imports.k8s.ForZone>)builder.forZones;
        }

        @Override
        public final java.util.List<imports.k8s.ForZone> getForZones() {
            return this.forZones;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getForZones() != null) {
                data.set("forZones", om.valueToTree(this.getForZones()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointHints"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointHints.Jsii$Proxy that = (EndpointHints.Jsii$Proxy) o;

            return this.forZones != null ? this.forZones.equals(that.forZones) : that.forZones == null;
        }

        @Override
        public final int hashCode() {
            int result = this.forZones != null ? this.forZones.hashCode() : 0;
            return result;
        }
    }
}
