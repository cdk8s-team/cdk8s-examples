package imports.k8s;

/**
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.963Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.WindowsSecurityContextOptions")
@software.amazon.jsii.Jsii.Proxy(WindowsSecurityContextOptions.Jsii$Proxy.class)
public interface WindowsSecurityContextOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGmsaCredentialSpec() {
        return null;
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGmsaCredentialSpecName() {
        return null;
    }

    /**
     * HostProcess determines if a container should be run as a 'Host Process' container.
     * <p>
     * This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHostProcess() {
        return null;
    }

    /**
     * The UserName in Windows to run the entrypoint of the container process.
     * <p>
     * Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * <p>
     * Default: the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRunAsUserName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WindowsSecurityContextOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WindowsSecurityContextOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WindowsSecurityContextOptions> {
        java.lang.String gmsaCredentialSpec;
        java.lang.String gmsaCredentialSpecName;
        java.lang.Boolean hostProcess;
        java.lang.String runAsUserName;

        /**
         * Sets the value of {@link WindowsSecurityContextOptions#getGmsaCredentialSpec}
         * @param gmsaCredentialSpec GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
         * @return {@code this}
         */
        public Builder gmsaCredentialSpec(java.lang.String gmsaCredentialSpec) {
            this.gmsaCredentialSpec = gmsaCredentialSpec;
            return this;
        }

        /**
         * Sets the value of {@link WindowsSecurityContextOptions#getGmsaCredentialSpecName}
         * @param gmsaCredentialSpecName GMSACredentialSpecName is the name of the GMSA credential spec to use.
         * @return {@code this}
         */
        public Builder gmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName) {
            this.gmsaCredentialSpecName = gmsaCredentialSpecName;
            return this;
        }

        /**
         * Sets the value of {@link WindowsSecurityContextOptions#getHostProcess}
         * @param hostProcess HostProcess determines if a container should be run as a 'Host Process' container.
         *                    This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.
         * @return {@code this}
         */
        public Builder hostProcess(java.lang.Boolean hostProcess) {
            this.hostProcess = hostProcess;
            return this;
        }

        /**
         * Sets the value of {@link WindowsSecurityContextOptions#getRunAsUserName}
         * @param runAsUserName The UserName in Windows to run the entrypoint of the container process.
         *                      Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder runAsUserName(java.lang.String runAsUserName) {
            this.runAsUserName = runAsUserName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WindowsSecurityContextOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WindowsSecurityContextOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link WindowsSecurityContextOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WindowsSecurityContextOptions {
        private final java.lang.String gmsaCredentialSpec;
        private final java.lang.String gmsaCredentialSpecName;
        private final java.lang.Boolean hostProcess;
        private final java.lang.String runAsUserName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.gmsaCredentialSpec = software.amazon.jsii.Kernel.get(this, "gmsaCredentialSpec", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.gmsaCredentialSpecName = software.amazon.jsii.Kernel.get(this, "gmsaCredentialSpecName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hostProcess = software.amazon.jsii.Kernel.get(this, "hostProcess", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.runAsUserName = software.amazon.jsii.Kernel.get(this, "runAsUserName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gmsaCredentialSpec = builder.gmsaCredentialSpec;
            this.gmsaCredentialSpecName = builder.gmsaCredentialSpecName;
            this.hostProcess = builder.hostProcess;
            this.runAsUserName = builder.runAsUserName;
        }

        @Override
        public final java.lang.String getGmsaCredentialSpec() {
            return this.gmsaCredentialSpec;
        }

        @Override
        public final java.lang.String getGmsaCredentialSpecName() {
            return this.gmsaCredentialSpecName;
        }

        @Override
        public final java.lang.Boolean getHostProcess() {
            return this.hostProcess;
        }

        @Override
        public final java.lang.String getRunAsUserName() {
            return this.runAsUserName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGmsaCredentialSpec() != null) {
                data.set("gmsaCredentialSpec", om.valueToTree(this.getGmsaCredentialSpec()));
            }
            if (this.getGmsaCredentialSpecName() != null) {
                data.set("gmsaCredentialSpecName", om.valueToTree(this.getGmsaCredentialSpecName()));
            }
            if (this.getHostProcess() != null) {
                data.set("hostProcess", om.valueToTree(this.getHostProcess()));
            }
            if (this.getRunAsUserName() != null) {
                data.set("runAsUserName", om.valueToTree(this.getRunAsUserName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.WindowsSecurityContextOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WindowsSecurityContextOptions.Jsii$Proxy that = (WindowsSecurityContextOptions.Jsii$Proxy) o;

            if (this.gmsaCredentialSpec != null ? !this.gmsaCredentialSpec.equals(that.gmsaCredentialSpec) : that.gmsaCredentialSpec != null) return false;
            if (this.gmsaCredentialSpecName != null ? !this.gmsaCredentialSpecName.equals(that.gmsaCredentialSpecName) : that.gmsaCredentialSpecName != null) return false;
            if (this.hostProcess != null ? !this.hostProcess.equals(that.hostProcess) : that.hostProcess != null) return false;
            return this.runAsUserName != null ? this.runAsUserName.equals(that.runAsUserName) : that.runAsUserName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.gmsaCredentialSpec != null ? this.gmsaCredentialSpec.hashCode() : 0;
            result = 31 * result + (this.gmsaCredentialSpecName != null ? this.gmsaCredentialSpecName.hashCode() : 0);
            result = 31 * result + (this.hostProcess != null ? this.hostProcess.hashCode() : 0);
            result = 31 * result + (this.runAsUserName != null ? this.runAsUserName.hashCode() : 0);
            return result;
        }
    }
}
