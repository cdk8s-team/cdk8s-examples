package imports.k8s;

/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod.
 * <p>
 * Glusterfs volumes do not support ownership management or SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.771Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.GlusterfsPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(GlusterfsPersistentVolumeSource.Jsii$Proxy.class)
public interface GlusterfsPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * endpoints is the endpoint name that details Glusterfs topology.
     * <p>
     * More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEndpoints();

    /**
     * path is the Glusterfs volume path.
     * <p>
     * More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * endpointsNamespace is the namespace that contains Glusterfs endpoint.
     * <p>
     * If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEndpointsNamespace() {
        return null;
    }

    /**
     * readOnly here will force the Glusterfs volume to be mounted with read-only permissions.
     * <p>
     * Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * <p>
     * Default: false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlusterfsPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlusterfsPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlusterfsPersistentVolumeSource> {
        java.lang.String endpoints;
        java.lang.String path;
        java.lang.String endpointsNamespace;
        java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getEndpoints}
         * @param endpoints endpoints is the endpoint name that details Glusterfs topology. This parameter is required.
         *                  More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder endpoints(java.lang.String endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getPath}
         * @param path path is the Glusterfs volume path. This parameter is required.
         *             More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getEndpointsNamespace}
         * @param endpointsNamespace endpointsNamespace is the namespace that contains Glusterfs endpoint.
         *                           If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder endpointsNamespace(java.lang.String endpointsNamespace) {
            this.endpointsNamespace = endpointsNamespace;
            return this;
        }

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getReadOnly}
         * @param readOnly readOnly here will force the Glusterfs volume to be mounted with read-only permissions.
         *                 Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlusterfsPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlusterfsPersistentVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlusterfsPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlusterfsPersistentVolumeSource {
        private final java.lang.String endpoints;
        private final java.lang.String path;
        private final java.lang.String endpointsNamespace;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpoints = software.amazon.jsii.Kernel.get(this, "endpoints", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpointsNamespace = software.amazon.jsii.Kernel.get(this, "endpointsNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpoints = java.util.Objects.requireNonNull(builder.endpoints, "endpoints is required");
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.endpointsNamespace = builder.endpointsNamespace;
            this.readOnly = builder.readOnly;
        }

        @Override
        public final java.lang.String getEndpoints() {
            return this.endpoints;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getEndpointsNamespace() {
            return this.endpointsNamespace;
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

            data.set("endpoints", om.valueToTree(this.getEndpoints()));
            data.set("path", om.valueToTree(this.getPath()));
            if (this.getEndpointsNamespace() != null) {
                data.set("endpointsNamespace", om.valueToTree(this.getEndpointsNamespace()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.GlusterfsPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlusterfsPersistentVolumeSource.Jsii$Proxy that = (GlusterfsPersistentVolumeSource.Jsii$Proxy) o;

            if (!endpoints.equals(that.endpoints)) return false;
            if (!path.equals(that.path)) return false;
            if (this.endpointsNamespace != null ? !this.endpointsNamespace.equals(that.endpointsNamespace) : that.endpointsNamespace != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endpoints.hashCode();
            result = 31 * result + (this.path.hashCode());
            result = 31 * result + (this.endpointsNamespace != null ? this.endpointsNamespace.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
