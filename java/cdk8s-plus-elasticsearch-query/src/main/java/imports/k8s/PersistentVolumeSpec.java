package imports.k8s;

/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.880Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PersistentVolumeSpec")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeSpec.Jsii$Proxy.class)
public interface PersistentVolumeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * accessModes contains all ways the volume can be mounted.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessModes() {
        return null;
    }

    /**
     * awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.AwsElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
        return null;
    }

    /**
     * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.AzureDiskVolumeSource getAzureDisk() {
        return null;
    }

    /**
     * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.AzureFilePersistentVolumeSource getAzureFile() {
        return null;
    }

    /**
     * capacity is the description of the persistent volume's resources and capacity.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getCapacity() {
        return null;
    }

    /**
     * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CephFsPersistentVolumeSource getCephfs() {
        return null;
    }

    /**
     * cinder represents a cinder volume attached and mounted on kubelets host machine.
     * <p>
     * More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CinderPersistentVolumeSource getCinder() {
        return null;
    }

    /**
     * claimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.
     * <p>
     * Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectReference getClaimRef() {
        return null;
    }

    /**
     * csi represents storage that is handled by an external CSI driver (Beta feature).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CsiPersistentVolumeSource getCsi() {
        return null;
    }

    /**
     * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FcVolumeSource getFc() {
        return null;
    }

    /**
     * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FlexPersistentVolumeSource getFlexVolume() {
        return null;
    }

    /**
     * flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage.
     * <p>
     * This depends on the Flocker control service being running
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FlockerVolumeSource getFlocker() {
        return null;
    }

    /**
     * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GcePersistentDiskVolumeSource getGcePersistentDisk() {
        return null;
    }

    /**
     * glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
     * <p>
     * Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GlusterfsPersistentVolumeSource getGlusterfs() {
        return null;
    }

    /**
     * hostPath represents a directory on the host.
     * <p>
     * Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HostPathVolumeSource getHostPath() {
        return null;
    }

    /**
     * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * Provisioned by an admin.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IscsiPersistentVolumeSource getIscsi() {
        return null;
    }

    /**
     * local represents directly-attached storage with node affinity.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LocalVolumeSource getLocal() {
        return null;
    }

    /**
     * mountOptions is the list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptions() {
        return null;
    }

    /**
     * nfs represents an NFS mount on the host.
     * <p>
     * Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NfsVolumeSource getNfs() {
        return null;
    }

    /**
     * nodeAffinity defines constraints that limit what nodes this volume can be accessed from.
     * <p>
     * This field influences the scheduling of pods that use this volume.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.VolumeNodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim.
     * <p>
     * Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPersistentVolumeReclaimPolicy() {
        return null;
    }

    /**
     * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
        return null;
    }

    /**
     * portworxVolume represents a portworx volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PortworxVolumeSource getPortworxVolume() {
        return null;
    }

    /**
     * quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.QuobyteVolumeSource getQuobyte() {
        return null;
    }

    /**
     * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime.
     * <p>
     * More info: https://examples.k8s.io/volumes/rbd/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.RbdPersistentVolumeSource getRbd() {
        return null;
    }

    /**
     * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ScaleIoPersistentVolumeSource getScaleIo() {
        return null;
    }

    /**
     * storageClassName is the name of StorageClass to which this persistent volume belongs.
     * <p>
     * Empty value means that this volume does not belong to any StorageClass.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * storageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StorageOsPersistentVolumeSource getStorageos() {
        return null;
    }

    /**
     * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state.
     * <p>
     * Value of Filesystem is implied when not included in spec.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeMode() {
        return null;
    }

    /**
     * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PersistentVolumeSpec> {
        java.util.List<java.lang.String> accessModes;
        imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
        imports.k8s.AzureDiskVolumeSource azureDisk;
        imports.k8s.AzureFilePersistentVolumeSource azureFile;
        java.util.Map<java.lang.String, imports.k8s.Quantity> capacity;
        imports.k8s.CephFsPersistentVolumeSource cephfs;
        imports.k8s.CinderPersistentVolumeSource cinder;
        imports.k8s.ObjectReference claimRef;
        imports.k8s.CsiPersistentVolumeSource csi;
        imports.k8s.FcVolumeSource fc;
        imports.k8s.FlexPersistentVolumeSource flexVolume;
        imports.k8s.FlockerVolumeSource flocker;
        imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk;
        imports.k8s.GlusterfsPersistentVolumeSource glusterfs;
        imports.k8s.HostPathVolumeSource hostPath;
        imports.k8s.IscsiPersistentVolumeSource iscsi;
        imports.k8s.LocalVolumeSource local;
        java.util.List<java.lang.String> mountOptions;
        imports.k8s.NfsVolumeSource nfs;
        imports.k8s.VolumeNodeAffinity nodeAffinity;
        java.lang.String persistentVolumeReclaimPolicy;
        imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        imports.k8s.PortworxVolumeSource portworxVolume;
        imports.k8s.QuobyteVolumeSource quobyte;
        imports.k8s.RbdPersistentVolumeSource rbd;
        imports.k8s.ScaleIoPersistentVolumeSource scaleIo;
        java.lang.String storageClassName;
        imports.k8s.StorageOsPersistentVolumeSource storageos;
        java.lang.String volumeMode;
        imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAccessModes}
         * @param accessModes accessModes contains all ways the volume can be mounted.
         *                    More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAwsElasticBlockStore}
         * @param awsElasticBlockStore awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                             More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAzureDisk}
         * @param azureDisk azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureDisk(imports.k8s.AzureDiskVolumeSource azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAzureFile}
         * @param azureFile azureFile represents an Azure File Service mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureFile(imports.k8s.AzureFilePersistentVolumeSource azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCapacity}
         * @param capacity capacity is the description of the persistent volume's resources and capacity.
         *                 More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder capacity(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> capacity) {
            this.capacity = (java.util.Map<java.lang.String, imports.k8s.Quantity>)capacity;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCephfs}
         * @param cephfs cephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder cephfs(imports.k8s.CephFsPersistentVolumeSource cephfs) {
            this.cephfs = cephfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCinder}
         * @param cinder cinder represents a cinder volume attached and mounted on kubelets host machine.
         *               More info: https://examples.k8s.io/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder cinder(imports.k8s.CinderPersistentVolumeSource cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getClaimRef}
         * @param claimRef claimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.
         *                 Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
         * @return {@code this}
         */
        public Builder claimRef(imports.k8s.ObjectReference claimRef) {
            this.claimRef = claimRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCsi}
         * @param csi csi represents storage that is handled by an external CSI driver (Beta feature).
         * @return {@code this}
         */
        public Builder csi(imports.k8s.CsiPersistentVolumeSource csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getFc}
         * @param fc fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
         * @return {@code this}
         */
        public Builder fc(imports.k8s.FcVolumeSource fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getFlexVolume}
         * @param flexVolume flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
         * @return {@code this}
         */
        public Builder flexVolume(imports.k8s.FlexPersistentVolumeSource flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getFlocker}
         * @param flocker flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage.
         *                This depends on the Flocker control service being running
         * @return {@code this}
         */
        public Builder flocker(imports.k8s.FlockerVolumeSource flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getGcePersistentDisk}
         * @param gcePersistentDisk gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                          Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getGlusterfs}
         * @param glusterfs glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
         *                  Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
         * @return {@code this}
         */
        public Builder glusterfs(imports.k8s.GlusterfsPersistentVolumeSource glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getHostPath}
         * @param hostPath hostPath represents a directory on the host.
         *                 Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * @return {@code this}
         */
        public Builder hostPath(imports.k8s.HostPathVolumeSource hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getIscsi}
         * @param iscsi iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *              Provisioned by an admin.
         * @return {@code this}
         */
        public Builder iscsi(imports.k8s.IscsiPersistentVolumeSource iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getLocal}
         * @param local local represents directly-attached storage with node affinity.
         * @return {@code this}
         */
        public Builder local(imports.k8s.LocalVolumeSource local) {
            this.local = local;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getMountOptions}
         * @param mountOptions mountOptions is the list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options.
         * @return {@code this}
         */
        public Builder mountOptions(java.util.List<java.lang.String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getNfs}
         * @param nfs nfs represents an NFS mount on the host.
         *            Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
         * @return {@code this}
         */
        public Builder nfs(imports.k8s.NfsVolumeSource nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getNodeAffinity}
         * @param nodeAffinity nodeAffinity defines constraints that limit what nodes this volume can be accessed from.
         *                     This field influences the scheduling of pods that use this volume.
         * @return {@code this}
         */
        public Builder nodeAffinity(imports.k8s.VolumeNodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getPersistentVolumeReclaimPolicy}
         * @param persistentVolumeReclaimPolicy persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim.
         *                                      Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
         * @return {@code this}
         */
        public Builder persistentVolumeReclaimPolicy(java.lang.String persistentVolumeReclaimPolicy) {
            this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getPhotonPersistentDisk}
         * @param photonPersistentDisk photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getPortworxVolume}
         * @param portworxVolume portworxVolume represents a portworx volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder portworxVolume(imports.k8s.PortworxVolumeSource portworxVolume) {
            this.portworxVolume = portworxVolume;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getQuobyte}
         * @param quobyte quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder quobyte(imports.k8s.QuobyteVolumeSource quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getRbd}
         * @param rbd rbd represents a Rados Block Device mount on the host that shares a pod's lifetime.
         *            More info: https://examples.k8s.io/volumes/rbd/README.md
         * @return {@code this}
         */
        public Builder rbd(imports.k8s.RbdPersistentVolumeSource rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getScaleIo}
         * @param scaleIo scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder scaleIo(imports.k8s.ScaleIoPersistentVolumeSource scaleIo) {
            this.scaleIo = scaleIo;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getStorageClassName}
         * @param storageClassName storageClassName is the name of StorageClass to which this persistent volume belongs.
         *                         Empty value means that this volume does not belong to any StorageClass.
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getStorageos}
         * @param storageos storageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md.
         * @return {@code this}
         */
        public Builder storageos(imports.k8s.StorageOsPersistentVolumeSource storageos) {
            this.storageos = storageos;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getVolumeMode}
         * @param volumeMode volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state.
         *                   Value of Filesystem is implied when not included in spec.
         * @return {@code this}
         */
        public Builder volumeMode(java.lang.String volumeMode) {
            this.volumeMode = volumeMode;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getVsphereVolume}
         * @param vsphereVolume vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PersistentVolumeSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeSpec {
        private final java.util.List<java.lang.String> accessModes;
        private final imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
        private final imports.k8s.AzureDiskVolumeSource azureDisk;
        private final imports.k8s.AzureFilePersistentVolumeSource azureFile;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> capacity;
        private final imports.k8s.CephFsPersistentVolumeSource cephfs;
        private final imports.k8s.CinderPersistentVolumeSource cinder;
        private final imports.k8s.ObjectReference claimRef;
        private final imports.k8s.CsiPersistentVolumeSource csi;
        private final imports.k8s.FcVolumeSource fc;
        private final imports.k8s.FlexPersistentVolumeSource flexVolume;
        private final imports.k8s.FlockerVolumeSource flocker;
        private final imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk;
        private final imports.k8s.GlusterfsPersistentVolumeSource glusterfs;
        private final imports.k8s.HostPathVolumeSource hostPath;
        private final imports.k8s.IscsiPersistentVolumeSource iscsi;
        private final imports.k8s.LocalVolumeSource local;
        private final java.util.List<java.lang.String> mountOptions;
        private final imports.k8s.NfsVolumeSource nfs;
        private final imports.k8s.VolumeNodeAffinity nodeAffinity;
        private final java.lang.String persistentVolumeReclaimPolicy;
        private final imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        private final imports.k8s.PortworxVolumeSource portworxVolume;
        private final imports.k8s.QuobyteVolumeSource quobyte;
        private final imports.k8s.RbdPersistentVolumeSource rbd;
        private final imports.k8s.ScaleIoPersistentVolumeSource scaleIo;
        private final java.lang.String storageClassName;
        private final imports.k8s.StorageOsPersistentVolumeSource storageos;
        private final java.lang.String volumeMode;
        private final imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.k8s.AwsElasticBlockStoreVolumeSource.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.AzureDiskVolumeSource.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.k8s.AzureFilePersistentVolumeSource.class));
            this.capacity = software.amazon.jsii.Kernel.get(this, "capacity", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.cephfs = software.amazon.jsii.Kernel.get(this, "cephfs", software.amazon.jsii.NativeType.forClass(imports.k8s.CephFsPersistentVolumeSource.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.k8s.CinderPersistentVolumeSource.class));
            this.claimRef = software.amazon.jsii.Kernel.get(this, "claimRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.k8s.CsiPersistentVolumeSource.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.k8s.FcVolumeSource.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.FlexPersistentVolumeSource.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.k8s.FlockerVolumeSource.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.GcePersistentDiskVolumeSource.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.k8s.GlusterfsPersistentVolumeSource.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.k8s.HostPathVolumeSource.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.k8s.IscsiPersistentVolumeSource.class));
            this.local = software.amazon.jsii.Kernel.get(this, "local", software.amazon.jsii.NativeType.forClass(imports.k8s.LocalVolumeSource.class));
            this.mountOptions = software.amazon.jsii.Kernel.get(this, "mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.k8s.NfsVolumeSource.class));
            this.nodeAffinity = software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.k8s.VolumeNodeAffinity.class));
            this.persistentVolumeReclaimPolicy = software.amazon.jsii.Kernel.get(this, "persistentVolumeReclaimPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.PhotonPersistentDiskVolumeSource.class));
            this.portworxVolume = software.amazon.jsii.Kernel.get(this, "portworxVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.PortworxVolumeSource.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.k8s.QuobyteVolumeSource.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.k8s.RbdPersistentVolumeSource.class));
            this.scaleIo = software.amazon.jsii.Kernel.get(this, "scaleIo", software.amazon.jsii.NativeType.forClass(imports.k8s.ScaleIoPersistentVolumeSource.class));
            this.storageClassName = software.amazon.jsii.Kernel.get(this, "storageClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.storageos = software.amazon.jsii.Kernel.get(this, "storageos", software.amazon.jsii.NativeType.forClass(imports.k8s.StorageOsPersistentVolumeSource.class));
            this.volumeMode = software.amazon.jsii.Kernel.get(this, "volumeMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.VsphereVirtualDiskVolumeSource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessModes = builder.accessModes;
            this.awsElasticBlockStore = builder.awsElasticBlockStore;
            this.azureDisk = builder.azureDisk;
            this.azureFile = builder.azureFile;
            this.capacity = (java.util.Map<java.lang.String, imports.k8s.Quantity>)builder.capacity;
            this.cephfs = builder.cephfs;
            this.cinder = builder.cinder;
            this.claimRef = builder.claimRef;
            this.csi = builder.csi;
            this.fc = builder.fc;
            this.flexVolume = builder.flexVolume;
            this.flocker = builder.flocker;
            this.gcePersistentDisk = builder.gcePersistentDisk;
            this.glusterfs = builder.glusterfs;
            this.hostPath = builder.hostPath;
            this.iscsi = builder.iscsi;
            this.local = builder.local;
            this.mountOptions = builder.mountOptions;
            this.nfs = builder.nfs;
            this.nodeAffinity = builder.nodeAffinity;
            this.persistentVolumeReclaimPolicy = builder.persistentVolumeReclaimPolicy;
            this.photonPersistentDisk = builder.photonPersistentDisk;
            this.portworxVolume = builder.portworxVolume;
            this.quobyte = builder.quobyte;
            this.rbd = builder.rbd;
            this.scaleIo = builder.scaleIo;
            this.storageClassName = builder.storageClassName;
            this.storageos = builder.storageos;
            this.volumeMode = builder.volumeMode;
            this.vsphereVolume = builder.vsphereVolume;
        }

        @Override
        public final java.util.List<java.lang.String> getAccessModes() {
            return this.accessModes;
        }

        @Override
        public final imports.k8s.AwsElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public final imports.k8s.AzureDiskVolumeSource getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public final imports.k8s.AzureFilePersistentVolumeSource getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getCapacity() {
            return this.capacity;
        }

        @Override
        public final imports.k8s.CephFsPersistentVolumeSource getCephfs() {
            return this.cephfs;
        }

        @Override
        public final imports.k8s.CinderPersistentVolumeSource getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.k8s.ObjectReference getClaimRef() {
            return this.claimRef;
        }

        @Override
        public final imports.k8s.CsiPersistentVolumeSource getCsi() {
            return this.csi;
        }

        @Override
        public final imports.k8s.FcVolumeSource getFc() {
            return this.fc;
        }

        @Override
        public final imports.k8s.FlexPersistentVolumeSource getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public final imports.k8s.FlockerVolumeSource getFlocker() {
            return this.flocker;
        }

        @Override
        public final imports.k8s.GcePersistentDiskVolumeSource getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public final imports.k8s.GlusterfsPersistentVolumeSource getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.k8s.HostPathVolumeSource getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.k8s.IscsiPersistentVolumeSource getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.k8s.LocalVolumeSource getLocal() {
            return this.local;
        }

        @Override
        public final java.util.List<java.lang.String> getMountOptions() {
            return this.mountOptions;
        }

        @Override
        public final imports.k8s.NfsVolumeSource getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.k8s.VolumeNodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public final java.lang.String getPersistentVolumeReclaimPolicy() {
            return this.persistentVolumeReclaimPolicy;
        }

        @Override
        public final imports.k8s.PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public final imports.k8s.PortworxVolumeSource getPortworxVolume() {
            return this.portworxVolume;
        }

        @Override
        public final imports.k8s.QuobyteVolumeSource getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.k8s.RbdPersistentVolumeSource getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.k8s.ScaleIoPersistentVolumeSource getScaleIo() {
            return this.scaleIo;
        }

        @Override
        public final java.lang.String getStorageClassName() {
            return this.storageClassName;
        }

        @Override
        public final imports.k8s.StorageOsPersistentVolumeSource getStorageos() {
            return this.storageos;
        }

        @Override
        public final java.lang.String getVolumeMode() {
            return this.volumeMode;
        }

        @Override
        public final imports.k8s.VsphereVirtualDiskVolumeSource getVsphereVolume() {
            return this.vsphereVolume;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessModes() != null) {
                data.set("accessModes", om.valueToTree(this.getAccessModes()));
            }
            if (this.getAwsElasticBlockStore() != null) {
                data.set("awsElasticBlockStore", om.valueToTree(this.getAwsElasticBlockStore()));
            }
            if (this.getAzureDisk() != null) {
                data.set("azureDisk", om.valueToTree(this.getAzureDisk()));
            }
            if (this.getAzureFile() != null) {
                data.set("azureFile", om.valueToTree(this.getAzureFile()));
            }
            if (this.getCapacity() != null) {
                data.set("capacity", om.valueToTree(this.getCapacity()));
            }
            if (this.getCephfs() != null) {
                data.set("cephfs", om.valueToTree(this.getCephfs()));
            }
            if (this.getCinder() != null) {
                data.set("cinder", om.valueToTree(this.getCinder()));
            }
            if (this.getClaimRef() != null) {
                data.set("claimRef", om.valueToTree(this.getClaimRef()));
            }
            if (this.getCsi() != null) {
                data.set("csi", om.valueToTree(this.getCsi()));
            }
            if (this.getFc() != null) {
                data.set("fc", om.valueToTree(this.getFc()));
            }
            if (this.getFlexVolume() != null) {
                data.set("flexVolume", om.valueToTree(this.getFlexVolume()));
            }
            if (this.getFlocker() != null) {
                data.set("flocker", om.valueToTree(this.getFlocker()));
            }
            if (this.getGcePersistentDisk() != null) {
                data.set("gcePersistentDisk", om.valueToTree(this.getGcePersistentDisk()));
            }
            if (this.getGlusterfs() != null) {
                data.set("glusterfs", om.valueToTree(this.getGlusterfs()));
            }
            if (this.getHostPath() != null) {
                data.set("hostPath", om.valueToTree(this.getHostPath()));
            }
            if (this.getIscsi() != null) {
                data.set("iscsi", om.valueToTree(this.getIscsi()));
            }
            if (this.getLocal() != null) {
                data.set("local", om.valueToTree(this.getLocal()));
            }
            if (this.getMountOptions() != null) {
                data.set("mountOptions", om.valueToTree(this.getMountOptions()));
            }
            if (this.getNfs() != null) {
                data.set("nfs", om.valueToTree(this.getNfs()));
            }
            if (this.getNodeAffinity() != null) {
                data.set("nodeAffinity", om.valueToTree(this.getNodeAffinity()));
            }
            if (this.getPersistentVolumeReclaimPolicy() != null) {
                data.set("persistentVolumeReclaimPolicy", om.valueToTree(this.getPersistentVolumeReclaimPolicy()));
            }
            if (this.getPhotonPersistentDisk() != null) {
                data.set("photonPersistentDisk", om.valueToTree(this.getPhotonPersistentDisk()));
            }
            if (this.getPortworxVolume() != null) {
                data.set("portworxVolume", om.valueToTree(this.getPortworxVolume()));
            }
            if (this.getQuobyte() != null) {
                data.set("quobyte", om.valueToTree(this.getQuobyte()));
            }
            if (this.getRbd() != null) {
                data.set("rbd", om.valueToTree(this.getRbd()));
            }
            if (this.getScaleIo() != null) {
                data.set("scaleIo", om.valueToTree(this.getScaleIo()));
            }
            if (this.getStorageClassName() != null) {
                data.set("storageClassName", om.valueToTree(this.getStorageClassName()));
            }
            if (this.getStorageos() != null) {
                data.set("storageos", om.valueToTree(this.getStorageos()));
            }
            if (this.getVolumeMode() != null) {
                data.set("volumeMode", om.valueToTree(this.getVolumeMode()));
            }
            if (this.getVsphereVolume() != null) {
                data.set("vsphereVolume", om.valueToTree(this.getVsphereVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PersistentVolumeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeSpec.Jsii$Proxy that = (PersistentVolumeSpec.Jsii$Proxy) o;

            if (this.accessModes != null ? !this.accessModes.equals(that.accessModes) : that.accessModes != null) return false;
            if (this.awsElasticBlockStore != null ? !this.awsElasticBlockStore.equals(that.awsElasticBlockStore) : that.awsElasticBlockStore != null) return false;
            if (this.azureDisk != null ? !this.azureDisk.equals(that.azureDisk) : that.azureDisk != null) return false;
            if (this.azureFile != null ? !this.azureFile.equals(that.azureFile) : that.azureFile != null) return false;
            if (this.capacity != null ? !this.capacity.equals(that.capacity) : that.capacity != null) return false;
            if (this.cephfs != null ? !this.cephfs.equals(that.cephfs) : that.cephfs != null) return false;
            if (this.cinder != null ? !this.cinder.equals(that.cinder) : that.cinder != null) return false;
            if (this.claimRef != null ? !this.claimRef.equals(that.claimRef) : that.claimRef != null) return false;
            if (this.csi != null ? !this.csi.equals(that.csi) : that.csi != null) return false;
            if (this.fc != null ? !this.fc.equals(that.fc) : that.fc != null) return false;
            if (this.flexVolume != null ? !this.flexVolume.equals(that.flexVolume) : that.flexVolume != null) return false;
            if (this.flocker != null ? !this.flocker.equals(that.flocker) : that.flocker != null) return false;
            if (this.gcePersistentDisk != null ? !this.gcePersistentDisk.equals(that.gcePersistentDisk) : that.gcePersistentDisk != null) return false;
            if (this.glusterfs != null ? !this.glusterfs.equals(that.glusterfs) : that.glusterfs != null) return false;
            if (this.hostPath != null ? !this.hostPath.equals(that.hostPath) : that.hostPath != null) return false;
            if (this.iscsi != null ? !this.iscsi.equals(that.iscsi) : that.iscsi != null) return false;
            if (this.local != null ? !this.local.equals(that.local) : that.local != null) return false;
            if (this.mountOptions != null ? !this.mountOptions.equals(that.mountOptions) : that.mountOptions != null) return false;
            if (this.nfs != null ? !this.nfs.equals(that.nfs) : that.nfs != null) return false;
            if (this.nodeAffinity != null ? !this.nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null) return false;
            if (this.persistentVolumeReclaimPolicy != null ? !this.persistentVolumeReclaimPolicy.equals(that.persistentVolumeReclaimPolicy) : that.persistentVolumeReclaimPolicy != null) return false;
            if (this.photonPersistentDisk != null ? !this.photonPersistentDisk.equals(that.photonPersistentDisk) : that.photonPersistentDisk != null) return false;
            if (this.portworxVolume != null ? !this.portworxVolume.equals(that.portworxVolume) : that.portworxVolume != null) return false;
            if (this.quobyte != null ? !this.quobyte.equals(that.quobyte) : that.quobyte != null) return false;
            if (this.rbd != null ? !this.rbd.equals(that.rbd) : that.rbd != null) return false;
            if (this.scaleIo != null ? !this.scaleIo.equals(that.scaleIo) : that.scaleIo != null) return false;
            if (this.storageClassName != null ? !this.storageClassName.equals(that.storageClassName) : that.storageClassName != null) return false;
            if (this.storageos != null ? !this.storageos.equals(that.storageos) : that.storageos != null) return false;
            if (this.volumeMode != null ? !this.volumeMode.equals(that.volumeMode) : that.volumeMode != null) return false;
            return this.vsphereVolume != null ? this.vsphereVolume.equals(that.vsphereVolume) : that.vsphereVolume == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessModes != null ? this.accessModes.hashCode() : 0;
            result = 31 * result + (this.awsElasticBlockStore != null ? this.awsElasticBlockStore.hashCode() : 0);
            result = 31 * result + (this.azureDisk != null ? this.azureDisk.hashCode() : 0);
            result = 31 * result + (this.azureFile != null ? this.azureFile.hashCode() : 0);
            result = 31 * result + (this.capacity != null ? this.capacity.hashCode() : 0);
            result = 31 * result + (this.cephfs != null ? this.cephfs.hashCode() : 0);
            result = 31 * result + (this.cinder != null ? this.cinder.hashCode() : 0);
            result = 31 * result + (this.claimRef != null ? this.claimRef.hashCode() : 0);
            result = 31 * result + (this.csi != null ? this.csi.hashCode() : 0);
            result = 31 * result + (this.fc != null ? this.fc.hashCode() : 0);
            result = 31 * result + (this.flexVolume != null ? this.flexVolume.hashCode() : 0);
            result = 31 * result + (this.flocker != null ? this.flocker.hashCode() : 0);
            result = 31 * result + (this.gcePersistentDisk != null ? this.gcePersistentDisk.hashCode() : 0);
            result = 31 * result + (this.glusterfs != null ? this.glusterfs.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            result = 31 * result + (this.iscsi != null ? this.iscsi.hashCode() : 0);
            result = 31 * result + (this.local != null ? this.local.hashCode() : 0);
            result = 31 * result + (this.mountOptions != null ? this.mountOptions.hashCode() : 0);
            result = 31 * result + (this.nfs != null ? this.nfs.hashCode() : 0);
            result = 31 * result + (this.nodeAffinity != null ? this.nodeAffinity.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeReclaimPolicy != null ? this.persistentVolumeReclaimPolicy.hashCode() : 0);
            result = 31 * result + (this.photonPersistentDisk != null ? this.photonPersistentDisk.hashCode() : 0);
            result = 31 * result + (this.portworxVolume != null ? this.portworxVolume.hashCode() : 0);
            result = 31 * result + (this.quobyte != null ? this.quobyte.hashCode() : 0);
            result = 31 * result + (this.rbd != null ? this.rbd.hashCode() : 0);
            result = 31 * result + (this.scaleIo != null ? this.scaleIo.hashCode() : 0);
            result = 31 * result + (this.storageClassName != null ? this.storageClassName.hashCode() : 0);
            result = 31 * result + (this.storageos != null ? this.storageos.hashCode() : 0);
            result = 31 * result + (this.volumeMode != null ? this.volumeMode.hashCode() : 0);
            result = 31 * result + (this.vsphereVolume != null ? this.vsphereVolume.hashCode() : 0);
            return result;
        }
    }
}
