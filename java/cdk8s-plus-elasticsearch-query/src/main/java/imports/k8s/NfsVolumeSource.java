package imports.k8s;

/**
 * Represents an NFS mount that lasts the lifetime of a pod.
 * <p>
 * NFS volumes do not support ownership management or SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.870Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NfsVolumeSource")
@software.amazon.jsii.Jsii.Proxy(NfsVolumeSource.Jsii$Proxy.class)
public interface NfsVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * path that is exported by the NFS server.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * server is the hostname or IP address of the NFS server.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServer();

    /**
     * readOnly here will force the NFS export to be mounted with read-only permissions.
     * <p>
     * Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * <p>
     * Default: false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NfsVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NfsVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NfsVolumeSource> {
        java.lang.String path;
        java.lang.String server;
        java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link NfsVolumeSource#getPath}
         * @param path path that is exported by the NFS server. This parameter is required.
         *             More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link NfsVolumeSource#getServer}
         * @param server server is the hostname or IP address of the NFS server. This parameter is required.
         *               More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
         * @return {@code this}
         */
        public Builder server(java.lang.String server) {
            this.server = server;
            return this;
        }

        /**
         * Sets the value of {@link NfsVolumeSource#getReadOnly}
         * @param readOnly readOnly here will force the NFS export to be mounted with read-only permissions.
         *                 Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NfsVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NfsVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NfsVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NfsVolumeSource {
        private final java.lang.String path;
        private final java.lang.String server;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.server = software.amazon.jsii.Kernel.get(this, "server", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.server = java.util.Objects.requireNonNull(builder.server, "server is required");
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getServer() {
            return this.server;
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

            data.set("path", om.valueToTree(this.getPath()));
            data.set("server", om.valueToTree(this.getServer()));
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NfsVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NfsVolumeSource.Jsii$Proxy that = (NfsVolumeSource.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            if (!server.equals(that.server)) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.server.hashCode());
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
