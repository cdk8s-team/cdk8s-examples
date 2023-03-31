package imports.k8s;

/**
 * Projection that may be projected along with other supported volume types.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.963Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VolumeProjection")
@software.amazon.jsii.Jsii.Proxy(VolumeProjection.Jsii$Proxy.class)
public interface VolumeProjection extends software.amazon.jsii.JsiiSerializable {

    /**
     * configMap information about the configMap data to project.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ConfigMapProjection getConfigMap() {
        return null;
    }

    /**
     * downwardAPI information about the downwardAPI data to project.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.DownwardApiProjection getDownwardApi() {
        return null;
    }

    /**
     * secret information about the secret data to project.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretProjection getSecret() {
        return null;
    }

    /**
     * serviceAccountToken is information about the serviceAccountToken data to project.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ServiceAccountTokenProjection getServiceAccountToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeProjection}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeProjection}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VolumeProjection> {
        imports.k8s.ConfigMapProjection configMap;
        imports.k8s.DownwardApiProjection downwardApi;
        imports.k8s.SecretProjection secret;
        imports.k8s.ServiceAccountTokenProjection serviceAccountToken;

        /**
         * Sets the value of {@link VolumeProjection#getConfigMap}
         * @param configMap configMap information about the configMap data to project.
         * @return {@code this}
         */
        public Builder configMap(imports.k8s.ConfigMapProjection configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link VolumeProjection#getDownwardApi}
         * @param downwardApi downwardAPI information about the downwardAPI data to project.
         * @return {@code this}
         */
        public Builder downwardApi(imports.k8s.DownwardApiProjection downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link VolumeProjection#getSecret}
         * @param secret secret information about the secret data to project.
         * @return {@code this}
         */
        public Builder secret(imports.k8s.SecretProjection secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link VolumeProjection#getServiceAccountToken}
         * @param serviceAccountToken serviceAccountToken is information about the serviceAccountToken data to project.
         * @return {@code this}
         */
        public Builder serviceAccountToken(imports.k8s.ServiceAccountTokenProjection serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeProjection}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VolumeProjection build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VolumeProjection}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeProjection {
        private final imports.k8s.ConfigMapProjection configMap;
        private final imports.k8s.DownwardApiProjection downwardApi;
        private final imports.k8s.SecretProjection secret;
        private final imports.k8s.ServiceAccountTokenProjection serviceAccountToken;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.k8s.ConfigMapProjection.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.k8s.DownwardApiProjection.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretProjection.class));
            this.serviceAccountToken = software.amazon.jsii.Kernel.get(this, "serviceAccountToken", software.amazon.jsii.NativeType.forClass(imports.k8s.ServiceAccountTokenProjection.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMap = builder.configMap;
            this.downwardApi = builder.downwardApi;
            this.secret = builder.secret;
            this.serviceAccountToken = builder.serviceAccountToken;
        }

        @Override
        public final imports.k8s.ConfigMapProjection getConfigMap() {
            return this.configMap;
        }

        @Override
        public final imports.k8s.DownwardApiProjection getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final imports.k8s.SecretProjection getSecret() {
            return this.secret;
        }

        @Override
        public final imports.k8s.ServiceAccountTokenProjection getServiceAccountToken() {
            return this.serviceAccountToken;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }
            if (this.getDownwardApi() != null) {
                data.set("downwardApi", om.valueToTree(this.getDownwardApi()));
            }
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getServiceAccountToken() != null) {
                data.set("serviceAccountToken", om.valueToTree(this.getServiceAccountToken()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeProjection"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeProjection.Jsii$Proxy that = (VolumeProjection.Jsii$Proxy) o;

            if (this.configMap != null ? !this.configMap.equals(that.configMap) : that.configMap != null) return false;
            if (this.downwardApi != null ? !this.downwardApi.equals(that.downwardApi) : that.downwardApi != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            return this.serviceAccountToken != null ? this.serviceAccountToken.equals(that.serviceAccountToken) : that.serviceAccountToken == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configMap != null ? this.configMap.hashCode() : 0;
            result = 31 * result + (this.downwardApi != null ? this.downwardApi.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.serviceAccountToken != null ? this.serviceAccountToken.hashCode() : 0);
            return result;
        }
    }
}
