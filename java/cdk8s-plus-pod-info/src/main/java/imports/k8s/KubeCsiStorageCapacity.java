package imports.k8s;

/**
 * CSIStorageCapacity stores the result of one CSI GetCapacity call.
 * <p>
 * For a given StorageClass, this describes the available capacity in a particular topology segment.  This can be used when considering where to instantiate new PersistentVolumes.
 * <p>
 * For example this can express things like: - StorageClass "standard" has "1234 GiB" available in "topology.kubernetes.io/zone=us-east1" - StorageClass "localssd" has "10 GiB" available in "kubernetes.io/hostname=knode-abc123"
 * <p>
 * The following three cases all imply that no capacity is available for a certain combination: - no object exists with suitable topology and storage class name - such an object exists, but the capacity is unset - such an object exists, but the capacity is zero
 * <p>
 * The producer of these objects can decide which approach is more suitable.
 * <p>
 * They are consumed by the kube-scheduler when a CSI driver opts into capacity-aware scheduling with CSIDriverSpec.StorageCapacity. The scheduler compares the MaximumVolumeSize against the requested size of pending volumes to filter out unsuitable nodes. If MaximumVolumeSize is unset, it falls back to a comparison against the less precise Capacity. If that is also unset, the scheduler assumes that capacity is insufficient and tries some other node.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.872Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeCsiStorageCapacity")
public class KubeCsiStorageCapacity extends org.cdk8s.ApiObject {

    protected KubeCsiStorageCapacity(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeCsiStorageCapacity(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeCsiStorageCapacity.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.storage.v1.CSIStorageCapacity" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeCsiStorageCapacity(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeCsiStorageCapacityProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.storage.v1.CSIStorageCapacity".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeCsiStorageCapacityProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeCsiStorageCapacity.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.storage.v1.CSIStorageCapacity".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeCsiStorageCapacity}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeCsiStorageCapacity> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param id a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.k8s.KubeCsiStorageCapacityProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeCsiStorageCapacityProps.Builder();
        }

        /**
         * The name of the StorageClass that the reported capacity applies to.
         * <p>
         * It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
         * <p>
         * @return {@code this}
         * @param storageClassName The name of the StorageClass that the reported capacity applies to. This parameter is required.
         */
        public Builder storageClassName(final java.lang.String storageClassName) {
            this.props.storageClassName(storageClassName);
            return this;
        }

        /**
         * Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         * <p>
         * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable.
         * <p>
         * @return {@code this}
         * @param capacity Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields. This parameter is required.
         */
        public Builder capacity(final imports.k8s.Quantity capacity) {
            this.props.capacity(capacity);
            return this;
        }

        /**
         * MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
         * <p>
         * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
         * <p>
         * @return {@code this}
         * @param maximumVolumeSize MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields. This parameter is required.
         */
        public Builder maximumVolumeSize(final imports.k8s.Quantity maximumVolumeSize) {
            this.props.maximumVolumeSize(maximumVolumeSize);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-<uuid>, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
         * <p>
         * Objects are namespaced.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * NodeTopology defines which nodes have access to the storage for which capacity was reported.
         * <p>
         * If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
         * <p>
         * @return {@code this}
         * @param nodeTopology NodeTopology defines which nodes have access to the storage for which capacity was reported. This parameter is required.
         */
        public Builder nodeTopology(final imports.k8s.LabelSelector nodeTopology) {
            this.props.nodeTopology(nodeTopology);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeCsiStorageCapacity}.
         */
        @Override
        public imports.k8s.KubeCsiStorageCapacity build() {
            return new imports.k8s.KubeCsiStorageCapacity(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
