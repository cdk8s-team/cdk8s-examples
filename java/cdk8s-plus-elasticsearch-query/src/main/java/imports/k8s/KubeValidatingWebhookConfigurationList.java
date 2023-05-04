package imports.k8s;

/**
 * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.860Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeValidatingWebhookConfigurationList")
public class KubeValidatingWebhookConfigurationList extends org.cdk8s.ApiObject {

    protected KubeValidatingWebhookConfigurationList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeValidatingWebhookConfigurationList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeValidatingWebhookConfigurationList.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.admissionregistration.v1.ValidatingWebhookConfigurationList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeValidatingWebhookConfigurationList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeValidatingWebhookConfigurationListProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.admissionregistration.v1.ValidatingWebhookConfigurationList".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeValidatingWebhookConfigurationListProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeValidatingWebhookConfigurationList.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.admissionregistration.v1.ValidatingWebhookConfigurationList".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeValidatingWebhookConfigurationList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeValidatingWebhookConfigurationList> {
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
        private final imports.k8s.KubeValidatingWebhookConfigurationListProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeValidatingWebhookConfigurationListProps.Builder();
        }

        /**
         * List of ValidatingWebhookConfiguration.
         * <p>
         * @return {@code this}
         * @param items List of ValidatingWebhookConfiguration. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.KubeValidatingWebhookConfigurationProps> items) {
            this.props.items(items);
            return this;
        }

        /**
         * Standard list metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * <p>
         * @return {@code this}
         * @param metadata Standard list metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ListMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeValidatingWebhookConfigurationList}.
         */
        @Override
        public imports.k8s.KubeValidatingWebhookConfigurationList build() {
            return new imports.k8s.KubeValidatingWebhookConfigurationList(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
