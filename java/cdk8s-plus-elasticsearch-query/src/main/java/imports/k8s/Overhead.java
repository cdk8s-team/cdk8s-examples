package imports.k8s;

/**
 * Overhead structure represents the resource overhead associated with running a pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.878Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Overhead")
@software.amazon.jsii.Jsii.Proxy(Overhead.Jsii$Proxy.class)
public interface Overhead extends software.amazon.jsii.JsiiSerializable {

    /**
     * PodFixed represents the fixed resource overhead associated with running a pod.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getPodFixed() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Overhead}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Overhead}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Overhead> {
        java.util.Map<java.lang.String, imports.k8s.Quantity> podFixed;

        /**
         * Sets the value of {@link Overhead#getPodFixed}
         * @param podFixed PodFixed represents the fixed resource overhead associated with running a pod.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder podFixed(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> podFixed) {
            this.podFixed = (java.util.Map<java.lang.String, imports.k8s.Quantity>)podFixed;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Overhead}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Overhead build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Overhead}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Overhead {
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> podFixed;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podFixed = software.amazon.jsii.Kernel.get(this, "podFixed", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podFixed = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.podFixed;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getPodFixed() {
            return this.podFixed;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPodFixed() != null) {
                data.set("podFixed", om.valueToTree(this.getPodFixed()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Overhead"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Overhead.Jsii$Proxy that = (Overhead.Jsii$Proxy) o;

            return this.podFixed != null ? this.podFixed.equals(that.podFixed) : that.podFixed == null;
        }

        @Override
        public final int hashCode() {
            int result = this.podFixed != null ? this.podFixed.hashCode() : 0;
            return result;
        }
    }
}
