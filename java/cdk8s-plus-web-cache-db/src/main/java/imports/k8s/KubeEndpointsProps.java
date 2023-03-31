package imports.k8s;

/**
 * Endpoints is a collection of endpoints that implement the actual service. Example:.
 * <p>
 * Name: "mysvc",
 * Subsets: [
 * {
 * Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
 * Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
 * },
 * {
 * Addresses: [{"ip": "10.10.3.3"}],
 * Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
 * },
 * ]
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.881Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEndpointsProps")
@software.amazon.jsii.Jsii.Proxy(KubeEndpointsProps.Jsii$Proxy.class)
public interface KubeEndpointsProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * The set of all endpoints is the union of all subsets.
     * <p>
     * Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EndpointSubset> getSubsets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeEndpointsProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeEndpointsProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeEndpointsProps> {
        imports.k8s.ObjectMeta metadata;
        java.util.List<imports.k8s.EndpointSubset> subsets;

        /**
         * Sets the value of {@link KubeEndpointsProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeEndpointsProps#getSubsets}
         * @param subsets The set of all endpoints is the union of all subsets.
         *                Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder subsets(java.util.List<? extends imports.k8s.EndpointSubset> subsets) {
            this.subsets = (java.util.List<imports.k8s.EndpointSubset>)subsets;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeEndpointsProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeEndpointsProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeEndpointsProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeEndpointsProps {
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.EndpointSubset> subsets;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.subsets = software.amazon.jsii.Kernel.get(this, "subsets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointSubset.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.subsets = (java.util.List<imports.k8s.EndpointSubset>)builder.subsets;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.EndpointSubset> getSubsets() {
            return this.subsets;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSubsets() != null) {
                data.set("subsets", om.valueToTree(this.getSubsets()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeEndpointsProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeEndpointsProps.Jsii$Proxy that = (KubeEndpointsProps.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.subsets != null ? this.subsets.equals(that.subsets) : that.subsets == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.subsets != null ? this.subsets.hashCode() : 0);
            return result;
        }
    }
}
