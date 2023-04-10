package imports.co.elastic.k8s.elasticsearch;

/**
 * sessionAffinityConfig contains the configurations of session affinity.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.055Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfig")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecHttpServiceSpecSessionAffinityConfig.Jsii$Proxy.class)
public interface ElasticsearchSpecHttpServiceSpecSessionAffinityConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * clientIP contains the configurations of Client IP based session affinity.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp getClientIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecHttpServiceSpecSessionAffinityConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecHttpServiceSpecSessionAffinityConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecHttpServiceSpecSessionAffinityConfig> {
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp clientIp;

        /**
         * Sets the value of {@link ElasticsearchSpecHttpServiceSpecSessionAffinityConfig#getClientIp}
         * @param clientIp clientIP contains the configurations of Client IP based session affinity.
         * @return {@code this}
         */
        public Builder clientIp(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecHttpServiceSpecSessionAffinityConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecHttpServiceSpecSessionAffinityConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecHttpServiceSpecSessionAffinityConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecHttpServiceSpecSessionAffinityConfig {
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp clientIp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientIp = software.amazon.jsii.Kernel.get(this, "clientIp", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientIp = builder.clientIp;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp getClientIp() {
            return this.clientIp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientIp() != null) {
                data.set("clientIp", om.valueToTree(this.getClientIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecHttpServiceSpecSessionAffinityConfig.Jsii$Proxy that = (ElasticsearchSpecHttpServiceSpecSessionAffinityConfig.Jsii$Proxy) o;

            return this.clientIp != null ? this.clientIp.equals(that.clientIp) : that.clientIp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientIp != null ? this.clientIp.hashCode() : 0;
            return result;
        }
    }
}
