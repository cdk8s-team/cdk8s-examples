package imports.k8s;

/**
 * WebhookConversion describes how to call a conversion webhook.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.986Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.WebhookConversion")
@software.amazon.jsii.Jsii.Proxy(WebhookConversion.Jsii$Proxy.class)
public interface WebhookConversion extends software.amazon.jsii.JsiiSerializable {

    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects.
     * <p>
     * The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getConversionReviewVersions();

    /**
     * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.WebhookClientConfig getClientConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WebhookConversion}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WebhookConversion}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WebhookConversion> {
        java.util.List<java.lang.String> conversionReviewVersions;
        imports.k8s.WebhookClientConfig clientConfig;

        /**
         * Sets the value of {@link WebhookConversion#getConversionReviewVersions}
         * @param conversionReviewVersions conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. This parameter is required.
         *                                 The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
         * @return {@code this}
         */
        public Builder conversionReviewVersions(java.util.List<java.lang.String> conversionReviewVersions) {
            this.conversionReviewVersions = conversionReviewVersions;
            return this;
        }

        /**
         * Sets the value of {@link WebhookConversion#getClientConfig}
         * @param clientConfig clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
         * @return {@code this}
         */
        public Builder clientConfig(imports.k8s.WebhookClientConfig clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WebhookConversion}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WebhookConversion build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link WebhookConversion}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WebhookConversion {
        private final java.util.List<java.lang.String> conversionReviewVersions;
        private final imports.k8s.WebhookClientConfig clientConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.conversionReviewVersions = software.amazon.jsii.Kernel.get(this, "conversionReviewVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.clientConfig = software.amazon.jsii.Kernel.get(this, "clientConfig", software.amazon.jsii.NativeType.forClass(imports.k8s.WebhookClientConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.conversionReviewVersions = java.util.Objects.requireNonNull(builder.conversionReviewVersions, "conversionReviewVersions is required");
            this.clientConfig = builder.clientConfig;
        }

        @Override
        public final java.util.List<java.lang.String> getConversionReviewVersions() {
            return this.conversionReviewVersions;
        }

        @Override
        public final imports.k8s.WebhookClientConfig getClientConfig() {
            return this.clientConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("conversionReviewVersions", om.valueToTree(this.getConversionReviewVersions()));
            if (this.getClientConfig() != null) {
                data.set("clientConfig", om.valueToTree(this.getClientConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.WebhookConversion"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WebhookConversion.Jsii$Proxy that = (WebhookConversion.Jsii$Proxy) o;

            if (!conversionReviewVersions.equals(that.conversionReviewVersions)) return false;
            return this.clientConfig != null ? this.clientConfig.equals(that.clientConfig) : that.clientConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.conversionReviewVersions.hashCode();
            result = 31 * result + (this.clientConfig != null ? this.clientConfig.hashCode() : 0);
            return result;
        }
    }
}
