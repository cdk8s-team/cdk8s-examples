package imports.k8s;

/**
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.756Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionSpec")
@software.amazon.jsii.Jsii.Proxy(CustomResourceDefinitionSpec.Jsii$Proxy.class)
public interface CustomResourceDefinitionSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * group is the API group of the defined custom resource.
     * <p>
     * The custom resources are served under <code>/apis/&lt;group&gt;/...</code>. Must match the name of the CustomResourceDefinition (in the form <code>&lt;names.plural&gt;.&lt;group&gt;</code>).
     */
    @org.jetbrains.annotations.NotNull java.lang.String getGroup();

    /**
     * names specify the resource and kind names for the custom resource.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CustomResourceDefinitionNames getNames();

    /**
     * scope indicates whether the defined custom resource is cluster- or namespace-scoped.
     * <p>
     * Allowed values are <code>Cluster</code> and <code>Namespaced</code>.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getScope();

    /**
     * versions is the list of all API versions of the defined custom resource.
     * <p>
     * Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.CustomResourceDefinitionVersion> getVersions();

    /**
     * conversion defines conversion settings for the CRD.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CustomResourceConversion getConversion() {
        return null;
    }

    /**
     * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage.
     * <p>
     * apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting <code>x-preserve-unknown-fields</code> to true in <code>spec.versions[*].schema.openAPIV3Schema</code>. See https://kubernetes.io/docs/tasks/extend-kubernetes/custom-resources/custom-resource-definitions/#field-pruning for details.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPreserveUnknownFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceDefinitionSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceDefinitionSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceDefinitionSpec> {
        java.lang.String group;
        imports.k8s.CustomResourceDefinitionNames names;
        java.lang.String scope;
        java.util.List<imports.k8s.CustomResourceDefinitionVersion> versions;
        imports.k8s.CustomResourceConversion conversion;
        java.lang.Boolean preserveUnknownFields;

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getGroup}
         * @param group group is the API group of the defined custom resource. This parameter is required.
         *              The custom resources are served under <code>/apis/&lt;group&gt;/...</code>. Must match the name of the CustomResourceDefinition (in the form <code>&lt;names.plural&gt;.&lt;group&gt;</code>).
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getNames}
         * @param names names specify the resource and kind names for the custom resource. This parameter is required.
         * @return {@code this}
         */
        public Builder names(imports.k8s.CustomResourceDefinitionNames names) {
            this.names = names;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getScope}
         * @param scope scope indicates whether the defined custom resource is cluster- or namespace-scoped. This parameter is required.
         *              Allowed values are <code>Cluster</code> and <code>Namespaced</code>.
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getVersions}
         * @param versions versions is the list of all API versions of the defined custom resource. This parameter is required.
         *                 Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder versions(java.util.List<? extends imports.k8s.CustomResourceDefinitionVersion> versions) {
            this.versions = (java.util.List<imports.k8s.CustomResourceDefinitionVersion>)versions;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getConversion}
         * @param conversion conversion defines conversion settings for the CRD.
         * @return {@code this}
         */
        public Builder conversion(imports.k8s.CustomResourceConversion conversion) {
            this.conversion = conversion;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getPreserveUnknownFields}
         * @param preserveUnknownFields preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage.
         *                              apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting <code>x-preserve-unknown-fields</code> to true in <code>spec.versions[*].schema.openAPIV3Schema</code>. See https://kubernetes.io/docs/tasks/extend-kubernetes/custom-resources/custom-resource-definitions/#field-pruning for details.
         * @return {@code this}
         */
        public Builder preserveUnknownFields(java.lang.Boolean preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceDefinitionSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceDefinitionSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CustomResourceDefinitionSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceDefinitionSpec {
        private final java.lang.String group;
        private final imports.k8s.CustomResourceDefinitionNames names;
        private final java.lang.String scope;
        private final java.util.List<imports.k8s.CustomResourceDefinitionVersion> versions;
        private final imports.k8s.CustomResourceConversion conversion;
        private final java.lang.Boolean preserveUnknownFields;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.names = software.amazon.jsii.Kernel.get(this, "names", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceDefinitionNames.class));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.versions = software.amazon.jsii.Kernel.get(this, "versions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceDefinitionVersion.class)));
            this.conversion = software.amazon.jsii.Kernel.get(this, "conversion", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceConversion.class));
            this.preserveUnknownFields = software.amazon.jsii.Kernel.get(this, "preserveUnknownFields", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.group = java.util.Objects.requireNonNull(builder.group, "group is required");
            this.names = java.util.Objects.requireNonNull(builder.names, "names is required");
            this.scope = java.util.Objects.requireNonNull(builder.scope, "scope is required");
            this.versions = (java.util.List<imports.k8s.CustomResourceDefinitionVersion>)java.util.Objects.requireNonNull(builder.versions, "versions is required");
            this.conversion = builder.conversion;
            this.preserveUnknownFields = builder.preserveUnknownFields;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final imports.k8s.CustomResourceDefinitionNames getNames() {
            return this.names;
        }

        @Override
        public final java.lang.String getScope() {
            return this.scope;
        }

        @Override
        public final java.util.List<imports.k8s.CustomResourceDefinitionVersion> getVersions() {
            return this.versions;
        }

        @Override
        public final imports.k8s.CustomResourceConversion getConversion() {
            return this.conversion;
        }

        @Override
        public final java.lang.Boolean getPreserveUnknownFields() {
            return this.preserveUnknownFields;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("group", om.valueToTree(this.getGroup()));
            data.set("names", om.valueToTree(this.getNames()));
            data.set("scope", om.valueToTree(this.getScope()));
            data.set("versions", om.valueToTree(this.getVersions()));
            if (this.getConversion() != null) {
                data.set("conversion", om.valueToTree(this.getConversion()));
            }
            if (this.getPreserveUnknownFields() != null) {
                data.set("preserveUnknownFields", om.valueToTree(this.getPreserveUnknownFields()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceDefinitionSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceDefinitionSpec.Jsii$Proxy that = (CustomResourceDefinitionSpec.Jsii$Proxy) o;

            if (!group.equals(that.group)) return false;
            if (!names.equals(that.names)) return false;
            if (!scope.equals(that.scope)) return false;
            if (!versions.equals(that.versions)) return false;
            if (this.conversion != null ? !this.conversion.equals(that.conversion) : that.conversion != null) return false;
            return this.preserveUnknownFields != null ? this.preserveUnknownFields.equals(that.preserveUnknownFields) : that.preserveUnknownFields == null;
        }

        @Override
        public final int hashCode() {
            int result = this.group.hashCode();
            result = 31 * result + (this.names.hashCode());
            result = 31 * result + (this.scope.hashCode());
            result = 31 * result + (this.versions.hashCode());
            result = 31 * result + (this.conversion != null ? this.conversion.hashCode() : 0);
            result = 31 * result + (this.preserveUnknownFields != null ? this.preserveUnknownFields.hashCode() : 0);
            return result;
        }
    }
}
