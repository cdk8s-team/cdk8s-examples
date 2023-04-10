package imports.io.cert_manager;

/**
 * A Certificate resource should be created to ensure an up to date and signed x509 certificate is stored in the Kubernetes Secret resource named in `spec.secretName`.  The stored certificate will be renewed before it expires (as configured by `spec.renewBefore`).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.741Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.Certificate")
public class Certificate extends org.cdk8s.ApiObject {

    protected Certificate(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Certificate(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.io.cert_manager.Certificate.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "Certificate" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public Certificate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.io.cert_manager.CertificateProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "Certificate".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.io.cert_manager.CertificateProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.io.cert_manager.Certificate.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "Certificate".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.io.cert_manager.Certificate}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.io.cert_manager.Certificate> {
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
        private final imports.io.cert_manager.CertificateProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.io.cert_manager.CertificateProps.Builder();
        }

        /**
         * Desired state of the Certificate resource.
         * <p>
         * @return {@code this}
         * @param spec Desired state of the Certificate resource. This parameter is required.
         */
        public Builder spec(final imports.io.cert_manager.CertificateSpec spec) {
            this.props.spec(spec);
            return this;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final org.cdk8s.ApiObjectMetadata metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.io.cert_manager.Certificate}.
         */
        @Override
        public imports.io.cert_manager.Certificate build() {
            return new imports.io.cert_manager.Certificate(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
