package imports.k8s;

/**
 * IngressSpec describes the Ingress the user wishes to exist.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.851Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IngressSpec")
@software.amazon.jsii.Jsii.Proxy(IngressSpec.Jsii$Proxy.class)
public interface IngressSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * DefaultBackend is the backend that should handle requests that don't match any rule.
     * <p>
     * If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IngressBackend getDefaultBackend() {
        return null;
    }

    /**
     * IngressClassName is the name of an IngressClass cluster resource.
     * <p>
     * Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -&gt; IngressClass -&gt; Ingress resource). Although the <code>kubernetes.io/ingress.class</code> annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIngressClassName() {
        return null;
    }

    /**
     * A list of host rules used to configure the Ingress.
     * <p>
     * If unspecified, or no rule matches, all traffic is sent to the default backend.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.IngressRule> getRules() {
        return null;
    }

    /**
     * TLS configuration.
     * <p>
     * Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.IngressTls> getTls() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressSpec> {
        imports.k8s.IngressBackend defaultBackend;
        java.lang.String ingressClassName;
        java.util.List<imports.k8s.IngressRule> rules;
        java.util.List<imports.k8s.IngressTls> tls;

        /**
         * Sets the value of {@link IngressSpec#getDefaultBackend}
         * @param defaultBackend DefaultBackend is the backend that should handle requests that don't match any rule.
         *                       If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
         * @return {@code this}
         */
        public Builder defaultBackend(imports.k8s.IngressBackend defaultBackend) {
            this.defaultBackend = defaultBackend;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpec#getIngressClassName}
         * @param ingressClassName IngressClassName is the name of an IngressClass cluster resource.
         *                         Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -&gt; IngressClass -&gt; Ingress resource). Although the <code>kubernetes.io/ingress.class</code> annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.
         * @return {@code this}
         */
        public Builder ingressClassName(java.lang.String ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpec#getRules}
         * @param rules A list of host rules used to configure the Ingress.
         *              If unspecified, or no rule matches, all traffic is sent to the default backend.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.k8s.IngressRule> rules) {
            this.rules = (java.util.List<imports.k8s.IngressRule>)rules;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpec#getTls}
         * @param tls TLS configuration.
         *            Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tls(java.util.List<? extends imports.k8s.IngressTls> tls) {
            this.tls = (java.util.List<imports.k8s.IngressTls>)tls;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressSpec {
        private final imports.k8s.IngressBackend defaultBackend;
        private final java.lang.String ingressClassName;
        private final java.util.List<imports.k8s.IngressRule> rules;
        private final java.util.List<imports.k8s.IngressTls> tls;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultBackend = software.amazon.jsii.Kernel.get(this, "defaultBackend", software.amazon.jsii.NativeType.forClass(imports.k8s.IngressBackend.class));
            this.ingressClassName = software.amazon.jsii.Kernel.get(this, "ingressClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.IngressRule.class)));
            this.tls = software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.IngressTls.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultBackend = builder.defaultBackend;
            this.ingressClassName = builder.ingressClassName;
            this.rules = (java.util.List<imports.k8s.IngressRule>)builder.rules;
            this.tls = (java.util.List<imports.k8s.IngressTls>)builder.tls;
        }

        @Override
        public final imports.k8s.IngressBackend getDefaultBackend() {
            return this.defaultBackend;
        }

        @Override
        public final java.lang.String getIngressClassName() {
            return this.ingressClassName;
        }

        @Override
        public final java.util.List<imports.k8s.IngressRule> getRules() {
            return this.rules;
        }

        @Override
        public final java.util.List<imports.k8s.IngressTls> getTls() {
            return this.tls;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDefaultBackend() != null) {
                data.set("defaultBackend", om.valueToTree(this.getDefaultBackend()));
            }
            if (this.getIngressClassName() != null) {
                data.set("ingressClassName", om.valueToTree(this.getIngressClassName()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }
            if (this.getTls() != null) {
                data.set("tls", om.valueToTree(this.getTls()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressSpec.Jsii$Proxy that = (IngressSpec.Jsii$Proxy) o;

            if (this.defaultBackend != null ? !this.defaultBackend.equals(that.defaultBackend) : that.defaultBackend != null) return false;
            if (this.ingressClassName != null ? !this.ingressClassName.equals(that.ingressClassName) : that.ingressClassName != null) return false;
            if (this.rules != null ? !this.rules.equals(that.rules) : that.rules != null) return false;
            return this.tls != null ? this.tls.equals(that.tls) : that.tls == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultBackend != null ? this.defaultBackend.hashCode() : 0;
            result = 31 * result + (this.ingressClassName != null ? this.ingressClassName.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            result = 31 * result + (this.tls != null ? this.tls.hashCode() : 0);
            return result;
        }
    }
}
