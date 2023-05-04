package imports.k8s;

/**
 * SelfSubjectAccessReviewSpec is a description of the access request.
 * <p>
 * Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.940Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SelfSubjectAccessReviewSpec")
@software.amazon.jsii.Jsii.Proxy(SelfSubjectAccessReviewSpec.Jsii$Proxy.class)
public interface SelfSubjectAccessReviewSpec extends software.amazon.jsii.JsiiSerializable {

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
     * @return a {@link Builder} of {@link SelfSubjectAccessReviewSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SelfSubjectAccessReviewSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SelfSubjectAccessReviewSpec> {
        imports.k8s.NonResourceAttributes nonResourceAttributes;
        imports.k8s.ResourceAttributes resourceAttributes;

        /**
         * Sets the value of {@link SelfSubjectAccessReviewSpec#getNonResourceAttributes}
         * @param nonResourceAttributes NonResourceAttributes describes information for a non-resource access request.
         * @return {@code this}
         */
        public Builder nonResourceAttributes(imports.k8s.NonResourceAttributes nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }

        /**
         * Sets the value of {@link SelfSubjectAccessReviewSpec#getResourceAttributes}
         * @param resourceAttributes ResourceAuthorizationAttributes describes information for a resource access request.
         * @return {@code this}
         */
        public Builder resourceAttributes(imports.k8s.ResourceAttributes resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SelfSubjectAccessReviewSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SelfSubjectAccessReviewSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SelfSubjectAccessReviewSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SelfSubjectAccessReviewSpec {
        private final imports.k8s.NonResourceAttributes nonResourceAttributes;
        private final imports.k8s.ResourceAttributes resourceAttributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nonResourceAttributes = software.amazon.jsii.Kernel.get(this, "nonResourceAttributes", software.amazon.jsii.NativeType.forClass(imports.k8s.NonResourceAttributes.class));
            this.resourceAttributes = software.amazon.jsii.Kernel.get(this, "resourceAttributes", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceAttributes.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nonResourceAttributes = builder.nonResourceAttributes;
            this.resourceAttributes = builder.resourceAttributes;
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNonResourceAttributes() != null) {
                data.set("nonResourceAttributes", om.valueToTree(this.getNonResourceAttributes()));
            }
            if (this.getResourceAttributes() != null) {
                data.set("resourceAttributes", om.valueToTree(this.getResourceAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SelfSubjectAccessReviewSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SelfSubjectAccessReviewSpec.Jsii$Proxy that = (SelfSubjectAccessReviewSpec.Jsii$Proxy) o;

            if (this.nonResourceAttributes != null ? !this.nonResourceAttributes.equals(that.nonResourceAttributes) : that.nonResourceAttributes != null) return false;
            return this.resourceAttributes != null ? this.resourceAttributes.equals(that.resourceAttributes) : that.resourceAttributes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.nonResourceAttributes != null ? this.nonResourceAttributes.hashCode() : 0;
            result = 31 * result + (this.resourceAttributes != null ? this.resourceAttributes.hashCode() : 0);
            return result;
        }
    }
}
