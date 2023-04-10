package imports.k8s;

/**
 * CSINodeSpec holds information about the specification of all CSI drivers installed on a node.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.828Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiNodeSpec")
@software.amazon.jsii.Jsii.Proxy(CsiNodeSpec.Jsii$Proxy.class)
public interface CsiNodeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * drivers is a list of information of all CSI Drivers existing on a node.
     * <p>
     * If all drivers in the list are uninstalled, this can become empty.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.CsiNodeDriver> getDrivers();

    /**
     * @return a {@link Builder} of {@link CsiNodeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiNodeSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiNodeSpec> {
        java.util.List<imports.k8s.CsiNodeDriver> drivers;

        /**
         * Sets the value of {@link CsiNodeSpec#getDrivers}
         * @param drivers drivers is a list of information of all CSI Drivers existing on a node. This parameter is required.
         *                If all drivers in the list are uninstalled, this can become empty.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder drivers(java.util.List<? extends imports.k8s.CsiNodeDriver> drivers) {
            this.drivers = (java.util.List<imports.k8s.CsiNodeDriver>)drivers;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiNodeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiNodeSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CsiNodeSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiNodeSpec {
        private final java.util.List<imports.k8s.CsiNodeDriver> drivers;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.drivers = software.amazon.jsii.Kernel.get(this, "drivers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.CsiNodeDriver.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.drivers = (java.util.List<imports.k8s.CsiNodeDriver>)java.util.Objects.requireNonNull(builder.drivers, "drivers is required");
        }

        @Override
        public final java.util.List<imports.k8s.CsiNodeDriver> getDrivers() {
            return this.drivers;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("drivers", om.valueToTree(this.getDrivers()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CsiNodeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiNodeSpec.Jsii$Proxy that = (CsiNodeSpec.Jsii$Proxy) o;

            return this.drivers.equals(that.drivers);
        }

        @Override
        public final int hashCode() {
            int result = this.drivers.hashCode();
            return result;
        }
    }
}
