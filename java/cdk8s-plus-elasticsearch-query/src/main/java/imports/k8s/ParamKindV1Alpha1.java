package imports.k8s;

/**
 * ParamKind is a tuple of Group Kind and Version.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.878Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ParamKindV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ParamKindV1Alpha1.Jsii$Proxy.class)
public interface ParamKindV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIVersion is the API group version the resources belong to.
     * <p>
     * In format of "group/version". Required.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * Kind is the API kind the resources belong to.
     * <p>
     * Required.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ParamKindV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ParamKindV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ParamKindV1Alpha1> {
        java.lang.String apiVersion;
        java.lang.String kind;

        /**
         * Sets the value of {@link ParamKindV1Alpha1#getApiVersion}
         * @param apiVersion APIVersion is the API group version the resources belong to.
         *                   In format of "group/version". Required.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link ParamKindV1Alpha1#getKind}
         * @param kind Kind is the API kind the resources belong to.
         *             Required.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ParamKindV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ParamKindV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ParamKindV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ParamKindV1Alpha1 {
        private final java.lang.String apiVersion;
        private final java.lang.String kind;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = builder.apiVersion;
            this.kind = builder.kind;
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ParamKindV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParamKindV1Alpha1.Jsii$Proxy that = (ParamKindV1Alpha1.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            return this.kind != null ? this.kind.equals(that.kind) : that.kind == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            return result;
        }
    }
}
