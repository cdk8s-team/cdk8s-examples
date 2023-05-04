package imports.k8s;

/**
 * EnvVar represents an environment variable present in a Container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.766Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EnvVar")
@software.amazon.jsii.Jsii.Proxy(EnvVar.Jsii$Proxy.class)
public interface EnvVar extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the environment variable.
     * <p>
     * Must be a C_IDENTIFIER.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables.
     * <p>
     * If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * <p>
     * Default: .
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * Source for the environment variable's value.
     * <p>
     * Cannot be used if value is not empty.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EnvVarSource getValueFrom() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EnvVar}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EnvVar}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EnvVar> {
        java.lang.String name;
        java.lang.String value;
        imports.k8s.EnvVarSource valueFrom;

        /**
         * Sets the value of {@link EnvVar#getName}
         * @param name Name of the environment variable. This parameter is required.
         *             Must be a C_IDENTIFIER.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EnvVar#getValue}
         * @param value Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables.
         *              If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link EnvVar#getValueFrom}
         * @param valueFrom Source for the environment variable's value.
         *                  Cannot be used if value is not empty.
         * @return {@code this}
         */
        public Builder valueFrom(imports.k8s.EnvVarSource valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EnvVar}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EnvVar build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EnvVar}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EnvVar {
        private final java.lang.String name;
        private final java.lang.String value;
        private final imports.k8s.EnvVarSource valueFrom;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.valueFrom = software.amazon.jsii.Kernel.get(this, "valueFrom", software.amazon.jsii.NativeType.forClass(imports.k8s.EnvVarSource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.value = builder.value;
            this.valueFrom = builder.valueFrom;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final imports.k8s.EnvVarSource getValueFrom() {
            return this.valueFrom;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }
            if (this.getValueFrom() != null) {
                data.set("valueFrom", om.valueToTree(this.getValueFrom()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EnvVar"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EnvVar.Jsii$Proxy that = (EnvVar.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.value != null ? !this.value.equals(that.value) : that.value != null) return false;
            return this.valueFrom != null ? this.valueFrom.equals(that.valueFrom) : that.valueFrom == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            result = 31 * result + (this.valueFrom != null ? this.valueFrom.hashCode() : 0);
            return result;
        }
    }
}
