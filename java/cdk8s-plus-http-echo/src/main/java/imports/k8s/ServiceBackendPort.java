package imports.k8s;

/**
 * ServiceBackendPort is the service port being referenced.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.949Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceBackendPort")
@software.amazon.jsii.Jsii.Proxy(ServiceBackendPort.Jsii$Proxy.class)
public interface ServiceBackendPort extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the name of the port on the Service.
     * <p>
     * This is a mutually exclusive setting with "Number".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name".
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumber() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceBackendPort}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceBackendPort}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceBackendPort> {
        java.lang.String name;
        java.lang.Number number;

        /**
         * Sets the value of {@link ServiceBackendPort#getName}
         * @param name Name is the name of the port on the Service.
         *             This is a mutually exclusive setting with "Number".
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ServiceBackendPort#getNumber}
         * @param number Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name".
         * @return {@code this}
         */
        public Builder number(java.lang.Number number) {
            this.number = number;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceBackendPort}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceBackendPort build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceBackendPort}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceBackendPort {
        private final java.lang.String name;
        private final java.lang.Number number;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.number = software.amazon.jsii.Kernel.get(this, "number", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
            this.number = builder.number;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getNumber() {
            return this.number;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNumber() != null) {
                data.set("number", om.valueToTree(this.getNumber()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceBackendPort"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceBackendPort.Jsii$Proxy that = (ServiceBackendPort.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.number != null ? this.number.equals(that.number) : that.number == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.number != null ? this.number.hashCode() : 0);
            return result;
        }
    }
}
