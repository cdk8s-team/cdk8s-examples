package imports.co.elastic.k8s.apm;

/**
 * ApmServer represents an APM Server resource in a Kubernetes cluster.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:12.121Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.apm.$Module.class, fqn = "coelastick8sapm.ApmServer")
public class ApmServer extends org.cdk8s.ApiObject {

    protected ApmServer(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApmServer(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.co.elastic.k8s.apm.ApmServer.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "ApmServer" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props.
     */
    public ApmServer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.apm.ApmServerProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), props });
    }

    /**
     * Defines a "ApmServer" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     */
    public ApmServer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Renders a Kubernetes manifest for "ApmServer".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.apm.ApmServerProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.apm.ApmServer.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { props });
    }

    /**
     * Renders a Kubernetes manifest for "ApmServer".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest() {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.apm.ApmServer.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "ApmServer".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.co.elastic.k8s.apm.ApmServer}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.co.elastic.k8s.apm.ApmServer> {
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
        private imports.co.elastic.k8s.apm.ApmServerProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final org.cdk8s.ApiObjectMetadata metadata) {
            this.props().metadata(metadata);
            return this;
        }

        /**
         * ApmServerSpec holds the specification of an APM Server.
         * <p>
         * @return {@code this}
         * @param spec ApmServerSpec holds the specification of an APM Server. This parameter is required.
         */
        public Builder spec(final imports.co.elastic.k8s.apm.ApmServerSpec spec) {
            this.props().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.co.elastic.k8s.apm.ApmServer}.
         */
        @Override
        public imports.co.elastic.k8s.apm.ApmServer build() {
            return new imports.co.elastic.k8s.apm.ApmServer(
                this.scope,
                this.id,
                this.props != null ? this.props.build() : null
            );
        }

        private imports.co.elastic.k8s.apm.ApmServerProps.Builder props() {
            if (this.props == null) {
                this.props = new imports.co.elastic.k8s.apm.ApmServerProps.Builder();
            }
            return this.props;
        }
    }
}
