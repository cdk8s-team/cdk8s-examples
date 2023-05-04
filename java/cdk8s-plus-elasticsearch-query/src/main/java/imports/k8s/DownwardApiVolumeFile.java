package imports.k8s;

/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.758Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DownwardApiVolumeFile")
@software.amazon.jsii.Jsii.Proxy(DownwardApiVolumeFile.Jsii$Proxy.class)
public interface DownwardApiVolumeFile extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required: Path is  the relative path name of the file to be created.
     * <p>
     * Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectFieldSelector getFieldRef() {
        return null;
    }

    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511.
     * <p>
     * YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMode() {
        return null;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceFieldSelector getResourceFieldRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DownwardApiVolumeFile}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DownwardApiVolumeFile}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DownwardApiVolumeFile> {
        java.lang.String path;
        imports.k8s.ObjectFieldSelector fieldRef;
        java.lang.Number mode;
        imports.k8s.ResourceFieldSelector resourceFieldRef;

        /**
         * Sets the value of {@link DownwardApiVolumeFile#getPath}
         * @param path Required: Path is  the relative path name of the file to be created. This parameter is required.
         *             Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link DownwardApiVolumeFile#getFieldRef}
         * @param fieldRef Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
         * @return {@code this}
         */
        public Builder fieldRef(imports.k8s.ObjectFieldSelector fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link DownwardApiVolumeFile#getMode}
         * @param mode Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511.
         *             YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * @return {@code this}
         */
        public Builder mode(java.lang.Number mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link DownwardApiVolumeFile#getResourceFieldRef}
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
         * @return {@code this}
         */
        public Builder resourceFieldRef(imports.k8s.ResourceFieldSelector resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DownwardApiVolumeFile}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DownwardApiVolumeFile build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DownwardApiVolumeFile}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DownwardApiVolumeFile {
        private final java.lang.String path;
        private final imports.k8s.ObjectFieldSelector fieldRef;
        private final java.lang.Number mode;
        private final imports.k8s.ResourceFieldSelector resourceFieldRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldRef = software.amazon.jsii.Kernel.get(this, "fieldRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectFieldSelector.class));
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.resourceFieldRef = software.amazon.jsii.Kernel.get(this, "resourceFieldRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceFieldSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(builder.path, "path is required");
            this.fieldRef = builder.fieldRef;
            this.mode = builder.mode;
            this.resourceFieldRef = builder.resourceFieldRef;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final imports.k8s.ObjectFieldSelector getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public final java.lang.Number getMode() {
            return this.mode;
        }

        @Override
        public final imports.k8s.ResourceFieldSelector getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getFieldRef() != null) {
                data.set("fieldRef", om.valueToTree(this.getFieldRef()));
            }
            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }
            if (this.getResourceFieldRef() != null) {
                data.set("resourceFieldRef", om.valueToTree(this.getResourceFieldRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DownwardApiVolumeFile"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DownwardApiVolumeFile.Jsii$Proxy that = (DownwardApiVolumeFile.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            if (this.fieldRef != null ? !this.fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
            if (this.mode != null ? !this.mode.equals(that.mode) : that.mode != null) return false;
            return this.resourceFieldRef != null ? this.resourceFieldRef.equals(that.resourceFieldRef) : that.resourceFieldRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.fieldRef != null ? this.fieldRef.hashCode() : 0);
            result = 31 * result + (this.mode != null ? this.mode.hashCode() : 0);
            result = 31 * result + (this.resourceFieldRef != null ? this.resourceFieldRef.hashCode() : 0);
            return result;
        }
    }
}
