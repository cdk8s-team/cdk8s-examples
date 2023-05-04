package imports.k8s;

/**
 * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.942Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StatefulSetPersistentVolumeClaimRetentionPolicy")
@software.amazon.jsii.Jsii.Proxy(StatefulSetPersistentVolumeClaimRetentionPolicy.Jsii$Proxy.class)
public interface StatefulSetPersistentVolumeClaimRetentionPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted.
     * <p>
     * The default policy of <code>Retain</code> causes PVCs to not be affected by StatefulSet deletion. The <code>Delete</code> policy causes those PVCs to be deleted.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWhenDeleted() {
        return null;
    }

    /**
     * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down.
     * <p>
     * The default policy of <code>Retain</code> causes PVCs to not be affected by a scaledown. The <code>Delete</code> policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWhenScaled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetPersistentVolumeClaimRetentionPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetPersistentVolumeClaimRetentionPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetPersistentVolumeClaimRetentionPolicy> {
        java.lang.String whenDeleted;
        java.lang.String whenScaled;

        /**
         * Sets the value of {@link StatefulSetPersistentVolumeClaimRetentionPolicy#getWhenDeleted}
         * @param whenDeleted WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted.
         *                    The default policy of <code>Retain</code> causes PVCs to not be affected by StatefulSet deletion. The <code>Delete</code> policy causes those PVCs to be deleted.
         * @return {@code this}
         */
        public Builder whenDeleted(java.lang.String whenDeleted) {
            this.whenDeleted = whenDeleted;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetPersistentVolumeClaimRetentionPolicy#getWhenScaled}
         * @param whenScaled WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down.
         *                   The default policy of <code>Retain</code> causes PVCs to not be affected by a scaledown. The <code>Delete</code> policy causes the associated PVCs for any excess pods above the replica count to be deleted.
         * @return {@code this}
         */
        public Builder whenScaled(java.lang.String whenScaled) {
            this.whenScaled = whenScaled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetPersistentVolumeClaimRetentionPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetPersistentVolumeClaimRetentionPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetPersistentVolumeClaimRetentionPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetPersistentVolumeClaimRetentionPolicy {
        private final java.lang.String whenDeleted;
        private final java.lang.String whenScaled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.whenDeleted = software.amazon.jsii.Kernel.get(this, "whenDeleted", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.whenScaled = software.amazon.jsii.Kernel.get(this, "whenScaled", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.whenDeleted = builder.whenDeleted;
            this.whenScaled = builder.whenScaled;
        }

        @Override
        public final java.lang.String getWhenDeleted() {
            return this.whenDeleted;
        }

        @Override
        public final java.lang.String getWhenScaled() {
            return this.whenScaled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getWhenDeleted() != null) {
                data.set("whenDeleted", om.valueToTree(this.getWhenDeleted()));
            }
            if (this.getWhenScaled() != null) {
                data.set("whenScaled", om.valueToTree(this.getWhenScaled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatefulSetPersistentVolumeClaimRetentionPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetPersistentVolumeClaimRetentionPolicy.Jsii$Proxy that = (StatefulSetPersistentVolumeClaimRetentionPolicy.Jsii$Proxy) o;

            if (this.whenDeleted != null ? !this.whenDeleted.equals(that.whenDeleted) : that.whenDeleted != null) return false;
            return this.whenScaled != null ? this.whenScaled.equals(that.whenScaled) : that.whenScaled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.whenDeleted != null ? this.whenDeleted.hashCode() : 0;
            result = 31 * result + (this.whenScaled != null ? this.whenScaled.hashCode() : 0);
            return result;
        }
    }
}
