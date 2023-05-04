package imports.k8s;

/**
 * TokenRequest contains parameters of a service account token.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.944Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.TokenRequest")
@software.amazon.jsii.Jsii.Proxy(TokenRequest.Jsii$Proxy.class)
public interface TokenRequest extends software.amazon.jsii.JsiiSerializable {

    /**
     * Audience is the intended audience of the token in "TokenRequestSpec".
     * <p>
     * It will default to the audiences of kube apiserver.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAudience();

    /**
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
     * <p>
     * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getExpirationSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TokenRequest}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TokenRequest}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TokenRequest> {
        java.lang.String audience;
        java.lang.Number expirationSeconds;

        /**
         * Sets the value of {@link TokenRequest#getAudience}
         * @param audience Audience is the intended audience of the token in "TokenRequestSpec". This parameter is required.
         *                 It will default to the audiences of kube apiserver.
         * @return {@code this}
         */
        public Builder audience(java.lang.String audience) {
            this.audience = audience;
            return this;
        }

        /**
         * Sets the value of {@link TokenRequest#getExpirationSeconds}
         * @param expirationSeconds ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
         *                          It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
         * @return {@code this}
         */
        public Builder expirationSeconds(java.lang.Number expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TokenRequest}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TokenRequest build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link TokenRequest}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TokenRequest {
        private final java.lang.String audience;
        private final java.lang.Number expirationSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.audience = software.amazon.jsii.Kernel.get(this, "audience", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expirationSeconds = software.amazon.jsii.Kernel.get(this, "expirationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.audience = java.util.Objects.requireNonNull(builder.audience, "audience is required");
            this.expirationSeconds = builder.expirationSeconds;
        }

        @Override
        public final java.lang.String getAudience() {
            return this.audience;
        }

        @Override
        public final java.lang.Number getExpirationSeconds() {
            return this.expirationSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("audience", om.valueToTree(this.getAudience()));
            if (this.getExpirationSeconds() != null) {
                data.set("expirationSeconds", om.valueToTree(this.getExpirationSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TokenRequest"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TokenRequest.Jsii$Proxy that = (TokenRequest.Jsii$Proxy) o;

            if (!audience.equals(that.audience)) return false;
            return this.expirationSeconds != null ? this.expirationSeconds.equals(that.expirationSeconds) : that.expirationSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.audience.hashCode();
            result = 31 * result + (this.expirationSeconds != null ? this.expirationSeconds.hashCode() : 0);
            return result;
        }
    }
}
