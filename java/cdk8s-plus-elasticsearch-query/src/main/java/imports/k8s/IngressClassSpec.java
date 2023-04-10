package imports.k8s;

/**
 * IngressClassSpec provides information about the class of an Ingress.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.850Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IngressClassSpec")
@software.amazon.jsii.Jsii.Proxy(IngressClassSpec.Jsii$Proxy.class)
public interface IngressClassSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Controller refers to the name of the controller that should handle this class.
     * <p>
     * This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getController() {
        return null;
    }

    /**
     * Parameters is a link to a custom resource containing additional configuration for the controller.
     * <p>
     * This is optional if the controller does not require extra parameters.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IngressClassParametersReference getParameters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressClassSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressClassSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressClassSpec> {
        java.lang.String controller;
        imports.k8s.IngressClassParametersReference parameters;

        /**
         * Sets the value of {@link IngressClassSpec#getController}
         * @param controller Controller refers to the name of the controller that should handle this class.
         *                   This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
         * @return {@code this}
         */
        public Builder controller(java.lang.String controller) {
            this.controller = controller;
            return this;
        }

        /**
         * Sets the value of {@link IngressClassSpec#getParameters}
         * @param parameters Parameters is a link to a custom resource containing additional configuration for the controller.
         *                   This is optional if the controller does not require extra parameters.
         * @return {@code this}
         */
        public Builder parameters(imports.k8s.IngressClassParametersReference parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressClassSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressClassSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IngressClassSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressClassSpec {
        private final java.lang.String controller;
        private final imports.k8s.IngressClassParametersReference parameters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.controller = software.amazon.jsii.Kernel.get(this, "controller", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.forClass(imports.k8s.IngressClassParametersReference.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.controller = builder.controller;
            this.parameters = builder.parameters;
        }

        @Override
        public final java.lang.String getController() {
            return this.controller;
        }

        @Override
        public final imports.k8s.IngressClassParametersReference getParameters() {
            return this.parameters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getController() != null) {
                data.set("controller", om.valueToTree(this.getController()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressClassSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressClassSpec.Jsii$Proxy that = (IngressClassSpec.Jsii$Proxy) o;

            if (this.controller != null ? !this.controller.equals(that.controller) : that.controller != null) return false;
            return this.parameters != null ? this.parameters.equals(that.parameters) : that.parameters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.controller != null ? this.controller.hashCode() : 0;
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            return result;
        }
    }
}
