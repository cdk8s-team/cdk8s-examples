package imports.k8s;

/**
 * Represents a Quobyte mount that lasts the lifetime of a pod.
 * <p>
 * Quobyte volumes do not support ownership management or SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.891Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.QuobyteVolumeSource")
@software.amazon.jsii.Jsii.Proxy(QuobyteVolumeSource.Jsii$Proxy.class)
public interface QuobyteVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRegistry();

    /**
     * volume is a string that references an already created Quobyte volume by name.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolume();

    /**
     * group to map volume access to Default is no group.
     * <p>
     * Default: no group
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * readOnly here will force the Quobyte volume to be mounted with read-only permissions.
     * <p>
     * Defaults to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTenant() {
        return null;
    }

    /**
     * user to map volume access to Defaults to serivceaccount user.
     * <p>
     * Default: serivceaccount user
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link QuobyteVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link QuobyteVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<QuobyteVolumeSource> {
        java.lang.String registry;
        java.lang.String volume;
        java.lang.String group;
        java.lang.Boolean readOnly;
        java.lang.String tenant;
        java.lang.String user;

        /**
         * Sets the value of {@link QuobyteVolumeSource#getRegistry}
         * @param registry registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes. This parameter is required.
         * @return {@code this}
         */
        public Builder registry(java.lang.String registry) {
            this.registry = registry;
            return this;
        }

        /**
         * Sets the value of {@link QuobyteVolumeSource#getVolume}
         * @param volume volume is a string that references an already created Quobyte volume by name. This parameter is required.
         * @return {@code this}
         */
        public Builder volume(java.lang.String volume) {
            this.volume = volume;
            return this;
        }

        /**
         * Sets the value of {@link QuobyteVolumeSource#getGroup}
         * @param group group to map volume access to Default is no group.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link QuobyteVolumeSource#getReadOnly}
         * @param readOnly readOnly here will force the Quobyte volume to be mounted with read-only permissions.
         *                 Defaults to false.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link QuobyteVolumeSource#getTenant}
         * @param tenant tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin.
         * @return {@code this}
         */
        public Builder tenant(java.lang.String tenant) {
            this.tenant = tenant;
            return this;
        }

        /**
         * Sets the value of {@link QuobyteVolumeSource#getUser}
         * @param user user to map volume access to Defaults to serivceaccount user.
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link QuobyteVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public QuobyteVolumeSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link QuobyteVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements QuobyteVolumeSource {
        private final java.lang.String registry;
        private final java.lang.String volume;
        private final java.lang.String group;
        private final java.lang.Boolean readOnly;
        private final java.lang.String tenant;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.registry = software.amazon.jsii.Kernel.get(this, "registry", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volume = software.amazon.jsii.Kernel.get(this, "volume", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tenant = software.amazon.jsii.Kernel.get(this, "tenant", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.user = software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.registry = java.util.Objects.requireNonNull(builder.registry, "registry is required");
            this.volume = java.util.Objects.requireNonNull(builder.volume, "volume is required");
            this.group = builder.group;
            this.readOnly = builder.readOnly;
            this.tenant = builder.tenant;
            this.user = builder.user;
        }

        @Override
        public final java.lang.String getRegistry() {
            return this.registry;
        }

        @Override
        public final java.lang.String getVolume() {
            return this.volume;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final java.lang.String getTenant() {
            return this.tenant;
        }

        @Override
        public final java.lang.String getUser() {
            return this.user;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("registry", om.valueToTree(this.getRegistry()));
            data.set("volume", om.valueToTree(this.getVolume()));
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getTenant() != null) {
                data.set("tenant", om.valueToTree(this.getTenant()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.QuobyteVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            QuobyteVolumeSource.Jsii$Proxy that = (QuobyteVolumeSource.Jsii$Proxy) o;

            if (!registry.equals(that.registry)) return false;
            if (!volume.equals(that.volume)) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.tenant != null ? !this.tenant.equals(that.tenant) : that.tenant != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public final int hashCode() {
            int result = this.registry.hashCode();
            result = 31 * result + (this.volume.hashCode());
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.tenant != null ? this.tenant.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
