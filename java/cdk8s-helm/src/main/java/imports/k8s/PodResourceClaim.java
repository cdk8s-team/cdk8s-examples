package imports.k8s;

/**
 * PodResourceClaim references exactly one ResourceClaim through a ClaimSource.
 * <p>
 * It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.936Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodResourceClaim")
@software.amazon.jsii.Jsii.Proxy(PodResourceClaim.Jsii$Proxy.class)
public interface PodResourceClaim extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name uniquely identifies this resource claim inside the pod.
     * <p>
     * This must be a DNS_LABEL.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Source describes where to find the ResourceClaim.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ClaimSource getSource() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodResourceClaim}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodResourceClaim}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodResourceClaim> {
        java.lang.String name;
        imports.k8s.ClaimSource source;

        /**
         * Sets the value of {@link PodResourceClaim#getName}
         * @param name Name uniquely identifies this resource claim inside the pod. This parameter is required.
         *             This must be a DNS_LABEL.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link PodResourceClaim#getSource}
         * @param source Source describes where to find the ResourceClaim.
         * @return {@code this}
         */
        public Builder source(imports.k8s.ClaimSource source) {
            this.source = source;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodResourceClaim}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodResourceClaim build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodResourceClaim}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodResourceClaim {
        private final java.lang.String name;
        private final imports.k8s.ClaimSource source;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.source = software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.forClass(imports.k8s.ClaimSource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.source = builder.source;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.k8s.ClaimSource getSource() {
            return this.source;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getSource() != null) {
                data.set("source", om.valueToTree(this.getSource()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodResourceClaim"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodResourceClaim.Jsii$Proxy that = (PodResourceClaim.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.source != null ? this.source.equals(that.source) : that.source == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.source != null ? this.source.hashCode() : 0);
            return result;
        }
    }
}
