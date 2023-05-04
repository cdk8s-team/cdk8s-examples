package imports.k8s;

/**
 * Represents a vSphere volume resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.986Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VsphereVirtualDiskVolumeSource")
@software.amazon.jsii.Jsii.Proxy(VsphereVirtualDiskVolumeSource.Jsii$Proxy.class)
public interface VsphereVirtualDiskVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * volumePath is the path that identifies vSphere volume vmdk.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumePath();

    /**
     * fsType is filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStoragePolicyId() {
        return null;
    }

    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStoragePolicyName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VsphereVirtualDiskVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VsphereVirtualDiskVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VsphereVirtualDiskVolumeSource> {
        java.lang.String volumePath;
        java.lang.String fsType;
        java.lang.String storagePolicyId;
        java.lang.String storagePolicyName;

        /**
         * Sets the value of {@link VsphereVirtualDiskVolumeSource#getVolumePath}
         * @param volumePath volumePath is the path that identifies vSphere volume vmdk. This parameter is required.
         * @return {@code this}
         */
        public Builder volumePath(java.lang.String volumePath) {
            this.volumePath = volumePath;
            return this;
        }

        /**
         * Sets the value of {@link VsphereVirtualDiskVolumeSource#getFsType}
         * @param fsType fsType is filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link VsphereVirtualDiskVolumeSource#getStoragePolicyId}
         * @param storagePolicyId storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
         * @return {@code this}
         */
        public Builder storagePolicyId(java.lang.String storagePolicyId) {
            this.storagePolicyId = storagePolicyId;
            return this;
        }

        /**
         * Sets the value of {@link VsphereVirtualDiskVolumeSource#getStoragePolicyName}
         * @param storagePolicyName storagePolicyName is the storage Policy Based Management (SPBM) profile name.
         * @return {@code this}
         */
        public Builder storagePolicyName(java.lang.String storagePolicyName) {
            this.storagePolicyName = storagePolicyName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VsphereVirtualDiskVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VsphereVirtualDiskVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VsphereVirtualDiskVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VsphereVirtualDiskVolumeSource {
        private final java.lang.String volumePath;
        private final java.lang.String fsType;
        private final java.lang.String storagePolicyId;
        private final java.lang.String storagePolicyName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumePath = software.amazon.jsii.Kernel.get(this, "volumePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storagePolicyId = software.amazon.jsii.Kernel.get(this, "storagePolicyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storagePolicyName = software.amazon.jsii.Kernel.get(this, "storagePolicyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumePath = java.util.Objects.requireNonNull(builder.volumePath, "volumePath is required");
            this.fsType = builder.fsType;
            this.storagePolicyId = builder.storagePolicyId;
            this.storagePolicyName = builder.storagePolicyName;
        }

        @Override
        public final java.lang.String getVolumePath() {
            return this.volumePath;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.String getStoragePolicyId() {
            return this.storagePolicyId;
        }

        @Override
        public final java.lang.String getStoragePolicyName() {
            return this.storagePolicyName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("volumePath", om.valueToTree(this.getVolumePath()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getStoragePolicyId() != null) {
                data.set("storagePolicyId", om.valueToTree(this.getStoragePolicyId()));
            }
            if (this.getStoragePolicyName() != null) {
                data.set("storagePolicyName", om.valueToTree(this.getStoragePolicyName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VsphereVirtualDiskVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VsphereVirtualDiskVolumeSource.Jsii$Proxy that = (VsphereVirtualDiskVolumeSource.Jsii$Proxy) o;

            if (!volumePath.equals(that.volumePath)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.storagePolicyId != null ? !this.storagePolicyId.equals(that.storagePolicyId) : that.storagePolicyId != null) return false;
            return this.storagePolicyName != null ? this.storagePolicyName.equals(that.storagePolicyName) : that.storagePolicyName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.volumePath.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.storagePolicyId != null ? this.storagePolicyId.hashCode() : 0);
            result = 31 * result + (this.storagePolicyName != null ? this.storagePolicyName.hashCode() : 0);
            return result;
        }
    }
}
