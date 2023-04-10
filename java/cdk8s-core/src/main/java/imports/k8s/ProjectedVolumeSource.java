package imports.k8s;

/**
 * Represents a projected volume source.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.943Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ProjectedVolumeSource")
@software.amazon.jsii.Jsii.Proxy(ProjectedVolumeSource.Jsii$Proxy.class)
public interface ProjectedVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * defaultMode are the mode bits used to set permissions on created files by default.
     * <p>
     * Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultMode() {
        return null;
    }

    /**
     * sources is the list of volume projections.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.VolumeProjection> getSources() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ProjectedVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ProjectedVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ProjectedVolumeSource> {
        java.lang.Number defaultMode;
        java.util.List<imports.k8s.VolumeProjection> sources;

        /**
         * Sets the value of {@link ProjectedVolumeSource#getDefaultMode}
         * @param defaultMode defaultMode are the mode bits used to set permissions on created files by default.
         *                    Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * @return {@code this}
         */
        public Builder defaultMode(java.lang.Number defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        /**
         * Sets the value of {@link ProjectedVolumeSource#getSources}
         * @param sources sources is the list of volume projections.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sources(java.util.List<? extends imports.k8s.VolumeProjection> sources) {
            this.sources = (java.util.List<imports.k8s.VolumeProjection>)sources;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ProjectedVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ProjectedVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ProjectedVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ProjectedVolumeSource {
        private final java.lang.Number defaultMode;
        private final java.util.List<imports.k8s.VolumeProjection> sources;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultMode = software.amazon.jsii.Kernel.get(this, "defaultMode", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.sources = software.amazon.jsii.Kernel.get(this, "sources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.VolumeProjection.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultMode = builder.defaultMode;
            this.sources = (java.util.List<imports.k8s.VolumeProjection>)builder.sources;
        }

        @Override
        public final java.lang.Number getDefaultMode() {
            return this.defaultMode;
        }

        @Override
        public final java.util.List<imports.k8s.VolumeProjection> getSources() {
            return this.sources;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDefaultMode() != null) {
                data.set("defaultMode", om.valueToTree(this.getDefaultMode()));
            }
            if (this.getSources() != null) {
                data.set("sources", om.valueToTree(this.getSources()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ProjectedVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ProjectedVolumeSource.Jsii$Proxy that = (ProjectedVolumeSource.Jsii$Proxy) o;

            if (this.defaultMode != null ? !this.defaultMode.equals(that.defaultMode) : that.defaultMode != null) return false;
            return this.sources != null ? this.sources.equals(that.sources) : that.sources == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultMode != null ? this.defaultMode.hashCode() : 0;
            result = 31 * result + (this.sources != null ? this.sources.hashCode() : 0);
            return result;
        }
    }
}
