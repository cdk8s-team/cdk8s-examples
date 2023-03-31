package imports.co.elastic.k8s.elasticsearch;

/**
 * Service defines the template for the associated Kubernetes Service object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.052Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecHttpService")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecHttpService.Jsii$Proxy.class)
public interface ElasticsearchSpecHttpService extends software.amazon.jsii.JsiiSerializable {

    /**
     * ObjectMeta is the metadata of the service.
     * <p>
     * The name and namespace provided here are managed by ECK and will be ignored.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMetadata() {
        return null;
    }

    /**
     * Spec is the specification of the service.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecHttpService}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecHttpService}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecHttpService> {
        java.lang.Object metadata;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpec spec;

        /**
         * Sets the value of {@link ElasticsearchSpecHttpService#getMetadata}
         * @param metadata ObjectMeta is the metadata of the service.
         *                 The name and namespace provided here are managed by ECK and will be ignored.
         * @return {@code this}
         */
        public Builder metadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecHttpService#getSpec}
         * @param spec Spec is the specification of the service.
         * @return {@code this}
         */
        public Builder spec(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecHttpService}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecHttpService build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecHttpService}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecHttpService {
        private final java.lang.Object metadata;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.spec = builder.spec;
        }

        @Override
        public final java.lang.Object getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttpServiceSpec getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecHttpService"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecHttpService.Jsii$Proxy that = (ElasticsearchSpecHttpService.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
