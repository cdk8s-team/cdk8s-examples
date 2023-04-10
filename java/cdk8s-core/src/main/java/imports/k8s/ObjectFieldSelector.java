package imports.k8s;

/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.929Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ObjectFieldSelector")
@software.amazon.jsii.Jsii.Proxy(ObjectFieldSelector.Jsii$Proxy.class)
public interface ObjectFieldSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path of the field to select in the specified API version.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFieldPath();

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ObjectFieldSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ObjectFieldSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ObjectFieldSelector> {
        java.lang.String fieldPath;
        java.lang.String apiVersion;

        /**
         * Sets the value of {@link ObjectFieldSelector#getFieldPath}
         * @param fieldPath Path of the field to select in the specified API version. This parameter is required.
         * @return {@code this}
         */
        public Builder fieldPath(java.lang.String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * Sets the value of {@link ObjectFieldSelector#getApiVersion}
         * @param apiVersion Version of the schema the FieldPath is written in terms of, defaults to "v1".
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ObjectFieldSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ObjectFieldSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ObjectFieldSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ObjectFieldSelector {
        private final java.lang.String fieldPath;
        private final java.lang.String apiVersion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fieldPath = software.amazon.jsii.Kernel.get(this, "fieldPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fieldPath = java.util.Objects.requireNonNull(builder.fieldPath, "fieldPath is required");
            this.apiVersion = builder.apiVersion;
        }

        @Override
        public final java.lang.String getFieldPath() {
            return this.fieldPath;
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fieldPath", om.valueToTree(this.getFieldPath()));
            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ObjectFieldSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ObjectFieldSelector.Jsii$Proxy that = (ObjectFieldSelector.Jsii$Proxy) o;

            if (!fieldPath.equals(that.fieldPath)) return false;
            return this.apiVersion != null ? this.apiVersion.equals(that.apiVersion) : that.apiVersion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fieldPath.hashCode();
            result = 31 * result + (this.apiVersion != null ? this.apiVersion.hashCode() : 0);
            return result;
        }
    }
}
