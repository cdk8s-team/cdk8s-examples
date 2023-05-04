package imports.k8s;

/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod.
 * <p>
 * RBD volumes support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.891Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RbdPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(RbdPersistentVolumeSource.Jsii$Proxy.class)
public interface RbdPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * image is the rados image name.
     * <p>
     * More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     */
    @org.jetbrains.annotations.NotNull java.lang.String getImage();

    /**
     * monitors is a collection of Ceph monitors.
     * <p>
     * More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors();

    /**
     * fsType is the filesystem type of the volume that you want to mount.
     * <p>
     * Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * keyring is the path to key ring for RBDUser.
     * <p>
     * Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKeyring() {
        return null;
    }

    /**
     * pool is the rados pool name.
     * <p>
     * Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPool() {
        return null;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * secretRef is name of the authentication secret for RBDUser.
     * <p>
     * If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getSecretRef() {
        return null;
    }

    /**
     * user is the rados user name.
     * <p>
     * Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * <p>
     * Default: admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RbdPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RbdPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RbdPersistentVolumeSource> {
        java.lang.String image;
        java.util.List<java.lang.String> monitors;
        java.lang.String fsType;
        java.lang.String keyring;
        java.lang.String pool;
        java.lang.Boolean readOnly;
        imports.k8s.SecretReference secretRef;
        java.lang.String user;

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getImage}
         * @param image image is the rados image name. This parameter is required.
         *              More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getMonitors}
         * @param monitors monitors is a collection of Ceph monitors. This parameter is required.
         *                 More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder monitors(java.util.List<java.lang.String> monitors) {
            this.monitors = monitors;
            return this;
        }

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getFsType}
         * @param fsType fsType is the filesystem type of the volume that you want to mount.
         *               Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getKeyring}
         * @param keyring keyring is the path to key ring for RBDUser.
         *                Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder keyring(java.lang.String keyring) {
            this.keyring = keyring;
            return this;
        }

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getPool}
         * @param pool pool is the rados pool name.
         *             Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder pool(java.lang.String pool) {
            this.pool = pool;
            return this;
        }

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getReadOnly}
         * @param readOnly readOnly here will force the ReadOnly setting in VolumeMounts.
         *                 Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getSecretRef}
         * @param secretRef secretRef is name of the authentication secret for RBDUser.
         *                  If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link RbdPersistentVolumeSource#getUser}
         * @param user user is the rados user name.
         *             Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RbdPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RbdPersistentVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RbdPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RbdPersistentVolumeSource {
        private final java.lang.String image;
        private final java.util.List<java.lang.String> monitors;
        private final java.lang.String fsType;
        private final java.lang.String keyring;
        private final java.lang.String pool;
        private final java.lang.Boolean readOnly;
        private final imports.k8s.SecretReference secretRef;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.monitors = software.amazon.jsii.Kernel.get(this, "monitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.keyring = software.amazon.jsii.Kernel.get(this, "keyring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pool = software.amazon.jsii.Kernel.get(this, "pool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.image = java.util.Objects.requireNonNull(builder.image, "image is required");
            this.monitors = java.util.Objects.requireNonNull(builder.monitors, "monitors is required");
            this.fsType = builder.fsType;
            this.keyring = builder.keyring;
            this.pool = builder.pool;
            this.readOnly = builder.readOnly;
            this.secretRef = builder.secretRef;
            this.user = builder.user;
        }

        @Override
        public final java.lang.String getImage() {
            return this.image;
        }

        @Override
        public final java.util.List<java.lang.String> getMonitors() {
            return this.monitors;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.String getKeyring() {
            return this.keyring;
        }

        @Override
        public final java.lang.String getPool() {
            return this.pool;
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
        public final java.lang.String getUser() {
            return this.user;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("image", om.valueToTree(this.getImage()));
            data.set("monitors", om.valueToTree(this.getMonitors()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getKeyring() != null) {
                data.set("keyring", om.valueToTree(this.getKeyring()));
            }
            if (this.getPool() != null) {
                data.set("pool", om.valueToTree(this.getPool()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RbdPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RbdPersistentVolumeSource.Jsii$Proxy that = (RbdPersistentVolumeSource.Jsii$Proxy) o;

            if (!image.equals(that.image)) return false;
            if (!monitors.equals(that.monitors)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.keyring != null ? !this.keyring.equals(that.keyring) : that.keyring != null) return false;
            if (this.pool != null ? !this.pool.equals(that.pool) : that.pool != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.secretRef != null ? !this.secretRef.equals(that.secretRef) : that.secretRef != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.image.hashCode();
            result = 31 * result + (this.monitors.hashCode());
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.keyring != null ? this.keyring.hashCode() : 0);
            result = 31 * result + (this.pool != null ? this.pool.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
