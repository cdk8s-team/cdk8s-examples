package imports.co.elastic.k8s.kibana;

/**
 * KeyToPath defines how to map a key in a Secret object to a filesystem path.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:16.008Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.kibana.$Module.class, fqn = "coelastick8skibana.KibanaSpecSecureSettingsEntries")
@software.amazon.jsii.Jsii.Proxy(KibanaSpecSecureSettingsEntries.Jsii$Proxy.class)
public interface KibanaSpecSecureSettingsEntries extends software.amazon.jsii.JsiiSerializable {

    /**
     * Key is the key contained in the secret.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Path is the relative file path to map the key to.
     * <p>
     * Path must not be an absolute file path and must not contain any ".." components.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KibanaSpecSecureSettingsEntries}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KibanaSpecSecureSettingsEntries}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KibanaSpecSecureSettingsEntries> {
        java.lang.String key;
        java.lang.String path;

        /**
         * Sets the value of {@link KibanaSpecSecureSettingsEntries#getKey}
         * @param key Key is the key contained in the secret. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpecSecureSettingsEntries#getPath}
         * @param path Path is the relative file path to map the key to.
         *             Path must not be an absolute file path and must not contain any ".." components.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KibanaSpecSecureSettingsEntries}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KibanaSpecSecureSettingsEntries build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KibanaSpecSecureSettingsEntries}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KibanaSpecSecureSettingsEntries {
        private final java.lang.String key;
        private final java.lang.String path;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.path = builder.path;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
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

            data.set("key", om.valueToTree(this.getKey()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8skibana.KibanaSpecSecureSettingsEntries"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KibanaSpecSecureSettingsEntries.Jsii$Proxy that = (KibanaSpecSecureSettingsEntries.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            return this.path != null ? this.path.equals(that.path) : that.path == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            return result;
        }
    }
}
