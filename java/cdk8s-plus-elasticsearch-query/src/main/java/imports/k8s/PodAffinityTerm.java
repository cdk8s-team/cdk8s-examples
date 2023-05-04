package imports.k8s;

/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.881Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodAffinityTerm")
@software.amazon.jsii.Jsii.Proxy(PodAffinityTerm.Jsii$Proxy.class)
public interface PodAffinityTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.
     * <p>
     * Empty topologyKey is not allowed.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTopologyKey();

    /**
     * A label query over a set of resources, in this case pods.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getLabelSelector() {
        return null;
    }

    /**
     * namespaces specifies a static list of namespace names that the term applies to.
     * <p>
     * The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNamespaces() {
        return null;
    }

    /**
     * A label query over the set of namespaces that the term applies to.
     * <p>
     * The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means "this pod's namespace". An empty selector ({}) matches all namespaces.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getNamespaceSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodAffinityTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodAffinityTerm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodAffinityTerm> {
        java.lang.String topologyKey;
        imports.k8s.LabelSelector labelSelector;
        java.util.List<java.lang.String> namespaces;
        imports.k8s.LabelSelector namespaceSelector;

        /**
         * Sets the value of {@link PodAffinityTerm#getTopologyKey}
         * @param topologyKey This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. This parameter is required.
         *                    Empty topologyKey is not allowed.
         * @return {@code this}
         */
        public Builder topologyKey(java.lang.String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }

        /**
         * Sets the value of {@link PodAffinityTerm#getLabelSelector}
         * @param labelSelector A label query over a set of resources, in this case pods.
         * @return {@code this}
         */
        public Builder labelSelector(imports.k8s.LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Sets the value of {@link PodAffinityTerm#getNamespaces}
         * @param namespaces namespaces specifies a static list of namespace names that the term applies to.
         *                   The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
         * @return {@code this}
         */
        public Builder namespaces(java.util.List<java.lang.String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * Sets the value of {@link PodAffinityTerm#getNamespaceSelector}
         * @param namespaceSelector A label query over the set of namespaces that the term applies to.
         *                          The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means "this pod's namespace". An empty selector ({}) matches all namespaces.
         * @return {@code this}
         */
        public Builder namespaceSelector(imports.k8s.LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodAffinityTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodAffinityTerm build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodAffinityTerm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodAffinityTerm {
        private final java.lang.String topologyKey;
        private final imports.k8s.LabelSelector labelSelector;
        private final java.util.List<java.lang.String> namespaces;
        private final imports.k8s.LabelSelector namespaceSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.topologyKey = software.amazon.jsii.Kernel.get(this, "topologyKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.labelSelector = software.amazon.jsii.Kernel.get(this, "labelSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.namespaces = software.amazon.jsii.Kernel.get(this, "namespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.namespaceSelector = software.amazon.jsii.Kernel.get(this, "namespaceSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.topologyKey = java.util.Objects.requireNonNull(builder.topologyKey, "topologyKey is required");
            this.labelSelector = builder.labelSelector;
            this.namespaces = builder.namespaces;
            this.namespaceSelector = builder.namespaceSelector;
        }

        @Override
        public final java.lang.String getTopologyKey() {
            return this.topologyKey;
        }

        @Override
        public final imports.k8s.LabelSelector getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        public final java.util.List<java.lang.String> getNamespaces() {
            return this.namespaces;
        }

        @Override
        public final imports.k8s.LabelSelector getNamespaceSelector() {
            return this.namespaceSelector;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("topologyKey", om.valueToTree(this.getTopologyKey()));
            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }
            if (this.getNamespaces() != null) {
                data.set("namespaces", om.valueToTree(this.getNamespaces()));
            }
            if (this.getNamespaceSelector() != null) {
                data.set("namespaceSelector", om.valueToTree(this.getNamespaceSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodAffinityTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodAffinityTerm.Jsii$Proxy that = (PodAffinityTerm.Jsii$Proxy) o;

            if (!topologyKey.equals(that.topologyKey)) return false;
            if (this.labelSelector != null ? !this.labelSelector.equals(that.labelSelector) : that.labelSelector != null) return false;
            if (this.namespaces != null ? !this.namespaces.equals(that.namespaces) : that.namespaces != null) return false;
            return this.namespaceSelector != null ? this.namespaceSelector.equals(that.namespaceSelector) : that.namespaceSelector == null;
        }

        @Override
        public final int hashCode() {
            int result = this.topologyKey.hashCode();
            result = 31 * result + (this.labelSelector != null ? this.labelSelector.hashCode() : 0);
            result = 31 * result + (this.namespaces != null ? this.namespaces.hashCode() : 0);
            result = 31 * result + (this.namespaceSelector != null ? this.namespaceSelector.hashCode() : 0);
            return result;
        }
    }
}
