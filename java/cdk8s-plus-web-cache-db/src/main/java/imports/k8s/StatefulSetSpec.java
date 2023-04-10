package imports.k8s;

/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.951Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StatefulSetSpec")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpec.Jsii$Proxy.class)
public interface StatefulSetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * selector is a label query over pods that should match the replica count.
     * <p>
     * It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    @org.jetbrains.annotations.NotNull imports.k8s.LabelSelector getSelector();

    /**
     * serviceName is the name of the service that governs this StatefulSet.
     * <p>
     * This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServiceName();

    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected.
     * <p>
     * Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. Each pod will be named with the format <statefulsetname>-<podindex>. For example, a pod in a StatefulSet named "web" with index number "3" would be named "web-3".
     */
    @org.jetbrains.annotations.NotNull imports.k8s.PodTemplateSpec getTemplate();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available.
     * <p>
     * Defaults to 0 (pod will be considered available as soon as it is ready)
     * <p>
     * Default: 0 (pod will be considered available as soon as it is ready)
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySeconds() {
        return null;
    }

    /**
     * ordinals controls the numbering of replica indices in a StatefulSet.
     * <p>
     * The default ordinals behavior assigns a "0" index to the first replica and increments the index by one for each additional replica requested. Using the ordinals field requires the StatefulSetStartOrdinal feature gate to be enabled, which is alpha.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StatefulSetOrdinals getOrdinals() {
        return null;
    }

    /**
     * persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates.
     * <p>
     * By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StatefulSetPersistentVolumeClaimRetentionPolicy getPersistentVolumeClaimRetentionPolicy() {
        return null;
    }

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.
     * <p>
     * The default policy is <code>OrderedReady</code>, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is <code>Parallel</code> which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPodManagementPolicy() {
        return null;
    }

    /**
     * replicas is the desired number of replicas of the given Template.
     * <p>
     * These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history.
     * <p>
     * The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StatefulSetUpdateStrategy getUpdateStrategy() {
        return null;
    }

    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference.
     * <p>
     * The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.KubePersistentVolumeClaimProps> getVolumeClaimTemplates() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetSpec> {
        imports.k8s.LabelSelector selector;
        java.lang.String serviceName;
        imports.k8s.PodTemplateSpec template;
        java.lang.Number minReadySeconds;
        imports.k8s.StatefulSetOrdinals ordinals;
        imports.k8s.StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy;
        java.lang.String podManagementPolicy;
        java.lang.Number replicas;
        java.lang.Number revisionHistoryLimit;
        imports.k8s.StatefulSetUpdateStrategy updateStrategy;
        java.util.List<imports.k8s.KubePersistentVolumeClaimProps> volumeClaimTemplates;

        /**
         * Sets the value of {@link StatefulSetSpec#getSelector}
         * @param selector selector is a label query over pods that should match the replica count. This parameter is required.
         *                 It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getServiceName}
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This parameter is required.
         *                    This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getTemplate}
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. This parameter is required.
         *                 Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. Each pod will be named with the format <statefulsetname>-<podindex>. For example, a pod in a StatefulSet named "web" with index number "3" would be named "web-3".
         * @return {@code this}
         */
        public Builder template(imports.k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getMinReadySeconds}
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready)
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getOrdinals}
         * @param ordinals ordinals controls the numbering of replica indices in a StatefulSet.
         *                 The default ordinals behavior assigns a "0" index to the first replica and increments the index by one for each additional replica requested. Using the ordinals field requires the StatefulSetStartOrdinal feature gate to be enabled, which is alpha.
         * @return {@code this}
         */
        public Builder ordinals(imports.k8s.StatefulSetOrdinals ordinals) {
            this.ordinals = ordinals;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getPersistentVolumeClaimRetentionPolicy}
         * @param persistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy describes the lifecycle of persistent volume claims created from volumeClaimTemplates.
         *                                             By default, all persistent volume claims are created as needed and retained until manually deleted. This policy allows the lifecycle to be altered, for example by deleting persistent volume claims when their stateful set is deleted, or when their pod is scaled down. This requires the StatefulSetAutoDeletePVC feature gate to be enabled, which is alpha.  +optional
         * @return {@code this}
         */
        public Builder persistentVolumeClaimRetentionPolicy(imports.k8s.StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
            this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getPodManagementPolicy}
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.
         *                            The default policy is <code>OrderedReady</code>, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is <code>Parallel</code> which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * @return {@code this}
         */
        public Builder podManagementPolicy(java.lang.String podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getReplicas}
         * @param replicas replicas is the desired number of replicas of the given Template.
         *                 These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history.
         *                             The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getUpdateStrategy}
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * @return {@code this}
         */
        public Builder updateStrategy(imports.k8s.StatefulSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getVolumeClaimTemplates}
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference.
         *                             The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volumeClaimTemplates(java.util.List<? extends imports.k8s.KubePersistentVolumeClaimProps> volumeClaimTemplates) {
            this.volumeClaimTemplates = (java.util.List<imports.k8s.KubePersistentVolumeClaimProps>)volumeClaimTemplates;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpec {
        private final imports.k8s.LabelSelector selector;
        private final java.lang.String serviceName;
        private final imports.k8s.PodTemplateSpec template;
        private final java.lang.Number minReadySeconds;
        private final imports.k8s.StatefulSetOrdinals ordinals;
        private final imports.k8s.StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy;
        private final java.lang.String podManagementPolicy;
        private final java.lang.Number replicas;
        private final java.lang.Number revisionHistoryLimit;
        private final imports.k8s.StatefulSetUpdateStrategy updateStrategy;
        private final java.util.List<imports.k8s.KubePersistentVolumeClaimProps> volumeClaimTemplates;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.k8s.PodTemplateSpec.class));
            this.minReadySeconds = software.amazon.jsii.Kernel.get(this, "minReadySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ordinals = software.amazon.jsii.Kernel.get(this, "ordinals", software.amazon.jsii.NativeType.forClass(imports.k8s.StatefulSetOrdinals.class));
            this.persistentVolumeClaimRetentionPolicy = software.amazon.jsii.Kernel.get(this, "persistentVolumeClaimRetentionPolicy", software.amazon.jsii.NativeType.forClass(imports.k8s.StatefulSetPersistentVolumeClaimRetentionPolicy.class));
            this.podManagementPolicy = software.amazon.jsii.Kernel.get(this, "podManagementPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.replicas = software.amazon.jsii.Kernel.get(this, "replicas", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.revisionHistoryLimit = software.amazon.jsii.Kernel.get(this, "revisionHistoryLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.updateStrategy = software.amazon.jsii.Kernel.get(this, "updateStrategy", software.amazon.jsii.NativeType.forClass(imports.k8s.StatefulSetUpdateStrategy.class));
            this.volumeClaimTemplates = software.amazon.jsii.Kernel.get(this, "volumeClaimTemplates", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.KubePersistentVolumeClaimProps.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(builder.selector, "selector is required");
            this.serviceName = java.util.Objects.requireNonNull(builder.serviceName, "serviceName is required");
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.minReadySeconds = builder.minReadySeconds;
            this.ordinals = builder.ordinals;
            this.persistentVolumeClaimRetentionPolicy = builder.persistentVolumeClaimRetentionPolicy;
            this.podManagementPolicy = builder.podManagementPolicy;
            this.replicas = builder.replicas;
            this.revisionHistoryLimit = builder.revisionHistoryLimit;
            this.updateStrategy = builder.updateStrategy;
            this.volumeClaimTemplates = (java.util.List<imports.k8s.KubePersistentVolumeClaimProps>)builder.volumeClaimTemplates;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
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
        public final imports.k8s.StatefulSetOrdinals getOrdinals() {
            return this.ordinals;
        }

        @Override
        public final imports.k8s.StatefulSetPersistentVolumeClaimRetentionPolicy getPersistentVolumeClaimRetentionPolicy() {
            return this.persistentVolumeClaimRetentionPolicy;
        }

        @Override
        public final java.lang.String getPodManagementPolicy() {
            return this.podManagementPolicy;
        }

        @Override
        public final java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public final java.lang.Number getRevisionHistoryLimit() {
            return this.revisionHistoryLimit;
        }

        @Override
        public final imports.k8s.StatefulSetUpdateStrategy getUpdateStrategy() {
            return this.updateStrategy;
        }

        @Override
        public final java.util.List<imports.k8s.KubePersistentVolumeClaimProps> getVolumeClaimTemplates() {
            return this.volumeClaimTemplates;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            data.set("serviceName", om.valueToTree(this.getServiceName()));
            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getOrdinals() != null) {
                data.set("ordinals", om.valueToTree(this.getOrdinals()));
            }
            if (this.getPersistentVolumeClaimRetentionPolicy() != null) {
                data.set("persistentVolumeClaimRetentionPolicy", om.valueToTree(this.getPersistentVolumeClaimRetentionPolicy()));
            }
            if (this.getPodManagementPolicy() != null) {
                data.set("podManagementPolicy", om.valueToTree(this.getPodManagementPolicy()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getUpdateStrategy() != null) {
                data.set("updateStrategy", om.valueToTree(this.getUpdateStrategy()));
            }
            if (this.getVolumeClaimTemplates() != null) {
                data.set("volumeClaimTemplates", om.valueToTree(this.getVolumeClaimTemplates()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatefulSetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpec.Jsii$Proxy that = (StatefulSetSpec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (!serviceName.equals(that.serviceName)) return false;
            if (!template.equals(that.template)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.ordinals != null ? !this.ordinals.equals(that.ordinals) : that.ordinals != null) return false;
            if (this.persistentVolumeClaimRetentionPolicy != null ? !this.persistentVolumeClaimRetentionPolicy.equals(that.persistentVolumeClaimRetentionPolicy) : that.persistentVolumeClaimRetentionPolicy != null) return false;
            if (this.podManagementPolicy != null ? !this.podManagementPolicy.equals(that.podManagementPolicy) : that.podManagementPolicy != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            if (this.updateStrategy != null ? !this.updateStrategy.equals(that.updateStrategy) : that.updateStrategy != null) return false;
            return this.volumeClaimTemplates != null ? this.volumeClaimTemplates.equals(that.volumeClaimTemplates) : that.volumeClaimTemplates == null;
        }

        @Override
        public final int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.serviceName.hashCode());
            result = 31 * result + (this.template.hashCode());
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.ordinals != null ? this.ordinals.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeClaimRetentionPolicy != null ? this.persistentVolumeClaimRetentionPolicy.hashCode() : 0);
            result = 31 * result + (this.podManagementPolicy != null ? this.podManagementPolicy.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.updateStrategy != null ? this.updateStrategy.hashCode() : 0);
            result = 31 * result + (this.volumeClaimTemplates != null ? this.volumeClaimTemplates.hashCode() : 0);
            return result;
        }
    }
}
