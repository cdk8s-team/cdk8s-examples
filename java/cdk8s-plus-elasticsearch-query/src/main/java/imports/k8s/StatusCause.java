package imports.k8s;

/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.943Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StatusCause")
@software.amazon.jsii.Jsii.Proxy(StatusCause.Jsii$Proxy.class)
public interface StatusCause extends software.amazon.jsii.JsiiSerializable {

    /**
     * The field of the resource that has caused this error, as named by its JSON serialization.
     * <p>
     * May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * <p>
     * Examples:
     * "name" - the field "name" on the current resource
     * "items[0].name" - the field "name" on the first array entry in "items"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getField() {
        return null;
    }

    /**
     * A human-readable description of the cause of the error.
     * <p>
     * This field may be presented as-is to a reader.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * A machine-readable description of the cause of the error.
     * <p>
     * If this value is empty there is no information available.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatusCause}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatusCause}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatusCause> {
        java.lang.String field;
        java.lang.String message;
        java.lang.String reason;

        /**
         * Sets the value of {@link StatusCause#getField}
         * @param field The field of the resource that has caused this error, as named by its JSON serialization.
         *              May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
         *              <p>
         *              Examples:
         *              "name" - the field "name" on the current resource
         *              "items[0].name" - the field "name" on the first array entry in "items"
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link StatusCause#getMessage}
         * @param message A human-readable description of the cause of the error.
         *                This field may be presented as-is to a reader.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link StatusCause#getReason}
         * @param reason A machine-readable description of the cause of the error.
         *               If this value is empty there is no information available.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatusCause}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatusCause build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatusCause}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatusCause {
        private final java.lang.String field;
        private final java.lang.String message;
        private final java.lang.String reason;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reason = software.amazon.jsii.Kernel.get(this, "reason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.field = builder.field;
            this.message = builder.message;
            this.reason = builder.reason;
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getField() != null) {
                data.set("field", om.valueToTree(this.getField()));
            }
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatusCause"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatusCause.Jsii$Proxy that = (StatusCause.Jsii$Proxy) o;

            if (this.field != null ? !this.field.equals(that.field) : that.field != null) return false;
            if (this.message != null ? !this.message.equals(that.message) : that.message != null) return false;
            return this.reason != null ? this.reason.equals(that.reason) : that.reason == null;
        }

        @Override
        public final int hashCode() {
            int result = this.field != null ? this.field.hashCode() : 0;
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            return result;
        }
    }
}
