package imports.k8s;

/**
 * ServiceAccountTokenProjection represents a projected service account token volume.
 * <p>
 * This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.940Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceAccountTokenProjection")
@software.amazon.jsii.Jsii.Proxy(ServiceAccountTokenProjection.Jsii$Proxy.class)
public interface ServiceAccountTokenProjection extends software.amazon.jsii.JsiiSerializable {

    /**
     * path is the path relative to the mount point of the file to project the token into.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * audience is the intended audience of the token.
     * <p>
     * A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAudience() {
        return null;
    }

    /**
     * expirationSeconds is the requested duration of validity of the service account token.
     * <p>
     * As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
     * <p>
     * Default: 1 hour and must be at least 10 minutes.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getExpirationSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceAccountTokenProjection}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceAccountTokenProjection}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceAccountTokenProjection> {
        java.lang.String path;
        java.lang.String audience;
        java.lang.Number expirationSeconds;

        /**
         * Sets the value of {@link ServiceAccountTokenProjection#getPath}
         * @param path path is the path relative to the mount point of the file to project the token into. This parameter is required.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountTokenProjection#getAudience}
         * @param audience audience is the intended audience of the token.
         *                 A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
         * @return {@code this}
         */
        public Builder audience(java.lang.String audience) {
            this.audience = audience;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountTokenProjection#getExpirationSeconds}
         * @param expirationSeconds expirationSeconds is the requested duration of validity of the service account token.
         *                          As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
         * @return {@code this}
         */
        public Builder expirationSeconds(java.lang.Number expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceAccountTokenProjection}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceAccountTokenProjection build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceAccountTokenProjection}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceAccountTokenProjection {
        private final java.lang.String path;
        private final java.lang.String audience;
        private final java.lang.Number expirationSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.audience = software.amazon.jsii.Kernel.get(this, "audience", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expirationSeconds = software.amazon.jsii.Kernel.get(this, "expirationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.audience = builder.audience;
            this.expirationSeconds = builder.expirationSeconds;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getAudience() {
            return this.audience;
        }

        @Override
        public final java.lang.Number getExpirationSeconds() {
            return this.expirationSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getAudience() != null) {
                data.set("audience", om.valueToTree(this.getAudience()));
            }
            if (this.getExpirationSeconds() != null) {
                data.set("expirationSeconds", om.valueToTree(this.getExpirationSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceAccountTokenProjection"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceAccountTokenProjection.Jsii$Proxy that = (ServiceAccountTokenProjection.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            if (this.audience != null ? !this.audience.equals(that.audience) : that.audience != null) return false;
            return this.expirationSeconds != null ? this.expirationSeconds.equals(that.expirationSeconds) : that.expirationSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.audience != null ? this.audience.hashCode() : 0);
            result = 31 * result + (this.expirationSeconds != null ? this.expirationSeconds.hashCode() : 0);
            return result;
        }
    }
}
