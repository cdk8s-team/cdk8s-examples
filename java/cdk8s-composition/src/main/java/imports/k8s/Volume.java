package imports.k8s;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.962Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Volume")
@software.amazon.jsii.Jsii.Proxy(Volume.Jsii$Proxy.class)
public interface Volume extends software.amazon.jsii.JsiiSerializable {

    /**
     * name of the volume.
     * <p>
     * Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

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
    default @org.jetbrains.annotations.Nullable imports.k8s.AzureFileVolumeSource getAzureFile() {
        return null;
    }

    /**
     * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CephFsVolumeSource getCephfs() {
        return null;
    }

    /**
     * cinder represents a cinder volume attached and mounted on kubelets host machine.
     * <p>
     * More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CinderVolumeSource getCinder() {
        return null;
    }

    /**
     * configMap represents a configMap that should populate this volume.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ConfigMapVolumeSource getConfigMap() {
        return null;
    }

    /**
     * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CsiVolumeSource getCsi() {
        return null;
    }

    /**
     * downwardAPI represents downward API about the pod that should populate this volume.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.DownwardApiVolumeSource getDownwardApi() {
        return null;
    }

    /**
     * emptyDir represents a temporary directory that shares a pod's lifetime.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EmptyDirVolumeSource getEmptyDir() {
        return null;
    }

    /**
     * ephemeral represents a volume that is handled by a cluster storage driver.
     * <p>
     * The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
     * <p>
     * Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
     * tracking are needed,
     * c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through
     * a PersistentVolumeClaim (see EphemeralVolumeSource for more
     * information on the connection between this volume type
     * and PersistentVolumeClaim).
     * <p>
     * Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
     * <p>
     * Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
     * <p>
     * A pod can use both types of ephemeral volumes and persistent volumes at the same time.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EphemeralVolumeSource getEphemeral() {
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
    default @org.jetbrains.annotations.Nullable imports.k8s.FlexVolumeSource getFlexVolume() {
        return null;
    }

    /**
     * flocker represents a Flocker volume attached to a kubelet's host machine.
     * <p>
     * This depends on the Flocker control service being running
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.FlockerVolumeSource getFlocker() {
        return null;
    }

    /**
     * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GcePersistentDiskVolumeSource getGcePersistentDisk() {
        return null;
    }

    /**
     * gitRepo represents a git repository at a particular revision.
     * <p>
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GitRepoVolumeSource getGitRepo() {
        return null;
    }

    /**
     * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
     * <p>
     * More info: https://examples.k8s.io/volumes/glusterfs/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GlusterfsVolumeSource getGlusterfs() {
        return null;
    }

    /**
     * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
     * <p>
     * This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HostPathVolumeSource getHostPath() {
        return null;
    }

    /**
     * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://examples.k8s.io/volumes/iscsi/README.md
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.IscsiVolumeSource getIscsi() {
        return null;
    }

    /**
     * nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NfsVolumeSource getNfs() {
        return null;
    }

    /**
     * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
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
     * projected items for all in one resources secrets, configmaps, and downward API.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ProjectedVolumeSource getProjected() {
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
    default @org.jetbrains.annotations.Nullable imports.k8s.RbdVolumeSource getRbd() {
        return null;
    }

    /**
     * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ScaleIoVolumeSource getScaleIo() {
        return null;
    }

    /**
     * secret represents a secret that should populate this volume.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretVolumeSource getSecret() {
        return null;
    }

    /**
     * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StorageOsVolumeSource getStorageos() {
        return null;
    }

    /**
     * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Volume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Volume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Volume> {
        java.lang.String name;
        imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
        imports.k8s.AzureDiskVolumeSource azureDisk;
        imports.k8s.AzureFileVolumeSource azureFile;
        imports.k8s.CephFsVolumeSource cephfs;
        imports.k8s.CinderVolumeSource cinder;
        imports.k8s.ConfigMapVolumeSource configMap;
        imports.k8s.CsiVolumeSource csi;
        imports.k8s.DownwardApiVolumeSource downwardApi;
        imports.k8s.EmptyDirVolumeSource emptyDir;
        imports.k8s.EphemeralVolumeSource ephemeral;
        imports.k8s.FcVolumeSource fc;
        imports.k8s.FlexVolumeSource flexVolume;
        imports.k8s.FlockerVolumeSource flocker;
        imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk;
        imports.k8s.GitRepoVolumeSource gitRepo;
        imports.k8s.GlusterfsVolumeSource glusterfs;
        imports.k8s.HostPathVolumeSource hostPath;
        imports.k8s.IscsiVolumeSource iscsi;
        imports.k8s.NfsVolumeSource nfs;
        imports.k8s.PersistentVolumeClaimVolumeSource persistentVolumeClaim;
        imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        imports.k8s.PortworxVolumeSource portworxVolume;
        imports.k8s.ProjectedVolumeSource projected;
        imports.k8s.QuobyteVolumeSource quobyte;
        imports.k8s.RbdVolumeSource rbd;
        imports.k8s.ScaleIoVolumeSource scaleIo;
        imports.k8s.SecretVolumeSource secret;
        imports.k8s.StorageOsVolumeSource storageos;
        imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Sets the value of {@link Volume#getName}
         * @param name name of the volume. This parameter is required.
         *             Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getAwsElasticBlockStore}
         * @param awsElasticBlockStore awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                             More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getAzureDisk}
         * @param azureDisk azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureDisk(imports.k8s.AzureDiskVolumeSource azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getAzureFile}
         * @param azureFile azureFile represents an Azure File Service mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureFile(imports.k8s.AzureFileVolumeSource azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getCephfs}
         * @param cephfs cephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder cephfs(imports.k8s.CephFsVolumeSource cephfs) {
            this.cephfs = cephfs;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getCinder}
         * @param cinder cinder represents a cinder volume attached and mounted on kubelets host machine.
         *               More info: https://examples.k8s.io/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder cinder(imports.k8s.CinderVolumeSource cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getConfigMap}
         * @param configMap configMap represents a configMap that should populate this volume.
         * @return {@code this}
         */
        public Builder configMap(imports.k8s.ConfigMapVolumeSource configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getCsi}
         * @param csi csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
         * @return {@code this}
         */
        public Builder csi(imports.k8s.CsiVolumeSource csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getDownwardApi}
         * @param downwardApi downwardAPI represents downward API about the pod that should populate this volume.
         * @return {@code this}
         */
        public Builder downwardApi(imports.k8s.DownwardApiVolumeSource downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getEmptyDir}
         * @param emptyDir emptyDir represents a temporary directory that shares a pod's lifetime.
         *                 More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
         * @return {@code this}
         */
        public Builder emptyDir(imports.k8s.EmptyDirVolumeSource emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getEphemeral}
         * @param ephemeral ephemeral represents a volume that is handled by a cluster storage driver.
         *                  The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
         *                  <p>
         *                  Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
         *                  tracking are needed,
         *                  c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through
         *                  a PersistentVolumeClaim (see EphemeralVolumeSource for more
         *                  information on the connection between this volume type
         *                  and PersistentVolumeClaim).
         *                  <p>
         *                  Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
         *                  <p>
         *                  Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
         *                  <p>
         *                  A pod can use both types of ephemeral volumes and persistent volumes at the same time.
         * @return {@code this}
         */
        public Builder ephemeral(imports.k8s.EphemeralVolumeSource ephemeral) {
            this.ephemeral = ephemeral;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getFc}
         * @param fc fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
         * @return {@code this}
         */
        public Builder fc(imports.k8s.FcVolumeSource fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getFlexVolume}
         * @param flexVolume flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
         * @return {@code this}
         */
        public Builder flexVolume(imports.k8s.FlexVolumeSource flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getFlocker}
         * @param flocker flocker represents a Flocker volume attached to a kubelet's host machine.
         *                This depends on the Flocker control service being running
         * @return {@code this}
         */
        public Builder flocker(imports.k8s.FlockerVolumeSource flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getGcePersistentDisk}
         * @param gcePersistentDisk gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                          More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder gcePersistentDisk(imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getGitRepo}
         * @param gitRepo gitRepo represents a git repository at a particular revision.
         *                DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
         * @return {@code this}
         */
        public Builder gitRepo(imports.k8s.GitRepoVolumeSource gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getGlusterfs}
         * @param glusterfs glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
         *                  More info: https://examples.k8s.io/volumes/glusterfs/README.md
         * @return {@code this}
         */
        public Builder glusterfs(imports.k8s.GlusterfsVolumeSource glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getHostPath}
         * @param hostPath hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
         *                 This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * @return {@code this}
         */
        public Builder hostPath(imports.k8s.HostPathVolumeSource hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getIscsi}
         * @param iscsi iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *              More info: https://examples.k8s.io/volumes/iscsi/README.md
         * @return {@code this}
         */
        public Builder iscsi(imports.k8s.IscsiVolumeSource iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getNfs}
         * @param nfs nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
         * @return {@code this}
         */
        public Builder nfs(imports.k8s.NfsVolumeSource nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getPersistentVolumeClaim}
         * @param persistentVolumeClaim persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
         *                              More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
         * @return {@code this}
         */
        public Builder persistentVolumeClaim(imports.k8s.PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
            this.persistentVolumeClaim = persistentVolumeClaim;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getPhotonPersistentDisk}
         * @param photonPersistentDisk photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder photonPersistentDisk(imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getPortworxVolume}
         * @param portworxVolume portworxVolume represents a portworx volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder portworxVolume(imports.k8s.PortworxVolumeSource portworxVolume) {
            this.portworxVolume = portworxVolume;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getProjected}
         * @param projected projected items for all in one resources secrets, configmaps, and downward API.
         * @return {@code this}
         */
        public Builder projected(imports.k8s.ProjectedVolumeSource projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getQuobyte}
         * @param quobyte quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder quobyte(imports.k8s.QuobyteVolumeSource quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getRbd}
         * @param rbd rbd represents a Rados Block Device mount on the host that shares a pod's lifetime.
         *            More info: https://examples.k8s.io/volumes/rbd/README.md
         * @return {@code this}
         */
        public Builder rbd(imports.k8s.RbdVolumeSource rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getScaleIo}
         * @param scaleIo scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder scaleIo(imports.k8s.ScaleIoVolumeSource scaleIo) {
            this.scaleIo = scaleIo;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getSecret}
         * @param secret secret represents a secret that should populate this volume.
         *               More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
         * @return {@code this}
         */
        public Builder secret(imports.k8s.SecretVolumeSource secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getStorageos}
         * @param storageos storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder storageos(imports.k8s.StorageOsVolumeSource storageos) {
            this.storageos = storageos;
            return this;
        }

        /**
         * Sets the value of {@link Volume#getVsphereVolume}
         * @param vsphereVolume vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder vsphereVolume(imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Volume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Volume build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Volume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Volume {
        private final java.lang.String name;
        private final imports.k8s.AwsElasticBlockStoreVolumeSource awsElasticBlockStore;
        private final imports.k8s.AzureDiskVolumeSource azureDisk;
        private final imports.k8s.AzureFileVolumeSource azureFile;
        private final imports.k8s.CephFsVolumeSource cephfs;
        private final imports.k8s.CinderVolumeSource cinder;
        private final imports.k8s.ConfigMapVolumeSource configMap;
        private final imports.k8s.CsiVolumeSource csi;
        private final imports.k8s.DownwardApiVolumeSource downwardApi;
        private final imports.k8s.EmptyDirVolumeSource emptyDir;
        private final imports.k8s.EphemeralVolumeSource ephemeral;
        private final imports.k8s.FcVolumeSource fc;
        private final imports.k8s.FlexVolumeSource flexVolume;
        private final imports.k8s.FlockerVolumeSource flocker;
        private final imports.k8s.GcePersistentDiskVolumeSource gcePersistentDisk;
        private final imports.k8s.GitRepoVolumeSource gitRepo;
        private final imports.k8s.GlusterfsVolumeSource glusterfs;
        private final imports.k8s.HostPathVolumeSource hostPath;
        private final imports.k8s.IscsiVolumeSource iscsi;
        private final imports.k8s.NfsVolumeSource nfs;
        private final imports.k8s.PersistentVolumeClaimVolumeSource persistentVolumeClaim;
        private final imports.k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        private final imports.k8s.PortworxVolumeSource portworxVolume;
        private final imports.k8s.ProjectedVolumeSource projected;
        private final imports.k8s.QuobyteVolumeSource quobyte;
        private final imports.k8s.RbdVolumeSource rbd;
        private final imports.k8s.ScaleIoVolumeSource scaleIo;
        private final imports.k8s.SecretVolumeSource secret;
        private final imports.k8s.StorageOsVolumeSource storageos;
        private final imports.k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.awsElasticBlockStore = software.amazon.jsii.Kernel.get(this, "awsElasticBlockStore", software.amazon.jsii.NativeType.forClass(imports.k8s.AwsElasticBlockStoreVolumeSource.class));
            this.azureDisk = software.amazon.jsii.Kernel.get(this, "azureDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.AzureDiskVolumeSource.class));
            this.azureFile = software.amazon.jsii.Kernel.get(this, "azureFile", software.amazon.jsii.NativeType.forClass(imports.k8s.AzureFileVolumeSource.class));
            this.cephfs = software.amazon.jsii.Kernel.get(this, "cephfs", software.amazon.jsii.NativeType.forClass(imports.k8s.CephFsVolumeSource.class));
            this.cinder = software.amazon.jsii.Kernel.get(this, "cinder", software.amazon.jsii.NativeType.forClass(imports.k8s.CinderVolumeSource.class));
            this.configMap = software.amazon.jsii.Kernel.get(this, "configMap", software.amazon.jsii.NativeType.forClass(imports.k8s.ConfigMapVolumeSource.class));
            this.csi = software.amazon.jsii.Kernel.get(this, "csi", software.amazon.jsii.NativeType.forClass(imports.k8s.CsiVolumeSource.class));
            this.downwardApi = software.amazon.jsii.Kernel.get(this, "downwardApi", software.amazon.jsii.NativeType.forClass(imports.k8s.DownwardApiVolumeSource.class));
            this.emptyDir = software.amazon.jsii.Kernel.get(this, "emptyDir", software.amazon.jsii.NativeType.forClass(imports.k8s.EmptyDirVolumeSource.class));
            this.ephemeral = software.amazon.jsii.Kernel.get(this, "ephemeral", software.amazon.jsii.NativeType.forClass(imports.k8s.EphemeralVolumeSource.class));
            this.fc = software.amazon.jsii.Kernel.get(this, "fc", software.amazon.jsii.NativeType.forClass(imports.k8s.FcVolumeSource.class));
            this.flexVolume = software.amazon.jsii.Kernel.get(this, "flexVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.FlexVolumeSource.class));
            this.flocker = software.amazon.jsii.Kernel.get(this, "flocker", software.amazon.jsii.NativeType.forClass(imports.k8s.FlockerVolumeSource.class));
            this.gcePersistentDisk = software.amazon.jsii.Kernel.get(this, "gcePersistentDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.GcePersistentDiskVolumeSource.class));
            this.gitRepo = software.amazon.jsii.Kernel.get(this, "gitRepo", software.amazon.jsii.NativeType.forClass(imports.k8s.GitRepoVolumeSource.class));
            this.glusterfs = software.amazon.jsii.Kernel.get(this, "glusterfs", software.amazon.jsii.NativeType.forClass(imports.k8s.GlusterfsVolumeSource.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(imports.k8s.HostPathVolumeSource.class));
            this.iscsi = software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.k8s.IscsiVolumeSource.class));
            this.nfs = software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.k8s.NfsVolumeSource.class));
            this.persistentVolumeClaim = software.amazon.jsii.Kernel.get(this, "persistentVolumeClaim", software.amazon.jsii.NativeType.forClass(imports.k8s.PersistentVolumeClaimVolumeSource.class));
            this.photonPersistentDisk = software.amazon.jsii.Kernel.get(this, "photonPersistentDisk", software.amazon.jsii.NativeType.forClass(imports.k8s.PhotonPersistentDiskVolumeSource.class));
            this.portworxVolume = software.amazon.jsii.Kernel.get(this, "portworxVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.PortworxVolumeSource.class));
            this.projected = software.amazon.jsii.Kernel.get(this, "projected", software.amazon.jsii.NativeType.forClass(imports.k8s.ProjectedVolumeSource.class));
            this.quobyte = software.amazon.jsii.Kernel.get(this, "quobyte", software.amazon.jsii.NativeType.forClass(imports.k8s.QuobyteVolumeSource.class));
            this.rbd = software.amazon.jsii.Kernel.get(this, "rbd", software.amazon.jsii.NativeType.forClass(imports.k8s.RbdVolumeSource.class));
            this.scaleIo = software.amazon.jsii.Kernel.get(this, "scaleIo", software.amazon.jsii.NativeType.forClass(imports.k8s.ScaleIoVolumeSource.class));
            this.secret = software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretVolumeSource.class));
            this.storageos = software.amazon.jsii.Kernel.get(this, "storageos", software.amazon.jsii.NativeType.forClass(imports.k8s.StorageOsVolumeSource.class));
            this.vsphereVolume = software.amazon.jsii.Kernel.get(this, "vsphereVolume", software.amazon.jsii.NativeType.forClass(imports.k8s.VsphereVirtualDiskVolumeSource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.awsElasticBlockStore = builder.awsElasticBlockStore;
            this.azureDisk = builder.azureDisk;
            this.azureFile = builder.azureFile;
            this.cephfs = builder.cephfs;
            this.cinder = builder.cinder;
            this.configMap = builder.configMap;
            this.csi = builder.csi;
            this.downwardApi = builder.downwardApi;
            this.emptyDir = builder.emptyDir;
            this.ephemeral = builder.ephemeral;
            this.fc = builder.fc;
            this.flexVolume = builder.flexVolume;
            this.flocker = builder.flocker;
            this.gcePersistentDisk = builder.gcePersistentDisk;
            this.gitRepo = builder.gitRepo;
            this.glusterfs = builder.glusterfs;
            this.hostPath = builder.hostPath;
            this.iscsi = builder.iscsi;
            this.nfs = builder.nfs;
            this.persistentVolumeClaim = builder.persistentVolumeClaim;
            this.photonPersistentDisk = builder.photonPersistentDisk;
            this.portworxVolume = builder.portworxVolume;
            this.projected = builder.projected;
            this.quobyte = builder.quobyte;
            this.rbd = builder.rbd;
            this.scaleIo = builder.scaleIo;
            this.secret = builder.secret;
            this.storageos = builder.storageos;
            this.vsphereVolume = builder.vsphereVolume;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
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
        public final imports.k8s.AzureFileVolumeSource getAzureFile() {
            return this.azureFile;
        }

        @Override
        public final imports.k8s.CephFsVolumeSource getCephfs() {
            return this.cephfs;
        }

        @Override
        public final imports.k8s.CinderVolumeSource getCinder() {
            return this.cinder;
        }

        @Override
        public final imports.k8s.ConfigMapVolumeSource getConfigMap() {
            return this.configMap;
        }

        @Override
        public final imports.k8s.CsiVolumeSource getCsi() {
            return this.csi;
        }

        @Override
        public final imports.k8s.DownwardApiVolumeSource getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public final imports.k8s.EmptyDirVolumeSource getEmptyDir() {
            return this.emptyDir;
        }

        @Override
        public final imports.k8s.EphemeralVolumeSource getEphemeral() {
            return this.ephemeral;
        }

        @Override
        public final imports.k8s.FcVolumeSource getFc() {
            return this.fc;
        }

        @Override
        public final imports.k8s.FlexVolumeSource getFlexVolume() {
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
        public final imports.k8s.GitRepoVolumeSource getGitRepo() {
            return this.gitRepo;
        }

        @Override
        public final imports.k8s.GlusterfsVolumeSource getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public final imports.k8s.HostPathVolumeSource getHostPath() {
            return this.hostPath;
        }

        @Override
        public final imports.k8s.IscsiVolumeSource getIscsi() {
            return this.iscsi;
        }

        @Override
        public final imports.k8s.NfsVolumeSource getNfs() {
            return this.nfs;
        }

        @Override
        public final imports.k8s.PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
            return this.persistentVolumeClaim;
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
        public final imports.k8s.ProjectedVolumeSource getProjected() {
            return this.projected;
        }

        @Override
        public final imports.k8s.QuobyteVolumeSource getQuobyte() {
            return this.quobyte;
        }

        @Override
        public final imports.k8s.RbdVolumeSource getRbd() {
            return this.rbd;
        }

        @Override
        public final imports.k8s.ScaleIoVolumeSource getScaleIo() {
            return this.scaleIo;
        }

        @Override
        public final imports.k8s.SecretVolumeSource getSecret() {
            return this.secret;
        }

        @Override
        public final imports.k8s.StorageOsVolumeSource getStorageos() {
            return this.storageos;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getAwsElasticBlockStore() != null) {
                data.set("awsElasticBlockStore", om.valueToTree(this.getAwsElasticBlockStore()));
            }
            if (this.getAzureDisk() != null) {
                data.set("azureDisk", om.valueToTree(this.getAzureDisk()));
            }
            if (this.getAzureFile() != null) {
                data.set("azureFile", om.valueToTree(this.getAzureFile()));
            }
            if (this.getCephfs() != null) {
                data.set("cephfs", om.valueToTree(this.getCephfs()));
            }
            if (this.getCinder() != null) {
                data.set("cinder", om.valueToTree(this.getCinder()));
            }
            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }
            if (this.getCsi() != null) {
                data.set("csi", om.valueToTree(this.getCsi()));
            }
            if (this.getDownwardApi() != null) {
                data.set("downwardApi", om.valueToTree(this.getDownwardApi()));
            }
            if (this.getEmptyDir() != null) {
                data.set("emptyDir", om.valueToTree(this.getEmptyDir()));
            }
            if (this.getEphemeral() != null) {
                data.set("ephemeral", om.valueToTree(this.getEphemeral()));
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
            if (this.getGitRepo() != null) {
                data.set("gitRepo", om.valueToTree(this.getGitRepo()));
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
            if (this.getNfs() != null) {
                data.set("nfs", om.valueToTree(this.getNfs()));
            }
            if (this.getPersistentVolumeClaim() != null) {
                data.set("persistentVolumeClaim", om.valueToTree(this.getPersistentVolumeClaim()));
            }
            if (this.getPhotonPersistentDisk() != null) {
                data.set("photonPersistentDisk", om.valueToTree(this.getPhotonPersistentDisk()));
            }
            if (this.getPortworxVolume() != null) {
                data.set("portworxVolume", om.valueToTree(this.getPortworxVolume()));
            }
            if (this.getProjected() != null) {
                data.set("projected", om.valueToTree(this.getProjected()));
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
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getStorageos() != null) {
                data.set("storageos", om.valueToTree(this.getStorageos()));
            }
            if (this.getVsphereVolume() != null) {
                data.set("vsphereVolume", om.valueToTree(this.getVsphereVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Volume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Volume.Jsii$Proxy that = (Volume.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.awsElasticBlockStore != null ? !this.awsElasticBlockStore.equals(that.awsElasticBlockStore) : that.awsElasticBlockStore != null) return false;
            if (this.azureDisk != null ? !this.azureDisk.equals(that.azureDisk) : that.azureDisk != null) return false;
            if (this.azureFile != null ? !this.azureFile.equals(that.azureFile) : that.azureFile != null) return false;
            if (this.cephfs != null ? !this.cephfs.equals(that.cephfs) : that.cephfs != null) return false;
            if (this.cinder != null ? !this.cinder.equals(that.cinder) : that.cinder != null) return false;
            if (this.configMap != null ? !this.configMap.equals(that.configMap) : that.configMap != null) return false;
            if (this.csi != null ? !this.csi.equals(that.csi) : that.csi != null) return false;
            if (this.downwardApi != null ? !this.downwardApi.equals(that.downwardApi) : that.downwardApi != null) return false;
            if (this.emptyDir != null ? !this.emptyDir.equals(that.emptyDir) : that.emptyDir != null) return false;
            if (this.ephemeral != null ? !this.ephemeral.equals(that.ephemeral) : that.ephemeral != null) return false;
            if (this.fc != null ? !this.fc.equals(that.fc) : that.fc != null) return false;
            if (this.flexVolume != null ? !this.flexVolume.equals(that.flexVolume) : that.flexVolume != null) return false;
            if (this.flocker != null ? !this.flocker.equals(that.flocker) : that.flocker != null) return false;
            if (this.gcePersistentDisk != null ? !this.gcePersistentDisk.equals(that.gcePersistentDisk) : that.gcePersistentDisk != null) return false;
            if (this.gitRepo != null ? !this.gitRepo.equals(that.gitRepo) : that.gitRepo != null) return false;
            if (this.glusterfs != null ? !this.glusterfs.equals(that.glusterfs) : that.glusterfs != null) return false;
            if (this.hostPath != null ? !this.hostPath.equals(that.hostPath) : that.hostPath != null) return false;
            if (this.iscsi != null ? !this.iscsi.equals(that.iscsi) : that.iscsi != null) return false;
            if (this.nfs != null ? !this.nfs.equals(that.nfs) : that.nfs != null) return false;
            if (this.persistentVolumeClaim != null ? !this.persistentVolumeClaim.equals(that.persistentVolumeClaim) : that.persistentVolumeClaim != null) return false;
            if (this.photonPersistentDisk != null ? !this.photonPersistentDisk.equals(that.photonPersistentDisk) : that.photonPersistentDisk != null) return false;
            if (this.portworxVolume != null ? !this.portworxVolume.equals(that.portworxVolume) : that.portworxVolume != null) return false;
            if (this.projected != null ? !this.projected.equals(that.projected) : that.projected != null) return false;
            if (this.quobyte != null ? !this.quobyte.equals(that.quobyte) : that.quobyte != null) return false;
            if (this.rbd != null ? !this.rbd.equals(that.rbd) : that.rbd != null) return false;
            if (this.scaleIo != null ? !this.scaleIo.equals(that.scaleIo) : that.scaleIo != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            if (this.storageos != null ? !this.storageos.equals(that.storageos) : that.storageos != null) return false;
            return this.vsphereVolume != null ? this.vsphereVolume.equals(that.vsphereVolume) : that.vsphereVolume == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.awsElasticBlockStore != null ? this.awsElasticBlockStore.hashCode() : 0);
            result = 31 * result + (this.azureDisk != null ? this.azureDisk.hashCode() : 0);
            result = 31 * result + (this.azureFile != null ? this.azureFile.hashCode() : 0);
            result = 31 * result + (this.cephfs != null ? this.cephfs.hashCode() : 0);
            result = 31 * result + (this.cinder != null ? this.cinder.hashCode() : 0);
            result = 31 * result + (this.configMap != null ? this.configMap.hashCode() : 0);
            result = 31 * result + (this.csi != null ? this.csi.hashCode() : 0);
            result = 31 * result + (this.downwardApi != null ? this.downwardApi.hashCode() : 0);
            result = 31 * result + (this.emptyDir != null ? this.emptyDir.hashCode() : 0);
            result = 31 * result + (this.ephemeral != null ? this.ephemeral.hashCode() : 0);
            result = 31 * result + (this.fc != null ? this.fc.hashCode() : 0);
            result = 31 * result + (this.flexVolume != null ? this.flexVolume.hashCode() : 0);
            result = 31 * result + (this.flocker != null ? this.flocker.hashCode() : 0);
            result = 31 * result + (this.gcePersistentDisk != null ? this.gcePersistentDisk.hashCode() : 0);
            result = 31 * result + (this.gitRepo != null ? this.gitRepo.hashCode() : 0);
            result = 31 * result + (this.glusterfs != null ? this.glusterfs.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            result = 31 * result + (this.iscsi != null ? this.iscsi.hashCode() : 0);
            result = 31 * result + (this.nfs != null ? this.nfs.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeClaim != null ? this.persistentVolumeClaim.hashCode() : 0);
            result = 31 * result + (this.photonPersistentDisk != null ? this.photonPersistentDisk.hashCode() : 0);
            result = 31 * result + (this.portworxVolume != null ? this.portworxVolume.hashCode() : 0);
            result = 31 * result + (this.projected != null ? this.projected.hashCode() : 0);
            result = 31 * result + (this.quobyte != null ? this.quobyte.hashCode() : 0);
            result = 31 * result + (this.rbd != null ? this.rbd.hashCode() : 0);
            result = 31 * result + (this.scaleIo != null ? this.scaleIo.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.storageos != null ? this.storageos.hashCode() : 0);
            result = 31 * result + (this.vsphereVolume != null ? this.vsphereVolume.hashCode() : 0);
            return result;
        }
    }
}
