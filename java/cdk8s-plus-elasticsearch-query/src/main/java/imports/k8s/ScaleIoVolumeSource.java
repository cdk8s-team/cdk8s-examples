package imports.k8s;

/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.939Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ScaleIoVolumeSource")
@software.amazon.jsii.Jsii.Proxy(ScaleIoVolumeSource.Jsii$Proxy.class)
public interface ScaleIoVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * gateway is the host address of the ScaleIO API Gateway.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getGateway();

    /**
     * secretRef references to the secret for ScaleIO user and other sensitive information.
     * <p>
     * If this is not provided, Login operation will fail.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.LocalObjectReference getSecretRef();

    /**
     * system is the name of the storage system as configured in ScaleIO.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSystem();

    /**
     * fsType is the filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     * <p>
     * Default: xfs".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtectionDomain() {
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
     * sslEnabled Flag enable/disable SSL communication with Gateway, default false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSslEnabled() {
        return null;
    }

    /**
     * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
     * <p>
     * Default is ThinProvisioned.
     * <p>
     * Default: ThinProvisioned.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageMode() {
        return null;
    }

    /**
     * storagePool is the ScaleIO Storage Pool associated with the protection domain.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStoragePool() {
        return null;
    }

    /**
     * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ScaleIoVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ScaleIoVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ScaleIoVolumeSource> {
        java.lang.String gateway;
        imports.k8s.LocalObjectReference secretRef;
        java.lang.String system;
        java.lang.String fsType;
        java.lang.String protectionDomain;
        java.lang.Boolean readOnly;
        java.lang.Boolean sslEnabled;
        java.lang.String storageMode;
        java.lang.String storagePool;
        java.lang.String volumeName;

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getGateway}
         * @param gateway gateway is the host address of the ScaleIO API Gateway. This parameter is required.
         * @return {@code this}
         */
        public Builder gateway(java.lang.String gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getSecretRef}
         * @param secretRef secretRef references to the secret for ScaleIO user and other sensitive information. This parameter is required.
         *                  If this is not provided, Login operation will fail.
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getSystem}
         * @param system system is the name of the storage system as configured in ScaleIO. This parameter is required.
         * @return {@code this}
         */
        public Builder system(java.lang.String system) {
            this.system = system;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getFsType}
         * @param fsType fsType is the filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getProtectionDomain}
         * @param protectionDomain protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
         * @return {@code this}
         */
        public Builder protectionDomain(java.lang.String protectionDomain) {
            this.protectionDomain = protectionDomain;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getReadOnly}
         * @param readOnly readOnly Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getSslEnabled}
         * @param sslEnabled sslEnabled Flag enable/disable SSL communication with Gateway, default false.
         * @return {@code this}
         */
        public Builder sslEnabled(java.lang.Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getStorageMode}
         * @param storageMode storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
         *                    Default is ThinProvisioned.
         * @return {@code this}
         */
        public Builder storageMode(java.lang.String storageMode) {
            this.storageMode = storageMode;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getStoragePool}
         * @param storagePool storagePool is the ScaleIO Storage Pool associated with the protection domain.
         * @return {@code this}
         */
        public Builder storagePool(java.lang.String storagePool) {
            this.storagePool = storagePool;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIoVolumeSource#getVolumeName}
         * @param volumeName volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ScaleIoVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ScaleIoVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ScaleIoVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ScaleIoVolumeSource {
        private final java.lang.String gateway;
        private final imports.k8s.LocalObjectReference secretRef;
        private final java.lang.String system;
        private final java.lang.String fsType;
        private final java.lang.String protectionDomain;
        private final java.lang.Boolean readOnly;
        private final java.lang.Boolean sslEnabled;
        private final java.lang.String storageMode;
        private final java.lang.String storagePool;
        private final java.lang.String volumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.gateway = software.amazon.jsii.Kernel.get(this, "gateway", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.LocalObjectReference.class));
            this.system = software.amazon.jsii.Kernel.get(this, "system", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protectionDomain = software.amazon.jsii.Kernel.get(this, "protectionDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.sslEnabled = software.amazon.jsii.Kernel.get(this, "sslEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.storageMode = software.amazon.jsii.Kernel.get(this, "storageMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storagePool = software.amazon.jsii.Kernel.get(this, "storagePool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeName = software.amazon.jsii.Kernel.get(this, "volumeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gateway = java.util.Objects.requireNonNull(builder.gateway, "gateway is required");
            this.secretRef = java.util.Objects.requireNonNull(builder.secretRef, "secretRef is required");
            this.system = java.util.Objects.requireNonNull(builder.system, "system is required");
            this.fsType = builder.fsType;
            this.protectionDomain = builder.protectionDomain;
            this.readOnly = builder.readOnly;
            this.sslEnabled = builder.sslEnabled;
            this.storageMode = builder.storageMode;
            this.storagePool = builder.storagePool;
            this.volumeName = builder.volumeName;
        }

        @Override
        public final java.lang.String getGateway() {
            return this.gateway;
        }

        @Override
        public final imports.k8s.LocalObjectReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        public final java.lang.String getSystem() {
            return this.system;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.String getProtectionDomain() {
            return this.protectionDomain;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.Boolean getSslEnabled() {
            return this.sslEnabled;
        }

        @Override
        public final java.lang.String getStorageMode() {
            return this.storageMode;
        }

        @Override
        public final java.lang.String getStoragePool() {
            return this.storagePool;
        }

        @Override
        public final java.lang.String getVolumeName() {
            return this.volumeName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("gateway", om.valueToTree(this.getGateway()));
            data.set("secretRef", om.valueToTree(this.getSecretRef()));
            data.set("system", om.valueToTree(this.getSystem()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getProtectionDomain() != null) {
                data.set("protectionDomain", om.valueToTree(this.getProtectionDomain()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSslEnabled() != null) {
                data.set("sslEnabled", om.valueToTree(this.getSslEnabled()));
            }
            if (this.getStorageMode() != null) {
                data.set("storageMode", om.valueToTree(this.getStorageMode()));
            }
            if (this.getStoragePool() != null) {
                data.set("storagePool", om.valueToTree(this.getStoragePool()));
            }
            if (this.getVolumeName() != null) {
                data.set("volumeName", om.valueToTree(this.getVolumeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ScaleIoVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ScaleIoVolumeSource.Jsii$Proxy that = (ScaleIoVolumeSource.Jsii$Proxy) o;

            if (!gateway.equals(that.gateway)) return false;
            if (!secretRef.equals(that.secretRef)) return false;
            if (!system.equals(that.system)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.protectionDomain != null ? !this.protectionDomain.equals(that.protectionDomain) : that.protectionDomain != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.sslEnabled != null ? !this.sslEnabled.equals(that.sslEnabled) : that.sslEnabled != null) return false;
            if (this.storageMode != null ? !this.storageMode.equals(that.storageMode) : that.storageMode != null) return false;
            if (this.storagePool != null ? !this.storagePool.equals(that.storagePool) : that.storagePool != null) return false;
            return this.volumeName != null ? this.volumeName.equals(that.volumeName) : that.volumeName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.gateway.hashCode();
            result = 31 * result + (this.secretRef.hashCode());
            result = 31 * result + (this.system.hashCode());
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.protectionDomain != null ? this.protectionDomain.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.sslEnabled != null ? this.sslEnabled.hashCode() : 0);
            result = 31 * result + (this.storageMode != null ? this.storageMode.hashCode() : 0);
            result = 31 * result + (this.storagePool != null ? this.storagePool.hashCode() : 0);
            result = 31 * result + (this.volumeName != null ? this.volumeName.hashCode() : 0);
            return result;
        }
    }
}
