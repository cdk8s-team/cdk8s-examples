package imports.k8s;

/**
 * IngressBackend describes all endpoints for a given service and port.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.773Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IngressBackend")
@software.amazon.jsii.Jsii.Proxy(IngressBackend.Jsii$Proxy.class)
public interface IngressBackend extends software.amazon.jsii.JsiiSerializable {

    /**
     * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object.
     * <p>
     * If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.TypedLocalObjectReference getResource() {
        return null;
    }

    /**
     * Service references a Service as a Backend.
     * <p>
     * This is a mutually exclusive setting with "Resource".
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IngressServiceBackend getService() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressBackend}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressBackend}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressBackend> {
        imports.k8s.TypedLocalObjectReference resource;
        imports.k8s.IngressServiceBackend service;

        /**
         * Sets the value of {@link IngressBackend#getResource}
         * @param resource Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object.
         *                 If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
         * @return {@code this}
         */
        public Builder resource(imports.k8s.TypedLocalObjectReference resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link IngressBackend#getService}
         * @param service Service references a Service as a Backend.
         *                This is a mutually exclusive setting with "Resource".
         * @return {@code this}
         */
        public Builder service(imports.k8s.IngressServiceBackend service) {
            this.service = service;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressBackend}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressBackend build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressBackend}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressBackend {
        private final imports.k8s.TypedLocalObjectReference resource;
        private final imports.k8s.IngressServiceBackend service;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.k8s.TypedLocalObjectReference.class));
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.k8s.IngressServiceBackend.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resource = builder.resource;
            this.service = builder.service;
        }

        @Override
        public final imports.k8s.TypedLocalObjectReference getResource() {
            return this.resource;
        }

        @Override
        public final imports.k8s.IngressServiceBackend getService() {
            return this.service;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressBackend"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressBackend.Jsii$Proxy that = (IngressBackend.Jsii$Proxy) o;

            if (this.resource != null ? !this.resource.equals(that.resource) : that.resource != null) return false;
            return this.service != null ? this.service.equals(that.service) : that.service == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resource != null ? this.resource.hashCode() : 0;
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            return result;
        }
    }
}
