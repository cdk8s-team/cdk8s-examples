package imports.k8s;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.863Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ManagedFieldsEntry")
@software.amazon.jsii.Jsii.Proxy(ManagedFieldsEntry.Jsii$Proxy.class)
public interface ManagedFieldsEntry extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIVersion defines the version of this resource that this field set applies to.
     * <p>
     * The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * FieldsType is the discriminator for the different fields format and version.
     * <p>
     * There is currently only one possible value: "FieldsV1"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFieldsType() {
        return null;
    }

    /**
     * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFieldsV1() {
        return null;
    }

    /**
     * Manager is an identifier of the workflow managing these fields.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getManager() {
        return null;
    }

    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created.
     * <p>
     * The only valid values for this field are 'Apply' and 'Update'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOperation() {
        return null;
    }

    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource.
     * <p>
     * The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubresource() {
        return null;
    }

    /**
     * Time is the timestamp of when the ManagedFields entry was added.
     * <p>
     * The timestamp will also be updated if a field is added, the manager changes any of the owned fields value or removes a field. The timestamp does not update when a field is removed from the entry because another manager took it over.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ManagedFieldsEntry}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ManagedFieldsEntry}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ManagedFieldsEntry> {
        java.lang.String apiVersion;
        java.lang.String fieldsType;
        java.lang.Object fieldsV1;
        java.lang.String manager;
        java.lang.String operation;
        java.lang.String subresource;
        java.time.Instant time;

        /**
         * Sets the value of {@link ManagedFieldsEntry#getApiVersion}
         * @param apiVersion APIVersion defines the version of this resource that this field set applies to.
         *                   The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getFieldsType}
         * @param fieldsType FieldsType is the discriminator for the different fields format and version.
         *                   There is currently only one possible value: "FieldsV1"
         * @return {@code this}
         */
        public Builder fieldsType(java.lang.String fieldsType) {
            this.fieldsType = fieldsType;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getFieldsV1}
         * @param fieldsV1 FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
         * @return {@code this}
         */
        public Builder fieldsV1(java.lang.Object fieldsV1) {
            this.fieldsV1 = fieldsV1;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getManager}
         * @param manager Manager is an identifier of the workflow managing these fields.
         * @return {@code this}
         */
        public Builder manager(java.lang.String manager) {
            this.manager = manager;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getOperation}
         * @param operation Operation is the type of operation which lead to this ManagedFieldsEntry being created.
         *                  The only valid values for this field are 'Apply' and 'Update'.
         * @return {@code this}
         */
        public Builder operation(java.lang.String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getSubresource}
         * @param subresource Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource.
         *                    The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
         * @return {@code this}
         */
        public Builder subresource(java.lang.String subresource) {
            this.subresource = subresource;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getTime}
         * @param time Time is the timestamp of when the ManagedFields entry was added.
         *             The timestamp will also be updated if a field is added, the manager changes any of the owned fields value or removes a field. The timestamp does not update when a field is removed from the entry because another manager took it over.
         * @return {@code this}
         */
        public Builder time(java.time.Instant time) {
            this.time = time;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ManagedFieldsEntry}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ManagedFieldsEntry build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ManagedFieldsEntry}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ManagedFieldsEntry {
        private final java.lang.String apiVersion;
        private final java.lang.String fieldsType;
        private final java.lang.Object fieldsV1;
        private final java.lang.String manager;
        private final java.lang.String operation;
        private final java.lang.String subresource;
        private final java.time.Instant time;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldsType = software.amazon.jsii.Kernel.get(this, "fieldsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldsV1 = software.amazon.jsii.Kernel.get(this, "fieldsV1", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.manager = software.amazon.jsii.Kernel.get(this, "manager", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operation = software.amazon.jsii.Kernel.get(this, "operation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subresource = software.amazon.jsii.Kernel.get(this, "subresource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.time = software.amazon.jsii.Kernel.get(this, "time", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = builder.apiVersion;
            this.fieldsType = builder.fieldsType;
            this.fieldsV1 = builder.fieldsV1;
            this.manager = builder.manager;
            this.operation = builder.operation;
            this.subresource = builder.subresource;
            this.time = builder.time;
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public final java.lang.String getFieldsType() {
            return this.fieldsType;
        }

        @Override
        public final java.lang.Object getFieldsV1() {
            return this.fieldsV1;
        }

        @Override
        public final java.lang.String getManager() {
            return this.manager;
        }

        @Override
        public final java.lang.String getOperation() {
            return this.operation;
        }

        @Override
        public final java.lang.String getSubresource() {
            return this.subresource;
        }

        @Override
        public final java.time.Instant getTime() {
            return this.time;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getFieldsType() != null) {
                data.set("fieldsType", om.valueToTree(this.getFieldsType()));
            }
            if (this.getFieldsV1() != null) {
                data.set("fieldsV1", om.valueToTree(this.getFieldsV1()));
            }
            if (this.getManager() != null) {
                data.set("manager", om.valueToTree(this.getManager()));
            }
            if (this.getOperation() != null) {
                data.set("operation", om.valueToTree(this.getOperation()));
            }
            if (this.getSubresource() != null) {
                data.set("subresource", om.valueToTree(this.getSubresource()));
            }
            if (this.getTime() != null) {
                data.set("time", om.valueToTree(this.getTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ManagedFieldsEntry"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ManagedFieldsEntry.Jsii$Proxy that = (ManagedFieldsEntry.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            if (this.fieldsType != null ? !this.fieldsType.equals(that.fieldsType) : that.fieldsType != null) return false;
            if (this.fieldsV1 != null ? !this.fieldsV1.equals(that.fieldsV1) : that.fieldsV1 != null) return false;
            if (this.manager != null ? !this.manager.equals(that.manager) : that.manager != null) return false;
            if (this.operation != null ? !this.operation.equals(that.operation) : that.operation != null) return false;
            if (this.subresource != null ? !this.subresource.equals(that.subresource) : that.subresource != null) return false;
            return this.time != null ? this.time.equals(that.time) : that.time == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.fieldsType != null ? this.fieldsType.hashCode() : 0);
            result = 31 * result + (this.fieldsV1 != null ? this.fieldsV1.hashCode() : 0);
            result = 31 * result + (this.manager != null ? this.manager.hashCode() : 0);
            result = 31 * result + (this.operation != null ? this.operation.hashCode() : 0);
            result = 31 * result + (this.subresource != null ? this.subresource.hashCode() : 0);
            result = 31 * result + (this.time != null ? this.time.hashCode() : 0);
            return result;
        }
    }
}
