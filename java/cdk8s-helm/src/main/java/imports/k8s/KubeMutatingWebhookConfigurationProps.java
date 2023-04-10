package imports.k8s;

/**
 * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.893Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeMutatingWebhookConfigurationProps")
@software.amazon.jsii.Jsii.Proxy(KubeMutatingWebhookConfigurationProps.Jsii$Proxy.class)
public interface KubeMutatingWebhookConfigurationProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object metadata;
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Webhooks is a list of webhooks and the affected resources and operations.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.MutatingWebhook> getWebhooks() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeMutatingWebhookConfigurationProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeMutatingWebhookConfigurationProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeMutatingWebhookConfigurationProps> {
        imports.k8s.ObjectMeta metadata;
        java.util.List<imports.k8s.MutatingWebhook> webhooks;

        /**
         * Sets the value of {@link KubeMutatingWebhookConfigurationProps#getMetadata}
         * @param metadata Standard object metadata;.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeMutatingWebhookConfigurationProps#getWebhooks}
         * @param webhooks Webhooks is a list of webhooks and the affected resources and operations.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder webhooks(java.util.List<? extends imports.k8s.MutatingWebhook> webhooks) {
            this.webhooks = (java.util.List<imports.k8s.MutatingWebhook>)webhooks;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeMutatingWebhookConfigurationProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeMutatingWebhookConfigurationProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeMutatingWebhookConfigurationProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeMutatingWebhookConfigurationProps {
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.MutatingWebhook> webhooks;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.webhooks = software.amazon.jsii.Kernel.get(this, "webhooks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.MutatingWebhook.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.webhooks = (java.util.List<imports.k8s.MutatingWebhook>)builder.webhooks;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.MutatingWebhook> getWebhooks() {
            return this.webhooks;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getWebhooks() != null) {
                data.set("webhooks", om.valueToTree(this.getWebhooks()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeMutatingWebhookConfigurationProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeMutatingWebhookConfigurationProps.Jsii$Proxy that = (KubeMutatingWebhookConfigurationProps.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.webhooks != null ? this.webhooks.equals(that.webhooks) : that.webhooks == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.webhooks != null ? this.webhooks.hashCode() : 0);
            return result;
        }
    }
}
