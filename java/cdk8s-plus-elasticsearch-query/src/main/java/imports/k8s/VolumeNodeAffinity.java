package imports.k8s;

/**
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.986Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VolumeNodeAffinity")
@software.amazon.jsii.Jsii.Proxy(VolumeNodeAffinity.Jsii$Proxy.class)
public interface VolumeNodeAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * required specifies hard node constraints that must be met.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeSelector getRequired() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeNodeAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeNodeAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VolumeNodeAffinity> {
        imports.k8s.NodeSelector required;

        /**
         * Sets the value of {@link VolumeNodeAffinity#getRequired}
         * @param required required specifies hard node constraints that must be met.
         * @return {@code this}
         */
        public Builder required(imports.k8s.NodeSelector required) {
            this.required = required;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeNodeAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VolumeNodeAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VolumeNodeAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeNodeAffinity {
        private final imports.k8s.NodeSelector required;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.required = software.amazon.jsii.Kernel.get(this, "required", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.required = builder.required;
        }

        @Override
        public final imports.k8s.NodeSelector getRequired() {
            return this.required;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRequired() != null) {
                data.set("required", om.valueToTree(this.getRequired()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeNodeAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeNodeAffinity.Jsii$Proxy that = (VolumeNodeAffinity.Jsii$Proxy) o;

            return this.required != null ? this.required.equals(that.required) : that.required == null;
        }

        @Override
        public final int hashCode() {
            int result = this.required != null ? this.required.hashCode() : 0;
            return result;
        }
    }
}
