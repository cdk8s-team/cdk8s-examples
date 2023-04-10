package imports.k8s;

/**
 * CustomResourceColumnDefinition specifies a column for server side printing.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.830Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceColumnDefinition")
@software.amazon.jsii.Jsii.Proxy(CustomResourceColumnDefinition.Jsii$Proxy.class)
public interface CustomResourceColumnDefinition extends software.amazon.jsii.JsiiSerializable {

    /**
     * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getJsonPath();

    /**
     * name is a human readable name for the column.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * type is an OpenAPI type definition for this column.
     * <p>
     * See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * description is a human readable description of this column.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * format is an optional OpenAPI type definition for this column.
     * <p>
     * The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFormat() {
        return null;
    }

    /**
     * priority is an integer defining the relative importance of this column compared to others.
     * <p>
     * Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPriority() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceColumnDefinition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceColumnDefinition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceColumnDefinition> {
        java.lang.String jsonPath;
        java.lang.String name;
        java.lang.String type;
        java.lang.String description;
        java.lang.String format;
        java.lang.Number priority;

        /**
         * Sets the value of {@link CustomResourceColumnDefinition#getJsonPath}
         * @param jsonPath jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column. This parameter is required.
         * @return {@code this}
         */
        public Builder jsonPath(java.lang.String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceColumnDefinition#getName}
         * @param name name is a human readable name for the column. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceColumnDefinition#getType}
         * @param type type is an OpenAPI type definition for this column. This parameter is required.
         *             See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceColumnDefinition#getDescription}
         * @param description description is a human readable description of this column.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceColumnDefinition#getFormat}
         * @param format format is an optional OpenAPI type definition for this column.
         *               The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceColumnDefinition#getPriority}
         * @param priority priority is an integer defining the relative importance of this column compared to others.
         *                 Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceColumnDefinition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceColumnDefinition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CustomResourceColumnDefinition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceColumnDefinition {
        private final java.lang.String jsonPath;
        private final java.lang.String name;
        private final java.lang.String type;
        private final java.lang.String description;
        private final java.lang.String format;
        private final java.lang.Number priority;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jsonPath = software.amazon.jsii.Kernel.get(this, "jsonPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jsonPath = java.util.Objects.requireNonNull(builder.jsonPath, "jsonPath is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.description = builder.description;
            this.format = builder.format;
            this.priority = builder.priority;
        }

        @Override
        public final java.lang.String getJsonPath() {
            return this.jsonPath;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("jsonPath", om.valueToTree(this.getJsonPath()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getFormat() != null) {
                data.set("format", om.valueToTree(this.getFormat()));
            }
            if (this.getPriority() != null) {
                data.set("priority", om.valueToTree(this.getPriority()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceColumnDefinition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceColumnDefinition.Jsii$Proxy that = (CustomResourceColumnDefinition.Jsii$Proxy) o;

            if (!jsonPath.equals(that.jsonPath)) return false;
            if (!name.equals(that.name)) return false;
            if (!type.equals(that.type)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.format != null ? !this.format.equals(that.format) : that.format != null) return false;
            return this.priority != null ? this.priority.equals(that.priority) : that.priority == null;
        }

        @Override
        public final int hashCode() {
            int result = this.jsonPath.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
            result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
            return result;
        }
    }
}
