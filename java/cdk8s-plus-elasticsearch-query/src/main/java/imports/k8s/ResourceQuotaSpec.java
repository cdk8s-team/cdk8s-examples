package imports.k8s;

/**
 * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.938Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceQuotaSpec")
@software.amazon.jsii.Jsii.Proxy(ResourceQuotaSpec.Jsii$Proxy.class)
public interface ResourceQuotaSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * hard is the set of desired hard limits for each named resource.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getHard() {
        return null;
    }

    /**
     * A collection of filters that must match each object tracked by a quota.
     * <p>
     * If not specified, the quota matches all objects.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getScopes() {
        return null;
    }

    /**
     * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values.
     * <p>
     * For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ScopeSelector getScopeSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceQuotaSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceQuotaSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceQuotaSpec> {
        java.util.Map<java.lang.String, imports.k8s.Quantity> hard;
        java.util.List<java.lang.String> scopes;
        imports.k8s.ScopeSelector scopeSelector;

        /**
         * Sets the value of {@link ResourceQuotaSpec#getHard}
         * @param hard hard is the set of desired hard limits for each named resource.
         *             More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder hard(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> hard) {
            this.hard = (java.util.Map<java.lang.String, imports.k8s.Quantity>)hard;
            return this;
        }

        /**
         * Sets the value of {@link ResourceQuotaSpec#getScopes}
         * @param scopes A collection of filters that must match each object tracked by a quota.
         *               If not specified, the quota matches all objects.
         * @return {@code this}
         */
        public Builder scopes(java.util.List<java.lang.String> scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * Sets the value of {@link ResourceQuotaSpec#getScopeSelector}
         * @param scopeSelector scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values.
         *                      For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
         * @return {@code this}
         */
        public Builder scopeSelector(imports.k8s.ScopeSelector scopeSelector) {
            this.scopeSelector = scopeSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceQuotaSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceQuotaSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceQuotaSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceQuotaSpec {
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> hard;
        private final java.util.List<java.lang.String> scopes;
        private final imports.k8s.ScopeSelector scopeSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hard = software.amazon.jsii.Kernel.get(this, "hard", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.scopes = software.amazon.jsii.Kernel.get(this, "scopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.scopeSelector = software.amazon.jsii.Kernel.get(this, "scopeSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.ScopeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hard = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.hard;
            this.scopes = builder.scopes;
            this.scopeSelector = builder.scopeSelector;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getHard() {
            return this.hard;
        }

        @Override
        public final java.util.List<java.lang.String> getScopes() {
            return this.scopes;
        }

        @Override
        public final imports.k8s.ScopeSelector getScopeSelector() {
            return this.scopeSelector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHard() != null) {
                data.set("hard", om.valueToTree(this.getHard()));
            }
            if (this.getScopes() != null) {
                data.set("scopes", om.valueToTree(this.getScopes()));
            }
            if (this.getScopeSelector() != null) {
                data.set("scopeSelector", om.valueToTree(this.getScopeSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceQuotaSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceQuotaSpec.Jsii$Proxy that = (ResourceQuotaSpec.Jsii$Proxy) o;

            if (this.hard != null ? !this.hard.equals(that.hard) : that.hard != null) return false;
            if (this.scopes != null ? !this.scopes.equals(that.scopes) : that.scopes != null) return false;
            return this.scopeSelector != null ? this.scopeSelector.equals(that.scopeSelector) : that.scopeSelector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hard != null ? this.hard.hashCode() : 0;
            result = 31 * result + (this.scopes != null ? this.scopes.hashCode() : 0);
            result = 31 * result + (this.scopeSelector != null ? this.scopeSelector.hashCode() : 0);
            return result;
        }
    }
}
