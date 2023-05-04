package imports.k8s;

/**
 * HTTPIngressPath associates a path with a backend.
 * <p>
 * Incoming urls matching the path are forwarded to the backend.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.773Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HttpIngressPath")
@software.amazon.jsii.Jsii.Proxy(HttpIngressPath.Jsii$Proxy.class)
public interface HttpIngressPath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.IngressBackend getBackend();

    /**
     * PathType determines the interpretation of the Path matching.
     * <p>
     * PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
     * done on a path element by element basis. A path element refers is the
     * list of labels in the path split by the '/' separator. A request is a
     * match for path p if every p is an element-wise prefix of p of the
     * request path. Note that if the last element of the path is a substring
     * of the last element in request path, it is not a match (e.g. /foo/bar
     * matches /foo/bar/baz, but does not match /foo/barbaz).
     * <p>
     * <ul>
     * <li>ImplementationSpecific: Interpretation of the Path matching is up to
     * the IngressClass. Implementations can treat this as a separate PathType
     * or treat it identically to Prefix or Exact path types.
     * Implementations are required to support all path types.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPathType();

    /**
     * Path is matched against the path of an incoming request.
     * <p>
     * Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HttpIngressPath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HttpIngressPath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HttpIngressPath> {
        imports.k8s.IngressBackend backend;
        java.lang.String pathType;
        java.lang.String path;

        /**
         * Sets the value of {@link HttpIngressPath#getBackend}
         * @param backend Backend defines the referenced service endpoint to which the traffic will be forwarded to. This parameter is required.
         * @return {@code this}
         */
        public Builder backend(imports.k8s.IngressBackend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * Sets the value of {@link HttpIngressPath#getPathType}
         * @param pathType PathType determines the interpretation of the Path matching. This parameter is required.
         *                 PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
         *                 done on a path element by element basis. A path element refers is the
         *                 list of labels in the path split by the '/' separator. A request is a
         *                 match for path p if every p is an element-wise prefix of p of the
         *                 request path. Note that if the last element of the path is a substring
         *                 of the last element in request path, it is not a match (e.g. /foo/bar
         *                 matches /foo/bar/baz, but does not match /foo/barbaz).
         *                 <p>
         *                 <ul>
         *                 <li>ImplementationSpecific: Interpretation of the Path matching is up to
         *                 the IngressClass. Implementations can treat this as a separate PathType
         *                 or treat it identically to Prefix or Exact path types.
         *                 Implementations are required to support all path types.</li>
         *                 </ul>
         * @return {@code this}
         */
        public Builder pathType(java.lang.String pathType) {
            this.pathType = pathType;
            return this;
        }

        /**
         * Sets the value of {@link HttpIngressPath#getPath}
         * @param path Path is matched against the path of an incoming request.
         *             Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HttpIngressPath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HttpIngressPath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HttpIngressPath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HttpIngressPath {
        private final imports.k8s.IngressBackend backend;
        private final java.lang.String pathType;
        private final java.lang.String path;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.backend = software.amazon.jsii.Kernel.get(this, "backend", software.amazon.jsii.NativeType.forClass(imports.k8s.IngressBackend.class));
            this.pathType = software.amazon.jsii.Kernel.get(this, "pathType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.backend = java.util.Objects.requireNonNull(builder.backend, "backend is required");
            this.pathType = java.util.Objects.requireNonNull(builder.pathType, "pathType is required");
            this.path = builder.path;
        }

        @Override
        public final imports.k8s.IngressBackend getBackend() {
            return this.backend;
        }

        @Override
        public final java.lang.String getPathType() {
            return this.pathType;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("backend", om.valueToTree(this.getBackend()));
            data.set("pathType", om.valueToTree(this.getPathType()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HttpIngressPath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HttpIngressPath.Jsii$Proxy that = (HttpIngressPath.Jsii$Proxy) o;

            if (!backend.equals(that.backend)) return false;
            if (!pathType.equals(that.pathType)) return false;
            return this.path != null ? this.path.equals(that.path) : that.path == null;
        }

        @Override
        public final int hashCode() {
            int result = this.backend.hashCode();
            result = 31 * result + (this.pathType.hashCode());
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            return result;
        }
    }
}
