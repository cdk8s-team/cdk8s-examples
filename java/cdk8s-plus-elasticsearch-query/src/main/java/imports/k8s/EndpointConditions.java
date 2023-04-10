package imports.k8s;

/**
 * EndpointConditions represents the current condition of an endpoint.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.838Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EndpointConditions")
@software.amazon.jsii.Jsii.Proxy(EndpointConditions.Jsii$Proxy.class)
public interface EndpointConditions extends software.amazon.jsii.JsiiSerializable {

    /**
     * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint.
     * <p>
     * A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be "true" for terminating endpoints.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReady() {
        return null;
    }

    /**
     * serving is identical to ready except that it is set regardless of the terminating state of endpoints.
     * <p>
     * This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getServing() {
        return null;
    }

    /**
     * terminating indicates that this endpoint is terminating.
     * <p>
     * A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTerminating() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointConditions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointConditions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EndpointConditions> {
        java.lang.Boolean ready;
        java.lang.Boolean serving;
        java.lang.Boolean terminating;

        /**
         * Sets the value of {@link EndpointConditions#getReady}
         * @param ready ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint.
         *              A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be "true" for terminating endpoints.
         * @return {@code this}
         */
        public Builder ready(java.lang.Boolean ready) {
            this.ready = ready;
            return this;
        }

        /**
         * Sets the value of {@link EndpointConditions#getServing}
         * @param serving serving is identical to ready except that it is set regardless of the terminating state of endpoints.
         *                This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition.
         * @return {@code this}
         */
        public Builder serving(java.lang.Boolean serving) {
            this.serving = serving;
            return this;
        }

        /**
         * Sets the value of {@link EndpointConditions#getTerminating}
         * @param terminating terminating indicates that this endpoint is terminating.
         *                    A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating.
         * @return {@code this}
         */
        public Builder terminating(java.lang.Boolean terminating) {
            this.terminating = terminating;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointConditions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EndpointConditions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EndpointConditions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointConditions {
        private final java.lang.Boolean ready;
        private final java.lang.Boolean serving;
        private final java.lang.Boolean terminating;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ready = software.amazon.jsii.Kernel.get(this, "ready", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.serving = software.amazon.jsii.Kernel.get(this, "serving", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.terminating = software.amazon.jsii.Kernel.get(this, "terminating", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ready = builder.ready;
            this.serving = builder.serving;
            this.terminating = builder.terminating;
        }

        @Override
        public final java.lang.Boolean getReady() {
            return this.ready;
        }

        @Override
        public final java.lang.Boolean getServing() {
            return this.serving;
        }

        @Override
        public final java.lang.Boolean getTerminating() {
            return this.terminating;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getReady() != null) {
                data.set("ready", om.valueToTree(this.getReady()));
            }
            if (this.getServing() != null) {
                data.set("serving", om.valueToTree(this.getServing()));
            }
            if (this.getTerminating() != null) {
                data.set("terminating", om.valueToTree(this.getTerminating()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointConditions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointConditions.Jsii$Proxy that = (EndpointConditions.Jsii$Proxy) o;

            if (this.ready != null ? !this.ready.equals(that.ready) : that.ready != null) return false;
            if (this.serving != null ? !this.serving.equals(that.serving) : that.serving != null) return false;
            return this.terminating != null ? this.terminating.equals(that.terminating) : that.terminating == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ready != null ? this.ready.hashCode() : 0;
            result = 31 * result + (this.serving != null ? this.serving.hashCode() : 0);
            result = 31 * result + (this.terminating != null ? this.terminating.hashCode() : 0);
            return result;
        }
    }
}
