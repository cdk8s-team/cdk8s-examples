package imports.k8s;

/**
 * RuntimeClass defines a class of container runtime supported in the cluster.
 * <p>
 * The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.907Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeRuntimeClass")
public class KubeRuntimeClass extends org.cdk8s.ApiObject {

    protected KubeRuntimeClass(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeRuntimeClass(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeRuntimeClass.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.node.v1.RuntimeClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeRuntimeClass(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeRuntimeClassProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.node.v1.RuntimeClass".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeRuntimeClassProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeRuntimeClass.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.node.v1.RuntimeClass".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeRuntimeClass}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeRuntimeClass> {
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
        private final imports.k8s.KubeRuntimeClassProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeRuntimeClassProps.Builder();
        }

        /**
         * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
         * <p>
         * The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
         * <p>
         * @return {@code this}
         * @param handler Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. This parameter is required.
         */
        public Builder handler(final java.lang.String handler) {
            this.props.handler(handler);
            return this;
        }

        /**
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
         * <p>
         * For more details, see
         * https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
         * <p>
         * @return {@code this}
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This parameter is required.
         */
        public Builder overhead(final imports.k8s.Overhead overhead) {
            this.props.overhead(overhead);
            return this;
        }

        /**
         * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
         * <p>
         * If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * <p>
         * @return {@code this}
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. This parameter is required.
         */
        public Builder scheduling(final imports.k8s.Scheduling scheduling) {
            this.props.scheduling(scheduling);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeRuntimeClass}.
         */
        @Override
        public imports.k8s.KubeRuntimeClass build() {
            return new imports.k8s.KubeRuntimeClass(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
