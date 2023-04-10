package imports.k8s;

/**
 * PodSecurityContext holds pod-level security attributes and common container settings.
 * <p>
 * Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.936Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodSecurityContext")
@software.amazon.jsii.Jsii.Proxy(PodSecurityContext.Jsii$Proxy.class)
public interface PodSecurityContext extends software.amazon.jsii.JsiiSerializable {

    /**
     * A special supplemental group that applies to all containers in a pod.
     * <p>
     * Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * <p>
     * <ol>
     * <li>The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----</li>
     * </ol>
     * <p>
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFsGroup() {
        return null;
    }

    /**
     * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod.
     * <p>
     * This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsGroupChangePolicy() {
        return null;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * <p>
     * Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsGroup() {
        return null;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * <p>
     * If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRunAsNonRoot() {
        return null;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * <p>
     * Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * <p>
     * Default: user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsUser() {
        return null;
    }

    /**
     * The seccomp options to use by the containers in this pod.
     * <p>
     * Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SeccompProfile getSeccompProfile() {
        return null;
    }

    /**
     * The SELinux context to be applied to all containers.
     * <p>
     * If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SeLinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process.
     * <p>
     * If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getSupplementalGroups() {
        return null;
    }

    /**
     * Sysctls hold a list of namespaced sysctls used for the pod.
     * <p>
     * Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.Sysctl> getSysctls() {
        return null;
    }

    /**
     * The Windows specific settings applied to all containers.
     * <p>
     * If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.WindowsSecurityContextOptions getWindowsOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSecurityContext}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityContext}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSecurityContext> {
        java.lang.Number fsGroup;
        java.lang.String fsGroupChangePolicy;
        java.lang.Number runAsGroup;
        java.lang.Boolean runAsNonRoot;
        java.lang.Number runAsUser;
        imports.k8s.SeccompProfile seccompProfile;
        imports.k8s.SeLinuxOptions seLinuxOptions;
        java.util.List<java.lang.Number> supplementalGroups;
        java.util.List<imports.k8s.Sysctl> sysctls;
        imports.k8s.WindowsSecurityContextOptions windowsOptions;

        /**
         * Sets the value of {@link PodSecurityContext#getFsGroup}
         * @param fsGroup A special supplemental group that applies to all containers in a pod.
         *                Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
         *                <p>
         *                <ol>
         *                <li>The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----</li>
         *                </ol>
         *                <p>
         *                If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder fsGroup(java.lang.Number fsGroup) {
            this.fsGroup = fsGroup;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getFsGroupChangePolicy}
         * @param fsGroupChangePolicy fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod.
         *                            This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified, "Always" is used. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder fsGroupChangePolicy(java.lang.String fsGroupChangePolicy) {
            this.fsGroupChangePolicy = fsGroupChangePolicy;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getRunAsGroup}
         * @param runAsGroup The GID to run the entrypoint of the container process.
         *                   Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder runAsGroup(java.lang.Number runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder runAsNonRoot(java.lang.Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getRunAsUser}
         * @param runAsUser The UID to run the entrypoint of the container process.
         *                  Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder runAsUser(java.lang.Number runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getSeccompProfile}
         * @param seccompProfile The seccomp options to use by the containers in this pod.
         *                       Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder seccompProfile(imports.k8s.SeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getSeLinuxOptions}
         * @param seLinuxOptions The SELinux context to be applied to all containers.
         *                       If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        public Builder seLinuxOptions(imports.k8s.SeLinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getSupplementalGroups}
         * @param supplementalGroups A list of groups applied to the first process run in each container, in addition to the container's primary GID, the fsGroup (if specified), and group memberships defined in the container image for the uid of the container process.
         *                           If unspecified, no additional groups are added to any container. Note that group memberships defined in the container image for the uid of the container process are still effective, even if they are not included in this list. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder supplementalGroups(java.util.List<? extends java.lang.Number> supplementalGroups) {
            this.supplementalGroups = (java.util.List<java.lang.Number>)supplementalGroups;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getSysctls}
         * @param sysctls Sysctls hold a list of namespaced sysctls used for the pod.
         *                Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder sysctls(java.util.List<? extends imports.k8s.Sysctl> sysctls) {
            this.sysctls = (java.util.List<imports.k8s.Sysctl>)sysctls;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityContext#getWindowsOptions}
         * @param windowsOptions The Windows specific settings applied to all containers.
         *                       If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
         * @return {@code this}
         */
        public Builder windowsOptions(imports.k8s.WindowsSecurityContextOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityContext}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSecurityContext build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PodSecurityContext}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityContext {
        private final java.lang.Number fsGroup;
        private final java.lang.String fsGroupChangePolicy;
        private final java.lang.Number runAsGroup;
        private final java.lang.Boolean runAsNonRoot;
        private final java.lang.Number runAsUser;
        private final imports.k8s.SeccompProfile seccompProfile;
        private final imports.k8s.SeLinuxOptions seLinuxOptions;
        private final java.util.List<java.lang.Number> supplementalGroups;
        private final java.util.List<imports.k8s.Sysctl> sysctls;
        private final imports.k8s.WindowsSecurityContextOptions windowsOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fsGroup = software.amazon.jsii.Kernel.get(this, "fsGroup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.fsGroupChangePolicy = software.amazon.jsii.Kernel.get(this, "fsGroupChangePolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runAsGroup = software.amazon.jsii.Kernel.get(this, "runAsGroup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.runAsNonRoot = software.amazon.jsii.Kernel.get(this, "runAsNonRoot", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.runAsUser = software.amazon.jsii.Kernel.get(this, "runAsUser", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.seccompProfile = software.amazon.jsii.Kernel.get(this, "seccompProfile", software.amazon.jsii.NativeType.forClass(imports.k8s.SeccompProfile.class));
            this.seLinuxOptions = software.amazon.jsii.Kernel.get(this, "seLinuxOptions", software.amazon.jsii.NativeType.forClass(imports.k8s.SeLinuxOptions.class));
            this.supplementalGroups = software.amazon.jsii.Kernel.get(this, "supplementalGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class)));
            this.sysctls = software.amazon.jsii.Kernel.get(this, "sysctls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Sysctl.class)));
            this.windowsOptions = software.amazon.jsii.Kernel.get(this, "windowsOptions", software.amazon.jsii.NativeType.forClass(imports.k8s.WindowsSecurityContextOptions.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fsGroup = builder.fsGroup;
            this.fsGroupChangePolicy = builder.fsGroupChangePolicy;
            this.runAsGroup = builder.runAsGroup;
            this.runAsNonRoot = builder.runAsNonRoot;
            this.runAsUser = builder.runAsUser;
            this.seccompProfile = builder.seccompProfile;
            this.seLinuxOptions = builder.seLinuxOptions;
            this.supplementalGroups = (java.util.List<java.lang.Number>)builder.supplementalGroups;
            this.sysctls = (java.util.List<imports.k8s.Sysctl>)builder.sysctls;
            this.windowsOptions = builder.windowsOptions;
        }

        @Override
        public final java.lang.Number getFsGroup() {
            return this.fsGroup;
        }

        @Override
        public final java.lang.String getFsGroupChangePolicy() {
            return this.fsGroupChangePolicy;
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
        public final java.util.List<java.lang.Number> getSupplementalGroups() {
            return this.supplementalGroups;
        }

        @Override
        public final java.util.List<imports.k8s.Sysctl> getSysctls() {
            return this.sysctls;
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

            if (this.getFsGroup() != null) {
                data.set("fsGroup", om.valueToTree(this.getFsGroup()));
            }
            if (this.getFsGroupChangePolicy() != null) {
                data.set("fsGroupChangePolicy", om.valueToTree(this.getFsGroupChangePolicy()));
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
            if (this.getSupplementalGroups() != null) {
                data.set("supplementalGroups", om.valueToTree(this.getSupplementalGroups()));
            }
            if (this.getSysctls() != null) {
                data.set("sysctls", om.valueToTree(this.getSysctls()));
            }
            if (this.getWindowsOptions() != null) {
                data.set("windowsOptions", om.valueToTree(this.getWindowsOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodSecurityContext"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityContext.Jsii$Proxy that = (PodSecurityContext.Jsii$Proxy) o;

            if (this.fsGroup != null ? !this.fsGroup.equals(that.fsGroup) : that.fsGroup != null) return false;
            if (this.fsGroupChangePolicy != null ? !this.fsGroupChangePolicy.equals(that.fsGroupChangePolicy) : that.fsGroupChangePolicy != null) return false;
            if (this.runAsGroup != null ? !this.runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null) return false;
            if (this.runAsNonRoot != null ? !this.runAsNonRoot.equals(that.runAsNonRoot) : that.runAsNonRoot != null) return false;
            if (this.runAsUser != null ? !this.runAsUser.equals(that.runAsUser) : that.runAsUser != null) return false;
            if (this.seccompProfile != null ? !this.seccompProfile.equals(that.seccompProfile) : that.seccompProfile != null) return false;
            if (this.seLinuxOptions != null ? !this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions != null) return false;
            if (this.supplementalGroups != null ? !this.supplementalGroups.equals(that.supplementalGroups) : that.supplementalGroups != null) return false;
            if (this.sysctls != null ? !this.sysctls.equals(that.sysctls) : that.sysctls != null) return false;
            return this.windowsOptions != null ? this.windowsOptions.equals(that.windowsOptions) : that.windowsOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.fsGroup != null ? this.fsGroup.hashCode() : 0;
            result = 31 * result + (this.fsGroupChangePolicy != null ? this.fsGroupChangePolicy.hashCode() : 0);
            result = 31 * result + (this.runAsGroup != null ? this.runAsGroup.hashCode() : 0);
            result = 31 * result + (this.runAsNonRoot != null ? this.runAsNonRoot.hashCode() : 0);
            result = 31 * result + (this.runAsUser != null ? this.runAsUser.hashCode() : 0);
            result = 31 * result + (this.seccompProfile != null ? this.seccompProfile.hashCode() : 0);
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            result = 31 * result + (this.supplementalGroups != null ? this.supplementalGroups.hashCode() : 0);
            result = 31 * result + (this.sysctls != null ? this.sysctls.hashCode() : 0);
            result = 31 * result + (this.windowsOptions != null ? this.windowsOptions.hashCode() : 0);
            return result;
        }
    }
}
