package imports.k8s;

/**
 * An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging.
 * <p>
 * Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.
 * <p>
 * To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.766Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EphemeralContainer")
@software.amazon.jsii.Jsii.Proxy(EphemeralContainer.Jsii$Proxy.class)
public interface EphemeralContainer extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the ephemeral container specified as a DNS_LABEL.
     * <p>
     * This name must be unique among all containers, init containers and ephemeral containers.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Arguments to the entrypoint.
     * <p>
     * The image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArgs() {
        return null;
    }

    /**
     * Entrypoint array.
     * <p>
     * Not executed within a shell. The image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCommand() {
        return null;
    }

    /**
     * List of environment variables to set in the container.
     * <p>
     * Cannot be updated.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EnvVar> getEnv() {
        return null;
    }

    /**
     * List of sources to populate environment variables in the container.
     * <p>
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.EnvFromSource> getEnvFrom() {
        return null;
    }

    /**
     * Container image name.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/containers/images
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImage() {
        return null;
    }

    /**
     * Image pull policy.
     * <p>
     * One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * <p>
     * Default: Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImagePullPolicy() {
        return null;
    }

    /**
     * Lifecycle is not allowed for ephemeral containers.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Lifecycle getLifecycle() {
        return null;
    }

    /**
     * Probes are not allowed for ephemeral containers.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Probe getLivenessProbe() {
        return null;
    }

    /**
     * Ports are not allowed for ephemeral containers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ContainerPort> getPorts() {
        return null;
    }

    /**
     * Probes are not allowed for ephemeral containers.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Probe getReadinessProbe() {
        return null;
    }

    /**
     * Resources are not allowed for ephemeral containers.
     * <p>
     * Ephemeral containers use spare resources already allocated to the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceRequirements getResources() {
        return null;
    }

    /**
     * Optional: SecurityContext defines the security options the ephemeral container should be run with.
     * <p>
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecurityContext getSecurityContext() {
        return null;
    }

    /**
     * Probes are not allowed for ephemeral containers.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Probe getStartupProbe() {
        return null;
    }

    /**
     * Whether this container should allocate a buffer for stdin in the container runtime.
     * <p>
     * If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStdin() {
        return null;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach.
     * <p>
     * When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * <p>
     * Default: false
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStdinOnce() {
        return null;
    }

    /**
     * If set, the name of the container from PodSpec that this ephemeral container targets.
     * <p>
     * The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
     * <p>
     * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTargetContainerName() {
        return null;
    }

    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem.
     * <p>
     * Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * <p>
     * Default: dev/termination-log. Cannot be updated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTerminationMessagePath() {
        return null;
    }

    /**
     * Indicate how the termination message should be populated.
     * <p>
     * File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * <p>
     * Default: File. Cannot be updated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTerminationMessagePolicy() {
        return null;
    }

    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true.
     * <p>
     * Default is false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTty() {
        return null;
    }

    /**
     * volumeDevices is the list of block devices to be used by the container.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.VolumeDevice> getVolumeDevices() {
        return null;
    }

    /**
     * Pod volumes to mount into the container's filesystem.
     * <p>
     * Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.VolumeMount> getVolumeMounts() {
        return null;
    }

    /**
     * Container's working directory.
     * <p>
     * If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWorkingDir() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EphemeralContainer}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EphemeralContainer}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EphemeralContainer> {
        java.lang.String name;
        java.util.List<java.lang.String> args;
        java.util.List<java.lang.String> command;
        java.util.List<imports.k8s.EnvVar> env;
        java.util.List<imports.k8s.EnvFromSource> envFrom;
        java.lang.String image;
        java.lang.String imagePullPolicy;
        imports.k8s.Lifecycle lifecycle;
        imports.k8s.Probe livenessProbe;
        java.util.List<imports.k8s.ContainerPort> ports;
        imports.k8s.Probe readinessProbe;
        imports.k8s.ResourceRequirements resources;
        imports.k8s.SecurityContext securityContext;
        imports.k8s.Probe startupProbe;
        java.lang.Boolean stdin;
        java.lang.Boolean stdinOnce;
        java.lang.String targetContainerName;
        java.lang.String terminationMessagePath;
        java.lang.String terminationMessagePolicy;
        java.lang.Boolean tty;
        java.util.List<imports.k8s.VolumeDevice> volumeDevices;
        java.util.List<imports.k8s.VolumeMount> volumeMounts;
        java.lang.String workingDir;

        /**
         * Sets the value of {@link EphemeralContainer#getName}
         * @param name Name of the ephemeral container specified as a DNS_LABEL. This parameter is required.
         *             This name must be unique among all containers, init containers and ephemeral containers.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getArgs}
         * @param args Arguments to the entrypoint.
         *             The image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * @return {@code this}
         */
        public Builder args(java.util.List<java.lang.String> args) {
            this.args = args;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getCommand}
         * @param command Entrypoint array.
         *                Not executed within a shell. The image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * @return {@code this}
         */
        public Builder command(java.util.List<java.lang.String> command) {
            this.command = command;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getEnv}
         * @param env List of environment variables to set in the container.
         *            Cannot be updated.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder env(java.util.List<? extends imports.k8s.EnvVar> env) {
            this.env = (java.util.List<imports.k8s.EnvVar>)env;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getEnvFrom}
         * @param envFrom List of sources to populate environment variables in the container.
         *                The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder envFrom(java.util.List<? extends imports.k8s.EnvFromSource> envFrom) {
            this.envFrom = (java.util.List<imports.k8s.EnvFromSource>)envFrom;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getImage}
         * @param image Container image name.
         *              More info: https://kubernetes.io/docs/concepts/containers/images
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getImagePullPolicy}
         * @param imagePullPolicy Image pull policy.
         *                        One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
         * @return {@code this}
         */
        public Builder imagePullPolicy(java.lang.String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getLifecycle}
         * @param lifecycle Lifecycle is not allowed for ephemeral containers.
         * @return {@code this}
         */
        public Builder lifecycle(imports.k8s.Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getLivenessProbe}
         * @param livenessProbe Probes are not allowed for ephemeral containers.
         * @return {@code this}
         */
        public Builder livenessProbe(imports.k8s.Probe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getPorts}
         * @param ports Ports are not allowed for ephemeral containers.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ports(java.util.List<? extends imports.k8s.ContainerPort> ports) {
            this.ports = (java.util.List<imports.k8s.ContainerPort>)ports;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getReadinessProbe}
         * @param readinessProbe Probes are not allowed for ephemeral containers.
         * @return {@code this}
         */
        public Builder readinessProbe(imports.k8s.Probe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getResources}
         * @param resources Resources are not allowed for ephemeral containers.
         *                  Ephemeral containers use spare resources already allocated to the pod.
         * @return {@code this}
         */
        public Builder resources(imports.k8s.ResourceRequirements resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getSecurityContext}
         * @param securityContext Optional: SecurityContext defines the security options the ephemeral container should be run with.
         *                        If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
         * @return {@code this}
         */
        public Builder securityContext(imports.k8s.SecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getStartupProbe}
         * @param startupProbe Probes are not allowed for ephemeral containers.
         * @return {@code this}
         */
        public Builder startupProbe(imports.k8s.Probe startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getStdin}
         * @param stdin Whether this container should allocate a buffer for stdin in the container runtime.
         *              If this is not set, reads from stdin in the container will always result in EOF. Default is false.
         * @return {@code this}
         */
        public Builder stdin(java.lang.Boolean stdin) {
            this.stdin = stdin;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getStdinOnce}
         * @param stdinOnce Whether the container runtime should close the stdin channel after it has been opened by a single attach.
         *                  When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
         * @return {@code this}
         */
        public Builder stdinOnce(java.lang.Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getTargetContainerName}
         * @param targetContainerName If set, the name of the container from PodSpec that this ephemeral container targets.
         *                            The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
         *                            <p>
         *                            The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
         * @return {@code this}
         */
        public Builder targetContainerName(java.lang.String targetContainerName) {
            this.targetContainerName = targetContainerName;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getTerminationMessagePath}
         * @param terminationMessagePath Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem.
         *                               Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
         * @return {@code this}
         */
        public Builder terminationMessagePath(java.lang.String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getTerminationMessagePolicy}
         * @param terminationMessagePolicy Indicate how the termination message should be populated.
         *                                 File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
         * @return {@code this}
         */
        public Builder terminationMessagePolicy(java.lang.String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getTty}
         * @param tty Whether this container should allocate a TTY for itself, also requires 'stdin' to be true.
         *            Default is false.
         * @return {@code this}
         */
        public Builder tty(java.lang.Boolean tty) {
            this.tty = tty;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getVolumeDevices}
         * @param volumeDevices volumeDevices is the list of block devices to be used by the container.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volumeDevices(java.util.List<? extends imports.k8s.VolumeDevice> volumeDevices) {
            this.volumeDevices = (java.util.List<imports.k8s.VolumeDevice>)volumeDevices;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getVolumeMounts}
         * @param volumeMounts Pod volumes to mount into the container's filesystem.
         *                     Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volumeMounts(java.util.List<? extends imports.k8s.VolumeMount> volumeMounts) {
            this.volumeMounts = (java.util.List<imports.k8s.VolumeMount>)volumeMounts;
            return this;
        }

        /**
         * Sets the value of {@link EphemeralContainer#getWorkingDir}
         * @param workingDir Container's working directory.
         *                   If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
         * @return {@code this}
         */
        public Builder workingDir(java.lang.String workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EphemeralContainer}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EphemeralContainer build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EphemeralContainer}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EphemeralContainer {
        private final java.lang.String name;
        private final java.util.List<java.lang.String> args;
        private final java.util.List<java.lang.String> command;
        private final java.util.List<imports.k8s.EnvVar> env;
        private final java.util.List<imports.k8s.EnvFromSource> envFrom;
        private final java.lang.String image;
        private final java.lang.String imagePullPolicy;
        private final imports.k8s.Lifecycle lifecycle;
        private final imports.k8s.Probe livenessProbe;
        private final java.util.List<imports.k8s.ContainerPort> ports;
        private final imports.k8s.Probe readinessProbe;
        private final imports.k8s.ResourceRequirements resources;
        private final imports.k8s.SecurityContext securityContext;
        private final imports.k8s.Probe startupProbe;
        private final java.lang.Boolean stdin;
        private final java.lang.Boolean stdinOnce;
        private final java.lang.String targetContainerName;
        private final java.lang.String terminationMessagePath;
        private final java.lang.String terminationMessagePolicy;
        private final java.lang.Boolean tty;
        private final java.util.List<imports.k8s.VolumeDevice> volumeDevices;
        private final java.util.List<imports.k8s.VolumeMount> volumeMounts;
        private final java.lang.String workingDir;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.args = software.amazon.jsii.Kernel.get(this, "args", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.command = software.amazon.jsii.Kernel.get(this, "command", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.env = software.amazon.jsii.Kernel.get(this, "env", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EnvVar.class)));
            this.envFrom = software.amazon.jsii.Kernel.get(this, "envFrom", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.EnvFromSource.class)));
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.imagePullPolicy = software.amazon.jsii.Kernel.get(this, "imagePullPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(imports.k8s.Lifecycle.class));
            this.livenessProbe = software.amazon.jsii.Kernel.get(this, "livenessProbe", software.amazon.jsii.NativeType.forClass(imports.k8s.Probe.class));
            this.ports = software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ContainerPort.class)));
            this.readinessProbe = software.amazon.jsii.Kernel.get(this, "readinessProbe", software.amazon.jsii.NativeType.forClass(imports.k8s.Probe.class));
            this.resources = software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceRequirements.class));
            this.securityContext = software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.k8s.SecurityContext.class));
            this.startupProbe = software.amazon.jsii.Kernel.get(this, "startupProbe", software.amazon.jsii.NativeType.forClass(imports.k8s.Probe.class));
            this.stdin = software.amazon.jsii.Kernel.get(this, "stdin", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.stdinOnce = software.amazon.jsii.Kernel.get(this, "stdinOnce", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.targetContainerName = software.amazon.jsii.Kernel.get(this, "targetContainerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.terminationMessagePath = software.amazon.jsii.Kernel.get(this, "terminationMessagePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.terminationMessagePolicy = software.amazon.jsii.Kernel.get(this, "terminationMessagePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tty = software.amazon.jsii.Kernel.get(this, "tty", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.volumeDevices = software.amazon.jsii.Kernel.get(this, "volumeDevices", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.VolumeDevice.class)));
            this.volumeMounts = software.amazon.jsii.Kernel.get(this, "volumeMounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.VolumeMount.class)));
            this.workingDir = software.amazon.jsii.Kernel.get(this, "workingDir", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.args = builder.args;
            this.command = builder.command;
            this.env = (java.util.List<imports.k8s.EnvVar>)builder.env;
            this.envFrom = (java.util.List<imports.k8s.EnvFromSource>)builder.envFrom;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.lifecycle = builder.lifecycle;
            this.livenessProbe = builder.livenessProbe;
            this.ports = (java.util.List<imports.k8s.ContainerPort>)builder.ports;
            this.readinessProbe = builder.readinessProbe;
            this.resources = builder.resources;
            this.securityContext = builder.securityContext;
            this.startupProbe = builder.startupProbe;
            this.stdin = builder.stdin;
            this.stdinOnce = builder.stdinOnce;
            this.targetContainerName = builder.targetContainerName;
            this.terminationMessagePath = builder.terminationMessagePath;
            this.terminationMessagePolicy = builder.terminationMessagePolicy;
            this.tty = builder.tty;
            this.volumeDevices = (java.util.List<imports.k8s.VolumeDevice>)builder.volumeDevices;
            this.volumeMounts = (java.util.List<imports.k8s.VolumeMount>)builder.volumeMounts;
            this.workingDir = builder.workingDir;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getArgs() {
            return this.args;
        }

        @Override
        public final java.util.List<java.lang.String> getCommand() {
            return this.command;
        }

        @Override
        public final java.util.List<imports.k8s.EnvVar> getEnv() {
            return this.env;
        }

        @Override
        public final java.util.List<imports.k8s.EnvFromSource> getEnvFrom() {
            return this.envFrom;
        }

        @Override
        public final java.lang.String getImage() {
            return this.image;
        }

        @Override
        public final java.lang.String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        @Override
        public final imports.k8s.Lifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final imports.k8s.Probe getLivenessProbe() {
            return this.livenessProbe;
        }

        @Override
        public final java.util.List<imports.k8s.ContainerPort> getPorts() {
            return this.ports;
        }

        @Override
        public final imports.k8s.Probe getReadinessProbe() {
            return this.readinessProbe;
        }

        @Override
        public final imports.k8s.ResourceRequirements getResources() {
            return this.resources;
        }

        @Override
        public final imports.k8s.SecurityContext getSecurityContext() {
            return this.securityContext;
        }

        @Override
        public final imports.k8s.Probe getStartupProbe() {
            return this.startupProbe;
        }

        @Override
        public final java.lang.Boolean getStdin() {
            return this.stdin;
        }

        @Override
        public final java.lang.Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        @Override
        public final java.lang.String getTargetContainerName() {
            return this.targetContainerName;
        }

        @Override
        public final java.lang.String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        @Override
        public final java.lang.String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        @Override
        public final java.lang.Boolean getTty() {
            return this.tty;
        }

        @Override
        public final java.util.List<imports.k8s.VolumeDevice> getVolumeDevices() {
            return this.volumeDevices;
        }

        @Override
        public final java.util.List<imports.k8s.VolumeMount> getVolumeMounts() {
            return this.volumeMounts;
        }

        @Override
        public final java.lang.String getWorkingDir() {
            return this.workingDir;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getArgs() != null) {
                data.set("args", om.valueToTree(this.getArgs()));
            }
            if (this.getCommand() != null) {
                data.set("command", om.valueToTree(this.getCommand()));
            }
            if (this.getEnv() != null) {
                data.set("env", om.valueToTree(this.getEnv()));
            }
            if (this.getEnvFrom() != null) {
                data.set("envFrom", om.valueToTree(this.getEnvFrom()));
            }
            if (this.getImage() != null) {
                data.set("image", om.valueToTree(this.getImage()));
            }
            if (this.getImagePullPolicy() != null) {
                data.set("imagePullPolicy", om.valueToTree(this.getImagePullPolicy()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getLivenessProbe() != null) {
                data.set("livenessProbe", om.valueToTree(this.getLivenessProbe()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }
            if (this.getReadinessProbe() != null) {
                data.set("readinessProbe", om.valueToTree(this.getReadinessProbe()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getSecurityContext() != null) {
                data.set("securityContext", om.valueToTree(this.getSecurityContext()));
            }
            if (this.getStartupProbe() != null) {
                data.set("startupProbe", om.valueToTree(this.getStartupProbe()));
            }
            if (this.getStdin() != null) {
                data.set("stdin", om.valueToTree(this.getStdin()));
            }
            if (this.getStdinOnce() != null) {
                data.set("stdinOnce", om.valueToTree(this.getStdinOnce()));
            }
            if (this.getTargetContainerName() != null) {
                data.set("targetContainerName", om.valueToTree(this.getTargetContainerName()));
            }
            if (this.getTerminationMessagePath() != null) {
                data.set("terminationMessagePath", om.valueToTree(this.getTerminationMessagePath()));
            }
            if (this.getTerminationMessagePolicy() != null) {
                data.set("terminationMessagePolicy", om.valueToTree(this.getTerminationMessagePolicy()));
            }
            if (this.getTty() != null) {
                data.set("tty", om.valueToTree(this.getTty()));
            }
            if (this.getVolumeDevices() != null) {
                data.set("volumeDevices", om.valueToTree(this.getVolumeDevices()));
            }
            if (this.getVolumeMounts() != null) {
                data.set("volumeMounts", om.valueToTree(this.getVolumeMounts()));
            }
            if (this.getWorkingDir() != null) {
                data.set("workingDir", om.valueToTree(this.getWorkingDir()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EphemeralContainer"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EphemeralContainer.Jsii$Proxy that = (EphemeralContainer.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.args != null ? !this.args.equals(that.args) : that.args != null) return false;
            if (this.command != null ? !this.command.equals(that.command) : that.command != null) return false;
            if (this.env != null ? !this.env.equals(that.env) : that.env != null) return false;
            if (this.envFrom != null ? !this.envFrom.equals(that.envFrom) : that.envFrom != null) return false;
            if (this.image != null ? !this.image.equals(that.image) : that.image != null) return false;
            if (this.imagePullPolicy != null ? !this.imagePullPolicy.equals(that.imagePullPolicy) : that.imagePullPolicy != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.livenessProbe != null ? !this.livenessProbe.equals(that.livenessProbe) : that.livenessProbe != null) return false;
            if (this.ports != null ? !this.ports.equals(that.ports) : that.ports != null) return false;
            if (this.readinessProbe != null ? !this.readinessProbe.equals(that.readinessProbe) : that.readinessProbe != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            if (this.securityContext != null ? !this.securityContext.equals(that.securityContext) : that.securityContext != null) return false;
            if (this.startupProbe != null ? !this.startupProbe.equals(that.startupProbe) : that.startupProbe != null) return false;
            if (this.stdin != null ? !this.stdin.equals(that.stdin) : that.stdin != null) return false;
            if (this.stdinOnce != null ? !this.stdinOnce.equals(that.stdinOnce) : that.stdinOnce != null) return false;
            if (this.targetContainerName != null ? !this.targetContainerName.equals(that.targetContainerName) : that.targetContainerName != null) return false;
            if (this.terminationMessagePath != null ? !this.terminationMessagePath.equals(that.terminationMessagePath) : that.terminationMessagePath != null) return false;
            if (this.terminationMessagePolicy != null ? !this.terminationMessagePolicy.equals(that.terminationMessagePolicy) : that.terminationMessagePolicy != null) return false;
            if (this.tty != null ? !this.tty.equals(that.tty) : that.tty != null) return false;
            if (this.volumeDevices != null ? !this.volumeDevices.equals(that.volumeDevices) : that.volumeDevices != null) return false;
            if (this.volumeMounts != null ? !this.volumeMounts.equals(that.volumeMounts) : that.volumeMounts != null) return false;
            return this.workingDir != null ? this.workingDir.equals(that.workingDir) : that.workingDir == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.args != null ? this.args.hashCode() : 0);
            result = 31 * result + (this.command != null ? this.command.hashCode() : 0);
            result = 31 * result + (this.env != null ? this.env.hashCode() : 0);
            result = 31 * result + (this.envFrom != null ? this.envFrom.hashCode() : 0);
            result = 31 * result + (this.image != null ? this.image.hashCode() : 0);
            result = 31 * result + (this.imagePullPolicy != null ? this.imagePullPolicy.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.livenessProbe != null ? this.livenessProbe.hashCode() : 0);
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            result = 31 * result + (this.readinessProbe != null ? this.readinessProbe.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.securityContext != null ? this.securityContext.hashCode() : 0);
            result = 31 * result + (this.startupProbe != null ? this.startupProbe.hashCode() : 0);
            result = 31 * result + (this.stdin != null ? this.stdin.hashCode() : 0);
            result = 31 * result + (this.stdinOnce != null ? this.stdinOnce.hashCode() : 0);
            result = 31 * result + (this.targetContainerName != null ? this.targetContainerName.hashCode() : 0);
            result = 31 * result + (this.terminationMessagePath != null ? this.terminationMessagePath.hashCode() : 0);
            result = 31 * result + (this.terminationMessagePolicy != null ? this.terminationMessagePolicy.hashCode() : 0);
            result = 31 * result + (this.tty != null ? this.tty.hashCode() : 0);
            result = 31 * result + (this.volumeDevices != null ? this.volumeDevices.hashCode() : 0);
            result = 31 * result + (this.volumeMounts != null ? this.volumeMounts.hashCode() : 0);
            result = 31 * result + (this.workingDir != null ? this.workingDir.hashCode() : 0);
            return result;
        }
    }
}
