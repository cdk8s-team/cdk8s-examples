package imports.k8s;

/**
 * RuntimeClass defines a class of container runtime supported in the cluster.
 * <p>
 * The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.908Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeRuntimeClassProps")
@software.amazon.jsii.Jsii.Proxy(KubeRuntimeClassProps.Jsii$Proxy.class)
public interface KubeRuntimeClassProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
     * <p>
     * The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getHandler();

    /**
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
     * <p>
     * For more details, see
     * https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Overhead getOverhead() {
        return null;
    }

    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
     * <p>
     * If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Scheduling getScheduling() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeRuntimeClassProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeRuntimeClassProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeRuntimeClassProps> {
        java.lang.String handler;
        imports.k8s.ObjectMeta metadata;
        imports.k8s.Overhead overhead;
        imports.k8s.Scheduling scheduling;

        /**
         * Sets the value of {@link KubeRuntimeClassProps#getHandler}
         * @param handler Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. This parameter is required.
         *                The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
         * @return {@code this}
         */
        public Builder handler(java.lang.String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * Sets the value of {@link KubeRuntimeClassProps#getMetadata}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeRuntimeClassProps#getOverhead}
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
         *                 For more details, see
         *                 https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
         * @return {@code this}
         */
        public Builder overhead(imports.k8s.Overhead overhead) {
            this.overhead = overhead;
            return this;
        }

        /**
         * Sets the value of {@link KubeRuntimeClassProps#getScheduling}
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
         *                   If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * @return {@code this}
         */
        public Builder scheduling(imports.k8s.Scheduling scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeRuntimeClassProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeRuntimeClassProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeRuntimeClassProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeRuntimeClassProps {
        private final java.lang.String handler;
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.Overhead overhead;
        private final imports.k8s.Scheduling scheduling;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.handler = software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.overhead = software.amazon.jsii.Kernel.get(this, "overhead", software.amazon.jsii.NativeType.forClass(imports.k8s.Overhead.class));
            this.scheduling = software.amazon.jsii.Kernel.get(this, "scheduling", software.amazon.jsii.NativeType.forClass(imports.k8s.Scheduling.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.handler = java.util.Objects.requireNonNull(builder.handler, "handler is required");
            this.metadata = builder.metadata;
            this.overhead = builder.overhead;
            this.scheduling = builder.scheduling;
        }

        @Override
        public final java.lang.String getHandler() {
            return this.handler;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.Overhead getOverhead() {
            return this.overhead;
        }

        @Override
        public final imports.k8s.Scheduling getScheduling() {
            return this.scheduling;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("handler", om.valueToTree(this.getHandler()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getOverhead() != null) {
                data.set("overhead", om.valueToTree(this.getOverhead()));
            }
            if (this.getScheduling() != null) {
                data.set("scheduling", om.valueToTree(this.getScheduling()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeRuntimeClassProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeRuntimeClassProps.Jsii$Proxy that = (KubeRuntimeClassProps.Jsii$Proxy) o;

            if (!handler.equals(that.handler)) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.overhead != null ? !this.overhead.equals(that.overhead) : that.overhead != null) return false;
            return this.scheduling != null ? this.scheduling.equals(that.scheduling) : that.scheduling == null;
        }

        @Override
        public final int hashCode() {
            int result = this.handler.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.overhead != null ? this.overhead.hashCode() : 0);
            result = 31 * result + (this.scheduling != null ? this.scheduling.hashCode() : 0);
            return result;
        }
    }
}
