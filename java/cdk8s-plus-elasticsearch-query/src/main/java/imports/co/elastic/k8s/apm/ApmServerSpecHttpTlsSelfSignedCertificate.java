package imports.co.elastic.k8s.apm;

/**
 * SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:12.132Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.apm.$Module.class, fqn = "coelastick8sapm.ApmServerSpecHttpTlsSelfSignedCertificate")
@software.amazon.jsii.Jsii.Proxy(ApmServerSpecHttpTlsSelfSignedCertificate.Jsii$Proxy.class)
public interface ApmServerSpecHttpTlsSelfSignedCertificate extends software.amazon.jsii.JsiiSerializable {

    /**
     * Disabled indicates that the provisioning of the self-signed certifcate should be disabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisabled() {
        return null;
    }

    /**
     * SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames> getSubjectAltNames() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApmServerSpecHttpTlsSelfSignedCertificate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApmServerSpecHttpTlsSelfSignedCertificate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApmServerSpecHttpTlsSelfSignedCertificate> {
        java.lang.Boolean disabled;
        java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames> subjectAltNames;

        /**
         * Sets the value of {@link ApmServerSpecHttpTlsSelfSignedCertificate#getDisabled}
         * @param disabled Disabled indicates that the provisioning of the self-signed certifcate should be disabled.
         * @return {@code this}
         */
        public Builder disabled(java.lang.Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * Sets the value of {@link ApmServerSpecHttpTlsSelfSignedCertificate#getSubjectAltNames}
         * @param subjectAltNames SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder subjectAltNames(java.util.List<? extends imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames> subjectAltNames) {
            this.subjectAltNames = (java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames>)subjectAltNames;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApmServerSpecHttpTlsSelfSignedCertificate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApmServerSpecHttpTlsSelfSignedCertificate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApmServerSpecHttpTlsSelfSignedCertificate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApmServerSpecHttpTlsSelfSignedCertificate {
        private final java.lang.Boolean disabled;
        private final java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames> subjectAltNames;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.disabled = software.amazon.jsii.Kernel.get(this, "disabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.subjectAltNames = software.amazon.jsii.Kernel.get(this, "subjectAltNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.disabled = builder.disabled;
            this.subjectAltNames = (java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames>)builder.subjectAltNames;
        }

        @Override
        public final java.lang.Boolean getDisabled() {
            return this.disabled;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.apm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames> getSubjectAltNames() {
            return this.subjectAltNames;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDisabled() != null) {
                data.set("disabled", om.valueToTree(this.getDisabled()));
            }
            if (this.getSubjectAltNames() != null) {
                data.set("subjectAltNames", om.valueToTree(this.getSubjectAltNames()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8sapm.ApmServerSpecHttpTlsSelfSignedCertificate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApmServerSpecHttpTlsSelfSignedCertificate.Jsii$Proxy that = (ApmServerSpecHttpTlsSelfSignedCertificate.Jsii$Proxy) o;

            if (this.disabled != null ? !this.disabled.equals(that.disabled) : that.disabled != null) return false;
            return this.subjectAltNames != null ? this.subjectAltNames.equals(that.subjectAltNames) : that.subjectAltNames == null;
        }

        @Override
        public final int hashCode() {
            int result = this.disabled != null ? this.disabled.hashCode() : 0;
            result = 31 * result + (this.subjectAltNames != null ? this.subjectAltNames.hashCode() : 0);
            return result;
        }
    }
}
