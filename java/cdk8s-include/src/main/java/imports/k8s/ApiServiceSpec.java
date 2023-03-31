package imports.k8s;

/**
 * APIServiceSpec contains information for locating and communicating with a server.
 * <p>
 * Only https is supported, though you are able to disable certificate verification.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.811Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ApiServiceSpec")
@software.amazon.jsii.Jsii.Proxy(ApiServiceSpec.Jsii$Proxy.class)
public interface ApiServiceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * GroupPriorityMininum is the priority this group should have at least.
     * <p>
     * Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getGroupPriorityMinimum();

    /**
     * VersionPriority controls the ordering of this API version inside of its group.
     * <p>
     * Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getVersionPriority();

    /**
     * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate.
     * <p>
     * If unspecified, system trust roots on the apiserver are used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCaBundle() {
        return null;
    }

    /**
     * Group is the API group name this server hosts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server.
     * <p>
     * This is strongly discouraged.  You should use the CABundle instead.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInsecureSkipTlsVerify() {
        return null;
    }

    /**
     * Service is a reference to the service for this API server.
     * <p>
     * It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ServiceReference getService() {
        return null;
    }

    /**
     * Version is the API version this server hosts.
     * <p>
     * For example, "v1"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiServiceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiServiceSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiServiceSpec> {
        java.lang.Number groupPriorityMinimum;
        java.lang.Number versionPriority;
        java.lang.String caBundle;
        java.lang.String group;
        java.lang.Boolean insecureSkipTlsVerify;
        imports.k8s.ServiceReference service;
        java.lang.String version;

        /**
         * Sets the value of {@link ApiServiceSpec#getGroupPriorityMinimum}
         * @param groupPriorityMinimum GroupPriorityMininum is the priority this group should have at least. This parameter is required.
         *                             Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
         * @return {@code this}
         */
        public Builder groupPriorityMinimum(java.lang.Number groupPriorityMinimum) {
            this.groupPriorityMinimum = groupPriorityMinimum;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceSpec#getVersionPriority}
         * @param versionPriority VersionPriority controls the ordering of this API version inside of its group. This parameter is required.
         *                        Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
         * @return {@code this}
         */
        public Builder versionPriority(java.lang.Number versionPriority) {
            this.versionPriority = versionPriority;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceSpec#getCaBundle}
         * @param caBundle CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate.
         *                 If unspecified, system trust roots on the apiserver are used.
         * @return {@code this}
         */
        public Builder caBundle(java.lang.String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceSpec#getGroup}
         * @param group Group is the API group name this server hosts.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceSpec#getInsecureSkipTlsVerify}
         * @param insecureSkipTlsVerify InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server.
         *                              This is strongly discouraged.  You should use the CABundle instead.
         * @return {@code this}
         */
        public Builder insecureSkipTlsVerify(java.lang.Boolean insecureSkipTlsVerify) {
            this.insecureSkipTlsVerify = insecureSkipTlsVerify;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceSpec#getService}
         * @param service Service is a reference to the service for this API server.
         *                It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
         * @return {@code this}
         */
        public Builder service(imports.k8s.ServiceReference service) {
            this.service = service;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceSpec#getVersion}
         * @param version Version is the API version this server hosts.
         *                For example, "v1"
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiServiceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiServiceSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApiServiceSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiServiceSpec {
        private final java.lang.Number groupPriorityMinimum;
        private final java.lang.Number versionPriority;
        private final java.lang.String caBundle;
        private final java.lang.String group;
        private final java.lang.Boolean insecureSkipTlsVerify;
        private final imports.k8s.ServiceReference service;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.groupPriorityMinimum = software.amazon.jsii.Kernel.get(this, "groupPriorityMinimum", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.versionPriority = software.amazon.jsii.Kernel.get(this, "versionPriority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.caBundle = software.amazon.jsii.Kernel.get(this, "caBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.insecureSkipTlsVerify = software.amazon.jsii.Kernel.get(this, "insecureSkipTlsVerify", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.service = software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(imports.k8s.ServiceReference.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.groupPriorityMinimum = java.util.Objects.requireNonNull(builder.groupPriorityMinimum, "groupPriorityMinimum is required");
            this.versionPriority = java.util.Objects.requireNonNull(builder.versionPriority, "versionPriority is required");
            this.caBundle = builder.caBundle;
            this.group = builder.group;
            this.insecureSkipTlsVerify = builder.insecureSkipTlsVerify;
            this.service = builder.service;
            this.version = builder.version;
        }

        @Override
        public final java.lang.Number getGroupPriorityMinimum() {
            return this.groupPriorityMinimum;
        }

        @Override
        public final java.lang.Number getVersionPriority() {
            return this.versionPriority;
        }

        @Override
        public final java.lang.String getCaBundle() {
            return this.caBundle;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.Boolean getInsecureSkipTlsVerify() {
            return this.insecureSkipTlsVerify;
        }

        @Override
        public final imports.k8s.ServiceReference getService() {
            return this.service;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("groupPriorityMinimum", om.valueToTree(this.getGroupPriorityMinimum()));
            data.set("versionPriority", om.valueToTree(this.getVersionPriority()));
            if (this.getCaBundle() != null) {
                data.set("caBundle", om.valueToTree(this.getCaBundle()));
            }
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getInsecureSkipTlsVerify() != null) {
                data.set("insecureSkipTlsVerify", om.valueToTree(this.getInsecureSkipTlsVerify()));
            }
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ApiServiceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiServiceSpec.Jsii$Proxy that = (ApiServiceSpec.Jsii$Proxy) o;

            if (!groupPriorityMinimum.equals(that.groupPriorityMinimum)) return false;
            if (!versionPriority.equals(that.versionPriority)) return false;
            if (this.caBundle != null ? !this.caBundle.equals(that.caBundle) : that.caBundle != null) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.insecureSkipTlsVerify != null ? !this.insecureSkipTlsVerify.equals(that.insecureSkipTlsVerify) : that.insecureSkipTlsVerify != null) return false;
            if (this.service != null ? !this.service.equals(that.service) : that.service != null) return false;
            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public final int hashCode() {
            int result = this.groupPriorityMinimum.hashCode();
            result = 31 * result + (this.versionPriority.hashCode());
            result = 31 * result + (this.caBundle != null ? this.caBundle.hashCode() : 0);
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.insecureSkipTlsVerify != null ? this.insecureSkipTlsVerify.hashCode() : 0);
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            return result;
        }
    }
}
