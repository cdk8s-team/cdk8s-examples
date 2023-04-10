package imports.co.elastic.k8s.elasticsearch;

/**
 * HTTP holds HTTP layer settings for Elasticsearch.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.052Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecHttp")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecHttp.Jsii$Proxy.class)
public interface ElasticsearchSpecHttp extends software.amazon.jsii.JsiiSerializable {

    /**
     * Service defines the template for the associated Kubernetes Service object.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpService getService() {
        return null;
    }

    /**
     * TLS defines options for configuring TLS for HTTP.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpTls getTls() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecHttp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecHttp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecHttp> {
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpService service;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpTls tls;

        /**
         * Sets the value of {@link ElasticsearchSpecHttp#getService}
         * @param service Service defines the template for the associated Kubernetes Service object.
         * @return {@code this}
         */
        public Builder service(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpService service) {
            this.service = service;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecHttp#getTls}
         * @param tls TLS defines options for configuring TLS for HTTP.
         * @return {@code this}
         */
        public Builder tls(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpTls tls) {
            this.tls = tls;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecHttp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecHttp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecHttp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecHttp {
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpService service;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpTls tls;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpService.class));
            this.tls = software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpTls.class));
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
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpService getService() {
            return this.service;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpTls getTls() {
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
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecHttp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecHttp.Jsii$Proxy that = (ElasticsearchSpecHttp.Jsii$Proxy) o;

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
