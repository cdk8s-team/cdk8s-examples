package imports.k8s;

/**
 * CertificateSigningRequestSpec contains the certificate request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.815Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CertificateSigningRequestSpec")
@software.amazon.jsii.Jsii.Proxy(CertificateSigningRequestSpec.Jsii$Proxy.class)
public interface CertificateSigningRequestSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block.
     * <p>
     * When serialized as JSON or YAML, the data is additionally base64-encoded.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRequest();

    /**
     * signerName indicates the requested signer, and is a qualified name.
     * <p>
     * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
     * <p>
     * Well-known Kubernetes signers are:
     * <p>
     * <ol>
     * <li>"kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
     * Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.</li>
     * <li>"kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
     * Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
     * <li>"kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
     * Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
     * </ol>
     * <p>
     * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
     * <p>
     * Custom signerNames can also be specified. The signer defines:
     * <p>
     * <ol>
     * <li>Trust distribution: how trust (CA bundles) are distributed.</li>
     * <li>Permitted subjects: and behavior when a disallowed subject is requested.</li>
     * <li>Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.</li>
     * <li>Required, permitted, or forbidden key usages / extended key usages.</li>
     * <li>Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.</li>
     * <li>Whether or not requests for CA certificates are allowed.</li>
     * </ol>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSignerName();

    /**
     * expirationSeconds is the requested duration of validity of the issued certificate.
     * <p>
     * The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.
     * <p>
     * The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.
     * <p>
     * Certificate signers may not honor this field for various reasons:
     * <p>
     * <ol>
     * <li>Old signer that is unaware of the field (such as the in-tree
     * implementations prior to v1.22)</li>
     * <li>Signer whose configured maximum is shorter than the requested duration</li>
     * <li>Signer whose configured minimum is longer than the requested duration</li>
     * </ol>
     * <p>
     * The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getExpirationSeconds() {
        return null;
    }

    /**
     * extra contains extra attributes of the user that created the CertificateSigningRequest.
     * <p>
     * Populated by the API server on creation and immutable.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra() {
        return null;
    }

    /**
     * groups contains group membership of the user that created the CertificateSigningRequest.
     * <p>
     * Populated by the API server on creation and immutable.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroups() {
        return null;
    }

    /**
     * uid contains the uid of the user that created the CertificateSigningRequest.
     * <p>
     * Populated by the API server on creation and immutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * usages specifies a set of key usages requested in the issued certificate.
     * <p>
     * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
     * <p>
     * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
     * <p>
     * Valid values are:
     * "signing", "digital signature", "content commitment",
     * "key encipherment", "key agreement", "data encipherment",
     * "cert sign", "crl sign", "encipher only", "decipher only", "any",
     * "server auth", "client auth",
     * "code signing", "email protection", "s/mime",
     * "ipsec end system", "ipsec tunnel", "ipsec user",
     * "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsages() {
        return null;
    }

    /**
     * username contains the name of the user that created the CertificateSigningRequest.
     * <p>
     * Populated by the API server on creation and immutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSigningRequestSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSigningRequestSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CertificateSigningRequestSpec> {
        java.lang.String request;
        java.lang.String signerName;
        java.lang.Number expirationSeconds;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
        java.util.List<java.lang.String> groups;
        java.lang.String uid;
        java.util.List<java.lang.String> usages;
        java.lang.String username;

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getRequest}
         * @param request request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. This parameter is required.
         *                When serialized as JSON or YAML, the data is additionally base64-encoded.
         * @return {@code this}
         */
        public Builder request(java.lang.String request) {
            this.request = request;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getSignerName}
         * @param signerName signerName indicates the requested signer, and is a qualified name. This parameter is required.
         *                   List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
         *                   <p>
         *                   Well-known Kubernetes signers are:
         *                   <p>
         *                   <ol>
         *                   <li>"kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
         *                   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.</li>
         *                   <li>"kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
         *                   Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
         *                   <li>"kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
         *                   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.</li>
         *                   </ol>
         *                   <p>
         *                   More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
         *                   <p>
         *                   Custom signerNames can also be specified. The signer defines:
         *                   <p>
         *                   <ol>
         *                   <li>Trust distribution: how trust (CA bundles) are distributed.</li>
         *                   <li>Permitted subjects: and behavior when a disallowed subject is requested.</li>
         *                   <li>Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.</li>
         *                   <li>Required, permitted, or forbidden key usages / extended key usages.</li>
         *                   <li>Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.</li>
         *                   <li>Whether or not requests for CA certificates are allowed.</li>
         *                   </ol>
         * @return {@code this}
         */
        public Builder signerName(java.lang.String signerName) {
            this.signerName = signerName;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getExpirationSeconds}
         * @param expirationSeconds expirationSeconds is the requested duration of validity of the issued certificate.
         *                          The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.
         *                          <p>
         *                          The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.
         *                          <p>
         *                          Certificate signers may not honor this field for various reasons:
         *                          <p>
         *                          <ol>
         *                          <li>Old signer that is unaware of the field (such as the in-tree
         *                          implementations prior to v1.22)</li>
         *                          <li>Signer whose configured maximum is shorter than the requested duration</li>
         *                          <li>Signer whose configured minimum is longer than the requested duration</li>
         *                          </ol>
         *                          <p>
         *                          The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
         * @return {@code this}
         */
        public Builder expirationSeconds(java.lang.Number expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getExtra}
         * @param extra extra contains extra attributes of the user that created the CertificateSigningRequest.
         *              Populated by the API server on creation and immutable.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder extra(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> extra) {
            this.extra = (java.util.Map<java.lang.String, java.util.List<java.lang.String>>)extra;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getGroups}
         * @param groups groups contains group membership of the user that created the CertificateSigningRequest.
         *               Populated by the API server on creation and immutable.
         * @return {@code this}
         */
        public Builder groups(java.util.List<java.lang.String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getUid}
         * @param uid uid contains the uid of the user that created the CertificateSigningRequest.
         *            Populated by the API server on creation and immutable.
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getUsages}
         * @param usages usages specifies a set of key usages requested in the issued certificate.
         *               Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
         *               <p>
         *               Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
         *               <p>
         *               Valid values are:
         *               "signing", "digital signature", "content commitment",
         *               "key encipherment", "key agreement", "data encipherment",
         *               "cert sign", "crl sign", "encipher only", "decipher only", "any",
         *               "server auth", "client auth",
         *               "code signing", "email protection", "s/mime",
         *               "ipsec end system", "ipsec tunnel", "ipsec user",
         *               "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
         * @return {@code this}
         */
        public Builder usages(java.util.List<java.lang.String> usages) {
            this.usages = usages;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getUsername}
         * @param username username contains the name of the user that created the CertificateSigningRequest.
         *                 Populated by the API server on creation and immutable.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSigningRequestSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CertificateSigningRequestSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CertificateSigningRequestSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSigningRequestSpec {
        private final java.lang.String request;
        private final java.lang.String signerName;
        private final java.lang.Number expirationSeconds;
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
        private final java.util.List<java.lang.String> groups;
        private final java.lang.String uid;
        private final java.util.List<java.lang.String> usages;
        private final java.lang.String username;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.request = software.amazon.jsii.Kernel.get(this, "request", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.signerName = software.amazon.jsii.Kernel.get(this, "signerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expirationSeconds = software.amazon.jsii.Kernel.get(this, "expirationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.extra = software.amazon.jsii.Kernel.get(this, "extra", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
            this.groups = software.amazon.jsii.Kernel.get(this, "groups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.uid = software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.usages = software.amazon.jsii.Kernel.get(this, "usages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.request = java.util.Objects.requireNonNull(builder.request, "request is required");
            this.signerName = java.util.Objects.requireNonNull(builder.signerName, "signerName is required");
            this.expirationSeconds = builder.expirationSeconds;
            this.extra = (java.util.Map<java.lang.String, java.util.List<java.lang.String>>)builder.extra;
            this.groups = builder.groups;
            this.uid = builder.uid;
            this.usages = builder.usages;
            this.username = builder.username;
        }

        @Override
        public final java.lang.String getRequest() {
            return this.request;
        }

        @Override
        public final java.lang.String getSignerName() {
            return this.signerName;
        }

        @Override
        public final java.lang.Number getExpirationSeconds() {
            return this.expirationSeconds;
        }

        @Override
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra() {
            return this.extra;
        }

        @Override
        public final java.util.List<java.lang.String> getGroups() {
            return this.groups;
        }

        @Override
        public final java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public final java.util.List<java.lang.String> getUsages() {
            return this.usages;
        }

        @Override
        public final java.lang.String getUsername() {
            return this.username;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("request", om.valueToTree(this.getRequest()));
            data.set("signerName", om.valueToTree(this.getSignerName()));
            if (this.getExpirationSeconds() != null) {
                data.set("expirationSeconds", om.valueToTree(this.getExpirationSeconds()));
            }
            if (this.getExtra() != null) {
                data.set("extra", om.valueToTree(this.getExtra()));
            }
            if (this.getGroups() != null) {
                data.set("groups", om.valueToTree(this.getGroups()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }
            if (this.getUsages() != null) {
                data.set("usages", om.valueToTree(this.getUsages()));
            }
            if (this.getUsername() != null) {
                data.set("username", om.valueToTree(this.getUsername()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CertificateSigningRequestSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSigningRequestSpec.Jsii$Proxy that = (CertificateSigningRequestSpec.Jsii$Proxy) o;

            if (!request.equals(that.request)) return false;
            if (!signerName.equals(that.signerName)) return false;
            if (this.expirationSeconds != null ? !this.expirationSeconds.equals(that.expirationSeconds) : that.expirationSeconds != null) return false;
            if (this.extra != null ? !this.extra.equals(that.extra) : that.extra != null) return false;
            if (this.groups != null ? !this.groups.equals(that.groups) : that.groups != null) return false;
            if (this.uid != null ? !this.uid.equals(that.uid) : that.uid != null) return false;
            if (this.usages != null ? !this.usages.equals(that.usages) : that.usages != null) return false;
            return this.username != null ? this.username.equals(that.username) : that.username == null;
        }

        @Override
        public final int hashCode() {
            int result = this.request.hashCode();
            result = 31 * result + (this.signerName.hashCode());
            result = 31 * result + (this.expirationSeconds != null ? this.expirationSeconds.hashCode() : 0);
            result = 31 * result + (this.extra != null ? this.extra.hashCode() : 0);
            result = 31 * result + (this.groups != null ? this.groups.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            result = 31 * result + (this.usages != null ? this.usages.hashCode() : 0);
            result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
            return result;
        }
    }
}
