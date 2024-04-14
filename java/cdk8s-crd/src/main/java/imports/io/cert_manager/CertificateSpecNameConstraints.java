package imports.io.cert_manager;

/**
 * x.509 certificate NameConstraint extension which MUST NOT be used in a non-CA certificate. More Info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.10 This is an Alpha Feature and is only enabled with the <code>--feature-gates=useCertificateRequestNameConstraints=true</code> option set on both the controller and webhook components.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.86.1 (build defb235)", date = "2023-12-09T15:09:07.101Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpecNameConstraints")
@software.amazon.jsii.Jsii.Proxy(CertificateSpecNameConstraints.Jsii$Proxy.class)
public interface CertificateSpecNameConstraints extends software.amazon.jsii.JsiiSerializable {

    /**
     * if true then the name constraints are marked critical.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCritical() {
        return null;
    }

    /**
     * Excluded contains the constraints which must be disallowed.
     * <p>
     * Any name matching a restriction in the excluded field is invalid regardless of information appearing in the permitted
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecNameConstraintsExcluded getExcluded() {
        return null;
    }

    /**
     * Permitted contains the constraints in which the names must be located.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecNameConstraintsPermitted getPermitted() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpecNameConstraints}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpecNameConstraints}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpecNameConstraints> {
        java.lang.Boolean critical;
        imports.io.cert_manager.CertificateSpecNameConstraintsExcluded excluded;
        imports.io.cert_manager.CertificateSpecNameConstraintsPermitted permitted;

        /**
         * Sets the value of {@link CertificateSpecNameConstraints#getCritical}
         * @param critical if true then the name constraints are marked critical.
         * @return {@code this}
         */
        public Builder critical(java.lang.Boolean critical) {
            this.critical = critical;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecNameConstraints#getExcluded}
         * @param excluded Excluded contains the constraints which must be disallowed.
         *                 Any name matching a restriction in the excluded field is invalid regardless of information appearing in the permitted
         * @return {@code this}
         */
        public Builder excluded(imports.io.cert_manager.CertificateSpecNameConstraintsExcluded excluded) {
            this.excluded = excluded;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpecNameConstraints#getPermitted}
         * @param permitted Permitted contains the constraints in which the names must be located.
         * @return {@code this}
         */
        public Builder permitted(imports.io.cert_manager.CertificateSpecNameConstraintsPermitted permitted) {
            this.permitted = permitted;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpecNameConstraints}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpecNameConstraints build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpecNameConstraints}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpecNameConstraints {
        private final java.lang.Boolean critical;
        private final imports.io.cert_manager.CertificateSpecNameConstraintsExcluded excluded;
        private final imports.io.cert_manager.CertificateSpecNameConstraintsPermitted permitted;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.critical = software.amazon.jsii.Kernel.get(this, "critical", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.excluded = software.amazon.jsii.Kernel.get(this, "excluded", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecNameConstraintsExcluded.class));
            this.permitted = software.amazon.jsii.Kernel.get(this, "permitted", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecNameConstraintsPermitted.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.critical = builder.critical;
            this.excluded = builder.excluded;
            this.permitted = builder.permitted;
        }

        @Override
        public final java.lang.Boolean getCritical() {
            return this.critical;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecNameConstraintsExcluded getExcluded() {
            return this.excluded;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecNameConstraintsPermitted getPermitted() {
            return this.permitted;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCritical() != null) {
                data.set("critical", om.valueToTree(this.getCritical()));
            }
            if (this.getExcluded() != null) {
                data.set("excluded", om.valueToTree(this.getExcluded()));
            }
            if (this.getPermitted() != null) {
                data.set("permitted", om.valueToTree(this.getPermitted()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpecNameConstraints"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpecNameConstraints.Jsii$Proxy that = (CertificateSpecNameConstraints.Jsii$Proxy) o;

            if (this.critical != null ? !this.critical.equals(that.critical) : that.critical != null) return false;
            if (this.excluded != null ? !this.excluded.equals(that.excluded) : that.excluded != null) return false;
            return this.permitted != null ? this.permitted.equals(that.permitted) : that.permitted == null;
        }

        @Override
        public final int hashCode() {
            int result = this.critical != null ? this.critical.hashCode() : 0;
            result = 31 * result + (this.excluded != null ? this.excluded.hashCode() : 0);
            result = 31 * result + (this.permitted != null ? this.permitted.hashCode() : 0);
            return result;
        }
    }
}
