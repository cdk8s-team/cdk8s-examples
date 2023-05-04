package imports.k8s;

/**
 * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.890Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Preconditions")
@software.amazon.jsii.Jsii.Proxy(Preconditions.Jsii$Proxy.class)
public interface Preconditions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the target ResourceVersion.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceVersion() {
        return null;
    }

    /**
     * Specifies the target UID.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Preconditions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Preconditions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Preconditions> {
        java.lang.String resourceVersion;
        java.lang.String uid;

        /**
         * Sets the value of {@link Preconditions#getResourceVersion}
         * @param resourceVersion Specifies the target ResourceVersion.
         * @return {@code this}
         */
        public Builder resourceVersion(java.lang.String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Sets the value of {@link Preconditions#getUid}
         * @param uid Specifies the target UID.
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Preconditions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Preconditions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Preconditions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Preconditions {
        private final java.lang.String resourceVersion;
        private final java.lang.String uid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resourceVersion = software.amazon.jsii.Kernel.get(this, "resourceVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.uid = software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resourceVersion = builder.resourceVersion;
            this.uid = builder.uid;
        }

        @Override
        public final java.lang.String getResourceVersion() {
            return this.resourceVersion;
        }

        @Override
        public final java.lang.String getUid() {
            return this.uid;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getResourceVersion() != null) {
                data.set("resourceVersion", om.valueToTree(this.getResourceVersion()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Preconditions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Preconditions.Jsii$Proxy that = (Preconditions.Jsii$Proxy) o;

            if (this.resourceVersion != null ? !this.resourceVersion.equals(that.resourceVersion) : that.resourceVersion != null) return false;
            return this.uid != null ? this.uid.equals(that.uid) : that.uid == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resourceVersion != null ? this.resourceVersion.hashCode() : 0;
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            return result;
        }
    }
}
