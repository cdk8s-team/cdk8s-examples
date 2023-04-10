package imports.k8s;

/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.814Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.AzureFileVolumeSource")
@software.amazon.jsii.Jsii.Proxy(AzureFileVolumeSource.Jsii$Proxy.class)
public interface AzureFileVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * secretName is the  name of secret that contains Azure Storage Account Name and Key.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSecretName();

    /**
     * shareName is the azure share Name.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getShareName();

    /**
     * readOnly defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AzureFileVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AzureFileVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AzureFileVolumeSource> {
        java.lang.String secretName;
        java.lang.String shareName;
        java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link AzureFileVolumeSource#getSecretName}
         * @param secretName secretName is the  name of secret that contains Azure Storage Account Name and Key. This parameter is required.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Sets the value of {@link AzureFileVolumeSource#getShareName}
         * @param shareName shareName is the azure share Name. This parameter is required.
         * @return {@code this}
         */
        public Builder shareName(java.lang.String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * Sets the value of {@link AzureFileVolumeSource#getReadOnly}
         * @param readOnly readOnly defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AzureFileVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AzureFileVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AzureFileVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AzureFileVolumeSource {
        private final java.lang.String secretName;
        private final java.lang.String shareName;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.secretName = software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.shareName = software.amazon.jsii.Kernel.get(this, "shareName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.secretName = java.util.Objects.requireNonNull(builder.secretName, "secretName is required");
            this.shareName = java.util.Objects.requireNonNull(builder.shareName, "shareName is required");
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        public final java.lang.String getShareName() {
            return this.shareName;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("secretName", om.valueToTree(this.getSecretName()));
            data.set("shareName", om.valueToTree(this.getShareName()));
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AzureFileVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AzureFileVolumeSource.Jsii$Proxy that = (AzureFileVolumeSource.Jsii$Proxy) o;

            if (!secretName.equals(that.secretName)) return false;
            if (!shareName.equals(that.shareName)) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.secretName.hashCode();
            result = 31 * result + (this.shareName.hashCode());
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
