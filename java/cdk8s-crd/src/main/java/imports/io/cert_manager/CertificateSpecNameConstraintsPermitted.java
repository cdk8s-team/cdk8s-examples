package imports.io.cert_manager;

/**
 * Permitted contains the constraints in which the names must be located.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.86.1 (build defb235)", date = "2023-12-09T15:09:07.112Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecNameConstraintsPermitted")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecNameConstraintsPermitted.Jsii$Proxy.class)
public interface CertificateSpecNameConstraintsPermitted extends software.amazon.jsii.JsiiSerializable {

    /**
     * DNSDomains is a list of DNS domains that are permitted or excluded.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDnsDomains() {
        return null;
    }

    /**
     * EmailAddresses is a list of Email Addresses that are permitted or excluded.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEmailAddresses() {
        return null;
    }

    /**
     * IPRanges is a list of IP Ranges that are permitted or excluded.
     * <p>
     * This should be a valid CIDR notation.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpRanges() {
        return null;
    }

    /**
     * URIDomains is a list of URI domains that are permitted or excluded.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUriDomains() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecNameConstraintsPermitted}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecNameConstraintsPermitted}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecNameConstraintsPermitted> {
        java.util.List<java.lang.String> dnsDomains;
        java.util.List<java.lang.String> emailAddresses;
        java.util.List<java.lang.String> ipRanges;
        java.util.List<java.lang.String> uriDomains;

        /**
         * Sets the value of {@link CertificateSpecNameConstraintsPermitted#getDnsDomains}
         * @param dnsDomains DNSDomains is a list of DNS domains that are permitted or excluded.
         * @return {@code this}
         */
        public Builder dnsDomains(java.util.List<java.lang.String> dnsDomains) {
            this.dnsDomains = dnsDomains;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecNameConstraintsPermitted#getEmailAddresses}
         * @param emailAddresses EmailAddresses is a list of Email Addresses that are permitted or excluded.
         * @return {@code this}
         */
        public Builder emailAddresses(java.util.List<java.lang.String> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecNameConstraintsPermitted#getIpRanges}
         * @param ipRanges IPRanges is a list of IP Ranges that are permitted or excluded.
         *                 This should be a valid CIDR notation.
         * @return {@code this}
         */
        public Builder ipRanges(java.util.List<java.lang.String> ipRanges) {
            this.ipRanges = ipRanges;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecNameConstraintsPermitted#getUriDomains}
         * @param uriDomains URIDomains is a list of URI domains that are permitted or excluded.
         * @return {@code this}
         */
        public Builder uriDomains(java.util.List<java.lang.String> uriDomains) {
            this.uriDomains = uriDomains;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecNameConstraintsPermitted}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecNameConstraintsPermitted build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecNameConstraintsPermitted}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecNameConstraintsPermitted {
        private final java.util.List<java.lang.String> dnsDomains;
        private final java.util.List<java.lang.String> emailAddresses;
        private final java.util.List<java.lang.String> ipRanges;
        private final java.util.List<java.lang.String> uriDomains;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dnsDomains = software.amazon.jsii.Kernel.get(this, "dnsDomains", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.emailAddresses = software.amazon.jsii.Kernel.get(this, "emailAddresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ipRanges = software.amazon.jsii.Kernel.get(this, "ipRanges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.uriDomains = software.amazon.jsii.Kernel.get(this, "uriDomains", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dnsDomains = builder.dnsDomains;
            this.emailAddresses = builder.emailAddresses;
            this.ipRanges = builder.ipRanges;
            this.uriDomains = builder.uriDomains;
        }

        @Override
        public final java.util.List<java.lang.String> getDnsDomains() {
            return this.dnsDomains;
        }

        @Override
        public final java.util.List<java.lang.String> getEmailAddresses() {
            return this.emailAddresses;
        }

        @Override
        public final java.util.List<java.lang.String> getIpRanges() {
            return this.ipRanges;
        }

        @Override
        public final java.util.List<java.lang.String> getUriDomains() {
            return this.uriDomains;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDnsDomains() != null) {
                data.set("dnsDomains", om.valueToTree(this.getDnsDomains()));
            }
            if (this.getEmailAddresses() != null) {
                data.set("emailAddresses", om.valueToTree(this.getEmailAddresses()));
            }
            if (this.getIpRanges() != null) {
                data.set("ipRanges", om.valueToTree(this.getIpRanges()));
            }
            if (this.getUriDomains() != null) {
                data.set("uriDomains", om.valueToTree(this.getUriDomains()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecNameConstraintsPermitted"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecNameConstraintsPermitted.Jsii$Proxy that = (CertificateSpecNameConstraintsPermitted.Jsii$Proxy) o;

            if (this.dnsDomains != null ? !this.dnsDomains.equals(that.dnsDomains) : that.dnsDomains != null) return false;
            if (this.emailAddresses != null ? !this.emailAddresses.equals(that.emailAddresses) : that.emailAddresses != null) return false;
            if (this.ipRanges != null ? !this.ipRanges.equals(that.ipRanges) : that.ipRanges != null) return false;
            return this.uriDomains != null ? this.uriDomains.equals(that.uriDomains) : that.uriDomains == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dnsDomains != null ? this.dnsDomains.hashCode() : 0;
            result = 31 * result + (this.emailAddresses != null ? this.emailAddresses.hashCode() : 0);
            result = 31 * result + (this.ipRanges != null ? this.ipRanges.hashCode() : 0);
            result = 31 * result + (this.uriDomains != null ? this.uriDomains.hashCode() : 0);
            return result;
        }
    }
}
