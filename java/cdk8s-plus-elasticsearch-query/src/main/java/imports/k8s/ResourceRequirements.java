package imports.k8s;

/**
 * ResourceRequirements describes the compute resource requirements.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.938Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceRequirements")
@software.amazon.jsii.Jsii.Proxy(ResourceRequirements.Jsii$Proxy.class)
public interface ResourceRequirements extends software.amazon.jsii.JsiiSerializable {

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * <p>
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * <p>
     * This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ResourceClaim> getClaims() {
        return null;
    }

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getLimits() {
        return null;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * <p>
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getRequests() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceRequirements}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceRequirements}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceRequirements> {
        java.util.List<imports.k8s.ResourceClaim> claims;
        java.util.Map<java.lang.String, imports.k8s.Quantity> limits;
        java.util.Map<java.lang.String, imports.k8s.Quantity> requests;

        /**
         * Sets the value of {@link ResourceRequirements#getClaims}
         * @param claims Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
         *               This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
         *               <p>
         *               This field is immutable.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder claims(java.util.List<? extends imports.k8s.ResourceClaim> claims) {
            this.claims = (java.util.List<imports.k8s.ResourceClaim>)claims;
            return this;
        }

        /**
         * Sets the value of {@link ResourceRequirements#getLimits}
         * @param limits Limits describes the maximum amount of compute resources allowed.
         *               More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder limits(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> limits) {
            this.limits = (java.util.Map<java.lang.String, imports.k8s.Quantity>)limits;
            return this;
        }

        /**
         * Sets the value of {@link ResourceRequirements#getRequests}
         * @param requests Requests describes the minimum amount of compute resources required.
         *                 If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder requests(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> requests) {
            this.requests = (java.util.Map<java.lang.String, imports.k8s.Quantity>)requests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceRequirements}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceRequirements build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceRequirements}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceRequirements {
        private final java.util.List<imports.k8s.ResourceClaim> claims;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> limits;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> requests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.claims = software.amazon.jsii.Kernel.get(this, "claims", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceClaim.class)));
            this.limits = software.amazon.jsii.Kernel.get(this, "limits", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.requests = software.amazon.jsii.Kernel.get(this, "requests", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.claims = (java.util.List<imports.k8s.ResourceClaim>)builder.claims;
            this.limits = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.limits;
            this.requests = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.requests;
        }

        @Override
        public final java.util.List<imports.k8s.ResourceClaim> getClaims() {
            return this.claims;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getLimits() {
            return this.limits;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getRequests() {
            return this.requests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClaims() != null) {
                data.set("claims", om.valueToTree(this.getClaims()));
            }
            if (this.getLimits() != null) {
                data.set("limits", om.valueToTree(this.getLimits()));
            }
            if (this.getRequests() != null) {
                data.set("requests", om.valueToTree(this.getRequests()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceRequirements"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceRequirements.Jsii$Proxy that = (ResourceRequirements.Jsii$Proxy) o;

            if (this.claims != null ? !this.claims.equals(that.claims) : that.claims != null) return false;
            if (this.limits != null ? !this.limits.equals(that.limits) : that.limits != null) return false;
            return this.requests != null ? this.requests.equals(that.requests) : that.requests == null;
        }

        @Override
        public final int hashCode() {
            int result = this.claims != null ? this.claims.hashCode() : 0;
            result = 31 * result + (this.limits != null ? this.limits.hashCode() : 0);
            result = 31 * result + (this.requests != null ? this.requests.hashCode() : 0);
            return result;
        }
    }
}
