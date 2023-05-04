package imports.k8s;

/**
 * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.814Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeHorizontalPodAutoscalerListV2")
public class KubeHorizontalPodAutoscalerListV2 extends org.cdk8s.ApiObject {

    protected KubeHorizontalPodAutoscalerListV2(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeHorizontalPodAutoscalerListV2(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeHorizontalPodAutoscalerListV2.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeHorizontalPodAutoscalerListV2(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeHorizontalPodAutoscalerListV2Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerList".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeHorizontalPodAutoscalerListV2Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeHorizontalPodAutoscalerListV2.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.autoscaling.v2.HorizontalPodAutoscalerList".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeHorizontalPodAutoscalerListV2}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeHorizontalPodAutoscalerListV2> {
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
        private final imports.k8s.KubeHorizontalPodAutoscalerListV2Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeHorizontalPodAutoscalerListV2Props.Builder();
        }

        /**
         * items is the list of horizontal pod autoscaler objects.
         * <p>
         * @return {@code this}
         * @param items items is the list of horizontal pod autoscaler objects. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.KubeHorizontalPodAutoscalerV2Props> items) {
            this.props.items(items);
            return this;
        }

        /**
         * metadata is the standard list metadata.
         * <p>
         * @return {@code this}
         * @param metadata metadata is the standard list metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ListMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeHorizontalPodAutoscalerListV2}.
         */
        @Override
        public imports.k8s.KubeHorizontalPodAutoscalerListV2 build() {
            return new imports.k8s.KubeHorizontalPodAutoscalerListV2(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
