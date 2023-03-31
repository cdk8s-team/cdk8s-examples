package imports.co.elastic.k8s.elasticsearch;

/**
 * ElasticsearchSpec holds the specification of an Elasticsearch cluster.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.050Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpec")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpec.Jsii$Proxy.class)
public interface ElasticsearchSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * NodeSets allow specifying groups of Elasticsearch nodes sharing the same configuration and Pod templates.
     * <p>
     * See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-orchestration.html
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets> getNodeSets();

    /**
     * Version of Elasticsearch.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVersion();

    /**
     * Auth contains user authentication and authorization security settings for Elasticsearch.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuth getAuth() {
        return null;
    }

    /**
     * HTTP holds HTTP layer settings for Elasticsearch.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttp getHttp() {
        return null;
    }

    /**
     * Image is the Elasticsearch Docker image to deploy.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImage() {
        return null;
    }

    /**
     * PodDisruptionBudget provides access to the default pod disruption budget for the Elasticsearch cluster.
     * <p>
     * The default budget selects all cluster pods and sets <code>maxUnavailable</code> to 1. To disable, set <code>PodDisruptionBudget</code> to the empty value (<code>{}</code> in YAML).
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudget getPodDisruptionBudget() {
        return null;
    }

    /**
     * RemoteClusters enables you to establish uni-directional connections to a remote Elasticsearch cluster.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters> getRemoteClusters() {
        return null;
    }

    /**
     * SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Elasticsearch.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings> getSecureSettings() {
        return null;
    }

    /**
     * ServiceAccountName is used to check access from the current resource to a resource (eg.
     * <p>
     * a remote Elasticsearch cluster) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccountName() {
        return null;
    }

    /**
     * Transport holds transport layer settings for Elasticsearch.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransport getTransport() {
        return null;
    }

    /**
     * UpdateStrategy specifies how updates to the cluster should be performed.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategy getUpdateStrategy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpec> {
        java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets> nodeSets;
        java.lang.String version;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuth auth;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttp http;
        java.lang.String image;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudget podDisruptionBudget;
        java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters> remoteClusters;
        java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings> secureSettings;
        java.lang.String serviceAccountName;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransport transport;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategy updateStrategy;

        /**
         * Sets the value of {@link ElasticsearchSpec#getNodeSets}
         * @param nodeSets NodeSets allow specifying groups of Elasticsearch nodes sharing the same configuration and Pod templates. This parameter is required.
         *                 See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-orchestration.html
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder nodeSets(java.util.List<? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets> nodeSets) {
            this.nodeSets = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets>)nodeSets;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getVersion}
         * @param version Version of Elasticsearch. This parameter is required.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getAuth}
         * @param auth Auth contains user authentication and authorization security settings for Elasticsearch.
         * @return {@code this}
         */
        public Builder auth(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuth auth) {
            this.auth = auth;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getHttp}
         * @param http HTTP holds HTTP layer settings for Elasticsearch.
         * @return {@code this}
         */
        public Builder http(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttp http) {
            this.http = http;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getImage}
         * @param image Image is the Elasticsearch Docker image to deploy.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getPodDisruptionBudget}
         * @param podDisruptionBudget PodDisruptionBudget provides access to the default pod disruption budget for the Elasticsearch cluster.
         *                            The default budget selects all cluster pods and sets <code>maxUnavailable</code> to 1. To disable, set <code>PodDisruptionBudget</code> to the empty value (<code>{}</code> in YAML).
         * @return {@code this}
         */
        public Builder podDisruptionBudget(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudget podDisruptionBudget) {
            this.podDisruptionBudget = podDisruptionBudget;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getRemoteClusters}
         * @param remoteClusters RemoteClusters enables you to establish uni-directional connections to a remote Elasticsearch cluster.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder remoteClusters(java.util.List<? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters> remoteClusters) {
            this.remoteClusters = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters>)remoteClusters;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getSecureSettings}
         * @param secureSettings SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Elasticsearch.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder secureSettings(java.util.List<? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings> secureSettings) {
            this.secureSettings = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings>)secureSettings;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getServiceAccountName}
         * @param serviceAccountName ServiceAccountName is used to check access from the current resource to a resource (eg.
         *                           a remote Elasticsearch cluster) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
         * @return {@code this}
         */
        public Builder serviceAccountName(java.lang.String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getTransport}
         * @param transport Transport holds transport layer settings for Elasticsearch.
         * @return {@code this}
         */
        public Builder transport(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransport transport) {
            this.transport = transport;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpec#getUpdateStrategy}
         * @param updateStrategy UpdateStrategy specifies how updates to the cluster should be performed.
         * @return {@code this}
         */
        public Builder updateStrategy(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpec {
        private final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets> nodeSets;
        private final java.lang.String version;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuth auth;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttp http;
        private final java.lang.String image;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudget podDisruptionBudget;
        private final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters> remoteClusters;
        private final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings> secureSettings;
        private final java.lang.String serviceAccountName;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransport transport;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategy updateStrategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeSets = software.amazon.jsii.Kernel.get(this, "nodeSets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets.class)));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.auth = software.amazon.jsii.Kernel.get(this, "auth", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuth.class));
            this.http = software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttp.class));
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.podDisruptionBudget = software.amazon.jsii.Kernel.get(this, "podDisruptionBudget", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudget.class));
            this.remoteClusters = software.amazon.jsii.Kernel.get(this, "remoteClusters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters.class)));
            this.secureSettings = software.amazon.jsii.Kernel.get(this, "secureSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings.class)));
            this.serviceAccountName = software.amazon.jsii.Kernel.get(this, "serviceAccountName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.transport = software.amazon.jsii.Kernel.get(this, "transport", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransport.class));
            this.updateStrategy = software.amazon.jsii.Kernel.get(this, "updateStrategy", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategy.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeSets = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets>)java.util.Objects.requireNonNull(builder.nodeSets, "nodeSets is required");
            this.version = java.util.Objects.requireNonNull(builder.version, "version is required");
            this.auth = builder.auth;
            this.http = builder.http;
            this.image = builder.image;
            this.podDisruptionBudget = builder.podDisruptionBudget;
            this.remoteClusters = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters>)builder.remoteClusters;
            this.secureSettings = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings>)builder.secureSettings;
            this.serviceAccountName = builder.serviceAccountName;
            this.transport = builder.transport;
            this.updateStrategy = builder.updateStrategy;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSets> getNodeSets() {
            return this.nodeSets;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuth getAuth() {
            return this.auth;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecHttp getHttp() {
            return this.http;
        }

        @Override
        public final java.lang.String getImage() {
            return this.image;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudget getPodDisruptionBudget() {
            return this.podDisruptionBudget;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecRemoteClusters> getRemoteClusters() {
            return this.remoteClusters;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecSecureSettings> getSecureSettings() {
            return this.secureSettings;
        }

        @Override
        public final java.lang.String getServiceAccountName() {
            return this.serviceAccountName;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecTransport getTransport() {
            return this.transport;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecUpdateStrategy getUpdateStrategy() {
            return this.updateStrategy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("nodeSets", om.valueToTree(this.getNodeSets()));
            data.set("version", om.valueToTree(this.getVersion()));
            if (this.getAuth() != null) {
                data.set("auth", om.valueToTree(this.getAuth()));
            }
            if (this.getHttp() != null) {
                data.set("http", om.valueToTree(this.getHttp()));
            }
            if (this.getImage() != null) {
                data.set("image", om.valueToTree(this.getImage()));
            }
            if (this.getPodDisruptionBudget() != null) {
                data.set("podDisruptionBudget", om.valueToTree(this.getPodDisruptionBudget()));
            }
            if (this.getRemoteClusters() != null) {
                data.set("remoteClusters", om.valueToTree(this.getRemoteClusters()));
            }
            if (this.getSecureSettings() != null) {
                data.set("secureSettings", om.valueToTree(this.getSecureSettings()));
            }
            if (this.getServiceAccountName() != null) {
                data.set("serviceAccountName", om.valueToTree(this.getServiceAccountName()));
            }
            if (this.getTransport() != null) {
                data.set("transport", om.valueToTree(this.getTransport()));
            }
            if (this.getUpdateStrategy() != null) {
                data.set("updateStrategy", om.valueToTree(this.getUpdateStrategy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpec.Jsii$Proxy that = (ElasticsearchSpec.Jsii$Proxy) o;

            if (!nodeSets.equals(that.nodeSets)) return false;
            if (!version.equals(that.version)) return false;
            if (this.auth != null ? !this.auth.equals(that.auth) : that.auth != null) return false;
            if (this.http != null ? !this.http.equals(that.http) : that.http != null) return false;
            if (this.image != null ? !this.image.equals(that.image) : that.image != null) return false;
            if (this.podDisruptionBudget != null ? !this.podDisruptionBudget.equals(that.podDisruptionBudget) : that.podDisruptionBudget != null) return false;
            if (this.remoteClusters != null ? !this.remoteClusters.equals(that.remoteClusters) : that.remoteClusters != null) return false;
            if (this.secureSettings != null ? !this.secureSettings.equals(that.secureSettings) : that.secureSettings != null) return false;
            if (this.serviceAccountName != null ? !this.serviceAccountName.equals(that.serviceAccountName) : that.serviceAccountName != null) return false;
            if (this.transport != null ? !this.transport.equals(that.transport) : that.transport != null) return false;
            return this.updateStrategy != null ? this.updateStrategy.equals(that.updateStrategy) : that.updateStrategy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.nodeSets.hashCode();
            result = 31 * result + (this.version.hashCode());
            result = 31 * result + (this.auth != null ? this.auth.hashCode() : 0);
            result = 31 * result + (this.http != null ? this.http.hashCode() : 0);
            result = 31 * result + (this.image != null ? this.image.hashCode() : 0);
            result = 31 * result + (this.podDisruptionBudget != null ? this.podDisruptionBudget.hashCode() : 0);
            result = 31 * result + (this.remoteClusters != null ? this.remoteClusters.hashCode() : 0);
            result = 31 * result + (this.secureSettings != null ? this.secureSettings.hashCode() : 0);
            result = 31 * result + (this.serviceAccountName != null ? this.serviceAccountName.hashCode() : 0);
            result = 31 * result + (this.transport != null ? this.transport.hashCode() : 0);
            result = 31 * result + (this.updateStrategy != null ? this.updateStrategy.hashCode() : 0);
            return result;
        }
    }
}
