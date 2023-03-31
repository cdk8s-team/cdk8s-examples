import abc
import builtins
import datetime
import enum
import typing

import jsii
import publication
import typing_extensions

from typeguard import check_type

from ._jsii import *

import cdk8s as _cdk8s_d3d9af27
import constructs as _constructs_77d1e7e8


class ApmServer(
    _cdk8s_d3d9af27.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8sapm.ApmServer",
):
    '''ApmServer represents an APM Server resource in a Kubernetes cluster.

    :schema: ApmServer
    '''

    def __init__(
        self,
        scope: _constructs_77d1e7e8.Construct,
        id: builtins.str,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["ApmServerSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Defines a "ApmServer" API object.

        :param scope: the scope in which to define this object.
        :param id: a scope-local name for the object.
        :param metadata: 
        :param spec: ApmServerSpec holds the specification of an APM Server.
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__4f3d2e7cb45943114bb77b86c40c7bc9fc6a691809de0eb3c529e8a486394891)
            check_type(argname="argument scope", value=scope, expected_type=type_hints["scope"])
            check_type(argname="argument id", value=id, expected_type=type_hints["id"])
        props = ApmServerProps(metadata=metadata, spec=spec)

        jsii.create(self.__class__, self, [scope, id, props])

    @jsii.member(jsii_name="manifest")
    @builtins.classmethod
    def manifest(
        cls,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["ApmServerSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> typing.Any:
        '''Renders a Kubernetes manifest for "ApmServer".

        This can be used to inline resource manifests inside other objects (e.g. as templates).

        :param metadata: 
        :param spec: ApmServerSpec holds the specification of an APM Server.
        '''
        props = ApmServerProps(metadata=metadata, spec=spec)

        return typing.cast(typing.Any, jsii.sinvoke(cls, "manifest", [props]))

    @jsii.member(jsii_name="toJson")
    def to_json(self) -> typing.Any:
        '''Renders the object to Kubernetes JSON.'''
        return typing.cast(typing.Any, jsii.invoke(self, "toJson", []))

    @jsii.python.classproperty
    @jsii.member(jsii_name="GVK")
    def GVK(cls) -> _cdk8s_d3d9af27.GroupVersionKind:
        '''Returns the apiVersion and kind for "ApmServer".'''
        return typing.cast(_cdk8s_d3d9af27.GroupVersionKind, jsii.sget(cls, "GVK"))


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerProps",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class ApmServerProps:
    def __init__(
        self,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["ApmServerSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''ApmServer represents an APM Server resource in a Kubernetes cluster.

        :param metadata: 
        :param spec: ApmServerSpec holds the specification of an APM Server.

        :schema: ApmServer
        '''
        if isinstance(metadata, dict):
            metadata = _cdk8s_d3d9af27.ApiObjectMetadata(**metadata)
        if isinstance(spec, dict):
            spec = ApmServerSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__466df2bbbac2e8941b61a485f93f8bbf87dd529a26ae5c1b4430873701ca0389)
            check_type(argname="argument metadata", value=metadata, expected_type=type_hints["metadata"])
            check_type(argname="argument spec", value=spec, expected_type=type_hints["spec"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if metadata is not None:
            self._values["metadata"] = metadata
        if spec is not None:
            self._values["spec"] = spec

    @builtins.property
    def metadata(self) -> typing.Optional[_cdk8s_d3d9af27.ApiObjectMetadata]:
        '''
        :schema: ApmServer#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Optional[_cdk8s_d3d9af27.ApiObjectMetadata], result)

    @builtins.property
    def spec(self) -> typing.Optional["ApmServerSpec"]:
        '''ApmServerSpec holds the specification of an APM Server.

        :schema: ApmServer#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["ApmServerSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerProps(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpec",
    jsii_struct_bases=[],
    name_mapping={
        "version": "version",
        "config": "config",
        "count": "count",
        "elasticsearch_ref": "elasticsearchRef",
        "http": "http",
        "image": "image",
        "pod_template": "podTemplate",
        "secure_settings": "secureSettings",
        "service_account_name": "serviceAccountName",
    },
)
class ApmServerSpec:
    def __init__(
        self,
        *,
        version: builtins.str,
        config: typing.Any = None,
        count: typing.Optional[jsii.Number] = None,
        elasticsearch_ref: typing.Optional[typing.Union["ApmServerSpecElasticsearchRef", typing.Dict[builtins.str, typing.Any]]] = None,
        http: typing.Optional[typing.Union["ApmServerSpecHttp", typing.Dict[builtins.str, typing.Any]]] = None,
        image: typing.Optional[builtins.str] = None,
        pod_template: typing.Any = None,
        secure_settings: typing.Optional[typing.Sequence[typing.Union["ApmServerSpecSecureSettings", typing.Dict[builtins.str, typing.Any]]]] = None,
        service_account_name: typing.Optional[builtins.str] = None,
    ) -> None:
        '''ApmServerSpec holds the specification of an APM Server.

        :param version: Version of the APM Server.
        :param config: Config holds the APM Server configuration. See: https://www.elastic.co/guide/en/apm/server/current/configuring-howto-apm-server.html
        :param count: Count of APM Server instances to deploy.
        :param elasticsearch_ref: ElasticsearchRef is a reference to the output Elasticsearch cluster running in the same Kubernetes cluster.
        :param http: HTTP holds the HTTP layer configuration for the APM Server resource.
        :param image: Image is the APM Server Docker image to deploy.
        :param pod_template: PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the APM Server pods.
        :param secure_settings: SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for APM Server.
        :param service_account_name: ServiceAccountName is used to check access from the current resource to a resource (eg. Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.

        :schema: ApmServerSpec
        '''
        if isinstance(elasticsearch_ref, dict):
            elasticsearch_ref = ApmServerSpecElasticsearchRef(**elasticsearch_ref)
        if isinstance(http, dict):
            http = ApmServerSpecHttp(**http)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__60d3d903decb1f6cc851d2abcb5131be76150187941d5f995c6cf00189510d0e)
            check_type(argname="argument version", value=version, expected_type=type_hints["version"])
            check_type(argname="argument config", value=config, expected_type=type_hints["config"])
            check_type(argname="argument count", value=count, expected_type=type_hints["count"])
            check_type(argname="argument elasticsearch_ref", value=elasticsearch_ref, expected_type=type_hints["elasticsearch_ref"])
            check_type(argname="argument http", value=http, expected_type=type_hints["http"])
            check_type(argname="argument image", value=image, expected_type=type_hints["image"])
            check_type(argname="argument pod_template", value=pod_template, expected_type=type_hints["pod_template"])
            check_type(argname="argument secure_settings", value=secure_settings, expected_type=type_hints["secure_settings"])
            check_type(argname="argument service_account_name", value=service_account_name, expected_type=type_hints["service_account_name"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "version": version,
        }
        if config is not None:
            self._values["config"] = config
        if count is not None:
            self._values["count"] = count
        if elasticsearch_ref is not None:
            self._values["elasticsearch_ref"] = elasticsearch_ref
        if http is not None:
            self._values["http"] = http
        if image is not None:
            self._values["image"] = image
        if pod_template is not None:
            self._values["pod_template"] = pod_template
        if secure_settings is not None:
            self._values["secure_settings"] = secure_settings
        if service_account_name is not None:
            self._values["service_account_name"] = service_account_name

    @builtins.property
    def version(self) -> builtins.str:
        '''Version of the APM Server.

        :schema: ApmServerSpec#version
        '''
        result = self._values.get("version")
        assert result is not None, "Required property 'version' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def config(self) -> typing.Any:
        '''Config holds the APM Server configuration.

        See: https://www.elastic.co/guide/en/apm/server/current/configuring-howto-apm-server.html

        :schema: ApmServerSpec#config
        '''
        result = self._values.get("config")
        return typing.cast(typing.Any, result)

    @builtins.property
    def count(self) -> typing.Optional[jsii.Number]:
        '''Count of APM Server instances to deploy.

        :schema: ApmServerSpec#count
        '''
        result = self._values.get("count")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def elasticsearch_ref(self) -> typing.Optional["ApmServerSpecElasticsearchRef"]:
        '''ElasticsearchRef is a reference to the output Elasticsearch cluster running in the same Kubernetes cluster.

        :schema: ApmServerSpec#elasticsearchRef
        '''
        result = self._values.get("elasticsearch_ref")
        return typing.cast(typing.Optional["ApmServerSpecElasticsearchRef"], result)

    @builtins.property
    def http(self) -> typing.Optional["ApmServerSpecHttp"]:
        '''HTTP holds the HTTP layer configuration for the APM Server resource.

        :schema: ApmServerSpec#http
        '''
        result = self._values.get("http")
        return typing.cast(typing.Optional["ApmServerSpecHttp"], result)

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        '''Image is the APM Server Docker image to deploy.

        :schema: ApmServerSpec#image
        '''
        result = self._values.get("image")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def pod_template(self) -> typing.Any:
        '''PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the APM Server pods.

        :schema: ApmServerSpec#podTemplate
        '''
        result = self._values.get("pod_template")
        return typing.cast(typing.Any, result)

    @builtins.property
    def secure_settings(
        self,
    ) -> typing.Optional[typing.List["ApmServerSpecSecureSettings"]]:
        '''SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for APM Server.

        :schema: ApmServerSpec#secureSettings
        '''
        result = self._values.get("secure_settings")
        return typing.cast(typing.Optional[typing.List["ApmServerSpecSecureSettings"]], result)

    @builtins.property
    def service_account_name(self) -> typing.Optional[builtins.str]:
        '''ServiceAccountName is used to check access from the current resource to a resource (eg.

        Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.

        :schema: ApmServerSpec#serviceAccountName
        '''
        result = self._values.get("service_account_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecElasticsearchRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "namespace": "namespace"},
)
class ApmServerSpecElasticsearchRef:
    def __init__(
        self,
        *,
        name: builtins.str,
        namespace: typing.Optional[builtins.str] = None,
    ) -> None:
        '''ElasticsearchRef is a reference to the output Elasticsearch cluster running in the same Kubernetes cluster.

        :param name: Name of the Kubernetes object.
        :param namespace: Namespace of the Kubernetes object. If empty, defaults to the current namespace.

        :schema: ApmServerSpecElasticsearchRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__2a174e0711c0a499b0ed9c670977c3361741a389db34aea9cac9bc6cf1bbd59f)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument namespace", value=namespace, expected_type=type_hints["namespace"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "name": name,
        }
        if namespace is not None:
            self._values["namespace"] = namespace

    @builtins.property
    def name(self) -> builtins.str:
        '''Name of the Kubernetes object.

        :schema: ApmServerSpecElasticsearchRef#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def namespace(self) -> typing.Optional[builtins.str]:
        '''Namespace of the Kubernetes object.

        If empty, defaults to the current namespace.

        :schema: ApmServerSpecElasticsearchRef#namespace
        '''
        result = self._values.get("namespace")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecElasticsearchRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttp",
    jsii_struct_bases=[],
    name_mapping={"service": "service", "tls": "tls"},
)
class ApmServerSpecHttp:
    def __init__(
        self,
        *,
        service: typing.Optional[typing.Union["ApmServerSpecHttpService", typing.Dict[builtins.str, typing.Any]]] = None,
        tls: typing.Optional[typing.Union["ApmServerSpecHttpTls", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''HTTP holds the HTTP layer configuration for the APM Server resource.

        :param service: Service defines the template for the associated Kubernetes Service object.
        :param tls: TLS defines options for configuring TLS for HTTP.

        :schema: ApmServerSpecHttp
        '''
        if isinstance(service, dict):
            service = ApmServerSpecHttpService(**service)
        if isinstance(tls, dict):
            tls = ApmServerSpecHttpTls(**tls)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__2d850bdc0541528f2228410fe39cdb61193580260eb8da4f13d79c18feae1eba)
            check_type(argname="argument service", value=service, expected_type=type_hints["service"])
            check_type(argname="argument tls", value=tls, expected_type=type_hints["tls"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if service is not None:
            self._values["service"] = service
        if tls is not None:
            self._values["tls"] = tls

    @builtins.property
    def service(self) -> typing.Optional["ApmServerSpecHttpService"]:
        '''Service defines the template for the associated Kubernetes Service object.

        :schema: ApmServerSpecHttp#service
        '''
        result = self._values.get("service")
        return typing.cast(typing.Optional["ApmServerSpecHttpService"], result)

    @builtins.property
    def tls(self) -> typing.Optional["ApmServerSpecHttpTls"]:
        '''TLS defines options for configuring TLS for HTTP.

        :schema: ApmServerSpecHttp#tls
        '''
        result = self._values.get("tls")
        return typing.cast(typing.Optional["ApmServerSpecHttpTls"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpService",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class ApmServerSpecHttpService:
    def __init__(
        self,
        *,
        metadata: typing.Any = None,
        spec: typing.Optional[typing.Union["ApmServerSpecHttpServiceSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Service defines the template for the associated Kubernetes Service object.

        :param metadata: ObjectMeta is the metadata of the service. The name and namespace provided here are managed by ECK and will be ignored.
        :param spec: Spec is the specification of the service.

        :schema: ApmServerSpecHttpService
        '''
        if isinstance(spec, dict):
            spec = ApmServerSpecHttpServiceSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__818ae23513aa2802ee98f01b47fd19c5c205a91923d4acad21d09735a8e8cc3e)
            check_type(argname="argument metadata", value=metadata, expected_type=type_hints["metadata"])
            check_type(argname="argument spec", value=spec, expected_type=type_hints["spec"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if metadata is not None:
            self._values["metadata"] = metadata
        if spec is not None:
            self._values["spec"] = spec

    @builtins.property
    def metadata(self) -> typing.Any:
        '''ObjectMeta is the metadata of the service.

        The name and namespace provided here are managed by ECK and will be ignored.

        :schema: ApmServerSpecHttpService#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Any, result)

    @builtins.property
    def spec(self) -> typing.Optional["ApmServerSpecHttpServiceSpec"]:
        '''Spec is the specification of the service.

        :schema: ApmServerSpecHttpService#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["ApmServerSpecHttpServiceSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpService(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpServiceSpec",
    jsii_struct_bases=[],
    name_mapping={
        "cluster_ip": "clusterIp",
        "external_i_ps": "externalIPs",
        "external_name": "externalName",
        "external_traffic_policy": "externalTrafficPolicy",
        "health_check_node_port": "healthCheckNodePort",
        "ip_family": "ipFamily",
        "load_balancer_ip": "loadBalancerIp",
        "load_balancer_source_ranges": "loadBalancerSourceRanges",
        "ports": "ports",
        "publish_not_ready_addresses": "publishNotReadyAddresses",
        "selector": "selector",
        "session_affinity": "sessionAffinity",
        "session_affinity_config": "sessionAffinityConfig",
        "topology_keys": "topologyKeys",
        "type": "type",
    },
)
class ApmServerSpecHttpServiceSpec:
    def __init__(
        self,
        *,
        cluster_ip: typing.Optional[builtins.str] = None,
        external_i_ps: typing.Optional[typing.Sequence[builtins.str]] = None,
        external_name: typing.Optional[builtins.str] = None,
        external_traffic_policy: typing.Optional[builtins.str] = None,
        health_check_node_port: typing.Optional[jsii.Number] = None,
        ip_family: typing.Optional[builtins.str] = None,
        load_balancer_ip: typing.Optional[builtins.str] = None,
        load_balancer_source_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
        ports: typing.Optional[typing.Sequence[typing.Union["ApmServerSpecHttpServiceSpecPorts", typing.Dict[builtins.str, typing.Any]]]] = None,
        publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
        selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        session_affinity: typing.Optional[builtins.str] = None,
        session_affinity_config: typing.Optional[typing.Union["ApmServerSpecHttpServiceSpecSessionAffinityConfig", typing.Dict[builtins.str, typing.Any]]] = None,
        topology_keys: typing.Optional[typing.Sequence[builtins.str]] = None,
        type: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Spec is the specification of the service.

        :param cluster_ip: clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
        :param external_i_ps: externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service. These IPs are not managed by Kubernetes. The user is responsible for ensuring that traffic arrives at a node with this IP. A common example is external load-balancers that are not part of the Kubernetes system.
        :param external_name: externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
        :param external_traffic_policy: externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
        :param health_check_node_port: healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
        :param ip_family: ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6). If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster. If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family. Endpoints for this Service will be of this family. This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.
        :param load_balancer_ip: Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
        :param load_balancer_source_ranges: If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
        :param ports: The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
        :param publish_not_ready_addresses: publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.
        :param selector: Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
        :param session_affinity: Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies Default: None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
        :param session_affinity_config: sessionAffinityConfig contains the configurations of session affinity.
        :param topology_keys: topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
        :param type: type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types Default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :schema: ApmServerSpecHttpServiceSpec
        '''
        if isinstance(session_affinity_config, dict):
            session_affinity_config = ApmServerSpecHttpServiceSpecSessionAffinityConfig(**session_affinity_config)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ce2844f22c2ed741f564edebc4d39d444227b607d4cc80397b874d7ea2622c60)
            check_type(argname="argument cluster_ip", value=cluster_ip, expected_type=type_hints["cluster_ip"])
            check_type(argname="argument external_i_ps", value=external_i_ps, expected_type=type_hints["external_i_ps"])
            check_type(argname="argument external_name", value=external_name, expected_type=type_hints["external_name"])
            check_type(argname="argument external_traffic_policy", value=external_traffic_policy, expected_type=type_hints["external_traffic_policy"])
            check_type(argname="argument health_check_node_port", value=health_check_node_port, expected_type=type_hints["health_check_node_port"])
            check_type(argname="argument ip_family", value=ip_family, expected_type=type_hints["ip_family"])
            check_type(argname="argument load_balancer_ip", value=load_balancer_ip, expected_type=type_hints["load_balancer_ip"])
            check_type(argname="argument load_balancer_source_ranges", value=load_balancer_source_ranges, expected_type=type_hints["load_balancer_source_ranges"])
            check_type(argname="argument ports", value=ports, expected_type=type_hints["ports"])
            check_type(argname="argument publish_not_ready_addresses", value=publish_not_ready_addresses, expected_type=type_hints["publish_not_ready_addresses"])
            check_type(argname="argument selector", value=selector, expected_type=type_hints["selector"])
            check_type(argname="argument session_affinity", value=session_affinity, expected_type=type_hints["session_affinity"])
            check_type(argname="argument session_affinity_config", value=session_affinity_config, expected_type=type_hints["session_affinity_config"])
            check_type(argname="argument topology_keys", value=topology_keys, expected_type=type_hints["topology_keys"])
            check_type(argname="argument type", value=type, expected_type=type_hints["type"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if cluster_ip is not None:
            self._values["cluster_ip"] = cluster_ip
        if external_i_ps is not None:
            self._values["external_i_ps"] = external_i_ps
        if external_name is not None:
            self._values["external_name"] = external_name
        if external_traffic_policy is not None:
            self._values["external_traffic_policy"] = external_traffic_policy
        if health_check_node_port is not None:
            self._values["health_check_node_port"] = health_check_node_port
        if ip_family is not None:
            self._values["ip_family"] = ip_family
        if load_balancer_ip is not None:
            self._values["load_balancer_ip"] = load_balancer_ip
        if load_balancer_source_ranges is not None:
            self._values["load_balancer_source_ranges"] = load_balancer_source_ranges
        if ports is not None:
            self._values["ports"] = ports
        if publish_not_ready_addresses is not None:
            self._values["publish_not_ready_addresses"] = publish_not_ready_addresses
        if selector is not None:
            self._values["selector"] = selector
        if session_affinity is not None:
            self._values["session_affinity"] = session_affinity
        if session_affinity_config is not None:
            self._values["session_affinity_config"] = session_affinity_config
        if topology_keys is not None:
            self._values["topology_keys"] = topology_keys
        if type is not None:
            self._values["type"] = type

    @builtins.property
    def cluster_ip(self) -> typing.Optional[builtins.str]:
        '''clusterIP is the IP address of the service and is usually assigned randomly by the master.

        If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: ApmServerSpecHttpServiceSpec#clusterIP
        '''
        result = self._values.get("cluster_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_i_ps(self) -> typing.Optional[typing.List[builtins.str]]:
        '''externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.

        These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.

        :schema: ApmServerSpecHttpServiceSpec#externalIPs
        '''
        result = self._values.get("external_i_ps")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def external_name(self) -> typing.Optional[builtins.str]:
        '''externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service.

        No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.

        :schema: ApmServerSpecHttpServiceSpec#externalName
        '''
        result = self._values.get("external_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_traffic_policy(self) -> typing.Optional[builtins.str]:
        '''externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.

        "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.

        :schema: ApmServerSpecHttpServiceSpec#externalTrafficPolicy
        '''
        result = self._values.get("external_traffic_policy")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def health_check_node_port(self) -> typing.Optional[jsii.Number]:
        '''healthCheckNodePort specifies the healthcheck nodePort for the service.

        If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.

        :schema: ApmServerSpecHttpServiceSpec#healthCheckNodePort
        '''
        result = self._values.get("health_check_node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def ip_family(self) -> typing.Optional[builtins.str]:
        '''ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.

        :schema: ApmServerSpecHttpServiceSpec#ipFamily
        '''
        result = self._values.get("ip_family")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_ip(self) -> typing.Optional[builtins.str]:
        '''Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.

        This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.

        :schema: ApmServerSpecHttpServiceSpec#loadBalancerIP
        '''
        result = self._values.get("load_balancer_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_source_ranges(self) -> typing.Optional[typing.List[builtins.str]]:
        '''If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.

        This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

        :schema: ApmServerSpecHttpServiceSpec#loadBalancerSourceRanges
        '''
        result = self._values.get("load_balancer_source_ranges")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def ports(
        self,
    ) -> typing.Optional[typing.List["ApmServerSpecHttpServiceSpecPorts"]]:
        '''The list of ports that are exposed by this service.

        More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: ApmServerSpecHttpServiceSpec#ports
        '''
        result = self._values.get("ports")
        return typing.cast(typing.Optional[typing.List["ApmServerSpecHttpServiceSpecPorts"]], result)

    @builtins.property
    def publish_not_ready_addresses(self) -> typing.Optional[builtins.bool]:
        '''publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service.

        The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.

        :schema: ApmServerSpecHttpServiceSpec#publishNotReadyAddresses
        '''
        result = self._values.get("publish_not_ready_addresses")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def selector(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Route service traffic to pods with label keys and values matching this selector.

        If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/

        :schema: ApmServerSpecHttpServiceSpec#selector
        '''
        result = self._values.get("selector")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def session_affinity(self) -> typing.Optional[builtins.str]:
        '''Supports "ClientIP" and "None".

        Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :default: None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: ApmServerSpecHttpServiceSpec#sessionAffinity
        '''
        result = self._values.get("session_affinity")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def session_affinity_config(
        self,
    ) -> typing.Optional["ApmServerSpecHttpServiceSpecSessionAffinityConfig"]:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :schema: ApmServerSpecHttpServiceSpec#sessionAffinityConfig
        '''
        result = self._values.get("session_affinity_config")
        return typing.cast(typing.Optional["ApmServerSpecHttpServiceSpecSessionAffinityConfig"], result)

    @builtins.property
    def topology_keys(self) -> typing.Optional[typing.List[builtins.str]]:
        '''topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local.

        Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.

        :schema: ApmServerSpecHttpServiceSpec#topologyKeys
        '''
        result = self._values.get("topology_keys")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def type(self) -> typing.Optional[builtins.str]:
        '''type determines how the Service is exposed.

        Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :schema: ApmServerSpecHttpServiceSpec#type
        '''
        result = self._values.get("type")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpServiceSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpServiceSpecPorts",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "name": "name",
        "node_port": "nodePort",
        "protocol": "protocol",
        "target_port": "targetPort",
    },
)
class ApmServerSpecHttpServiceSpecPorts:
    def __init__(
        self,
        *,
        port: jsii.Number,
        name: typing.Optional[builtins.str] = None,
        node_port: typing.Optional[jsii.Number] = None,
        protocol: typing.Optional[builtins.str] = None,
        target_port: typing.Optional["ApmServerSpecHttpServiceSpecPortsTargetPort"] = None,
    ) -> None:
        '''ServicePort contains information on service's port.

        :param port: The port that will be exposed by this service.
        :param name: The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
        :param node_port: The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport Default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
        :param protocol: The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP. Default: TCP.
        :param target_port: Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: ApmServerSpecHttpServiceSpecPorts
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__befb460838762164676b0b1507081e648d0525de5b142d818c835a09325f62a5)
            check_type(argname="argument port", value=port, expected_type=type_hints["port"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument node_port", value=node_port, expected_type=type_hints["node_port"])
            check_type(argname="argument protocol", value=protocol, expected_type=type_hints["protocol"])
            check_type(argname="argument target_port", value=target_port, expected_type=type_hints["target_port"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "port": port,
        }
        if name is not None:
            self._values["name"] = name
        if node_port is not None:
            self._values["node_port"] = node_port
        if protocol is not None:
            self._values["protocol"] = protocol
        if target_port is not None:
            self._values["target_port"] = target_port

    @builtins.property
    def port(self) -> jsii.Number:
        '''The port that will be exposed by this service.

        :schema: ApmServerSpecHttpServiceSpecPorts#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast(jsii.Number, result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''The name of this port within the service.

        This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.

        :schema: ApmServerSpecHttpServiceSpecPorts#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def node_port(self) -> typing.Optional[jsii.Number]:
        '''The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

        Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :schema: ApmServerSpecHttpServiceSpecPorts#nodePort
        '''
        result = self._values.get("node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def protocol(self) -> typing.Optional[builtins.str]:
        '''The IP protocol for this port.

        Supports "TCP", "UDP", and "SCTP". Default is TCP.

        :default: TCP.

        :schema: ApmServerSpecHttpServiceSpecPorts#protocol
        '''
        result = self._values.get("protocol")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def target_port(
        self,
    ) -> typing.Optional["ApmServerSpecHttpServiceSpecPortsTargetPort"]:
        '''Number or name of the port to access on the pods targeted by the service.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: ApmServerSpecHttpServiceSpecPorts#targetPort
        '''
        result = self._values.get("target_port")
        return typing.cast(typing.Optional["ApmServerSpecHttpServiceSpecPortsTargetPort"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpServiceSpecPorts(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ApmServerSpecHttpServiceSpecPortsTargetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8sapm.ApmServerSpecHttpServiceSpecPortsTargetPort",
):
    '''Number or name of the port to access on the pods targeted by the service.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

    :schema: ApmServerSpecHttpServiceSpecPortsTargetPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ApmServerSpecHttpServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__442fd248fbacab5df862fb7404f7b905998e398993ce856b7054f22f93ac58f9)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ApmServerSpecHttpServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ApmServerSpecHttpServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__505708631175cead5720359be45bcecd30c90cae7e5005226a765de25f3e297b)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ApmServerSpecHttpServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpServiceSpecSessionAffinityConfig",
    jsii_struct_bases=[],
    name_mapping={"client_ip": "clientIp"},
)
class ApmServerSpecHttpServiceSpecSessionAffinityConfig:
    def __init__(
        self,
        *,
        client_ip: typing.Optional[typing.Union["ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :param client_ip: clientIP contains the configurations of Client IP based session affinity.

        :schema: ApmServerSpecHttpServiceSpecSessionAffinityConfig
        '''
        if isinstance(client_ip, dict):
            client_ip = ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp(**client_ip)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__e591b782313e7e0dfab2c87c005b5cd762ff5f2d4d430d5568240d5702d6bd25)
            check_type(argname="argument client_ip", value=client_ip, expected_type=type_hints["client_ip"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if client_ip is not None:
            self._values["client_ip"] = client_ip

    @builtins.property
    def client_ip(
        self,
    ) -> typing.Optional["ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp"]:
        '''clientIP contains the configurations of Client IP based session affinity.

        :schema: ApmServerSpecHttpServiceSpecSessionAffinityConfig#clientIP
        '''
        result = self._values.get("client_ip")
        return typing.cast(typing.Optional["ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpServiceSpecSessionAffinityConfig(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp",
    jsii_struct_bases=[],
    name_mapping={"timeout_seconds": "timeoutSeconds"},
)
class ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp:
    def __init__(self, *, timeout_seconds: typing.Optional[jsii.Number] = None) -> None:
        '''clientIP contains the configurations of Client IP based session affinity.

        :param timeout_seconds: timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ed9b7ebe18f695a702ee69ff1d5927aa022130348beae9ee1664f97cb3c2d1f4)
            check_type(argname="argument timeout_seconds", value=timeout_seconds, expected_type=type_hints["timeout_seconds"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if timeout_seconds is not None:
            self._values["timeout_seconds"] = timeout_seconds

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        '''timeoutSeconds specifies the seconds of ClientIP type session sticky time.

        The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp#timeoutSeconds
        '''
        result = self._values.get("timeout_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpTls",
    jsii_struct_bases=[],
    name_mapping={
        "certificate": "certificate",
        "self_signed_certificate": "selfSignedCertificate",
    },
)
class ApmServerSpecHttpTls:
    def __init__(
        self,
        *,
        certificate: typing.Optional[typing.Union["ApmServerSpecHttpTlsCertificate", typing.Dict[builtins.str, typing.Any]]] = None,
        self_signed_certificate: typing.Optional[typing.Union["ApmServerSpecHttpTlsSelfSignedCertificate", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''TLS defines options for configuring TLS for HTTP.

        :param certificate: Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS. The referenced secret should contain the following: - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.
        :param self_signed_certificate: SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :schema: ApmServerSpecHttpTls
        '''
        if isinstance(certificate, dict):
            certificate = ApmServerSpecHttpTlsCertificate(**certificate)
        if isinstance(self_signed_certificate, dict):
            self_signed_certificate = ApmServerSpecHttpTlsSelfSignedCertificate(**self_signed_certificate)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__c7a1e492ec284cce05926ffa80c9099b7f78704db4befef7bd56063128285c6d)
            check_type(argname="argument certificate", value=certificate, expected_type=type_hints["certificate"])
            check_type(argname="argument self_signed_certificate", value=self_signed_certificate, expected_type=type_hints["self_signed_certificate"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if certificate is not None:
            self._values["certificate"] = certificate
        if self_signed_certificate is not None:
            self._values["self_signed_certificate"] = self_signed_certificate

    @builtins.property
    def certificate(self) -> typing.Optional["ApmServerSpecHttpTlsCertificate"]:
        '''Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.

        The referenced secret should contain the following:

        - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.

        :schema: ApmServerSpecHttpTls#certificate
        '''
        result = self._values.get("certificate")
        return typing.cast(typing.Optional["ApmServerSpecHttpTlsCertificate"], result)

    @builtins.property
    def self_signed_certificate(
        self,
    ) -> typing.Optional["ApmServerSpecHttpTlsSelfSignedCertificate"]:
        '''SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :schema: ApmServerSpecHttpTls#selfSignedCertificate
        '''
        result = self._values.get("self_signed_certificate")
        return typing.cast(typing.Optional["ApmServerSpecHttpTlsSelfSignedCertificate"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpTls(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpTlsCertificate",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName"},
)
class ApmServerSpecHttpTlsCertificate:
    def __init__(self, *, secret_name: typing.Optional[builtins.str] = None) -> None:
        '''Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.

        The referenced secret should contain the following:

        - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.

        :param secret_name: SecretName is the name of the secret.

        :schema: ApmServerSpecHttpTlsCertificate
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__517cc55ba44a362b35a65f3322cb175a5062c0f2dabd1a268500b630bcff2e7d)
            check_type(argname="argument secret_name", value=secret_name, expected_type=type_hints["secret_name"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if secret_name is not None:
            self._values["secret_name"] = secret_name

    @builtins.property
    def secret_name(self) -> typing.Optional[builtins.str]:
        '''SecretName is the name of the secret.

        :schema: ApmServerSpecHttpTlsCertificate#secretName
        '''
        result = self._values.get("secret_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpTlsCertificate(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpTlsSelfSignedCertificate",
    jsii_struct_bases=[],
    name_mapping={"disabled": "disabled", "subject_alt_names": "subjectAltNames"},
)
class ApmServerSpecHttpTlsSelfSignedCertificate:
    def __init__(
        self,
        *,
        disabled: typing.Optional[builtins.bool] = None,
        subject_alt_names: typing.Optional[typing.Sequence[typing.Union["ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :param disabled: Disabled indicates that the provisioning of the self-signed certifcate should be disabled.
        :param subject_alt_names: SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.

        :schema: ApmServerSpecHttpTlsSelfSignedCertificate
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__1fa5988fc42375b73c57fc8e151c8336ffe4d4136d60677fcfb9b9a71bcc92ec)
            check_type(argname="argument disabled", value=disabled, expected_type=type_hints["disabled"])
            check_type(argname="argument subject_alt_names", value=subject_alt_names, expected_type=type_hints["subject_alt_names"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if disabled is not None:
            self._values["disabled"] = disabled
        if subject_alt_names is not None:
            self._values["subject_alt_names"] = subject_alt_names

    @builtins.property
    def disabled(self) -> typing.Optional[builtins.bool]:
        '''Disabled indicates that the provisioning of the self-signed certifcate should be disabled.

        :schema: ApmServerSpecHttpTlsSelfSignedCertificate#disabled
        '''
        result = self._values.get("disabled")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def subject_alt_names(
        self,
    ) -> typing.Optional[typing.List["ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames"]]:
        '''SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.

        :schema: ApmServerSpecHttpTlsSelfSignedCertificate#subjectAltNames
        '''
        result = self._values.get("subject_alt_names")
        return typing.cast(typing.Optional[typing.List["ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpTlsSelfSignedCertificate(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames",
    jsii_struct_bases=[],
    name_mapping={"dns": "dns", "ip": "ip"},
)
class ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames:
    def __init__(
        self,
        *,
        dns: typing.Optional[builtins.str] = None,
        ip: typing.Optional[builtins.str] = None,
    ) -> None:
        '''SubjectAlternativeName represents a SAN entry in a x509 certificate.

        :param dns: DNS is the DNS name of the subject.
        :param ip: IP is the IP address of the subject.

        :schema: ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__6eff709a9c95201bef4573912d1520df557edf2a68684e86458b81e906ef9d64)
            check_type(argname="argument dns", value=dns, expected_type=type_hints["dns"])
            check_type(argname="argument ip", value=ip, expected_type=type_hints["ip"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if dns is not None:
            self._values["dns"] = dns
        if ip is not None:
            self._values["ip"] = ip

    @builtins.property
    def dns(self) -> typing.Optional[builtins.str]:
        '''DNS is the DNS name of the subject.

        :schema: ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames#dns
        '''
        result = self._values.get("dns")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def ip(self) -> typing.Optional[builtins.str]:
        '''IP is the IP address of the subject.

        :schema: ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames#ip
        '''
        result = self._values.get("ip")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecSecureSettings",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName", "entries": "entries"},
)
class ApmServerSpecSecureSettings:
    def __init__(
        self,
        *,
        secret_name: builtins.str,
        entries: typing.Optional[typing.Sequence[typing.Union["ApmServerSpecSecureSettingsEntries", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''SecretSource defines a data source based on a Kubernetes Secret.

        :param secret_name: SecretName is the name of the secret.
        :param entries: Entries define how to project each key-value pair in the secret to filesystem paths. If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.

        :schema: ApmServerSpecSecureSettings
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__05cdf3ee333679349ff66f3b512e6286053808fd5958e0655ed411797bff945c)
            check_type(argname="argument secret_name", value=secret_name, expected_type=type_hints["secret_name"])
            check_type(argname="argument entries", value=entries, expected_type=type_hints["entries"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "secret_name": secret_name,
        }
        if entries is not None:
            self._values["entries"] = entries

    @builtins.property
    def secret_name(self) -> builtins.str:
        '''SecretName is the name of the secret.

        :schema: ApmServerSpecSecureSettings#secretName
        '''
        result = self._values.get("secret_name")
        assert result is not None, "Required property 'secret_name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def entries(
        self,
    ) -> typing.Optional[typing.List["ApmServerSpecSecureSettingsEntries"]]:
        '''Entries define how to project each key-value pair in the secret to filesystem paths.

        If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.

        :schema: ApmServerSpecSecureSettings#entries
        '''
        result = self._values.get("entries")
        return typing.cast(typing.Optional[typing.List["ApmServerSpecSecureSettingsEntries"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecSecureSettings(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8sapm.ApmServerSpecSecureSettingsEntries",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "path": "path"},
)
class ApmServerSpecSecureSettingsEntries:
    def __init__(
        self,
        *,
        key: builtins.str,
        path: typing.Optional[builtins.str] = None,
    ) -> None:
        '''KeyToPath defines how to map a key in a Secret object to a filesystem path.

        :param key: Key is the key contained in the secret.
        :param path: Path is the relative file path to map the key to. Path must not be an absolute file path and must not contain any ".." components.

        :schema: ApmServerSpecSecureSettingsEntries
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__e6ed60c087450bea7ffde67022a16e3d3f60da74cac041fb3bb6729f57a19b4e)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument path", value=path, expected_type=type_hints["path"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "key": key,
        }
        if path is not None:
            self._values["path"] = path

    @builtins.property
    def key(self) -> builtins.str:
        '''Key is the key contained in the secret.

        :schema: ApmServerSpecSecureSettingsEntries#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def path(self) -> typing.Optional[builtins.str]:
        '''Path is the relative file path to map the key to.

        Path must not be an absolute file path and must not contain any ".." components.

        :schema: ApmServerSpecSecureSettingsEntries#path
        '''
        result = self._values.get("path")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ApmServerSpecSecureSettingsEntries(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "ApmServer",
    "ApmServerProps",
    "ApmServerSpec",
    "ApmServerSpecElasticsearchRef",
    "ApmServerSpecHttp",
    "ApmServerSpecHttpService",
    "ApmServerSpecHttpServiceSpec",
    "ApmServerSpecHttpServiceSpecPorts",
    "ApmServerSpecHttpServiceSpecPortsTargetPort",
    "ApmServerSpecHttpServiceSpecSessionAffinityConfig",
    "ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp",
    "ApmServerSpecHttpTls",
    "ApmServerSpecHttpTlsCertificate",
    "ApmServerSpecHttpTlsSelfSignedCertificate",
    "ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames",
    "ApmServerSpecSecureSettings",
    "ApmServerSpecSecureSettingsEntries",
]

publication.publish()

def _typecheckingstub__4f3d2e7cb45943114bb77b86c40c7bc9fc6a691809de0eb3c529e8a486394891(
    scope: _constructs_77d1e7e8.Construct,
    id: builtins.str,
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[ApmServerSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__466df2bbbac2e8941b61a485f93f8bbf87dd529a26ae5c1b4430873701ca0389(
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[ApmServerSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__60d3d903decb1f6cc851d2abcb5131be76150187941d5f995c6cf00189510d0e(
    *,
    version: builtins.str,
    config: typing.Any = None,
    count: typing.Optional[jsii.Number] = None,
    elasticsearch_ref: typing.Optional[typing.Union[ApmServerSpecElasticsearchRef, typing.Dict[builtins.str, typing.Any]]] = None,
    http: typing.Optional[typing.Union[ApmServerSpecHttp, typing.Dict[builtins.str, typing.Any]]] = None,
    image: typing.Optional[builtins.str] = None,
    pod_template: typing.Any = None,
    secure_settings: typing.Optional[typing.Sequence[typing.Union[ApmServerSpecSecureSettings, typing.Dict[builtins.str, typing.Any]]]] = None,
    service_account_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__2a174e0711c0a499b0ed9c670977c3361741a389db34aea9cac9bc6cf1bbd59f(
    *,
    name: builtins.str,
    namespace: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__2d850bdc0541528f2228410fe39cdb61193580260eb8da4f13d79c18feae1eba(
    *,
    service: typing.Optional[typing.Union[ApmServerSpecHttpService, typing.Dict[builtins.str, typing.Any]]] = None,
    tls: typing.Optional[typing.Union[ApmServerSpecHttpTls, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__818ae23513aa2802ee98f01b47fd19c5c205a91923d4acad21d09735a8e8cc3e(
    *,
    metadata: typing.Any = None,
    spec: typing.Optional[typing.Union[ApmServerSpecHttpServiceSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ce2844f22c2ed741f564edebc4d39d444227b607d4cc80397b874d7ea2622c60(
    *,
    cluster_ip: typing.Optional[builtins.str] = None,
    external_i_ps: typing.Optional[typing.Sequence[builtins.str]] = None,
    external_name: typing.Optional[builtins.str] = None,
    external_traffic_policy: typing.Optional[builtins.str] = None,
    health_check_node_port: typing.Optional[jsii.Number] = None,
    ip_family: typing.Optional[builtins.str] = None,
    load_balancer_ip: typing.Optional[builtins.str] = None,
    load_balancer_source_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
    ports: typing.Optional[typing.Sequence[typing.Union[ApmServerSpecHttpServiceSpecPorts, typing.Dict[builtins.str, typing.Any]]]] = None,
    publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
    selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    session_affinity: typing.Optional[builtins.str] = None,
    session_affinity_config: typing.Optional[typing.Union[ApmServerSpecHttpServiceSpecSessionAffinityConfig, typing.Dict[builtins.str, typing.Any]]] = None,
    topology_keys: typing.Optional[typing.Sequence[builtins.str]] = None,
    type: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__befb460838762164676b0b1507081e648d0525de5b142d818c835a09325f62a5(
    *,
    port: jsii.Number,
    name: typing.Optional[builtins.str] = None,
    node_port: typing.Optional[jsii.Number] = None,
    protocol: typing.Optional[builtins.str] = None,
    target_port: typing.Optional[ApmServerSpecHttpServiceSpecPortsTargetPort] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__442fd248fbacab5df862fb7404f7b905998e398993ce856b7054f22f93ac58f9(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__505708631175cead5720359be45bcecd30c90cae7e5005226a765de25f3e297b(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__e591b782313e7e0dfab2c87c005b5cd762ff5f2d4d430d5568240d5702d6bd25(
    *,
    client_ip: typing.Optional[typing.Union[ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ed9b7ebe18f695a702ee69ff1d5927aa022130348beae9ee1664f97cb3c2d1f4(
    *,
    timeout_seconds: typing.Optional[jsii.Number] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__c7a1e492ec284cce05926ffa80c9099b7f78704db4befef7bd56063128285c6d(
    *,
    certificate: typing.Optional[typing.Union[ApmServerSpecHttpTlsCertificate, typing.Dict[builtins.str, typing.Any]]] = None,
    self_signed_certificate: typing.Optional[typing.Union[ApmServerSpecHttpTlsSelfSignedCertificate, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__517cc55ba44a362b35a65f3322cb175a5062c0f2dabd1a268500b630bcff2e7d(
    *,
    secret_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__1fa5988fc42375b73c57fc8e151c8336ffe4d4136d60677fcfb9b9a71bcc92ec(
    *,
    disabled: typing.Optional[builtins.bool] = None,
    subject_alt_names: typing.Optional[typing.Sequence[typing.Union[ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__6eff709a9c95201bef4573912d1520df557edf2a68684e86458b81e906ef9d64(
    *,
    dns: typing.Optional[builtins.str] = None,
    ip: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__05cdf3ee333679349ff66f3b512e6286053808fd5958e0655ed411797bff945c(
    *,
    secret_name: builtins.str,
    entries: typing.Optional[typing.Sequence[typing.Union[ApmServerSpecSecureSettingsEntries, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__e6ed60c087450bea7ffde67022a16e3d3f60da74cac041fb3bb6729f57a19b4e(
    *,
    key: builtins.str,
    path: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass
