package imports.k8s;

/**
 * PriorityClass defines mapping from a priority class name to the priority integer value.
 * <p>
 * The value can be any valid integer.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.898Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePriorityClass")
public class KubePriorityClass extends org.cdk8s.ApiObject {

    protected KubePriorityClass(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubePriorityClass(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubePriorityClass.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.scheduling.v1.PriorityClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubePriorityClass(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubePriorityClassProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.scheduling.v1.PriorityClass".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubePriorityClassProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubePriorityClass.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.scheduling.v1.PriorityClass".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubePriorityClass}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubePriorityClass> {
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
        private final imports.k8s.KubePriorityClassProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubePriorityClassProps.Builder();
        }

        /**
         * The value of this priority class.
         * <p>
         * This is the actual priority that pods receive when they have the name of this class in their pod spec.
         * <p>
         * @return {@code this}
         * @param value The value of this priority class. This parameter is required.
         */
        public Builder value(final java.lang.Number value) {
            this.props.value(value);
            return this;
        }

        /**
         * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
         * <p>
         * @return {@code this}
         * @param description description is an arbitrary string that usually provides guidelines on when this priority class should be used. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.props.description(description);
            return this;
        }

        /**
         * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class.
         * <p>
         * Only one PriorityClass can be marked as <code>globalDefault</code>. However, if more than one PriorityClasses exists with their <code>globalDefault</code> field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
         * <p>
         * @return {@code this}
         * @param globalDefault globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. This parameter is required.
         */
        public Builder globalDefault(final java.lang.Boolean globalDefault) {
            this.props.globalDefault(globalDefault);
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
            this.props.metadata(metadata);
            return this;
        }

        /**
         * PreemptionPolicy is the Policy for preempting pods with lower priority.
         * <p>
         * One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
         * <p>
         * Default: PreemptLowerPriority if unset.
         * <p>
         * @return {@code this}
         * @param preemptionPolicy PreemptionPolicy is the Policy for preempting pods with lower priority. This parameter is required.
         */
        public Builder preemptionPolicy(final java.lang.String preemptionPolicy) {
            this.props.preemptionPolicy(preemptionPolicy);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubePriorityClass}.
         */
        @Override
        public imports.k8s.KubePriorityClass build() {
            return new imports.k8s.KubePriorityClass(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
