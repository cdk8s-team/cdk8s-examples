package imports.k8s;

/**
 * FlowSchema defines the schema of a group of flows.
 * <p>
 * Note that a flow is made up of a set of inbound API requests with similar attributes and is identified by a pair of strings: the name of the FlowSchema and a "flow distinguisher".
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.887Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeFlowSchemaV1Beta2Props")
@software.amazon.jsii.Jsii.Proxy(KubeFlowSchemaV1Beta2Props.Jsii$Proxy.class)
public interface KubeFlowSchemaV1Beta2Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * `metadata` is the standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * `spec` is the specification of the desired behavior of a FlowSchema.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FlowSchemaSpecV1Beta2 getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeFlowSchemaV1Beta2Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeFlowSchemaV1Beta2Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeFlowSchemaV1Beta2Props> {
        imports.k8s.ObjectMeta metadata;
        imports.k8s.FlowSchemaSpecV1Beta2 spec;

        /**
         * Sets the value of {@link KubeFlowSchemaV1Beta2Props#getMetadata}
         * @param metadata `metadata` is the standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeFlowSchemaV1Beta2Props#getSpec}
         * @param spec `spec` is the specification of the desired behavior of a FlowSchema.
         *             More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder spec(imports.k8s.FlowSchemaSpecV1Beta2 spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeFlowSchemaV1Beta2Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeFlowSchemaV1Beta2Props build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubeFlowSchemaV1Beta2Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeFlowSchemaV1Beta2Props {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.FlowSchemaSpecV1Beta2 spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.FlowSchemaSpecV1Beta2.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = builder.metadata;
            this.spec = builder.spec;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final imports.k8s.FlowSchemaSpecV1Beta2 getSpec() {
            return this.spec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeFlowSchemaV1Beta2Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeFlowSchemaV1Beta2Props.Jsii$Proxy that = (KubeFlowSchemaV1Beta2Props.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
