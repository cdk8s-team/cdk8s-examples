package imports.k8s;

/**
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.813Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.AzureDiskVolumeSource")
@software.amazon.jsii.Jsii.Proxy(AzureDiskVolumeSource.Jsii$Proxy.class)
public interface AzureDiskVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * diskName is the Name of the data disk in the blob storage.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDiskName();

    /**
     * diskURI is the URI of data disk in the blob storage.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDiskUri();

    /**
     * cachingMode is the Host Caching mode: None, Read Only, Read Write.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCachingMode() {
        return null;
    }

    /**
     * fsType is Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set).
     * <p>
     * defaults to shared
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * readOnly Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AzureDiskVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AzureDiskVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AzureDiskVolumeSource> {
        java.lang.String diskName;
        java.lang.String diskUri;
        java.lang.String cachingMode;
        java.lang.String fsType;
        java.lang.String kind;
        java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link AzureDiskVolumeSource#getDiskName}
         * @param diskName diskName is the Name of the data disk in the blob storage. This parameter is required.
         * @return {@code this}
         */
        public Builder diskName(java.lang.String diskName) {
            this.diskName = diskName;
            return this;
        }

        /**
         * Sets the value of {@link AzureDiskVolumeSource#getDiskUri}
         * @param diskUri diskURI is the URI of data disk in the blob storage. This parameter is required.
         * @return {@code this}
         */
        public Builder diskUri(java.lang.String diskUri) {
            this.diskUri = diskUri;
            return this;
        }

        /**
         * Sets the value of {@link AzureDiskVolumeSource#getCachingMode}
         * @param cachingMode cachingMode is the Host Caching mode: None, Read Only, Read Write.
         * @return {@code this}
         */
        public Builder cachingMode(java.lang.String cachingMode) {
            this.cachingMode = cachingMode;
            return this;
        }

        /**
         * Sets the value of {@link AzureDiskVolumeSource#getFsType}
         * @param fsType fsType is Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link AzureDiskVolumeSource#getKind}
         * @param kind kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set).
         *             defaults to shared
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link AzureDiskVolumeSource#getReadOnly}
         * @param readOnly readOnly Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AzureDiskVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AzureDiskVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AzureDiskVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AzureDiskVolumeSource {
        private final java.lang.String diskName;
        private final java.lang.String diskUri;
        private final java.lang.String cachingMode;
        private final java.lang.String fsType;
        private final java.lang.String kind;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.diskName = software.amazon.jsii.Kernel.get(this, "diskName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.diskUri = software.amazon.jsii.Kernel.get(this, "diskUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cachingMode = software.amazon.jsii.Kernel.get(this, "cachingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.diskName = java.util.Objects.requireNonNull(builder.diskName, "diskName is required");
            this.diskUri = java.util.Objects.requireNonNull(builder.diskUri, "diskUri is required");
            this.cachingMode = builder.cachingMode;
            this.fsType = builder.fsType;
            this.kind = builder.kind;
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getDiskName() {
            return this.diskName;
        }

        @Override
        public final java.lang.String getDiskUri() {
            return this.diskUri;
        }

        @Override
        public final java.lang.String getCachingMode() {
            return this.cachingMode;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
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

            data.set("diskName", om.valueToTree(this.getDiskName()));
            data.set("diskUri", om.valueToTree(this.getDiskUri()));
            if (this.getCachingMode() != null) {
                data.set("cachingMode", om.valueToTree(this.getCachingMode()));
            }
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AzureDiskVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AzureDiskVolumeSource.Jsii$Proxy that = (AzureDiskVolumeSource.Jsii$Proxy) o;

            if (!diskName.equals(that.diskName)) return false;
            if (!diskUri.equals(that.diskUri)) return false;
            if (this.cachingMode != null ? !this.cachingMode.equals(that.cachingMode) : that.cachingMode != null) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.diskName.hashCode();
            result = 31 * result + (this.diskUri.hashCode());
            result = 31 * result + (this.cachingMode != null ? this.cachingMode.hashCode() : 0);
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
