package imports.k8s;

/**
 * TokenRequestSpec contains client provided parameters of a token request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.944Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.TokenRequestSpec")
@software.amazon.jsii.Jsii.Proxy(TokenRequestSpec.Jsii$Proxy.class)
public interface TokenRequestSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Audiences are the intendend audiences of the token.
     * <p>
     * A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAudiences();

    /**
     * BoundObjectRef is a reference to an object that the token will be bound to.
     * <p>
     * The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.BoundObjectReference getBoundObjectRef() {
        return null;
    }

    /**
     * ExpirationSeconds is the requested duration of validity of the request.
     * <p>
     * The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getExpirationSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TokenRequestSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TokenRequestSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TokenRequestSpec> {
        java.util.List<java.lang.String> audiences;
        imports.k8s.BoundObjectReference boundObjectRef;
        java.lang.Number expirationSeconds;

        /**
         * Sets the value of {@link TokenRequestSpec#getAudiences}
         * @param audiences Audiences are the intendend audiences of the token. This parameter is required.
         *                  A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
         * @return {@code this}
         */
        public Builder audiences(java.util.List<java.lang.String> audiences) {
            this.audiences = audiences;
            return this;
        }

        /**
         * Sets the value of {@link TokenRequestSpec#getBoundObjectRef}
         * @param boundObjectRef BoundObjectRef is a reference to an object that the token will be bound to.
         *                       The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
         * @return {@code this}
         */
        public Builder boundObjectRef(imports.k8s.BoundObjectReference boundObjectRef) {
            this.boundObjectRef = boundObjectRef;
            return this;
        }

        /**
         * Sets the value of {@link TokenRequestSpec#getExpirationSeconds}
         * @param expirationSeconds ExpirationSeconds is the requested duration of validity of the request.
         *                          The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
         * @return {@code this}
         */
        public Builder expirationSeconds(java.lang.Number expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TokenRequestSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TokenRequestSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link TokenRequestSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TokenRequestSpec {
        private final java.util.List<java.lang.String> audiences;
        private final imports.k8s.BoundObjectReference boundObjectRef;
        private final java.lang.Number expirationSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.audiences = software.amazon.jsii.Kernel.get(this, "audiences", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.boundObjectRef = software.amazon.jsii.Kernel.get(this, "boundObjectRef", software.amazon.jsii.NativeType.forClass(imports.k8s.BoundObjectReference.class));
            this.expirationSeconds = software.amazon.jsii.Kernel.get(this, "expirationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.audiences = java.util.Objects.requireNonNull(builder.audiences, "audiences is required");
            this.boundObjectRef = builder.boundObjectRef;
            this.expirationSeconds = builder.expirationSeconds;
        }

        @Override
        public final java.util.List<java.lang.String> getAudiences() {
            return this.audiences;
        }

        @Override
        public final imports.k8s.BoundObjectReference getBoundObjectRef() {
            return this.boundObjectRef;
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

            data.set("audiences", om.valueToTree(this.getAudiences()));
            if (this.getBoundObjectRef() != null) {
                data.set("boundObjectRef", om.valueToTree(this.getBoundObjectRef()));
            }
            if (this.getExpirationSeconds() != null) {
                data.set("expirationSeconds", om.valueToTree(this.getExpirationSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TokenRequestSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TokenRequestSpec.Jsii$Proxy that = (TokenRequestSpec.Jsii$Proxy) o;

            if (!audiences.equals(that.audiences)) return false;
            if (this.boundObjectRef != null ? !this.boundObjectRef.equals(that.boundObjectRef) : that.boundObjectRef != null) return false;
            return this.expirationSeconds != null ? this.expirationSeconds.equals(that.expirationSeconds) : that.expirationSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.audiences.hashCode();
            result = 31 * result + (this.boundObjectRef != null ? this.boundObjectRef.hashCode() : 0);
            result = 31 * result + (this.expirationSeconds != null ? this.expirationSeconds.hashCode() : 0);
            return result;
        }
    }
}
