package imports.k8s;

/**
 * PersistentVolumeClaim is a user's request for and claim to a persistent volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.895Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePersistentVolumeClaim")
public class KubePersistentVolumeClaim extends org.cdk8s.ApiObject {

    protected KubePersistentVolumeClaim(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubePersistentVolumeClaim(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubePersistentVolumeClaim.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.core.v1.PersistentVolumeClaim" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props.
     */
    public KubePersistentVolumeClaim(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.k8s.KubePersistentVolumeClaimProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), props });
    }

    /**
     * Defines a "io.k8s.api.core.v1.PersistentVolumeClaim" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     */
    public KubePersistentVolumeClaim(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.core.v1.PersistentVolumeClaim".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.Nullable imports.k8s.KubePersistentVolumeClaimProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubePersistentVolumeClaim.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { props });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.core.v1.PersistentVolumeClaim".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest() {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubePersistentVolumeClaim.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.core.v1.PersistentVolumeClaim".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubePersistentVolumeClaim}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubePersistentVolumeClaim> {
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
        private imports.k8s.KubePersistentVolumeClaimProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props().metadata(metadata);
            return this;
        }

        /**
         * spec defines the desired characteristics of a volume requested by a pod author.
         * <p>
         * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
         * <p>
         * @return {@code this}
         * @param spec spec defines the desired characteristics of a volume requested by a pod author. This parameter is required.
         */
        public Builder spec(final imports.k8s.PersistentVolumeClaimSpec spec) {
            this.props().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubePersistentVolumeClaim}.
         */
        @Override
        public imports.k8s.KubePersistentVolumeClaim build() {
            return new imports.k8s.KubePersistentVolumeClaim(
                this.scope,
                this.id,
                this.props != null ? this.props.build() : null
            );
        }

        private imports.k8s.KubePersistentVolumeClaimProps.Builder props() {
            if (this.props == null) {
                this.props = new imports.k8s.KubePersistentVolumeClaimProps.Builder();
            }
            return this.props;
        }
    }
}
