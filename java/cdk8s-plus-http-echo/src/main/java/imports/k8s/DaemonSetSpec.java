package imports.k8s;

/**
 * DaemonSetSpec is the specification of a daemon set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.835Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DaemonSetSpec")
@software.amazon.jsii.Jsii.Proxy(DaemonSetSpec.Jsii$Proxy.class)
public interface DaemonSetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * A label query over pods that are managed by the daemon set.
     * <p>
     * Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    @org.jetbrains.annotations.NotNull imports.k8s.LabelSelector getSelector();

    /**
     * An object that describes the pod that will be created.
     * <p>
     * The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     */
    @org.jetbrains.annotations.NotNull imports.k8s.PodTemplateSpec getTemplate();

    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available.
     * <p>
     * Defaults to 0 (pod will be considered available as soon as it is ready).
     * <p>
     * Default: 0 (pod will be considered available as soon as it is ready).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySeconds() {
        return null;
    }

    /**
     * The number of old history to retain to allow rollback.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * <p>
     * Default: 10.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * An update strategy to replace existing DaemonSet pods with new pods.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.DaemonSetUpdateStrategy getUpdateStrategy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetSpec> {
        imports.k8s.LabelSelector selector;
        imports.k8s.PodTemplateSpec template;
        java.lang.Number minReadySeconds;
        java.lang.Number revisionHistoryLimit;
        imports.k8s.DaemonSetUpdateStrategy updateStrategy;

        /**
         * Sets the value of {@link DaemonSetSpec#getSelector}
         * @param selector A label query over pods that are managed by the daemon set. This parameter is required.
         *                 Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getTemplate}
         * @param template An object that describes the pod that will be created. This parameter is required.
         *                 The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
         * @return {@code this}
         */
        public Builder template(imports.k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getMinReadySeconds}
         * @param minReadySeconds The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready).
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit The number of old history to retain to allow rollback.
         *                             This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getUpdateStrategy}
         * @param updateStrategy An update strategy to replace existing DaemonSet pods with new pods.
         * @return {@code this}
         */
        public Builder updateStrategy(imports.k8s.DaemonSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetSpec {
        private final imports.k8s.LabelSelector selector;
        private final imports.k8s.PodTemplateSpec template;
        private final java.lang.Number minReadySeconds;
        private final java.lang.Number revisionHistoryLimit;
        private final imports.k8s.DaemonSetUpdateStrategy updateStrategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.k8s.PodTemplateSpec.class));
            this.minReadySeconds = software.amazon.jsii.Kernel.get(this, "minReadySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.revisionHistoryLimit = software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.updateStrategy = software.amazon.jsii.Kernel.get(this, "updateStrategy", software.amazon.jsii.NativeType.forClass(imports.k8s.DaemonSetUpdateStrategy.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(builder.selector, "selector is required");
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.minReadySeconds = builder.minReadySeconds;
            this.revisionHistoryLimit = builder.revisionHistoryLimit;
            this.updateStrategy = builder.updateStrategy;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public final imports.k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        public final java.lang.Number getMinReadySeconds() {
            return this.minReadySeconds;
        }

        @Override
        public final java.lang.Number getRevisionHistoryLimit() {
            return this.revisionHistoryLimit;
        }

        @Override
        public final imports.k8s.DaemonSetUpdateStrategy getUpdateStrategy() {
            return this.updateStrategy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getUpdateStrategy() != null) {
                data.set("updateStrategy", om.valueToTree(this.getUpdateStrategy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DaemonSetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetSpec.Jsii$Proxy that = (DaemonSetSpec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (!template.equals(that.template)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            return this.updateStrategy != null ? this.updateStrategy.equals(that.updateStrategy) : that.updateStrategy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.template.hashCode());
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.updateStrategy != null ? this.updateStrategy.hashCode() : 0);
            return result;
        }
    }
}
