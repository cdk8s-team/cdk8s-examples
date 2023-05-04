package imports.k8s;

/**
 * PriorityClass defines mapping from a priority class name to the priority integer value.
 * <p>
 * The value can be any valid integer.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.843Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubePriorityClassProps")
@software.amazon.jsii.Jsii.Proxy(KubePriorityClassProps.Jsii$Proxy.class)
public interface KubePriorityClassProps extends software.amazon.jsii.JsiiSerializable {

    /**
     * The value of this priority class.
     * <p>
     * This is the actual priority that pods receive when they have the name of this class in their pod spec.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getValue();

    /**
     * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class.
     * <p>
     * Only one PriorityClass can be marked as <code>globalDefault</code>. However, if more than one PriorityClasses exists with their <code>globalDefault</code> field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getGlobalDefault() {
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
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * <p>
     * One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     * <p>
     * Default: PreemptLowerPriority if unset.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPreemptionPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubePriorityClassProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubePriorityClassProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubePriorityClassProps> {
        java.lang.Number value;
        java.lang.String description;
        java.lang.Boolean globalDefault;
        imports.k8s.ObjectMeta metadata;
        java.lang.String preemptionPolicy;

        /**
         * Sets the value of {@link KubePriorityClassProps#getValue}
         * @param value The value of this priority class. This parameter is required.
         *              This is the actual priority that pods receive when they have the name of this class in their pod spec.
         * @return {@code this}
         */
        public Builder value(java.lang.Number value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassProps#getDescription}
         * @param description description is an arbitrary string that usually provides guidelines on when this priority class should be used.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassProps#getGlobalDefault}
         * @param globalDefault globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class.
         *                      Only one PriorityClass can be marked as <code>globalDefault</code>. However, if more than one PriorityClasses exists with their <code>globalDefault</code> field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
         * @return {@code this}
         */
        public Builder globalDefault(java.lang.Boolean globalDefault) {
            this.globalDefault = globalDefault;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassProps#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubePriorityClassProps#getPreemptionPolicy}
         * @param preemptionPolicy PreemptionPolicy is the Policy for preempting pods with lower priority.
         *                         One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
         * @return {@code this}
         */
        public Builder preemptionPolicy(java.lang.String preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubePriorityClassProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubePriorityClassProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KubePriorityClassProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubePriorityClassProps {
        private final java.lang.Number value;
        private final java.lang.String description;
        private final java.lang.Boolean globalDefault;
        private final imports.k8s.ObjectMeta metadata;
        private final java.lang.String preemptionPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.globalDefault = software.amazon.jsii.Kernel.get(this, "globalDefault", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.preemptionPolicy = software.amazon.jsii.Kernel.get(this, "preemptionPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
            this.description = builder.description;
            this.globalDefault = builder.globalDefault;
            this.metadata = builder.metadata;
            this.preemptionPolicy = builder.preemptionPolicy;
        }

        @Override
        public final java.lang.Number getValue() {
            return this.value;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Boolean getGlobalDefault() {
            return this.globalDefault;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.lang.String getPreemptionPolicy() {
            return this.preemptionPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("value", om.valueToTree(this.getValue()));
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getGlobalDefault() != null) {
                data.set("globalDefault", om.valueToTree(this.getGlobalDefault()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getPreemptionPolicy() != null) {
                data.set("preemptionPolicy", om.valueToTree(this.getPreemptionPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubePriorityClassProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubePriorityClassProps.Jsii$Proxy that = (KubePriorityClassProps.Jsii$Proxy) o;

            if (!value.equals(that.value)) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.globalDefault != null ? !this.globalDefault.equals(that.globalDefault) : that.globalDefault != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.preemptionPolicy != null ? this.preemptionPolicy.equals(that.preemptionPolicy) : that.preemptionPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.value.hashCode();
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.globalDefault != null ? this.globalDefault.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.preemptionPolicy != null ? this.preemptionPolicy.hashCode() : 0);
            return result;
        }
    }
}
