package imports.k8s;

/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.849Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HttpGetAction")
@software.amazon.jsii.Jsii.Proxy(HttpGetAction.Jsii$Proxy.class)
public interface HttpGetAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name or number of the port to access on the container.
     * <p>
     * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.IntOrString getPort();

    /**
     * Host name to connect to, defaults to the pod IP.
     * <p>
     * You probably want to set "Host" in httpHeaders instead.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     * Custom headers to set in the request.
     * <p>
     * HTTP allows repeated headers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.HttpHeader> getHttpHeaders() {
        return null;
    }

    /**
     * Path to access on the HTTP server.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Scheme to use for connecting to the host.
     * <p>
     * Defaults to HTTP.
     * <p>
     * Default: HTTP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getScheme() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HttpGetAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HttpGetAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HttpGetAction> {
        imports.k8s.IntOrString port;
        java.lang.String host;
        java.util.List<imports.k8s.HttpHeader> httpHeaders;
        java.lang.String path;
        java.lang.String scheme;

        /**
         * Sets the value of {@link HttpGetAction#getPort}
         * @param port Name or number of the port to access on the container. This parameter is required.
         *             Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
         * @return {@code this}
         */
        public Builder port(imports.k8s.IntOrString port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link HttpGetAction#getHost}
         * @param host Host name to connect to, defaults to the pod IP.
         *             You probably want to set "Host" in httpHeaders instead.
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the value of {@link HttpGetAction#getHttpHeaders}
         * @param httpHeaders Custom headers to set in the request.
         *                    HTTP allows repeated headers.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder httpHeaders(java.util.List<? extends imports.k8s.HttpHeader> httpHeaders) {
            this.httpHeaders = (java.util.List<imports.k8s.HttpHeader>)httpHeaders;
            return this;
        }

        /**
         * Sets the value of {@link HttpGetAction#getPath}
         * @param path Path to access on the HTTP server.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link HttpGetAction#getScheme}
         * @param scheme Scheme to use for connecting to the host.
         *               Defaults to HTTP.
         * @return {@code this}
         */
        public Builder scheme(java.lang.String scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HttpGetAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HttpGetAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HttpGetAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HttpGetAction {
        private final imports.k8s.IntOrString port;
        private final java.lang.String host;
        private final java.util.List<imports.k8s.HttpHeader> httpHeaders;
        private final java.lang.String path;
        private final java.lang.String scheme;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
            this.host = software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpHeaders = software.amazon.jsii.Kernel.get(this, "httpHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.HttpHeader.class)));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scheme = software.amazon.jsii.Kernel.get(this, "scheme", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(builder.port, "port is required");
            this.host = builder.host;
            this.httpHeaders = (java.util.List<imports.k8s.HttpHeader>)builder.httpHeaders;
            this.path = builder.path;
            this.scheme = builder.scheme;
        }

        @Override
        public final imports.k8s.IntOrString getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getHost() {
            return this.host;
        }

        @Override
        public final java.util.List<imports.k8s.HttpHeader> getHttpHeaders() {
            return this.httpHeaders;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getScheme() {
            return this.scheme;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }
            if (this.getHttpHeaders() != null) {
                data.set("httpHeaders", om.valueToTree(this.getHttpHeaders()));
            }
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getScheme() != null) {
                data.set("scheme", om.valueToTree(this.getScheme()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HttpGetAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HttpGetAction.Jsii$Proxy that = (HttpGetAction.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            if (this.host != null ? !this.host.equals(that.host) : that.host != null) return false;
            if (this.httpHeaders != null ? !this.httpHeaders.equals(that.httpHeaders) : that.httpHeaders != null) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            return this.scheme != null ? this.scheme.equals(that.scheme) : that.scheme == null;
        }

        @Override
        public final int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.host != null ? this.host.hashCode() : 0);
            result = 31 * result + (this.httpHeaders != null ? this.httpHeaders.hashCode() : 0);
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.scheme != null ? this.scheme.hashCode() : 0);
            return result;
        }
    }
}
