package imports.k8s;

/**
 * RuleWithOperations is a tuple of Operations and Resources.
 * <p>
 * It is recommended to make sure that all the tuple expansions are valid.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.947Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RuleWithOperations")
@software.amazon.jsii.Jsii.Proxy(RuleWithOperations.Jsii$Proxy.class)
public interface RuleWithOperations extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIGroups is the API groups the resources belong to.
     * <p>
     * '<em>' is all groups. If '</em>' is present, the length of the slice must be one. Required.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApiGroups() {
        return null;
    }

    /**
     * APIVersions is the API versions the resources belong to.
     * <p>
     * '<em>' is all versions. If '</em>' is present, the length of the slice must be one. Required.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApiVersions() {
        return null;
    }

    /**
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added.
     * <p>
     * If '*' is present, the length of the slice must be one. Required.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOperations() {
        return null;
    }

    /**
     * Resources is a list of resources this rule applies to.
     * <p>
     * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '<em>' means all resources, but not subresources. 'pods/</em>' means all subresources of pods. '<em>/scale' means all scale subresources. '</em>/*' means all resources and their subresources.
     * <p>
     * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
     * <p>
     * Depending on the enclosing object, subresources might not be allowed. Required.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResources() {
        return null;
    }

    /**
     * scope specifies the scope of this rule.
     * <p>
     * Valid values are "Cluster", "Namespaced", and "<em>" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "</em>" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
     * <p>
     * Default: .
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getScope() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RuleWithOperations}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RuleWithOperations}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RuleWithOperations> {
        java.util.List<java.lang.String> apiGroups;
        java.util.List<java.lang.String> apiVersions;
        java.util.List<java.lang.String> operations;
        java.util.List<java.lang.String> resources;
        java.lang.String scope;

        /**
         * Sets the value of {@link RuleWithOperations#getApiGroups}
         * @param apiGroups APIGroups is the API groups the resources belong to.
         *                  '<em>' is all groups. If '</em>' is present, the length of the slice must be one. Required.
         * @return {@code this}
         */
        public Builder apiGroups(java.util.List<java.lang.String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        /**
         * Sets the value of {@link RuleWithOperations#getApiVersions}
         * @param apiVersions APIVersions is the API versions the resources belong to.
         *                    '<em>' is all versions. If '</em>' is present, the length of the slice must be one. Required.
         * @return {@code this}
         */
        public Builder apiVersions(java.util.List<java.lang.String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        /**
         * Sets the value of {@link RuleWithOperations#getOperations}
         * @param operations Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added.
         *                   If '*' is present, the length of the slice must be one. Required.
         * @return {@code this}
         */
        public Builder operations(java.util.List<java.lang.String> operations) {
            this.operations = operations;
            return this;
        }

        /**
         * Sets the value of {@link RuleWithOperations#getResources}
         * @param resources Resources is a list of resources this rule applies to.
         *                  For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '<em>' means all resources, but not subresources. 'pods/</em>' means all subresources of pods. '<em>/scale' means all scale subresources. '</em>/*' means all resources and their subresources.
         *                  <p>
         *                  If wildcard is present, the validation rule will ensure resources do not overlap with each other.
         *                  <p>
         *                  Depending on the enclosing object, subresources might not be allowed. Required.
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link RuleWithOperations#getScope}
         * @param scope scope specifies the scope of this rule.
         *              Valid values are "Cluster", "Namespaced", and "<em>" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "</em>" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RuleWithOperations}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RuleWithOperations build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RuleWithOperations}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RuleWithOperations {
        private final java.util.List<java.lang.String> apiGroups;
        private final java.util.List<java.lang.String> apiVersions;
        private final java.util.List<java.lang.String> operations;
        private final java.util.List<java.lang.String> resources;
        private final java.lang.String scope;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiGroups = software.amazon.jsii.Kernel.get(this, "apiGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.apiVersions = software.amazon.jsii.Kernel.get(this, "apiVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.operations = software.amazon.jsii.Kernel.get(this, "operations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiGroups = builder.apiGroups;
            this.apiVersions = builder.apiVersions;
            this.operations = builder.operations;
            this.resources = builder.resources;
            this.scope = builder.scope;
        }

        @Override
        public final java.util.List<java.lang.String> getApiGroups() {
            return this.apiGroups;
        }

        @Override
        public final java.util.List<java.lang.String> getApiVersions() {
            return this.apiVersions;
        }

        @Override
        public final java.util.List<java.lang.String> getOperations() {
            return this.operations;
        }

        @Override
        public final java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        public final java.lang.String getScope() {
            return this.scope;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiGroups() != null) {
                data.set("apiGroups", om.valueToTree(this.getApiGroups()));
            }
            if (this.getApiVersions() != null) {
                data.set("apiVersions", om.valueToTree(this.getApiVersions()));
            }
            if (this.getOperations() != null) {
                data.set("operations", om.valueToTree(this.getOperations()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getScope() != null) {
                data.set("scope", om.valueToTree(this.getScope()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RuleWithOperations"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RuleWithOperations.Jsii$Proxy that = (RuleWithOperations.Jsii$Proxy) o;

            if (this.apiGroups != null ? !this.apiGroups.equals(that.apiGroups) : that.apiGroups != null) return false;
            if (this.apiVersions != null ? !this.apiVersions.equals(that.apiVersions) : that.apiVersions != null) return false;
            if (this.operations != null ? !this.operations.equals(that.operations) : that.operations != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            return this.scope != null ? this.scope.equals(that.scope) : that.scope == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiGroups != null ? this.apiGroups.hashCode() : 0;
            result = 31 * result + (this.apiVersions != null ? this.apiVersions.hashCode() : 0);
            result = 31 * result + (this.operations != null ? this.operations.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.scope != null ? this.scope.hashCode() : 0);
            return result;
        }
    }
}
