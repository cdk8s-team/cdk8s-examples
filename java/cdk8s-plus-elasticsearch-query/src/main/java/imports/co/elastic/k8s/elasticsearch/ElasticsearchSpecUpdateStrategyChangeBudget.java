package imports.co.elastic.k8s.elasticsearch;

/**
 * ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.065Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecUpdateStrategyChangeBudget.Jsii$Proxy.class)
public interface ElasticsearchSpecUpdateStrategyChangeBudget extends software.amazon.jsii.JsiiSerializable {

    /**
     * MaxSurge is the maximum number of new pods that can be created exceeding the original number of pods defined in the specification.
     * <p>
     * MaxSurge is only taken into consideration when scaling up. Setting a negative value will disable the restriction. Defaults to unbounded if not specified.
     * <p>
     * Default: unbounded if not specified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxSurge() {
        return null;
    }

    /**
     * MaxUnavailable is the maximum number of pods that can be unavailable (not ready) during the update due to circumstances under the control of the operator.
     * <p>
     * Setting a negative value will disable this restriction. Defaults to 1 if not specified.
     * <p>
     * Default: 1 if not specified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxUnavailable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecUpdateStrategyChangeBudget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecUpdateStrategyChangeBudget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecUpdateStrategyChangeBudget> {
        java.lang.Number maxSurge;
        java.lang.Number maxUnavailable;

        /**
         * Sets the value of {@link ElasticsearchSpecUpdateStrategyChangeBudget#getMaxSurge}
         * @param maxSurge MaxSurge is the maximum number of new pods that can be created exceeding the original number of pods defined in the specification.
         *                 MaxSurge is only taken into consideration when scaling up. Setting a negative value will disable the restriction. Defaults to unbounded if not specified.
         * @return {@code this}
         */
        public Builder maxSurge(java.lang.Number maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecUpdateStrategyChangeBudget#getMaxUnavailable}
         * @param maxUnavailable MaxUnavailable is the maximum number of pods that can be unavailable (not ready) during the update due to circumstances under the control of the operator.
         *                       Setting a negative value will disable this restriction. Defaults to 1 if not specified.
         * @return {@code this}
         */
        public Builder maxUnavailable(java.lang.Number maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecUpdateStrategyChangeBudget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecUpdateStrategyChangeBudget build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecUpdateStrategyChangeBudget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecUpdateStrategyChangeBudget {
        private final java.lang.Number maxSurge;
        private final java.lang.Number maxUnavailable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxSurge = software.amazon.jsii.Kernel.get(this, "maxSurge", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxUnavailable = software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxSurge = builder.maxSurge;
            this.maxUnavailable = builder.maxUnavailable;
        }

        @Override
        public final java.lang.Number getMaxSurge() {
            return this.maxSurge;
        }

        @Override
        public final java.lang.Number getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxSurge() != null) {
                data.set("maxSurge", om.valueToTree(this.getMaxSurge()));
            }
            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecUpdateStrategyChangeBudget.Jsii$Proxy that = (ElasticsearchSpecUpdateStrategyChangeBudget.Jsii$Proxy) o;

            if (this.maxSurge != null ? !this.maxSurge.equals(that.maxSurge) : that.maxSurge != null) return false;
            return this.maxUnavailable != null ? this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxSurge != null ? this.maxSurge.hashCode() : 0;
            result = 31 * result + (this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0);
            return result;
        }
    }
}
