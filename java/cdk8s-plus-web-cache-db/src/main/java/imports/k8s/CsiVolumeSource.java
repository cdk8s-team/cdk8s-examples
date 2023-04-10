package imports.k8s;

/**
 * Represents a source location of a volume to mount, managed by an external CSI driver.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.829Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiVolumeSource")
@software.amazon.jsii.Jsii.Proxy(CsiVolumeSource.Jsii$Proxy.class)
public interface CsiVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * driver is the name of the CSI driver that handles this volume.
     * <p>
     * Consult with your admin for the correct name as registered in the cluster.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * fsType to mount.
     * <p>
     * Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
     * <p>
     * This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LocalObjectReference getNodePublishSecretRef() {
        return null;
    }

    /**
     * readOnly specifies a read-only configuration for the volume.
     * <p>
     * Defaults to false (read/write).
     * <p>
     * Default: false (read/write).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI driver.
     * <p>
     * Consult your driver's documentation for supported values.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiVolumeSource> {
        java.lang.String driver;
        java.lang.String fsType;
        imports.k8s.LocalObjectReference nodePublishSecretRef;
        java.lang.Boolean readOnly;
        java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Sets the value of {@link CsiVolumeSource#getDriver}
         * @param driver driver is the name of the CSI driver that handles this volume. This parameter is required.
         *               Consult with your admin for the correct name as registered in the cluster.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link CsiVolumeSource#getFsType}
         * @param fsType fsType to mount.
         *               Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link CsiVolumeSource#getNodePublishSecretRef}
         * @param nodePublishSecretRef nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
         *                             This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
         * @return {@code this}
         */
        public Builder nodePublishSecretRef(imports.k8s.LocalObjectReference nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CsiVolumeSource#getReadOnly}
         * @param readOnly readOnly specifies a read-only configuration for the volume.
         *                 Defaults to false (read/write).
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link CsiVolumeSource#getVolumeAttributes}
         * @param volumeAttributes volumeAttributes stores driver-specific properties that are passed to the CSI driver.
         *                         Consult your driver's documentation for supported values.
         * @return {@code this}
         */
        public Builder volumeAttributes(java.util.Map<java.lang.String, java.lang.String> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CsiVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiVolumeSource {
        private final java.lang.String driver;
        private final java.lang.String fsType;
        private final imports.k8s.LocalObjectReference nodePublishSecretRef;
        private final java.lang.Boolean readOnly;
        private final java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodePublishSecretRef = software.amazon.jsii.Kernel.get(this, "nodePublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.LocalObjectReference.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.volumeAttributes = software.amazon.jsii.Kernel.get(this, "volumeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
            this.fsType = builder.fsType;
            this.nodePublishSecretRef = builder.nodePublishSecretRef;
            this.readOnly = builder.readOnly;
            this.volumeAttributes = builder.volumeAttributes;
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
        public final imports.k8s.LocalObjectReference getNodePublishSecretRef() {
            return this.nodePublishSecretRef;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
            return this.volumeAttributes;
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
            if (this.getNodePublishSecretRef() != null) {
                data.set("nodePublishSecretRef", om.valueToTree(this.getNodePublishSecretRef()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getVolumeAttributes() != null) {
                data.set("volumeAttributes", om.valueToTree(this.getVolumeAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CsiVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiVolumeSource.Jsii$Proxy that = (CsiVolumeSource.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.nodePublishSecretRef != null ? !this.nodePublishSecretRef.equals(that.nodePublishSecretRef) : that.nodePublishSecretRef != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.volumeAttributes != null ? this.volumeAttributes.equals(that.volumeAttributes) : that.volumeAttributes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.nodePublishSecretRef != null ? this.nodePublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.volumeAttributes != null ? this.volumeAttributes.hashCode() : 0);
            return result;
        }
    }
}
