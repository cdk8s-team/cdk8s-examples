package imports.k8s;

/**
 * EventSource contains information for an event.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.843Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EventSource")
@software.amazon.jsii.Jsii.Proxy(EventSource.Jsii$Proxy.class)
public interface EventSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Component from which the event is generated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getComponent() {
        return null;
    }

    /**
     * Node name on which the event is generated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EventSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EventSource> {
        java.lang.String component;
        java.lang.String host;

        /**
         * Sets the value of {@link EventSource#getComponent}
         * @param component Component from which the event is generated.
         * @return {@code this}
         */
        public Builder component(java.lang.String component) {
            this.component = component;
            return this;
        }

        /**
         * Sets the value of {@link EventSource#getHost}
         * @param host Node name on which the event is generated.
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EventSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EventSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventSource {
        private final java.lang.String component;
        private final java.lang.String host;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.component = software.amazon.jsii.Kernel.get(this, "component", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.host = software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.component = builder.component;
            this.host = builder.host;
        }

        @Override
        public final java.lang.String getComponent() {
            return this.component;
        }

        @Override
        public final java.lang.String getHost() {
            return this.host;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getComponent() != null) {
                data.set("component", om.valueToTree(this.getComponent()));
            }
            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EventSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventSource.Jsii$Proxy that = (EventSource.Jsii$Proxy) o;

            if (this.component != null ? !this.component.equals(that.component) : that.component != null) return false;
            return this.host != null ? this.host.equals(that.host) : that.host == null;
        }

        @Override
        public final int hashCode() {
            int result = this.component != null ? this.component.hashCode() : 0;
            result = 31 * result + (this.host != null ? this.host.hashCode() : 0);
            return result;
        }
    }
}
