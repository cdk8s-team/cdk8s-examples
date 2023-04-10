package imports.co.elastic.k8s.elasticsearch;

/**
 * Spec is the specification of the PDB.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.061Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpec")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecPodDisruptionBudgetSpec.Jsii$Proxy.class)
public interface ElasticsearchSpecPodDisruptionBudgetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable getMaxUnavailable() {
        return null;
    }

    /**
     * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable getMinAvailable() {
        return null;
    }

    /**
     * Label query over pods whose evictions are managed by the disruption budget.
     */
    default @org.jetbrains.annotations.Nullable imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelector getSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecPodDisruptionBudgetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecPodDisruptionBudgetSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecPodDisruptionBudgetSpec> {
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable maxUnavailable;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable minAvailable;
        imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelector selector;

        /**
         * Sets the value of {@link ElasticsearchSpecPodDisruptionBudgetSpec#getMaxUnavailable}
         * @param maxUnavailable An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
         * @return {@code this}
         */
        public Builder maxUnavailable(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecPodDisruptionBudgetSpec#getMinAvailable}
         * @param minAvailable An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
         * @return {@code this}
         */
        public Builder minAvailable(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable minAvailable) {
            this.minAvailable = minAvailable;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecPodDisruptionBudgetSpec#getSelector}
         * @param selector Label query over pods whose evictions are managed by the disruption budget.
         * @return {@code this}
         */
        public Builder selector(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecPodDisruptionBudgetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecPodDisruptionBudgetSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecPodDisruptionBudgetSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecPodDisruptionBudgetSpec {
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable maxUnavailable;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable minAvailable;
        private final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelector selector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxUnavailable = software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable.class));
            this.minAvailable = software.amazon.jsii.Kernel.get(this, "minAvailable", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxUnavailable = builder.maxUnavailable;
            this.minAvailable = builder.minAvailable;
            this.selector = builder.selector;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable getMinAvailable() {
            return this.minAvailable;
        }

        @Override
        public final imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelector getSelector() {
            return this.selector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }
            if (this.getMinAvailable() != null) {
                data.set("minAvailable", om.valueToTree(this.getMinAvailable()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecPodDisruptionBudgetSpec.Jsii$Proxy that = (ElasticsearchSpecPodDisruptionBudgetSpec.Jsii$Proxy) o;

            if (this.maxUnavailable != null ? !this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable != null) return false;
            if (this.minAvailable != null ? !this.minAvailable.equals(that.minAvailable) : that.minAvailable != null) return false;
            return this.selector != null ? this.selector.equals(that.selector) : that.selector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0;
            result = 31 * result + (this.minAvailable != null ? this.minAvailable.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            return result;
        }
    }
}
