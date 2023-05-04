package imports.k8s;

/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events.
 * <p>
 * For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.861Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Lifecycle")
@software.amazon.jsii.Jsii.Proxy(Lifecycle.Jsii$Proxy.class)
public interface Lifecycle extends software.amazon.jsii.JsiiSerializable {

    /**
     * PostStart is called immediately after a container is created.
     * <p>
     * If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LifecycleHandler getPostStart() {
        return null;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
     * <p>
     * The handler is not called if the container crashes or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LifecycleHandler getPreStop() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Lifecycle}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Lifecycle}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Lifecycle> {
        imports.k8s.LifecycleHandler postStart;
        imports.k8s.LifecycleHandler preStop;

        /**
         * Sets the value of {@link Lifecycle#getPostStart}
         * @param postStart PostStart is called immediately after a container is created.
         *                  If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * @return {@code this}
         */
        public Builder postStart(imports.k8s.LifecycleHandler postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * Sets the value of {@link Lifecycle#getPreStop}
         * @param preStop PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
         *                The handler is not called if the container crashes or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * @return {@code this}
         */
        public Builder preStop(imports.k8s.LifecycleHandler preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Lifecycle}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Lifecycle build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Lifecycle}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Lifecycle {
        private final imports.k8s.LifecycleHandler postStart;
        private final imports.k8s.LifecycleHandler preStop;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.postStart = software.amazon.jsii.Kernel.get(this, "postStart", software.amazon.jsii.NativeType.forClass(imports.k8s.LifecycleHandler.class));
            this.preStop = software.amazon.jsii.Kernel.get(this, "preStop", software.amazon.jsii.NativeType.forClass(imports.k8s.LifecycleHandler.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
        }

        @Override
        public final imports.k8s.LifecycleHandler getPostStart() {
            return this.postStart;
        }

        @Override
        public final imports.k8s.LifecycleHandler getPreStop() {
            return this.preStop;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPostStart() != null) {
                data.set("postStart", om.valueToTree(this.getPostStart()));
            }
            if (this.getPreStop() != null) {
                data.set("preStop", om.valueToTree(this.getPreStop()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Lifecycle"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Lifecycle.Jsii$Proxy that = (Lifecycle.Jsii$Proxy) o;

            if (this.postStart != null ? !this.postStart.equals(that.postStart) : that.postStart != null) return false;
            return this.preStop != null ? this.preStop.equals(that.preStop) : that.preStop == null;
        }

        @Override
        public final int hashCode() {
            int result = this.postStart != null ? this.postStart.hashCode() : 0;
            result = 31 * result + (this.preStop != null ? this.preStop.hashCode() : 0);
            return result;
        }
    }
}
