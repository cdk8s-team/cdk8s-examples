package imports.k8s;

/**
 * SecurityContext holds security configuration that will be applied to a container.
 * <p>
 * Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.940Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SecurityContext")
@software.amazon.jsii.Jsii.Proxy(SecurityContext.Jsii$Proxy.class)
public interface SecurityContext extends software.amazon.jsii.JsiiSerializable {

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
     * <p>
     * This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowPrivilegeEscalation() {
        return null;
    }

    /**
     * The capabilities to add/drop when running containers.
     * <p>
     * Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
     * <p>
     * Default: the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Capabilities getCapabilities() {
        return null;
    }

    /**
     * Run container in privileged mode.
     * <p>
     * Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * <p>
     * Default: false. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPrivileged() {
        return null;
    }

    /**
     * procMount denotes the type of proc mount to use for the containers.
     * <p>
     * The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProcMount() {
        return null;
    }

    /**
     * Whether this container has a read-only root filesystem.
     * <p>
     * Default is false. Note that this field cannot be set when spec.os.name is windows.
     * <p>
     * Default: false. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnlyRootFilesystem() {
        return null;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * <p>
     * Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsGroup() {
        return null;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * <p>
     * If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRunAsNonRoot() {
        return null;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * <p>
     * Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * <p>
     * Default: user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsUser() {
        return null;
    }

    /**
     * The seccomp options to use by this container.
     * <p>
     * If seccomp options are provided at both the pod &amp; container level, the container options override the pod options. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SeccompProfile getSeccompProfile() {
        return null;
    }

    /**
     * The SELinux context to be applied to the container.
     * <p>
     * If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SeLinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * The Windows specific settings applied to all containers.
     * <p>
     * If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.WindowsSecurityContextOptions getWindowsOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecurityContext}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecurityContext}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecurityContext> {
        java.lang.Boolean allowPrivilegeEscalation;
        imports.k8s.Capabilities capabilities;
        java.lang.Boolean privileged;
        java.lang.String procMount;
        java.lang.Boolean readOnlyRootFilesystem;
        java.lang.Number runAsGroup;
        java.lang.Boolean runAsNonRoot;
        java.lang.Number runAsUser;
        imports.k8s.SeccompProfile seccompProfile;
        imports.k8s.SeLinuxOptions seLinuxOptions;
        imports.k8s.WindowsSecurityContextOptions windowsOptions;

        /**
         * Sets the value of {@link SecurityContext#getAllowPrivilegeEscalation}
         * @param allowPrivilegeEscalation AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
         *                                 This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder allowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getCapabilities}
         * @param capabilities The capabilities to add/drop when running containers.
         *                     Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder capabilities(imports.k8s.Capabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getPrivileged}
         * @param privileged Run container in privileged mode.
         *                   Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder privileged(java.lang.Boolean privileged) {
            this.privileged = privileged;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getProcMount}
         * @param procMount procMount denotes the type of proc mount to use for the containers.
         *                  The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder procMount(java.lang.String procMount) {
            this.procMount = procMount;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getReadOnlyRootFilesystem}
         * @param readOnlyRootFilesystem Whether this container has a read-only root filesystem.
         *                               Default is false. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder readOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getRunAsGroup}
         * @param runAsGroup The GID to run the entrypoint of the container process.
         *                   Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder runAsGroup(java.lang.Number runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder runAsNonRoot(java.lang.Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getRunAsUser}
         * @param runAsUser The UID to run the entrypoint of the container process.
         *                  Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder runAsUser(java.lang.Number runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getSeccompProfile}
         * @param seccompProfile The seccomp options to use by this container.
         *                       If seccomp options are provided at both the pod &amp; container level, the container options override the pod options. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder seccompProfile(imports.k8s.SeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getSeLinuxOptions}
         * @param seLinuxOptions The SELinux context to be applied to the container.
         *                       If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder seLinuxOptions(imports.k8s.SeLinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Sets the value of {@link SecurityContext#getWindowsOptions}
         * @param windowsOptions The Windows specific settings applied to all containers.
         *                       If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
         * @return {@code this}
         */
        public Builder windowsOptions(imports.k8s.WindowsSecurityContextOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SecurityContext}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecurityContext build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SecurityContext}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecurityContext {
        private final java.lang.Boolean allowPrivilegeEscalation;
        private final imports.k8s.Capabilities capabilities;
        private final java.lang.Boolean privileged;
        private final java.lang.String procMount;
        private final java.lang.Boolean readOnlyRootFilesystem;
        private final java.lang.Number runAsGroup;
        private final java.lang.Boolean runAsNonRoot;
        private final java.lang.Number runAsUser;
        private final imports.k8s.SeccompProfile seccompProfile;
        private final imports.k8s.SeLinuxOptions seLinuxOptions;
        private final imports.k8s.WindowsSecurityContextOptions windowsOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowPrivilegeEscalation = software.amazon.jsii.Kernel.get(this, "allowPrivilegeEscalation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.capabilities = software.amazon.jsii.Kernel.get(this, "capabilities", software.amazon.jsii.NativeType.forClass(imports.k8s.Capabilities.class));
            this.privileged = software.amazon.jsii.Kernel.get(this, "privileged", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.procMount = software.amazon.jsii.Kernel.get(this, "procMount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnlyRootFilesystem = software.amazon.jsii.Kernel.get(this, "readOnlyRootFilesystem", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.runAsGroup = software.amazon.jsii.Kernel.get(this, "runAsGroup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.runAsNonRoot = software.amazon.jsii.Kernel.get(this, "runAsNonRoot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.runAsUser = software.amazon.jsii.Kernel.get(this, "runAsUser", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.seccompProfile = software.amazon.jsii.Kernel.get(this, "seccompProfile", software.amazon.jsii.NativeType.forClass(imports.k8s.SeccompProfile.class));
            this.seLinuxOptions = software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(imports.k8s.SeLinuxOptions.class));
            this.windowsOptions = software.amazon.jsii.Kernel.get(this, "windowsOptions", software.amazon.jsii.NativeType.forClass(imports.k8s.WindowsSecurityContextOptions.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowPrivilegeEscalation = builder.allowPrivilegeEscalation;
            this.capabilities = builder.capabilities;
            this.privileged = builder.privileged;
            this.procMount = builder.procMount;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsGroup = builder.runAsGroup;
            this.runAsNonRoot = builder.runAsNonRoot;
            this.runAsUser = builder.runAsUser;
            this.seccompProfile = builder.seccompProfile;
            this.seLinuxOptions = builder.seLinuxOptions;
            this.windowsOptions = builder.windowsOptions;
        }

        @Override
        public final java.lang.Boolean getAllowPrivilegeEscalation() {
            return this.allowPrivilegeEscalation;
        }

        @Override
        public final imports.k8s.Capabilities getCapabilities() {
            return this.capabilities;
        }

        @Override
        public final java.lang.Boolean getPrivileged() {
            return this.privileged;
        }

        @Override
        public final java.lang.String getProcMount() {
            return this.procMount;
        }

        @Override
        public final java.lang.Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        @Override
        public final java.lang.Number getRunAsGroup() {
            return this.runAsGroup;
        }

        @Override
        public final java.lang.Boolean getRunAsNonRoot() {
            return this.runAsNonRoot;
        }

        @Override
        public final java.lang.Number getRunAsUser() {
            return this.runAsUser;
        }

        @Override
        public final imports.k8s.SeccompProfile getSeccompProfile() {
            return this.seccompProfile;
        }

        @Override
        public final imports.k8s.SeLinuxOptions getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        public final imports.k8s.WindowsSecurityContextOptions getWindowsOptions() {
            return this.windowsOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowPrivilegeEscalation() != null) {
                data.set("allowPrivilegeEscalation", om.valueToTree(this.getAllowPrivilegeEscalation()));
            }
            if (this.getCapabilities() != null) {
                data.set("capabilities", om.valueToTree(this.getCapabilities()));
            }
            if (this.getPrivileged() != null) {
                data.set("privileged", om.valueToTree(this.getPrivileged()));
            }
            if (this.getProcMount() != null) {
                data.set("procMount", om.valueToTree(this.getProcMount()));
            }
            if (this.getReadOnlyRootFilesystem() != null) {
                data.set("readOnlyRootFilesystem", om.valueToTree(this.getReadOnlyRootFilesystem()));
            }
            if (this.getRunAsGroup() != null) {
                data.set("runAsGroup", om.valueToTree(this.getRunAsGroup()));
            }
            if (this.getRunAsNonRoot() != null) {
                data.set("runAsNonRoot", om.valueToTree(this.getRunAsNonRoot()));
            }
            if (this.getRunAsUser() != null) {
                data.set("runAsUser", om.valueToTree(this.getRunAsUser()));
            }
            if (this.getSeccompProfile() != null) {
                data.set("seccompProfile", om.valueToTree(this.getSeccompProfile()));
            }
            if (this.getSeLinuxOptions() != null) {
                data.set("seLinuxOptions", om.valueToTree(this.getSeLinuxOptions()));
            }
            if (this.getWindowsOptions() != null) {
                data.set("windowsOptions", om.valueToTree(this.getWindowsOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SecurityContext"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecurityContext.Jsii$Proxy that = (SecurityContext.Jsii$Proxy) o;

            if (this.allowPrivilegeEscalation != null ? !this.allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) : that.allowPrivilegeEscalation != null) return false;
            if (this.capabilities != null ? !this.capabilities.equals(that.capabilities) : that.capabilities != null) return false;
            if (this.privileged != null ? !this.privileged.equals(that.privileged) : that.privileged != null) return false;
            if (this.procMount != null ? !this.procMount.equals(that.procMount) : that.procMount != null) return false;
            if (this.readOnlyRootFilesystem != null ? !this.readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) : that.readOnlyRootFilesystem != null) return false;
            if (this.runAsGroup != null ? !this.runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null) return false;
            if (this.runAsNonRoot != null ? !this.runAsNonRoot.equals(that.runAsNonRoot) : that.runAsNonRoot != null) return false;
            if (this.runAsUser != null ? !this.runAsUser.equals(that.runAsUser) : that.runAsUser != null) return false;
            if (this.seccompProfile != null ? !this.seccompProfile.equals(that.seccompProfile) : that.seccompProfile != null) return false;
            if (this.seLinuxOptions != null ? !this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions != null) return false;
            return this.windowsOptions != null ? this.windowsOptions.equals(that.windowsOptions) : that.windowsOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowPrivilegeEscalation != null ? this.allowPrivilegeEscalation.hashCode() : 0;
            result = 31 * result + (this.capabilities != null ? this.capabilities.hashCode() : 0);
            result = 31 * result + (this.privileged != null ? this.privileged.hashCode() : 0);
            result = 31 * result + (this.procMount != null ? this.procMount.hashCode() : 0);
            result = 31 * result + (this.readOnlyRootFilesystem != null ? this.readOnlyRootFilesystem.hashCode() : 0);
            result = 31 * result + (this.runAsGroup != null ? this.runAsGroup.hashCode() : 0);
            result = 31 * result + (this.runAsNonRoot != null ? this.runAsNonRoot.hashCode() : 0);
            result = 31 * result + (this.runAsUser != null ? this.runAsUser.hashCode() : 0);
            result = 31 * result + (this.seccompProfile != null ? this.seccompProfile.hashCode() : 0);
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            result = 31 * result + (this.windowsOptions != null ? this.windowsOptions.hashCode() : 0);
            return result;
        }
    }
}
