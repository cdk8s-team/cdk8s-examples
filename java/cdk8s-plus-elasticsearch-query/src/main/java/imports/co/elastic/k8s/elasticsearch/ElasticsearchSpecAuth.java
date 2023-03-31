package imports.co.elastic.k8s.elasticsearch;

/**
 * Auth contains user authentication and authorization security settings for Elasticsearch.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.051Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecAuth")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecAuth.Jsii$Proxy.class)
public interface ElasticsearchSpecAuth extends software.amazon.jsii.JsiiSerializable {

    /**
     * FileRealm to propagate to the Elasticsearch cluster.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm> getFileRealm() {
        return null;
    }

    /**
     * Roles to propagate to the Elasticsearch cluster.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles> getRoles() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecAuth}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecAuth}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecAuth> {
        java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm> fileRealm;
        java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles> roles;

        /**
         * Sets the value of {@link ElasticsearchSpecAuth#getFileRealm}
         * @param fileRealm FileRealm to propagate to the Elasticsearch cluster.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder fileRealm(java.util.List<? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm> fileRealm) {
            this.fileRealm = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm>)fileRealm;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecAuth#getRoles}
         * @param roles Roles to propagate to the Elasticsearch cluster.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder roles(java.util.List<? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles> roles) {
            this.roles = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles>)roles;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecAuth}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecAuth build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecAuth}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecAuth {
        private final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm> fileRealm;
        private final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles> roles;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fileRealm = software.amazon.jsii.Kernel.get(this, "fileRealm", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm.class)));
            this.roles = software.amazon.jsii.Kernel.get(this, "roles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fileRealm = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm>)builder.fileRealm;
            this.roles = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles>)builder.roles;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthFileRealm> getFileRealm() {
            return this.fileRealm;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecAuthRoles> getRoles() {
            return this.roles;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFileRealm() != null) {
                data.set("fileRealm", om.valueToTree(this.getFileRealm()));
            }
            if (this.getRoles() != null) {
                data.set("roles", om.valueToTree(this.getRoles()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecAuth"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecAuth.Jsii$Proxy that = (ElasticsearchSpecAuth.Jsii$Proxy) o;

            if (this.fileRealm != null ? !this.fileRealm.equals(that.fileRealm) : that.fileRealm != null) return false;
            return this.roles != null ? this.roles.equals(that.roles) : that.roles == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fileRealm != null ? this.fileRealm.hashCode() : 0;
            result = 31 * result + (this.roles != null ? this.roles.hashCode() : 0);
            return result;
        }
    }
}
