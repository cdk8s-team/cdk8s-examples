package imports.k8s;

/**
 * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.906Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeRole")
public class KubeRole extends org.cdk8s.ApiObject {

    protected KubeRole(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeRole(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeRole.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.rbac.v1.Role" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props.
     */
    public KubeRole(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.k8s.KubeRoleProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), props });
    }

    /**
     * Defines a "io.k8s.api.rbac.v1.Role" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     */
    public KubeRole(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.rbac.v1.Role".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.Nullable imports.k8s.KubeRoleProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeRole.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { props });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.rbac.v1.Role".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest() {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeRole.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.rbac.v1.Role".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeRole}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeRole> {
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
        private imports.k8s.KubeRoleProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * Standard object's metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props().metadata(metadata);
            return this;
        }

        /**
         * Rules holds all the PolicyRules for this Role.
         * <p>
         * @return {@code this}
         * @param rules Rules holds all the PolicyRules for this Role. This parameter is required.
         */
        public Builder rules(final java.util.List<? extends imports.k8s.PolicyRule> rules) {
            this.props().rules(rules);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeRole}.
         */
        @Override
        public imports.k8s.KubeRole build() {
            return new imports.k8s.KubeRole(
                this.scope,
                this.id,
                this.props != null ? this.props.build() : null
            );
        }

        private imports.k8s.KubeRoleProps.Builder props() {
            if (this.props == null) {
                this.props = new imports.k8s.KubeRoleProps.Builder();
            }
            return this.props;
        }
    }
}
