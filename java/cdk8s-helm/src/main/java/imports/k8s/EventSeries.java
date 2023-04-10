package imports.k8s;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.843Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EventSeries")
@software.amazon.jsii.Jsii.Proxy(EventSeries.Jsii$Proxy.class)
public interface EventSeries extends software.amazon.jsii.JsiiSerializable {

    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getCount();

    /**
     * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
     */
    @org.jetbrains.annotations.NotNull java.time.Instant getLastObservedTime();

    /**
     * @return a {@link Builder} of {@link EventSeries}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventSeries}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EventSeries> {
        java.lang.Number count;
        java.time.Instant lastObservedTime;

        /**
         * Sets the value of {@link EventSeries#getCount}
         * @param count count is the number of occurrences in this series up to the last heartbeat time. This parameter is required.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EventSeries#getLastObservedTime}
         * @param lastObservedTime lastObservedTime is the time when last Event from the series was seen before last heartbeat. This parameter is required.
         * @return {@code this}
         */
        public Builder lastObservedTime(java.time.Instant lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventSeries}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EventSeries build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EventSeries}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventSeries {
        private final java.lang.Number count;
        private final java.time.Instant lastObservedTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.lastObservedTime = software.amazon.jsii.Kernel.get(this, "lastObservedTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = java.util.Objects.requireNonNull(builder.count, "count is required");
            this.lastObservedTime = java.util.Objects.requireNonNull(builder.lastObservedTime, "lastObservedTime is required");
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.time.Instant getLastObservedTime() {
            return this.lastObservedTime;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("count", om.valueToTree(this.getCount()));
            data.set("lastObservedTime", om.valueToTree(this.getLastObservedTime()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EventSeries"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventSeries.Jsii$Proxy that = (EventSeries.Jsii$Proxy) o;

            if (!count.equals(that.count)) return false;
            return this.lastObservedTime.equals(that.lastObservedTime);
        }

        @Override
        public final int hashCode() {
            int result = this.count.hashCode();
            result = 31 * result + (this.lastObservedTime.hashCode());
            return result;
        }
    }
}
