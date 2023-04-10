package imports.co.elastic.k8s.apm;

/**
 * HTTP holds the HTTP layer configuration for the APM Server resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:12.127Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.apm.$Module.class, fqn = "coelastick8sapm.ApmServerSpecHttp")
@software.amazon.jsii.Jsii.Proxy(ApmServerSpecHttp.Jsii$Proxy.class)
public interface ApmServerSpecHttp extends software.amazon.jsii.JsiiSerializable {

    /**
     * Service defines the template for the associated Kubernetes Service object.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.apm.ApmServerSpecHttpService getService() {
        return null;
    }

    /**
     * TLS defines options for configuring TLS for HTTP.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.apm.ApmServerSpecHttpTls getTls() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApmServerSpecHttp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApmServerSpecHttp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApmServerSpecHttp> {
        imports.co.elastic.k8s.apm.ApmServerSpecHttpService service;
        imports.co.elastic.k8s.apm.ApmServerSpecHttpTls tls;

        /**
         * Sets the value of {@link ApmServerSpecHttp#getService}
         * @param service Service defines the template for the associated Kubernetes Service object.
         * @return {@code this}
         */
        public Builder service(imports.co.elastic.k8s.apm.ApmServerSpecHttpService service) {
            this.service = service;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpecHttp#getTls}
         * @param tls TLS defines options for configuring TLS for HTTP.
         * @return {@code this}
         */
        public Builder tls(imports.co.elastic.k8s.apm.ApmServerSpecHttpTls tls) {
            this.tls = tls;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApmServerSpecHttp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApmServerSpecHttp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApmServerSpecHttp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApmServerSpecHttp {
        private final imports.co.elastic.k8s.apm.ApmServerSpecHttpService service;
        private final imports.co.elastic.k8s.apm.ApmServerSpecHttpTls tls;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.apm.ApmServerSpecHttpService.class));
            this.tls = software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.apm.ApmServerSpecHttpTls.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.service = builder.service;
            this.tls = builder.tls;
        }

        @Override
        public final imports.co.elastic.k8s.apm.ApmServerSpecHttpService getService() {
            return this.service;
        }

        @Override
        public final imports.co.elastic.k8s.apm.ApmServerSpecHttpTls getTls() {
            return this.tls;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }
            if (this.getTls() != null) {
                data.set("tls", om.valueToTree(this.getTls()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8sapm.ApmServerSpecHttp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApmServerSpecHttp.Jsii$Proxy that = (ApmServerSpecHttp.Jsii$Proxy) o;

            if (this.service != null ? !this.service.equals(that.service) : that.service != null) return false;
            return this.tls != null ? this.tls.equals(that.tls) : that.tls == null;
        }

        @Override
        public final int hashCode() {
            int result = this.service != null ? this.service.hashCode() : 0;
            result = 31 * result + (this.tls != null ? this.tls.hashCode() : 0);
            return result;
        }
    }
}
