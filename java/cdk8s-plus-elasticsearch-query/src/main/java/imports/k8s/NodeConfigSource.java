package imports.k8s;

/**
 * NodeConfigSource specifies a source of node configuration.
 * <p>
 * Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.870Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NodeConfigSource")
@software.amazon.jsii.Jsii.Proxy(NodeConfigSource.Jsii$Proxy.class)
public interface NodeConfigSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * ConfigMap is a reference to a Node's ConfigMap.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ConfigMapNodeConfigSource getConfigMap() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NodeConfigSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NodeConfigSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NodeConfigSource> {
        imports.k8s.ConfigMapNodeConfigSource configMap;

        /**
         * Sets the value of {@link NodeConfigSource#getConfigMap}
         * @param configMap ConfigMap is a reference to a Node's ConfigMap.
         * @return {@code this}
         */
        public Builder configMap(imports.k8s.ConfigMapNodeConfigSource configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NodeConfigSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NodeConfigSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NodeConfigSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NodeConfigSource {
        private final imports.k8s.ConfigMapNodeConfigSource configMap;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.k8s.ConfigMapNodeConfigSource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMap = builder.configMap;
        }

        @Override
        public final imports.k8s.ConfigMapNodeConfigSource getConfigMap() {
            return this.configMap;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NodeConfigSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NodeConfigSource.Jsii$Proxy that = (NodeConfigSource.Jsii$Proxy) o;

            return this.configMap != null ? this.configMap.equals(that.configMap) : that.configMap == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configMap != null ? this.configMap.hashCode() : 0;
            return result;
        }
    }
}
