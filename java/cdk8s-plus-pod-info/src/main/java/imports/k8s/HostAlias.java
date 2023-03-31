package imports.k8s;

/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.848Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HostAlias")
@software.amazon.jsii.Jsii.Proxy(HostAlias.Jsii$Proxy.class)
public interface HostAlias extends software.amazon.jsii.JsiiSerializable {

    /**
     * Hostnames for the above IP address.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHostnames() {
        return null;
    }

    /**
     * IP address of the host file entry.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HostAlias}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HostAlias}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HostAlias> {
        java.util.List<java.lang.String> hostnames;
        java.lang.String ip;

        /**
         * Sets the value of {@link HostAlias#getHostnames}
         * @param hostnames Hostnames for the above IP address.
         * @return {@code this}
         */
        public Builder hostnames(java.util.List<java.lang.String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        /**
         * Sets the value of {@link HostAlias#getIp}
         * @param ip IP address of the host file entry.
         * @return {@code this}
         */
        public Builder ip(java.lang.String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HostAlias}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HostAlias build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HostAlias}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HostAlias {
        private final java.util.List<java.lang.String> hostnames;
        private final java.lang.String ip;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hostnames = software.amazon.jsii.Kernel.get(this, "hostnames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ip = software.amazon.jsii.Kernel.get(this, "ip", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hostnames = builder.hostnames;
            this.ip = builder.ip;
        }

        @Override
        public final java.util.List<java.lang.String> getHostnames() {
            return this.hostnames;
        }

        @Override
        public final java.lang.String getIp() {
            return this.ip;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHostnames() != null) {
                data.set("hostnames", om.valueToTree(this.getHostnames()));
            }
            if (this.getIp() != null) {
                data.set("ip", om.valueToTree(this.getIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HostAlias"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HostAlias.Jsii$Proxy that = (HostAlias.Jsii$Proxy) o;

            if (this.hostnames != null ? !this.hostnames.equals(that.hostnames) : that.hostnames != null) return false;
            return this.ip != null ? this.ip.equals(that.ip) : that.ip == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hostnames != null ? this.hostnames.hashCode() : 0;
            result = 31 * result + (this.ip != null ? this.ip.hashCode() : 0);
            return result;
        }
    }
}
