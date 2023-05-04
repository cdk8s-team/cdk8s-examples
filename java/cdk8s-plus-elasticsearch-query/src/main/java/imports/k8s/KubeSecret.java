package imports.k8s;

/**
 * Secret holds secret data of a certain type.
 * <p>
 * The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.851Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeSecret")
public class KubeSecret extends org.cdk8s.ApiObject {

    protected KubeSecret(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeSecret(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeSecret.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.core.v1.Secret" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props.
     */
    public KubeSecret(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.k8s.KubeSecretProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), props });
    }

    /**
     * Defines a "io.k8s.api.core.v1.Secret" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     */
    public KubeSecret(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.core.v1.Secret".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.Nullable imports.k8s.KubeSecretProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeSecret.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { props });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.core.v1.Secret".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest() {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeSecret.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.core.v1.Secret".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeSecret}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeSecret> {
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
        private imports.k8s.KubeSecretProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * Data contains the secret data.
         * <p>
         * Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
         * <p>
         * @return {@code this}
         * @param data Data contains the secret data. This parameter is required.
         */
        public Builder data(final java.util.Map<java.lang.String, java.lang.String> data) {
            this.props().data(data);
            return this;
        }

        /**
         * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).
         * <p>
         * If not set to true, the field can be modified at any time. Defaulted to nil.
         * <p>
         * @return {@code this}
         * @param immutable Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). This parameter is required.
         */
        public Builder immutable(final java.lang.Boolean immutable) {
            this.props().immutable(immutable);
            return this;
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
         * stringData allows specifying non-binary secret data in string form.
         * <p>
         * It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
         * <p>
         * @return {@code this}
         * @param stringData stringData allows specifying non-binary secret data in string form. This parameter is required.
         */
        public Builder stringData(final java.util.Map<java.lang.String, java.lang.String> stringData) {
            this.props().stringData(stringData);
            return this;
        }

        /**
         * Used to facilitate programmatic handling of secret data.
         * <p>
         * More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
         * <p>
         * @return {@code this}
         * @param type Used to facilitate programmatic handling of secret data. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.props().type(type);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeSecret}.
         */
        @Override
        public imports.k8s.KubeSecret build() {
            return new imports.k8s.KubeSecret(
                this.scope,
                this.id,
                this.props != null ? this.props.build() : null
            );
        }

        private imports.k8s.KubeSecretProps.Builder props() {
            if (this.props == null) {
                this.props = new imports.k8s.KubeSecretProps.Builder();
            }
            return this.props;
        }
    }
}
