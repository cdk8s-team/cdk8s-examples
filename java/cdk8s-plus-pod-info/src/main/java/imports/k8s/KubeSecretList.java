package imports.k8s;

/**
 * SecretList is a list of Secret.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.909Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeSecretList")
public class KubeSecretList extends org.cdk8s.ApiObject {

    protected KubeSecretList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeSecretList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeSecretList.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.core.v1.SecretList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeSecretList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeSecretListProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.core.v1.SecretList".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeSecretListProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeSecretList.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.core.v1.SecretList".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeSecretList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeSecretList> {
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
        private final imports.k8s.KubeSecretListProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeSecretListProps.Builder();
        }

        /**
         * Items is a list of secret objects.
         * <p>
         * More info: https://kubernetes.io/docs/concepts/configuration/secret
         * <p>
         * @return {@code this}
         * @param items Items is a list of secret objects. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.KubeSecretProps> items) {
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
         * @returns a newly built instance of {@link imports.k8s.KubeSecretList}.
         */
        @Override
        public imports.k8s.KubeSecretList build() {
            return new imports.k8s.KubeSecretList(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
