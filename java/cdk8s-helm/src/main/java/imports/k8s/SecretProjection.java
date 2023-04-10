package imports.k8s;

/**
 * Adapts a secret into a projected volume.
 * <p>
 * The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.948Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SecretProjection")
@software.amazon.jsii.Jsii.Proxy(SecretProjection.Jsii$Proxy.class)
public interface SecretProjection extends software.amazon.jsii.JsiiSerializable {

    /**
     * items if unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.
     * <p>
     * If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.KeyToPath> getItems() {
        return null;
    }

    /**
     * Name of the referent.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * optional field specify whether the Secret or its key must be defined.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getOptional() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretProjection}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretProjection}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecretProjection> {
        java.util.List<imports.k8s.KeyToPath> items;
        java.lang.String name;
        java.lang.Boolean optional;

        /**
         * Sets the value of {@link SecretProjection#getItems}
         * @param items items if unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.
         *              If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder items(java.util.List<? extends imports.k8s.KeyToPath> items) {
            this.items = (java.util.List<imports.k8s.KeyToPath>)items;
            return this;
        }

        /**
         * Sets the value of {@link SecretProjection#getName}
         * @param name Name of the referent.
         *             More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SecretProjection#getOptional}
         * @param optional optional field specify whether the Secret or its key must be defined.
         * @return {@code this}
         */
        public Builder optional(java.lang.Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SecretProjection}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecretProjection build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SecretProjection}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretProjection {
        private final java.util.List<imports.k8s.KeyToPath> items;
        private final java.lang.String name;
        private final java.lang.Boolean optional;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.KeyToPath.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.optional = software.amazon.jsii.Kernel.get(this, "optional", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = (java.util.List<imports.k8s.KeyToPath>)builder.items;
            this.name = builder.name;
            this.optional = builder.optional;
        }

        @Override
        public final java.util.List<imports.k8s.KeyToPath> getItems() {
            return this.items;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Boolean getOptional() {
            return this.optional;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptional() != null) {
                data.set("optional", om.valueToTree(this.getOptional()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SecretProjection"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretProjection.Jsii$Proxy that = (SecretProjection.Jsii$Proxy) o;

            if (this.items != null ? !this.items.equals(that.items) : that.items != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.optional != null ? this.optional.equals(that.optional) : that.optional == null;
        }

        @Override
        public final int hashCode() {
            int result = this.items != null ? this.items.hashCode() : 0;
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.optional != null ? this.optional.hashCode() : 0);
            return result;
        }
    }
}
