package imports.k8s;

/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.881Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodDisruptionBudgetSpec")
@software.amazon.jsii.Jsii.Proxy(PodDisruptionBudgetSpec.Jsii$Proxy.class)
public interface PodDisruptionBudgetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getMaxUnavailable() {
        return null;
    }

    /**
     * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IntOrString getMinAvailable() {
        return null;
    }

    /**
     * Label query over pods whose evictions are managed by the disruption budget.
     * <p>
     * A null selector will match no pods, while an empty ({}) selector will select all pods within the namespace.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * UnhealthyPodEvictionPolicy defines the criteria for when unhealthy pods should be considered for eviction.
     * <p>
     * Current implementation considers healthy pods, as pods that have status.conditions item with type="Ready",status="True".
     * <p>
     * Valid policies are IfHealthyBudget and AlwaysAllow. If no policy is specified, the default behavior will be used, which corresponds to the IfHealthyBudget policy.
     * <p>
     * IfHealthyBudget policy means that running pods (status.phase="Running"), but not yet healthy can be evicted only if the guarded application is not disrupted (status.currentHealthy is at least equal to status.desiredHealthy). Healthy pods will be subject to the PDB for eviction.
     * <p>
     * AlwaysAllow policy means that all running pods (status.phase="Running"), but not yet healthy are considered disrupted and can be evicted regardless of whether the criteria in a PDB is met. This means perspective running pods of a disrupted application might not get a chance to become healthy. Healthy pods will be subject to the PDB for eviction.
     * <p>
     * Additional policies may be added in the future. Clients making eviction decisions should disallow eviction of unhealthy pods if they encounter an unrecognized policy in this field.
     * <p>
     * This field is alpha-level. The eviction API uses this field when the feature gate PDBUnhealthyPodEvictionPolicy is enabled (disabled by default).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUnhealthyPodEvictionPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodDisruptionBudgetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodDisruptionBudgetSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodDisruptionBudgetSpec> {
        imports.k8s.IntOrString maxUnavailable;
        imports.k8s.IntOrString minAvailable;
        imports.k8s.LabelSelector selector;
        java.lang.String unhealthyPodEvictionPolicy;

        /**
         * Sets the value of {@link PodDisruptionBudgetSpec#getMaxUnavailable}
         * @param maxUnavailable An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
         * @return {@code this}
         */
        public Builder maxUnavailable(imports.k8s.IntOrString maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetSpec#getMinAvailable}
         * @param minAvailable An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
         * @return {@code this}
         */
        public Builder minAvailable(imports.k8s.IntOrString minAvailable) {
            this.minAvailable = minAvailable;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetSpec#getSelector}
         * @param selector Label query over pods whose evictions are managed by the disruption budget.
         *                 A null selector will match no pods, while an empty ({}) selector will select all pods within the namespace.
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetSpec#getUnhealthyPodEvictionPolicy}
         * @param unhealthyPodEvictionPolicy UnhealthyPodEvictionPolicy defines the criteria for when unhealthy pods should be considered for eviction.
         *                                   Current implementation considers healthy pods, as pods that have status.conditions item with type="Ready",status="True".
         *                                   <p>
         *                                   Valid policies are IfHealthyBudget and AlwaysAllow. If no policy is specified, the default behavior will be used, which corresponds to the IfHealthyBudget policy.
         *                                   <p>
         *                                   IfHealthyBudget policy means that running pods (status.phase="Running"), but not yet healthy can be evicted only if the guarded application is not disrupted (status.currentHealthy is at least equal to status.desiredHealthy). Healthy pods will be subject to the PDB for eviction.
         *                                   <p>
         *                                   AlwaysAllow policy means that all running pods (status.phase="Running"), but not yet healthy are considered disrupted and can be evicted regardless of whether the criteria in a PDB is met. This means perspective running pods of a disrupted application might not get a chance to become healthy. Healthy pods will be subject to the PDB for eviction.
         *                                   <p>
         *                                   Additional policies may be added in the future. Clients making eviction decisions should disallow eviction of unhealthy pods if they encounter an unrecognized policy in this field.
         *                                   <p>
         *                                   This field is alpha-level. The eviction API uses this field when the feature gate PDBUnhealthyPodEvictionPolicy is enabled (disabled by default).
         * @return {@code this}
         */
        public Builder unhealthyPodEvictionPolicy(java.lang.String unhealthyPodEvictionPolicy) {
            this.unhealthyPodEvictionPolicy = unhealthyPodEvictionPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodDisruptionBudgetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodDisruptionBudgetSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodDisruptionBudgetSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodDisruptionBudgetSpec {
        private final imports.k8s.IntOrString maxUnavailable;
        private final imports.k8s.IntOrString minAvailable;
        private final imports.k8s.LabelSelector selector;
        private final java.lang.String unhealthyPodEvictionPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxUnavailable = software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
            this.minAvailable = software.amazon.jsii.Kernel.get(this, "minAvailable", software.amazon.jsii.NativeType.forClass(imports.k8s.IntOrString.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.unhealthyPodEvictionPolicy = software.amazon.jsii.Kernel.get(this, "unhealthyPodEvictionPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxUnavailable = builder.maxUnavailable;
            this.minAvailable = builder.minAvailable;
            this.selector = builder.selector;
            this.unhealthyPodEvictionPolicy = builder.unhealthyPodEvictionPolicy;
        }

        @Override
        public final imports.k8s.IntOrString getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public final imports.k8s.IntOrString getMinAvailable() {
            return this.minAvailable;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getUnhealthyPodEvictionPolicy() {
            return this.unhealthyPodEvictionPolicy;
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
            if (this.getUnhealthyPodEvictionPolicy() != null) {
                data.set("unhealthyPodEvictionPolicy", om.valueToTree(this.getUnhealthyPodEvictionPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodDisruptionBudgetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodDisruptionBudgetSpec.Jsii$Proxy that = (PodDisruptionBudgetSpec.Jsii$Proxy) o;

            if (this.maxUnavailable != null ? !this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable != null) return false;
            if (this.minAvailable != null ? !this.minAvailable.equals(that.minAvailable) : that.minAvailable != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            return this.unhealthyPodEvictionPolicy != null ? this.unhealthyPodEvictionPolicy.equals(that.unhealthyPodEvictionPolicy) : that.unhealthyPodEvictionPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0;
            result = 31 * result + (this.minAvailable != null ? this.minAvailable.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.unhealthyPodEvictionPolicy != null ? this.unhealthyPodEvictionPolicy.hashCode() : 0);
            return result;
        }
    }
}
