package imports.k8s;

/**
 * ServiceSpec describes the attributes that a user creates on a service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.941Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ServiceSpec")
@software.amazon.jsii.Jsii.Proxy(ServiceSpec.Jsii$Proxy.class)
public interface ServiceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.
     * <p>
     * Default is "true". It may be set to "false" if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type.
     * <p>
     * Default: true". It may be set to "false" if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllocateLoadBalancerNodePorts() {
        return null;
    }

    /**
     * clusterIP is the IP address of the service and is usually assigned randomly.
     * <p>
     * If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are "None", empty string (""), or a valid IP address. Setting this to "None" makes a "headless service" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClusterIp() {
        return null;
    }

    /**
     * ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly.
     * <p>
     * If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be empty) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are "None", empty string (""), or a valid IP address.  Setting this to "None" makes a "headless service" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName.  If this field is not specified, it will be initialized from the clusterIP field.  If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same value.
     * <p>
     * This field may hold a maximum of two entries (dual-stack IPs, in either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClusterIPs() {
        return null;
    }

    /**
     * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.
     * <p>
     * These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExternalIPs() {
        return null;
    }

    /**
     * externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). No proxying will be involved.  Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires `type` to be "ExternalName".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalName() {
        return null;
    }

    /**
     * externalTrafficPolicy describes how nodes distribute service traffic they receive on one of the Service's "externally-facing" addresses (NodePorts, ExternalIPs, and LoadBalancer IPs).
     * <p>
     * If set to "Local", the proxy will configure the service in a way that assumes that external load balancers will take care of balancing the service traffic between nodes, and so each node will deliver traffic only to the node-local endpoints of the service, without masquerading the client source IP. (Traffic mistakenly sent to a node with no endpoints will be dropped.) The default value, "Cluster", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features). Note that traffic sent to an External IP or LoadBalancer IP from within the cluster will always get "Cluster" semantics, but clients sending to a NodePort from within the cluster may need to take traffic policy into account when picking a node.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalTrafficPolicy() {
        return null;
    }

    /**
     * healthCheckNodePort specifies the healthcheck nodePort for the service.
     * <p>
     * This only applies when type is set to LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will be used.  If not specified, a value will be automatically allocated.  External systems (e.g. load-balancers) can use this port to determine if a given node holds endpoints for this service or not.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type). This field cannot be updated once set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckNodePort() {
        return null;
    }

    /**
     * InternalTrafficPolicy describes how nodes distribute service traffic they receive on the ClusterIP.
     * <p>
     * If set to "Local", the proxy will assume that pods only want to talk to endpoints of the service on the same node as the pod, dropping the traffic if there are no local endpoints. The default value, "Cluster", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInternalTrafficPolicy() {
        return null;
    }

    /**
     * IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are "IPv4" and "IPv6".  This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to "headless" services. This field will be wiped when updating a Service to type ExternalName.
     * <p>
     * This field may hold a maximum of two entries (dual-stack families, in either order).  These families must correspond to the values of the clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpFamilies() {
        return null;
    }

    /**
     * IPFamilyPolicy represents the dual-stack-ness requested or required by this Service.
     * <p>
     * If there is no value provided, then this field will be set to SingleStack. Services can be "SingleStack" (a single IP family), "PreferDualStack" (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or "RequireDualStack" (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to type ExternalName.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIpFamilyPolicy() {
        return null;
    }

    /**
     * loadBalancerClass is the class of the load balancer implementation this Service belongs to.
     * <p>
     * If specified, the value of this field must be a label-style identifier, with an optional prefix, e.g. "internal-vip" or "example.com/internal-vip". Unprefixed names are reserved for end-users. This field can only be set when the Service type is 'LoadBalancer'. If not set, the default load balancer implementation is used, today this is typically done through the cloud provider integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should ignore Services that set this field. This field can only be set when creating or updating a Service to type 'LoadBalancer'. Once set, it can not be changed. This field will be wiped when a service is updated to a non 'LoadBalancer' type.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerClass() {
        return null;
    }

    /**
     * Only applies to Service Type: LoadBalancer.
     * <p>
     * This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature. Deprecated: This field was under-specified and its meaning varies across implementations, and it cannot support dual-stack. As of Kubernetes v1.24, users are encouraged to use implementation-specific annotations when available. This field may be removed in a future API version.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerIp() {
        return null;
    }

    /**
     * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
     * <p>
     * This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
        return null;
    }

    /**
     * The list of ports that are exposed by this service.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ServicePort> getPorts() {
        return null;
    }

    /**
     * publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready.
     * <p>
     * The primary use case for setting this field is for a StatefulSet's Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered "ready" even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPublishNotReadyAddresses() {
        return null;
    }

    /**
     * Route service traffic to pods with label keys and values matching this selector.
     * <p>
     * If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSelector() {
        return null;
    }

    /**
     * Supports "ClientIP" and "None".
     * <p>
     * Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     * <p>
     * Default: None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSessionAffinity() {
        return null;
    }

    /**
     * sessionAffinityConfig contains the configurations of session affinity.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SessionAffinityConfig getSessionAffinityConfig() {
        return null;
    }

    /**
     * type determines how the Service is exposed.
     * <p>
     * Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. "ExternalName" aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
     * <p>
     * Default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. "ExternalName" aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceSpec> {
        java.lang.Boolean allocateLoadBalancerNodePorts;
        java.lang.String clusterIp;
        java.util.List<java.lang.String> clusterIPs;
        java.util.List<java.lang.String> externalIPs;
        java.lang.String externalName;
        java.lang.String externalTrafficPolicy;
        java.lang.Number healthCheckNodePort;
        java.lang.String internalTrafficPolicy;
        java.util.List<java.lang.String> ipFamilies;
        java.lang.String ipFamilyPolicy;
        java.lang.String loadBalancerClass;
        java.lang.String loadBalancerIp;
        java.util.List<java.lang.String> loadBalancerSourceRanges;
        java.util.List<imports.k8s.ServicePort> ports;
        java.lang.Boolean publishNotReadyAddresses;
        java.util.Map<java.lang.String, java.lang.String> selector;
        java.lang.String sessionAffinity;
        imports.k8s.SessionAffinityConfig sessionAffinityConfig;
        java.lang.String type;

        /**
         * Sets the value of {@link ServiceSpec#getAllocateLoadBalancerNodePorts}
         * @param allocateLoadBalancerNodePorts allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.
         *                                      Default is "true". It may be set to "false" if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type.
         * @return {@code this}
         */
        public Builder allocateLoadBalancerNodePorts(java.lang.Boolean allocateLoadBalancerNodePorts) {
            this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getClusterIp}
         * @param clusterIp clusterIP is the IP address of the service and is usually assigned randomly.
         *                  If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are "None", empty string (""), or a valid IP address. Setting this to "None" makes a "headless service" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        public Builder clusterIp(java.lang.String clusterIp) {
            this.clusterIp = clusterIp;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getClusterIPs}
         * @param clusterIPs ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly.
         *                   If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be empty) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are "None", empty string (""), or a valid IP address.  Setting this to "None" makes a "headless service" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName.  If this field is not specified, it will be initialized from the clusterIP field.  If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same value.
         *                   <p>
         *                   This field may hold a maximum of two entries (dual-stack IPs, in either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        public Builder clusterIPs(java.util.List<java.lang.String> clusterIPs) {
            this.clusterIPs = clusterIPs;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalIPs}
         * @param externalIPs externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.
         *                    These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
         * @return {@code this}
         */
        public Builder externalIPs(java.util.List<java.lang.String> externalIPs) {
            this.externalIPs = externalIPs;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalName}
         * @param externalName externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). No proxying will be involved.  Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires `type` to be "ExternalName".
         * @return {@code this}
         */
        public Builder externalName(java.lang.String externalName) {
            this.externalName = externalName;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalTrafficPolicy}
         * @param externalTrafficPolicy externalTrafficPolicy describes how nodes distribute service traffic they receive on one of the Service's "externally-facing" addresses (NodePorts, ExternalIPs, and LoadBalancer IPs).
         *                              If set to "Local", the proxy will configure the service in a way that assumes that external load balancers will take care of balancing the service traffic between nodes, and so each node will deliver traffic only to the node-local endpoints of the service, without masquerading the client source IP. (Traffic mistakenly sent to a node with no endpoints will be dropped.) The default value, "Cluster", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features). Note that traffic sent to an External IP or LoadBalancer IP from within the cluster will always get "Cluster" semantics, but clients sending to a NodePort from within the cluster may need to take traffic policy into account when picking a node.
         * @return {@code this}
         */
        public Builder externalTrafficPolicy(java.lang.String externalTrafficPolicy) {
            this.externalTrafficPolicy = externalTrafficPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getHealthCheckNodePort}
         * @param healthCheckNodePort healthCheckNodePort specifies the healthcheck nodePort for the service.
         *                            This only applies when type is set to LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will be used.  If not specified, a value will be automatically allocated.  External systems (e.g. load-balancers) can use this port to determine if a given node holds endpoints for this service or not.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type). This field cannot be updated once set.
         * @return {@code this}
         */
        public Builder healthCheckNodePort(java.lang.Number healthCheckNodePort) {
            this.healthCheckNodePort = healthCheckNodePort;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getInternalTrafficPolicy}
         * @param internalTrafficPolicy InternalTrafficPolicy describes how nodes distribute service traffic they receive on the ClusterIP.
         *                              If set to "Local", the proxy will assume that pods only want to talk to endpoints of the service on the same node as the pod, dropping the traffic if there are no local endpoints. The default value, "Cluster", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features).
         * @return {@code this}
         */
        public Builder internalTrafficPolicy(java.lang.String internalTrafficPolicy) {
            this.internalTrafficPolicy = internalTrafficPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getIpFamilies}
         * @param ipFamilies IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are "IPv4" and "IPv6".  This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to "headless" services. This field will be wiped when updating a Service to type ExternalName.
         *                   This field may hold a maximum of two entries (dual-stack families, in either order).  These families must correspond to the values of the clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field.
         * @return {@code this}
         */
        public Builder ipFamilies(java.util.List<java.lang.String> ipFamilies) {
            this.ipFamilies = ipFamilies;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getIpFamilyPolicy}
         * @param ipFamilyPolicy IPFamilyPolicy represents the dual-stack-ness requested or required by this Service.
         *                       If there is no value provided, then this field will be set to SingleStack. Services can be "SingleStack" (a single IP family), "PreferDualStack" (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or "RequireDualStack" (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to type ExternalName.
         * @return {@code this}
         */
        public Builder ipFamilyPolicy(java.lang.String ipFamilyPolicy) {
            this.ipFamilyPolicy = ipFamilyPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerClass}
         * @param loadBalancerClass loadBalancerClass is the class of the load balancer implementation this Service belongs to.
         *                          If specified, the value of this field must be a label-style identifier, with an optional prefix, e.g. "internal-vip" or "example.com/internal-vip". Unprefixed names are reserved for end-users. This field can only be set when the Service type is 'LoadBalancer'. If not set, the default load balancer implementation is used, today this is typically done through the cloud provider integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should ignore Services that set this field. This field can only be set when creating or updating a Service to type 'LoadBalancer'. Once set, it can not be changed. This field will be wiped when a service is updated to a non 'LoadBalancer' type.
         * @return {@code this}
         */
        public Builder loadBalancerClass(java.lang.String loadBalancerClass) {
            this.loadBalancerClass = loadBalancerClass;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerIp}
         * @param loadBalancerIp Only applies to Service Type: LoadBalancer.
         *                       This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature. Deprecated: This field was under-specified and its meaning varies across implementations, and it cannot support dual-stack. As of Kubernetes v1.24, users are encouraged to use implementation-specific annotations when available. This field may be removed in a future API version.
         * @return {@code this}
         */
        public Builder loadBalancerIp(java.lang.String loadBalancerIp) {
            this.loadBalancerIp = loadBalancerIp;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerSourceRanges}
         * @param loadBalancerSourceRanges If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
         *                                 This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/
         * @return {@code this}
         */
        public Builder loadBalancerSourceRanges(java.util.List<java.lang.String> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPorts}
         * @param ports The list of ports that are exposed by this service.
         *              More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ports(java.util.List<? extends imports.k8s.ServicePort> ports) {
            this.ports = (java.util.List<imports.k8s.ServicePort>)ports;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPublishNotReadyAddresses}
         * @param publishNotReadyAddresses publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready.
         *                                 The primary use case for setting this field is for a StatefulSet's Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered "ready" even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.
         * @return {@code this}
         */
        public Builder publishNotReadyAddresses(java.lang.Boolean publishNotReadyAddresses) {
            this.publishNotReadyAddresses = publishNotReadyAddresses;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSelector}
         * @param selector Route service traffic to pods with label keys and values matching this selector.
         *                 If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
         * @return {@code this}
         */
        public Builder selector(java.util.Map<java.lang.String, java.lang.String> selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSessionAffinity}
         * @param sessionAffinity Supports "ClientIP" and "None".
         *                        Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        public Builder sessionAffinity(java.lang.String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSessionAffinityConfig}
         * @param sessionAffinityConfig sessionAffinityConfig contains the configurations of session affinity.
         * @return {@code this}
         */
        public Builder sessionAffinityConfig(imports.k8s.SessionAffinityConfig sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getType}
         * @param type type determines how the Service is exposed.
         *             Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. "ExternalName" aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceSpec {
        private final java.lang.Boolean allocateLoadBalancerNodePorts;
        private final java.lang.String clusterIp;
        private final java.util.List<java.lang.String> clusterIPs;
        private final java.util.List<java.lang.String> externalIPs;
        private final java.lang.String externalName;
        private final java.lang.String externalTrafficPolicy;
        private final java.lang.Number healthCheckNodePort;
        private final java.lang.String internalTrafficPolicy;
        private final java.util.List<java.lang.String> ipFamilies;
        private final java.lang.String ipFamilyPolicy;
        private final java.lang.String loadBalancerClass;
        private final java.lang.String loadBalancerIp;
        private final java.util.List<java.lang.String> loadBalancerSourceRanges;
        private final java.util.List<imports.k8s.ServicePort> ports;
        private final java.lang.Boolean publishNotReadyAddresses;
        private final java.util.Map<java.lang.String, java.lang.String> selector;
        private final java.lang.String sessionAffinity;
        private final imports.k8s.SessionAffinityConfig sessionAffinityConfig;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allocateLoadBalancerNodePorts = software.amazon.jsii.Kernel.get(this, "allocateLoadBalancerNodePorts", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.clusterIp = software.amazon.jsii.Kernel.get(this, "clusterIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clusterIPs = software.amazon.jsii.Kernel.get(this, "clusterIPs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.externalIPs = software.amazon.jsii.Kernel.get(this, "externalIPs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.externalName = software.amazon.jsii.Kernel.get(this, "externalName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.externalTrafficPolicy = software.amazon.jsii.Kernel.get(this, "externalTrafficPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.healthCheckNodePort = software.amazon.jsii.Kernel.get(this, "healthCheckNodePort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.internalTrafficPolicy = software.amazon.jsii.Kernel.get(this, "internalTrafficPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipFamilies = software.amazon.jsii.Kernel.get(this, "ipFamilies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ipFamilyPolicy = software.amazon.jsii.Kernel.get(this, "ipFamilyPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancerClass = software.amazon.jsii.Kernel.get(this, "loadBalancerClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancerIp = software.amazon.jsii.Kernel.get(this, "loadBalancerIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancerSourceRanges = software.amazon.jsii.Kernel.get(this, "loadBalancerSourceRanges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ports = software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ServicePort.class)));
            this.publishNotReadyAddresses = software.amazon.jsii.Kernel.get(this, "publishNotReadyAddresses", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.selector = software.amazon.jsii.Kernel.get(this, "selector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sessionAffinity = software.amazon.jsii.Kernel.get(this, "sessionAffinity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sessionAffinityConfig = software.amazon.jsii.Kernel.get(this, "sessionAffinityConfig", software.amazon.jsii.NativeType.forClass(imports.k8s.SessionAffinityConfig.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allocateLoadBalancerNodePorts = builder.allocateLoadBalancerNodePorts;
            this.clusterIp = builder.clusterIp;
            this.clusterIPs = builder.clusterIPs;
            this.externalIPs = builder.externalIPs;
            this.externalName = builder.externalName;
            this.externalTrafficPolicy = builder.externalTrafficPolicy;
            this.healthCheckNodePort = builder.healthCheckNodePort;
            this.internalTrafficPolicy = builder.internalTrafficPolicy;
            this.ipFamilies = builder.ipFamilies;
            this.ipFamilyPolicy = builder.ipFamilyPolicy;
            this.loadBalancerClass = builder.loadBalancerClass;
            this.loadBalancerIp = builder.loadBalancerIp;
            this.loadBalancerSourceRanges = builder.loadBalancerSourceRanges;
            this.ports = (java.util.List<imports.k8s.ServicePort>)builder.ports;
            this.publishNotReadyAddresses = builder.publishNotReadyAddresses;
            this.selector = builder.selector;
            this.sessionAffinity = builder.sessionAffinity;
            this.sessionAffinityConfig = builder.sessionAffinityConfig;
            this.type = builder.type;
        }

        @Override
        public final java.lang.Boolean getAllocateLoadBalancerNodePorts() {
            return this.allocateLoadBalancerNodePorts;
        }

        @Override
        public final java.lang.String getClusterIp() {
            return this.clusterIp;
        }

        @Override
        public final java.util.List<java.lang.String> getClusterIPs() {
            return this.clusterIPs;
        }

        @Override
        public final java.util.List<java.lang.String> getExternalIPs() {
            return this.externalIPs;
        }

        @Override
        public final java.lang.String getExternalName() {
            return this.externalName;
        }

        @Override
        public final java.lang.String getExternalTrafficPolicy() {
            return this.externalTrafficPolicy;
        }

        @Override
        public final java.lang.Number getHealthCheckNodePort() {
            return this.healthCheckNodePort;
        }

        @Override
        public final java.lang.String getInternalTrafficPolicy() {
            return this.internalTrafficPolicy;
        }

        @Override
        public final java.util.List<java.lang.String> getIpFamilies() {
            return this.ipFamilies;
        }

        @Override
        public final java.lang.String getIpFamilyPolicy() {
            return this.ipFamilyPolicy;
        }

        @Override
        public final java.lang.String getLoadBalancerClass() {
            return this.loadBalancerClass;
        }

        @Override
        public final java.lang.String getLoadBalancerIp() {
            return this.loadBalancerIp;
        }

        @Override
        public final java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
            return this.loadBalancerSourceRanges;
        }

        @Override
        public final java.util.List<imports.k8s.ServicePort> getPorts() {
            return this.ports;
        }

        @Override
        public final java.lang.Boolean getPublishNotReadyAddresses() {
            return this.publishNotReadyAddresses;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getSelector() {
            return this.selector;
        }

        @Override
        public final java.lang.String getSessionAffinity() {
            return this.sessionAffinity;
        }

        @Override
        public final imports.k8s.SessionAffinityConfig getSessionAffinityConfig() {
            return this.sessionAffinityConfig;
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

            if (this.getAllocateLoadBalancerNodePorts() != null) {
                data.set("allocateLoadBalancerNodePorts", om.valueToTree(this.getAllocateLoadBalancerNodePorts()));
            }
            if (this.getClusterIp() != null) {
                data.set("clusterIp", om.valueToTree(this.getClusterIp()));
            }
            if (this.getClusterIPs() != null) {
                data.set("clusterIPs", om.valueToTree(this.getClusterIPs()));
            }
            if (this.getExternalIPs() != null) {
                data.set("externalIPs", om.valueToTree(this.getExternalIPs()));
            }
            if (this.getExternalName() != null) {
                data.set("externalName", om.valueToTree(this.getExternalName()));
            }
            if (this.getExternalTrafficPolicy() != null) {
                data.set("externalTrafficPolicy", om.valueToTree(this.getExternalTrafficPolicy()));
            }
            if (this.getHealthCheckNodePort() != null) {
                data.set("healthCheckNodePort", om.valueToTree(this.getHealthCheckNodePort()));
            }
            if (this.getInternalTrafficPolicy() != null) {
                data.set("internalTrafficPolicy", om.valueToTree(this.getInternalTrafficPolicy()));
            }
            if (this.getIpFamilies() != null) {
                data.set("ipFamilies", om.valueToTree(this.getIpFamilies()));
            }
            if (this.getIpFamilyPolicy() != null) {
                data.set("ipFamilyPolicy", om.valueToTree(this.getIpFamilyPolicy()));
            }
            if (this.getLoadBalancerClass() != null) {
                data.set("loadBalancerClass", om.valueToTree(this.getLoadBalancerClass()));
            }
            if (this.getLoadBalancerIp() != null) {
                data.set("loadBalancerIp", om.valueToTree(this.getLoadBalancerIp()));
            }
            if (this.getLoadBalancerSourceRanges() != null) {
                data.set("loadBalancerSourceRanges", om.valueToTree(this.getLoadBalancerSourceRanges()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }
            if (this.getPublishNotReadyAddresses() != null) {
                data.set("publishNotReadyAddresses", om.valueToTree(this.getPublishNotReadyAddresses()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getSessionAffinity() != null) {
                data.set("sessionAffinity", om.valueToTree(this.getSessionAffinity()));
            }
            if (this.getSessionAffinityConfig() != null) {
                data.set("sessionAffinityConfig", om.valueToTree(this.getSessionAffinityConfig()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceSpec.Jsii$Proxy that = (ServiceSpec.Jsii$Proxy) o;

            if (this.allocateLoadBalancerNodePorts != null ? !this.allocateLoadBalancerNodePorts.equals(that.allocateLoadBalancerNodePorts) : that.allocateLoadBalancerNodePorts != null) return false;
            if (this.clusterIp != null ? !this.clusterIp.equals(that.clusterIp) : that.clusterIp != null) return false;
            if (this.clusterIPs != null ? !this.clusterIPs.equals(that.clusterIPs) : that.clusterIPs != null) return false;
            if (this.externalIPs != null ? !this.externalIPs.equals(that.externalIPs) : that.externalIPs != null) return false;
            if (this.externalName != null ? !this.externalName.equals(that.externalName) : that.externalName != null) return false;
            if (this.externalTrafficPolicy != null ? !this.externalTrafficPolicy.equals(that.externalTrafficPolicy) : that.externalTrafficPolicy != null) return false;
            if (this.healthCheckNodePort != null ? !this.healthCheckNodePort.equals(that.healthCheckNodePort) : that.healthCheckNodePort != null) return false;
            if (this.internalTrafficPolicy != null ? !this.internalTrafficPolicy.equals(that.internalTrafficPolicy) : that.internalTrafficPolicy != null) return false;
            if (this.ipFamilies != null ? !this.ipFamilies.equals(that.ipFamilies) : that.ipFamilies != null) return false;
            if (this.ipFamilyPolicy != null ? !this.ipFamilyPolicy.equals(that.ipFamilyPolicy) : that.ipFamilyPolicy != null) return false;
            if (this.loadBalancerClass != null ? !this.loadBalancerClass.equals(that.loadBalancerClass) : that.loadBalancerClass != null) return false;
            if (this.loadBalancerIp != null ? !this.loadBalancerIp.equals(that.loadBalancerIp) : that.loadBalancerIp != null) return false;
            if (this.loadBalancerSourceRanges != null ? !this.loadBalancerSourceRanges.equals(that.loadBalancerSourceRanges) : that.loadBalancerSourceRanges != null) return false;
            if (this.ports != null ? !this.ports.equals(that.ports) : that.ports != null) return false;
            if (this.publishNotReadyAddresses != null ? !this.publishNotReadyAddresses.equals(that.publishNotReadyAddresses) : that.publishNotReadyAddresses != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.sessionAffinity != null ? !this.sessionAffinity.equals(that.sessionAffinity) : that.sessionAffinity != null) return false;
            if (this.sessionAffinityConfig != null ? !this.sessionAffinityConfig.equals(that.sessionAffinityConfig) : that.sessionAffinityConfig != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allocateLoadBalancerNodePorts != null ? this.allocateLoadBalancerNodePorts.hashCode() : 0;
            result = 31 * result + (this.clusterIp != null ? this.clusterIp.hashCode() : 0);
            result = 31 * result + (this.clusterIPs != null ? this.clusterIPs.hashCode() : 0);
            result = 31 * result + (this.externalIPs != null ? this.externalIPs.hashCode() : 0);
            result = 31 * result + (this.externalName != null ? this.externalName.hashCode() : 0);
            result = 31 * result + (this.externalTrafficPolicy != null ? this.externalTrafficPolicy.hashCode() : 0);
            result = 31 * result + (this.healthCheckNodePort != null ? this.healthCheckNodePort.hashCode() : 0);
            result = 31 * result + (this.internalTrafficPolicy != null ? this.internalTrafficPolicy.hashCode() : 0);
            result = 31 * result + (this.ipFamilies != null ? this.ipFamilies.hashCode() : 0);
            result = 31 * result + (this.ipFamilyPolicy != null ? this.ipFamilyPolicy.hashCode() : 0);
            result = 31 * result + (this.loadBalancerClass != null ? this.loadBalancerClass.hashCode() : 0);
            result = 31 * result + (this.loadBalancerIp != null ? this.loadBalancerIp.hashCode() : 0);
            result = 31 * result + (this.loadBalancerSourceRanges != null ? this.loadBalancerSourceRanges.hashCode() : 0);
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            result = 31 * result + (this.publishNotReadyAddresses != null ? this.publishNotReadyAddresses.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.sessionAffinity != null ? this.sessionAffinity.hashCode() : 0);
            result = 31 * result + (this.sessionAffinityConfig != null ? this.sessionAffinityConfig.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
