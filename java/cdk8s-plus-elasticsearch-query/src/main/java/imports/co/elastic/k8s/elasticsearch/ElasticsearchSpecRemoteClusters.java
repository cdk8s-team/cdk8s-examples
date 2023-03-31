package imports.co.elastic.k8s.elasticsearch;

/**
 * RemoteCluster declares a remote Elasticsearch cluster connection.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.062Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecRemoteClusters")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecRemoteClusters.Jsii$Proxy.class)
public interface ElasticsearchSpecRemoteClusters extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the name of the remote cluster as it is set in the Elasticsearch settings.
     * <p>
     * The name is expected to be unique for each remote clusters.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * ElasticsearchRef is a reference to an Elasticsearch cluster running within the same k8s cluster.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClustersElasticsearchRef getElasticsearchRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecRemoteClusters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecRemoteClusters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecRemoteClusters> {
        java.lang.String name;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClustersElasticsearchRef elasticsearchRef;

        /**
         * Sets the value of {@link ElasticsearchSpecRemoteClusters#getName}
         * @param name Name is the name of the remote cluster as it is set in the Elasticsearch settings. This parameter is required.
         *             The name is expected to be unique for each remote clusters.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecRemoteClusters#getElasticsearchRef}
         * @param elasticsearchRef ElasticsearchRef is a reference to an Elasticsearch cluster running within the same k8s cluster.
         * @return {@code this}
         */
        public Builder elasticsearchRef(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClustersElasticsearchRef elasticsearchRef) {
            this.elasticsearchRef = elasticsearchRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecRemoteClusters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecRemoteClusters build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecRemoteClusters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecRemoteClusters {
        private final java.lang.String name;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClustersElasticsearchRef elasticsearchRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.elasticsearchRef = software.amazon.jsii.Kernel.get(this, "elasticsearchRef", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClustersElasticsearchRef.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.elasticsearchRef = builder.elasticsearchRef;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClustersElasticsearchRef getElasticsearchRef() {
            return this.elasticsearchRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getElasticsearchRef() != null) {
                data.set("elasticsearchRef", om.valueToTree(this.getElasticsearchRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecRemoteClusters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecRemoteClusters.Jsii$Proxy that = (ElasticsearchSpecRemoteClusters.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.elasticsearchRef != null ? this.elasticsearchRef.equals(that.elasticsearchRef) : that.elasticsearchRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.elasticsearchRef != null ? this.elasticsearchRef.hashCode() : 0);
            return result;
        }
    }
}
