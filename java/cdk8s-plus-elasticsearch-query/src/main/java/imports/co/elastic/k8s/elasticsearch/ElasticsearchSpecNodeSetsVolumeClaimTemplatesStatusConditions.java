package imports.co.elastic.k8s.elasticsearch;

/**
 * PersistentVolumeClaimCondition contails details about state of pvc.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.061Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions.Jsii$Proxy.class)
public interface ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStatus();

    /**
     * PersistentVolumeClaimConditionType is a valid value of PersistentVolumeClaimCondition.Type.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Last time we probed the condition.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getLastProbeTime() {
        return null;
    }

    /**
     * Last time the condition transitioned from one status to another.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getLastTransitionTime() {
        return null;
    }

    /**
     * Human-readable message indicating details about last transition.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * Unique, this should be a short, machine understandable string that gives the reason for condition's last transition.
     * <p>
     * If it reports "ResizeStarted" that means the underlying persistent volume is being resized.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions> {
        java.lang.String status;
        java.lang.String type;
        java.time.Instant lastProbeTime;
        java.time.Instant lastTransitionTime;
        java.lang.String message;
        java.lang.String reason;

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#getStatus}
         * @param status the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#getType}
         * @param type PersistentVolumeClaimConditionType is a valid value of PersistentVolumeClaimCondition.Type. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#getLastProbeTime}
         * @param lastProbeTime Last time we probed the condition.
         * @return {@code this}
         */
        public Builder lastProbeTime(java.time.Instant lastProbeTime) {
            this.lastProbeTime = lastProbeTime;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#getLastTransitionTime}
         * @param lastTransitionTime Last time the condition transitioned from one status to another.
         * @return {@code this}
         */
        public Builder lastTransitionTime(java.time.Instant lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#getMessage}
         * @param message Human-readable message indicating details about last transition.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#getReason}
         * @param reason Unique, this should be a short, machine understandable string that gives the reason for condition's last transition.
         *               If it reports "ResizeStarted" that means the underlying persistent volume is being resized.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions {
        private final java.lang.String status;
        private final java.lang.String type;
        private final java.time.Instant lastProbeTime;
        private final java.time.Instant lastTransitionTime;
        private final java.lang.String message;
        private final java.lang.String reason;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lastProbeTime = software.amazon.jsii.Kernel.get(this, "lastProbeTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.lastTransitionTime = software.amazon.jsii.Kernel.get(this, "lastTransitionTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reason = software.amazon.jsii.Kernel.get(this, "reason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.status = java.util.Objects.requireNonNull(builder.status, "status is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.lastProbeTime = builder.lastProbeTime;
            this.lastTransitionTime = builder.lastTransitionTime;
            this.message = builder.message;
            this.reason = builder.reason;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.time.Instant getLastProbeTime() {
            return this.lastProbeTime;
        }

        @Override
        public final java.time.Instant getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("status", om.valueToTree(this.getStatus()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getLastProbeTime() != null) {
                data.set("lastProbeTime", om.valueToTree(this.getLastProbeTime()));
            }
            if (this.getLastTransitionTime() != null) {
                data.set("lastTransitionTime", om.valueToTree(this.getLastTransitionTime()));
            }
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions.Jsii$Proxy that = (ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions.Jsii$Proxy) o;

            if (!status.equals(that.status)) return false;
            if (!type.equals(that.type)) return false;
            if (this.lastProbeTime != null ? !this.lastProbeTime.equals(that.lastProbeTime) : that.lastProbeTime != null) return false;
            if (this.lastTransitionTime != null ? !this.lastTransitionTime.equals(that.lastTransitionTime) : that.lastTransitionTime != null) return false;
            if (this.message != null ? !this.message.equals(that.message) : that.message != null) return false;
            return this.reason != null ? this.reason.equals(that.reason) : that.reason == null;
        }

        @Override
        public final int hashCode() {
            int result = this.status.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.lastProbeTime != null ? this.lastProbeTime.hashCode() : 0);
            result = 31 * result + (this.lastTransitionTime != null ? this.lastTransitionTime.hashCode() : 0);
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            return result;
        }
    }
}
