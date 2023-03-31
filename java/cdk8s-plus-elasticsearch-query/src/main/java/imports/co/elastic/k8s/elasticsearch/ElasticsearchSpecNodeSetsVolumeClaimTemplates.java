package imports.co.elastic.k8s.elasticsearch;

/**
 * PersistentVolumeClaim is a user's request for and claim to a persistent volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.058Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecNodeSetsVolumeClaimTemplates.Jsii$Proxy.class)
public interface ElasticsearchSpecNodeSetsVolumeClaimTemplates extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIVersion defines the versioned schema of this representation of an object.
     * <p>
     * Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * Kind is a string value representing the REST resource this object represents.
     * <p>
     * Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMetadata() {
        return null;
    }

    /**
     * Spec defines the desired characteristics of a volume requested by a pod author.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec getSpec() {
        return null;
    }

    /**
     * Status represents the current information/status of a persistent volume claim.
     * <p>
     * Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecNodeSetsVolumeClaimTemplates> {
        java.lang.String apiVersion;
        java.lang.String kind;
        java.lang.Object metadata;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec spec;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus status;

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates#getApiVersion}
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object.
         *                   Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates#getKind}
         * @param kind Kind is a string value representing the REST resource this object represents.
         *             Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates#getSpec}
         * @param spec Spec defines the desired characteristics of a volume requested by a pod author.
         *             More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
         * @return {@code this}
         */
        public Builder spec(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates#getStatus}
         * @param status Status represents the current information/status of a persistent volume claim.
         *               Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
         * @return {@code this}
         */
        public Builder status(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecNodeSetsVolumeClaimTemplates build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplates}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecNodeSetsVolumeClaimTemplates {
        private final java.lang.String apiVersion;
        private final java.lang.String kind;
        private final java.lang.Object metadata;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec spec;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec.class));
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = builder.apiVersion;
            this.kind = builder.kind;
            this.metadata = builder.metadata;
            this.spec = builder.spec;
            this.status = builder.status;
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final java.lang.Object getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec getSpec() {
            return this.spec;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus getStatus() {
            return this.status;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }
            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecNodeSetsVolumeClaimTemplates.Jsii$Proxy that = (ElasticsearchSpecNodeSetsVolumeClaimTemplates.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.spec != null ? !this.spec.equals(that.spec) : that.spec != null) return false;
            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
            return result;
        }
    }
}
