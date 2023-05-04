package imports.k8s;

/**
 * ResourceClass is used by administrators to influence how resources are allocated.
 * <p>
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.846Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeResourceClassV1Alpha1")
public class KubeResourceClassV1Alpha1 extends org.cdk8s.ApiObject {

    protected KubeResourceClassV1Alpha1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeResourceClassV1Alpha1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeResourceClassV1Alpha1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.resource.v1alpha1.ResourceClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeResourceClassV1Alpha1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeResourceClassV1Alpha1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.resource.v1alpha1.ResourceClass".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeResourceClassV1Alpha1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeResourceClassV1Alpha1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.resource.v1alpha1.ResourceClass".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeResourceClassV1Alpha1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeResourceClassV1Alpha1> {
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
        private final imports.k8s.KubeResourceClassV1Alpha1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeResourceClassV1Alpha1Props.Builder();
        }

        /**
         * DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
         * <p>
         * Resource drivers have a unique name in forward domain order (acme.example.com).
         * <p>
         * @return {@code this}
         * @param driverName DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class. This parameter is required.
         */
        public Builder driverName(final java.lang.String driverName) {
            this.props.driverName(driverName);
            return this;
        }

        /**
         * Standard object metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class.
         * <p>
         * A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
         * <p>
         * @return {@code this}
         * @param parametersRef ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. This parameter is required.
         */
        public Builder parametersRef(final imports.k8s.ResourceClassParametersReferenceV1Alpha1 parametersRef) {
            this.props.parametersRef(parametersRef);
            return this;
        }

        /**
         * Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
         * <p>
         * Setting this field is optional. If null, all nodes are candidates.
         * <p>
         * @return {@code this}
         * @param suitableNodes Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet. This parameter is required.
         */
        public Builder suitableNodes(final imports.k8s.NodeSelector suitableNodes) {
            this.props.suitableNodes(suitableNodes);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeResourceClassV1Alpha1}.
         */
        @Override
        public imports.k8s.KubeResourceClassV1Alpha1 build() {
            return new imports.k8s.KubeResourceClassV1Alpha1(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
