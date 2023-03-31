package imports.k8s;

/**
 * ResourcePolicyRule is a predicate that matches some resource requests, testing the request's verb and the target resource.
 * <p>
 * A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., <code>Namespace==""</code>) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request's namespace.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.946Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourcePolicyRuleV1Beta2")
@software.amazon.jsii.Jsii.Proxy(ResourcePolicyRuleV1Beta2.Jsii$Proxy.class)
public interface ResourcePolicyRuleV1Beta2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * `apiGroups` is a list of matching API groups and may not be empty.
     * <p>
     * "*" matches all API groups and, if present, must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getApiGroups();

    /**
     * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResources();

    /**
     * `verbs` is a list of matching verbs and may not be empty.
     * <p>
     * "*" matches all verbs and, if present, must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVerbs();

    /**
     * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces).
     * <p>
     * If this field is omitted or false then the <code>namespaces</code> field must contain a non-empty list.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getClusterScope() {
        return null;
    }

    /**
     * `namespaces` is a list of target namespaces that restricts matches.
     * <p>
     * A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "<em>".  Note that "</em>" matches any specified namespace but does not match a request that <em>does not specify</em> a namespace (see the <code>clusterScope</code> field for that). This list may be empty, but only if <code>clusterScope</code> is true.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNamespaces() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourcePolicyRuleV1Beta2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourcePolicyRuleV1Beta2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ResourcePolicyRuleV1Beta2> {
        java.util.List<java.lang.String> apiGroups;
        java.util.List<java.lang.String> resources;
        java.util.List<java.lang.String> verbs;
        java.lang.Boolean clusterScope;
        java.util.List<java.lang.String> namespaces;

        /**
         * Sets the value of {@link ResourcePolicyRuleV1Beta2#getApiGroups}
         * @param apiGroups `apiGroups` is a list of matching API groups and may not be empty. This parameter is required.
         *                  "*" matches all API groups and, if present, must be the only entry. Required.
         * @return {@code this}
         */
        public Builder apiGroups(java.util.List<java.lang.String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRuleV1Beta2#getResources}
         * @param resources `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required. This parameter is required.
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRuleV1Beta2#getVerbs}
         * @param verbs `verbs` is a list of matching verbs and may not be empty. This parameter is required.
         *              "*" matches all verbs and, if present, must be the only entry. Required.
         * @return {@code this}
         */
        public Builder verbs(java.util.List<java.lang.String> verbs) {
            this.verbs = verbs;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRuleV1Beta2#getClusterScope}
         * @param clusterScope `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces).
         *                     If this field is omitted or false then the <code>namespaces</code> field must contain a non-empty list.
         * @return {@code this}
         */
        public Builder clusterScope(java.lang.Boolean clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRuleV1Beta2#getNamespaces}
         * @param namespaces `namespaces` is a list of target namespaces that restricts matches.
         *                   A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "<em>".  Note that "</em>" matches any specified namespace but does not match a request that <em>does not specify</em> a namespace (see the <code>clusterScope</code> field for that). This list may be empty, but only if <code>clusterScope</code> is true.
         * @return {@code this}
         */
        public Builder namespaces(java.util.List<java.lang.String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourcePolicyRuleV1Beta2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ResourcePolicyRuleV1Beta2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ResourcePolicyRuleV1Beta2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourcePolicyRuleV1Beta2 {
        private final java.util.List<java.lang.String> apiGroups;
        private final java.util.List<java.lang.String> resources;
        private final java.util.List<java.lang.String> verbs;
        private final java.lang.Boolean clusterScope;
        private final java.util.List<java.lang.String> namespaces;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiGroups = software.amazon.jsii.Kernel.get(this, "apiGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.verbs = software.amazon.jsii.Kernel.get(this, "verbs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.clusterScope = software.amazon.jsii.Kernel.get(this, "clusterScope", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.namespaces = software.amazon.jsii.Kernel.get(this, "namespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiGroups = java.util.Objects.requireNonNull(builder.apiGroups, "apiGroups is required");
            this.resources = java.util.Objects.requireNonNull(builder.resources, "resources is required");
            this.verbs = java.util.Objects.requireNonNull(builder.verbs, "verbs is required");
            this.clusterScope = builder.clusterScope;
            this.namespaces = builder.namespaces;
        }

        @Override
        public final java.util.List<java.lang.String> getApiGroups() {
            return this.apiGroups;
        }

        @Override
        public final java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        public final java.util.List<java.lang.String> getVerbs() {
            return this.verbs;
        }

        @Override
        public final java.lang.Boolean getClusterScope() {
            return this.clusterScope;
        }

        @Override
        public final java.util.List<java.lang.String> getNamespaces() {
            return this.namespaces;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiGroups", om.valueToTree(this.getApiGroups()));
            data.set("resources", om.valueToTree(this.getResources()));
            data.set("verbs", om.valueToTree(this.getVerbs()));
            if (this.getClusterScope() != null) {
                data.set("clusterScope", om.valueToTree(this.getClusterScope()));
            }
            if (this.getNamespaces() != null) {
                data.set("namespaces", om.valueToTree(this.getNamespaces()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourcePolicyRuleV1Beta2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourcePolicyRuleV1Beta2.Jsii$Proxy that = (ResourcePolicyRuleV1Beta2.Jsii$Proxy) o;

            if (!apiGroups.equals(that.apiGroups)) return false;
            if (!resources.equals(that.resources)) return false;
            if (!verbs.equals(that.verbs)) return false;
            if (this.clusterScope != null ? !this.clusterScope.equals(that.clusterScope) : that.clusterScope != null) return false;
            return this.namespaces != null ? this.namespaces.equals(that.namespaces) : that.namespaces == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiGroups.hashCode();
            result = 31 * result + (this.resources.hashCode());
            result = 31 * result + (this.verbs.hashCode());
            result = 31 * result + (this.clusterScope != null ? this.clusterScope.hashCode() : 0);
            result = 31 * result + (this.namespaces != null ? this.namespaces.hashCode() : 0);
            return result;
        }
    }
}
