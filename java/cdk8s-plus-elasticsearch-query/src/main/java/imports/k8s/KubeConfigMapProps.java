package imports.k8s;

/**
 * ConfigMap holds configuration data for pods to consume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.794Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeConfigMapProps")
@software.amazon.jsii.Jsii.Proxy(KubeConfigMapProps.Jsii$Proxy.class)
public interface KubeConfigMapProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * BinaryData contains the binary data.
     * <p>
     * Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getBinaryData() {
        return null;
    }

    /**
     * Data contains the configuration data.
     * <p>
     * Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getData() {
        return null;
    }

    /**
     * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).
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
     * @return a {@link Builder} of {@link KubeConfigMapProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeConfigMapProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeConfigMapProps> {
        java.util.Map<java.lang.String, java.lang.String> binaryData;
        java.util.Map<java.lang.String, java.lang.String> data;
        java.lang.Boolean immutable;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubeConfigMapProps#getBinaryData}
         * @param binaryData BinaryData contains the binary data.
         *                   Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
         * @return {@code this}
         */
        public Builder binaryData(java.util.Map<java.lang.String, java.lang.String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }

        /**
         * Sets the value of {@link KubeConfigMapProps#getData}
         * @param data Data contains the configuration data.
         *             Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
         * @return {@code this}
         */
        public Builder data(java.util.Map<java.lang.String, java.lang.String> data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the value of {@link KubeConfigMapProps#getImmutable}
         * @param immutable Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).
         *                  If not set to true, the field can be modified at any time. Defaulted to nil.
         * @return {@code this}
         */
        public Builder immutable(java.lang.Boolean immutable) {
            this.immutable = immutable;
            return this;
        }

        /**
         * Sets the value of {@link KubeConfigMapProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeConfigMapProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeConfigMapProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeConfigMapProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeConfigMapProps {
        private final java.util.Map<java.lang.String, java.lang.String> binaryData;
        private final java.util.Map<java.lang.String, java.lang.String> data;
        private final java.lang.Boolean immutable;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.binaryData = software.amazon.jsii.Kernel.get(this, "binaryData", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.data = software.amazon.jsii.Kernel.get(this, "data", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.immutable = software.amazon.jsii.Kernel.get(this, "immutable", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.binaryData = builder.binaryData;
            this.data = builder.data;
            this.immutable = builder.immutable;
            this.metadata = builder.metadata;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getBinaryData() {
            return this.binaryData;
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBinaryData() != null) {
                data.set("binaryData", om.valueToTree(this.getBinaryData()));
            }
            if (this.getData() != null) {
                data.set("data", om.valueToTree(this.getData()));
            }
            if (this.getImmutable() != null) {
                data.set("immutable", om.valueToTree(this.getImmutable()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeConfigMapProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeConfigMapProps.Jsii$Proxy that = (KubeConfigMapProps.Jsii$Proxy) o;

            if (this.binaryData != null ? !this.binaryData.equals(that.binaryData) : that.binaryData != null) return false;
            if (this.data != null ? !this.data.equals(that.data) : that.data != null) return false;
            if (this.immutable != null ? !this.immutable.equals(that.immutable) : that.immutable != null) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.binaryData != null ? this.binaryData.hashCode() : 0;
            result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
            result = 31 * result + (this.immutable != null ? this.immutable.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
