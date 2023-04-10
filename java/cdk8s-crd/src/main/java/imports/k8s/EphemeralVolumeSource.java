package imports.k8s;

/**
 * Represents an ephemeral volume that is handled by a normal storage driver.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.843Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EphemeralVolumeSource")
@software.amazon.jsii.Jsii.Proxy(EphemeralVolumeSource.Jsii$Proxy.class)
public interface EphemeralVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Will be used to create a stand-alone PVC to provision the volume.
     * <p>
     * The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be <code>&lt;pod name&gt;-&lt;volume name&gt;</code> where <code>&lt;volume name&gt;</code> is the name from the <code>PodSpec.Volumes</code> array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).
     * <p>
     * An existing PVC with that name that is not owned by the pod will <em>not</em> be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.
     * <p>
     * This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.
     * <p>
     * Required, must not be nil.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EphemeralVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EphemeralVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EphemeralVolumeSource> {
        imports.k8s.PersistentVolumeClaimTemplate volumeClaimTemplate;

        /**
         * Sets the value of {@link EphemeralVolumeSource#getVolumeClaimTemplate}
         * @param volumeClaimTemplate Will be used to create a stand-alone PVC to provision the volume.
         *                            The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be <code>&lt;pod name&gt;-&lt;volume name&gt;</code> where <code>&lt;volume name&gt;</code> is the name from the <code>PodSpec.Volumes</code> array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).
         *                            <p>
         *                            An existing PVC with that name that is not owned by the pod will <em>not</em> be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.
         *                            <p>
         *                            This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.
         *                            <p>
         *                            Required, must not be nil.
         * @return {@code this}
         */
        public Builder volumeClaimTemplate(imports.k8s.PersistentVolumeClaimTemplate volumeClaimTemplate) {
            this.volumeClaimTemplate = volumeClaimTemplate;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EphemeralVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EphemeralVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EphemeralVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EphemeralVolumeSource {
        private final imports.k8s.PersistentVolumeClaimTemplate volumeClaimTemplate;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumeClaimTemplate = software.amazon.jsii.Kernel.get(this, "volumeClaimTemplate", software.amazon.jsii.NativeType.forClass(imports.k8s.PersistentVolumeClaimTemplate.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumeClaimTemplate = builder.volumeClaimTemplate;
        }

        @Override
        public final imports.k8s.PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
            return this.volumeClaimTemplate;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getVolumeClaimTemplate() != null) {
                data.set("volumeClaimTemplate", om.valueToTree(this.getVolumeClaimTemplate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EphemeralVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EphemeralVolumeSource.Jsii$Proxy that = (EphemeralVolumeSource.Jsii$Proxy) o;

            return this.volumeClaimTemplate != null ? this.volumeClaimTemplate.equals(that.volumeClaimTemplate) : that.volumeClaimTemplate == null;
        }

        @Override
        public final int hashCode() {
            int result = this.volumeClaimTemplate != null ? this.volumeClaimTemplate.hashCode() : 0;
            return result;
        }
    }
}
