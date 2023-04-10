package imports.io.cert_manager;

/**
 * Desired state of the Certificate resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T14:16:45.746Z")
@software.amazon.jsii.Jsii(module = imports.io.cert_manager.$Module.class, fqn = "iocert-manager.CertificateSpec")
@software.amazon.jsii.Jsii.Proxy(CertificateSpec.Jsii$Proxy.class)
public interface CertificateSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * IssuerRef is a reference to the issuer for this certificate.
     * <p>
     * If the <code>kind</code> field is not set, or set to <code>Issuer</code>, an Issuer resource with the given name in the same namespace as the Certificate will be used. If the <code>kind</code> field is set to <code>ClusterIssuer</code>, a ClusterIssuer with the provided name will be used. The <code>name</code> field in this stanza is required at all times.
     */
    @org.jetbrains.annotations.NotNull imports.io.cert_manager.CertificateSpecIssuerRef getIssuerRef();

    /**
     * SecretName is the name of the secret resource that will be automatically created and managed by this Certificate resource.
     * <p>
     * It will be populated with a private key and certificate, signed by the denoted issuer.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSecretName();

    /**
     * AdditionalOutputFormats defines extra output formats of the private key and signed certificate chain to be written to this Certificate's target Secret.
     * <p>
     * This is an Alpha Feature and is only enabled with the <code>--feature-gates=AdditionalCertificateOutputFormats=true</code> option on both the controller and webhook components.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.io.cert_manager.CertificateSpecAdditionalOutputFormats> getAdditionalOutputFormats() {
        return null;
    }

    /**
     * CommonName is a common name to be used on the Certificate.
     * <p>
     * The CommonName should have a length of 64 characters or fewer to avoid generating invalid CSRs. This value is ignored by TLS clients when any subject alt name is set. This is x509 behaviour: https://tools.ietf.org/html/rfc6125#section-6.4.4
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCommonName() {
        return null;
    }

    /**
     * DNSNames is a list of DNS subjectAltNames to be set on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDnsNames() {
        return null;
    }

    /**
     * The requested 'duration' (i.e. lifetime) of the Certificate. This option may be ignored/overridden by some issuer types. If unset this defaults to 90 days. Certificate will be renewed either 2/3 through its duration or `renewBefore` period before its expiry, whichever is later. Minimum accepted duration is 1 hour. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDuration() {
        return null;
    }

    /**
     * EmailAddresses is a list of email subjectAltNames to be set on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEmailAddresses() {
        return null;
    }

    /**
     * EncodeUsagesInRequest controls whether key usages should be present in the CertificateRequest.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEncodeUsagesInRequest() {
        return null;
    }

    /**
     * IPAddresses is a list of IP address subjectAltNames to be set on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpAddresses() {
        return null;
    }

    /**
     * IsCA will mark this Certificate as valid for certificate signing.
     * <p>
     * This will automatically add the <code>cert sign</code> usage to the list of <code>usages</code>.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIsCa() {
        return null;
    }

    /**
     * Keystores configures additional keystore output formats stored in the `secretName` Secret resource.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecKeystores getKeystores() {
        return null;
    }

    /**
     * LiteralSubject is an LDAP formatted string that represents the [X.509 Subject field](https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6). Use this *instead* of the Subject field if you need to ensure the correct ordering of the RDN sequence, such as when issuing certs for LDAP authentication. See https://github.com/cert-manager/cert-manager/issues/3203, https://github.com/cert-manager/cert-manager/issues/4424. This field is alpha level and is only supported by cert-manager installations where LiteralCertificateSubject feature gate is enabled on both cert-manager controller and webhook.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLiteralSubject() {
        return null;
    }

    /**
     * Options to control private keys used for the Certificate.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecPrivateKey getPrivateKey() {
        return null;
    }

    /**
     * How long before the currently issued certificate's expiry cert-manager should renew the certificate.
     * <p>
     * The default is 2/3 of the issued certificate's duration. Minimum accepted value is 5 minutes. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRenewBefore() {
        return null;
    }

    /**
     * revisionHistoryLimit is the maximum number of CertificateRequest revisions that are maintained in the Certificate's history.
     * <p>
     * Each revision represents a single <code>CertificateRequest</code> created by this Certificate, either when it was created, renewed, or Spec was changed. Revisions will be removed by oldest first if the number of revisions exceeds this number. If set, revisionHistoryLimit must be a value of <code>1</code> or greater. If unset (<code>nil</code>), revisions will not be garbage collected. Default value is <code>nil</code>.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * SecretTemplate defines annotations and labels to be copied to the Certificate's Secret.
     * <p>
     * Labels and annotations on the Secret will be changed as they appear on the SecretTemplate when added or removed. SecretTemplate annotations are added in conjunction with, and cannot overwrite, the base set of annotations cert-manager sets on the Certificate's Secret.
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecSecretTemplate getSecretTemplate() {
        return null;
    }

    /**
     * Full X509 name specification (https://golang.org/pkg/crypto/x509/pkix/#Name).
     */
    default @org.jetbrains.annotations.Nullable imports.io.cert_manager.CertificateSpecSubject getSubject() {
        return null;
    }

    /**
     * URIs is a list of URI subjectAltNames to be set on the Certificate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUris() {
        return null;
    }

    /**
     * Usages is the set of x509 usages that are requested for the certificate.
     * <p>
     * Defaults to <code>digital signature</code> and <code>key encipherment</code> if not specified.
     * <p>
     * Default: digital signature` and `key encipherment` if not specified.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.io.cert_manager.CertificateSpecUsages> getUsages() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSpec> {
        imports.io.cert_manager.CertificateSpecIssuerRef issuerRef;
        java.lang.String secretName;
        java.util.List<imports.io.cert_manager.CertificateSpecAdditionalOutputFormats> additionalOutputFormats;
        java.lang.String commonName;
        java.util.List<java.lang.String> dnsNames;
        java.lang.String duration;
        java.util.List<java.lang.String> emailAddresses;
        java.lang.Boolean encodeUsagesInRequest;
        java.util.List<java.lang.String> ipAddresses;
        java.lang.Boolean isCa;
        imports.io.cert_manager.CertificateSpecKeystores keystores;
        java.lang.String literalSubject;
        imports.io.cert_manager.CertificateSpecPrivateKey privateKey;
        java.lang.String renewBefore;
        java.lang.Number revisionHistoryLimit;
        imports.io.cert_manager.CertificateSpecSecretTemplate secretTemplate;
        imports.io.cert_manager.CertificateSpecSubject subject;
        java.util.List<java.lang.String> uris;
        java.util.List<imports.io.cert_manager.CertificateSpecUsages> usages;

        /**
         * Sets the value of {@link CertificateSpec#getIssuerRef}
         * @param issuerRef IssuerRef is a reference to the issuer for this certificate. This parameter is required.
         *                  If the <code>kind</code> field is not set, or set to <code>Issuer</code>, an Issuer resource with the given name in the same namespace as the Certificate will be used. If the <code>kind</code> field is set to <code>ClusterIssuer</code>, a ClusterIssuer with the provided name will be used. The <code>name</code> field in this stanza is required at all times.
         * @return {@code this}
         */
        public Builder issuerRef(imports.io.cert_manager.CertificateSpecIssuerRef issuerRef) {
            this.issuerRef = issuerRef;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getSecretName}
         * @param secretName SecretName is the name of the secret resource that will be automatically created and managed by this Certificate resource. This parameter is required.
         *                   It will be populated with a private key and certificate, signed by the denoted issuer.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getAdditionalOutputFormats}
         * @param additionalOutputFormats AdditionalOutputFormats defines extra output formats of the private key and signed certificate chain to be written to this Certificate's target Secret.
         *                                This is an Alpha Feature and is only enabled with the <code>--feature-gates=AdditionalCertificateOutputFormats=true</code> option on both the controller and webhook components.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder additionalOutputFormats(java.util.List<? extends imports.io.cert_manager.CertificateSpecAdditionalOutputFormats> additionalOutputFormats) {
            this.additionalOutputFormats = (java.util.List<imports.io.cert_manager.CertificateSpecAdditionalOutputFormats>)additionalOutputFormats;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getCommonName}
         * @param commonName CommonName is a common name to be used on the Certificate.
         *                   The CommonName should have a length of 64 characters or fewer to avoid generating invalid CSRs. This value is ignored by TLS clients when any subject alt name is set. This is x509 behaviour: https://tools.ietf.org/html/rfc6125#section-6.4.4
         * @return {@code this}
         */
        public Builder commonName(java.lang.String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getDnsNames}
         * @param dnsNames DNSNames is a list of DNS subjectAltNames to be set on the Certificate.
         * @return {@code this}
         */
        public Builder dnsNames(java.util.List<java.lang.String> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getDuration}
         * @param duration The requested 'duration' (i.e. lifetime) of the Certificate. This option may be ignored/overridden by some issuer types. If unset this defaults to 90 days. Certificate will be renewed either 2/3 through its duration or `renewBefore` period before its expiry, whichever is later. Minimum accepted duration is 1 hour. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration.
         * @return {@code this}
         */
        public Builder duration(java.lang.String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getEmailAddresses}
         * @param emailAddresses EmailAddresses is a list of email subjectAltNames to be set on the Certificate.
         * @return {@code this}
         */
        public Builder emailAddresses(java.util.List<java.lang.String> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getEncodeUsagesInRequest}
         * @param encodeUsagesInRequest EncodeUsagesInRequest controls whether key usages should be present in the CertificateRequest.
         * @return {@code this}
         */
        public Builder encodeUsagesInRequest(java.lang.Boolean encodeUsagesInRequest) {
            this.encodeUsagesInRequest = encodeUsagesInRequest;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getIpAddresses}
         * @param ipAddresses IPAddresses is a list of IP address subjectAltNames to be set on the Certificate.
         * @return {@code this}
         */
        public Builder ipAddresses(java.util.List<java.lang.String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getIsCa}
         * @param isCa IsCA will mark this Certificate as valid for certificate signing.
         *             This will automatically add the <code>cert sign</code> usage to the list of <code>usages</code>.
         * @return {@code this}
         */
        public Builder isCa(java.lang.Boolean isCa) {
            this.isCa = isCa;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getKeystores}
         * @param keystores Keystores configures additional keystore output formats stored in the `secretName` Secret resource.
         * @return {@code this}
         */
        public Builder keystores(imports.io.cert_manager.CertificateSpecKeystores keystores) {
            this.keystores = keystores;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getLiteralSubject}
         * @param literalSubject LiteralSubject is an LDAP formatted string that represents the [X.509 Subject field](https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6). Use this *instead* of the Subject field if you need to ensure the correct ordering of the RDN sequence, such as when issuing certs for LDAP authentication. See https://github.com/cert-manager/cert-manager/issues/3203, https://github.com/cert-manager/cert-manager/issues/4424. This field is alpha level and is only supported by cert-manager installations where LiteralCertificateSubject feature gate is enabled on both cert-manager controller and webhook.
         * @return {@code this}
         */
        public Builder literalSubject(java.lang.String literalSubject) {
            this.literalSubject = literalSubject;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getPrivateKey}
         * @param privateKey Options to control private keys used for the Certificate.
         * @return {@code this}
         */
        public Builder privateKey(imports.io.cert_manager.CertificateSpecPrivateKey privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getRenewBefore}
         * @param renewBefore How long before the currently issued certificate's expiry cert-manager should renew the certificate.
         *                    The default is 2/3 of the issued certificate's duration. Minimum accepted value is 5 minutes. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration
         * @return {@code this}
         */
        public Builder renewBefore(java.lang.String renewBefore) {
            this.renewBefore = renewBefore;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of CertificateRequest revisions that are maintained in the Certificate's history.
         *                             Each revision represents a single <code>CertificateRequest</code> created by this Certificate, either when it was created, renewed, or Spec was changed. Revisions will be removed by oldest first if the number of revisions exceeds this number. If set, revisionHistoryLimit must be a value of <code>1</code> or greater. If unset (<code>nil</code>), revisions will not be garbage collected. Default value is <code>nil</code>.
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getSecretTemplate}
         * @param secretTemplate SecretTemplate defines annotations and labels to be copied to the Certificate's Secret.
         *                       Labels and annotations on the Secret will be changed as they appear on the SecretTemplate when added or removed. SecretTemplate annotations are added in conjunction with, and cannot overwrite, the base set of annotations cert-manager sets on the Certificate's Secret.
         * @return {@code this}
         */
        public Builder secretTemplate(imports.io.cert_manager.CertificateSpecSecretTemplate secretTemplate) {
            this.secretTemplate = secretTemplate;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getSubject}
         * @param subject Full X509 name specification (https://golang.org/pkg/crypto/x509/pkix/#Name).
         * @return {@code this}
         */
        public Builder subject(imports.io.cert_manager.CertificateSpecSubject subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getUris}
         * @param uris URIs is a list of URI subjectAltNames to be set on the Certificate.
         * @return {@code this}
         */
        public Builder uris(java.util.List<java.lang.String> uris) {
            this.uris = uris;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSpec#getUsages}
         * @param usages Usages is the set of x509 usages that are requested for the certificate.
         *               Defaults to <code>digital signature</code> and <code>key encipherment</code> if not specified.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder usages(java.util.List<? extends imports.io.cert_manager.CertificateSpecUsages> usages) {
            this.usages = (java.util.List<imports.io.cert_manager.CertificateSpecUsages>)usages;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSpec {
        private final imports.io.cert_manager.CertificateSpecIssuerRef issuerRef;
        private final java.lang.String secretName;
        private final java.util.List<imports.io.cert_manager.CertificateSpecAdditionalOutputFormats> additionalOutputFormats;
        private final java.lang.String commonName;
        private final java.util.List<java.lang.String> dnsNames;
        private final java.lang.String duration;
        private final java.util.List<java.lang.String> emailAddresses;
        private final java.lang.Boolean encodeUsagesInRequest;
        private final java.util.List<java.lang.String> ipAddresses;
        private final java.lang.Boolean isCa;
        private final imports.io.cert_manager.CertificateSpecKeystores keystores;
        private final java.lang.String literalSubject;
        private final imports.io.cert_manager.CertificateSpecPrivateKey privateKey;
        private final java.lang.String renewBefore;
        private final java.lang.Number revisionHistoryLimit;
        private final imports.io.cert_manager.CertificateSpecSecretTemplate secretTemplate;
        private final imports.io.cert_manager.CertificateSpecSubject subject;
        private final java.util.List<java.lang.String> uris;
        private final java.util.List<imports.io.cert_manager.CertificateSpecUsages> usages;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.issuerRef = software.amazon.jsii.Kernel.get(this, "issuerRef", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecIssuerRef.class));
            this.secretName = software.amazon.jsii.Kernel.get(this, "secretName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalOutputFormats = software.amazon.jsii.Kernel.get(this, "additionalOutputFormats", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecAdditionalOutputFormats.class)));
            this.commonName = software.amazon.jsii.Kernel.get(this, "commonName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dnsNames = software.amazon.jsii.Kernel.get(this, "dnsNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.duration = software.amazon.jsii.Kernel.get(this, "duration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.emailAddresses = software.amazon.jsii.Kernel.get(this, "emailAddresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.encodeUsagesInRequest = software.amazon.jsii.Kernel.get(this, "encodeUsagesInRequest", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ipAddresses = software.amazon.jsii.Kernel.get(this, "ipAddresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.isCa = software.amazon.jsii.Kernel.get(this, "isCa", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.keystores = software.amazon.jsii.Kernel.get(this, "keystores", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecKeystores.class));
            this.literalSubject = software.amazon.jsii.Kernel.get(this, "literalSubject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateKey = software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecPrivateKey.class));
            this.renewBefore = software.amazon.jsii.Kernel.get(this, "renewBefore", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.revisionHistoryLimit = software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.secretTemplate = software.amazon.jsii.Kernel.get(this, "secretTemplate", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecSecretTemplate.class));
            this.subject = software.amazon.jsii.Kernel.get(this, "subject", software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecSubject.class));
            this.uris = software.amazon.jsii.Kernel.get(this, "uris", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.usages = software.amazon.jsii.Kernel.get(this, "usages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.io.cert_manager.CertificateSpecUsages.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.issuerRef = java.util.Objects.requireNonNull(builder.issuerRef, "issuerRef is required");
            this.secretName = java.util.Objects.requireNonNull(builder.secretName, "secretName is required");
            this.additionalOutputFormats = (java.util.List<imports.io.cert_manager.CertificateSpecAdditionalOutputFormats>)builder.additionalOutputFormats;
            this.commonName = builder.commonName;
            this.dnsNames = builder.dnsNames;
            this.duration = builder.duration;
            this.emailAddresses = builder.emailAddresses;
            this.encodeUsagesInRequest = builder.encodeUsagesInRequest;
            this.ipAddresses = builder.ipAddresses;
            this.isCa = builder.isCa;
            this.keystores = builder.keystores;
            this.literalSubject = builder.literalSubject;
            this.privateKey = builder.privateKey;
            this.renewBefore = builder.renewBefore;
            this.revisionHistoryLimit = builder.revisionHistoryLimit;
            this.secretTemplate = builder.secretTemplate;
            this.subject = builder.subject;
            this.uris = builder.uris;
            this.usages = (java.util.List<imports.io.cert_manager.CertificateSpecUsages>)builder.usages;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecIssuerRef getIssuerRef() {
            return this.issuerRef;
        }

        @Override
        public final java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        public final java.util.List<imports.io.cert_manager.CertificateSpecAdditionalOutputFormats> getAdditionalOutputFormats() {
            return this.additionalOutputFormats;
        }

        @Override
        public final java.lang.String getCommonName() {
            return this.commonName;
        }

        @Override
        public final java.util.List<java.lang.String> getDnsNames() {
            return this.dnsNames;
        }

        @Override
        public final java.lang.String getDuration() {
            return this.duration;
        }

        @Override
        public final java.util.List<java.lang.String> getEmailAddresses() {
            return this.emailAddresses;
        }

        @Override
        public final java.lang.Boolean getEncodeUsagesInRequest() {
            return this.encodeUsagesInRequest;
        }

        @Override
        public final java.util.List<java.lang.String> getIpAddresses() {
            return this.ipAddresses;
        }

        @Override
        public final java.lang.Boolean getIsCa() {
            return this.isCa;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecKeystores getKeystores() {
            return this.keystores;
        }

        @Override
        public final java.lang.String getLiteralSubject() {
            return this.literalSubject;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecPrivateKey getPrivateKey() {
            return this.privateKey;
        }

        @Override
        public final java.lang.String getRenewBefore() {
            return this.renewBefore;
        }

        @Override
        public final java.lang.Number getRevisionHistoryLimit() {
            return this.revisionHistoryLimit;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecSecretTemplate getSecretTemplate() {
            return this.secretTemplate;
        }

        @Override
        public final imports.io.cert_manager.CertificateSpecSubject getSubject() {
            return this.subject;
        }

        @Override
        public final java.util.List<java.lang.String> getUris() {
            return this.uris;
        }

        @Override
        public final java.util.List<imports.io.cert_manager.CertificateSpecUsages> getUsages() {
            return this.usages;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("issuerRef", om.valueToTree(this.getIssuerRef()));
            data.set("secretName", om.valueToTree(this.getSecretName()));
            if (this.getAdditionalOutputFormats() != null) {
                data.set("additionalOutputFormats", om.valueToTree(this.getAdditionalOutputFormats()));
            }
            if (this.getCommonName() != null) {
                data.set("commonName", om.valueToTree(this.getCommonName()));
            }
            if (this.getDnsNames() != null) {
                data.set("dnsNames", om.valueToTree(this.getDnsNames()));
            }
            if (this.getDuration() != null) {
                data.set("duration", om.valueToTree(this.getDuration()));
            }
            if (this.getEmailAddresses() != null) {
                data.set("emailAddresses", om.valueToTree(this.getEmailAddresses()));
            }
            if (this.getEncodeUsagesInRequest() != null) {
                data.set("encodeUsagesInRequest", om.valueToTree(this.getEncodeUsagesInRequest()));
            }
            if (this.getIpAddresses() != null) {
                data.set("ipAddresses", om.valueToTree(this.getIpAddresses()));
            }
            if (this.getIsCa() != null) {
                data.set("isCa", om.valueToTree(this.getIsCa()));
            }
            if (this.getKeystores() != null) {
                data.set("keystores", om.valueToTree(this.getKeystores()));
            }
            if (this.getLiteralSubject() != null) {
                data.set("literalSubject", om.valueToTree(this.getLiteralSubject()));
            }
            if (this.getPrivateKey() != null) {
                data.set("privateKey", om.valueToTree(this.getPrivateKey()));
            }
            if (this.getRenewBefore() != null) {
                data.set("renewBefore", om.valueToTree(this.getRenewBefore()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getSecretTemplate() != null) {
                data.set("secretTemplate", om.valueToTree(this.getSecretTemplate()));
            }
            if (this.getSubject() != null) {
                data.set("subject", om.valueToTree(this.getSubject()));
            }
            if (this.getUris() != null) {
                data.set("uris", om.valueToTree(this.getUris()));
            }
            if (this.getUsages() != null) {
                data.set("usages", om.valueToTree(this.getUsages()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("iocert-manager.CertificateSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSpec.Jsii$Proxy that = (CertificateSpec.Jsii$Proxy) o;

            if (!issuerRef.equals(that.issuerRef)) return false;
            if (!secretName.equals(that.secretName)) return false;
            if (this.additionalOutputFormats != null ? !this.additionalOutputFormats.equals(that.additionalOutputFormats) : that.additionalOutputFormats != null) return false;
            if (this.commonName != null ? !this.commonName.equals(that.commonName) : that.commonName != null) return false;
            if (this.dnsNames != null ? !this.dnsNames.equals(that.dnsNames) : that.dnsNames != null) return false;
            if (this.duration != null ? !this.duration.equals(that.duration) : that.duration != null) return false;
            if (this.emailAddresses != null ? !this.emailAddresses.equals(that.emailAddresses) : that.emailAddresses != null) return false;
            if (this.encodeUsagesInRequest != null ? !this.encodeUsagesInRequest.equals(that.encodeUsagesInRequest) : that.encodeUsagesInRequest != null) return false;
            if (this.ipAddresses != null ? !this.ipAddresses.equals(that.ipAddresses) : that.ipAddresses != null) return false;
            if (this.isCa != null ? !this.isCa.equals(that.isCa) : that.isCa != null) return false;
            if (this.keystores != null ? !this.keystores.equals(that.keystores) : that.keystores != null) return false;
            if (this.literalSubject != null ? !this.literalSubject.equals(that.literalSubject) : that.literalSubject != null) return false;
            if (this.privateKey != null ? !this.privateKey.equals(that.privateKey) : that.privateKey != null) return false;
            if (this.renewBefore != null ? !this.renewBefore.equals(that.renewBefore) : that.renewBefore != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            if (this.secretTemplate != null ? !this.secretTemplate.equals(that.secretTemplate) : that.secretTemplate != null) return false;
            if (this.subject != null ? !this.subject.equals(that.subject) : that.subject != null) return false;
            if (this.uris != null ? !this.uris.equals(that.uris) : that.uris != null) return false;
            return this.usages != null ? this.usages.equals(that.usages) : that.usages == null;
        }

        @Override
        public final int hashCode() {
            int result = this.issuerRef.hashCode();
            result = 31 * result + (this.secretName.hashCode());
            result = 31 * result + (this.additionalOutputFormats != null ? this.additionalOutputFormats.hashCode() : 0);
            result = 31 * result + (this.commonName != null ? this.commonName.hashCode() : 0);
            result = 31 * result + (this.dnsNames != null ? this.dnsNames.hashCode() : 0);
            result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
            result = 31 * result + (this.emailAddresses != null ? this.emailAddresses.hashCode() : 0);
            result = 31 * result + (this.encodeUsagesInRequest != null ? this.encodeUsagesInRequest.hashCode() : 0);
            result = 31 * result + (this.ipAddresses != null ? this.ipAddresses.hashCode() : 0);
            result = 31 * result + (this.isCa != null ? this.isCa.hashCode() : 0);
            result = 31 * result + (this.keystores != null ? this.keystores.hashCode() : 0);
            result = 31 * result + (this.literalSubject != null ? this.literalSubject.hashCode() : 0);
            result = 31 * result + (this.privateKey != null ? this.privateKey.hashCode() : 0);
            result = 31 * result + (this.renewBefore != null ? this.renewBefore.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.secretTemplate != null ? this.secretTemplate.hashCode() : 0);
            result = 31 * result + (this.subject != null ? this.subject.hashCode() : 0);
            result = 31 * result + (this.uris != null ? this.uris.hashCode() : 0);
            result = 31 * result + (this.usages != null ? this.usages.hashCode() : 0);
            return result;
        }
    }
}
