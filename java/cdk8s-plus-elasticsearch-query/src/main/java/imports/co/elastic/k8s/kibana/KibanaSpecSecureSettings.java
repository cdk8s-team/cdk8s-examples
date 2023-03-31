package imports.co.elastic.k8s.kibana;

/**
 * SecretSource defines a data source based on a Kubernetes Secret.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:16.008Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.kibana.$Module.class, fqn = "coelastick8skibana.KibanaSpecSecureSettings")
@software.amazon.jsii.Jsii.Proxy(KibanaSpecSecureSettings.Jsii$Proxy.class)
public interface KibanaSpecSecureSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * SecretName is the name of the secret.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSecretName();

    /**
     * Entries define how to project each key-value pair in the secret to filesystem paths.
     * <p>
     * If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries> getEntries() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KibanaSpecSecureSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KibanaSpecSecureSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KibanaSpecSecureSettings> {
        java.lang.String secretName;
        java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries> entries;

        /**
         * Sets the value of {@link KibanaSpecSecureSettings#getSecretName}
         * @param secretName SecretName is the name of the secret. This parameter is required.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Sets the value of {@link KibanaSpecSecureSettings#getEntries}
         * @param entries Entries define how to project each key-value pair in the secret to filesystem paths.
         *                If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder entries(java.util.List<? extends imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries> entries) {
            this.entries = (java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries>)entries;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KibanaSpecSecureSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KibanaSpecSecureSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KibanaSpecSecureSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KibanaSpecSecureSettings {
        private final java.lang.String secretName;
        private final java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries> entries;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.secretName = software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.entries = software.amazon.jsii.Kernel.get(this, "entries", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.secretName = java.util.Objects.requireNonNull(builder.secretName, "secretName is required");
            this.entries = (java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries>)builder.entries;
        }

        @Override
        public final java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.kibana.KibanaSpecSecureSettingsEntries> getEntries() {
            return this.entries;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("secretName", om.valueToTree(this.getSecretName()));
            if (this.getEntries() != null) {
                data.set("entries", om.valueToTree(this.getEntries()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8skibana.KibanaSpecSecureSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KibanaSpecSecureSettings.Jsii$Proxy that = (KibanaSpecSecureSettings.Jsii$Proxy) o;

            if (!secretName.equals(that.secretName)) return false;
            return this.entries != null ? this.entries.equals(that.entries) : that.entries == null;
        }

        @Override
        public final int hashCode() {
            int result = this.secretName.hashCode();
            result = 31 * result + (this.entries != null ? this.entries.hashCode() : 0);
            return result;
        }
    }
}
