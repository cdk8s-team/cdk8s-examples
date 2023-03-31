package imports.k8s;

/**
 * LeaseSpec is a specification of a Lease.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.917Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.LeaseSpec")
@software.amazon.jsii.Jsii.Proxy(LeaseSpec.Jsii$Proxy.class)
public interface LeaseSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * acquireTime is a time when the current lease was acquired.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getAcquireTime() {
        return null;
    }

    /**
     * holderIdentity contains the identity of the holder of a current lease.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHolderIdentity() {
        return null;
    }

    /**
     * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it.
     * <p>
     * This is measure against time of last observed RenewTime.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLeaseDurationSeconds() {
        return null;
    }

    /**
     * leaseTransitions is the number of transitions of a lease between holders.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLeaseTransitions() {
        return null;
    }

    /**
     * renewTime is a time when the current holder of a lease has last updated the lease.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getRenewTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LeaseSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LeaseSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LeaseSpec> {
        java.time.Instant acquireTime;
        java.lang.String holderIdentity;
        java.lang.Number leaseDurationSeconds;
        java.lang.Number leaseTransitions;
        java.time.Instant renewTime;

        /**
         * Sets the value of {@link LeaseSpec#getAcquireTime}
         * @param acquireTime acquireTime is a time when the current lease was acquired.
         * @return {@code this}
         */
        public Builder acquireTime(java.time.Instant acquireTime) {
            this.acquireTime = acquireTime;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getHolderIdentity}
         * @param holderIdentity holderIdentity contains the identity of the holder of a current lease.
         * @return {@code this}
         */
        public Builder holderIdentity(java.lang.String holderIdentity) {
            this.holderIdentity = holderIdentity;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getLeaseDurationSeconds}
         * @param leaseDurationSeconds leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it.
         *                             This is measure against time of last observed RenewTime.
         * @return {@code this}
         */
        public Builder leaseDurationSeconds(java.lang.Number leaseDurationSeconds) {
            this.leaseDurationSeconds = leaseDurationSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getLeaseTransitions}
         * @param leaseTransitions leaseTransitions is the number of transitions of a lease between holders.
         * @return {@code this}
         */
        public Builder leaseTransitions(java.lang.Number leaseTransitions) {
            this.leaseTransitions = leaseTransitions;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getRenewTime}
         * @param renewTime renewTime is a time when the current holder of a lease has last updated the lease.
         * @return {@code this}
         */
        public Builder renewTime(java.time.Instant renewTime) {
            this.renewTime = renewTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LeaseSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LeaseSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LeaseSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LeaseSpec {
        private final java.time.Instant acquireTime;
        private final java.lang.String holderIdentity;
        private final java.lang.Number leaseDurationSeconds;
        private final java.lang.Number leaseTransitions;
        private final java.time.Instant renewTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.acquireTime = software.amazon.jsii.Kernel.get(this, "acquireTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.holderIdentity = software.amazon.jsii.Kernel.get(this, "holderIdentity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.leaseDurationSeconds = software.amazon.jsii.Kernel.get(this, "leaseDurationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.leaseTransitions = software.amazon.jsii.Kernel.get(this, "leaseTransitions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.renewTime = software.amazon.jsii.Kernel.get(this, "renewTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.acquireTime = builder.acquireTime;
            this.holderIdentity = builder.holderIdentity;
            this.leaseDurationSeconds = builder.leaseDurationSeconds;
            this.leaseTransitions = builder.leaseTransitions;
            this.renewTime = builder.renewTime;
        }

        @Override
        public final java.time.Instant getAcquireTime() {
            return this.acquireTime;
        }

        @Override
        public final java.lang.String getHolderIdentity() {
            return this.holderIdentity;
        }

        @Override
        public final java.lang.Number getLeaseDurationSeconds() {
            return this.leaseDurationSeconds;
        }

        @Override
        public final java.lang.Number getLeaseTransitions() {
            return this.leaseTransitions;
        }

        @Override
        public final java.time.Instant getRenewTime() {
            return this.renewTime;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAcquireTime() != null) {
                data.set("acquireTime", om.valueToTree(this.getAcquireTime()));
            }
            if (this.getHolderIdentity() != null) {
                data.set("holderIdentity", om.valueToTree(this.getHolderIdentity()));
            }
            if (this.getLeaseDurationSeconds() != null) {
                data.set("leaseDurationSeconds", om.valueToTree(this.getLeaseDurationSeconds()));
            }
            if (this.getLeaseTransitions() != null) {
                data.set("leaseTransitions", om.valueToTree(this.getLeaseTransitions()));
            }
            if (this.getRenewTime() != null) {
                data.set("renewTime", om.valueToTree(this.getRenewTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LeaseSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LeaseSpec.Jsii$Proxy that = (LeaseSpec.Jsii$Proxy) o;

            if (this.acquireTime != null ? !this.acquireTime.equals(that.acquireTime) : that.acquireTime != null) return false;
            if (this.holderIdentity != null ? !this.holderIdentity.equals(that.holderIdentity) : that.holderIdentity != null) return false;
            if (this.leaseDurationSeconds != null ? !this.leaseDurationSeconds.equals(that.leaseDurationSeconds) : that.leaseDurationSeconds != null) return false;
            if (this.leaseTransitions != null ? !this.leaseTransitions.equals(that.leaseTransitions) : that.leaseTransitions != null) return false;
            return this.renewTime != null ? this.renewTime.equals(that.renewTime) : that.renewTime == null;
        }

        @Override
        public final int hashCode() {
            int result = this.acquireTime != null ? this.acquireTime.hashCode() : 0;
            result = 31 * result + (this.holderIdentity != null ? this.holderIdentity.hashCode() : 0);
            result = 31 * result + (this.leaseDurationSeconds != null ? this.leaseDurationSeconds.hashCode() : 0);
            result = 31 * result + (this.leaseTransitions != null ? this.leaseTransitions.hashCode() : 0);
            result = 31 * result + (this.renewTime != null ? this.renewTime.hashCode() : 0);
            return result;
        }
    }
}
