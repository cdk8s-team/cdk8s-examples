package imports.co.elastic.k8s.apm;

/**
 * ApmServerSpec holds the specification of an APM Server.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:12.126Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.apm.$Module.class, fqn = "coelastick8sapm.ApmServerSpec")
@software.amazon.jsii.Jsii.Proxy(ApmServerSpec.Jsii$Proxy.class)
public interface ApmServerSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Version of the APM Server.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVersion();

    /**
     * Config holds the APM Server configuration.
     * <p>
     * See: https://www.elastic.co/guide/en/apm/server/current/configuring-howto-apm-server.html
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getConfig() {
        return null;
    }

    /**
     * Count of APM Server instances to deploy.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * ElasticsearchRef is a reference to the output Elasticsearch cluster running in the same Kubernetes cluster.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.apm.ApmServerSpecElasticsearchRef getElasticsearchRef() {
        return null;
    }

    /**
     * HTTP holds the HTTP layer configuration for the APM Server resource.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.apm.ApmServerSpecHttp getHttp() {
        return null;
    }

    /**
     * Image is the APM Server Docker image to deploy.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImage() {
        return null;
    }

    /**
     * PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the APM Server pods.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPodTemplate() {
        return null;
    }

    /**
     * SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for APM Server.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings> getSecureSettings() {
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
     * @return a {@link Builder} of {@link ApmServerSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApmServerSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApmServerSpec> {
        java.lang.String version;
        java.lang.Object config;
        java.lang.Number count;
        imports.co.elastic.k8s.apm.ApmServerSpecElasticsearchRef elasticsearchRef;
        imports.co.elastic.k8s.apm.ApmServerSpecHttp http;
        java.lang.String image;
        java.lang.Object podTemplate;
        java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings> secureSettings;
        java.lang.String serviceAccountName;

        /**
         * Sets the value of {@link ApmServerSpec#getVersion}
         * @param version Version of the APM Server. This parameter is required.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getConfig}
         * @param config Config holds the APM Server configuration.
         *               See: https://www.elastic.co/guide/en/apm/server/current/configuring-howto-apm-server.html
         * @return {@code this}
         */
        public Builder config(java.lang.Object config) {
            this.config = config;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getCount}
         * @param count Count of APM Server instances to deploy.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getElasticsearchRef}
         * @param elasticsearchRef ElasticsearchRef is a reference to the output Elasticsearch cluster running in the same Kubernetes cluster.
         * @return {@code this}
         */
        public Builder elasticsearchRef(imports.co.elastic.k8s.apm.ApmServerSpecElasticsearchRef elasticsearchRef) {
            this.elasticsearchRef = elasticsearchRef;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getHttp}
         * @param http HTTP holds the HTTP layer configuration for the APM Server resource.
         * @return {@code this}
         */
        public Builder http(imports.co.elastic.k8s.apm.ApmServerSpecHttp http) {
            this.http = http;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getImage}
         * @param image Image is the APM Server Docker image to deploy.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getPodTemplate}
         * @param podTemplate PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the APM Server pods.
         * @return {@code this}
         */
        public Builder podTemplate(java.lang.Object podTemplate) {
            this.podTemplate = podTemplate;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getSecureSettings}
         * @param secureSettings SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for APM Server.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder secureSettings(java.util.List<? extends imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings> secureSettings) {
            this.secureSettings = (java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings>)secureSettings;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpec#getServiceAccountName}
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
         * @return a new instance of {@link ApmServerSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApmServerSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApmServerSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApmServerSpec {
        private final java.lang.String version;
        private final java.lang.Object config;
        private final java.lang.Number count;
        private final imports.co.elastic.k8s.apm.ApmServerSpecElasticsearchRef elasticsearchRef;
        private final imports.co.elastic.k8s.apm.ApmServerSpecHttp http;
        private final java.lang.String image;
        private final java.lang.Object podTemplate;
        private final java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings> secureSettings;
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
            this.elasticsearchRef = software.amazon.jsii.Kernel.get(this, "elasticsearchRef", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.apm.ApmServerSpecElasticsearchRef.class));
            this.http = software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.apm.ApmServerSpecHttp.class));
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.podTemplate = software.amazon.jsii.Kernel.get(this, "podTemplate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.secureSettings = software.amazon.jsii.Kernel.get(this, "secureSettings", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings.class)));
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
            this.secureSettings = (java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings>)builder.secureSettings;
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
        public final imports.co.elastic.k8s.apm.ApmServerSpecElasticsearchRef getElasticsearchRef() {
            return this.elasticsearchRef;
        }

        @Override
        public final imports.co.elastic.k8s.apm.ApmServerSpecHttp getHttp() {
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
        public final java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecSecureSettings> getSecureSettings() {
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
            struct.set("fqn", om.valueToTree("coelastick8sapm.ApmServerSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApmServerSpec.Jsii$Proxy that = (ApmServerSpec.Jsii$Proxy) o;

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
