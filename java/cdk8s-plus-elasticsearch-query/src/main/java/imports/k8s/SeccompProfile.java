package imports.k8s;

/**
 * SeccompProfile defines a pod/container's seccomp profile settings.
 * <p>
 * Only one profile source may be set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.939Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SeccompProfile")
@software.amazon.jsii.Jsii.Proxy(SeccompProfile.Jsii$Proxy.class)
public interface SeccompProfile extends software.amazon.jsii.JsiiSerializable {

    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:.
     * <p>
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used.
     * <p>
     * The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocalhostProfile() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SeccompProfile}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SeccompProfile}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SeccompProfile> {
        java.lang.String type;
        java.lang.String localhostProfile;

        /**
         * Sets the value of {@link SeccompProfile#getType}
         * @param type type indicates which kind of seccomp profile will be applied. Valid options are:. This parameter is required.
         *             Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link SeccompProfile#getLocalhostProfile}
         * @param localhostProfile localhostProfile indicates a profile defined in a file on the node should be used.
         *                         The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
         * @return {@code this}
         */
        public Builder localhostProfile(java.lang.String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SeccompProfile}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SeccompProfile build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SeccompProfile}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SeccompProfile {
        private final java.lang.String type;
        private final java.lang.String localhostProfile;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.localhostProfile = software.amazon.jsii.Kernel.get(this, "localhostProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.localhostProfile = builder.localhostProfile;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getLocalhostProfile() {
            return this.localhostProfile;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getLocalhostProfile() != null) {
                data.set("localhostProfile", om.valueToTree(this.getLocalhostProfile()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SeccompProfile"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SeccompProfile.Jsii$Proxy that = (SeccompProfile.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.localhostProfile != null ? this.localhostProfile.equals(that.localhostProfile) : that.localhostProfile == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.localhostProfile != null ? this.localhostProfile.hashCode() : 0);
            return result;
        }
    }
}
