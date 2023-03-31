package imports.k8s;

/**
 * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.835Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DaemonSetUpdateStrategy")
@software.amazon.jsii.Jsii.Proxy(DaemonSetUpdateStrategy.Jsii$Proxy.class)
public interface DaemonSetUpdateStrategy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Rolling update config params.
     * <p>
     * Present only if type = "RollingUpdate".
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.RollingUpdateDaemonSet getRollingUpdate() {
        return null;
    }

    /**
     * Type of daemon set update.
     * <p>
     * Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
     * <p>
     * Default: RollingUpdate.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetUpdateStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetUpdateStrategy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DaemonSetUpdateStrategy> {
        imports.k8s.RollingUpdateDaemonSet rollingUpdate;
        java.lang.String type;

        /**
         * Sets the value of {@link DaemonSetUpdateStrategy#getRollingUpdate}
         * @param rollingUpdate Rolling update config params.
         *                      Present only if type = "RollingUpdate".
         * @return {@code this}
         */
        public Builder rollingUpdate(imports.k8s.RollingUpdateDaemonSet rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetUpdateStrategy#getType}
         * @param type Type of daemon set update.
         *             Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetUpdateStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DaemonSetUpdateStrategy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DaemonSetUpdateStrategy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetUpdateStrategy {
        private final imports.k8s.RollingUpdateDaemonSet rollingUpdate;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rollingUpdate = software.amazon.jsii.Kernel.get(this, "rollingUpdate", software.amazon.jsii.NativeType.forClass(imports.k8s.RollingUpdateDaemonSet.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rollingUpdate = builder.rollingUpdate;
            this.type = builder.type;
        }

        @Override
        public final imports.k8s.RollingUpdateDaemonSet getRollingUpdate() {
            return this.rollingUpdate;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRollingUpdate() != null) {
                data.set("rollingUpdate", om.valueToTree(this.getRollingUpdate()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DaemonSetUpdateStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetUpdateStrategy.Jsii$Proxy that = (DaemonSetUpdateStrategy.Jsii$Proxy) o;

            if (this.rollingUpdate != null ? !this.rollingUpdate.equals(that.rollingUpdate) : that.rollingUpdate != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rollingUpdate != null ? this.rollingUpdate.hashCode() : 0;
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
