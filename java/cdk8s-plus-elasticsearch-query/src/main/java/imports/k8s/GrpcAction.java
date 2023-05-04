package imports.k8s;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.772Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.GrpcAction")
@software.amazon.jsii.Jsii.Proxy(GrpcAction.Jsii$Proxy.class)
public interface GrpcAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Port number of the gRPC service.
     * <p>
     * Number must be in the range 1 to 65535.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPort();

    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * <p>
     * If this is not specified, the default behavior is defined by gRPC.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getService() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GrpcAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GrpcAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GrpcAction> {
        java.lang.Number port;
        java.lang.String service;

        /**
         * Sets the value of {@link GrpcAction#getPort}
         * @param port Port number of the gRPC service. This parameter is required.
         *             Number must be in the range 1 to 65535.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link GrpcAction#getService}
         * @param service Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
         *                If this is not specified, the default behavior is defined by gRPC.
         * @return {@code this}
         */
        public Builder service(java.lang.String service) {
            this.service = service;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GrpcAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GrpcAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GrpcAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GrpcAction {
        private final java.lang.Number port;
        private final java.lang.String service;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(builder.port, "port is required");
            this.service = builder.service;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getService() {
            return this.service;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.GrpcAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GrpcAction.Jsii$Proxy that = (GrpcAction.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            return this.service != null ? this.service.equals(that.service) : that.service == null;
        }

        @Override
        public final int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            return result;
        }
    }
}
