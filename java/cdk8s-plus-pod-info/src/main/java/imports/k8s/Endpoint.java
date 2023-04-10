package imports.k8s;

/**
 * Endpoint represents a single logical "backend" implementing a service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.837Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Endpoint")
@software.amazon.jsii.Jsii.Proxy(Endpoint.Jsii$Proxy.class)
public interface Endpoint extends software.amazon.jsii.JsiiSerializable {

    /**
     * addresses of this endpoint.
     * <p>
     * The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAddresses();

    /**
     * conditions contains information about the current status of the endpoint.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EndpointConditions getConditions() {
        return null;
    }

    /**
     * deprecatedTopology contains topology information part of the v1beta1 API.
     * <p>
     * This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDeprecatedTopology() {
        return null;
    }

    /**
     * hints contains information associated with how an endpoint should be consumed.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EndpointHints getHints() {
        return null;
    }

    /**
     * hostname of this endpoint.
     * <p>
     * This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostname() {
        return null;
    }

    /**
     * nodeName represents the name of the Node hosting this endpoint.
     * <p>
     * This can be used to determine endpoints local to a Node.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeName() {
        return null;
    }

    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectReference getTargetRef() {
        return null;
    }

    /**
     * zone is the name of the Zone this endpoint exists in.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getZone() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Endpoint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Endpoint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Endpoint> {
        java.util.List<java.lang.String> addresses;
        imports.k8s.EndpointConditions conditions;
        java.util.Map<java.lang.String, java.lang.String> deprecatedTopology;
        imports.k8s.EndpointHints hints;
        java.lang.String hostname;
        java.lang.String nodeName;
        imports.k8s.ObjectReference targetRef;
        java.lang.String zone;

        /**
         * Sets the value of {@link Endpoint#getAddresses}
         * @param addresses addresses of this endpoint. This parameter is required.
         *                  The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
         * @return {@code this}
         */
        public Builder addresses(java.util.List<java.lang.String> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getConditions}
         * @param conditions conditions contains information about the current status of the endpoint.
         * @return {@code this}
         */
        public Builder conditions(imports.k8s.EndpointConditions conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getDeprecatedTopology}
         * @param deprecatedTopology deprecatedTopology contains topology information part of the v1beta1 API.
         *                           This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
         * @return {@code this}
         */
        public Builder deprecatedTopology(java.util.Map<java.lang.String, java.lang.String> deprecatedTopology) {
            this.deprecatedTopology = deprecatedTopology;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getHints}
         * @param hints hints contains information associated with how an endpoint should be consumed.
         * @return {@code this}
         */
        public Builder hints(imports.k8s.EndpointHints hints) {
            this.hints = hints;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getHostname}
         * @param hostname hostname of this endpoint.
         *                 This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getNodeName}
         * @param nodeName nodeName represents the name of the Node hosting this endpoint.
         *                 This can be used to determine endpoints local to a Node.
         * @return {@code this}
         */
        public Builder nodeName(java.lang.String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getTargetRef}
         * @param targetRef targetRef is a reference to a Kubernetes object that represents this endpoint.
         * @return {@code this}
         */
        public Builder targetRef(imports.k8s.ObjectReference targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getZone}
         * @param zone zone is the name of the Zone this endpoint exists in.
         * @return {@code this}
         */
        public Builder zone(java.lang.String zone) {
            this.zone = zone;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Endpoint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Endpoint build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Endpoint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Endpoint {
        private final java.util.List<java.lang.String> addresses;
        private final imports.k8s.EndpointConditions conditions;
        private final java.util.Map<java.lang.String, java.lang.String> deprecatedTopology;
        private final imports.k8s.EndpointHints hints;
        private final java.lang.String hostname;
        private final java.lang.String nodeName;
        private final imports.k8s.ObjectReference targetRef;
        private final java.lang.String zone;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.addresses = software.amazon.jsii.Kernel.get(this, "addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.conditions = software.amazon.jsii.Kernel.get(this, "conditions", software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointConditions.class));
            this.deprecatedTopology = software.amazon.jsii.Kernel.get(this, "deprecatedTopology", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.hints = software.amazon.jsii.Kernel.get(this, "hints", software.amazon.jsii.NativeType.forClass(imports.k8s.EndpointHints.class));
            this.hostname = software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeName = software.amazon.jsii.Kernel.get(this, "nodeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.targetRef = software.amazon.jsii.Kernel.get(this, "targetRef", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class));
            this.zone = software.amazon.jsii.Kernel.get(this, "zone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.addresses = java.util.Objects.requireNonNull(builder.addresses, "addresses is required");
            this.conditions = builder.conditions;
            this.deprecatedTopology = builder.deprecatedTopology;
            this.hints = builder.hints;
            this.hostname = builder.hostname;
            this.nodeName = builder.nodeName;
            this.targetRef = builder.targetRef;
            this.zone = builder.zone;
        }

        @Override
        public final java.util.List<java.lang.String> getAddresses() {
            return this.addresses;
        }

        @Override
        public final imports.k8s.EndpointConditions getConditions() {
            return this.conditions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getDeprecatedTopology() {
            return this.deprecatedTopology;
        }

        @Override
        public final imports.k8s.EndpointHints getHints() {
            return this.hints;
        }

        @Override
        public final java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public final java.lang.String getNodeName() {
            return this.nodeName;
        }

        @Override
        public final imports.k8s.ObjectReference getTargetRef() {
            return this.targetRef;
        }

        @Override
        public final java.lang.String getZone() {
            return this.zone;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("addresses", om.valueToTree(this.getAddresses()));
            if (this.getConditions() != null) {
                data.set("conditions", om.valueToTree(this.getConditions()));
            }
            if (this.getDeprecatedTopology() != null) {
                data.set("deprecatedTopology", om.valueToTree(this.getDeprecatedTopology()));
            }
            if (this.getHints() != null) {
                data.set("hints", om.valueToTree(this.getHints()));
            }
            if (this.getHostname() != null) {
                data.set("hostname", om.valueToTree(this.getHostname()));
            }
            if (this.getNodeName() != null) {
                data.set("nodeName", om.valueToTree(this.getNodeName()));
            }
            if (this.getTargetRef() != null) {
                data.set("targetRef", om.valueToTree(this.getTargetRef()));
            }
            if (this.getZone() != null) {
                data.set("zone", om.valueToTree(this.getZone()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Endpoint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Endpoint.Jsii$Proxy that = (Endpoint.Jsii$Proxy) o;

            if (!addresses.equals(that.addresses)) return false;
            if (this.conditions != null ? !this.conditions.equals(that.conditions) : that.conditions != null) return false;
            if (this.deprecatedTopology != null ? !this.deprecatedTopology.equals(that.deprecatedTopology) : that.deprecatedTopology != null) return false;
            if (this.hints != null ? !this.hints.equals(that.hints) : that.hints != null) return false;
            if (this.hostname != null ? !this.hostname.equals(that.hostname) : that.hostname != null) return false;
            if (this.nodeName != null ? !this.nodeName.equals(that.nodeName) : that.nodeName != null) return false;
            if (this.targetRef != null ? !this.targetRef.equals(that.targetRef) : that.targetRef != null) return false;
            return this.zone != null ? this.zone.equals(that.zone) : that.zone == null;
        }

        @Override
        public final int hashCode() {
            int result = this.addresses.hashCode();
            result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
            result = 31 * result + (this.deprecatedTopology != null ? this.deprecatedTopology.hashCode() : 0);
            result = 31 * result + (this.hints != null ? this.hints.hashCode() : 0);
            result = 31 * result + (this.hostname != null ? this.hostname.hashCode() : 0);
            result = 31 * result + (this.nodeName != null ? this.nodeName.hashCode() : 0);
            result = 31 * result + (this.targetRef != null ? this.targetRef.hashCode() : 0);
            result = 31 * result + (this.zone != null ? this.zone.hashCode() : 0);
            return result;
        }
    }
}
