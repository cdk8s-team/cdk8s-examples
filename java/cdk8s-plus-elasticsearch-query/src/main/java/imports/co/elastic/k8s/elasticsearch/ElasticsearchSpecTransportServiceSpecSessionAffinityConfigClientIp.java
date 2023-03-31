package imports.co.elastic.k8s.elasticsearch;

/**
 * clientIP contains the configurations of Client IP based session affinity.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.065Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp.Jsii$Proxy.class)
public interface ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp extends software.amazon.jsii.JsiiSerializable {

    /**
     * timeoutSeconds specifies the seconds of ClientIP type session sticky time.
     * <p>
     * The value must be &gt;0 &amp;&amp; &lt;=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp> {
        java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp#getTimeoutSeconds}
         * @param timeoutSeconds timeoutSeconds specifies the seconds of ClientIP type session sticky time.
         *                       The value must be &gt;0 &amp;&amp; &lt;=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp {
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.timeoutSeconds = software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        @Override
        public final java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp.Jsii$Proxy that = (ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp.Jsii$Proxy) o;

            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0;
            return result;
        }
    }
}
