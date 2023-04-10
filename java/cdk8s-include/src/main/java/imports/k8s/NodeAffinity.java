package imports.k8s;

/**
 * Node affinity is a group of node affinity scheduling rules.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.928Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NodeAffinity")
@software.amazon.jsii.Jsii.Proxy(NodeAffinity.Jsii$Proxy.class)
public interface NodeAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
     * <p>
     * The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
     * <p>
     * If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NodeAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NodeAffinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NodeAffinity> {
        java.util.List<imports.k8s.PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
        imports.k8s.NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Sets the value of {@link NodeAffinity#getPreferredDuringSchedulingIgnoredDuringExecution}
         * @param preferredDuringSchedulingIgnoredDuringExecution The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
         *                                                        The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder preferredDuringSchedulingIgnoredDuringExecution(java.util.List<? extends imports.k8s.PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = (java.util.List<imports.k8s.PreferredSchedulingTerm>)preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Sets the value of {@link NodeAffinity#getRequiredDuringSchedulingIgnoredDuringExecution}
         * @param requiredDuringSchedulingIgnoredDuringExecution If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
         *                                                       If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
         * @return {@code this}
         */
        public Builder requiredDuringSchedulingIgnoredDuringExecution(imports.k8s.NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NodeAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NodeAffinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NodeAffinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NodeAffinity {
        private final java.util.List<imports.k8s.PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
        private final imports.k8s.NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.preferredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "preferredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.PreferredSchedulingTerm.class)));
            this.requiredDuringSchedulingIgnoredDuringExecution = software.amazon.jsii.Kernel.get(this, "requiredDuringSchedulingIgnoredDuringExecution", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.preferredDuringSchedulingIgnoredDuringExecution = (java.util.List<imports.k8s.PreferredSchedulingTerm>)builder.preferredDuringSchedulingIgnoredDuringExecution;
            this.requiredDuringSchedulingIgnoredDuringExecution = builder.requiredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        public final java.util.List<imports.k8s.PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
            return this.preferredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        public final imports.k8s.NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
            return this.requiredDuringSchedulingIgnoredDuringExecution;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPreferredDuringSchedulingIgnoredDuringExecution() != null) {
                data.set("preferredDuringSchedulingIgnoredDuringExecution", om.valueToTree(this.getPreferredDuringSchedulingIgnoredDuringExecution()));
            }
            if (this.getRequiredDuringSchedulingIgnoredDuringExecution() != null) {
                data.set("requiredDuringSchedulingIgnoredDuringExecution", om.valueToTree(this.getRequiredDuringSchedulingIgnoredDuringExecution()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NodeAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NodeAffinity.Jsii$Proxy that = (NodeAffinity.Jsii$Proxy) o;

            if (this.preferredDuringSchedulingIgnoredDuringExecution != null ? !this.preferredDuringSchedulingIgnoredDuringExecution.equals(that.preferredDuringSchedulingIgnoredDuringExecution) : that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
            return this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.equals(that.requiredDuringSchedulingIgnoredDuringExecution) : that.requiredDuringSchedulingIgnoredDuringExecution == null;
        }

        @Override
        public final int hashCode() {
            int result = this.preferredDuringSchedulingIgnoredDuringExecution != null ? this.preferredDuringSchedulingIgnoredDuringExecution.hashCode() : 0;
            result = 31 * result + (this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.hashCode() : 0);
            return result;
        }
    }
}
