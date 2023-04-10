package imports.k8s;

/**
 * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.844Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.FlexPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(FlexPersistentVolumeSource.Jsii$Proxy.class)
public interface FlexPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * driver is the name of the driver to use for this volume.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * fsType is the Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * options is Optional: this field holds extra command options if any.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getOptions() {
        return null;
    }

    /**
     * readOnly is Optional: defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
     * <p>
     * This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FlexPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FlexPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FlexPersistentVolumeSource> {
        java.lang.String driver;
        java.lang.String fsType;
        java.util.Map<java.lang.String, java.lang.String> options;
        java.lang.Boolean readOnly;
        imports.k8s.SecretReference secretRef;

        /**
         * Sets the value of {@link FlexPersistentVolumeSource#getDriver}
         * @param driver driver is the name of the driver to use for this volume. This parameter is required.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link FlexPersistentVolumeSource#getFsType}
         * @param fsType fsType is the Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link FlexPersistentVolumeSource#getOptions}
         * @param options options is Optional: this field holds extra command options if any.
         * @return {@code this}
         */
        public Builder options(java.util.Map<java.lang.String, java.lang.String> options) {
            this.options = options;
            return this;
        }

        /**
         * Sets the value of {@link FlexPersistentVolumeSource#getReadOnly}
         * @param readOnly readOnly is Optional: defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link FlexPersistentVolumeSource#getSecretRef}
         * @param secretRef secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
         *                  This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FlexPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FlexPersistentVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FlexPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FlexPersistentVolumeSource {
        private final java.lang.String driver;
        private final java.lang.String fsType;
        private final java.util.Map<java.lang.String, java.lang.String> options;
        private final java.lang.Boolean readOnly;
        private final imports.k8s.SecretReference secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.options = software.amazon.jsii.Kernel.get(this, "options", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
            this.fsType = builder.fsType;
            this.options = builder.options;
            this.readOnly = builder.readOnly;
            this.secretRef = builder.secretRef;
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getOptions() {
            return this.options;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final imports.k8s.SecretReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getOptions() != null) {
                data.set("options", om.valueToTree(this.getOptions()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FlexPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FlexPersistentVolumeSource.Jsii$Proxy that = (FlexPersistentVolumeSource.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.options != null ? !this.options.equals(that.options) : that.options != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.secretRef != null ? this.secretRef.equals(that.secretRef) : that.secretRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.options != null ? this.options.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            return result;
        }
    }
}
