package imports.k8s;

/**
 * SubjectAccessReviewSpec is a description of the access request.
 * <p>
 * Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.952Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SubjectAccessReviewSpec")
@software.amazon.jsii.Jsii.Proxy(SubjectAccessReviewSpec.Jsii$Proxy.class)
public interface SubjectAccessReviewSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra() {
        return null;
    }

    /**
     * Groups is the groups you're testing for.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroups() {
        return null;
    }

    /**
     * NonResourceAttributes describes information for a non-resource access request.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NonResourceAttributes getNonResourceAttributes() {
        return null;
    }

    /**
     * ResourceAuthorizationAttributes describes information for a resource access request.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceAttributes getResourceAttributes() {
        return null;
    }

    /**
     * UID information about the requesting user.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * User is the user you're testing for.
     * <p>
     * If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SubjectAccessReviewSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SubjectAccessReviewSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SubjectAccessReviewSpec> {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
        java.util.List<java.lang.String> groups;
        imports.k8s.NonResourceAttributes nonResourceAttributes;
        imports.k8s.ResourceAttributes resourceAttributes;
        java.lang.String uid;
        java.lang.String user;

        /**
         * Sets the value of {@link SubjectAccessReviewSpec#getExtra}
         * @param extra Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder extra(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> extra) {
            this.extra = (java.util.Map<java.lang.String, java.util.List<java.lang.String>>)extra;
            return this;
        }

        /**
         * Sets the value of {@link SubjectAccessReviewSpec#getGroups}
         * @param groups Groups is the groups you're testing for.
         * @return {@code this}
         */
        public Builder groups(java.util.List<java.lang.String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Sets the value of {@link SubjectAccessReviewSpec#getNonResourceAttributes}
         * @param nonResourceAttributes NonResourceAttributes describes information for a non-resource access request.
         * @return {@code this}
         */
        public Builder nonResourceAttributes(imports.k8s.NonResourceAttributes nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }

        /**
         * Sets the value of {@link SubjectAccessReviewSpec#getResourceAttributes}
         * @param resourceAttributes ResourceAuthorizationAttributes describes information for a resource access request.
         * @return {@code this}
         */
        public Builder resourceAttributes(imports.k8s.ResourceAttributes resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * Sets the value of {@link SubjectAccessReviewSpec#getUid}
         * @param uid UID information about the requesting user.
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Sets the value of {@link SubjectAccessReviewSpec#getUser}
         * @param user User is the user you're testing for.
         *             If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SubjectAccessReviewSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SubjectAccessReviewSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SubjectAccessReviewSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SubjectAccessReviewSpec {
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
        private final java.util.List<java.lang.String> groups;
        private final imports.k8s.NonResourceAttributes nonResourceAttributes;
        private final imports.k8s.ResourceAttributes resourceAttributes;
        private final java.lang.String uid;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.extra = software.amazon.jsii.Kernel.get(this, "extra", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
            this.groups = software.amazon.jsii.Kernel.get(this, "groups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nonResourceAttributes = software.amazon.jsii.Kernel.get(this, "nonResourceAttributes", software.amazon.jsii.NativeType.forClass(imports.k8s.NonResourceAttributes.class));
            this.resourceAttributes = software.amazon.jsii.Kernel.get(this, "resourceAttributes", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceAttributes.class));
            this.uid = software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.extra = (java.util.Map<java.lang.String, java.util.List<java.lang.String>>)builder.extra;
            this.groups = builder.groups;
            this.nonResourceAttributes = builder.nonResourceAttributes;
            this.resourceAttributes = builder.resourceAttributes;
            this.uid = builder.uid;
            this.user = builder.user;
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
        public final imports.k8s.NonResourceAttributes getNonResourceAttributes() {
            return this.nonResourceAttributes;
        }

        @Override
        public final imports.k8s.ResourceAttributes getResourceAttributes() {
            return this.resourceAttributes;
        }

        @Override
        public final java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public final java.lang.String getUser() {
            return this.user;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExtra() != null) {
                data.set("extra", om.valueToTree(this.getExtra()));
            }
            if (this.getGroups() != null) {
                data.set("groups", om.valueToTree(this.getGroups()));
            }
            if (this.getNonResourceAttributes() != null) {
                data.set("nonResourceAttributes", om.valueToTree(this.getNonResourceAttributes()));
            }
            if (this.getResourceAttributes() != null) {
                data.set("resourceAttributes", om.valueToTree(this.getResourceAttributes()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SubjectAccessReviewSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SubjectAccessReviewSpec.Jsii$Proxy that = (SubjectAccessReviewSpec.Jsii$Proxy) o;

            if (this.extra != null ? !this.extra.equals(that.extra) : that.extra != null) return false;
            if (this.groups != null ? !this.groups.equals(that.groups) : that.groups != null) return false;
            if (this.nonResourceAttributes != null ? !this.nonResourceAttributes.equals(that.nonResourceAttributes) : that.nonResourceAttributes != null) return false;
            if (this.resourceAttributes != null ? !this.resourceAttributes.equals(that.resourceAttributes) : that.resourceAttributes != null) return false;
            if (this.uid != null ? !this.uid.equals(that.uid) : that.uid != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.extra != null ? this.extra.hashCode() : 0;
            result = 31 * result + (this.groups != null ? this.groups.hashCode() : 0);
            result = 31 * result + (this.nonResourceAttributes != null ? this.nonResourceAttributes.hashCode() : 0);
            result = 31 * result + (this.resourceAttributes != null ? this.resourceAttributes.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
