package imports.k8s;

/**
 * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.
 * <p>
 * This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.822Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ConfigMapNodeConfigSource")
@software.amazon.jsii.Jsii.Proxy(ConfigMapNodeConfigSource.Jsii$Proxy.class)
public interface ConfigMapNodeConfigSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKubeletConfigKey();

    /**
     * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNamespace();

    /**
     * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceVersion() {
        return null;
    }

    /**
     * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigMapNodeConfigSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigMapNodeConfigSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigMapNodeConfigSource> {
        java.lang.String kubeletConfigKey;
        java.lang.String name;
        java.lang.String namespace;
        java.lang.String resourceVersion;
        java.lang.String uid;

        /**
         * Sets the value of {@link ConfigMapNodeConfigSource#getKubeletConfigKey}
         * @param kubeletConfigKey KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases. This parameter is required.
         * @return {@code this}
         */
        public Builder kubeletConfigKey(java.lang.String kubeletConfigKey) {
            this.kubeletConfigKey = kubeletConfigKey;
            return this;
        }

        /**
         * Sets the value of {@link ConfigMapNodeConfigSource#getName}
         * @param name Name is the metadata.name of the referenced ConfigMap. This field is required in all cases. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ConfigMapNodeConfigSource#getNamespace}
         * @param namespace Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases. This parameter is required.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ConfigMapNodeConfigSource#getResourceVersion}
         * @param resourceVersion ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
         * @return {@code this}
         */
        public Builder resourceVersion(java.lang.String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Sets the value of {@link ConfigMapNodeConfigSource#getUid}
         * @param uid UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigMapNodeConfigSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigMapNodeConfigSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ConfigMapNodeConfigSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigMapNodeConfigSource {
        private final java.lang.String kubeletConfigKey;
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.lang.String resourceVersion;
        private final java.lang.String uid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kubeletConfigKey = software.amazon.jsii.Kernel.get(this, "kubeletConfigKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceVersion = software.amazon.jsii.Kernel.get(this, "resourceVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.uid = software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kubeletConfigKey = java.util.Objects.requireNonNull(builder.kubeletConfigKey, "kubeletConfigKey is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.namespace = java.util.Objects.requireNonNull(builder.namespace, "namespace is required");
            this.resourceVersion = builder.resourceVersion;
            this.uid = builder.uid;
        }

        @Override
        public final java.lang.String getKubeletConfigKey() {
            return this.kubeletConfigKey;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getResourceVersion() {
            return this.resourceVersion;
        }

        @Override
        public final java.lang.String getUid() {
            return this.uid;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("kubeletConfigKey", om.valueToTree(this.getKubeletConfigKey()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("namespace", om.valueToTree(this.getNamespace()));
            if (this.getResourceVersion() != null) {
                data.set("resourceVersion", om.valueToTree(this.getResourceVersion()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ConfigMapNodeConfigSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigMapNodeConfigSource.Jsii$Proxy that = (ConfigMapNodeConfigSource.Jsii$Proxy) o;

            if (!kubeletConfigKey.equals(that.kubeletConfigKey)) return false;
            if (!name.equals(that.name)) return false;
            if (!namespace.equals(that.namespace)) return false;
            if (this.resourceVersion != null ? !this.resourceVersion.equals(that.resourceVersion) : that.resourceVersion != null) return false;
            return this.uid != null ? this.uid.equals(that.uid) : that.uid == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kubeletConfigKey.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.namespace.hashCode());
            result = 31 * result + (this.resourceVersion != null ? this.resourceVersion.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            return result;
        }
    }
}
