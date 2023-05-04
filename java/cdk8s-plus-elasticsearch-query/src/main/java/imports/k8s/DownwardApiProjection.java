package imports.k8s;

/**
 * Represents downward API info for projecting into a projected volume.
 * <p>
 * Note that this is identical to a downwardAPI volume source without the default mode.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.758Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DownwardApiProjection")
@software.amazon.jsii.Jsii.Proxy(DownwardApiProjection.Jsii$Proxy.class)
public interface DownwardApiProjection extends software.amazon.jsii.JsiiSerializable {

    /**
     * Items is a list of DownwardAPIVolume file.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DownwardApiVolumeFile> getItems() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DownwardApiProjection}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DownwardApiProjection}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DownwardApiProjection> {
        java.util.List<imports.k8s.DownwardApiVolumeFile> items;

        /**
         * Sets the value of {@link DownwardApiProjection#getItems}
         * @param items Items is a list of DownwardAPIVolume file.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder items(java.util.List<? extends imports.k8s.DownwardApiVolumeFile> items) {
            this.items = (java.util.List<imports.k8s.DownwardApiVolumeFile>)items;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DownwardApiProjection}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DownwardApiProjection build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DownwardApiProjection}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DownwardApiProjection {
        private final java.util.List<imports.k8s.DownwardApiVolumeFile> items;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DownwardApiVolumeFile.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = (java.util.List<imports.k8s.DownwardApiVolumeFile>)builder.items;
        }

        @Override
        public final java.util.List<imports.k8s.DownwardApiVolumeFile> getItems() {
            return this.items;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DownwardApiProjection"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DownwardApiProjection.Jsii$Proxy that = (DownwardApiProjection.Jsii$Proxy) o;

            return this.items != null ? this.items.equals(that.items) : that.items == null;
        }

        @Override
        public final int hashCode() {
            int result = this.items != null ? this.items.hashCode() : 0;
            return result;
        }
    }
}
