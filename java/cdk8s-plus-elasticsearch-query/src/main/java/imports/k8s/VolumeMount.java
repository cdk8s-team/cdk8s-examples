package imports.k8s;

/**
 * VolumeMount describes a mounting of a Volume within a container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.986Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VolumeMount")
@software.amazon.jsii.Jsii.Proxy(VolumeMount.Jsii$Proxy.class)
public interface VolumeMount extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path within the container at which the volume should be mounted.
     * <p>
     * Must not contain ':'.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMountPath();

    /**
     * This must match the Name of a Volume.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * mountPropagation determines how mounts are propagated from the host to container and the other way around.
     * <p>
     * When not set, MountPropagationNone is used. This field is beta in 1.10.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMountPropagation() {
        return null;
    }

    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified).
     * <p>
     * Defaults to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Path within the volume from which the container's volume should be mounted.
     * <p>
     * Defaults to "" (volume's root).
     * <p>
     * Default: volume's root).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubPath() {
        return null;
    }

    /**
     * Expanded path within the volume from which the container's volume should be mounted.
     * <p>
     * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
     * <p>
     * Default: volume's root). SubPathExpr and SubPath are mutually exclusive.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubPathExpr() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeMount}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeMount}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VolumeMount> {
        java.lang.String mountPath;
        java.lang.String name;
        java.lang.String mountPropagation;
        java.lang.Boolean readOnly;
        java.lang.String subPath;
        java.lang.String subPathExpr;

        /**
         * Sets the value of {@link VolumeMount#getMountPath}
         * @param mountPath Path within the container at which the volume should be mounted. This parameter is required.
         *                  Must not contain ':'.
         * @return {@code this}
         */
        public Builder mountPath(java.lang.String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * Sets the value of {@link VolumeMount#getName}
         * @param name This must match the Name of a Volume. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link VolumeMount#getMountPropagation}
         * @param mountPropagation mountPropagation determines how mounts are propagated from the host to container and the other way around.
         *                         When not set, MountPropagationNone is used. This field is beta in 1.10.
         * @return {@code this}
         */
        public Builder mountPropagation(java.lang.String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }

        /**
         * Sets the value of {@link VolumeMount#getReadOnly}
         * @param readOnly Mounted read-only if true, read-write otherwise (false or unspecified).
         *                 Defaults to false.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link VolumeMount#getSubPath}
         * @param subPath Path within the volume from which the container's volume should be mounted.
         *                Defaults to "" (volume's root).
         * @return {@code this}
         */
        public Builder subPath(java.lang.String subPath) {
            this.subPath = subPath;
            return this;
        }

        /**
         * Sets the value of {@link VolumeMount#getSubPathExpr}
         * @param subPathExpr Expanded path within the volume from which the container's volume should be mounted.
         *                    Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
         * @return {@code this}
         */
        public Builder subPathExpr(java.lang.String subPathExpr) {
            this.subPathExpr = subPathExpr;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeMount}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VolumeMount build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VolumeMount}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeMount {
        private final java.lang.String mountPath;
        private final java.lang.String name;
        private final java.lang.String mountPropagation;
        private final java.lang.Boolean readOnly;
        private final java.lang.String subPath;
        private final java.lang.String subPathExpr;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.mountPath = software.amazon.jsii.Kernel.get(this, "mountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mountPropagation = software.amazon.jsii.Kernel.get(this, "mountPropagation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.subPath = software.amazon.jsii.Kernel.get(this, "subPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subPathExpr = software.amazon.jsii.Kernel.get(this, "subPathExpr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.mountPath = java.util.Objects.requireNonNull(builder.mountPath, "mountPath is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.mountPropagation = builder.mountPropagation;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
            this.subPathExpr = builder.subPathExpr;
        }

        @Override
        public final java.lang.String getMountPath() {
            return this.mountPath;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getMountPropagation() {
            return this.mountPropagation;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.String getSubPath() {
            return this.subPath;
        }

        @Override
        public final java.lang.String getSubPathExpr() {
            return this.subPathExpr;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("mountPath", om.valueToTree(this.getMountPath()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getMountPropagation() != null) {
                data.set("mountPropagation", om.valueToTree(this.getMountPropagation()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSubPath() != null) {
                data.set("subPath", om.valueToTree(this.getSubPath()));
            }
            if (this.getSubPathExpr() != null) {
                data.set("subPathExpr", om.valueToTree(this.getSubPathExpr()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeMount"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeMount.Jsii$Proxy that = (VolumeMount.Jsii$Proxy) o;

            if (!mountPath.equals(that.mountPath)) return false;
            if (!name.equals(that.name)) return false;
            if (this.mountPropagation != null ? !this.mountPropagation.equals(that.mountPropagation) : that.mountPropagation != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.subPath != null ? !this.subPath.equals(that.subPath) : that.subPath != null) return false;
            return this.subPathExpr != null ? this.subPathExpr.equals(that.subPathExpr) : that.subPathExpr == null;
        }

        @Override
        public final int hashCode() {
            int result = this.mountPath.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.mountPropagation != null ? this.mountPropagation.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.subPath != null ? this.subPath.hashCode() : 0);
            result = 31 * result + (this.subPathExpr != null ? this.subPathExpr.hashCode() : 0);
            return result;
        }
    }
}
