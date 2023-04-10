package imports.co.elastic.k8s.apm;

/**
 * Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.
 * <p>
 * The referenced secret should contain the following:
 * <p>
 * <ul>
 * <li><code>ca.crt</code>: The certificate authority (optional). - <code>tls.crt</code>: The certificate (or a chain). - <code>tls.key</code>: The private key to the first certificate in the certificate chain.</li>
 * </ul>
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:12.132Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.apm.$Module.class, fqn = "coelastick8sapm.ApmServerSpecHttpTlsCertificate")
@software.amazon.jsii.Jsii.Proxy(ApmServerSpecHttpTlsCertificate.Jsii$Proxy.class)
public interface ApmServerSpecHttpTlsCertificate extends software.amazon.jsii.JsiiSerializable {

    /**
     * SecretName is the name of the secret.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApmServerSpecHttpTlsCertificate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApmServerSpecHttpTlsCertificate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApmServerSpecHttpTlsCertificate> {
        java.lang.String secretName;

        /**
         * Sets the value of {@link ApmServerSpecHttpTlsCertificate#getSecretName}
         * @param secretName SecretName is the name of the secret.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApmServerSpecHttpTlsCertificate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApmServerSpecHttpTlsCertificate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApmServerSpecHttpTlsCertificate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApmServerSpecHttpTlsCertificate {
        private final java.lang.String secretName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.secretName = software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.secretName = builder.secretName;
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

            if (this.getSecretName() != null) {
                data.set("secretName", om.valueToTree(this.getSecretName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8sapm.ApmServerSpecHttpTlsCertificate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApmServerSpecHttpTlsCertificate.Jsii$Proxy that = (ApmServerSpecHttpTlsCertificate.Jsii$Proxy) o;

            return this.secretName != null ? this.secretName.equals(that.secretName) : that.secretName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.secretName != null ? this.secretName.hashCode() : 0;
            return result;
        }
    }
}
