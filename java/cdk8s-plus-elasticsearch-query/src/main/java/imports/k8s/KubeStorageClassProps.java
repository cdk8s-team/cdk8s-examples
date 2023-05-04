package imports.k8s;

/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 * <p>
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.858Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeStorageClassProps")
@software.amazon.jsii.Jsii.Proxy(KubeStorageClassProps.Jsii$Proxy.class)
public interface KubeStorageClassProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Provisioner indicates the type of the provisioner.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getProvisioner();

    /**
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * <p>
     * Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.TopologySelectorTerm> getAllowedTopologies() {
        return null;
    }

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowVolumeExpansion() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptions() {
        return null;
    }

    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy.
     * <p>
     * Defaults to Delete.
     * <p>
     * Default: Delete.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReclaimPolicy() {
        return null;
    }

    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
     * <p>
     * When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeBindingMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeStorageClassProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeStorageClassProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeStorageClassProps> {
        java.lang.String provisioner;
        java.util.List<imports.k8s.TopologySelectorTerm> allowedTopologies;
        java.lang.Boolean allowVolumeExpansion;
        imports.k8s.ObjectMeta metadata;
        java.util.List<java.lang.String> mountOptions;
        java.util.Map<java.lang.String, java.lang.String> parameters;
        java.lang.String reclaimPolicy;
        java.lang.String volumeBindingMode;

        /**
         * Sets the value of {@link KubeStorageClassProps#getProvisioner}
         * @param provisioner Provisioner indicates the type of the provisioner. This parameter is required.
         * @return {@code this}
         */
        public Builder provisioner(java.lang.String provisioner) {
            this.provisioner = provisioner;
            return this;
        }

        /**
         * Sets the value of {@link KubeStorageClassProps#getAllowedTopologies}
         * @param allowedTopologies Restrict the node topologies where volumes can be dynamically provisioned.
         *                          Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder allowedTopologies(java.util.List<? extends imports.k8s.TopologySelectorTerm> allowedTopologies) {
            this.allowedTopologies = (java.util.List<imports.k8s.TopologySelectorTerm>)allowedTopologies;
            return this;
        }

        /**
         * Sets the value of {@link KubeStorageClassProps#getAllowVolumeExpansion}
         * @param allowVolumeExpansion AllowVolumeExpansion shows whether the storage class allow volume expand.
         * @return {@code this}
         */
        public Builder allowVolumeExpansion(java.lang.Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        /**
         * Sets the value of {@link KubeStorageClassProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeStorageClassProps#getMountOptions}
         * @param mountOptions Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
         * @return {@code this}
         */
        public Builder mountOptions(java.util.List<java.lang.String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        /**
         * Sets the value of {@link KubeStorageClassProps#getParameters}
         * @param parameters Parameters holds the parameters for the provisioner that should create volumes of this storage class.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link KubeStorageClassProps#getReclaimPolicy}
         * @param reclaimPolicy Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy.
         *                      Defaults to Delete.
         * @return {@code this}
         */
        public Builder reclaimPolicy(java.lang.String reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }

        /**
         * Sets the value of {@link KubeStorageClassProps#getVolumeBindingMode}
         * @param volumeBindingMode VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
         *                          When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
         * @return {@code this}
         */
        public Builder volumeBindingMode(java.lang.String volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeStorageClassProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeStorageClassProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeStorageClassProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeStorageClassProps {
        private final java.lang.String provisioner;
        private final java.util.List<imports.k8s.TopologySelectorTerm> allowedTopologies;
        private final java.lang.Boolean allowVolumeExpansion;
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<java.lang.String> mountOptions;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final java.lang.String reclaimPolicy;
        private final java.lang.String volumeBindingMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.provisioner = software.amazon.jsii.Kernel.get(this, "provisioner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowedTopologies = software.amazon.jsii.Kernel.get(this, "allowedTopologies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.TopologySelectorTerm.class)));
            this.allowVolumeExpansion = software.amazon.jsii.Kernel.get(this, "allowVolumeExpansion", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.mountOptions = software.amazon.jsii.Kernel.get(this, "mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.reclaimPolicy = software.amazon.jsii.Kernel.get(this, "reclaimPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeBindingMode = software.amazon.jsii.Kernel.get(this, "volumeBindingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.provisioner = java.util.Objects.requireNonNull(builder.provisioner, "provisioner is required");
            this.allowedTopologies = (java.util.List<imports.k8s.TopologySelectorTerm>)builder.allowedTopologies;
            this.allowVolumeExpansion = builder.allowVolumeExpansion;
            this.metadata = builder.metadata;
            this.mountOptions = builder.mountOptions;
            this.parameters = builder.parameters;
            this.reclaimPolicy = builder.reclaimPolicy;
            this.volumeBindingMode = builder.volumeBindingMode;
        }

        @Override
        public final java.lang.String getProvisioner() {
            return this.provisioner;
        }

        @Override
        public final java.util.List<imports.k8s.TopologySelectorTerm> getAllowedTopologies() {
            return this.allowedTopologies;
        }

        @Override
        public final java.lang.Boolean getAllowVolumeExpansion() {
            return this.allowVolumeExpansion;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<java.lang.String> getMountOptions() {
            return this.mountOptions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public final java.lang.String getReclaimPolicy() {
            return this.reclaimPolicy;
        }

        @Override
        public final java.lang.String getVolumeBindingMode() {
            return this.volumeBindingMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("provisioner", om.valueToTree(this.getProvisioner()));
            if (this.getAllowedTopologies() != null) {
                data.set("allowedTopologies", om.valueToTree(this.getAllowedTopologies()));
            }
            if (this.getAllowVolumeExpansion() != null) {
                data.set("allowVolumeExpansion", om.valueToTree(this.getAllowVolumeExpansion()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getMountOptions() != null) {
                data.set("mountOptions", om.valueToTree(this.getMountOptions()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getReclaimPolicy() != null) {
                data.set("reclaimPolicy", om.valueToTree(this.getReclaimPolicy()));
            }
            if (this.getVolumeBindingMode() != null) {
                data.set("volumeBindingMode", om.valueToTree(this.getVolumeBindingMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeStorageClassProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeStorageClassProps.Jsii$Proxy that = (KubeStorageClassProps.Jsii$Proxy) o;

            if (!provisioner.equals(that.provisioner)) return false;
            if (this.allowedTopologies != null ? !this.allowedTopologies.equals(that.allowedTopologies) : that.allowedTopologies != null) return false;
            if (this.allowVolumeExpansion != null ? !this.allowVolumeExpansion.equals(that.allowVolumeExpansion) : that.allowVolumeExpansion != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.mountOptions != null ? !this.mountOptions.equals(that.mountOptions) : that.mountOptions != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            if (this.reclaimPolicy != null ? !this.reclaimPolicy.equals(that.reclaimPolicy) : that.reclaimPolicy != null) return false;
            return this.volumeBindingMode != null ? this.volumeBindingMode.equals(that.volumeBindingMode) : that.volumeBindingMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.provisioner.hashCode();
            result = 31 * result + (this.allowedTopologies != null ? this.allowedTopologies.hashCode() : 0);
            result = 31 * result + (this.allowVolumeExpansion != null ? this.allowVolumeExpansion.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.mountOptions != null ? this.mountOptions.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.reclaimPolicy != null ? this.reclaimPolicy.hashCode() : 0);
            result = 31 * result + (this.volumeBindingMode != null ? this.volumeBindingMode.hashCode() : 0);
            return result;
        }
    }
}
