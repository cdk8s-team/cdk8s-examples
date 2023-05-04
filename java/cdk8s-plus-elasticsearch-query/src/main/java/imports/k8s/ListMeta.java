package imports.k8s;

/**
 * ListMeta describes metadata that synthetic resources must have, including lists and various status objects.
 * <p>
 * A resource may have only one of {ObjectMeta, ListMeta}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.862Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ListMeta")
@software.amazon.jsii.Jsii.Proxy(ListMeta.Jsii$Proxy.class)
public interface ListMeta extends software.amazon.jsii.JsiiSerializable {

    /**
     * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available.
     * <p>
     * The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContinueValue() {
        return null;
    }

    /**
     * remainingItemCount is the number of subsequent items in the list which are not included in this list response.
     * <p>
     * If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is <em>estimating</em> the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRemainingItemCount() {
        return null;
    }

    /**
     * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed.
     * <p>
     * Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceVersion() {
        return null;
    }

    /**
     * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelfLink() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ListMeta}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ListMeta}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ListMeta> {
        java.lang.String continueValue;
        java.lang.Number remainingItemCount;
        java.lang.String resourceVersion;
        java.lang.String selfLink;

        /**
         * Sets the value of {@link ListMeta#getContinueValue}
         * @param continueValue continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available.
         *                      The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
         * @return {@code this}
         */
        public Builder continueValue(java.lang.String continueValue) {
            this.continueValue = continueValue;
            return this;
        }

        /**
         * Sets the value of {@link ListMeta#getRemainingItemCount}
         * @param remainingItemCount remainingItemCount is the number of subsequent items in the list which are not included in this list response.
         *                           If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is <em>estimating</em> the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
         * @return {@code this}
         */
        public Builder remainingItemCount(java.lang.Number remainingItemCount) {
            this.remainingItemCount = remainingItemCount;
            return this;
        }

        /**
         * Sets the value of {@link ListMeta#getResourceVersion}
         * @param resourceVersion String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed.
         *                        Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
         * @return {@code this}
         */
        public Builder resourceVersion(java.lang.String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Sets the value of {@link ListMeta#getSelfLink}
         * @param selfLink Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
         * @return {@code this}
         */
        public Builder selfLink(java.lang.String selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ListMeta}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ListMeta build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ListMeta}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ListMeta {
        private final java.lang.String continueValue;
        private final java.lang.Number remainingItemCount;
        private final java.lang.String resourceVersion;
        private final java.lang.String selfLink;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.continueValue = software.amazon.jsii.Kernel.get(this, "continue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.remainingItemCount = software.amazon.jsii.Kernel.get(this, "remainingItemCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.resourceVersion = software.amazon.jsii.Kernel.get(this, "resourceVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.selfLink = software.amazon.jsii.Kernel.get(this, "selfLink", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.continueValue = builder.continueValue;
            this.remainingItemCount = builder.remainingItemCount;
            this.resourceVersion = builder.resourceVersion;
            this.selfLink = builder.selfLink;
        }

        @Override
        public final java.lang.String getContinueValue() {
            return this.continueValue;
        }

        @Override
        public final java.lang.Number getRemainingItemCount() {
            return this.remainingItemCount;
        }

        @Override
        public final java.lang.String getResourceVersion() {
            return this.resourceVersion;
        }

        @Override
        public final java.lang.String getSelfLink() {
            return this.selfLink;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getContinueValue() != null) {
                data.set("continue", om.valueToTree(this.getContinueValue()));
            }
            if (this.getRemainingItemCount() != null) {
                data.set("remainingItemCount", om.valueToTree(this.getRemainingItemCount()));
            }
            if (this.getResourceVersion() != null) {
                data.set("resourceVersion", om.valueToTree(this.getResourceVersion()));
            }
            if (this.getSelfLink() != null) {
                data.set("selfLink", om.valueToTree(this.getSelfLink()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ListMeta"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ListMeta.Jsii$Proxy that = (ListMeta.Jsii$Proxy) o;

            if (this.continueValue != null ? !this.continueValue.equals(that.continueValue) : that.continueValue != null) return false;
            if (this.remainingItemCount != null ? !this.remainingItemCount.equals(that.remainingItemCount) : that.remainingItemCount != null) return false;
            if (this.resourceVersion != null ? !this.resourceVersion.equals(that.resourceVersion) : that.resourceVersion != null) return false;
            return this.selfLink != null ? this.selfLink.equals(that.selfLink) : that.selfLink == null;
        }

        @Override
        public final int hashCode() {
            int result = this.continueValue != null ? this.continueValue.hashCode() : 0;
            result = 31 * result + (this.remainingItemCount != null ? this.remainingItemCount.hashCode() : 0);
            result = 31 * result + (this.resourceVersion != null ? this.resourceVersion.hashCode() : 0);
            result = 31 * result + (this.selfLink != null ? this.selfLink.hashCode() : 0);
            return result;
        }
    }
}
