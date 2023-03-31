package imports.k8s;

/**
 * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
 * <p>
 * Deprecated: This API is deprecated in v1.19+
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.868Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeComponentStatusProps")
@software.amazon.jsii.Jsii.Proxy(KubeComponentStatusProps.Jsii$Proxy.class)
public interface KubeComponentStatusProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * List of component conditions observed.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ComponentCondition> getConditions() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeComponentStatusProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeComponentStatusProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeComponentStatusProps> {
        java.util.List<imports.k8s.ComponentCondition> conditions;
        imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubeComponentStatusProps#getConditions}
         * @param conditions List of component conditions observed.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder conditions(java.util.List<? extends imports.k8s.ComponentCondition> conditions) {
            this.conditions = (java.util.List<imports.k8s.ComponentCondition>)conditions;
            return this;
        }

        /**
         * Sets the value of {@link KubeComponentStatusProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeComponentStatusProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeComponentStatusProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeComponentStatusProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeComponentStatusProps {
        private final java.util.List<imports.k8s.ComponentCondition> conditions;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.conditions = software.amazon.jsii.Kernel.get(this, "conditions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ComponentCondition.class)));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.conditions = (java.util.List<imports.k8s.ComponentCondition>)builder.conditions;
            this.metadata = builder.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.ComponentCondition> getConditions() {
            return this.conditions;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConditions() != null) {
                data.set("conditions", om.valueToTree(this.getConditions()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeComponentStatusProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeComponentStatusProps.Jsii$Proxy that = (KubeComponentStatusProps.Jsii$Proxy) o;

            if (this.conditions != null ? !this.conditions.equals(that.conditions) : that.conditions != null) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.conditions != null ? this.conditions.hashCode() : 0;
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
