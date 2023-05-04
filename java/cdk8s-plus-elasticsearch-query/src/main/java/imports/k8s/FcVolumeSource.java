package imports.k8s;

/**
 * Represents a Fibre Channel volume.
 * <p>
 * Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.769Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.FcVolumeSource")
@software.amazon.jsii.Jsii.Proxy(FcVolumeSource.Jsii$Proxy.class)
public interface FcVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * fsType is the filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * lun is Optional: FC target lun number.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLun() {
        return null;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * targetWWNs is Optional: FC target worldwide names (WWNs).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTargetWwNs() {
        return null;
    }

    /**
     * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getWwids() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FcVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FcVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FcVolumeSource> {
        java.lang.String fsType;
        java.lang.Number lun;
        java.lang.Boolean readOnly;
        java.util.List<java.lang.String> targetWwNs;
        java.util.List<java.lang.String> wwids;

        /**
         * Sets the value of {@link FcVolumeSource#getFsType}
         * @param fsType fsType is the filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link FcVolumeSource#getLun}
         * @param lun lun is Optional: FC target lun number.
         * @return {@code this}
         */
        public Builder lun(java.lang.Number lun) {
            this.lun = lun;
            return this;
        }

        /**
         * Sets the value of {@link FcVolumeSource#getReadOnly}
         * @param readOnly readOnly is Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link FcVolumeSource#getTargetWwNs}
         * @param targetWwNs targetWWNs is Optional: FC target worldwide names (WWNs).
         * @return {@code this}
         */
        public Builder targetWwNs(java.util.List<java.lang.String> targetWwNs) {
            this.targetWwNs = targetWwNs;
            return this;
        }

        /**
         * Sets the value of {@link FcVolumeSource#getWwids}
         * @param wwids wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
         * @return {@code this}
         */
        public Builder wwids(java.util.List<java.lang.String> wwids) {
            this.wwids = wwids;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FcVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FcVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FcVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FcVolumeSource {
        private final java.lang.String fsType;
        private final java.lang.Number lun;
        private final java.lang.Boolean readOnly;
        private final java.util.List<java.lang.String> targetWwNs;
        private final java.util.List<java.lang.String> wwids;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lun = software.amazon.jsii.Kernel.get(this, "lun", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.targetWwNs = software.amazon.jsii.Kernel.get(this, "targetWwNs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.wwids = software.amazon.jsii.Kernel.get(this, "wwids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fsType = builder.fsType;
            this.lun = builder.lun;
            this.readOnly = builder.readOnly;
            this.targetWwNs = builder.targetWwNs;
            this.wwids = builder.wwids;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.Number getLun() {
            return this.lun;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.util.List<java.lang.String> getTargetWwNs() {
            return this.targetWwNs;
        }

        @Override
        public final java.util.List<java.lang.String> getWwids() {
            return this.wwids;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getLun() != null) {
                data.set("lun", om.valueToTree(this.getLun()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getTargetWwNs() != null) {
                data.set("targetWwNs", om.valueToTree(this.getTargetWwNs()));
            }
            if (this.getWwids() != null) {
                data.set("wwids", om.valueToTree(this.getWwids()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FcVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FcVolumeSource.Jsii$Proxy that = (FcVolumeSource.Jsii$Proxy) o;

            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.lun != null ? !this.lun.equals(that.lun) : that.lun != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.targetWwNs != null ? !this.targetWwNs.equals(that.targetWwNs) : that.targetWwNs != null) return false;
            return this.wwids != null ? this.wwids.equals(that.wwids) : that.wwids == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fsType != null ? this.fsType.hashCode() : 0;
            result = 31 * result + (this.lun != null ? this.lun.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.targetWwNs != null ? this.targetWwNs.hashCode() : 0);
            result = 31 * result + (this.wwids != null ? this.wwids.hashCode() : 0);
            return result;
        }
    }
}
