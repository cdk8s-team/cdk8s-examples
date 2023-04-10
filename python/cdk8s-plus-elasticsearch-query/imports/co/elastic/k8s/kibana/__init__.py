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


class Kibana(
    _cdk8s_d3d9af27.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8skibana.Kibana",
):
    '''Kibana represents a Kibana resource in a Kubernetes cluster.

    :schema: Kibana
    '''

    def __init__(
        self,
        scope: _constructs_77d1e7e8.Construct,
        id: builtins.str,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["KibanaSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Defines a "Kibana" API object.

        :param scope: the scope in which to define this object.
        :param id: a scope-local name for the object.
        :param metadata: 
        :param spec: KibanaSpec holds the specification of a Kibana instance.
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__5e456b030e7f9f1ddeee1c401f01da842a8ba1596725f8b3a1a4ed80c4c355e0)
            check_type(argname="argument scope", value=scope, expected_type=type_hints["scope"])
            check_type(argname="argument id", value=id, expected_type=type_hints["id"])
        props = KibanaProps(metadata=metadata, spec=spec)

        jsii.create(self.__class__, self, [scope, id, props])

    @jsii.member(jsii_name="manifest")
    @builtins.classmethod
    def manifest(
        cls,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["KibanaSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> typing.Any:
        '''Renders a Kubernetes manifest for "Kibana".

        This can be used to inline resource manifests inside other objects (e.g. as templates).

        :param metadata: 
        :param spec: KibanaSpec holds the specification of a Kibana instance.
        '''
        props = KibanaProps(metadata=metadata, spec=spec)

        return typing.cast(typing.Any, jsii.sinvoke(cls, "manifest", [props]))

    @jsii.member(jsii_name="toJson")
    def to_json(self) -> typing.Any:
        '''Renders the object to Kubernetes JSON.'''
        return typing.cast(typing.Any, jsii.invoke(self, "toJson", []))

    @jsii.python.classproperty
    @jsii.member(jsii_name="GVK")
    def GVK(cls) -> _cdk8s_d3d9af27.GroupVersionKind:
        '''Returns the apiVersion and kind for "Kibana".'''
        return typing.cast(_cdk8s_d3d9af27.GroupVersionKind, jsii.sget(cls, "GVK"))


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaProps",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class KibanaProps:
    def __init__(
        self,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["KibanaSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Kibana represents a Kibana resource in a Kubernetes cluster.

        :param metadata: 
        :param spec: KibanaSpec holds the specification of a Kibana instance.

        :schema: Kibana
        '''
        if isinstance(metadata, dict):
            metadata = _cdk8s_d3d9af27.ApiObjectMetadata(**metadata)
        if isinstance(spec, dict):
            spec = KibanaSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__fb15d2272e8636a9cf8b32a2447467fdd13770d00e43fee0dc67959adffcd4a7)
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
        :schema: Kibana#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Optional[_cdk8s_d3d9af27.ApiObjectMetadata], result)

    @builtins.property
    def spec(self) -> typing.Optional["KibanaSpec"]:
        '''KibanaSpec holds the specification of a Kibana instance.

        :schema: Kibana#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["KibanaSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaProps(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpec",
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
class KibanaSpec:
    def __init__(
        self,
        *,
        version: builtins.str,
        config: typing.Any = None,
        count: typing.Optional[jsii.Number] = None,
        elasticsearch_ref: typing.Optional[typing.Union["KibanaSpecElasticsearchRef", typing.Dict[builtins.str, typing.Any]]] = None,
        http: typing.Optional[typing.Union["KibanaSpecHttp", typing.Dict[builtins.str, typing.Any]]] = None,
        image: typing.Optional[builtins.str] = None,
        pod_template: typing.Any = None,
        secure_settings: typing.Optional[typing.Sequence[typing.Union["KibanaSpecSecureSettings", typing.Dict[builtins.str, typing.Any]]]] = None,
        service_account_name: typing.Optional[builtins.str] = None,
    ) -> None:
        '''KibanaSpec holds the specification of a Kibana instance.

        :param version: Version of Kibana.
        :param config: Config holds the Kibana configuration. See: https://www.elastic.co/guide/en/kibana/current/settings.html
        :param count: Count of Kibana instances to deploy.
        :param elasticsearch_ref: ElasticsearchRef is a reference to an Elasticsearch cluster running in the same Kubernetes cluster.
        :param http: HTTP holds the HTTP layer configuration for Kibana.
        :param image: Image is the Kibana Docker image to deploy.
        :param pod_template: PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Kibana pods.
        :param secure_settings: SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Kibana.
        :param service_account_name: ServiceAccountName is used to check access from the current resource to a resource (eg. Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.

        :schema: KibanaSpec
        '''
        if isinstance(elasticsearch_ref, dict):
            elasticsearch_ref = KibanaSpecElasticsearchRef(**elasticsearch_ref)
        if isinstance(http, dict):
            http = KibanaSpecHttp(**http)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__de1ef571caf1301c70330130af2cd4985a5377ffacae5ccaee61f2ba54e6fc22)
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
        '''Version of Kibana.

        :schema: KibanaSpec#version
        '''
        result = self._values.get("version")
        assert result is not None, "Required property 'version' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def config(self) -> typing.Any:
        '''Config holds the Kibana configuration.

        See: https://www.elastic.co/guide/en/kibana/current/settings.html

        :schema: KibanaSpec#config
        '''
        result = self._values.get("config")
        return typing.cast(typing.Any, result)

    @builtins.property
    def count(self) -> typing.Optional[jsii.Number]:
        '''Count of Kibana instances to deploy.

        :schema: KibanaSpec#count
        '''
        result = self._values.get("count")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def elasticsearch_ref(self) -> typing.Optional["KibanaSpecElasticsearchRef"]:
        '''ElasticsearchRef is a reference to an Elasticsearch cluster running in the same Kubernetes cluster.

        :schema: KibanaSpec#elasticsearchRef
        '''
        result = self._values.get("elasticsearch_ref")
        return typing.cast(typing.Optional["KibanaSpecElasticsearchRef"], result)

    @builtins.property
    def http(self) -> typing.Optional["KibanaSpecHttp"]:
        '''HTTP holds the HTTP layer configuration for Kibana.

        :schema: KibanaSpec#http
        '''
        result = self._values.get("http")
        return typing.cast(typing.Optional["KibanaSpecHttp"], result)

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        '''Image is the Kibana Docker image to deploy.

        :schema: KibanaSpec#image
        '''
        result = self._values.get("image")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def pod_template(self) -> typing.Any:
        '''PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Kibana pods.

        :schema: KibanaSpec#podTemplate
        '''
        result = self._values.get("pod_template")
        return typing.cast(typing.Any, result)

    @builtins.property
    def secure_settings(
        self,
    ) -> typing.Optional[typing.List["KibanaSpecSecureSettings"]]:
        '''SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Kibana.

        :schema: KibanaSpec#secureSettings
        '''
        result = self._values.get("secure_settings")
        return typing.cast(typing.Optional[typing.List["KibanaSpecSecureSettings"]], result)

    @builtins.property
    def service_account_name(self) -> typing.Optional[builtins.str]:
        '''ServiceAccountName is used to check access from the current resource to a resource (eg.

        Elasticsearch) in a different namespace. Can only be used if ECK is enforcing RBAC on references.

        :schema: KibanaSpec#serviceAccountName
        '''
        result = self._values.get("service_account_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecElasticsearchRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "namespace": "namespace"},
)
class KibanaSpecElasticsearchRef:
    def __init__(
        self,
        *,
        name: builtins.str,
        namespace: typing.Optional[builtins.str] = None,
    ) -> None:
        '''ElasticsearchRef is a reference to an Elasticsearch cluster running in the same Kubernetes cluster.

        :param name: Name of the Kubernetes object.
        :param namespace: Namespace of the Kubernetes object. If empty, defaults to the current namespace.

        :schema: KibanaSpecElasticsearchRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__8e12010923fe01b419fe959369ce4f4df039df717418a9788477c774b3456082)
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

        :schema: KibanaSpecElasticsearchRef#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def namespace(self) -> typing.Optional[builtins.str]:
        '''Namespace of the Kubernetes object.

        If empty, defaults to the current namespace.

        :schema: KibanaSpecElasticsearchRef#namespace
        '''
        result = self._values.get("namespace")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecElasticsearchRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttp",
    jsii_struct_bases=[],
    name_mapping={"service": "service", "tls": "tls"},
)
class KibanaSpecHttp:
    def __init__(
        self,
        *,
        service: typing.Optional[typing.Union["KibanaSpecHttpService", typing.Dict[builtins.str, typing.Any]]] = None,
        tls: typing.Optional[typing.Union["KibanaSpecHttpTls", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''HTTP holds the HTTP layer configuration for Kibana.

        :param service: Service defines the template for the associated Kubernetes Service object.
        :param tls: TLS defines options for configuring TLS for HTTP.

        :schema: KibanaSpecHttp
        '''
        if isinstance(service, dict):
            service = KibanaSpecHttpService(**service)
        if isinstance(tls, dict):
            tls = KibanaSpecHttpTls(**tls)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__7c92c847d3c047de51be63a1c223e5a04566c10697e9e6e046c943a90010753b)
            check_type(argname="argument service", value=service, expected_type=type_hints["service"])
            check_type(argname="argument tls", value=tls, expected_type=type_hints["tls"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if service is not None:
            self._values["service"] = service
        if tls is not None:
            self._values["tls"] = tls

    @builtins.property
    def service(self) -> typing.Optional["KibanaSpecHttpService"]:
        '''Service defines the template for the associated Kubernetes Service object.

        :schema: KibanaSpecHttp#service
        '''
        result = self._values.get("service")
        return typing.cast(typing.Optional["KibanaSpecHttpService"], result)

    @builtins.property
    def tls(self) -> typing.Optional["KibanaSpecHttpTls"]:
        '''TLS defines options for configuring TLS for HTTP.

        :schema: KibanaSpecHttp#tls
        '''
        result = self._values.get("tls")
        return typing.cast(typing.Optional["KibanaSpecHttpTls"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpService",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class KibanaSpecHttpService:
    def __init__(
        self,
        *,
        metadata: typing.Any = None,
        spec: typing.Optional[typing.Union["KibanaSpecHttpServiceSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Service defines the template for the associated Kubernetes Service object.

        :param metadata: ObjectMeta is the metadata of the service. The name and namespace provided here are managed by ECK and will be ignored.
        :param spec: Spec is the specification of the service.

        :schema: KibanaSpecHttpService
        '''
        if isinstance(spec, dict):
            spec = KibanaSpecHttpServiceSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__a4ada1fc7d11a4b6009f106a089eb8713a8b0512086b6781165e540cf320feb0)
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

        :schema: KibanaSpecHttpService#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Any, result)

    @builtins.property
    def spec(self) -> typing.Optional["KibanaSpecHttpServiceSpec"]:
        '''Spec is the specification of the service.

        :schema: KibanaSpecHttpService#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["KibanaSpecHttpServiceSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpService(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpServiceSpec",
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
class KibanaSpecHttpServiceSpec:
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
        ports: typing.Optional[typing.Sequence[typing.Union["KibanaSpecHttpServiceSpecPorts", typing.Dict[builtins.str, typing.Any]]]] = None,
        publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
        selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        session_affinity: typing.Optional[builtins.str] = None,
        session_affinity_config: typing.Optional[typing.Union["KibanaSpecHttpServiceSpecSessionAffinityConfig", typing.Dict[builtins.str, typing.Any]]] = None,
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

        :schema: KibanaSpecHttpServiceSpec
        '''
        if isinstance(session_affinity_config, dict):
            session_affinity_config = KibanaSpecHttpServiceSpecSessionAffinityConfig(**session_affinity_config)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__bab38dcf3b9628700814b88d8272f9e52dec8d1f164ca3879a4e030979d783b4)
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

        :schema: KibanaSpecHttpServiceSpec#clusterIP
        '''
        result = self._values.get("cluster_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_i_ps(self) -> typing.Optional[typing.List[builtins.str]]:
        '''externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.

        These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.

        :schema: KibanaSpecHttpServiceSpec#externalIPs
        '''
        result = self._values.get("external_i_ps")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def external_name(self) -> typing.Optional[builtins.str]:
        '''externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service.

        No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.

        :schema: KibanaSpecHttpServiceSpec#externalName
        '''
        result = self._values.get("external_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_traffic_policy(self) -> typing.Optional[builtins.str]:
        '''externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.

        "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.

        :schema: KibanaSpecHttpServiceSpec#externalTrafficPolicy
        '''
        result = self._values.get("external_traffic_policy")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def health_check_node_port(self) -> typing.Optional[jsii.Number]:
        '''healthCheckNodePort specifies the healthcheck nodePort for the service.

        If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.

        :schema: KibanaSpecHttpServiceSpec#healthCheckNodePort
        '''
        result = self._values.get("health_check_node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def ip_family(self) -> typing.Optional[builtins.str]:
        '''ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.

        :schema: KibanaSpecHttpServiceSpec#ipFamily
        '''
        result = self._values.get("ip_family")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_ip(self) -> typing.Optional[builtins.str]:
        '''Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.

        This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.

        :schema: KibanaSpecHttpServiceSpec#loadBalancerIP
        '''
        result = self._values.get("load_balancer_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_source_ranges(self) -> typing.Optional[typing.List[builtins.str]]:
        '''If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.

        This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

        :schema: KibanaSpecHttpServiceSpec#loadBalancerSourceRanges
        '''
        result = self._values.get("load_balancer_source_ranges")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def ports(self) -> typing.Optional[typing.List["KibanaSpecHttpServiceSpecPorts"]]:
        '''The list of ports that are exposed by this service.

        More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: KibanaSpecHttpServiceSpec#ports
        '''
        result = self._values.get("ports")
        return typing.cast(typing.Optional[typing.List["KibanaSpecHttpServiceSpecPorts"]], result)

    @builtins.property
    def publish_not_ready_addresses(self) -> typing.Optional[builtins.bool]:
        '''publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service.

        The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.

        :schema: KibanaSpecHttpServiceSpec#publishNotReadyAddresses
        '''
        result = self._values.get("publish_not_ready_addresses")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def selector(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Route service traffic to pods with label keys and values matching this selector.

        If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/

        :schema: KibanaSpecHttpServiceSpec#selector
        '''
        result = self._values.get("selector")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def session_affinity(self) -> typing.Optional[builtins.str]:
        '''Supports "ClientIP" and "None".

        Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :default: None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: KibanaSpecHttpServiceSpec#sessionAffinity
        '''
        result = self._values.get("session_affinity")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def session_affinity_config(
        self,
    ) -> typing.Optional["KibanaSpecHttpServiceSpecSessionAffinityConfig"]:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :schema: KibanaSpecHttpServiceSpec#sessionAffinityConfig
        '''
        result = self._values.get("session_affinity_config")
        return typing.cast(typing.Optional["KibanaSpecHttpServiceSpecSessionAffinityConfig"], result)

    @builtins.property
    def topology_keys(self) -> typing.Optional[typing.List[builtins.str]]:
        '''topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local.

        Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.

        :schema: KibanaSpecHttpServiceSpec#topologyKeys
        '''
        result = self._values.get("topology_keys")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def type(self) -> typing.Optional[builtins.str]:
        '''type determines how the Service is exposed.

        Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :schema: KibanaSpecHttpServiceSpec#type
        '''
        result = self._values.get("type")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpServiceSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpServiceSpecPorts",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "name": "name",
        "node_port": "nodePort",
        "protocol": "protocol",
        "target_port": "targetPort",
    },
)
class KibanaSpecHttpServiceSpecPorts:
    def __init__(
        self,
        *,
        port: jsii.Number,
        name: typing.Optional[builtins.str] = None,
        node_port: typing.Optional[jsii.Number] = None,
        protocol: typing.Optional[builtins.str] = None,
        target_port: typing.Optional["KibanaSpecHttpServiceSpecPortsTargetPort"] = None,
    ) -> None:
        '''ServicePort contains information on service's port.

        :param port: The port that will be exposed by this service.
        :param name: The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
        :param node_port: The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport Default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
        :param protocol: The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP. Default: TCP.
        :param target_port: Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: KibanaSpecHttpServiceSpecPorts
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__689874af1429683b56b7f2eb2c7fd3de711950a84134dadc0f056507fccef2dd)
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

        :schema: KibanaSpecHttpServiceSpecPorts#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast(jsii.Number, result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''The name of this port within the service.

        This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.

        :schema: KibanaSpecHttpServiceSpecPorts#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def node_port(self) -> typing.Optional[jsii.Number]:
        '''The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

        Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :schema: KibanaSpecHttpServiceSpecPorts#nodePort
        '''
        result = self._values.get("node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def protocol(self) -> typing.Optional[builtins.str]:
        '''The IP protocol for this port.

        Supports "TCP", "UDP", and "SCTP". Default is TCP.

        :default: TCP.

        :schema: KibanaSpecHttpServiceSpecPorts#protocol
        '''
        result = self._values.get("protocol")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def target_port(
        self,
    ) -> typing.Optional["KibanaSpecHttpServiceSpecPortsTargetPort"]:
        '''Number or name of the port to access on the pods targeted by the service.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: KibanaSpecHttpServiceSpecPorts#targetPort
        '''
        result = self._values.get("target_port")
        return typing.cast(typing.Optional["KibanaSpecHttpServiceSpecPortsTargetPort"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpServiceSpecPorts(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class KibanaSpecHttpServiceSpecPortsTargetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8skibana.KibanaSpecHttpServiceSpecPortsTargetPort",
):
    '''Number or name of the port to access on the pods targeted by the service.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

    :schema: KibanaSpecHttpServiceSpecPortsTargetPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "KibanaSpecHttpServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__813695ae95c8e8ffc07bb2fdba98af99d5df1f3a0392f285e9b974ea10b7f2bf)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("KibanaSpecHttpServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "KibanaSpecHttpServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__98b90cf2c767fe0bed54b18eeb250ac468ce26f282a470d5ce289332e66e3b48)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("KibanaSpecHttpServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpServiceSpecSessionAffinityConfig",
    jsii_struct_bases=[],
    name_mapping={"client_ip": "clientIp"},
)
class KibanaSpecHttpServiceSpecSessionAffinityConfig:
    def __init__(
        self,
        *,
        client_ip: typing.Optional[typing.Union["KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :param client_ip: clientIP contains the configurations of Client IP based session affinity.

        :schema: KibanaSpecHttpServiceSpecSessionAffinityConfig
        '''
        if isinstance(client_ip, dict):
            client_ip = KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp(**client_ip)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__53930eb1f2b246c775153731c8813356bca2eadaeb95eefa20560152d0b9cd71)
            check_type(argname="argument client_ip", value=client_ip, expected_type=type_hints["client_ip"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if client_ip is not None:
            self._values["client_ip"] = client_ip

    @builtins.property
    def client_ip(
        self,
    ) -> typing.Optional["KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp"]:
        '''clientIP contains the configurations of Client IP based session affinity.

        :schema: KibanaSpecHttpServiceSpecSessionAffinityConfig#clientIP
        '''
        result = self._values.get("client_ip")
        return typing.cast(typing.Optional["KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpServiceSpecSessionAffinityConfig(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp",
    jsii_struct_bases=[],
    name_mapping={"timeout_seconds": "timeoutSeconds"},
)
class KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp:
    def __init__(self, *, timeout_seconds: typing.Optional[jsii.Number] = None) -> None:
        '''clientIP contains the configurations of Client IP based session affinity.

        :param timeout_seconds: timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__705e751d6c7fc42e903398cb5a5d1cdae352e4c2c0af37c9f6ca183c360aab32)
            check_type(argname="argument timeout_seconds", value=timeout_seconds, expected_type=type_hints["timeout_seconds"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if timeout_seconds is not None:
            self._values["timeout_seconds"] = timeout_seconds

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        '''timeoutSeconds specifies the seconds of ClientIP type session sticky time.

        The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp#timeoutSeconds
        '''
        result = self._values.get("timeout_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpTls",
    jsii_struct_bases=[],
    name_mapping={
        "certificate": "certificate",
        "self_signed_certificate": "selfSignedCertificate",
    },
)
class KibanaSpecHttpTls:
    def __init__(
        self,
        *,
        certificate: typing.Optional[typing.Union["KibanaSpecHttpTlsCertificate", typing.Dict[builtins.str, typing.Any]]] = None,
        self_signed_certificate: typing.Optional[typing.Union["KibanaSpecHttpTlsSelfSignedCertificate", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''TLS defines options for configuring TLS for HTTP.

        :param certificate: Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS. The referenced secret should contain the following: - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.
        :param self_signed_certificate: SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :schema: KibanaSpecHttpTls
        '''
        if isinstance(certificate, dict):
            certificate = KibanaSpecHttpTlsCertificate(**certificate)
        if isinstance(self_signed_certificate, dict):
            self_signed_certificate = KibanaSpecHttpTlsSelfSignedCertificate(**self_signed_certificate)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__9ccb08a985107d9f01a6e7fb2d01295b0441df599a9cda0c1969b14d9c7b93ae)
            check_type(argname="argument certificate", value=certificate, expected_type=type_hints["certificate"])
            check_type(argname="argument self_signed_certificate", value=self_signed_certificate, expected_type=type_hints["self_signed_certificate"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if certificate is not None:
            self._values["certificate"] = certificate
        if self_signed_certificate is not None:
            self._values["self_signed_certificate"] = self_signed_certificate

    @builtins.property
    def certificate(self) -> typing.Optional["KibanaSpecHttpTlsCertificate"]:
        '''Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.

        The referenced secret should contain the following:

        - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.

        :schema: KibanaSpecHttpTls#certificate
        '''
        result = self._values.get("certificate")
        return typing.cast(typing.Optional["KibanaSpecHttpTlsCertificate"], result)

    @builtins.property
    def self_signed_certificate(
        self,
    ) -> typing.Optional["KibanaSpecHttpTlsSelfSignedCertificate"]:
        '''SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :schema: KibanaSpecHttpTls#selfSignedCertificate
        '''
        result = self._values.get("self_signed_certificate")
        return typing.cast(typing.Optional["KibanaSpecHttpTlsSelfSignedCertificate"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpTls(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpTlsCertificate",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName"},
)
class KibanaSpecHttpTlsCertificate:
    def __init__(self, *, secret_name: typing.Optional[builtins.str] = None) -> None:
        '''Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.

        The referenced secret should contain the following:

        - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.

        :param secret_name: SecretName is the name of the secret.

        :schema: KibanaSpecHttpTlsCertificate
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__3d35a7da6fef78f9670a9e47a26be23c7589c86baa78b5ebbf8625b60bd0c6ad)
            check_type(argname="argument secret_name", value=secret_name, expected_type=type_hints["secret_name"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if secret_name is not None:
            self._values["secret_name"] = secret_name

    @builtins.property
    def secret_name(self) -> typing.Optional[builtins.str]:
        '''SecretName is the name of the secret.

        :schema: KibanaSpecHttpTlsCertificate#secretName
        '''
        result = self._values.get("secret_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpTlsCertificate(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpTlsSelfSignedCertificate",
    jsii_struct_bases=[],
    name_mapping={"disabled": "disabled", "subject_alt_names": "subjectAltNames"},
)
class KibanaSpecHttpTlsSelfSignedCertificate:
    def __init__(
        self,
        *,
        disabled: typing.Optional[builtins.bool] = None,
        subject_alt_names: typing.Optional[typing.Sequence[typing.Union["KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :param disabled: Disabled indicates that the provisioning of the self-signed certifcate should be disabled.
        :param subject_alt_names: SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.

        :schema: KibanaSpecHttpTlsSelfSignedCertificate
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__868846fd261adfd85f65f099cf536b6803f557dd87a6f2815c1afebb97476a30)
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

        :schema: KibanaSpecHttpTlsSelfSignedCertificate#disabled
        '''
        result = self._values.get("disabled")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def subject_alt_names(
        self,
    ) -> typing.Optional[typing.List["KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames"]]:
        '''SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.

        :schema: KibanaSpecHttpTlsSelfSignedCertificate#subjectAltNames
        '''
        result = self._values.get("subject_alt_names")
        return typing.cast(typing.Optional[typing.List["KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpTlsSelfSignedCertificate(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames",
    jsii_struct_bases=[],
    name_mapping={"dns": "dns", "ip": "ip"},
)
class KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames:
    def __init__(
        self,
        *,
        dns: typing.Optional[builtins.str] = None,
        ip: typing.Optional[builtins.str] = None,
    ) -> None:
        '''SubjectAlternativeName represents a SAN entry in a x509 certificate.

        :param dns: DNS is the DNS name of the subject.
        :param ip: IP is the IP address of the subject.

        :schema: KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__af8fc9aeed09cfbc3f3029fb3beb8c0bdcf39abe131bf1986bc7b6a85ebf03ff)
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

        :schema: KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames#dns
        '''
        result = self._values.get("dns")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def ip(self) -> typing.Optional[builtins.str]:
        '''IP is the IP address of the subject.

        :schema: KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames#ip
        '''
        result = self._values.get("ip")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecSecureSettings",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName", "entries": "entries"},
)
class KibanaSpecSecureSettings:
    def __init__(
        self,
        *,
        secret_name: builtins.str,
        entries: typing.Optional[typing.Sequence[typing.Union["KibanaSpecSecureSettingsEntries", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''SecretSource defines a data source based on a Kubernetes Secret.

        :param secret_name: SecretName is the name of the secret.
        :param entries: Entries define how to project each key-value pair in the secret to filesystem paths. If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.

        :schema: KibanaSpecSecureSettings
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__820c1c3a25fb056ca5d4b7d6545774fc3f93c91167d1f5c0dd3aafa7f21425c3)
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

        :schema: KibanaSpecSecureSettings#secretName
        '''
        result = self._values.get("secret_name")
        assert result is not None, "Required property 'secret_name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def entries(
        self,
    ) -> typing.Optional[typing.List["KibanaSpecSecureSettingsEntries"]]:
        '''Entries define how to project each key-value pair in the secret to filesystem paths.

        If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.

        :schema: KibanaSpecSecureSettings#entries
        '''
        result = self._values.get("entries")
        return typing.cast(typing.Optional[typing.List["KibanaSpecSecureSettingsEntries"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecSecureSettings(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8skibana.KibanaSpecSecureSettingsEntries",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "path": "path"},
)
class KibanaSpecSecureSettingsEntries:
    def __init__(
        self,
        *,
        key: builtins.str,
        path: typing.Optional[builtins.str] = None,
    ) -> None:
        '''KeyToPath defines how to map a key in a Secret object to a filesystem path.

        :param key: Key is the key contained in the secret.
        :param path: Path is the relative file path to map the key to. Path must not be an absolute file path and must not contain any ".." components.

        :schema: KibanaSpecSecureSettingsEntries
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__7457d633360f22dcf35e7dc2d29043370784a30bf144ef5f85f9b000acfd7296)
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

        :schema: KibanaSpecSecureSettingsEntries#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def path(self) -> typing.Optional[builtins.str]:
        '''Path is the relative file path to map the key to.

        Path must not be an absolute file path and must not contain any ".." components.

        :schema: KibanaSpecSecureSettingsEntries#path
        '''
        result = self._values.get("path")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "KibanaSpecSecureSettingsEntries(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "Kibana",
    "KibanaProps",
    "KibanaSpec",
    "KibanaSpecElasticsearchRef",
    "KibanaSpecHttp",
    "KibanaSpecHttpService",
    "KibanaSpecHttpServiceSpec",
    "KibanaSpecHttpServiceSpecPorts",
    "KibanaSpecHttpServiceSpecPortsTargetPort",
    "KibanaSpecHttpServiceSpecSessionAffinityConfig",
    "KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp",
    "KibanaSpecHttpTls",
    "KibanaSpecHttpTlsCertificate",
    "KibanaSpecHttpTlsSelfSignedCertificate",
    "KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames",
    "KibanaSpecSecureSettings",
    "KibanaSpecSecureSettingsEntries",
]

publication.publish()

def _typecheckingstub__5e456b030e7f9f1ddeee1c401f01da842a8ba1596725f8b3a1a4ed80c4c355e0(
    scope: _constructs_77d1e7e8.Construct,
    id: builtins.str,
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[KibanaSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__fb15d2272e8636a9cf8b32a2447467fdd13770d00e43fee0dc67959adffcd4a7(
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[KibanaSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__de1ef571caf1301c70330130af2cd4985a5377ffacae5ccaee61f2ba54e6fc22(
    *,
    version: builtins.str,
    config: typing.Any = None,
    count: typing.Optional[jsii.Number] = None,
    elasticsearch_ref: typing.Optional[typing.Union[KibanaSpecElasticsearchRef, typing.Dict[builtins.str, typing.Any]]] = None,
    http: typing.Optional[typing.Union[KibanaSpecHttp, typing.Dict[builtins.str, typing.Any]]] = None,
    image: typing.Optional[builtins.str] = None,
    pod_template: typing.Any = None,
    secure_settings: typing.Optional[typing.Sequence[typing.Union[KibanaSpecSecureSettings, typing.Dict[builtins.str, typing.Any]]]] = None,
    service_account_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__8e12010923fe01b419fe959369ce4f4df039df717418a9788477c774b3456082(
    *,
    name: builtins.str,
    namespace: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__7c92c847d3c047de51be63a1c223e5a04566c10697e9e6e046c943a90010753b(
    *,
    service: typing.Optional[typing.Union[KibanaSpecHttpService, typing.Dict[builtins.str, typing.Any]]] = None,
    tls: typing.Optional[typing.Union[KibanaSpecHttpTls, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__a4ada1fc7d11a4b6009f106a089eb8713a8b0512086b6781165e540cf320feb0(
    *,
    metadata: typing.Any = None,
    spec: typing.Optional[typing.Union[KibanaSpecHttpServiceSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__bab38dcf3b9628700814b88d8272f9e52dec8d1f164ca3879a4e030979d783b4(
    *,
    cluster_ip: typing.Optional[builtins.str] = None,
    external_i_ps: typing.Optional[typing.Sequence[builtins.str]] = None,
    external_name: typing.Optional[builtins.str] = None,
    external_traffic_policy: typing.Optional[builtins.str] = None,
    health_check_node_port: typing.Optional[jsii.Number] = None,
    ip_family: typing.Optional[builtins.str] = None,
    load_balancer_ip: typing.Optional[builtins.str] = None,
    load_balancer_source_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
    ports: typing.Optional[typing.Sequence[typing.Union[KibanaSpecHttpServiceSpecPorts, typing.Dict[builtins.str, typing.Any]]]] = None,
    publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
    selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    session_affinity: typing.Optional[builtins.str] = None,
    session_affinity_config: typing.Optional[typing.Union[KibanaSpecHttpServiceSpecSessionAffinityConfig, typing.Dict[builtins.str, typing.Any]]] = None,
    topology_keys: typing.Optional[typing.Sequence[builtins.str]] = None,
    type: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__689874af1429683b56b7f2eb2c7fd3de711950a84134dadc0f056507fccef2dd(
    *,
    port: jsii.Number,
    name: typing.Optional[builtins.str] = None,
    node_port: typing.Optional[jsii.Number] = None,
    protocol: typing.Optional[builtins.str] = None,
    target_port: typing.Optional[KibanaSpecHttpServiceSpecPortsTargetPort] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__813695ae95c8e8ffc07bb2fdba98af99d5df1f3a0392f285e9b974ea10b7f2bf(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__98b90cf2c767fe0bed54b18eeb250ac468ce26f282a470d5ce289332e66e3b48(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__53930eb1f2b246c775153731c8813356bca2eadaeb95eefa20560152d0b9cd71(
    *,
    client_ip: typing.Optional[typing.Union[KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__705e751d6c7fc42e903398cb5a5d1cdae352e4c2c0af37c9f6ca183c360aab32(
    *,
    timeout_seconds: typing.Optional[jsii.Number] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__9ccb08a985107d9f01a6e7fb2d01295b0441df599a9cda0c1969b14d9c7b93ae(
    *,
    certificate: typing.Optional[typing.Union[KibanaSpecHttpTlsCertificate, typing.Dict[builtins.str, typing.Any]]] = None,
    self_signed_certificate: typing.Optional[typing.Union[KibanaSpecHttpTlsSelfSignedCertificate, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__3d35a7da6fef78f9670a9e47a26be23c7589c86baa78b5ebbf8625b60bd0c6ad(
    *,
    secret_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__868846fd261adfd85f65f099cf536b6803f557dd87a6f2815c1afebb97476a30(
    *,
    disabled: typing.Optional[builtins.bool] = None,
    subject_alt_names: typing.Optional[typing.Sequence[typing.Union[KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__af8fc9aeed09cfbc3f3029fb3beb8c0bdcf39abe131bf1986bc7b6a85ebf03ff(
    *,
    dns: typing.Optional[builtins.str] = None,
    ip: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__820c1c3a25fb056ca5d4b7d6545774fc3f93c91167d1f5c0dd3aafa7f21425c3(
    *,
    secret_name: builtins.str,
    entries: typing.Optional[typing.Sequence[typing.Union[KibanaSpecSecureSettingsEntries, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__7457d633360f22dcf35e7dc2d29043370784a30bf144ef5f85f9b000acfd7296(
    *,
    key: builtins.str,
    path: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass
