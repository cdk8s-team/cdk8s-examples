package imports.co.elastic.k8s.kibana;

/**
 * sessionAffinityConfig contains the configurations of session affinity.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:16.006Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.kibana.$Module.class, fqn = "coelastick8skibana.KibanaSpecHttpServiceSpecSessionAffinityConfig")
@software.amazon.jsii.Jsii.Proxy(KibanaSpecHttpServiceSpecSessionAffinityConfig.Jsii$Proxy.class)
public interface KibanaSpecHttpServiceSpecSessionAffinityConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * clientIP contains the configurations of Client IP based session affinity.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp getClientIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KibanaSpecHttpServiceSpecSessionAffinityConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KibanaSpecHttpServiceSpecSessionAffinityConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KibanaSpecHttpServiceSpecSessionAffinityConfig> {
        imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp clientIp;

        /**
         * Sets the value of {@link KibanaSpecHttpServiceSpecSessionAffinityConfig#getClientIp}
         * @param clientIp clientIP contains the configurations of Client IP based session affinity.
         * @return {@code this}
         */
        public Builder clientIp(imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KibanaSpecHttpServiceSpecSessionAffinityConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KibanaSpecHttpServiceSpecSessionAffinityConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KibanaSpecHttpServiceSpecSessionAffinityConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KibanaSpecHttpServiceSpecSessionAffinityConfig {
        private final imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp clientIp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientIp = software.amazon.jsii.Kernel.get(this, "clientIp", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientIp = builder.clientIp;
        }

        @Override
        public final imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp getClientIp() {
            return this.clientIp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientIp() != null) {
                data.set("clientIp", om.valueToTree(this.getClientIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8skibana.KibanaSpecHttpServiceSpecSessionAffinityConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KibanaSpecHttpServiceSpecSessionAffinityConfig.Jsii$Proxy that = (KibanaSpecHttpServiceSpecSessionAffinityConfig.Jsii$Proxy) o;

            return this.clientIp != null ? this.clientIp.equals(that.clientIp) : that.clientIp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientIp != null ? this.clientIp.hashCode() : 0;
            return result;
        }
    }
}
