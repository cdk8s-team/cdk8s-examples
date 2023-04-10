package imports.io.cert_manager;

/**
 * Full X509 name specification (https://golang.org/pkg/crypto/x509/pkix/#Name).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.751Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecSubject")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecSubject.Jsii$Proxy.class)
public interface CertificateSpecSubject extends software.amazon.jsii.JsiiSerializable {

    /**
     * Countries to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCountries() {
        return null;
    }

    /**
     * Cities to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLocalities() {
        return null;
    }

    /**
     * Organizational Units to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOrganizationalUnits() {
        return null;
    }

    /**
     * Organizations to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOrganizations() {
        return null;
    }

    /**
     * Postal codes to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPostalCodes() {
        return null;
    }

    /**
     * State/Provinces to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getProvinces() {
        return null;
    }

    /**
     * Serial number to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSerialNumber() {
        return null;
    }

    /**
     * Street addresses to be used on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStreetAddresses() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecSubject}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecSubject}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecSubject> {
        java.util.List<java.lang.String> countries;
        java.util.List<java.lang.String> localities;
        java.util.List<java.lang.String> organizationalUnits;
        java.util.List<java.lang.String> organizations;
        java.util.List<java.lang.String> postalCodes;
        java.util.List<java.lang.String> provinces;
        java.lang.String serialNumber;
        java.util.List<java.lang.String> streetAddresses;

        /**
         * Sets the value of {@link CertificateSpecSubject#getCountries}
         * @param countries Countries to be used on the Certificate.
         * @return {@code this}
         */
        public Builder countries(java.util.List<java.lang.String> countries) {
            this.countries = countries;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSubject#getLocalities}
         * @param localities Cities to be used on the Certificate.
         * @return {@code this}
         */
        public Builder localities(java.util.List<java.lang.String> localities) {
            this.localities = localities;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSubject#getOrganizationalUnits}
         * @param organizationalUnits Organizational Units to be used on the Certificate.
         * @return {@code this}
         */
        public Builder organizationalUnits(java.util.List<java.lang.String> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSubject#getOrganizations}
         * @param organizations Organizations to be used on the Certificate.
         * @return {@code this}
         */
        public Builder organizations(java.util.List<java.lang.String> organizations) {
            this.organizations = organizations;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSubject#getPostalCodes}
         * @param postalCodes Postal codes to be used on the Certificate.
         * @return {@code this}
         */
        public Builder postalCodes(java.util.List<java.lang.String> postalCodes) {
            this.postalCodes = postalCodes;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSubject#getProvinces}
         * @param provinces State/Provinces to be used on the Certificate.
         * @return {@code this}
         */
        public Builder provinces(java.util.List<java.lang.String> provinces) {
            this.provinces = provinces;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSubject#getSerialNumber}
         * @param serialNumber Serial number to be used on the Certificate.
         * @return {@code this}
         */
        public Builder serialNumber(java.lang.String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecSubject#getStreetAddresses}
         * @param streetAddresses Street addresses to be used on the Certificate.
         * @return {@code this}
         */
        public Builder streetAddresses(java.util.List<java.lang.String> streetAddresses) {
            this.streetAddresses = streetAddresses;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecSubject}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecSubject build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecSubject}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecSubject {
        private final java.util.List<java.lang.String> countries;
        private final java.util.List<java.lang.String> localities;
        private final java.util.List<java.lang.String> organizationalUnits;
        private final java.util.List<java.lang.String> organizations;
        private final java.util.List<java.lang.String> postalCodes;
        private final java.util.List<java.lang.String> provinces;
        private final java.lang.String serialNumber;
        private final java.util.List<java.lang.String> streetAddresses;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.countries = software.amazon.jsii.Kernel.get(this, "countries", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.localities = software.amazon.jsii.Kernel.get(this, "localities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.organizationalUnits = software.amazon.jsii.Kernel.get(this, "organizationalUnits", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.organizations = software.amazon.jsii.Kernel.get(this, "organizations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.postalCodes = software.amazon.jsii.Kernel.get(this, "postalCodes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.provinces = software.amazon.jsii.Kernel.get(this, "provinces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.serialNumber = software.amazon.jsii.Kernel.get(this, "serialNumber", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.streetAddresses = software.amazon.jsii.Kernel.get(this, "streetAddresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.countries = builder.countries;
            this.localities = builder.localities;
            this.organizationalUnits = builder.organizationalUnits;
            this.organizations = builder.organizations;
            this.postalCodes = builder.postalCodes;
            this.provinces = builder.provinces;
            this.serialNumber = builder.serialNumber;
            this.streetAddresses = builder.streetAddresses;
        }

        @Override
        public final java.util.List<java.lang.String> getCountries() {
            return this.countries;
        }

        @Override
        public final java.util.List<java.lang.String> getLocalities() {
            return this.localities;
        }

        @Override
        public final java.util.List<java.lang.String> getOrganizationalUnits() {
            return this.organizationalUnits;
        }

        @Override
        public final java.util.List<java.lang.String> getOrganizations() {
            return this.organizations;
        }

        @Override
        public final java.util.List<java.lang.String> getPostalCodes() {
            return this.postalCodes;
        }

        @Override
        public final java.util.List<java.lang.String> getProvinces() {
            return this.provinces;
        }

        @Override
        public final java.lang.String getSerialNumber() {
            return this.serialNumber;
        }

        @Override
        public final java.util.List<java.lang.String> getStreetAddresses() {
            return this.streetAddresses;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCountries() != null) {
                data.set("countries", om.valueToTree(this.getCountries()));
            }
            if (this.getLocalities() != null) {
                data.set("localities", om.valueToTree(this.getLocalities()));
            }
            if (this.getOrganizationalUnits() != null) {
                data.set("organizationalUnits", om.valueToTree(this.getOrganizationalUnits()));
            }
            if (this.getOrganizations() != null) {
                data.set("organizations", om.valueToTree(this.getOrganizations()));
            }
            if (this.getPostalCodes() != null) {
                data.set("postalCodes", om.valueToTree(this.getPostalCodes()));
            }
            if (this.getProvinces() != null) {
                data.set("provinces", om.valueToTree(this.getProvinces()));
            }
            if (this.getSerialNumber() != null) {
                data.set("serialNumber", om.valueToTree(this.getSerialNumber()));
            }
            if (this.getStreetAddresses() != null) {
                data.set("streetAddresses", om.valueToTree(this.getStreetAddresses()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecSubject"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecSubject.Jsii$Proxy that = (CertificateSpecSubject.Jsii$Proxy) o;

            if (this.countries != null ? !this.countries.equals(that.countries) : that.countries != null) return false;
            if (this.localities != null ? !this.localities.equals(that.localities) : that.localities != null) return false;
            if (this.organizationalUnits != null ? !this.organizationalUnits.equals(that.organizationalUnits) : that.organizationalUnits != null) return false;
            if (this.organizations != null ? !this.organizations.equals(that.organizations) : that.organizations != null) return false;
            if (this.postalCodes != null ? !this.postalCodes.equals(that.postalCodes) : that.postalCodes != null) return false;
            if (this.provinces != null ? !this.provinces.equals(that.provinces) : that.provinces != null) return false;
            if (this.serialNumber != null ? !this.serialNumber.equals(that.serialNumber) : that.serialNumber != null) return false;
            return this.streetAddresses != null ? this.streetAddresses.equals(that.streetAddresses) : that.streetAddresses == null;
        }

        @Override
        public final int hashCode() {
            int result = this.countries != null ? this.countries.hashCode() : 0;
            result = 31 * result + (this.localities != null ? this.localities.hashCode() : 0);
            result = 31 * result + (this.organizationalUnits != null ? this.organizationalUnits.hashCode() : 0);
            result = 31 * result + (this.organizations != null ? this.organizations.hashCode() : 0);
            result = 31 * result + (this.postalCodes != null ? this.postalCodes.hashCode() : 0);
            result = 31 * result + (this.provinces != null ? this.provinces.hashCode() : 0);
            result = 31 * result + (this.serialNumber != null ? this.serialNumber.hashCode() : 0);
            result = 31 * result + (this.streetAddresses != null ? this.streetAddresses.hashCode() : 0);
            return result;
        }
    }
}
