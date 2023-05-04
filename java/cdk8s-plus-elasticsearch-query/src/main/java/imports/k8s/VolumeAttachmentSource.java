package imports.k8s;

/**
 * VolumeAttachmentSource represents a volume that should be attached.
 * <p>
 * Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.986Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VolumeAttachmentSource")
@software.amazon.jsii.Jsii.Proxy(VolumeAttachmentSource.Jsii$Proxy.class)
public interface VolumeAttachmentSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource.
     * <p>
     * This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the CSIMigration feature.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PersistentVolumeSpec getInlineVolumeSpec() {
        return null;
    }

    /**
     * Name of the persistent volume to attach.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPersistentVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeAttachmentSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeAttachmentSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VolumeAttachmentSource> {
        imports.k8s.PersistentVolumeSpec inlineVolumeSpec;
        java.lang.String persistentVolumeName;

        /**
         * Sets the value of {@link VolumeAttachmentSource#getInlineVolumeSpec}
         * @param inlineVolumeSpec inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource.
         *                         This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the CSIMigration feature.
         * @return {@code this}
         */
        public Builder inlineVolumeSpec(imports.k8s.PersistentVolumeSpec inlineVolumeSpec) {
            this.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentSource#getPersistentVolumeName}
         * @param persistentVolumeName Name of the persistent volume to attach.
         * @return {@code this}
         */
        public Builder persistentVolumeName(java.lang.String persistentVolumeName) {
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeAttachmentSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VolumeAttachmentSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VolumeAttachmentSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeAttachmentSource {
        private final imports.k8s.PersistentVolumeSpec inlineVolumeSpec;
        private final java.lang.String persistentVolumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.inlineVolumeSpec = software.amazon.jsii.Kernel.get(this, "inlineVolumeSpec", software.amazon.jsii.NativeType.forClass(imports.k8s.PersistentVolumeSpec.class));
            this.persistentVolumeName = software.amazon.jsii.Kernel.get(this, "persistentVolumeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.inlineVolumeSpec = builder.inlineVolumeSpec;
            this.persistentVolumeName = builder.persistentVolumeName;
        }

        @Override
        public final imports.k8s.PersistentVolumeSpec getInlineVolumeSpec() {
            return this.inlineVolumeSpec;
        }

        @Override
        public final java.lang.String getPersistentVolumeName() {
            return this.persistentVolumeName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getInlineVolumeSpec() != null) {
                data.set("inlineVolumeSpec", om.valueToTree(this.getInlineVolumeSpec()));
            }
            if (this.getPersistentVolumeName() != null) {
                data.set("persistentVolumeName", om.valueToTree(this.getPersistentVolumeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeAttachmentSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeAttachmentSource.Jsii$Proxy that = (VolumeAttachmentSource.Jsii$Proxy) o;

            if (this.inlineVolumeSpec != null ? !this.inlineVolumeSpec.equals(that.inlineVolumeSpec) : that.inlineVolumeSpec != null) return false;
            return this.persistentVolumeName != null ? this.persistentVolumeName.equals(that.persistentVolumeName) : that.persistentVolumeName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.inlineVolumeSpec != null ? this.inlineVolumeSpec.hashCode() : 0;
            result = 31 * result + (this.persistentVolumeName != null ? this.persistentVolumeName.hashCode() : 0);
            return result;
        }
    }
}
