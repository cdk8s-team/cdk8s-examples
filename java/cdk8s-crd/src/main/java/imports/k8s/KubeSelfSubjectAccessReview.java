package imports.k8s;

/**
 * SelfSubjectAccessReview checks whether or the current user can perform an action.
 * <p>
 * Not filling in a spec.namespace means "in all namespaces".  Self is a special case, because users should always be able to check whether they can perform an action
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.909Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeSelfSubjectAccessReview")
public class KubeSelfSubjectAccessReview extends org.cdk8s.ApiObject {

    protected KubeSelfSubjectAccessReview(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeSelfSubjectAccessReview(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeSelfSubjectAccessReview.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.authorization.v1.SelfSubjectAccessReview" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeSelfSubjectAccessReview(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeSelfSubjectAccessReviewProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.authorization.v1.SelfSubjectAccessReview".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeSelfSubjectAccessReviewProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeSelfSubjectAccessReview.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.authorization.v1.SelfSubjectAccessReview".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeSelfSubjectAccessReview}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeSelfSubjectAccessReview> {
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
        private final imports.k8s.KubeSelfSubjectAccessReviewProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeSelfSubjectAccessReviewProps.Builder();
        }

        /**
         * Spec holds information about the request being evaluated.
         * <p>
         * user and groups must be empty
         * <p>
         * @return {@code this}
         * @param spec Spec holds information about the request being evaluated. This parameter is required.
         */
        public Builder spec(final imports.k8s.SelfSubjectAccessReviewSpec spec) {
            this.props.spec(spec);
            return this;
        }

        /**
         * Standard list metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard list metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeSelfSubjectAccessReview}.
         */
        @Override
        public imports.k8s.KubeSelfSubjectAccessReview build() {
            return new imports.k8s.KubeSelfSubjectAccessReview(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
