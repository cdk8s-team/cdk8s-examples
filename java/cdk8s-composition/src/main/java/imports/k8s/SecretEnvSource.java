package imports.k8s;

/**
 * SecretEnvSource selects a Secret to populate the environment variables with.
 * <p>
 * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.948Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SecretEnvSource")
@software.amazon.jsii.Jsii.Proxy(SecretEnvSource.Jsii$Proxy.class)
public interface SecretEnvSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the referent.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Specify whether the Secret must be defined.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getOptional() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretEnvSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretEnvSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecretEnvSource> {
        java.lang.String name;
        java.lang.Boolean optional;

        /**
         * Sets the value of {@link SecretEnvSource#getName}
         * @param name Name of the referent.
         *             More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SecretEnvSource#getOptional}
         * @param optional Specify whether the Secret must be defined.
         * @return {@code this}
         */
        public Builder optional(java.lang.Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SecretEnvSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecretEnvSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SecretEnvSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretEnvSource {
        private final java.lang.String name;
        private final java.lang.Boolean optional;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.optional = software.amazon.jsii.Kernel.get(this, "optional", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
            this.optional = builder.optional;
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

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptional() != null) {
                data.set("optional", om.valueToTree(this.getOptional()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SecretEnvSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretEnvSource.Jsii$Proxy that = (SecretEnvSource.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.optional != null ? this.optional.equals(that.optional) : that.optional == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.optional != null ? this.optional.hashCode() : 0);
            return result;
        }
    }
}
