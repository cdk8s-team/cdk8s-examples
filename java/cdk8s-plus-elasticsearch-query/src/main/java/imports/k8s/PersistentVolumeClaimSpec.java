package imports.k8s;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.879Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PersistentVolumeClaimSpec")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeClaimSpec.Jsii$Proxy.class)
public interface PersistentVolumeClaimSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * accessModes contains the desired access modes the volume should have.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessModes() {
        return null;
    }

    /**
     * dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. When the AnyVolumeDataSource feature gate is enabled, dataSource contents will be copied to dataSourceRef, and dataSourceRef contents will be copied to dataSource when dataSourceRef.namespace is not specified. If the namespace is specified, then dataSourceRef will not be copied to dataSource.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.TypedLocalObjectReference getDataSource() {
        return null;
    }

    /**
     * dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired.
     * <p>
     * This may be any object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the dataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, when namespace isn't specified in dataSourceRef, both fields (dataSource and dataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. When namespace is specified in dataSourceRef, dataSource isn't set to the same value and must be empty. There are three important differences between dataSource and dataSourceRef: * While dataSource only allows two specific types of objects, dataSourceRef
     * allows any non-core object, as well as PersistentVolumeClaim objects.
     * <p>
     * <ul>
     * <li>While dataSource ignores disallowed values (dropping them), dataSourceRef
     * preserves all values, and generates an error if a disallowed value is
     * specified.</li>
     * <li>While dataSource only allows local objects, dataSourceRef allows objects
     * in any namespaces.
     * (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled. (Alpha) Using the namespace field of dataSourceRef requires the CrossNamespaceVolumeDataSource feature gate to be enabled.</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.TypedObjectReference getDataSourceRef() {
        return null;
    }

    /**
     * resources represents the minimum resources the volume should have.
     * <p>
     * If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceRequirements getResources() {
        return null;
    }

    /**
     * selector is a label query over volumes to consider for binding.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * storageClassName is the name of the StorageClass required by the claim.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * volumeMode defines what type of volume is required by the claim.
     * <p>
     * Value of Filesystem is implied when not included in claim spec.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeMode() {
        return null;
    }

    /**
     * volumeName is the binding reference to the PersistentVolume backing this claim.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeClaimSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeClaimSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeClaimSpec> {
        java.util.List<java.lang.String> accessModes;
        imports.k8s.TypedLocalObjectReference dataSource;
        imports.k8s.TypedObjectReference dataSourceRef;
        imports.k8s.ResourceRequirements resources;
        imports.k8s.LabelSelector selector;
        java.lang.String storageClassName;
        java.lang.String volumeMode;
        java.lang.String volumeName;

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getAccessModes}
         * @param accessModes accessModes contains the desired access modes the volume should have.
         *                    More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getDataSource}
         * @param dataSource dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. When the AnyVolumeDataSource feature gate is enabled, dataSource contents will be copied to dataSourceRef, and dataSourceRef contents will be copied to dataSource when dataSourceRef.namespace is not specified. If the namespace is specified, then dataSourceRef will not be copied to dataSource.
         * @return {@code this}
         */
        public Builder dataSource(imports.k8s.TypedLocalObjectReference dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getDataSourceRef}
         * @param dataSourceRef dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired.
         *                      This may be any object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the dataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, when namespace isn't specified in dataSourceRef, both fields (dataSource and dataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. When namespace is specified in dataSourceRef, dataSource isn't set to the same value and must be empty. There are three important differences between dataSource and dataSourceRef: * While dataSource only allows two specific types of objects, dataSourceRef
         *                      allows any non-core object, as well as PersistentVolumeClaim objects.
         *                      <p>
         *                      <ul>
         *                      <li>While dataSource ignores disallowed values (dropping them), dataSourceRef
         *                      preserves all values, and generates an error if a disallowed value is
         *                      specified.</li>
         *                      <li>While dataSource only allows local objects, dataSourceRef allows objects
         *                      in any namespaces.
         *                      (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled. (Alpha) Using the namespace field of dataSourceRef requires the CrossNamespaceVolumeDataSource feature gate to be enabled.</li>
         *                      </ul>
         * @return {@code this}
         */
        public Builder dataSourceRef(imports.k8s.TypedObjectReference dataSourceRef) {
            this.dataSourceRef = dataSourceRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getResources}
         * @param resources resources represents the minimum resources the volume should have.
         *                  If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
         * @return {@code this}
         */
        public Builder resources(imports.k8s.ResourceRequirements resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getSelector}
         * @param selector selector is a label query over volumes to consider for binding.
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getStorageClassName}
         * @param storageClassName storageClassName is the name of the StorageClass required by the claim.
         *                         More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getVolumeMode}
         * @param volumeMode volumeMode defines what type of volume is required by the claim.
         *                   Value of Filesystem is implied when not included in claim spec.
         * @return {@code this}
         */
        public Builder volumeMode(java.lang.String volumeMode) {
            this.volumeMode = volumeMode;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getVolumeName}
         * @param volumeName volumeName is the binding reference to the PersistentVolume backing this claim.
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeClaimSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeClaimSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeClaimSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeClaimSpec {
        private final java.util.List<java.lang.String> accessModes;
        private final imports.k8s.TypedLocalObjectReference dataSource;
        private final imports.k8s.TypedObjectReference dataSourceRef;
        private final imports.k8s.ResourceRequirements resources;
        private final imports.k8s.LabelSelector selector;
        private final java.lang.String storageClassName;
        private final java.lang.String volumeMode;
        private final java.lang.String volumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.dataSource = software.amazon.jsii.Kernel.get(this, "dataSource", software.amazon.jsii.NativeType.forClass(imports.k8s.TypedLocalObjectReference.class));
            this.dataSourceRef = software.amazon.jsii.Kernel.get(this, "dataSourceRef", software.amazon.jsii.NativeType.forClass(imports.k8s.TypedObjectReference.class));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceRequirements.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.storageClassName = software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeMode = software.amazon.jsii.Kernel.get(this, "volumeMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeName = software.amazon.jsii.Kernel.get(this, "volumeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessModes = builder.accessModes;
            this.dataSource = builder.dataSource;
            this.dataSourceRef = builder.dataSourceRef;
            this.resources = builder.resources;
            this.selector = builder.selector;
            this.storageClassName = builder.storageClassName;
            this.volumeMode = builder.volumeMode;
            this.volumeName = builder.volumeName;
        }

        @Override
        public final java.util.List<java.lang.String> getAccessModes() {
            return this.accessModes;
        }

        @Override
        public final imports.k8s.TypedLocalObjectReference getDataSource() {
            return this.dataSource;
        }

        @Override
        public final imports.k8s.TypedObjectReference getDataSourceRef() {
            return this.dataSourceRef;
        }

        @Override
        public final imports.k8s.ResourceRequirements getResources() {
            return this.resources;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getStorageClassName() {
            return this.storageClassName;
        }

        @Override
        public final java.lang.String getVolumeMode() {
            return this.volumeMode;
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

            if (this.getAccessModes() != null) {
                data.set("accessModes", om.valueToTree(this.getAccessModes()));
            }
            if (this.getDataSource() != null) {
                data.set("dataSource", om.valueToTree(this.getDataSource()));
            }
            if (this.getDataSourceRef() != null) {
                data.set("dataSourceRef", om.valueToTree(this.getDataSourceRef()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getStorageClassName() != null) {
                data.set("storageClassName", om.valueToTree(this.getStorageClassName()));
            }
            if (this.getVolumeMode() != null) {
                data.set("volumeMode", om.valueToTree(this.getVolumeMode()));
            }
            if (this.getVolumeName() != null) {
                data.set("volumeName", om.valueToTree(this.getVolumeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PersistentVolumeClaimSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeClaimSpec.Jsii$Proxy that = (PersistentVolumeClaimSpec.Jsii$Proxy) o;

            if (this.accessModes != null ? !this.accessModes.equals(that.accessModes) : that.accessModes != null) return false;
            if (this.dataSource != null ? !this.dataSource.equals(that.dataSource) : that.dataSource != null) return false;
            if (this.dataSourceRef != null ? !this.dataSourceRef.equals(that.dataSourceRef) : that.dataSourceRef != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.storageClassName != null ? !this.storageClassName.equals(that.storageClassName) : that.storageClassName != null) return false;
            if (this.volumeMode != null ? !this.volumeMode.equals(that.volumeMode) : that.volumeMode != null) return false;
            return this.volumeName != null ? this.volumeName.equals(that.volumeName) : that.volumeName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessModes != null ? this.accessModes.hashCode() : 0;
            result = 31 * result + (this.dataSource != null ? this.dataSource.hashCode() : 0);
            result = 31 * result + (this.dataSourceRef != null ? this.dataSourceRef.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.storageClassName != null ? this.storageClassName.hashCode() : 0);
            result = 31 * result + (this.volumeMode != null ? this.volumeMode.hashCode() : 0);
            result = 31 * result + (this.volumeName != null ? this.volumeName.hashCode() : 0);
            return result;
        }
    }
}
