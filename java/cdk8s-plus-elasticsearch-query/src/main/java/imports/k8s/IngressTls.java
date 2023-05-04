package imports.k8s;

/**
 * IngressTLS describes the transport layer security associated with an Ingress.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.775Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IngressTls")
@software.amazon.jsii.Jsii.Proxy(IngressTls.Jsii$Proxy.class)
public interface IngressTls extends software.amazon.jsii.JsiiSerializable {

    /**
     * Hosts are a list of hosts included in the TLS certificate.
     * <p>
     * The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * <p>
     * Default: the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHosts() {
        return null;
    }

    /**
     * SecretName is the name of the secret used to terminate TLS traffic on port 443.
     * <p>
     * Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressTls}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressTls}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressTls> {
        java.util.List<java.lang.String> hosts;
        java.lang.String secretName;

        /**
         * Sets the value of {@link IngressTls#getHosts}
         * @param hosts Hosts are a list of hosts included in the TLS certificate.
         *              The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
         * @return {@code this}
         */
        public Builder hosts(java.util.List<java.lang.String> hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * Sets the value of {@link IngressTls#getSecretName}
         * @param secretName SecretName is the name of the secret used to terminate TLS traffic on port 443.
         *                   Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressTls}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressTls build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressTls}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressTls {
        private final java.util.List<java.lang.String> hosts;
        private final java.lang.String secretName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hosts = software.amazon.jsii.Kernel.get(this, "hosts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.secretName = software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hosts = builder.hosts;
            this.secretName = builder.secretName;
        }

        @Override
        public final java.util.List<java.lang.String> getHosts() {
            return this.hosts;
        }

        @Override
        public final java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHosts() != null) {
                data.set("hosts", om.valueToTree(this.getHosts()));
            }
            if (this.getSecretName() != null) {
                data.set("secretName", om.valueToTree(this.getSecretName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressTls"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressTls.Jsii$Proxy that = (IngressTls.Jsii$Proxy) o;

            if (this.hosts != null ? !this.hosts.equals(that.hosts) : that.hosts != null) return false;
            return this.secretName != null ? this.secretName.equals(that.secretName) : that.secretName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hosts != null ? this.hosts.hashCode() : 0;
            result = 31 * result + (this.secretName != null ? this.secretName.hashCode() : 0);
            return result;
        }
    }
}
