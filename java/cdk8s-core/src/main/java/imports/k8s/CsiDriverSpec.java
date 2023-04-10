package imports.k8s;

/**
 * CSIDriverSpec is the specification of a CSIDriver.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.826Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiDriverSpec")
@software.amazon.jsii.Jsii.Proxy(CsiDriverSpec.Jsii$Proxy.class)
public interface CsiDriverSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting.
     * <p>
     * The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     * <p>
     * This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachRequired() {
        return null;
    }

    /**
     * Defines if the underlying volume supports changing ownership and permission of the volume before being mounted.
     * <p>
     * Refer to the specific FSGroupPolicy values for additional details.
     * <p>
     * This field is immutable.
     * <p>
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     * <p>
     * Default: ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsGroupPolicy() {
        return null;
    }

    /**
     * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume defined by a CSIVolumeSource, otherwise "false".
     * <p>
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * <p>
     * This field is immutable.
     * <p>
     * Default: false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPodInfoOnMount() {
        return null;
    }

    /**
     * RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume.
     * <p>
     * This field defaults to false.
     * <p>
     * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRequiresRepublish() {
        return null;
    }

    /**
     * SELinuxMount specifies if the CSI driver supports "-o context" mount option.
     * <p>
     * When "true", the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different <code>-o context</code> options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with "-o context=xyz" mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.
     * <p>
     * When "false", Kubernetes won't pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.
     * <p>
     * Default is "false".
     * <p>
     * Default: false".
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSeLinuxMount() {
        return null;
    }

    /**
     * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
     * <p>
     * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
     * <p>
     * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
     * <p>
     * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStorageCapacity() {
        return null;
    }

    /**
     * TokenRequests indicates the CSI driver needs pods' service account tokens it is mounting volume for to do necessary authentication.
     * <p>
     * Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: "csi.storage.k8s.io/serviceAccount.tokens": {
     * "<audience>": {
     * "token": <token>,
     * "expirationTimestamp": <expiration timestamp in RFC3339>,
     * },
     * ...
     * }
     * <p>
     * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.TokenRequest> getTokenRequests() {
        return null;
    }

    /**
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * <p>
     * The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future. This field is beta.
     * <p>
     * This field is immutable.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVolumeLifecycleModes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CsiDriverSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CsiDriverSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CsiDriverSpec> {
        java.lang.Boolean attachRequired;
        java.lang.String fsGroupPolicy;
        java.lang.Boolean podInfoOnMount;
        java.lang.Boolean requiresRepublish;
        java.lang.Boolean seLinuxMount;
        java.lang.Boolean storageCapacity;
        java.util.List<imports.k8s.TokenRequest> tokenRequests;
        java.util.List<java.lang.String> volumeLifecycleModes;

        /**
         * Sets the value of {@link CsiDriverSpec#getAttachRequired}
         * @param attachRequired attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting.
         *                       The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
         *                       <p>
         *                       This field is immutable.
         * @return {@code this}
         */
        public Builder attachRequired(java.lang.Boolean attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getFsGroupPolicy}
         * @param fsGroupPolicy Defines if the underlying volume supports changing ownership and permission of the volume before being mounted.
         *                      Refer to the specific FSGroupPolicy values for additional details.
         *                      <p>
         *                      This field is immutable.
         *                      <p>
         *                      Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume's access mode contains ReadWriteOnce.
         * @return {@code this}
         */
        public Builder fsGroupPolicy(java.lang.String fsGroupPolicy) {
            this.fsGroupPolicy = fsGroupPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getPodInfoOnMount}
         * @param podInfoOnMount If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume defined by a CSIVolumeSource, otherwise "false".
         *                       "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
         *                       <p>
         *                       This field is immutable.
         * @return {@code this}
         */
        public Builder podInfoOnMount(java.lang.Boolean podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getRequiresRepublish}
         * @param requiresRepublish RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume.
         *                          This field defaults to false.
         *                          <p>
         *                          Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
         * @return {@code this}
         */
        public Builder requiresRepublish(java.lang.Boolean requiresRepublish) {
            this.requiresRepublish = requiresRepublish;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getSeLinuxMount}
         * @param seLinuxMount SELinuxMount specifies if the CSI driver supports "-o context" mount option.
         *                     When "true", the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different <code>-o context</code> options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with "-o context=xyz" mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.
         *                     <p>
         *                     When "false", Kubernetes won't pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.
         *                     <p>
         *                     Default is "false".
         * @return {@code this}
         */
        public Builder seLinuxMount(java.lang.Boolean seLinuxMount) {
            this.seLinuxMount = seLinuxMount;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getStorageCapacity}
         * @param storageCapacity If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
         *                        The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
         *                        <p>
         *                        Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
         *                        <p>
         *                        This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
         * @return {@code this}
         */
        public Builder storageCapacity(java.lang.Boolean storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getTokenRequests}
         * @param tokenRequests TokenRequests indicates the CSI driver needs pods' service account tokens it is mounting volume for to do necessary authentication.
         *                      Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: "csi.storage.k8s.io/serviceAccount.tokens": {
         *                      "<audience>": {
         *                      "token": <token>,
         *                      "expirationTimestamp": <expiration timestamp in RFC3339>,
         *                      },
         *                      ...
         *                      }
         *                      <p>
         *                      Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tokenRequests(java.util.List<? extends imports.k8s.TokenRequest> tokenRequests) {
            this.tokenRequests = (java.util.List<imports.k8s.TokenRequest>)tokenRequests;
            return this;
        }

        /**
         * Sets the value of {@link CsiDriverSpec#getVolumeLifecycleModes}
         * @param volumeLifecycleModes volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
         *                             The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future. This field is beta.
         *                             <p>
         *                             This field is immutable.
         * @return {@code this}
         */
        public Builder volumeLifecycleModes(java.util.List<java.lang.String> volumeLifecycleModes) {
            this.volumeLifecycleModes = volumeLifecycleModes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CsiDriverSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CsiDriverSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CsiDriverSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CsiDriverSpec {
        private final java.lang.Boolean attachRequired;
        private final java.lang.String fsGroupPolicy;
        private final java.lang.Boolean podInfoOnMount;
        private final java.lang.Boolean requiresRepublish;
        private final java.lang.Boolean seLinuxMount;
        private final java.lang.Boolean storageCapacity;
        private final java.util.List<imports.k8s.TokenRequest> tokenRequests;
        private final java.util.List<java.lang.String> volumeLifecycleModes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attachRequired = software.amazon.jsii.Kernel.get(this, "attachRequired", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.fsGroupPolicy = software.amazon.jsii.Kernel.get(this, "fsGroupPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.podInfoOnMount = software.amazon.jsii.Kernel.get(this, "podInfoOnMount", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.requiresRepublish = software.amazon.jsii.Kernel.get(this, "requiresRepublish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.seLinuxMount = software.amazon.jsii.Kernel.get(this, "seLinuxMount", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.storageCapacity = software.amazon.jsii.Kernel.get(this, "storageCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tokenRequests = software.amazon.jsii.Kernel.get(this, "tokenRequests", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.TokenRequest.class)));
            this.volumeLifecycleModes = software.amazon.jsii.Kernel.get(this, "volumeLifecycleModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attachRequired = builder.attachRequired;
            this.fsGroupPolicy = builder.fsGroupPolicy;
            this.podInfoOnMount = builder.podInfoOnMount;
            this.requiresRepublish = builder.requiresRepublish;
            this.seLinuxMount = builder.seLinuxMount;
            this.storageCapacity = builder.storageCapacity;
            this.tokenRequests = (java.util.List<imports.k8s.TokenRequest>)builder.tokenRequests;
            this.volumeLifecycleModes = builder.volumeLifecycleModes;
        }

        @Override
        public final java.lang.Boolean getAttachRequired() {
            return this.attachRequired;
        }

        @Override
        public final java.lang.String getFsGroupPolicy() {
            return this.fsGroupPolicy;
        }

        @Override
        public final java.lang.Boolean getPodInfoOnMount() {
            return this.podInfoOnMount;
        }

        @Override
        public final java.lang.Boolean getRequiresRepublish() {
            return this.requiresRepublish;
        }

        @Override
        public final java.lang.Boolean getSeLinuxMount() {
            return this.seLinuxMount;
        }

        @Override
        public final java.lang.Boolean getStorageCapacity() {
            return this.storageCapacity;
        }

        @Override
        public final java.util.List<imports.k8s.TokenRequest> getTokenRequests() {
            return this.tokenRequests;
        }

        @Override
        public final java.util.List<java.lang.String> getVolumeLifecycleModes() {
            return this.volumeLifecycleModes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAttachRequired() != null) {
                data.set("attachRequired", om.valueToTree(this.getAttachRequired()));
            }
            if (this.getFsGroupPolicy() != null) {
                data.set("fsGroupPolicy", om.valueToTree(this.getFsGroupPolicy()));
            }
            if (this.getPodInfoOnMount() != null) {
                data.set("podInfoOnMount", om.valueToTree(this.getPodInfoOnMount()));
            }
            if (this.getRequiresRepublish() != null) {
                data.set("requiresRepublish", om.valueToTree(this.getRequiresRepublish()));
            }
            if (this.getSeLinuxMount() != null) {
                data.set("seLinuxMount", om.valueToTree(this.getSeLinuxMount()));
            }
            if (this.getStorageCapacity() != null) {
                data.set("storageCapacity", om.valueToTree(this.getStorageCapacity()));
            }
            if (this.getTokenRequests() != null) {
                data.set("tokenRequests", om.valueToTree(this.getTokenRequests()));
            }
            if (this.getVolumeLifecycleModes() != null) {
                data.set("volumeLifecycleModes", om.valueToTree(this.getVolumeLifecycleModes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CsiDriverSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CsiDriverSpec.Jsii$Proxy that = (CsiDriverSpec.Jsii$Proxy) o;

            if (this.attachRequired != null ? !this.attachRequired.equals(that.attachRequired) : that.attachRequired != null) return false;
            if (this.fsGroupPolicy != null ? !this.fsGroupPolicy.equals(that.fsGroupPolicy) : that.fsGroupPolicy != null) return false;
            if (this.podInfoOnMount != null ? !this.podInfoOnMount.equals(that.podInfoOnMount) : that.podInfoOnMount != null) return false;
            if (this.requiresRepublish != null ? !this.requiresRepublish.equals(that.requiresRepublish) : that.requiresRepublish != null) return false;
            if (this.seLinuxMount != null ? !this.seLinuxMount.equals(that.seLinuxMount) : that.seLinuxMount != null) return false;
            if (this.storageCapacity != null ? !this.storageCapacity.equals(that.storageCapacity) : that.storageCapacity != null) return false;
            if (this.tokenRequests != null ? !this.tokenRequests.equals(that.tokenRequests) : that.tokenRequests != null) return false;
            return this.volumeLifecycleModes != null ? this.volumeLifecycleModes.equals(that.volumeLifecycleModes) : that.volumeLifecycleModes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attachRequired != null ? this.attachRequired.hashCode() : 0;
            result = 31 * result + (this.fsGroupPolicy != null ? this.fsGroupPolicy.hashCode() : 0);
            result = 31 * result + (this.podInfoOnMount != null ? this.podInfoOnMount.hashCode() : 0);
            result = 31 * result + (this.requiresRepublish != null ? this.requiresRepublish.hashCode() : 0);
            result = 31 * result + (this.seLinuxMount != null ? this.seLinuxMount.hashCode() : 0);
            result = 31 * result + (this.storageCapacity != null ? this.storageCapacity.hashCode() : 0);
            result = 31 * result + (this.tokenRequests != null ? this.tokenRequests.hashCode() : 0);
            result = 31 * result + (this.volumeLifecycleModes != null ? this.volumeLifecycleModes.hashCode() : 0);
            return result;
        }
    }
}
