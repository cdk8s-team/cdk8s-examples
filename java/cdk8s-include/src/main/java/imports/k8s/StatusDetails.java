package imports.k8s;

/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response.
 * <p>
 * The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.952Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StatusDetails")
@software.amazon.jsii.Jsii.Proxy(StatusDetails.Jsii$Proxy.class)
public interface StatusDetails extends software.amazon.jsii.JsiiSerializable {

    /**
     * The Causes array includes more details associated with the StatusReason failure.
     * <p>
     * Not all StatusReasons may provide detailed causes.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.StatusCause> getCauses() {
        return null;
    }

    /**
     * The group attribute of the resource associated with the status StatusReason.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * The kind attribute of the resource associated with the status StatusReason.
     * <p>
     * On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * If specified, the time in seconds before the operation should be retried.
     * <p>
     * Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRetryAfterSeconds() {
        return null;
    }

    /**
     * UID of the resource.
     * <p>
     * (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatusDetails}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatusDetails}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatusDetails> {
        java.util.List<imports.k8s.StatusCause> causes;
        java.lang.String group;
        java.lang.String kind;
        java.lang.String name;
        java.lang.Number retryAfterSeconds;
        java.lang.String uid;

        /**
         * Sets the value of {@link StatusDetails#getCauses}
         * @param causes The Causes array includes more details associated with the StatusReason failure.
         *               Not all StatusReasons may provide detailed causes.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder causes(java.util.List<? extends imports.k8s.StatusCause> causes) {
            this.causes = (java.util.List<imports.k8s.StatusCause>)causes;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getGroup}
         * @param group The group attribute of the resource associated with the status StatusReason.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getKind}
         * @param kind The kind attribute of the resource associated with the status StatusReason.
         *             On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getName}
         * @param name The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getRetryAfterSeconds}
         * @param retryAfterSeconds If specified, the time in seconds before the operation should be retried.
         *                          Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
         * @return {@code this}
         */
        public Builder retryAfterSeconds(java.lang.Number retryAfterSeconds) {
            this.retryAfterSeconds = retryAfterSeconds;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getUid}
         * @param uid UID of the resource.
         *            (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatusDetails}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatusDetails build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatusDetails}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatusDetails {
        private final java.util.List<imports.k8s.StatusCause> causes;
        private final java.lang.String group;
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.Number retryAfterSeconds;
        private final java.lang.String uid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.causes = software.amazon.jsii.Kernel.get(this, "causes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.StatusCause.class)));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.retryAfterSeconds = software.amazon.jsii.Kernel.get(this, "retryAfterSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.uid = software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.causes = (java.util.List<imports.k8s.StatusCause>)builder.causes;
            this.group = builder.group;
            this.kind = builder.kind;
            this.name = builder.name;
            this.retryAfterSeconds = builder.retryAfterSeconds;
            this.uid = builder.uid;
        }

        @Override
        public final java.util.List<imports.k8s.StatusCause> getCauses() {
            return this.causes;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getRetryAfterSeconds() {
            return this.retryAfterSeconds;
        }

        @Override
        public final java.lang.String getUid() {
            return this.uid;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCauses() != null) {
                data.set("causes", om.valueToTree(this.getCauses()));
            }
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getRetryAfterSeconds() != null) {
                data.set("retryAfterSeconds", om.valueToTree(this.getRetryAfterSeconds()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatusDetails"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatusDetails.Jsii$Proxy that = (StatusDetails.Jsii$Proxy) o;

            if (this.causes != null ? !this.causes.equals(that.causes) : that.causes != null) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.retryAfterSeconds != null ? !this.retryAfterSeconds.equals(that.retryAfterSeconds) : that.retryAfterSeconds != null) return false;
            return this.uid != null ? this.uid.equals(that.uid) : that.uid == null;
        }

        @Override
        public final int hashCode() {
            int result = this.causes != null ? this.causes.hashCode() : 0;
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.retryAfterSeconds != null ? this.retryAfterSeconds.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            return result;
        }
    }
}
