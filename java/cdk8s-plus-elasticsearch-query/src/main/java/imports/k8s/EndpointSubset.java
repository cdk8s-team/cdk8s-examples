package imports.k8s;

/**
 * EndpointSubset is a group of addresses with a common set of ports.
 * <p>
 * The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
 * <p>
 * {
 * Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
 * Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
 * }
 * <p>
 * The resulting set of endpoints can be viewed as:
 * <p>
 * a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
 * b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.765Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EndpointSubset")
@software.amazon.jsii.Jsii.Proxy(EndpointSubset.Jsii$Proxy.class)
public interface EndpointSubset extends software.amazon.jsii.JsiiSerializable {

    /**
     * IP addresses which offer the related ports that are marked as ready.
     * <p>
     * These endpoints should be considered safe for load balancers and clients to utilize.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EndpointAddress> getAddresses() {
        return null;
    }

    /**
     * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EndpointAddress> getNotReadyAddresses() {
        return null;
    }

    /**
     * Port numbers available on the related IP addresses.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EndpointPort> getPorts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointSubset}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointSubset}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EndpointSubset> {
        java.util.List<imports.k8s.EndpointAddress> addresses;
        java.util.List<imports.k8s.EndpointAddress> notReadyAddresses;
        java.util.List<imports.k8s.EndpointPort> ports;

        /**
         * Sets the value of {@link EndpointSubset#getAddresses}
         * @param addresses IP addresses which offer the related ports that are marked as ready.
         *                  These endpoints should be considered safe for load balancers and clients to utilize.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder addresses(java.util.List<? extends imports.k8s.EndpointAddress> addresses) {
            this.addresses = (java.util.List<imports.k8s.EndpointAddress>)addresses;
            return this;
        }

        /**
         * Sets the value of {@link EndpointSubset#getNotReadyAddresses}
         * @param notReadyAddresses IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder notReadyAddresses(java.util.List<? extends imports.k8s.EndpointAddress> notReadyAddresses) {
            this.notReadyAddresses = (java.util.List<imports.k8s.EndpointAddress>)notReadyAddresses;
            return this;
        }

        /**
         * Sets the value of {@link EndpointSubset#getPorts}
         * @param ports Port numbers available on the related IP addresses.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ports(java.util.List<? extends imports.k8s.EndpointPort> ports) {
            this.ports = (java.util.List<imports.k8s.EndpointPort>)ports;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointSubset}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EndpointSubset build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EndpointSubset}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointSubset {
        private final java.util.List<imports.k8s.EndpointAddress> addresses;
        private final java.util.List<imports.k8s.EndpointAddress> notReadyAddresses;
        private final java.util.List<imports.k8s.EndpointPort> ports;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.addresses = software.amazon.jsii.Kernel.get(this, "addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointAddress.class)));
            this.notReadyAddresses = software.amazon.jsii.Kernel.get(this, "notReadyAddresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointAddress.class)));
            this.ports = software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointPort.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.addresses = (java.util.List<imports.k8s.EndpointAddress>)builder.addresses;
            this.notReadyAddresses = (java.util.List<imports.k8s.EndpointAddress>)builder.notReadyAddresses;
            this.ports = (java.util.List<imports.k8s.EndpointPort>)builder.ports;
        }

        @Override
        public final java.util.List<imports.k8s.EndpointAddress> getAddresses() {
            return this.addresses;
        }

        @Override
        public final java.util.List<imports.k8s.EndpointAddress> getNotReadyAddresses() {
            return this.notReadyAddresses;
        }

        @Override
        public final java.util.List<imports.k8s.EndpointPort> getPorts() {
            return this.ports;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAddresses() != null) {
                data.set("addresses", om.valueToTree(this.getAddresses()));
            }
            if (this.getNotReadyAddresses() != null) {
                data.set("notReadyAddresses", om.valueToTree(this.getNotReadyAddresses()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointSubset"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointSubset.Jsii$Proxy that = (EndpointSubset.Jsii$Proxy) o;

            if (this.addresses != null ? !this.addresses.equals(that.addresses) : that.addresses != null) return false;
            if (this.notReadyAddresses != null ? !this.notReadyAddresses.equals(that.notReadyAddresses) : that.notReadyAddresses != null) return false;
            return this.ports != null ? this.ports.equals(that.ports) : that.ports == null;
        }

        @Override
        public final int hashCode() {
            int result = this.addresses != null ? this.addresses.hashCode() : 0;
            result = 31 * result + (this.notReadyAddresses != null ? this.notReadyAddresses.hashCode() : 0);
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            return result;
        }
    }
}
