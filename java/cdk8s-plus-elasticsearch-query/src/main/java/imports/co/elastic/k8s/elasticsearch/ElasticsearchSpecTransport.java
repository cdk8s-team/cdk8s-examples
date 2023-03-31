package imports.co.elastic.k8s.elasticsearch;

/**
 * Transport holds transport layer settings for Elasticsearch.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.063Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecTransport")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecTransport.Jsii$Proxy.class)
public interface ElasticsearchSpecTransport extends software.amazon.jsii.JsiiSerializable {

    /**
     * Service defines the template for the associated Kubernetes Service object.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransportService getService() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecTransport}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecTransport}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecTransport> {
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransportService service;

        /**
         * Sets the value of {@link ElasticsearchSpecTransport#getService}
         * @param service Service defines the template for the associated Kubernetes Service object.
         * @return {@code this}
         */
        public Builder service(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransportService service) {
            this.service = service;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecTransport}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecTransport build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecTransport}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecTransport {
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransportService service;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransportService.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.service = builder.service;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransportService getService() {
            return this.service;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecTransport"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecTransport.Jsii$Proxy that = (ElasticsearchSpecTransport.Jsii$Proxy) o;

            return this.service != null ? this.service.equals(that.service) : that.service == null;
        }

        @Override
        public final int hashCode() {
            int result = this.service != null ? this.service.hashCode() : 0;
            return result;
        }
    }
}
