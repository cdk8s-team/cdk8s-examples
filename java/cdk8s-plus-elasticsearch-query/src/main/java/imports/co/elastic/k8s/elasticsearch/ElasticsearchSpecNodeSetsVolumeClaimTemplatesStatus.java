package imports.co.elastic.k8s.elasticsearch;

/**
 * Status represents the current information/status of a persistent volume claim.
 * <p>
 * Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.060Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus.Jsii$Proxy.class)
public interface ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus extends software.amazon.jsii.JsiiSerializable {

    /**
     * AccessModes contains the actual access modes the volume backing the PVC has.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessModes() {
        return null;
    }

    /**
     * Represents the actual resources of the underlying volume.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity> getCapacity() {
        return null;
    }

    /**
     * Current Condition of persistent volume claim.
     * <p>
     * If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions> getConditions() {
        return null;
    }

    /**
     * Phase represents the current phase of PersistentVolumeClaim.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPhase() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus> {
        java.util.List<java.lang.String> accessModes;
        java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity> capacity;
        java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions> conditions;
        java.lang.String phase;

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#getAccessModes}
         * @param accessModes AccessModes contains the actual access modes the volume backing the PVC has.
         *                    More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#getCapacity}
         * @param capacity Represents the actual resources of the underlying volume.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder capacity(java.util.Map<java.lang.String, ? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity> capacity) {
            this.capacity = (java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity>)capacity;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#getConditions}
         * @param conditions Current Condition of persistent volume claim.
         *                   If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder conditions(java.util.List<? extends imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions> conditions) {
            this.conditions = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions>)conditions;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#getPhase}
         * @param phase Phase represents the current phase of PersistentVolumeClaim.
         * @return {@code this}
         */
        public Builder phase(java.lang.String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus {
        private final java.util.List<java.lang.String> accessModes;
        private final java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity> capacity;
        private final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions> conditions;
        private final java.lang.String phase;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = software.amazon.jsii.Kernel.get(this, "accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.capacity = software.amazon.jsii.Kernel.get(this, "capacity", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity.class)));
            this.conditions = software.amazon.jsii.Kernel.get(this, "conditions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions.class)));
            this.phase = software.amazon.jsii.Kernel.get(this, "phase", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessModes = builder.accessModes;
            this.capacity = (java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity>)builder.capacity;
            this.conditions = (java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions>)builder.conditions;
            this.phase = builder.phase;
        }

        @Override
        public final java.util.List<java.lang.String> getAccessModes() {
            return this.accessModes;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity> getCapacity() {
            return this.capacity;
        }

        @Override
        public final java.util.List<imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions> getConditions() {
            return this.conditions;
        }

        @Override
        public final java.lang.String getPhase() {
            return this.phase;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessModes() != null) {
                data.set("accessModes", om.valueToTree(this.getAccessModes()));
            }
            if (this.getCapacity() != null) {
                data.set("capacity", om.valueToTree(this.getCapacity()));
            }
            if (this.getConditions() != null) {
                data.set("conditions", om.valueToTree(this.getConditions()));
            }
            if (this.getPhase() != null) {
                data.set("phase", om.valueToTree(this.getPhase()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus.Jsii$Proxy that = (ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus.Jsii$Proxy) o;

            if (this.accessModes != null ? !this.accessModes.equals(that.accessModes) : that.accessModes != null) return false;
            if (this.capacity != null ? !this.capacity.equals(that.capacity) : that.capacity != null) return false;
            if (this.conditions != null ? !this.conditions.equals(that.conditions) : that.conditions != null) return false;
            return this.phase != null ? this.phase.equals(that.phase) : that.phase == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessModes != null ? this.accessModes.hashCode() : 0;
            result = 31 * result + (this.capacity != null ? this.capacity.hashCode() : 0);
            result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
            result = 31 * result + (this.phase != null ? this.phase.hashCode() : 0);
            return result;
        }
    }
}
