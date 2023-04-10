package imports.k8s;

/**
 * Subject matches the originator of a request, as identified by the request authentication system.
 * <p>
 * There are three ways of matching an originator; by user, group, or service account.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.953Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SubjectV1Beta3")
@software.amazon.jsii.Jsii.Proxy(SubjectV1Beta3.Jsii$Proxy.class)
public interface SubjectV1Beta3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * `kind` indicates which one of the other fields is non-empty.
     * <p>
     * Required
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * `group` matches based on user group name.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GroupSubjectV1Beta3 getGroup() {
        return null;
    }

    /**
     * `serviceAccount` matches ServiceAccounts.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ServiceAccountSubjectV1Beta3 getServiceAccount() {
        return null;
    }

    /**
     * `user` matches based on username.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.UserSubjectV1Beta3 getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SubjectV1Beta3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SubjectV1Beta3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SubjectV1Beta3> {
        java.lang.String kind;
        imports.k8s.GroupSubjectV1Beta3 group;
        imports.k8s.ServiceAccountSubjectV1Beta3 serviceAccount;
        imports.k8s.UserSubjectV1Beta3 user;

        /**
         * Sets the value of {@link SubjectV1Beta3#getKind}
         * @param kind `kind` indicates which one of the other fields is non-empty. This parameter is required.
         *             Required
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link SubjectV1Beta3#getGroup}
         * @param group `group` matches based on user group name.
         * @return {@code this}
         */
        public Builder group(imports.k8s.GroupSubjectV1Beta3 group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link SubjectV1Beta3#getServiceAccount}
         * @param serviceAccount `serviceAccount` matches ServiceAccounts.
         * @return {@code this}
         */
        public Builder serviceAccount(imports.k8s.ServiceAccountSubjectV1Beta3 serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * Sets the value of {@link SubjectV1Beta3#getUser}
         * @param user `user` matches based on username.
         * @return {@code this}
         */
        public Builder user(imports.k8s.UserSubjectV1Beta3 user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SubjectV1Beta3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SubjectV1Beta3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SubjectV1Beta3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SubjectV1Beta3 {
        private final java.lang.String kind;
        private final imports.k8s.GroupSubjectV1Beta3 group;
        private final imports.k8s.ServiceAccountSubjectV1Beta3 serviceAccount;
        private final imports.k8s.UserSubjectV1Beta3 user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(imports.k8s.GroupSubjectV1Beta3.class));
            this.serviceAccount = software.amazon.jsii.Kernel.get(this, "serviceAccount", software.amazon.jsii.NativeType.forClass(imports.k8s.ServiceAccountSubjectV1Beta3.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(imports.k8s.UserSubjectV1Beta3.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kind = java.util.Objects.requireNonNull(builder.kind, "kind is required");
            this.group = builder.group;
            this.serviceAccount = builder.serviceAccount;
            this.user = builder.user;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final imports.k8s.GroupSubjectV1Beta3 getGroup() {
            return this.group;
        }

        @Override
        public final imports.k8s.ServiceAccountSubjectV1Beta3 getServiceAccount() {
            return this.serviceAccount;
        }

        @Override
        public final imports.k8s.UserSubjectV1Beta3 getUser() {
            return this.user;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("kind", om.valueToTree(this.getKind()));
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getServiceAccount() != null) {
                data.set("serviceAccount", om.valueToTree(this.getServiceAccount()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SubjectV1Beta3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SubjectV1Beta3.Jsii$Proxy that = (SubjectV1Beta3.Jsii$Proxy) o;

            if (!kind.equals(that.kind)) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.serviceAccount != null ? !this.serviceAccount.equals(that.serviceAccount) : that.serviceAccount != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.kind.hashCode();
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.serviceAccount != null ? this.serviceAccount.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
