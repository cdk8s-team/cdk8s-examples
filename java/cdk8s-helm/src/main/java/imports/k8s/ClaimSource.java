package imports.k8s;

/**
 * ClaimSource describes a reference to a ResourceClaim.
 * <p>
 * Exactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.820Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ClaimSource")
@software.amazon.jsii.Jsii.Proxy(ClaimSource.Jsii$Proxy.class)
public interface ClaimSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceClaimName() {
        return null;
    }

    /**
     * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
     * <p>
     * The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be <pod name>-<resource name>, where <resource name> is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
     * <p>
     * An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
     * <p>
     * This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceClaimTemplateName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClaimSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClaimSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClaimSource> {
        java.lang.String resourceClaimName;
        java.lang.String resourceClaimTemplateName;

        /**
         * Sets the value of {@link ClaimSource#getResourceClaimName}
         * @param resourceClaimName ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.
         * @return {@code this}
         */
        public Builder resourceClaimName(java.lang.String resourceClaimName) {
            this.resourceClaimName = resourceClaimName;
            return this;
        }

        /**
         * Sets the value of {@link ClaimSource#getResourceClaimTemplateName}
         * @param resourceClaimTemplateName ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.
         *                                  The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The name of the ResourceClaim will be <pod name>-<resource name>, where <resource name> is the PodResourceClaim.Name. Pod validation will reject the pod if the concatenated name is not valid for a ResourceClaim (e.g. too long).
         *                                  <p>
         *                                  An existing ResourceClaim with that name that is not owned by the pod will not be used for the pod to avoid using an unrelated resource by mistake. Scheduling and pod startup are then blocked until the unrelated ResourceClaim is removed.
         *                                  <p>
         *                                  This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.
         * @return {@code this}
         */
        public Builder resourceClaimTemplateName(java.lang.String resourceClaimTemplateName) {
            this.resourceClaimTemplateName = resourceClaimTemplateName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClaimSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClaimSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ClaimSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClaimSource {
        private final java.lang.String resourceClaimName;
        private final java.lang.String resourceClaimTemplateName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resourceClaimName = software.amazon.jsii.Kernel.get(this, "resourceClaimName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceClaimTemplateName = software.amazon.jsii.Kernel.get(this, "resourceClaimTemplateName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resourceClaimName = builder.resourceClaimName;
            this.resourceClaimTemplateName = builder.resourceClaimTemplateName;
        }

        @Override
        public final java.lang.String getResourceClaimName() {
            return this.resourceClaimName;
        }

        @Override
        public final java.lang.String getResourceClaimTemplateName() {
            return this.resourceClaimTemplateName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getResourceClaimName() != null) {
                data.set("resourceClaimName", om.valueToTree(this.getResourceClaimName()));
            }
            if (this.getResourceClaimTemplateName() != null) {
                data.set("resourceClaimTemplateName", om.valueToTree(this.getResourceClaimTemplateName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClaimSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClaimSource.Jsii$Proxy that = (ClaimSource.Jsii$Proxy) o;

            if (this.resourceClaimName != null ? !this.resourceClaimName.equals(that.resourceClaimName) : that.resourceClaimName != null) return false;
            return this.resourceClaimTemplateName != null ? this.resourceClaimTemplateName.equals(that.resourceClaimTemplateName) : that.resourceClaimTemplateName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resourceClaimName != null ? this.resourceClaimName.hashCode() : 0;
            result = 31 * result + (this.resourceClaimTemplateName != null ? this.resourceClaimTemplateName.hashCode() : 0);
            return result;
        }
    }
}
