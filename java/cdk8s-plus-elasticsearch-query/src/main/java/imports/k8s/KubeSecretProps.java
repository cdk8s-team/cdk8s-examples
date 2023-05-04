package imports.k8s;

/**
 * Secret holds secret data of a certain type.
 * <p>
 * The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.852Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeSecretProps")
@software.amazon.jsii.Jsii.Proxy(KubeSecretProps.Jsii$Proxy.class)
public interface KubeSecretProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Data contains the secret data.
     * <p>
     * Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getData() {
        return null;
    }

    /**
     * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).
     * <p>
     * If not set to true, the field can be modified at any time. Defaulted to nil.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getImmutable() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * stringData allows specifying non-binary secret data in string form.
     * <p>
     * It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getStringData() {
        return null;
    }

    /**
     * Used to facilitate programmatic handling of secret data.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeSecretProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeSecretProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeSecretProps> {
        java.util.Map<java.lang.String, java.lang.String> data;
        java.lang.Boolean immutable;
        imports.k8s.ObjectMeta metadata;
        java.util.Map<java.lang.String, java.lang.String> stringData;
        java.lang.String type;

        /**
         * Sets the value of {@link KubeSecretProps#getData}
         * @param data Data contains the secret data.
         *             Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
         * @return {@code this}
         */
        public Builder data(java.util.Map<java.lang.String, java.lang.String> data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the value of {@link KubeSecretProps#getImmutable}
         * @param immutable Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).
         *                  If not set to true, the field can be modified at any time. Defaulted to nil.
         * @return {@code this}
         */
        public Builder immutable(java.lang.Boolean immutable) {
            this.immutable = immutable;
            return this;
        }

        /**
         * Sets the value of {@link KubeSecretProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeSecretProps#getStringData}
         * @param stringData stringData allows specifying non-binary secret data in string form.
         *                   It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
         * @return {@code this}
         */
        public Builder stringData(java.util.Map<java.lang.String, java.lang.String> stringData) {
            this.stringData = stringData;
            return this;
        }

        /**
         * Sets the value of {@link KubeSecretProps#getType}
         * @param type Used to facilitate programmatic handling of secret data.
         *             More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeSecretProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeSecretProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeSecretProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeSecretProps {
        private final java.util.Map<java.lang.String, java.lang.String> data;
        private final java.lang.Boolean immutable;
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.Map<java.lang.String, java.lang.String> stringData;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.data = software.amazon.jsii.Kernel.get(this, "data", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.immutable = software.amazon.jsii.Kernel.get(this, "immutable", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.stringData = software.amazon.jsii.Kernel.get(this, "stringData", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.data = builder.data;
            this.immutable = builder.immutable;
            this.metadata = builder.metadata;
            this.stringData = builder.stringData;
            this.type = builder.type;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getData() {
            return this.data;
        }

        @Override
        public final java.lang.Boolean getImmutable() {
            return this.immutable;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getStringData() {
            return this.stringData;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getData() != null) {
                data.set("data", om.valueToTree(this.getData()));
            }
            if (this.getImmutable() != null) {
                data.set("immutable", om.valueToTree(this.getImmutable()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getStringData() != null) {
                data.set("stringData", om.valueToTree(this.getStringData()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeSecretProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeSecretProps.Jsii$Proxy that = (KubeSecretProps.Jsii$Proxy) o;

            if (this.data != null ? !this.data.equals(that.data) : that.data != null) return false;
            if (this.immutable != null ? !this.immutable.equals(that.immutable) : that.immutable != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.stringData != null ? !this.stringData.equals(that.stringData) : that.stringData != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.data != null ? this.data.hashCode() : 0;
            result = 31 * result + (this.immutable != null ? this.immutable.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.stringData != null ? this.stringData.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
