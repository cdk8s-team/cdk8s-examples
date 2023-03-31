package imports.k8s;

/**
 * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.929Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NonResourceAttributes")
@software.amazon.jsii.Jsii.Proxy(NonResourceAttributes.Jsii$Proxy.class)
public interface NonResourceAttributes extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path is the URL path of the request.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Verb is the standard HTTP verb.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVerb() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NonResourceAttributes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NonResourceAttributes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NonResourceAttributes> {
        java.lang.String path;
        java.lang.String verb;

        /**
         * Sets the value of {@link NonResourceAttributes#getPath}
         * @param path Path is the URL path of the request.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link NonResourceAttributes#getVerb}
         * @param verb Verb is the standard HTTP verb.
         * @return {@code this}
         */
        public Builder verb(java.lang.String verb) {
            this.verb = verb;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NonResourceAttributes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NonResourceAttributes build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NonResourceAttributes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NonResourceAttributes {
        private final java.lang.String path;
        private final java.lang.String verb;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.verb = software.amazon.jsii.Kernel.get(this, "verb", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = builder.path;
            this.verb = builder.verb;
        }

        @Override
        public final java.lang.String getPath() {
            return this.path;
        }

        @Override
        public final java.lang.String getVerb() {
            return this.verb;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getVerb() != null) {
                data.set("verb", om.valueToTree(this.getVerb()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NonResourceAttributes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NonResourceAttributes.Jsii$Proxy that = (NonResourceAttributes.Jsii$Proxy) o;

            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            return this.verb != null ? this.verb.equals(that.verb) : that.verb == null;
        }

        @Override
        public final int hashCode() {
            int result = this.path != null ? this.path.hashCode() : 0;
            result = 31 * result + (this.verb != null ? this.verb.hashCode() : 0);
            return result;
        }
    }
}
