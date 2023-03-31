package imports.co.elastic.k8s.elasticsearch;

/**
 * NodeSet is the specification for a group of Elasticsearch nodes sharing the same configuration and a Pod template.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.057Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecNodeSets")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecNodeSets.Jsii$Proxy.class)
public interface ElasticsearchSpecNodeSets extends software.amazon.jsii.JsiiSerializable {

    /**
     * Count of Elasticsearch nodes to deploy.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getCount();

    /**
     * Name of this set of nodes.
     * <p>
     * Becomes a part of the Elasticsearch node.name setting.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Config holds the Elasticsearch configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getConfig() {
        return null;
    }

    /**
     * PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Pods belonging to this NodeSet.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPodTemplate() {
        return null;
    }

    /**
     * VolumeClaimTemplates is a list of persistent volume claims to be used by each Pod in this NodeSet.
     * <p>
     * Every claim in this list must have a matching volumeMount in one of the containers defined in the PodTemplate. Items defined here take precedence over any default claims added by the operator with the same name. See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-volume-claim-templates.html
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates> getVolumeClaimTemplates() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecNodeSets}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecNodeSets}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecNodeSets> {
        java.lang.Number count;
        java.lang.String name;
        java.lang.Object config;
        java.lang.Object podTemplate;
        java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates> volumeClaimTemplates;

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSets#getCount}
         * @param count Count of Elasticsearch nodes to deploy. This parameter is required.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSets#getName}
         * @param name Name of this set of nodes. This parameter is required.
         *             Becomes a part of the Elasticsearch node.name setting.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSets#getConfig}
         * @param config Config holds the Elasticsearch configuration.
         * @return {@code this}
         */
        public Builder config(java.lang.Object config) {
            this.config = config;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSets#getPodTemplate}
         * @param podTemplate PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Pods belonging to this NodeSet.
         * @return {@code this}
         */
        public Builder podTemplate(java.lang.Object podTemplate) {
            this.podTemplate = podTemplate;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSets#getVolumeClaimTemplates}
         * @param volumeClaimTemplates VolumeClaimTemplates is a list of persistent volume claims to be used by each Pod in this NodeSet.
         *                             Every claim in this list must have a matching volumeMount in one of the containers defined in the PodTemplate. Items defined here take precedence over any default claims added by the operator with the same name. See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-volume-claim-templates.html
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volumeClaimTemplates(java.util.List<? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates> volumeClaimTemplates) {
            this.volumeClaimTemplates = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates>)volumeClaimTemplates;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecNodeSets}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecNodeSets build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecNodeSets}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecNodeSets {
        private final java.lang.Number count;
        private final java.lang.String name;
        private final java.lang.Object config;
        private final java.lang.Object podTemplate;
        private final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates> volumeClaimTemplates;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.config = software.amazon.jsii.Kernel.get(this, "config", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.podTemplate = software.amazon.jsii.Kernel.get(this, "podTemplate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.volumeClaimTemplates = software.amazon.jsii.Kernel.get(this, "volumeClaimTemplates", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = java.util.Objects.requireNonNull(builder.count, "count is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.config = builder.config;
            this.podTemplate = builder.podTemplate;
            this.volumeClaimTemplates = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates>)builder.volumeClaimTemplates;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getConfig() {
            return this.config;
        }

        @Override
        public final java.lang.Object getPodTemplate() {
            return this.podTemplate;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates> getVolumeClaimTemplates() {
            return this.volumeClaimTemplates;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("count", om.valueToTree(this.getCount()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getConfig() != null) {
                data.set("config", om.valueToTree(this.getConfig()));
            }
            if (this.getPodTemplate() != null) {
                data.set("podTemplate", om.valueToTree(this.getPodTemplate()));
            }
            if (this.getVolumeClaimTemplates() != null) {
                data.set("volumeClaimTemplates", om.valueToTree(this.getVolumeClaimTemplates()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecNodeSets"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecNodeSets.Jsii$Proxy that = (ElasticsearchSpecNodeSets.Jsii$Proxy) o;

            if (!count.equals(that.count)) return false;
            if (!name.equals(that.name)) return false;
            if (this.config != null ? !this.config.equals(that.config) : that.config != null) return false;
            if (this.podTemplate != null ? !this.podTemplate.equals(that.podTemplate) : that.podTemplate != null) return false;
            return this.volumeClaimTemplates != null ? this.volumeClaimTemplates.equals(that.volumeClaimTemplates) : that.volumeClaimTemplates == null;
        }

        @Override
        public final int hashCode() {
            int result = this.count.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.config != null ? this.config.hashCode() : 0);
            result = 31 * result + (this.podTemplate != null ? this.podTemplate.hashCode() : 0);
            result = 31 * result + (this.volumeClaimTemplates != null ? this.volumeClaimTemplates.hashCode() : 0);
            return result;
        }
    }
}
