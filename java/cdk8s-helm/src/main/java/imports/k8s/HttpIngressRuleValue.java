package imports.k8s;

/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends.
 * <p>
 * In the example: http://<host>/<path>?<searchpart> -&gt; backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.850Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HttpIngressRuleValue")
@software.amazon.jsii.Jsii.Proxy(HttpIngressRuleValue.Jsii$Proxy.class)
public interface HttpIngressRuleValue extends software.amazon.jsii.JsiiSerializable {

    /**
     * A collection of paths that map requests to backends.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.HttpIngressPath> getPaths();

    /**
     * @return a {@link Builder} of {@link HttpIngressRuleValue}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HttpIngressRuleValue}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HttpIngressRuleValue> {
        java.util.List<imports.k8s.HttpIngressPath> paths;

        /**
         * Sets the value of {@link HttpIngressRuleValue#getPaths}
         * @param paths A collection of paths that map requests to backends. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder paths(java.util.List<? extends imports.k8s.HttpIngressPath> paths) {
            this.paths = (java.util.List<imports.k8s.HttpIngressPath>)paths;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HttpIngressRuleValue}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HttpIngressRuleValue build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HttpIngressRuleValue}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HttpIngressRuleValue {
        private final java.util.List<imports.k8s.HttpIngressPath> paths;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.paths = software.amazon.jsii.Kernel.get(this, "paths", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.HttpIngressPath.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.paths = (java.util.List<imports.k8s.HttpIngressPath>)java.util.Objects.requireNonNull(builder.paths, "paths is required");
        }

        @Override
        public final java.util.List<imports.k8s.HttpIngressPath> getPaths() {
            return this.paths;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("paths", om.valueToTree(this.getPaths()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HttpIngressRuleValue"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HttpIngressRuleValue.Jsii$Proxy that = (HttpIngressRuleValue.Jsii$Proxy) o;

            return this.paths.equals(that.paths);
        }

        @Override
        public final int hashCode() {
            int result = this.paths.hashCode();
            return result;
        }
    }
}
