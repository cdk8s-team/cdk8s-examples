package imports.k8s;

/**
 * JobSpec describes how the job execution will look like.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.857Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.JobSpec")
@software.amazon.jsii.Jsii.Proxy(JobSpec.Jsii$Proxy.class)
public interface JobSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes the pod that will be created when executing a job.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     */
    @org.jetbrains.annotations.NotNull imports.k8s.PodTemplateSpec getTemplate();

    /**
     * Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it;
     * <p>
     * value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getActiveDeadlineSeconds() {
        return null;
    }

    /**
     * Specifies the number of retries before marking this job failed.
     * <p>
     * Defaults to 6
     * <p>
     * Default: 6
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getBackoffLimit() {
        return null;
    }

    /**
     * CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * <p>
     * <code>NonIndexed</code> means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * <p>
     * <code>Indexed</code> means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is <code>Indexed</code>, .spec.completions must be specified and <code>.spec.parallelism</code> must be less than or equal to 10^5. In addition, The Pod name takes the form <code>$(job-name)-$(index)-$(random-string)</code>, the Pod hostname takes the form <code>$(job-name)-$(index)</code>.
     * <p>
     * More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCompletionMode() {
        return null;
    }

    /**
     * Specifies the desired number of successfully finished pods the job should be run with.
     * <p>
     * Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCompletions() {
        return null;
    }

    /**
     * manualSelector controls generation of pod labels and pod selectors.
     * <p>
     * Leave <code>manualSelector</code> unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see <code>manualSelector=true</code> in jobs that were created with the old <code>extensions/v1beta1</code> API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getManualSelector() {
        return null;
    }

    /**
     * Specifies the maximum desired number of pods the job should run at any given time.
     * <p>
     * The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getParallelism() {
        return null;
    }

    /**
     * Specifies the policy of handling failed pods.
     * <p>
     * In particular, it allows to specify the set of actions and conditions which need to be satisfied to take the associated action. If empty, the default behaviour applies - the counter of failed pods, represented by the jobs's .status.failed field, is incremented and it is checked against the backoffLimit. This field cannot be used in combination with restartPolicy=OnFailure.
     * <p>
     * This field is alpha-level. To use this field, you must enable the <code>JobPodFailurePolicy</code> feature gate (disabled by default).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodFailurePolicy getPodFailurePolicy() {
        return null;
    }

    /**
     * A label query over pods that should match the pod count.
     * <p>
     * Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * Suspend specifies whether the Job controller should create Pods or not.
     * <p>
     * If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSuspend() {
        return null;
    }

    /**
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed).
     * <p>
     * If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTtlSecondsAfterFinished() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JobSpec> {
        imports.k8s.PodTemplateSpec template;
        java.lang.Number activeDeadlineSeconds;
        java.lang.Number backoffLimit;
        java.lang.String completionMode;
        java.lang.Number completions;
        java.lang.Boolean manualSelector;
        java.lang.Number parallelism;
        imports.k8s.PodFailurePolicy podFailurePolicy;
        imports.k8s.LabelSelector selector;
        java.lang.Boolean suspend;
        java.lang.Number ttlSecondsAfterFinished;

        /**
         * Sets the value of {@link JobSpec#getTemplate}
         * @param template Describes the pod that will be created when executing a job. This parameter is required.
         *                 More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * @return {@code this}
         */
        public Builder template(imports.k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getActiveDeadlineSeconds}
         * @param activeDeadlineSeconds Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it;.
         *                              value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
         * @return {@code this}
         */
        public Builder activeDeadlineSeconds(java.lang.Number activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getBackoffLimit}
         * @param backoffLimit Specifies the number of retries before marking this job failed.
         *                     Defaults to 6
         * @return {@code this}
         */
        public Builder backoffLimit(java.lang.Number backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getCompletionMode}
         * @param completionMode CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
         *                       <code>NonIndexed</code> means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
         *                       <p>
         *                       <code>Indexed</code> means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is <code>Indexed</code>, .spec.completions must be specified and <code>.spec.parallelism</code> must be less than or equal to 10^5. In addition, The Pod name takes the form <code>$(job-name)-$(index)-$(random-string)</code>, the Pod hostname takes the form <code>$(job-name)-$(index)</code>.
         *                       <p>
         *                       More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, which is possible during upgrades due to version skew, the controller skips updates for the Job.
         * @return {@code this}
         */
        public Builder completionMode(java.lang.String completionMode) {
            this.completionMode = completionMode;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getCompletions}
         * @param completions Specifies the desired number of successfully finished pods the job should be run with.
         *                    Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * @return {@code this}
         */
        public Builder completions(java.lang.Number completions) {
            this.completions = completions;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getManualSelector}
         * @param manualSelector manualSelector controls generation of pod labels and pod selectors.
         *                       Leave <code>manualSelector</code> unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see <code>manualSelector=true</code> in jobs that were created with the old <code>extensions/v1beta1</code> API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
         * @return {@code this}
         */
        public Builder manualSelector(java.lang.Boolean manualSelector) {
            this.manualSelector = manualSelector;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getParallelism}
         * @param parallelism Specifies the maximum desired number of pods the job should run at any given time.
         *                    The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * @return {@code this}
         */
        public Builder parallelism(java.lang.Number parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getPodFailurePolicy}
         * @param podFailurePolicy Specifies the policy of handling failed pods.
         *                         In particular, it allows to specify the set of actions and conditions which need to be satisfied to take the associated action. If empty, the default behaviour applies - the counter of failed pods, represented by the jobs's .status.failed field, is incremented and it is checked against the backoffLimit. This field cannot be used in combination with restartPolicy=OnFailure.
         *                         <p>
         *                         This field is alpha-level. To use this field, you must enable the <code>JobPodFailurePolicy</code> feature gate (disabled by default).
         * @return {@code this}
         */
        public Builder podFailurePolicy(imports.k8s.PodFailurePolicy podFailurePolicy) {
            this.podFailurePolicy = podFailurePolicy;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getSelector}
         * @param selector A label query over pods that should match the pod count.
         *                 Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(imports.k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getSuspend}
         * @param suspend Suspend specifies whether the Job controller should create Pods or not.
         *                If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
         * @return {@code this}
         */
        public Builder suspend(java.lang.Boolean suspend) {
            this.suspend = suspend;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getTtlSecondsAfterFinished}
         * @param ttlSecondsAfterFinished ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed).
         *                                If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
         * @return {@code this}
         */
        public Builder ttlSecondsAfterFinished(java.lang.Number ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JobSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JobSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpec {
        private final imports.k8s.PodTemplateSpec template;
        private final java.lang.Number activeDeadlineSeconds;
        private final java.lang.Number backoffLimit;
        private final java.lang.String completionMode;
        private final java.lang.Number completions;
        private final java.lang.Boolean manualSelector;
        private final java.lang.Number parallelism;
        private final imports.k8s.PodFailurePolicy podFailurePolicy;
        private final imports.k8s.LabelSelector selector;
        private final java.lang.Boolean suspend;
        private final java.lang.Number ttlSecondsAfterFinished;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.template = software.amazon.jsii.Kernel.get(this, "template", software.amazon.jsii.NativeType.forClass(imports.k8s.PodTemplateSpec.class));
            this.activeDeadlineSeconds = software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.backoffLimit = software.amazon.jsii.Kernel.get(this, "backoffLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.completionMode = software.amazon.jsii.Kernel.get(this, "completionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.completions = software.amazon.jsii.Kernel.get(this, "completions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.manualSelector = software.amazon.jsii.Kernel.get(this, "manualSelector", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.parallelism = software.amazon.jsii.Kernel.get(this, "parallelism", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.podFailurePolicy = software.amazon.jsii.Kernel.get(this, "podFailurePolicy", software.amazon.jsii.NativeType.forClass(imports.k8s.PodFailurePolicy.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.suspend = software.amazon.jsii.Kernel.get(this, "suspend", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ttlSecondsAfterFinished = software.amazon.jsii.Kernel.get(this, "ttlSecondsAfterFinished", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.template = java.util.Objects.requireNonNull(builder.template, "template is required");
            this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
            this.backoffLimit = builder.backoffLimit;
            this.completionMode = builder.completionMode;
            this.completions = builder.completions;
            this.manualSelector = builder.manualSelector;
            this.parallelism = builder.parallelism;
            this.podFailurePolicy = builder.podFailurePolicy;
            this.selector = builder.selector;
            this.suspend = builder.suspend;
            this.ttlSecondsAfterFinished = builder.ttlSecondsAfterFinished;
        }

        @Override
        public final imports.k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        public final java.lang.Number getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        @Override
        public final java.lang.Number getBackoffLimit() {
            return this.backoffLimit;
        }

        @Override
        public final java.lang.String getCompletionMode() {
            return this.completionMode;
        }

        @Override
        public final java.lang.Number getCompletions() {
            return this.completions;
        }

        @Override
        public final java.lang.Boolean getManualSelector() {
            return this.manualSelector;
        }

        @Override
        public final java.lang.Number getParallelism() {
            return this.parallelism;
        }

        @Override
        public final imports.k8s.PodFailurePolicy getPodFailurePolicy() {
            return this.podFailurePolicy;
        }

        @Override
        public final imports.k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.Boolean getSuspend() {
            return this.suspend;
        }

        @Override
        public final java.lang.Number getTtlSecondsAfterFinished() {
            return this.ttlSecondsAfterFinished;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getActiveDeadlineSeconds() != null) {
                data.set("activeDeadlineSeconds", om.valueToTree(this.getActiveDeadlineSeconds()));
            }
            if (this.getBackoffLimit() != null) {
                data.set("backoffLimit", om.valueToTree(this.getBackoffLimit()));
            }
            if (this.getCompletionMode() != null) {
                data.set("completionMode", om.valueToTree(this.getCompletionMode()));
            }
            if (this.getCompletions() != null) {
                data.set("completions", om.valueToTree(this.getCompletions()));
            }
            if (this.getManualSelector() != null) {
                data.set("manualSelector", om.valueToTree(this.getManualSelector()));
            }
            if (this.getParallelism() != null) {
                data.set("parallelism", om.valueToTree(this.getParallelism()));
            }
            if (this.getPodFailurePolicy() != null) {
                data.set("podFailurePolicy", om.valueToTree(this.getPodFailurePolicy()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getSuspend() != null) {
                data.set("suspend", om.valueToTree(this.getSuspend()));
            }
            if (this.getTtlSecondsAfterFinished() != null) {
                data.set("ttlSecondsAfterFinished", om.valueToTree(this.getTtlSecondsAfterFinished()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.JobSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpec.Jsii$Proxy that = (JobSpec.Jsii$Proxy) o;

            if (!template.equals(that.template)) return false;
            if (this.activeDeadlineSeconds != null ? !this.activeDeadlineSeconds.equals(that.activeDeadlineSeconds) : that.activeDeadlineSeconds != null) return false;
            if (this.backoffLimit != null ? !this.backoffLimit.equals(that.backoffLimit) : that.backoffLimit != null) return false;
            if (this.completionMode != null ? !this.completionMode.equals(that.completionMode) : that.completionMode != null) return false;
            if (this.completions != null ? !this.completions.equals(that.completions) : that.completions != null) return false;
            if (this.manualSelector != null ? !this.manualSelector.equals(that.manualSelector) : that.manualSelector != null) return false;
            if (this.parallelism != null ? !this.parallelism.equals(that.parallelism) : that.parallelism != null) return false;
            if (this.podFailurePolicy != null ? !this.podFailurePolicy.equals(that.podFailurePolicy) : that.podFailurePolicy != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.suspend != null ? !this.suspend.equals(that.suspend) : that.suspend != null) return false;
            return this.ttlSecondsAfterFinished != null ? this.ttlSecondsAfterFinished.equals(that.ttlSecondsAfterFinished) : that.ttlSecondsAfterFinished == null;
        }

        @Override
        public final int hashCode() {
            int result = this.template.hashCode();
            result = 31 * result + (this.activeDeadlineSeconds != null ? this.activeDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.backoffLimit != null ? this.backoffLimit.hashCode() : 0);
            result = 31 * result + (this.completionMode != null ? this.completionMode.hashCode() : 0);
            result = 31 * result + (this.completions != null ? this.completions.hashCode() : 0);
            result = 31 * result + (this.manualSelector != null ? this.manualSelector.hashCode() : 0);
            result = 31 * result + (this.parallelism != null ? this.parallelism.hashCode() : 0);
            result = 31 * result + (this.podFailurePolicy != null ? this.podFailurePolicy.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.suspend != null ? this.suspend.hashCode() : 0);
            result = 31 * result + (this.ttlSecondsAfterFinished != null ? this.ttlSecondsAfterFinished.hashCode() : 0);
            return result;
        }
    }
}
