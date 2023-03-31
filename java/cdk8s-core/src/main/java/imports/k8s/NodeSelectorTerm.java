package imports.k8s;

/**
 * A null or empty node selector term matches no objects.
 * <p>
 * The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.928Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NodeSelectorTerm")
@software.amazon.jsii.Jsii.Proxy(NodeSelectorTerm.Jsii$Proxy.class)
public interface NodeSelectorTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of node selector requirements by node's labels.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NodeSelectorRequirement> getMatchExpressions() {
        return null;
    }

    /**
     * A list of node selector requirements by node's fields.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NodeSelectorRequirement> getMatchFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NodeSelectorTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NodeSelectorTerm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NodeSelectorTerm> {
        java.util.List<imports.k8s.NodeSelectorRequirement> matchExpressions;
        java.util.List<imports.k8s.NodeSelectorRequirement> matchFields;

        /**
         * Sets the value of {@link NodeSelectorTerm#getMatchExpressions}
         * @param matchExpressions A list of node selector requirements by node's labels.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder matchExpressions(java.util.List<? extends imports.k8s.NodeSelectorRequirement> matchExpressions) {
            this.matchExpressions = (java.util.List<imports.k8s.NodeSelectorRequirement>)matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link NodeSelectorTerm#getMatchFields}
         * @param matchFields A list of node selector requirements by node's fields.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder matchFields(java.util.List<? extends imports.k8s.NodeSelectorRequirement> matchFields) {
            this.matchFields = (java.util.List<imports.k8s.NodeSelectorRequirement>)matchFields;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NodeSelectorTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NodeSelectorTerm build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NodeSelectorTerm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NodeSelectorTerm {
        private final java.util.List<imports.k8s.NodeSelectorRequirement> matchExpressions;
        private final java.util.List<imports.k8s.NodeSelectorRequirement> matchFields;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = software.amazon.jsii.Kernel.get(this, "matchExpressions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelectorRequirement.class)));
            this.matchFields = software.amazon.jsii.Kernel.get(this, "matchFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NodeSelectorRequirement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = (java.util.List<imports.k8s.NodeSelectorRequirement>)builder.matchExpressions;
            this.matchFields = (java.util.List<imports.k8s.NodeSelectorRequirement>)builder.matchFields;
        }

        @Override
        public final java.util.List<imports.k8s.NodeSelectorRequirement> getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        public final java.util.List<imports.k8s.NodeSelectorRequirement> getMatchFields() {
            return this.matchFields;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }
            if (this.getMatchFields() != null) {
                data.set("matchFields", om.valueToTree(this.getMatchFields()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NodeSelectorTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NodeSelectorTerm.Jsii$Proxy that = (NodeSelectorTerm.Jsii$Proxy) o;

            if (this.matchExpressions != null ? !this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions != null) return false;
            return this.matchFields != null ? this.matchFields.equals(that.matchFields) : that.matchFields == null;
        }

        @Override
        public final int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            result = 31 * result + (this.matchFields != null ? this.matchFields.hashCode() : 0);
            return result;
        }
    }
}
