package imports.k8s;

/**
 * Represents a StorageOS persistent volume resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.944Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StorageOsVolumeSource")
@software.amazon.jsii.Jsii.Proxy(StorageOsVolumeSource.Jsii$Proxy.class)
public interface StorageOsVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * fsType is the filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * readOnly defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * secretRef specifies the secret to use for obtaining the StorageOS API credentials.
     * <p>
     * If not specified, default values will be attempted.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LocalObjectReference getSecretRef() {
        return null;
    }

    /**
     * volumeName is the human-readable name of the StorageOS volume.
     * <p>
     * Volume names are only unique within a namespace.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * volumeNamespace specifies the scope of the volume within StorageOS.
     * <p>
     * If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StorageOsVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StorageOsVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StorageOsVolumeSource> {
        java.lang.String fsType;
        java.lang.Boolean readOnly;
        imports.k8s.LocalObjectReference secretRef;
        java.lang.String volumeName;
        java.lang.String volumeNamespace;

        /**
         * Sets the value of {@link StorageOsVolumeSource#getFsType}
         * @param fsType fsType is the filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link StorageOsVolumeSource#getReadOnly}
         * @param readOnly readOnly defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link StorageOsVolumeSource#getSecretRef}
         * @param secretRef secretRef specifies the secret to use for obtaining the StorageOS API credentials.
         *                  If not specified, default values will be attempted.
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link StorageOsVolumeSource#getVolumeName}
         * @param volumeName volumeName is the human-readable name of the StorageOS volume.
         *                   Volume names are only unique within a namespace.
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Sets the value of {@link StorageOsVolumeSource#getVolumeNamespace}
         * @param volumeNamespace volumeNamespace specifies the scope of the volume within StorageOS.
         *                        If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
         * @return {@code this}
         */
        public Builder volumeNamespace(java.lang.String volumeNamespace) {
            this.volumeNamespace = volumeNamespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StorageOsVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StorageOsVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StorageOsVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StorageOsVolumeSource {
        private final java.lang.String fsType;
        private final java.lang.Boolean readOnly;
        private final imports.k8s.LocalObjectReference secretRef;
        private final java.lang.String volumeName;
        private final java.lang.String volumeNamespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.LocalObjectReference.class));
            this.volumeName = software.amazon.jsii.Kernel.get(this, "volumeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeNamespace = software.amazon.jsii.Kernel.get(this, "volumeNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fsType = builder.fsType;
            this.readOnly = builder.readOnly;
            this.secretRef = builder.secretRef;
            this.volumeName = builder.volumeName;
            this.volumeNamespace = builder.volumeNamespace;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final imports.k8s.LocalObjectReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        public final java.lang.String getVolumeName() {
            return this.volumeName;
        }

        @Override
        public final java.lang.String getVolumeNamespace() {
            return this.volumeNamespace;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }
            if (this.getVolumeName() != null) {
                data.set("volumeName", om.valueToTree(this.getVolumeName()));
            }
            if (this.getVolumeNamespace() != null) {
                data.set("volumeNamespace", om.valueToTree(this.getVolumeNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StorageOsVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StorageOsVolumeSource.Jsii$Proxy that = (StorageOsVolumeSource.Jsii$Proxy) o;

            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.secretRef != null ? !this.secretRef.equals(that.secretRef) : that.secretRef != null) return false;
            if (this.volumeName != null ? !this.volumeName.equals(that.volumeName) : that.volumeName != null) return false;
            return this.volumeNamespace != null ? this.volumeNamespace.equals(that.volumeNamespace) : that.volumeNamespace == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fsType != null ? this.fsType.hashCode() : 0;
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            result = 31 * result + (this.volumeName != null ? this.volumeName.hashCode() : 0);
            result = 31 * result + (this.volumeNamespace != null ? this.volumeNamespace.hashCode() : 0);
            return result;
        }
    }
}
