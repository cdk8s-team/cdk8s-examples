package imports.k8s;

/**
 * MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria.
 * <p>
 * The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.919Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MatchResourcesV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(MatchResourcesV1Alpha1.Jsii$Proxy.class)
public interface MatchResourcesV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about.
     * <p>
     * The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> getExcludeResourceRules() {
        return null;
    }

    /**
     * matchPolicy defines how the "MatchResources" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * <p>
     * <ul>
     * <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.</li>
     * <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.</li>
     * </ul>
     * <p>
     * Defaults to "Equivalent"
     * <p>
     * Default: Equivalent"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMatchPolicy() {
        return null;
    }

    /**
     * NamespaceSelector decides whether to run the admission control policy on an object based on whether the namespace for that object matches the selector.
     * <p>
     * If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the policy.
     * <p>
     * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
     * "matchExpressions": [
     * {
     * "key": "runlevel",
     * "operator": "NotIn",
     * "values": [
     * "0",
     * "1"
     * ]
     * }
     * ]
     * }
     * <p>
     * If instead you want to only run the policy on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
     * "matchExpressions": [
     * {
     * "key": "environment",
     * "operator": "In",
     * "values": [
     * "prod",
     * "staging"
     * ]
     * }
     * ]
     * }
     * <p>
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
     * <p>
     * Default to the empty LabelSelector, which matches everything.
     * <p>
     * Default: the empty LabelSelector, which matches everything.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getNamespaceSelector() {
        return null;
    }

    /**
     * ObjectSelector decides whether to run the validation based on if the object has matching labels.
     * <p>
     * objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * <p>
     * Default: the empty LabelSelector, which matches everything.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getObjectSelector() {
        return null;
    }

    /**
     * ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches.
     * <p>
     * The policy cares about an operation if it matches <em>any</em> Rule.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> getResourceRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MatchResourcesV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MatchResourcesV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MatchResourcesV1Alpha1> {
        java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> excludeResourceRules;
        java.lang.String matchPolicy;
        imports.k8s.LabelSelector namespaceSelector;
        imports.k8s.LabelSelector objectSelector;
        java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> resourceRules;

        /**
         * Sets the value of {@link MatchResourcesV1Alpha1#getExcludeResourceRules}
         * @param excludeResourceRules ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about.
         *                             The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder excludeResourceRules(java.util.List<? extends imports.k8s.NamedRuleWithOperationsV1Alpha1> excludeResourceRules) {
            this.excludeResourceRules = (java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1>)excludeResourceRules;
            return this;
        }

        /**
         * Sets the value of {@link MatchResourcesV1Alpha1#getMatchPolicy}
         * @param matchPolicy matchPolicy defines how the "MatchResources" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
         *                    <ul>
         *                    <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.</li>
         *                    <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.</li>
         *                    </ul>
         *                    <p>
         *                    Defaults to "Equivalent"
         * @return {@code this}
         */
        public Builder matchPolicy(java.lang.String matchPolicy) {
            this.matchPolicy = matchPolicy;
            return this;
        }

        /**
         * Sets the value of {@link MatchResourcesV1Alpha1#getNamespaceSelector}
         * @param namespaceSelector NamespaceSelector decides whether to run the admission control policy on an object based on whether the namespace for that object matches the selector.
         *                          If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the policy.
         *                          <p>
         *                          For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
         *                          "matchExpressions": [
         *                          {
         *                          "key": "runlevel",
         *                          "operator": "NotIn",
         *                          "values": [
         *                          "0",
         *                          "1"
         *                          ]
         *                          }
         *                          ]
         *                          }
         *                          <p>
         *                          If instead you want to only run the policy on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
         *                          "matchExpressions": [
         *                          {
         *                          "key": "environment",
         *                          "operator": "In",
         *                          "values": [
         *                          "prod",
         *                          "staging"
         *                          ]
         *                          }
         *                          ]
         *                          }
         *                          <p>
         *                          See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
         *                          <p>
         *                          Default to the empty LabelSelector, which matches everything.
         * @return {@code this}
         */
        public Builder namespaceSelector(imports.k8s.LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * Sets the value of {@link MatchResourcesV1Alpha1#getObjectSelector}
         * @param objectSelector ObjectSelector decides whether to run the validation based on if the object has matching labels.
         *                       objectSelector is evaluated against both the oldObject and newObject that would be sent to the cel validation, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
         * @return {@code this}
         */
        public Builder objectSelector(imports.k8s.LabelSelector objectSelector) {
            this.objectSelector = objectSelector;
            return this;
        }

        /**
         * Sets the value of {@link MatchResourcesV1Alpha1#getResourceRules}
         * @param resourceRules ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches.
         *                      The policy cares about an operation if it matches <em>any</em> Rule.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder resourceRules(java.util.List<? extends imports.k8s.NamedRuleWithOperationsV1Alpha1> resourceRules) {
            this.resourceRules = (java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1>)resourceRules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MatchResourcesV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MatchResourcesV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MatchResourcesV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MatchResourcesV1Alpha1 {
        private final java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> excludeResourceRules;
        private final java.lang.String matchPolicy;
        private final imports.k8s.LabelSelector namespaceSelector;
        private final imports.k8s.LabelSelector objectSelector;
        private final java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> resourceRules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.excludeResourceRules = software.amazon.jsii.Kernel.get(this, "excludeResourceRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NamedRuleWithOperationsV1Alpha1.class)));
            this.matchPolicy = software.amazon.jsii.Kernel.get(this, "matchPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespaceSelector = software.amazon.jsii.Kernel.get(this, "namespaceSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.objectSelector = software.amazon.jsii.Kernel.get(this, "objectSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.resourceRules = software.amazon.jsii.Kernel.get(this, "resourceRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NamedRuleWithOperationsV1Alpha1.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.excludeResourceRules = (java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1>)builder.excludeResourceRules;
            this.matchPolicy = builder.matchPolicy;
            this.namespaceSelector = builder.namespaceSelector;
            this.objectSelector = builder.objectSelector;
            this.resourceRules = (java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1>)builder.resourceRules;
        }

        @Override
        public final java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> getExcludeResourceRules() {
            return this.excludeResourceRules;
        }

        @Override
        public final java.lang.String getMatchPolicy() {
            return this.matchPolicy;
        }

        @Override
        public final imports.k8s.LabelSelector getNamespaceSelector() {
            return this.namespaceSelector;
        }

        @Override
        public final imports.k8s.LabelSelector getObjectSelector() {
            return this.objectSelector;
        }

        @Override
        public final java.util.List<imports.k8s.NamedRuleWithOperationsV1Alpha1> getResourceRules() {
            return this.resourceRules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExcludeResourceRules() != null) {
                data.set("excludeResourceRules", om.valueToTree(this.getExcludeResourceRules()));
            }
            if (this.getMatchPolicy() != null) {
                data.set("matchPolicy", om.valueToTree(this.getMatchPolicy()));
            }
            if (this.getNamespaceSelector() != null) {
                data.set("namespaceSelector", om.valueToTree(this.getNamespaceSelector()));
            }
            if (this.getObjectSelector() != null) {
                data.set("objectSelector", om.valueToTree(this.getObjectSelector()));
            }
            if (this.getResourceRules() != null) {
                data.set("resourceRules", om.valueToTree(this.getResourceRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.MatchResourcesV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MatchResourcesV1Alpha1.Jsii$Proxy that = (MatchResourcesV1Alpha1.Jsii$Proxy) o;

            if (this.excludeResourceRules != null ? !this.excludeResourceRules.equals(that.excludeResourceRules) : that.excludeResourceRules != null) return false;
            if (this.matchPolicy != null ? !this.matchPolicy.equals(that.matchPolicy) : that.matchPolicy != null) return false;
            if (this.namespaceSelector != null ? !this.namespaceSelector.equals(that.namespaceSelector) : that.namespaceSelector != null) return false;
            if (this.objectSelector != null ? !this.objectSelector.equals(that.objectSelector) : that.objectSelector != null) return false;
            return this.resourceRules != null ? this.resourceRules.equals(that.resourceRules) : that.resourceRules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.excludeResourceRules != null ? this.excludeResourceRules.hashCode() : 0;
            result = 31 * result + (this.matchPolicy != null ? this.matchPolicy.hashCode() : 0);
            result = 31 * result + (this.namespaceSelector != null ? this.namespaceSelector.hashCode() : 0);
            result = 31 * result + (this.objectSelector != null ? this.objectSelector.hashCode() : 0);
            result = 31 * result + (this.resourceRules != null ? this.resourceRules.hashCode() : 0);
            return result;
        }
    }
}
