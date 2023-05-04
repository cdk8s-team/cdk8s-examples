package imports.k8s;

/**
 * EndpointSlice represents a subset of the endpoints that implement a service.
 * <p>
 * For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.807Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEndpointSlice")
public class KubeEndpointSlice extends org.cdk8s.ApiObject {

    protected KubeEndpointSlice(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeEndpointSlice(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeEndpointSlice.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.discovery.v1.EndpointSlice" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeEndpointSlice(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeEndpointSliceProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.discovery.v1.EndpointSlice".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeEndpointSliceProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeEndpointSlice.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.discovery.v1.EndpointSlice".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeEndpointSlice}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeEndpointSlice> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param id a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.k8s.KubeEndpointSliceProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeEndpointSliceProps.Builder();
        }

        /**
         * addressType specifies the type of address carried by this EndpointSlice.
         * <p>
         * All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
         * <p>
         * @return {@code this}
         * @param addressType addressType specifies the type of address carried by this EndpointSlice. This parameter is required.
         */
        public Builder addressType(final java.lang.String addressType) {
            this.props.addressType(addressType);
            return this;
        }

        /**
         * endpoints is a list of unique endpoints in this slice.
         * <p>
         * Each slice may include a maximum of 1000 endpoints.
         * <p>
         * @return {@code this}
         * @param endpoints endpoints is a list of unique endpoints in this slice. This parameter is required.
         */
        public Builder endpoints(final java.util.List<? extends imports.k8s.Endpoint> endpoints) {
            this.props.endpoints(endpoints);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * ports specifies the list of network ports exposed by each endpoint in this slice.
         * <p>
         * Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
         * <p>
         * @return {@code this}
         * @param ports ports specifies the list of network ports exposed by each endpoint in this slice. This parameter is required.
         */
        public Builder ports(final java.util.List<? extends imports.k8s.EndpointPort> ports) {
            this.props.ports(ports);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeEndpointSlice}.
         */
        @Override
        public imports.k8s.KubeEndpointSlice build() {
            return new imports.k8s.KubeEndpointSlice(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
