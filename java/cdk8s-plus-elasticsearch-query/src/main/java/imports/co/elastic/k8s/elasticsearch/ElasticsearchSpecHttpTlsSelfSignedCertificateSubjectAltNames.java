package imports.co.elastic.k8s.elasticsearch;

/**
 * SubjectAlternativeName represents a SAN entry in a x509 certificate.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.057Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames.Jsii$Proxy.class)
public interface ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames extends software.amazon.jsii.JsiiSerializable {

    /**
     * DNS is the DNS name of the subject.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDns() {
        return null;
    }

    /**
     * IP is the IP address of the subject.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames> {
        java.lang.String dns;
        java.lang.String ip;

        /**
         * Sets the value of {@link ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames#getDns}
         * @param dns DNS is the DNS name of the subject.
         * @return {@code this}
         */
        public Builder dns(java.lang.String dns) {
            this.dns = dns;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames#getIp}
         * @param ip IP is the IP address of the subject.
         * @return {@code this}
         */
        public Builder ip(java.lang.String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames {
        private final java.lang.String dns;
        private final java.lang.String ip;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dns = software.amazon.jsii.Kernel.get(this, "dns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ip = software.amazon.jsii.Kernel.get(this, "ip", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dns = builder.dns;
            this.ip = builder.ip;
        }

        @Override
        public final java.lang.String getDns() {
            return this.dns;
        }

        @Override
        public final java.lang.String getIp() {
            return this.ip;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDns() != null) {
                data.set("dns", om.valueToTree(this.getDns()));
            }
            if (this.getIp() != null) {
                data.set("ip", om.valueToTree(this.getIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames.Jsii$Proxy that = (ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames.Jsii$Proxy) o;

            if (this.dns != null ? !this.dns.equals(that.dns) : that.dns != null) return false;
            return this.ip != null ? this.ip.equals(that.ip) : that.ip == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dns != null ? this.dns.hashCode() : 0;
            result = 31 * result + (this.ip != null ? this.ip.hashCode() : 0);
            return result;
        }
    }
}
