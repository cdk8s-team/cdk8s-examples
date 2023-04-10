package imports.co.elastic.k8s.kibana;

/**
 * KibanaSpec holds the specification of a Kibana instance.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:16.001Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.kibana.$Module.class, fqn = "coelastick8skibana.KibanaSpec")
@software.amazon.jsii.Jsii.Proxy(KibanaSpec.Jsii$Proxy.class)
public interface KibanaSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Version of Kibana.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVersion();

    /**
     * Config holds the Kibana configuration.
     * <p>
     * See: https://www.elastic.co/guide/en/kibana/current/settings.html
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getConfig() {
        return null;
    }

    /**
     * Count of Kibana instances to deploy.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * ElasticsearchRef is a reference to an Elasticsearch cluster running in the same Kubernetes cluster.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.kibana.KibanaSpecElasticsearchRef getElasticsearchRef() {
        return null;
    }

    /**
     * HTTP holds the HTTP layer configuration for Kibana.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.kibana.KibanaSpecHttp getHttp() {
        return null;
    }

    /**
     * Image is the Kibana Docker image to deploy.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImage() {
        return null;
    }

    /**
     * PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Kibana pods.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPodTemplate() {
        return null;
    }

    /**
     * SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Kibana.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings> getSecureSettings() {
        return null;
    }

    /**
     * ServiceAccountName is used to check access from the current resource to a resource (eg.
     * <p>
     * Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccountName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KibanaSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KibanaSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KibanaSpec> {
        java.lang.String version;
        java.lang.Object config;
        java.lang.Number count;
        imports.co.elastic.k8s.kibana.KibanaSpecElasticsearchRef elasticsearchRef;
        imports.co.elastic.k8s.kibana.KibanaSpecHttp http;
        java.lang.String image;
        java.lang.Object podTemplate;
        java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings> secureSettings;
        java.lang.String serviceAccountName;

        /**
         * Sets the value of {@link KibanaSpec#getVersion}
         * @param version Version of Kibana. This parameter is required.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getConfig}
         * @param config Config holds the Kibana configuration.
         *               See: https://www.elastic.co/guide/en/kibana/current/settings.html
         * @return {@code this}
         */
        public Builder config(java.lang.Object config) {
            this.config = config;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getCount}
         * @param count Count of Kibana instances to deploy.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getElasticsearchRef}
         * @param elasticsearchRef ElasticsearchRef is a reference to an Elasticsearch cluster running in the same Kubernetes cluster.
         * @return {@code this}
         */
        public Builder elasticsearchRef(imports.co.elastic.k8s.kibana.KibanaSpecElasticsearchRef elasticsearchRef) {
            this.elasticsearchRef = elasticsearchRef;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getHttp}
         * @param http HTTP holds the HTTP layer configuration for Kibana.
         * @return {@code this}
         */
        public Builder http(imports.co.elastic.k8s.kibana.KibanaSpecHttp http) {
            this.http = http;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getImage}
         * @param image Image is the Kibana Docker image to deploy.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getPodTemplate}
         * @param podTemplate PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Kibana pods.
         * @return {@code this}
         */
        public Builder podTemplate(java.lang.Object podTemplate) {
            this.podTemplate = podTemplate;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getSecureSettings}
         * @param secureSettings SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Kibana.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder secureSettings(java.util.List<? extends imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings> secureSettings) {
            this.secureSettings = (java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings>)secureSettings;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpec#getServiceAccountName}
         * @param serviceAccountName ServiceAccountName is used to check access from the current resource to a resource (eg.
         *                           Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
         * @return {@code this}
         */
        public Builder serviceAccountName(java.lang.String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KibanaSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KibanaSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KibanaSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KibanaSpec {
        private final java.lang.String version;
        private final java.lang.Object config;
        private final java.lang.Number count;
        private final imports.co.elastic.k8s.kibana.KibanaSpecElasticsearchRef elasticsearchRef;
        private final imports.co.elastic.k8s.kibana.KibanaSpecHttp http;
        private final java.lang.String image;
        private final java.lang.Object podTemplate;
        private final java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings> secureSettings;
        private final java.lang.String serviceAccountName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.config = software.amazon.jsii.Kernel.get(this, "config", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.elasticsearchRef = software.amazon.jsii.Kernel.get(this, "elasticsearchRef", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.kibana.KibanaSpecElasticsearchRef.class));
            this.http = software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.kibana.KibanaSpecHttp.class));
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.podTemplate = software.amazon.jsii.Kernel.get(this, "podTemplate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.secureSettings = software.amazon.jsii.Kernel.get(this, "secureSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings.class)));
            this.serviceAccountName = software.amazon.jsii.Kernel.get(this, "serviceAccountName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.version = java.util.Objects.requireNonNull(builder.version, "version is required");
            this.config = builder.config;
            this.count = builder.count;
            this.elasticsearchRef = builder.elasticsearchRef;
            this.http = builder.http;
            this.image = builder.image;
            this.podTemplate = builder.podTemplate;
            this.secureSettings = (java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings>)builder.secureSettings;
            this.serviceAccountName = builder.serviceAccountName;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public final java.lang.Object getConfig() {
            return this.config;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final imports.co.elastic.k8s.kibana.KibanaSpecElasticsearchRef getElasticsearchRef() {
            return this.elasticsearchRef;
        }

        @Override
        public final imports.co.elastic.k8s.kibana.KibanaSpecHttp getHttp() {
            return this.http;
        }

        @Override
        public final java.lang.String getImage() {
            return this.image;
        }

        @Override
        public final java.lang.Object getPodTemplate() {
            return this.podTemplate;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettings> getSecureSettings() {
            return this.secureSettings;
        }

        @Override
        public final java.lang.String getServiceAccountName() {
            return this.serviceAccountName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("version", om.valueToTree(this.getVersion()));
            if (this.getConfig() != null) {
                data.set("config", om.valueToTree(this.getConfig()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getElasticsearchRef() != null) {
                data.set("elasticsearchRef", om.valueToTree(this.getElasticsearchRef()));
            }
            if (this.getHttp() != null) {
                data.set("http", om.valueToTree(this.getHttp()));
            }
            if (this.getImage() != null) {
                data.set("image", om.valueToTree(this.getImage()));
            }
            if (this.getPodTemplate() != null) {
                data.set("podTemplate", om.valueToTree(this.getPodTemplate()));
            }
            if (this.getSecureSettings() != null) {
                data.set("secureSettings", om.valueToTree(this.getSecureSettings()));
            }
            if (this.getServiceAccountName() != null) {
                data.set("serviceAccountName", om.valueToTree(this.getServiceAccountName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8skibana.KibanaSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KibanaSpec.Jsii$Proxy that = (KibanaSpec.Jsii$Proxy) o;

            if (!version.equals(that.version)) return false;
            if (this.config != null ? !this.config.equals(that.config) : that.config != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.elasticsearchRef != null ? !this.elasticsearchRef.equals(that.elasticsearchRef) : that.elasticsearchRef != null) return false;
            if (this.http != null ? !this.http.equals(that.http) : that.http != null) return false;
            if (this.image != null ? !this.image.equals(that.image) : that.image != null) return false;
            if (this.podTemplate != null ? !this.podTemplate.equals(that.podTemplate) : that.podTemplate != null) return false;
            if (this.secureSettings != null ? !this.secureSettings.equals(that.secureSettings) : that.secureSettings != null) return false;
            return this.serviceAccountName != null ? this.serviceAccountName.equals(that.serviceAccountName) : that.serviceAccountName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.version.hashCode();
            result = 31 * result + (this.config != null ? this.config.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.elasticsearchRef != null ? this.elasticsearchRef.hashCode() : 0);
            result = 31 * result + (this.http != null ? this.http.hashCode() : 0);
            result = 31 * result + (this.image != null ? this.image.hashCode() : 0);
            result = 31 * result + (this.podTemplate != null ? this.podTemplate.hashCode() : 0);
            result = 31 * result + (this.secureSettings != null ? this.secureSettings.hashCode() : 0);
            result = 31 * result + (this.serviceAccountName != null ? this.serviceAccountName.hashCode() : 0);
            return result;
        }
    }
}
