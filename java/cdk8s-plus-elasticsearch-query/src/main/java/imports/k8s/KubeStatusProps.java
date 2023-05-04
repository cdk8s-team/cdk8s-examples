package imports.k8s;

/**
 * Status is a return value for calls that don't return other objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.858Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeStatusProps")
@software.amazon.jsii.Jsii.Proxy(KubeStatusProps.Jsii$Proxy.class)
public interface KubeStatusProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Suggested HTTP return code for this status, 0 if not set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCode() {
        return null;
    }

    /**
     * Extended data associated with the reason.
     * <p>
     * Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StatusDetails getDetails() {
        return null;
    }

    /**
     * A human-readable description of the status of this operation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * Standard list metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ListMeta getMetadata() {
        return null;
    }

    /**
     * A machine-readable description of why this operation is in the "Failure" status.
     * <p>
     * If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeStatusProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeStatusProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeStatusProps> {
        java.lang.Number code;
        imports.k8s.StatusDetails details;
        java.lang.String message;
        imports.k8s.ListMeta metadata;
        java.lang.String reason;

        /**
         * Sets the value of {@link KubeStatusProps#getCode}
         * @param code Suggested HTTP return code for this status, 0 if not set.
         * @return {@code this}
         */
        public Builder code(java.lang.Number code) {
            this.code = code;
            return this;
        }

        /**
         * Sets the value of {@link KubeStatusProps#getDetails}
         * @param details Extended data associated with the reason.
         *                Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
         * @return {@code this}
         */
        public Builder details(imports.k8s.StatusDetails details) {
            this.details = details;
            return this;
        }

        /**
         * Sets the value of {@link KubeStatusProps#getMessage}
         * @param message A human-readable description of the status of this operation.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link KubeStatusProps#getMetadata}
         * @param metadata Standard list metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeStatusProps#getReason}
         * @param reason A machine-readable description of why this operation is in the "Failure" status.
         *               If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeStatusProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeStatusProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeStatusProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeStatusProps {
        private final java.lang.Number code;
        private final imports.k8s.StatusDetails details;
        private final java.lang.String message;
        private final imports.k8s.ListMeta metadata;
        private final java.lang.String reason;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.code = software.amazon.jsii.Kernel.get(this, "code", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.details = software.amazon.jsii.Kernel.get(this, "details", software.amazon.jsii.NativeType.forClass(imports.k8s.StatusDetails.class));
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ListMeta.class));
            this.reason = software.amazon.jsii.Kernel.get(this, "reason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.code = builder.code;
            this.details = builder.details;
            this.message = builder.message;
            this.metadata = builder.metadata;
            this.reason = builder.reason;
        }

        @Override
        public final java.lang.Number getCode() {
            return this.code;
        }

        @Override
        public final imports.k8s.StatusDetails getDetails() {
            return this.details;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public final imports.k8s.ListMeta getMetadata() {
            return this.metadata;
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

            if (this.getCode() != null) {
                data.set("code", om.valueToTree(this.getCode()));
            }
            if (this.getDetails() != null) {
                data.set("details", om.valueToTree(this.getDetails()));
            }
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeStatusProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeStatusProps.Jsii$Proxy that = (KubeStatusProps.Jsii$Proxy) o;

            if (this.code != null ? !this.code.equals(that.code) : that.code != null) return false;
            if (this.details != null ? !this.details.equals(that.details) : that.details != null) return false;
            if (this.message != null ? !this.message.equals(that.message) : that.message != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.reason != null ? this.reason.equals(that.reason) : that.reason == null;
        }

        @Override
        public final int hashCode() {
            int result = this.code != null ? this.code.hashCode() : 0;
            result = 31 * result + (this.details != null ? this.details.hashCode() : 0);
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            return result;
        }
    }
}
