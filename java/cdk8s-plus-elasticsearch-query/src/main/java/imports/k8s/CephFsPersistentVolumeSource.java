package imports.k8s;

/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.738Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CephFsPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(CephFsPersistentVolumeSource.Jsii$Proxy.class)
public interface CephFsPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors();

    /**
     * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretFile() {
        return null;
    }

    /**
     * secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty.
     * <p>
     * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getSecretRef() {
        return null;
    }

    /**
     * user is Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CephFsPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CephFsPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CephFsPersistentVolumeSource> {
        java.util.List<java.lang.String> monitors;
        java.lang.String path;
        java.lang.Boolean readOnly;
        java.lang.String secretFile;
        imports.k8s.SecretReference secretRef;
        java.lang.String user;

        /**
         * Sets the value of {@link CephFsPersistentVolumeSource#getMonitors}
         * @param monitors monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it. This parameter is required.
         * @return {@code this}
         */
        public Builder monitors(java.util.List<java.lang.String> monitors) {
            this.monitors = monitors;
            return this;
        }

        /**
         * Sets the value of {@link CephFsPersistentVolumeSource#getPath}
         * @param path path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link CephFsPersistentVolumeSource#getReadOnly}
         * @param readOnly readOnly is Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link CephFsPersistentVolumeSource#getSecretFile}
         * @param secretFile secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
         * @return {@code this}
         */
        public Builder secretFile(java.lang.String secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        /**
         * Sets the value of {@link CephFsPersistentVolumeSource#getSecretRef}
         * @param secretRef secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty.
         *                  More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link CephFsPersistentVolumeSource#getUser}
         * @param user user is Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CephFsPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CephFsPersistentVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CephFsPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CephFsPersistentVolumeSource {
        private final java.util.List<java.lang.String> monitors;
        private final java.lang.String path;
        private final java.lang.Boolean readOnly;
        private final java.lang.String secretFile;
        private final imports.k8s.SecretReference secretRef;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.monitors = software.amazon.jsii.Kernel.get(this, "monitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.secretFile = software.amazon.jsii.Kernel.get(this, "secretFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.monitors = java.util.Objects.requireNonNull(builder.monitors, "monitors is required");
            this.path = builder.path;
            this.readOnly = builder.readOnly;
            this.secretFile = builder.secretFile;
            this.secretRef = builder.secretRef;
            this.user = builder.user;
        }

        @Override
        public final java.util.List<java.lang.String> getMonitors() {
            return this.monitors;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.String getSecretFile() {
            return this.secretFile;
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

            data.set("monitors", om.valueToTree(this.getMonitors()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretFile() != null) {
                data.set("secretFile", om.valueToTree(this.getSecretFile()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CephFsPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CephFsPersistentVolumeSource.Jsii$Proxy that = (CephFsPersistentVolumeSource.Jsii$Proxy) o;

            if (!monitors.equals(that.monitors)) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.secretFile != null ? !this.secretFile.equals(that.secretFile) : that.secretFile != null) return false;
            if (this.secretRef != null ? !this.secretRef.equals(that.secretRef) : that.secretRef != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.monitors.hashCode();
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretFile != null ? this.secretFile.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
