package imports.k8s;

/**
 * Represents storage that is managed by an external CSI volume driver (Beta feature).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.828Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(CsiPersistentVolumeSource.Jsii$Proxy.class)
public interface CsiPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * driver is the name of the driver to use for this volume.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeHandle();

    /**
     * controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call.
     * <p>
     * This is an beta field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getControllerExpandSecretRef() {
        return null;
    }

    /**
     * controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls.
     * <p>
     * This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getControllerPublishSecretRef() {
        return null;
    }

    /**
     * fsType to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * nodeExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeExpandVolume call.
     * <p>
     * This is an alpha field and requires enabling CSINodeExpandSecret feature gate. This field is optional, may be omitted if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getNodeExpandSecretRef() {
        return null;
    }

    /**
     * nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
     * <p>
     * This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getNodePublishSecretRef() {
        return null;
    }

    /**
     * nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls.
     * <p>
     * This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getNodeStageSecretRef() {
        return null;
    }

    /**
     * readOnly value to pass to ControllerPublishVolumeRequest.
     * <p>
     * Defaults to false (read/write).
     * <p>
     * Default: false (read/write).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * volumeAttributes of the volume to publish.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiPersistentVolumeSource> {
        java.lang.String driver;
        java.lang.String volumeHandle;
        imports.k8s.SecretReference controllerExpandSecretRef;
        imports.k8s.SecretReference controllerPublishSecretRef;
        java.lang.String fsType;
        imports.k8s.SecretReference nodeExpandSecretRef;
        imports.k8s.SecretReference nodePublishSecretRef;
        imports.k8s.SecretReference nodeStageSecretRef;
        java.lang.Boolean readOnly;
        java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getDriver}
         * @param driver driver is the name of the driver to use for this volume. This parameter is required.
         *               Required.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getVolumeHandle}
         * @param volumeHandle volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. This parameter is required.
         *                     Required.
         * @return {@code this}
         */
        public Builder volumeHandle(java.lang.String volumeHandle) {
            this.volumeHandle = volumeHandle;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getControllerExpandSecretRef}
         * @param controllerExpandSecretRef controllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call.
         *                                  This is an beta field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder controllerExpandSecretRef(imports.k8s.SecretReference controllerExpandSecretRef) {
            this.controllerExpandSecretRef = controllerExpandSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getControllerPublishSecretRef}
         * @param controllerPublishSecretRef controllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls.
         *                                   This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder controllerPublishSecretRef(imports.k8s.SecretReference controllerPublishSecretRef) {
            this.controllerPublishSecretRef = controllerPublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getFsType}
         * @param fsType fsType to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getNodeExpandSecretRef}
         * @param nodeExpandSecretRef nodeExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeExpandVolume call.
         *                            This is an alpha field and requires enabling CSINodeExpandSecret feature gate. This field is optional, may be omitted if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder nodeExpandSecretRef(imports.k8s.SecretReference nodeExpandSecretRef) {
            this.nodeExpandSecretRef = nodeExpandSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getNodePublishSecretRef}
         * @param nodePublishSecretRef nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
         *                             This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder nodePublishSecretRef(imports.k8s.SecretReference nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getNodeStageSecretRef}
         * @param nodeStageSecretRef nodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls.
         *                           This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder nodeStageSecretRef(imports.k8s.SecretReference nodeStageSecretRef) {
            this.nodeStageSecretRef = nodeStageSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getReadOnly}
         * @param readOnly readOnly value to pass to ControllerPublishVolumeRequest.
         *                 Defaults to false (read/write).
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link CsiPersistentVolumeSource#getVolumeAttributes}
         * @param volumeAttributes volumeAttributes of the volume to publish.
         * @return {@code this}
         */
        public Builder volumeAttributes(java.util.Map<java.lang.String, java.lang.String> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiPersistentVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CsiPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiPersistentVolumeSource {
        private final java.lang.String driver;
        private final java.lang.String volumeHandle;
        private final imports.k8s.SecretReference controllerExpandSecretRef;
        private final imports.k8s.SecretReference controllerPublishSecretRef;
        private final java.lang.String fsType;
        private final imports.k8s.SecretReference nodeExpandSecretRef;
        private final imports.k8s.SecretReference nodePublishSecretRef;
        private final imports.k8s.SecretReference nodeStageSecretRef;
        private final java.lang.Boolean readOnly;
        private final java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeHandle = software.amazon.jsii.Kernel.get(this, "volumeHandle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.controllerExpandSecretRef = software.amazon.jsii.Kernel.get(this, "controllerExpandSecretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
            this.controllerPublishSecretRef = software.amazon.jsii.Kernel.get(this, "controllerPublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeExpandSecretRef = software.amazon.jsii.Kernel.get(this, "nodeExpandSecretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
            this.nodePublishSecretRef = software.amazon.jsii.Kernel.get(this, "nodePublishSecretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
            this.nodeStageSecretRef = software.amazon.jsii.Kernel.get(this, "nodeStageSecretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.volumeAttributes = software.amazon.jsii.Kernel.get(this, "volumeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(builder.driver, "driver is required");
            this.volumeHandle = java.util.Objects.requireNonNull(builder.volumeHandle, "volumeHandle is required");
            this.controllerExpandSecretRef = builder.controllerExpandSecretRef;
            this.controllerPublishSecretRef = builder.controllerPublishSecretRef;
            this.fsType = builder.fsType;
            this.nodeExpandSecretRef = builder.nodeExpandSecretRef;
            this.nodePublishSecretRef = builder.nodePublishSecretRef;
            this.nodeStageSecretRef = builder.nodeStageSecretRef;
            this.readOnly = builder.readOnly;
            this.volumeAttributes = builder.volumeAttributes;
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public final java.lang.String getVolumeHandle() {
            return this.volumeHandle;
        }

        @Override
        public final imports.k8s.SecretReference getControllerExpandSecretRef() {
            return this.controllerExpandSecretRef;
        }

        @Override
        public final imports.k8s.SecretReference getControllerPublishSecretRef() {
            return this.controllerPublishSecretRef;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final imports.k8s.SecretReference getNodeExpandSecretRef() {
            return this.nodeExpandSecretRef;
        }

        @Override
        public final imports.k8s.SecretReference getNodePublishSecretRef() {
            return this.nodePublishSecretRef;
        }

        @Override
        public final imports.k8s.SecretReference getNodeStageSecretRef() {
            return this.nodeStageSecretRef;
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
            data.set("volumeHandle", om.valueToTree(this.getVolumeHandle()));
            if (this.getControllerExpandSecretRef() != null) {
                data.set("controllerExpandSecretRef", om.valueToTree(this.getControllerExpandSecretRef()));
            }
            if (this.getControllerPublishSecretRef() != null) {
                data.set("controllerPublishSecretRef", om.valueToTree(this.getControllerPublishSecretRef()));
            }
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getNodeExpandSecretRef() != null) {
                data.set("nodeExpandSecretRef", om.valueToTree(this.getNodeExpandSecretRef()));
            }
            if (this.getNodePublishSecretRef() != null) {
                data.set("nodePublishSecretRef", om.valueToTree(this.getNodePublishSecretRef()));
            }
            if (this.getNodeStageSecretRef() != null) {
                data.set("nodeStageSecretRef", om.valueToTree(this.getNodeStageSecretRef()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getVolumeAttributes() != null) {
                data.set("volumeAttributes", om.valueToTree(this.getVolumeAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CsiPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiPersistentVolumeSource.Jsii$Proxy that = (CsiPersistentVolumeSource.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (!volumeHandle.equals(that.volumeHandle)) return false;
            if (this.controllerExpandSecretRef != null ? !this.controllerExpandSecretRef.equals(that.controllerExpandSecretRef) : that.controllerExpandSecretRef != null) return false;
            if (this.controllerPublishSecretRef != null ? !this.controllerPublishSecretRef.equals(that.controllerPublishSecretRef) : that.controllerPublishSecretRef != null) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.nodeExpandSecretRef != null ? !this.nodeExpandSecretRef.equals(that.nodeExpandSecretRef) : that.nodeExpandSecretRef != null) return false;
            if (this.nodePublishSecretRef != null ? !this.nodePublishSecretRef.equals(that.nodePublishSecretRef) : that.nodePublishSecretRef != null) return false;
            if (this.nodeStageSecretRef != null ? !this.nodeStageSecretRef.equals(that.nodeStageSecretRef) : that.nodeStageSecretRef != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.volumeAttributes != null ? this.volumeAttributes.equals(that.volumeAttributes) : that.volumeAttributes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.volumeHandle.hashCode());
            result = 31 * result + (this.controllerExpandSecretRef != null ? this.controllerExpandSecretRef.hashCode() : 0);
            result = 31 * result + (this.controllerPublishSecretRef != null ? this.controllerPublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.nodeExpandSecretRef != null ? this.nodeExpandSecretRef.hashCode() : 0);
            result = 31 * result + (this.nodePublishSecretRef != null ? this.nodePublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.nodeStageSecretRef != null ? this.nodeStageSecretRef.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.volumeAttributes != null ? this.volumeAttributes.hashCode() : 0);
            return result;
        }
    }
}
