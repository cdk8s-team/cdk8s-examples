package imports.co.elastic.k8s.elasticsearch;

/**
 * UpdateStrategy specifies how updates to the cluster should be performed.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.065Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecUpdateStrategy")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecUpdateStrategy.Jsii$Proxy.class)
public interface ElasticsearchSpecUpdateStrategy extends software.amazon.jsii.JsiiSerializable {

    /**
     * ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget getChangeBudget() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecUpdateStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecUpdateStrategy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecUpdateStrategy> {
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget changeBudget;

        /**
         * Sets the value of {@link ElasticsearchSpecUpdateStrategy#getChangeBudget}
         * @param changeBudget ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.
         * @return {@code this}
         */
        public Builder changeBudget(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget changeBudget) {
            this.changeBudget = changeBudget;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecUpdateStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecUpdateStrategy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecUpdateStrategy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecUpdateStrategy {
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget changeBudget;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.changeBudget = software.amazon.jsii.Kernel.get(this, "changeBudget", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.changeBudget = builder.changeBudget;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget getChangeBudget() {
            return this.changeBudget;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getChangeBudget() != null) {
                data.set("changeBudget", om.valueToTree(this.getChangeBudget()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecUpdateStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecUpdateStrategy.Jsii$Proxy that = (ElasticsearchSpecUpdateStrategy.Jsii$Proxy) o;

            return this.changeBudget != null ? this.changeBudget.equals(that.changeBudget) : that.changeBudget == null;
        }

        @Override
        public final int hashCode() {
            int result = this.changeBudget != null ? this.changeBudget.hashCode() : 0;
            return result;
        }
    }
}
