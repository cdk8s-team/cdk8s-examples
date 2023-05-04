package imports.k8s;

/**
 * ResourceClaimSpec defines how a resource is to be allocated.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.892Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceClaimSpecV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ResourceClaimSpecV1Alpha1.Jsii$Proxy.class)
public interface ResourceClaimSpecV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResourceClassName();

    /**
     * Allocation can start immediately or when a Pod wants to use the resource.
     * <p>
     * "WaitForFirstConsumer" is the default.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAllocationMode() {
        return null;
    }

    /**
     * ParametersRef references a separate object with arbitrary parameters that will be used by the driver when allocating a resource for the claim.
     * <p>
     * The object must be in the same namespace as the ResourceClaim.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceClaimParametersReferenceV1Alpha1 getParametersRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceClaimSpecV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceClaimSpecV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourceClaimSpecV1Alpha1> {
        java.lang.String resourceClassName;
        java.lang.String allocationMode;
        imports.k8s.ResourceClaimParametersReferenceV1Alpha1 parametersRef;

        /**
         * Sets the value of {@link ResourceClaimSpecV1Alpha1#getResourceClassName}
         * @param resourceClassName ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceClassName(java.lang.String resourceClassName) {
            this.resourceClassName = resourceClassName;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClaimSpecV1Alpha1#getAllocationMode}
         * @param allocationMode Allocation can start immediately or when a Pod wants to use the resource.
         *                       "WaitForFirstConsumer" is the default.
         * @return {@code this}
         */
        public Builder allocationMode(java.lang.String allocationMode) {
            this.allocationMode = allocationMode;
            return this;
        }

        /**
         * Sets the value of {@link ResourceClaimSpecV1Alpha1#getParametersRef}
         * @param parametersRef ParametersRef references a separate object with arbitrary parameters that will be used by the driver when allocating a resource for the claim.
         *                      The object must be in the same namespace as the ResourceClaim.
         * @return {@code this}
         */
        public Builder parametersRef(imports.k8s.ResourceClaimParametersReferenceV1Alpha1 parametersRef) {
            this.parametersRef = parametersRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceClaimSpecV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourceClaimSpecV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourceClaimSpecV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceClaimSpecV1Alpha1 {
        private final java.lang.String resourceClassName;
        private final java.lang.String allocationMode;
        private final imports.k8s.ResourceClaimParametersReferenceV1Alpha1 parametersRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resourceClassName = software.amazon.jsii.Kernel.get(this, "resourceClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allocationMode = software.amazon.jsii.Kernel.get(this, "allocationMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parametersRef = software.amazon.jsii.Kernel.get(this, "parametersRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceClaimParametersReferenceV1Alpha1.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resourceClassName = java.util.Objects.requireNonNull(builder.resourceClassName, "resourceClassName is required");
            this.allocationMode = builder.allocationMode;
            this.parametersRef = builder.parametersRef;
        }

        @Override
        public final java.lang.String getResourceClassName() {
            return this.resourceClassName;
        }

        @Override
        public final java.lang.String getAllocationMode() {
            return this.allocationMode;
        }

        @Override
        public final imports.k8s.ResourceClaimParametersReferenceV1Alpha1 getParametersRef() {
            return this.parametersRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resourceClassName", om.valueToTree(this.getResourceClassName()));
            if (this.getAllocationMode() != null) {
                data.set("allocationMode", om.valueToTree(this.getAllocationMode()));
            }
            if (this.getParametersRef() != null) {
                data.set("parametersRef", om.valueToTree(this.getParametersRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceClaimSpecV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceClaimSpecV1Alpha1.Jsii$Proxy that = (ResourceClaimSpecV1Alpha1.Jsii$Proxy) o;

            if (!resourceClassName.equals(that.resourceClassName)) return false;
            if (this.allocationMode != null ? !this.allocationMode.equals(that.allocationMode) : that.allocationMode != null) return false;
            return this.parametersRef != null ? this.parametersRef.equals(that.parametersRef) : that.parametersRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resourceClassName.hashCode();
            result = 31 * result + (this.allocationMode != null ? this.allocationMode.hashCode() : 0);
            result = 31 * result + (this.parametersRef != null ? this.parametersRef.hashCode() : 0);
            return result;
        }
    }
}
