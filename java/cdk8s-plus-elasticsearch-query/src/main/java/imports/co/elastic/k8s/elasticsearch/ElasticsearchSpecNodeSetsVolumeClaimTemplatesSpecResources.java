package imports.co.elastic.k8s.elasticsearch;

/**
 * Resources represents the minimum resources the volume should have.
 * <p>
 * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.059Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources.Jsii$Proxy.class)
public interface ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources extends software.amazon.jsii.JsiiSerializable {

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits> getLimits() {
        return null;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * <p>
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests> getRequests() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources> {
        java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits> limits;
        java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests> requests;

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources#getLimits}
         * @param limits Limits describes the maximum amount of compute resources allowed.
         *               More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder limits(java.util.Map<java.lang.String, ? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits> limits) {
            this.limits = (java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits>)limits;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources#getRequests}
         * @param requests Requests describes the minimum amount of compute resources required.
         *                 If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requests(java.util.Map<java.lang.String, ? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests> requests) {
            this.requests = (java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests>)requests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources {
        private final java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits> limits;
        private final java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests> requests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limits = software.amazon.jsii.Kernel.get(this, "limits", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits.class)));
            this.requests = software.amazon.jsii.Kernel.get(this, "requests", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limits = (java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits>)builder.limits;
            this.requests = (java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests>)builder.requests;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits> getLimits() {
            return this.limits;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests> getRequests() {
            return this.requests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLimits() != null) {
                data.set("limits", om.valueToTree(this.getLimits()));
            }
            if (this.getRequests() != null) {
                data.set("requests", om.valueToTree(this.getRequests()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources.Jsii$Proxy that = (ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources.Jsii$Proxy) o;

            if (this.limits != null ? !this.limits.equals(that.limits) : that.limits != null) return false;
            return this.requests != null ? this.requests.equals(that.requests) : that.requests == null;
        }

        @Override
        public final int hashCode() {
            int result = this.limits != null ? this.limits.hashCode() : 0;
            result = 31 * result + (this.requests != null ? this.requests.hashCode() : 0);
            return result;
        }
    }
}
