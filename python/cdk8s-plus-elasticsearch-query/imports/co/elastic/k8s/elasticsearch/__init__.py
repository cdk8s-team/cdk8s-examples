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


class Elasticsearch(
    _cdk8s_d3d9af27.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.Elasticsearch",
):
    '''Elasticsearch represents an Elasticsearch resource in a Kubernetes cluster.

    :schema: Elasticsearch
    '''

    def __init__(
        self,
        scope: _constructs_77d1e7e8.Construct,
        id: builtins.str,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["ElasticsearchSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Defines a "Elasticsearch" API object.

        :param scope: the scope in which to define this object.
        :param id: a scope-local name for the object.
        :param metadata: 
        :param spec: ElasticsearchSpec holds the specification of an Elasticsearch cluster.
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__cff49251abdb9bc40dc010529b39465d1ea11e8af5fe7572663447945f233b48)
            check_type(argname="argument scope", value=scope, expected_type=type_hints["scope"])
            check_type(argname="argument id", value=id, expected_type=type_hints["id"])
        props = ElasticsearchProps(metadata=metadata, spec=spec)

        jsii.create(self.__class__, self, [scope, id, props])

    @jsii.member(jsii_name="manifest")
    @builtins.classmethod
    def manifest(
        cls,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["ElasticsearchSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> typing.Any:
        '''Renders a Kubernetes manifest for "Elasticsearch".

        This can be used to inline resource manifests inside other objects (e.g. as templates).

        :param metadata: 
        :param spec: ElasticsearchSpec holds the specification of an Elasticsearch cluster.
        '''
        props = ElasticsearchProps(metadata=metadata, spec=spec)

        return typing.cast(typing.Any, jsii.sinvoke(cls, "manifest", [props]))

    @jsii.member(jsii_name="toJson")
    def to_json(self) -> typing.Any:
        '''Renders the object to Kubernetes JSON.'''
        return typing.cast(typing.Any, jsii.invoke(self, "toJson", []))

    @jsii.python.classproperty
    @jsii.member(jsii_name="GVK")
    def GVK(cls) -> _cdk8s_d3d9af27.GroupVersionKind:
        '''Returns the apiVersion and kind for "Elasticsearch".'''
        return typing.cast(_cdk8s_d3d9af27.GroupVersionKind, jsii.sget(cls, "GVK"))


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchProps",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class ElasticsearchProps:
    def __init__(
        self,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["ElasticsearchSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Elasticsearch represents an Elasticsearch resource in a Kubernetes cluster.

        :param metadata: 
        :param spec: ElasticsearchSpec holds the specification of an Elasticsearch cluster.

        :schema: Elasticsearch
        '''
        if isinstance(metadata, dict):
            metadata = _cdk8s_d3d9af27.ApiObjectMetadata(**metadata)
        if isinstance(spec, dict):
            spec = ElasticsearchSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__a2ff91b5fa5c005dc0c0c8190052ea03c7f1232426b43511f8a30c637128c57a)
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
        :schema: Elasticsearch#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Optional[_cdk8s_d3d9af27.ApiObjectMetadata], result)

    @builtins.property
    def spec(self) -> typing.Optional["ElasticsearchSpec"]:
        '''ElasticsearchSpec holds the specification of an Elasticsearch cluster.

        :schema: Elasticsearch#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["ElasticsearchSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchProps(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpec",
    jsii_struct_bases=[],
    name_mapping={
        "node_sets": "nodeSets",
        "version": "version",
        "auth": "auth",
        "http": "http",
        "image": "image",
        "pod_disruption_budget": "podDisruptionBudget",
        "remote_clusters": "remoteClusters",
        "secure_settings": "secureSettings",
        "service_account_name": "serviceAccountName",
        "transport": "transport",
        "update_strategy": "updateStrategy",
    },
)
class ElasticsearchSpec:
    def __init__(
        self,
        *,
        node_sets: typing.Sequence[typing.Union["ElasticsearchSpecNodeSets", typing.Dict[builtins.str, typing.Any]]],
        version: builtins.str,
        auth: typing.Optional[typing.Union["ElasticsearchSpecAuth", typing.Dict[builtins.str, typing.Any]]] = None,
        http: typing.Optional[typing.Union["ElasticsearchSpecHttp", typing.Dict[builtins.str, typing.Any]]] = None,
        image: typing.Optional[builtins.str] = None,
        pod_disruption_budget: typing.Optional[typing.Union["ElasticsearchSpecPodDisruptionBudget", typing.Dict[builtins.str, typing.Any]]] = None,
        remote_clusters: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecRemoteClusters", typing.Dict[builtins.str, typing.Any]]]] = None,
        secure_settings: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecSecureSettings", typing.Dict[builtins.str, typing.Any]]]] = None,
        service_account_name: typing.Optional[builtins.str] = None,
        transport: typing.Optional[typing.Union["ElasticsearchSpecTransport", typing.Dict[builtins.str, typing.Any]]] = None,
        update_strategy: typing.Optional[typing.Union["ElasticsearchSpecUpdateStrategy", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''ElasticsearchSpec holds the specification of an Elasticsearch cluster.

        :param node_sets: NodeSets allow specifying groups of Elasticsearch nodes sharing the same configuration and Pod templates. See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-orchestration.html
        :param version: Version of Elasticsearch.
        :param auth: Auth contains user authentication and authorization security settings for Elasticsearch.
        :param http: HTTP holds HTTP layer settings for Elasticsearch.
        :param image: Image is the Elasticsearch Docker image to deploy.
        :param pod_disruption_budget: PodDisruptionBudget provides access to the default pod disruption budget for the Elasticsearch cluster. The default budget selects all cluster pods and sets ``maxUnavailable`` to 1. To disable, set ``PodDisruptionBudget`` to the empty value (``{}`` in YAML).
        :param remote_clusters: RemoteClusters enables you to establish uni-directional connections to a remote Elasticsearch cluster.
        :param secure_settings: SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Elasticsearch.
        :param service_account_name: ServiceAccountName is used to check access from the current resource to a resource (eg. a remote Elasticsearch cluster) in a different namespace. Can only be used if ECK is enforcing RBAC on references.
        :param transport: Transport holds transport layer settings for Elasticsearch.
        :param update_strategy: UpdateStrategy specifies how updates to the cluster should be performed.

        :schema: ElasticsearchSpec
        '''
        if isinstance(auth, dict):
            auth = ElasticsearchSpecAuth(**auth)
        if isinstance(http, dict):
            http = ElasticsearchSpecHttp(**http)
        if isinstance(pod_disruption_budget, dict):
            pod_disruption_budget = ElasticsearchSpecPodDisruptionBudget(**pod_disruption_budget)
        if isinstance(transport, dict):
            transport = ElasticsearchSpecTransport(**transport)
        if isinstance(update_strategy, dict):
            update_strategy = ElasticsearchSpecUpdateStrategy(**update_strategy)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__c6eef5c525b0140cddde99d1631259a5871adb8196d7f0456a2a9d947c378681)
            check_type(argname="argument node_sets", value=node_sets, expected_type=type_hints["node_sets"])
            check_type(argname="argument version", value=version, expected_type=type_hints["version"])
            check_type(argname="argument auth", value=auth, expected_type=type_hints["auth"])
            check_type(argname="argument http", value=http, expected_type=type_hints["http"])
            check_type(argname="argument image", value=image, expected_type=type_hints["image"])
            check_type(argname="argument pod_disruption_budget", value=pod_disruption_budget, expected_type=type_hints["pod_disruption_budget"])
            check_type(argname="argument remote_clusters", value=remote_clusters, expected_type=type_hints["remote_clusters"])
            check_type(argname="argument secure_settings", value=secure_settings, expected_type=type_hints["secure_settings"])
            check_type(argname="argument service_account_name", value=service_account_name, expected_type=type_hints["service_account_name"])
            check_type(argname="argument transport", value=transport, expected_type=type_hints["transport"])
            check_type(argname="argument update_strategy", value=update_strategy, expected_type=type_hints["update_strategy"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "node_sets": node_sets,
            "version": version,
        }
        if auth is not None:
            self._values["auth"] = auth
        if http is not None:
            self._values["http"] = http
        if image is not None:
            self._values["image"] = image
        if pod_disruption_budget is not None:
            self._values["pod_disruption_budget"] = pod_disruption_budget
        if remote_clusters is not None:
            self._values["remote_clusters"] = remote_clusters
        if secure_settings is not None:
            self._values["secure_settings"] = secure_settings
        if service_account_name is not None:
            self._values["service_account_name"] = service_account_name
        if transport is not None:
            self._values["transport"] = transport
        if update_strategy is not None:
            self._values["update_strategy"] = update_strategy

    @builtins.property
    def node_sets(self) -> typing.List["ElasticsearchSpecNodeSets"]:
        '''NodeSets allow specifying groups of Elasticsearch nodes sharing the same configuration and Pod templates.

        See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-orchestration.html

        :schema: ElasticsearchSpec#nodeSets
        '''
        result = self._values.get("node_sets")
        assert result is not None, "Required property 'node_sets' is missing"
        return typing.cast(typing.List["ElasticsearchSpecNodeSets"], result)

    @builtins.property
    def version(self) -> builtins.str:
        '''Version of Elasticsearch.

        :schema: ElasticsearchSpec#version
        '''
        result = self._values.get("version")
        assert result is not None, "Required property 'version' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def auth(self) -> typing.Optional["ElasticsearchSpecAuth"]:
        '''Auth contains user authentication and authorization security settings for Elasticsearch.

        :schema: ElasticsearchSpec#auth
        '''
        result = self._values.get("auth")
        return typing.cast(typing.Optional["ElasticsearchSpecAuth"], result)

    @builtins.property
    def http(self) -> typing.Optional["ElasticsearchSpecHttp"]:
        '''HTTP holds HTTP layer settings for Elasticsearch.

        :schema: ElasticsearchSpec#http
        '''
        result = self._values.get("http")
        return typing.cast(typing.Optional["ElasticsearchSpecHttp"], result)

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        '''Image is the Elasticsearch Docker image to deploy.

        :schema: ElasticsearchSpec#image
        '''
        result = self._values.get("image")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def pod_disruption_budget(
        self,
    ) -> typing.Optional["ElasticsearchSpecPodDisruptionBudget"]:
        '''PodDisruptionBudget provides access to the default pod disruption budget for the Elasticsearch cluster.

        The default budget selects all cluster pods and sets ``maxUnavailable`` to 1. To disable, set ``PodDisruptionBudget`` to the empty value (``{}`` in YAML).

        :schema: ElasticsearchSpec#podDisruptionBudget
        '''
        result = self._values.get("pod_disruption_budget")
        return typing.cast(typing.Optional["ElasticsearchSpecPodDisruptionBudget"], result)

    @builtins.property
    def remote_clusters(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecRemoteClusters"]]:
        '''RemoteClusters enables you to establish uni-directional connections to a remote Elasticsearch cluster.

        :schema: ElasticsearchSpec#remoteClusters
        '''
        result = self._values.get("remote_clusters")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecRemoteClusters"]], result)

    @builtins.property
    def secure_settings(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecSecureSettings"]]:
        '''SecureSettings is a list of references to Kubernetes secrets containing sensitive configuration options for Elasticsearch.

        :schema: ElasticsearchSpec#secureSettings
        '''
        result = self._values.get("secure_settings")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecSecureSettings"]], result)

    @builtins.property
    def service_account_name(self) -> typing.Optional[builtins.str]:
        '''ServiceAccountName is used to check access from the current resource to a resource (eg.

        a remote Elasticsearch cluster) in a different namespace. Can only be used if ECK is enforcing RBAC on references.

        :schema: ElasticsearchSpec#serviceAccountName
        '''
        result = self._values.get("service_account_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def transport(self) -> typing.Optional["ElasticsearchSpecTransport"]:
        '''Transport holds transport layer settings for Elasticsearch.

        :schema: ElasticsearchSpec#transport
        '''
        result = self._values.get("transport")
        return typing.cast(typing.Optional["ElasticsearchSpecTransport"], result)

    @builtins.property
    def update_strategy(self) -> typing.Optional["ElasticsearchSpecUpdateStrategy"]:
        '''UpdateStrategy specifies how updates to the cluster should be performed.

        :schema: ElasticsearchSpec#updateStrategy
        '''
        result = self._values.get("update_strategy")
        return typing.cast(typing.Optional["ElasticsearchSpecUpdateStrategy"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecAuth",
    jsii_struct_bases=[],
    name_mapping={"file_realm": "fileRealm", "roles": "roles"},
)
class ElasticsearchSpecAuth:
    def __init__(
        self,
        *,
        file_realm: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecAuthFileRealm", typing.Dict[builtins.str, typing.Any]]]] = None,
        roles: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecAuthRoles", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''Auth contains user authentication and authorization security settings for Elasticsearch.

        :param file_realm: FileRealm to propagate to the Elasticsearch cluster.
        :param roles: Roles to propagate to the Elasticsearch cluster.

        :schema: ElasticsearchSpecAuth
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__014be2e01e8ecafba07c29f3adba7ad45de29b4ccdae036e2f8e6dbf0c7edb12)
            check_type(argname="argument file_realm", value=file_realm, expected_type=type_hints["file_realm"])
            check_type(argname="argument roles", value=roles, expected_type=type_hints["roles"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if file_realm is not None:
            self._values["file_realm"] = file_realm
        if roles is not None:
            self._values["roles"] = roles

    @builtins.property
    def file_realm(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecAuthFileRealm"]]:
        '''FileRealm to propagate to the Elasticsearch cluster.

        :schema: ElasticsearchSpecAuth#fileRealm
        '''
        result = self._values.get("file_realm")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecAuthFileRealm"]], result)

    @builtins.property
    def roles(self) -> typing.Optional[typing.List["ElasticsearchSpecAuthRoles"]]:
        '''Roles to propagate to the Elasticsearch cluster.

        :schema: ElasticsearchSpecAuth#roles
        '''
        result = self._values.get("roles")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecAuthRoles"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecAuth(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecAuthFileRealm",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName"},
)
class ElasticsearchSpecAuthFileRealm:
    def __init__(self, *, secret_name: typing.Optional[builtins.str] = None) -> None:
        '''FileRealmSource references users to create in the Elasticsearch cluster.

        :param secret_name: SecretName is the name of the secret.

        :schema: ElasticsearchSpecAuthFileRealm
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ab97c2f772134b0ffd54af352cd50e1e2f7eebc4ee2082ade51a096c01270f92)
            check_type(argname="argument secret_name", value=secret_name, expected_type=type_hints["secret_name"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if secret_name is not None:
            self._values["secret_name"] = secret_name

    @builtins.property
    def secret_name(self) -> typing.Optional[builtins.str]:
        '''SecretName is the name of the secret.

        :schema: ElasticsearchSpecAuthFileRealm#secretName
        '''
        result = self._values.get("secret_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecAuthFileRealm(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecAuthRoles",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName"},
)
class ElasticsearchSpecAuthRoles:
    def __init__(self, *, secret_name: typing.Optional[builtins.str] = None) -> None:
        '''RoleSource references roles to create in the Elasticsearch cluster.

        :param secret_name: SecretName is the name of the secret.

        :schema: ElasticsearchSpecAuthRoles
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__f74c6873123c00453468fbbd191137d108675682e4c5f1eb5508bf357a67e335)
            check_type(argname="argument secret_name", value=secret_name, expected_type=type_hints["secret_name"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if secret_name is not None:
            self._values["secret_name"] = secret_name

    @builtins.property
    def secret_name(self) -> typing.Optional[builtins.str]:
        '''SecretName is the name of the secret.

        :schema: ElasticsearchSpecAuthRoles#secretName
        '''
        result = self._values.get("secret_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecAuthRoles(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttp",
    jsii_struct_bases=[],
    name_mapping={"service": "service", "tls": "tls"},
)
class ElasticsearchSpecHttp:
    def __init__(
        self,
        *,
        service: typing.Optional[typing.Union["ElasticsearchSpecHttpService", typing.Dict[builtins.str, typing.Any]]] = None,
        tls: typing.Optional[typing.Union["ElasticsearchSpecHttpTls", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''HTTP holds HTTP layer settings for Elasticsearch.

        :param service: Service defines the template for the associated Kubernetes Service object.
        :param tls: TLS defines options for configuring TLS for HTTP.

        :schema: ElasticsearchSpecHttp
        '''
        if isinstance(service, dict):
            service = ElasticsearchSpecHttpService(**service)
        if isinstance(tls, dict):
            tls = ElasticsearchSpecHttpTls(**tls)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__b26bfbe66ad0d5c0f44c4464fa8fb7c1394e6ae6a9109e6d681de36d0c26a392)
            check_type(argname="argument service", value=service, expected_type=type_hints["service"])
            check_type(argname="argument tls", value=tls, expected_type=type_hints["tls"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if service is not None:
            self._values["service"] = service
        if tls is not None:
            self._values["tls"] = tls

    @builtins.property
    def service(self) -> typing.Optional["ElasticsearchSpecHttpService"]:
        '''Service defines the template for the associated Kubernetes Service object.

        :schema: ElasticsearchSpecHttp#service
        '''
        result = self._values.get("service")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpService"], result)

    @builtins.property
    def tls(self) -> typing.Optional["ElasticsearchSpecHttpTls"]:
        '''TLS defines options for configuring TLS for HTTP.

        :schema: ElasticsearchSpecHttp#tls
        '''
        result = self._values.get("tls")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpTls"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpService",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class ElasticsearchSpecHttpService:
    def __init__(
        self,
        *,
        metadata: typing.Any = None,
        spec: typing.Optional[typing.Union["ElasticsearchSpecHttpServiceSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Service defines the template for the associated Kubernetes Service object.

        :param metadata: ObjectMeta is the metadata of the service. The name and namespace provided here are managed by ECK and will be ignored.
        :param spec: Spec is the specification of the service.

        :schema: ElasticsearchSpecHttpService
        '''
        if isinstance(spec, dict):
            spec = ElasticsearchSpecHttpServiceSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__147ecf31c16c5cc1934011e5c9f84b9626335d3b0d7cbccc710dcf7198fa8cc8)
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

        :schema: ElasticsearchSpecHttpService#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Any, result)

    @builtins.property
    def spec(self) -> typing.Optional["ElasticsearchSpecHttpServiceSpec"]:
        '''Spec is the specification of the service.

        :schema: ElasticsearchSpecHttpService#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpServiceSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpService(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpServiceSpec",
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
class ElasticsearchSpecHttpServiceSpec:
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
        ports: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecHttpServiceSpecPorts", typing.Dict[builtins.str, typing.Any]]]] = None,
        publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
        selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        session_affinity: typing.Optional[builtins.str] = None,
        session_affinity_config: typing.Optional[typing.Union["ElasticsearchSpecHttpServiceSpecSessionAffinityConfig", typing.Dict[builtins.str, typing.Any]]] = None,
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

        :schema: ElasticsearchSpecHttpServiceSpec
        '''
        if isinstance(session_affinity_config, dict):
            session_affinity_config = ElasticsearchSpecHttpServiceSpecSessionAffinityConfig(**session_affinity_config)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__64fc7a16e4a9e27eb6f43d07c225f9c63d809d7f224fa9855636e1b15e3e976a)
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

        :schema: ElasticsearchSpecHttpServiceSpec#clusterIP
        '''
        result = self._values.get("cluster_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_i_ps(self) -> typing.Optional[typing.List[builtins.str]]:
        '''externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.

        These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.

        :schema: ElasticsearchSpecHttpServiceSpec#externalIPs
        '''
        result = self._values.get("external_i_ps")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def external_name(self) -> typing.Optional[builtins.str]:
        '''externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service.

        No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.

        :schema: ElasticsearchSpecHttpServiceSpec#externalName
        '''
        result = self._values.get("external_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_traffic_policy(self) -> typing.Optional[builtins.str]:
        '''externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.

        "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.

        :schema: ElasticsearchSpecHttpServiceSpec#externalTrafficPolicy
        '''
        result = self._values.get("external_traffic_policy")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def health_check_node_port(self) -> typing.Optional[jsii.Number]:
        '''healthCheckNodePort specifies the healthcheck nodePort for the service.

        If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.

        :schema: ElasticsearchSpecHttpServiceSpec#healthCheckNodePort
        '''
        result = self._values.get("health_check_node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def ip_family(self) -> typing.Optional[builtins.str]:
        '''ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.

        :schema: ElasticsearchSpecHttpServiceSpec#ipFamily
        '''
        result = self._values.get("ip_family")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_ip(self) -> typing.Optional[builtins.str]:
        '''Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.

        This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.

        :schema: ElasticsearchSpecHttpServiceSpec#loadBalancerIP
        '''
        result = self._values.get("load_balancer_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_source_ranges(self) -> typing.Optional[typing.List[builtins.str]]:
        '''If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.

        This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

        :schema: ElasticsearchSpecHttpServiceSpec#loadBalancerSourceRanges
        '''
        result = self._values.get("load_balancer_source_ranges")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def ports(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecHttpServiceSpecPorts"]]:
        '''The list of ports that are exposed by this service.

        More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: ElasticsearchSpecHttpServiceSpec#ports
        '''
        result = self._values.get("ports")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecHttpServiceSpecPorts"]], result)

    @builtins.property
    def publish_not_ready_addresses(self) -> typing.Optional[builtins.bool]:
        '''publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service.

        The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.

        :schema: ElasticsearchSpecHttpServiceSpec#publishNotReadyAddresses
        '''
        result = self._values.get("publish_not_ready_addresses")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def selector(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Route service traffic to pods with label keys and values matching this selector.

        If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/

        :schema: ElasticsearchSpecHttpServiceSpec#selector
        '''
        result = self._values.get("selector")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def session_affinity(self) -> typing.Optional[builtins.str]:
        '''Supports "ClientIP" and "None".

        Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :default: None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: ElasticsearchSpecHttpServiceSpec#sessionAffinity
        '''
        result = self._values.get("session_affinity")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def session_affinity_config(
        self,
    ) -> typing.Optional["ElasticsearchSpecHttpServiceSpecSessionAffinityConfig"]:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :schema: ElasticsearchSpecHttpServiceSpec#sessionAffinityConfig
        '''
        result = self._values.get("session_affinity_config")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpServiceSpecSessionAffinityConfig"], result)

    @builtins.property
    def topology_keys(self) -> typing.Optional[typing.List[builtins.str]]:
        '''topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local.

        Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.

        :schema: ElasticsearchSpecHttpServiceSpec#topologyKeys
        '''
        result = self._values.get("topology_keys")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def type(self) -> typing.Optional[builtins.str]:
        '''type determines how the Service is exposed.

        Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :schema: ElasticsearchSpecHttpServiceSpec#type
        '''
        result = self._values.get("type")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpServiceSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpServiceSpecPorts",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "name": "name",
        "node_port": "nodePort",
        "protocol": "protocol",
        "target_port": "targetPort",
    },
)
class ElasticsearchSpecHttpServiceSpecPorts:
    def __init__(
        self,
        *,
        port: jsii.Number,
        name: typing.Optional[builtins.str] = None,
        node_port: typing.Optional[jsii.Number] = None,
        protocol: typing.Optional[builtins.str] = None,
        target_port: typing.Optional["ElasticsearchSpecHttpServiceSpecPortsTargetPort"] = None,
    ) -> None:
        '''ServicePort contains information on service's port.

        :param port: The port that will be exposed by this service.
        :param name: The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
        :param node_port: The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport Default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
        :param protocol: The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP. Default: TCP.
        :param target_port: Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: ElasticsearchSpecHttpServiceSpecPorts
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__14da688522ff22d5a8932a6b237c2fb34d5d5336bbff0b427d3004694214576a)
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

        :schema: ElasticsearchSpecHttpServiceSpecPorts#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast(jsii.Number, result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''The name of this port within the service.

        This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.

        :schema: ElasticsearchSpecHttpServiceSpecPorts#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def node_port(self) -> typing.Optional[jsii.Number]:
        '''The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

        Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :schema: ElasticsearchSpecHttpServiceSpecPorts#nodePort
        '''
        result = self._values.get("node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def protocol(self) -> typing.Optional[builtins.str]:
        '''The IP protocol for this port.

        Supports "TCP", "UDP", and "SCTP". Default is TCP.

        :default: TCP.

        :schema: ElasticsearchSpecHttpServiceSpecPorts#protocol
        '''
        result = self._values.get("protocol")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def target_port(
        self,
    ) -> typing.Optional["ElasticsearchSpecHttpServiceSpecPortsTargetPort"]:
        '''Number or name of the port to access on the pods targeted by the service.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: ElasticsearchSpecHttpServiceSpecPorts#targetPort
        '''
        result = self._values.get("target_port")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpServiceSpecPortsTargetPort"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpServiceSpecPorts(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ElasticsearchSpecHttpServiceSpecPortsTargetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpServiceSpecPortsTargetPort",
):
    '''Number or name of the port to access on the pods targeted by the service.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

    :schema: ElasticsearchSpecHttpServiceSpecPortsTargetPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ElasticsearchSpecHttpServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__f968e9b23ed6f3a499f052de01b4f98893fe59f7b0f4a8cfa5751f327237433f)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecHttpServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ElasticsearchSpecHttpServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__da446c2e533c6ed164c72a5f6e2d1714807c7a1dbfa4dd5c54855d74280edc8f)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecHttpServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfig",
    jsii_struct_bases=[],
    name_mapping={"client_ip": "clientIp"},
)
class ElasticsearchSpecHttpServiceSpecSessionAffinityConfig:
    def __init__(
        self,
        *,
        client_ip: typing.Optional[typing.Union["ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :param client_ip: clientIP contains the configurations of Client IP based session affinity.

        :schema: ElasticsearchSpecHttpServiceSpecSessionAffinityConfig
        '''
        if isinstance(client_ip, dict):
            client_ip = ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp(**client_ip)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__b2ea20a8ac52d2bcdf45bf29295c390af2c8440a4f4613887a0aa811134ca5dc)
            check_type(argname="argument client_ip", value=client_ip, expected_type=type_hints["client_ip"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if client_ip is not None:
            self._values["client_ip"] = client_ip

    @builtins.property
    def client_ip(
        self,
    ) -> typing.Optional["ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp"]:
        '''clientIP contains the configurations of Client IP based session affinity.

        :schema: ElasticsearchSpecHttpServiceSpecSessionAffinityConfig#clientIP
        '''
        result = self._values.get("client_ip")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpServiceSpecSessionAffinityConfig(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp",
    jsii_struct_bases=[],
    name_mapping={"timeout_seconds": "timeoutSeconds"},
)
class ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp:
    def __init__(self, *, timeout_seconds: typing.Optional[jsii.Number] = None) -> None:
        '''clientIP contains the configurations of Client IP based session affinity.

        :param timeout_seconds: timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ac7a421c3bd09f931320ef8f12c8f867f049824e08a4a77c286a86631af5fe3e)
            check_type(argname="argument timeout_seconds", value=timeout_seconds, expected_type=type_hints["timeout_seconds"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if timeout_seconds is not None:
            self._values["timeout_seconds"] = timeout_seconds

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        '''timeoutSeconds specifies the seconds of ClientIP type session sticky time.

        The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp#timeoutSeconds
        '''
        result = self._values.get("timeout_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpTls",
    jsii_struct_bases=[],
    name_mapping={
        "certificate": "certificate",
        "self_signed_certificate": "selfSignedCertificate",
    },
)
class ElasticsearchSpecHttpTls:
    def __init__(
        self,
        *,
        certificate: typing.Optional[typing.Union["ElasticsearchSpecHttpTlsCertificate", typing.Dict[builtins.str, typing.Any]]] = None,
        self_signed_certificate: typing.Optional[typing.Union["ElasticsearchSpecHttpTlsSelfSignedCertificate", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''TLS defines options for configuring TLS for HTTP.

        :param certificate: Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS. The referenced secret should contain the following: - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.
        :param self_signed_certificate: SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :schema: ElasticsearchSpecHttpTls
        '''
        if isinstance(certificate, dict):
            certificate = ElasticsearchSpecHttpTlsCertificate(**certificate)
        if isinstance(self_signed_certificate, dict):
            self_signed_certificate = ElasticsearchSpecHttpTlsSelfSignedCertificate(**self_signed_certificate)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__d1de47e8bc1c56f7339289c5a26efab1e7a6958c29eae6311e6f573a22e9d119)
            check_type(argname="argument certificate", value=certificate, expected_type=type_hints["certificate"])
            check_type(argname="argument self_signed_certificate", value=self_signed_certificate, expected_type=type_hints["self_signed_certificate"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if certificate is not None:
            self._values["certificate"] = certificate
        if self_signed_certificate is not None:
            self._values["self_signed_certificate"] = self_signed_certificate

    @builtins.property
    def certificate(self) -> typing.Optional["ElasticsearchSpecHttpTlsCertificate"]:
        '''Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.

        The referenced secret should contain the following:

        - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.

        :schema: ElasticsearchSpecHttpTls#certificate
        '''
        result = self._values.get("certificate")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpTlsCertificate"], result)

    @builtins.property
    def self_signed_certificate(
        self,
    ) -> typing.Optional["ElasticsearchSpecHttpTlsSelfSignedCertificate"]:
        '''SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :schema: ElasticsearchSpecHttpTls#selfSignedCertificate
        '''
        result = self._values.get("self_signed_certificate")
        return typing.cast(typing.Optional["ElasticsearchSpecHttpTlsSelfSignedCertificate"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpTls(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpTlsCertificate",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName"},
)
class ElasticsearchSpecHttpTlsCertificate:
    def __init__(self, *, secret_name: typing.Optional[builtins.str] = None) -> None:
        '''Certificate is a reference to a Kubernetes secret that contains the certificate and private key for enabling TLS.

        The referenced secret should contain the following:

        - ``ca.crt``: The certificate authority (optional). - ``tls.crt``: The certificate (or a chain). - ``tls.key``: The private key to the first certificate in the certificate chain.

        :param secret_name: SecretName is the name of the secret.

        :schema: ElasticsearchSpecHttpTlsCertificate
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ea06ef8f734e2d3709a9398dad037f2ba7f9688c6b0ae87451170dbb826d497c)
            check_type(argname="argument secret_name", value=secret_name, expected_type=type_hints["secret_name"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if secret_name is not None:
            self._values["secret_name"] = secret_name

    @builtins.property
    def secret_name(self) -> typing.Optional[builtins.str]:
        '''SecretName is the name of the secret.

        :schema: ElasticsearchSpecHttpTlsCertificate#secretName
        '''
        result = self._values.get("secret_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpTlsCertificate(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpTlsSelfSignedCertificate",
    jsii_struct_bases=[],
    name_mapping={"disabled": "disabled", "subject_alt_names": "subjectAltNames"},
)
class ElasticsearchSpecHttpTlsSelfSignedCertificate:
    def __init__(
        self,
        *,
        disabled: typing.Optional[builtins.bool] = None,
        subject_alt_names: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''SelfSignedCertificate allows configuring the self-signed certificate generated by the operator.

        :param disabled: Disabled indicates that the provisioning of the self-signed certifcate should be disabled.
        :param subject_alt_names: SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.

        :schema: ElasticsearchSpecHttpTlsSelfSignedCertificate
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__12ab07cdc98664637d31d5228571205c9343b8d79834ecbbc53f8a928c889089)
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

        :schema: ElasticsearchSpecHttpTlsSelfSignedCertificate#disabled
        '''
        result = self._values.get("disabled")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def subject_alt_names(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames"]]:
        '''SubjectAlternativeNames is a list of SANs to include in the generated HTTP TLS certificate.

        :schema: ElasticsearchSpecHttpTlsSelfSignedCertificate#subjectAltNames
        '''
        result = self._values.get("subject_alt_names")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpTlsSelfSignedCertificate(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames",
    jsii_struct_bases=[],
    name_mapping={"dns": "dns", "ip": "ip"},
)
class ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames:
    def __init__(
        self,
        *,
        dns: typing.Optional[builtins.str] = None,
        ip: typing.Optional[builtins.str] = None,
    ) -> None:
        '''SubjectAlternativeName represents a SAN entry in a x509 certificate.

        :param dns: DNS is the DNS name of the subject.
        :param ip: IP is the IP address of the subject.

        :schema: ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__e052a1987973406b45d1fe12dd50ef10c88f27ab3da9507c6f41498ba5b8961f)
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

        :schema: ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames#dns
        '''
        result = self._values.get("dns")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def ip(self) -> typing.Optional[builtins.str]:
        '''IP is the IP address of the subject.

        :schema: ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames#ip
        '''
        result = self._values.get("ip")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSets",
    jsii_struct_bases=[],
    name_mapping={
        "count": "count",
        "name": "name",
        "config": "config",
        "pod_template": "podTemplate",
        "volume_claim_templates": "volumeClaimTemplates",
    },
)
class ElasticsearchSpecNodeSets:
    def __init__(
        self,
        *,
        count: jsii.Number,
        name: builtins.str,
        config: typing.Any = None,
        pod_template: typing.Any = None,
        volume_claim_templates: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplates", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''NodeSet is the specification for a group of Elasticsearch nodes sharing the same configuration and a Pod template.

        :param count: Count of Elasticsearch nodes to deploy.
        :param name: Name of this set of nodes. Becomes a part of the Elasticsearch node.name setting.
        :param config: Config holds the Elasticsearch configuration.
        :param pod_template: PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Pods belonging to this NodeSet.
        :param volume_claim_templates: VolumeClaimTemplates is a list of persistent volume claims to be used by each Pod in this NodeSet. Every claim in this list must have a matching volumeMount in one of the containers defined in the PodTemplate. Items defined here take precedence over any default claims added by the operator with the same name. See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-volume-claim-templates.html

        :schema: ElasticsearchSpecNodeSets
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__1af23cf8a21065f2fd2a8d90b7594e7e6a73d08926caa2c6703463c1ba9eed99)
            check_type(argname="argument count", value=count, expected_type=type_hints["count"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument config", value=config, expected_type=type_hints["config"])
            check_type(argname="argument pod_template", value=pod_template, expected_type=type_hints["pod_template"])
            check_type(argname="argument volume_claim_templates", value=volume_claim_templates, expected_type=type_hints["volume_claim_templates"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "count": count,
            "name": name,
        }
        if config is not None:
            self._values["config"] = config
        if pod_template is not None:
            self._values["pod_template"] = pod_template
        if volume_claim_templates is not None:
            self._values["volume_claim_templates"] = volume_claim_templates

    @builtins.property
    def count(self) -> jsii.Number:
        '''Count of Elasticsearch nodes to deploy.

        :schema: ElasticsearchSpecNodeSets#count
        '''
        result = self._values.get("count")
        assert result is not None, "Required property 'count' is missing"
        return typing.cast(jsii.Number, result)

    @builtins.property
    def name(self) -> builtins.str:
        '''Name of this set of nodes.

        Becomes a part of the Elasticsearch node.name setting.

        :schema: ElasticsearchSpecNodeSets#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def config(self) -> typing.Any:
        '''Config holds the Elasticsearch configuration.

        :schema: ElasticsearchSpecNodeSets#config
        '''
        result = self._values.get("config")
        return typing.cast(typing.Any, result)

    @builtins.property
    def pod_template(self) -> typing.Any:
        '''PodTemplate provides customisation options (labels, annotations, affinity rules, resource requests, and so on) for the Pods belonging to this NodeSet.

        :schema: ElasticsearchSpecNodeSets#podTemplate
        '''
        result = self._values.get("pod_template")
        return typing.cast(typing.Any, result)

    @builtins.property
    def volume_claim_templates(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecNodeSetsVolumeClaimTemplates"]]:
        '''VolumeClaimTemplates is a list of persistent volume claims to be used by each Pod in this NodeSet.

        Every claim in this list must have a matching volumeMount in one of the containers defined in the PodTemplate. Items defined here take precedence over any default claims added by the operator with the same name. See: https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-volume-claim-templates.html

        :schema: ElasticsearchSpecNodeSets#volumeClaimTemplates
        '''
        result = self._values.get("volume_claim_templates")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecNodeSetsVolumeClaimTemplates"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSets(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplates",
    jsii_struct_bases=[],
    name_mapping={
        "api_version": "apiVersion",
        "kind": "kind",
        "metadata": "metadata",
        "spec": "spec",
        "status": "status",
    },
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplates:
    def __init__(
        self,
        *,
        api_version: typing.Optional[builtins.str] = None,
        kind: typing.Optional[builtins.str] = None,
        metadata: typing.Any = None,
        spec: typing.Optional[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec", typing.Dict[builtins.str, typing.Any]]] = None,
        status: typing.Optional[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''PersistentVolumeClaim is a user's request for and claim to a persistent volume.

        :param api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param metadata: Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param spec: Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
        :param status: Status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplates
        '''
        if isinstance(spec, dict):
            spec = ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec(**spec)
        if isinstance(status, dict):
            status = ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus(**status)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__fef0c761188a2a995d8ed03c72c7cacbd27d9b778a54a69317b04cd9ef47a5c7)
            check_type(argname="argument api_version", value=api_version, expected_type=type_hints["api_version"])
            check_type(argname="argument kind", value=kind, expected_type=type_hints["kind"])
            check_type(argname="argument metadata", value=metadata, expected_type=type_hints["metadata"])
            check_type(argname="argument spec", value=spec, expected_type=type_hints["spec"])
            check_type(argname="argument status", value=status, expected_type=type_hints["status"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if api_version is not None:
            self._values["api_version"] = api_version
        if kind is not None:
            self._values["kind"] = kind
        if metadata is not None:
            self._values["metadata"] = metadata
        if spec is not None:
            self._values["spec"] = spec
        if status is not None:
            self._values["status"] = status

    @builtins.property
    def api_version(self) -> typing.Optional[builtins.str]:
        '''APIVersion defines the versioned schema of this representation of an object.

        Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplates#apiVersion
        '''
        result = self._values.get("api_version")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def kind(self) -> typing.Optional[builtins.str]:
        '''Kind is a string value representing the REST resource this object represents.

        Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplates#kind
        '''
        result = self._values.get("kind")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def metadata(self) -> typing.Any:
        '''Standard object's metadata.

        More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplates#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Any, result)

    @builtins.property
    def spec(
        self,
    ) -> typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec"]:
        '''Spec defines the desired characteristics of a volume requested by a pod author.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplates#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec"], result)

    @builtins.property
    def status(
        self,
    ) -> typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus"]:
        '''Status represents the current information/status of a persistent volume claim.

        Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplates#status
        '''
        result = self._values.get("status")
        return typing.cast(typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplates(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec",
    jsii_struct_bases=[],
    name_mapping={
        "access_modes": "accessModes",
        "data_source": "dataSource",
        "resources": "resources",
        "selector": "selector",
        "storage_class_name": "storageClassName",
        "volume_mode": "volumeMode",
        "volume_name": "volumeName",
    },
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec:
    def __init__(
        self,
        *,
        access_modes: typing.Optional[typing.Sequence[builtins.str]] = None,
        data_source: typing.Optional[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource", typing.Dict[builtins.str, typing.Any]]] = None,
        resources: typing.Optional[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources", typing.Dict[builtins.str, typing.Any]]] = None,
        selector: typing.Optional[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector", typing.Dict[builtins.str, typing.Any]]] = None,
        storage_class_name: typing.Optional[builtins.str] = None,
        volume_mode: typing.Optional[builtins.str] = None,
        volume_name: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Spec defines the desired characteristics of a volume requested by a pod author.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        :param access_modes: AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
        :param data_source: This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
        :param resources: Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
        :param selector: A label query over volumes to consider for binding.
        :param storage_class_name: Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
        :param volume_mode: volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.
        :param volume_name: VolumeName is the binding reference to the PersistentVolume backing this claim.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec
        '''
        if isinstance(data_source, dict):
            data_source = ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource(**data_source)
        if isinstance(resources, dict):
            resources = ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources(**resources)
        if isinstance(selector, dict):
            selector = ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector(**selector)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__9cfa1966f1a0a2011144de9d34f2afe7628a31bfc1baaad84336692ca25f785e)
            check_type(argname="argument access_modes", value=access_modes, expected_type=type_hints["access_modes"])
            check_type(argname="argument data_source", value=data_source, expected_type=type_hints["data_source"])
            check_type(argname="argument resources", value=resources, expected_type=type_hints["resources"])
            check_type(argname="argument selector", value=selector, expected_type=type_hints["selector"])
            check_type(argname="argument storage_class_name", value=storage_class_name, expected_type=type_hints["storage_class_name"])
            check_type(argname="argument volume_mode", value=volume_mode, expected_type=type_hints["volume_mode"])
            check_type(argname="argument volume_name", value=volume_name, expected_type=type_hints["volume_name"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if access_modes is not None:
            self._values["access_modes"] = access_modes
        if data_source is not None:
            self._values["data_source"] = data_source
        if resources is not None:
            self._values["resources"] = resources
        if selector is not None:
            self._values["selector"] = selector
        if storage_class_name is not None:
            self._values["storage_class_name"] = storage_class_name
        if volume_mode is not None:
            self._values["volume_mode"] = volume_mode
        if volume_name is not None:
            self._values["volume_name"] = volume_name

    @builtins.property
    def access_modes(self) -> typing.Optional[typing.List[builtins.str]]:
        '''AccessModes contains the desired access modes the volume should have.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec#accessModes
        '''
        result = self._values.get("access_modes")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def data_source(
        self,
    ) -> typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource"]:
        '''This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source.

        If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec#dataSource
        '''
        result = self._values.get("data_source")
        return typing.cast(typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource"], result)

    @builtins.property
    def resources(
        self,
    ) -> typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources"]:
        '''Resources represents the minimum resources the volume should have.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec#resources
        '''
        result = self._values.get("resources")
        return typing.cast(typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources"], result)

    @builtins.property
    def selector(
        self,
    ) -> typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector"]:
        '''A label query over volumes to consider for binding.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec#selector
        '''
        result = self._values.get("selector")
        return typing.cast(typing.Optional["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector"], result)

    @builtins.property
    def storage_class_name(self) -> typing.Optional[builtins.str]:
        '''Name of the StorageClass required by the claim.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec#storageClassName
        '''
        result = self._values.get("storage_class_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def volume_mode(self) -> typing.Optional[builtins.str]:
        '''volumeMode defines what type of volume is required by the claim.

        Value of Filesystem is implied when not included in claim spec. This is a beta feature.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec#volumeMode
        '''
        result = self._values.get("volume_mode")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def volume_name(self) -> typing.Optional[builtins.str]:
        '''VolumeName is the binding reference to the PersistentVolume backing this claim.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec#volumeName
        '''
        result = self._values.get("volume_name")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource",
    jsii_struct_bases=[],
    name_mapping={"kind": "kind", "name": "name", "api_group": "apiGroup"},
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource:
    def __init__(
        self,
        *,
        kind: builtins.str,
        name: builtins.str,
        api_group: typing.Optional[builtins.str] = None,
    ) -> None:
        '''This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source.

        If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.

        :param kind: Kind is the type of resource being referenced.
        :param name: Name is the name of resource being referenced.
        :param api_group: APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__dc20007f03c3426b03f5fce03b2850955c9be4475c44d50c6fc9ba92fd95e6a8)
            check_type(argname="argument kind", value=kind, expected_type=type_hints["kind"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument api_group", value=api_group, expected_type=type_hints["api_group"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "kind": kind,
            "name": name,
        }
        if api_group is not None:
            self._values["api_group"] = api_group

    @builtins.property
    def kind(self) -> builtins.str:
        '''Kind is the type of resource being referenced.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource#kind
        '''
        result = self._values.get("kind")
        assert result is not None, "Required property 'kind' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def name(self) -> builtins.str:
        '''Name is the name of resource being referenced.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def api_group(self) -> typing.Optional[builtins.str]:
        '''APIGroup is the group for the resource being referenced.

        If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource#apiGroup
        '''
        result = self._values.get("api_group")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits"]] = None,
        requests: typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests"]] = None,
    ) -> None:
        '''Resources represents the minimum resources the volume should have.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__c1acfdb8c71436548ac556206a1c975b55ca141ff4e823361c58dff162c42518)
            check_type(argname="argument limits", value=limits, expected_type=type_hints["limits"])
            check_type(argname="argument requests", value=requests, expected_type=type_hints["requests"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if limits is not None:
            self._values["limits"] = limits
        if requests is not None:
            self._values["requests"] = requests

    @builtins.property
    def limits(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits"]]:
        '''Limits describes the maximum amount of compute resources allowed.

        More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources#limits
        '''
        result = self._values.get("limits")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits"]], result)

    @builtins.property
    def requests(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests"]]:
        '''Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources#requests
        '''
        result = self._values.get("requests")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits",
):
    '''
    :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ff9e234b079134d165327a63d410e9b6fa6716e01b3df98193d739da8e29070d)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__1daaf04315b1d9af9a7569c6ed918137474c38978727f88544507bc7f40b61d4)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests",
):
    '''
    :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__439a60e316385b21067cf383deee6374c7ccfd9dcd1a02c408e427364a766913)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__63acda7c19f93cf9962e446fd6c798673b83c5165eff0ffbccf67b75e96cea6d)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_labels": "matchLabels",
    },
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions", typing.Dict[builtins.str, typing.Any]]]] = None,
        match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''A label query over volumes to consider for binding.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__4003e6363e7deeb150279fb42daf1723894a6b51dc30eedda55e26d956e86626)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_labels", value=match_labels, expected_type=type_hints["match_labels"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions"]]:
        '''matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions"]], result)

    @builtins.property
    def match_labels(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector#matchLabels
        '''
        result = self._values.get("match_labels")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__4ef9bcc9702207b4a4c28053e84022b7fe2cde71d6601c662a59e4ad49c03d83)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''key is the label key that the selector applies to.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus",
    jsii_struct_bases=[],
    name_mapping={
        "access_modes": "accessModes",
        "capacity": "capacity",
        "conditions": "conditions",
        "phase": "phase",
    },
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus:
    def __init__(
        self,
        *,
        access_modes: typing.Optional[typing.Sequence[builtins.str]] = None,
        capacity: typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity"]] = None,
        conditions: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions", typing.Dict[builtins.str, typing.Any]]]] = None,
        phase: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Status represents the current information/status of a persistent volume claim.

        Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        :param access_modes: AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
        :param capacity: Represents the actual resources of the underlying volume.
        :param conditions: Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
        :param phase: Phase represents the current phase of PersistentVolumeClaim.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__dc69d79607ad5463426b98d098e6981a5c2107e6d08593bbba0f2a4a93f3ebfe)
            check_type(argname="argument access_modes", value=access_modes, expected_type=type_hints["access_modes"])
            check_type(argname="argument capacity", value=capacity, expected_type=type_hints["capacity"])
            check_type(argname="argument conditions", value=conditions, expected_type=type_hints["conditions"])
            check_type(argname="argument phase", value=phase, expected_type=type_hints["phase"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if access_modes is not None:
            self._values["access_modes"] = access_modes
        if capacity is not None:
            self._values["capacity"] = capacity
        if conditions is not None:
            self._values["conditions"] = conditions
        if phase is not None:
            self._values["phase"] = phase

    @builtins.property
    def access_modes(self) -> typing.Optional[typing.List[builtins.str]]:
        '''AccessModes contains the actual access modes the volume backing the PVC has.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#accessModes
        '''
        result = self._values.get("access_modes")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def capacity(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity"]]:
        '''Represents the actual resources of the underlying volume.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#capacity
        '''
        result = self._values.get("capacity")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity"]], result)

    @builtins.property
    def conditions(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions"]]:
        '''Current Condition of persistent volume claim.

        If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#conditions
        '''
        result = self._values.get("conditions")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions"]], result)

    @builtins.property
    def phase(self) -> typing.Optional[builtins.str]:
        '''Phase represents the current phase of PersistentVolumeClaim.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus#phase
        '''
        result = self._values.get("phase")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity",
):
    '''
    :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__6f30641db5745931d60aca50f4ba8809e0da636ea1695769b302b3fe9b1d88a1)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__c1f0a059d8906cfc9dbdac71bb7b71c97e07866ffc4b2127bf8fcba689ea3195)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions",
    jsii_struct_bases=[],
    name_mapping={
        "status": "status",
        "type": "type",
        "last_probe_time": "lastProbeTime",
        "last_transition_time": "lastTransitionTime",
        "message": "message",
        "reason": "reason",
    },
)
class ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions:
    def __init__(
        self,
        *,
        status: builtins.str,
        type: builtins.str,
        last_probe_time: typing.Optional[datetime.datetime] = None,
        last_transition_time: typing.Optional[datetime.datetime] = None,
        message: typing.Optional[builtins.str] = None,
        reason: typing.Optional[builtins.str] = None,
    ) -> None:
        '''PersistentVolumeClaimCondition contails details about state of pvc.

        :param status: 
        :param type: PersistentVolumeClaimConditionType is a valid value of PersistentVolumeClaimCondition.Type.
        :param last_probe_time: Last time we probed the condition.
        :param last_transition_time: Last time the condition transitioned from one status to another.
        :param message: Human-readable message indicating details about last transition.
        :param reason: Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports "ResizeStarted" that means the underlying persistent volume is being resized.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__eb74e35f8fba545c14c47021cd62f76a82e2ce53e333e3d3c813e8d07054a793)
            check_type(argname="argument status", value=status, expected_type=type_hints["status"])
            check_type(argname="argument type", value=type, expected_type=type_hints["type"])
            check_type(argname="argument last_probe_time", value=last_probe_time, expected_type=type_hints["last_probe_time"])
            check_type(argname="argument last_transition_time", value=last_transition_time, expected_type=type_hints["last_transition_time"])
            check_type(argname="argument message", value=message, expected_type=type_hints["message"])
            check_type(argname="argument reason", value=reason, expected_type=type_hints["reason"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "status": status,
            "type": type,
        }
        if last_probe_time is not None:
            self._values["last_probe_time"] = last_probe_time
        if last_transition_time is not None:
            self._values["last_transition_time"] = last_transition_time
        if message is not None:
            self._values["message"] = message
        if reason is not None:
            self._values["reason"] = reason

    @builtins.property
    def status(self) -> builtins.str:
        '''
        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#status
        '''
        result = self._values.get("status")
        assert result is not None, "Required property 'status' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def type(self) -> builtins.str:
        '''PersistentVolumeClaimConditionType is a valid value of PersistentVolumeClaimCondition.Type.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#type
        '''
        result = self._values.get("type")
        assert result is not None, "Required property 'type' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def last_probe_time(self) -> typing.Optional[datetime.datetime]:
        '''Last time we probed the condition.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#lastProbeTime
        '''
        result = self._values.get("last_probe_time")
        return typing.cast(typing.Optional[datetime.datetime], result)

    @builtins.property
    def last_transition_time(self) -> typing.Optional[datetime.datetime]:
        '''Last time the condition transitioned from one status to another.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#lastTransitionTime
        '''
        result = self._values.get("last_transition_time")
        return typing.cast(typing.Optional[datetime.datetime], result)

    @builtins.property
    def message(self) -> typing.Optional[builtins.str]:
        '''Human-readable message indicating details about last transition.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#message
        '''
        result = self._values.get("message")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def reason(self) -> typing.Optional[builtins.str]:
        '''Unique, this should be a short, machine understandable string that gives the reason for condition's last transition.

        If it reports "ResizeStarted" that means the underlying persistent volume is being resized.

        :schema: ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions#reason
        '''
        result = self._values.get("reason")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudget",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class ElasticsearchSpecPodDisruptionBudget:
    def __init__(
        self,
        *,
        metadata: typing.Any = None,
        spec: typing.Optional[typing.Union["ElasticsearchSpecPodDisruptionBudgetSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''PodDisruptionBudget provides access to the default pod disruption budget for the Elasticsearch cluster.

        The default budget selects all cluster pods and sets ``maxUnavailable`` to 1. To disable, set ``PodDisruptionBudget`` to the empty value (``{}`` in YAML).

        :param metadata: ObjectMeta is the metadata of the PDB. The name and namespace provided here are managed by ECK and will be ignored.
        :param spec: Spec is the specification of the PDB.

        :schema: ElasticsearchSpecPodDisruptionBudget
        '''
        if isinstance(spec, dict):
            spec = ElasticsearchSpecPodDisruptionBudgetSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__4f611c0dd3ed5c385b33f2edc8959eca1ab86996d7e25f0bcb8f514fe3279910)
            check_type(argname="argument metadata", value=metadata, expected_type=type_hints["metadata"])
            check_type(argname="argument spec", value=spec, expected_type=type_hints["spec"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if metadata is not None:
            self._values["metadata"] = metadata
        if spec is not None:
            self._values["spec"] = spec

    @builtins.property
    def metadata(self) -> typing.Any:
        '''ObjectMeta is the metadata of the PDB.

        The name and namespace provided here are managed by ECK and will be ignored.

        :schema: ElasticsearchSpecPodDisruptionBudget#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Any, result)

    @builtins.property
    def spec(self) -> typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpec"]:
        '''Spec is the specification of the PDB.

        :schema: ElasticsearchSpecPodDisruptionBudget#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecPodDisruptionBudget(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpec",
    jsii_struct_bases=[],
    name_mapping={
        "max_unavailable": "maxUnavailable",
        "min_available": "minAvailable",
        "selector": "selector",
    },
)
class ElasticsearchSpecPodDisruptionBudgetSpec:
    def __init__(
        self,
        *,
        max_unavailable: typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable"] = None,
        min_available: typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable"] = None,
        selector: typing.Optional[typing.Union["ElasticsearchSpecPodDisruptionBudgetSpecSelector", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Spec is the specification of the PDB.

        :param max_unavailable: An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
        :param min_available: An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod. So for example you can prevent all voluntary evictions by specifying "100%".
        :param selector: Label query over pods whose evictions are managed by the disruption budget.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpec
        '''
        if isinstance(selector, dict):
            selector = ElasticsearchSpecPodDisruptionBudgetSpecSelector(**selector)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__aee713f9e43b25ffcd24f4f87fdea0505702e533845c8c57edd430bbf348cf18)
            check_type(argname="argument max_unavailable", value=max_unavailable, expected_type=type_hints["max_unavailable"])
            check_type(argname="argument min_available", value=min_available, expected_type=type_hints["min_available"])
            check_type(argname="argument selector", value=selector, expected_type=type_hints["selector"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if max_unavailable is not None:
            self._values["max_unavailable"] = max_unavailable
        if min_available is not None:
            self._values["min_available"] = min_available
        if selector is not None:
            self._values["selector"] = selector

    @builtins.property
    def max_unavailable(
        self,
    ) -> typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable"]:
        '''An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".

        :schema: ElasticsearchSpecPodDisruptionBudgetSpec#maxUnavailable
        '''
        result = self._values.get("max_unavailable")
        return typing.cast(typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable"], result)

    @builtins.property
    def min_available(
        self,
    ) -> typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable"]:
        '''An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".

        :schema: ElasticsearchSpecPodDisruptionBudgetSpec#minAvailable
        '''
        result = self._values.get("min_available")
        return typing.cast(typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable"], result)

    @builtins.property
    def selector(
        self,
    ) -> typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecSelector"]:
        '''Label query over pods whose evictions are managed by the disruption budget.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpec#selector
        '''
        result = self._values.get("selector")
        return typing.cast(typing.Optional["ElasticsearchSpecPodDisruptionBudgetSpecSelector"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecPodDisruptionBudgetSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable",
):
    '''An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".

    :schema: ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__a2e6e3fefb0dc7ee4b95c616c21b165a387e362e99cfaa146482510911434ec5)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__47e121c83a56259669f693f29faca1eb84cf7cb61796305ecb199cb1d4b9dcde)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


class ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable",
):
    '''An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".

    :schema: ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ece8f46e41867df06de5811d240bca072c3913a3395fdde4dd955fa8ac601478)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__e0a13d5966b53369a32d57a7ea5ffa43052bf73194e937e094c823a46b3e1653)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelector",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_labels": "matchLabels",
    },
)
class ElasticsearchSpecPodDisruptionBudgetSpecSelector:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions", typing.Dict[builtins.str, typing.Any]]]] = None,
        match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''Label query over pods whose evictions are managed by the disruption budget.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpecSelector
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__0a126605cbc6a3dad2e373993140b2d4dffcc774226427fa982bd7b1a37f629f)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_labels", value=match_labels, expected_type=type_hints["match_labels"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions"]]:
        '''matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpecSelector#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions"]], result)

    @builtins.property
    def match_labels(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpecSelector#matchLabels
        '''
        result = self._values.get("match_labels")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecPodDisruptionBudgetSpecSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__46350c4c43c6d14f0b89ad9224376d24c4e006d1fba2f8687f35ab5c8102fb45)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''key is the label key that the selector applies to.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecRemoteClusters",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "elasticsearch_ref": "elasticsearchRef"},
)
class ElasticsearchSpecRemoteClusters:
    def __init__(
        self,
        *,
        name: builtins.str,
        elasticsearch_ref: typing.Optional[typing.Union["ElasticsearchSpecRemoteClustersElasticsearchRef", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''RemoteCluster declares a remote Elasticsearch cluster connection.

        :param name: Name is the name of the remote cluster as it is set in the Elasticsearch settings. The name is expected to be unique for each remote clusters.
        :param elasticsearch_ref: ElasticsearchRef is a reference to an Elasticsearch cluster running within the same k8s cluster.

        :schema: ElasticsearchSpecRemoteClusters
        '''
        if isinstance(elasticsearch_ref, dict):
            elasticsearch_ref = ElasticsearchSpecRemoteClustersElasticsearchRef(**elasticsearch_ref)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__df390b7ea7ff32accb7c2cccb79fae938043c95e382aff92f04e2f109c3657cf)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument elasticsearch_ref", value=elasticsearch_ref, expected_type=type_hints["elasticsearch_ref"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "name": name,
        }
        if elasticsearch_ref is not None:
            self._values["elasticsearch_ref"] = elasticsearch_ref

    @builtins.property
    def name(self) -> builtins.str:
        '''Name is the name of the remote cluster as it is set in the Elasticsearch settings.

        The name is expected to be unique for each remote clusters.

        :schema: ElasticsearchSpecRemoteClusters#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def elasticsearch_ref(
        self,
    ) -> typing.Optional["ElasticsearchSpecRemoteClustersElasticsearchRef"]:
        '''ElasticsearchRef is a reference to an Elasticsearch cluster running within the same k8s cluster.

        :schema: ElasticsearchSpecRemoteClusters#elasticsearchRef
        '''
        result = self._values.get("elasticsearch_ref")
        return typing.cast(typing.Optional["ElasticsearchSpecRemoteClustersElasticsearchRef"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecRemoteClusters(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecRemoteClustersElasticsearchRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "namespace": "namespace"},
)
class ElasticsearchSpecRemoteClustersElasticsearchRef:
    def __init__(
        self,
        *,
        name: builtins.str,
        namespace: typing.Optional[builtins.str] = None,
    ) -> None:
        '''ElasticsearchRef is a reference to an Elasticsearch cluster running within the same k8s cluster.

        :param name: Name of the Kubernetes object.
        :param namespace: Namespace of the Kubernetes object. If empty, defaults to the current namespace.

        :schema: ElasticsearchSpecRemoteClustersElasticsearchRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__052aca3c2596491ebd2920bf0ea20f9a1694959773552c9969246616c28fe9db)
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

        :schema: ElasticsearchSpecRemoteClustersElasticsearchRef#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def namespace(self) -> typing.Optional[builtins.str]:
        '''Namespace of the Kubernetes object.

        If empty, defaults to the current namespace.

        :schema: ElasticsearchSpecRemoteClustersElasticsearchRef#namespace
        '''
        result = self._values.get("namespace")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecRemoteClustersElasticsearchRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecSecureSettings",
    jsii_struct_bases=[],
    name_mapping={"secret_name": "secretName", "entries": "entries"},
)
class ElasticsearchSpecSecureSettings:
    def __init__(
        self,
        *,
        secret_name: builtins.str,
        entries: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecSecureSettingsEntries", typing.Dict[builtins.str, typing.Any]]]] = None,
    ) -> None:
        '''SecretSource defines a data source based on a Kubernetes Secret.

        :param secret_name: SecretName is the name of the secret.
        :param entries: Entries define how to project each key-value pair in the secret to filesystem paths. If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.

        :schema: ElasticsearchSpecSecureSettings
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__d7ad0bb1913dd37a5ff1637e57770fc542f9979a6710137ed13c84704df39032)
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

        :schema: ElasticsearchSpecSecureSettings#secretName
        '''
        result = self._values.get("secret_name")
        assert result is not None, "Required property 'secret_name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def entries(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecSecureSettingsEntries"]]:
        '''Entries define how to project each key-value pair in the secret to filesystem paths.

        If not defined, all keys will be projected to similarly named paths in the filesystem. If defined, only the specified keys will be projected to the corresponding paths.

        :schema: ElasticsearchSpecSecureSettings#entries
        '''
        result = self._values.get("entries")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecSecureSettingsEntries"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecSecureSettings(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecSecureSettingsEntries",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "path": "path"},
)
class ElasticsearchSpecSecureSettingsEntries:
    def __init__(
        self,
        *,
        key: builtins.str,
        path: typing.Optional[builtins.str] = None,
    ) -> None:
        '''KeyToPath defines how to map a key in a Secret object to a filesystem path.

        :param key: Key is the key contained in the secret.
        :param path: Path is the relative file path to map the key to. Path must not be an absolute file path and must not contain any ".." components.

        :schema: ElasticsearchSpecSecureSettingsEntries
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__c898fe00aac1dee3feb73fc0cc6b8b0ede63c6d1bfc1af2f56e032c29d3c2d0d)
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

        :schema: ElasticsearchSpecSecureSettingsEntries#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def path(self) -> typing.Optional[builtins.str]:
        '''Path is the relative file path to map the key to.

        Path must not be an absolute file path and must not contain any ".." components.

        :schema: ElasticsearchSpecSecureSettingsEntries#path
        '''
        result = self._values.get("path")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecSecureSettingsEntries(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecTransport",
    jsii_struct_bases=[],
    name_mapping={"service": "service"},
)
class ElasticsearchSpecTransport:
    def __init__(
        self,
        *,
        service: typing.Optional[typing.Union["ElasticsearchSpecTransportService", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Transport holds transport layer settings for Elasticsearch.

        :param service: Service defines the template for the associated Kubernetes Service object.

        :schema: ElasticsearchSpecTransport
        '''
        if isinstance(service, dict):
            service = ElasticsearchSpecTransportService(**service)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__23606e3001af8deb54438d5e6c2095e3514206cf161351ce82c54de88f275f8f)
            check_type(argname="argument service", value=service, expected_type=type_hints["service"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if service is not None:
            self._values["service"] = service

    @builtins.property
    def service(self) -> typing.Optional["ElasticsearchSpecTransportService"]:
        '''Service defines the template for the associated Kubernetes Service object.

        :schema: ElasticsearchSpecTransport#service
        '''
        result = self._values.get("service")
        return typing.cast(typing.Optional["ElasticsearchSpecTransportService"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecTransport(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecTransportService",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class ElasticsearchSpecTransportService:
    def __init__(
        self,
        *,
        metadata: typing.Any = None,
        spec: typing.Optional[typing.Union["ElasticsearchSpecTransportServiceSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Service defines the template for the associated Kubernetes Service object.

        :param metadata: ObjectMeta is the metadata of the service. The name and namespace provided here are managed by ECK and will be ignored.
        :param spec: Spec is the specification of the service.

        :schema: ElasticsearchSpecTransportService
        '''
        if isinstance(spec, dict):
            spec = ElasticsearchSpecTransportServiceSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__1326003475cab7d33699c82b742b126cb78d230df97515bec73321dc3eeab9ce)
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

        :schema: ElasticsearchSpecTransportService#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Any, result)

    @builtins.property
    def spec(self) -> typing.Optional["ElasticsearchSpecTransportServiceSpec"]:
        '''Spec is the specification of the service.

        :schema: ElasticsearchSpecTransportService#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["ElasticsearchSpecTransportServiceSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecTransportService(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecTransportServiceSpec",
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
class ElasticsearchSpecTransportServiceSpec:
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
        ports: typing.Optional[typing.Sequence[typing.Union["ElasticsearchSpecTransportServiceSpecPorts", typing.Dict[builtins.str, typing.Any]]]] = None,
        publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
        selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        session_affinity: typing.Optional[builtins.str] = None,
        session_affinity_config: typing.Optional[typing.Union["ElasticsearchSpecTransportServiceSpecSessionAffinityConfig", typing.Dict[builtins.str, typing.Any]]] = None,
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

        :schema: ElasticsearchSpecTransportServiceSpec
        '''
        if isinstance(session_affinity_config, dict):
            session_affinity_config = ElasticsearchSpecTransportServiceSpecSessionAffinityConfig(**session_affinity_config)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__9dda401adb9849273add2354ed76266589bb42090862c12026d41284186043e1)
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

        :schema: ElasticsearchSpecTransportServiceSpec#clusterIP
        '''
        result = self._values.get("cluster_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_i_ps(self) -> typing.Optional[typing.List[builtins.str]]:
        '''externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.

        These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.

        :schema: ElasticsearchSpecTransportServiceSpec#externalIPs
        '''
        result = self._values.get("external_i_ps")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def external_name(self) -> typing.Optional[builtins.str]:
        '''externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service.

        No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.

        :schema: ElasticsearchSpecTransportServiceSpec#externalName
        '''
        result = self._values.get("external_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_traffic_policy(self) -> typing.Optional[builtins.str]:
        '''externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.

        "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.

        :schema: ElasticsearchSpecTransportServiceSpec#externalTrafficPolicy
        '''
        result = self._values.get("external_traffic_policy")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def health_check_node_port(self) -> typing.Optional[jsii.Number]:
        '''healthCheckNodePort specifies the healthcheck nodePort for the service.

        If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.

        :schema: ElasticsearchSpecTransportServiceSpec#healthCheckNodePort
        '''
        result = self._values.get("health_check_node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def ip_family(self) -> typing.Optional[builtins.str]:
        '''ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.

        :schema: ElasticsearchSpecTransportServiceSpec#ipFamily
        '''
        result = self._values.get("ip_family")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_ip(self) -> typing.Optional[builtins.str]:
        '''Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.

        This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.

        :schema: ElasticsearchSpecTransportServiceSpec#loadBalancerIP
        '''
        result = self._values.get("load_balancer_ip")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def load_balancer_source_ranges(self) -> typing.Optional[typing.List[builtins.str]]:
        '''If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.

        This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

        :schema: ElasticsearchSpecTransportServiceSpec#loadBalancerSourceRanges
        '''
        result = self._values.get("load_balancer_source_ranges")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def ports(
        self,
    ) -> typing.Optional[typing.List["ElasticsearchSpecTransportServiceSpecPorts"]]:
        '''The list of ports that are exposed by this service.

        More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: ElasticsearchSpecTransportServiceSpec#ports
        '''
        result = self._values.get("ports")
        return typing.cast(typing.Optional[typing.List["ElasticsearchSpecTransportServiceSpecPorts"]], result)

    @builtins.property
    def publish_not_ready_addresses(self) -> typing.Optional[builtins.bool]:
        '''publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service.

        The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.

        :schema: ElasticsearchSpecTransportServiceSpec#publishNotReadyAddresses
        '''
        result = self._values.get("publish_not_ready_addresses")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def selector(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Route service traffic to pods with label keys and values matching this selector.

        If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/

        :schema: ElasticsearchSpecTransportServiceSpec#selector
        '''
        result = self._values.get("selector")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def session_affinity(self) -> typing.Optional[builtins.str]:
        '''Supports "ClientIP" and "None".

        Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :default: None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        :schema: ElasticsearchSpecTransportServiceSpec#sessionAffinity
        '''
        result = self._values.get("session_affinity")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def session_affinity_config(
        self,
    ) -> typing.Optional["ElasticsearchSpecTransportServiceSpecSessionAffinityConfig"]:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :schema: ElasticsearchSpecTransportServiceSpec#sessionAffinityConfig
        '''
        result = self._values.get("session_affinity_config")
        return typing.cast(typing.Optional["ElasticsearchSpecTransportServiceSpecSessionAffinityConfig"], result)

    @builtins.property
    def topology_keys(self) -> typing.Optional[typing.List[builtins.str]]:
        '''topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local.

        Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.

        :schema: ElasticsearchSpecTransportServiceSpec#topologyKeys
        '''
        result = self._values.get("topology_keys")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def type(self) -> typing.Optional[builtins.str]:
        '''type determines how the Service is exposed.

        Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

        :schema: ElasticsearchSpecTransportServiceSpec#type
        '''
        result = self._values.get("type")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecTransportServiceSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecTransportServiceSpecPorts",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "name": "name",
        "node_port": "nodePort",
        "protocol": "protocol",
        "target_port": "targetPort",
    },
)
class ElasticsearchSpecTransportServiceSpecPorts:
    def __init__(
        self,
        *,
        port: jsii.Number,
        name: typing.Optional[builtins.str] = None,
        node_port: typing.Optional[jsii.Number] = None,
        protocol: typing.Optional[builtins.str] = None,
        target_port: typing.Optional["ElasticsearchSpecTransportServiceSpecPortsTargetPort"] = None,
    ) -> None:
        '''ServicePort contains information on service's port.

        :param port: The port that will be exposed by this service.
        :param name: The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
        :param node_port: The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport Default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
        :param protocol: The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP. Default: TCP.
        :param target_port: Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: ElasticsearchSpecTransportServiceSpecPorts
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__f9d10cba9f59b9a372d428cf4d116cc99ae9924a172096e5920a8a7508ae0ceb)
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

        :schema: ElasticsearchSpecTransportServiceSpecPorts#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast(jsii.Number, result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''The name of this port within the service.

        This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.

        :schema: ElasticsearchSpecTransportServiceSpecPorts#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def node_port(self) -> typing.Optional[jsii.Number]:
        '''The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

        Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        :schema: ElasticsearchSpecTransportServiceSpecPorts#nodePort
        '''
        result = self._values.get("node_port")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def protocol(self) -> typing.Optional[builtins.str]:
        '''The IP protocol for this port.

        Supports "TCP", "UDP", and "SCTP". Default is TCP.

        :default: TCP.

        :schema: ElasticsearchSpecTransportServiceSpecPorts#protocol
        '''
        result = self._values.get("protocol")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def target_port(
        self,
    ) -> typing.Optional["ElasticsearchSpecTransportServiceSpecPortsTargetPort"]:
        '''Number or name of the port to access on the pods targeted by the service.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

        :schema: ElasticsearchSpecTransportServiceSpecPorts#targetPort
        '''
        result = self._values.get("target_port")
        return typing.cast(typing.Optional["ElasticsearchSpecTransportServiceSpecPortsTargetPort"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecTransportServiceSpecPorts(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ElasticsearchSpecTransportServiceSpecPortsTargetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecTransportServiceSpecPortsTargetPort",
):
    '''Number or name of the port to access on the pods targeted by the service.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service

    :schema: ElasticsearchSpecTransportServiceSpecPortsTargetPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ElasticsearchSpecTransportServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__e132fc78e0455ba7e87a3d9506be7f455ed0250fce660eb648a3d7bd0decd192)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecTransportServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ElasticsearchSpecTransportServiceSpecPortsTargetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ed151426d3cecf8a4a2e89777d38f1262ee92850857932a289b8e1b3ad6659bc)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ElasticsearchSpecTransportServiceSpecPortsTargetPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Union[builtins.str, jsii.Number]:
        return typing.cast(typing.Union[builtins.str, jsii.Number], jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecTransportServiceSpecSessionAffinityConfig",
    jsii_struct_bases=[],
    name_mapping={"client_ip": "clientIp"},
)
class ElasticsearchSpecTransportServiceSpecSessionAffinityConfig:
    def __init__(
        self,
        *,
        client_ip: typing.Optional[typing.Union["ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''sessionAffinityConfig contains the configurations of session affinity.

        :param client_ip: clientIP contains the configurations of Client IP based session affinity.

        :schema: ElasticsearchSpecTransportServiceSpecSessionAffinityConfig
        '''
        if isinstance(client_ip, dict):
            client_ip = ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp(**client_ip)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__caae97945658bb38454cb9eab07528320064b31df8ab591cde397dbbbe5d980a)
            check_type(argname="argument client_ip", value=client_ip, expected_type=type_hints["client_ip"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if client_ip is not None:
            self._values["client_ip"] = client_ip

    @builtins.property
    def client_ip(
        self,
    ) -> typing.Optional["ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp"]:
        '''clientIP contains the configurations of Client IP based session affinity.

        :schema: ElasticsearchSpecTransportServiceSpecSessionAffinityConfig#clientIP
        '''
        result = self._values.get("client_ip")
        return typing.cast(typing.Optional["ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecTransportServiceSpecSessionAffinityConfig(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp",
    jsii_struct_bases=[],
    name_mapping={"timeout_seconds": "timeoutSeconds"},
)
class ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp:
    def __init__(self, *, timeout_seconds: typing.Optional[jsii.Number] = None) -> None:
        '''clientIP contains the configurations of Client IP based session affinity.

        :param timeout_seconds: timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__6fa6f385c5ae8a685ef7d6bc3cab2340bd0934bd061c6edf70ecfabf3daf7bb7)
            check_type(argname="argument timeout_seconds", value=timeout_seconds, expected_type=type_hints["timeout_seconds"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if timeout_seconds is not None:
            self._values["timeout_seconds"] = timeout_seconds

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        '''timeoutSeconds specifies the seconds of ClientIP type session sticky time.

        The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).

        :schema: ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp#timeoutSeconds
        '''
        result = self._values.get("timeout_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecUpdateStrategy",
    jsii_struct_bases=[],
    name_mapping={"change_budget": "changeBudget"},
)
class ElasticsearchSpecUpdateStrategy:
    def __init__(
        self,
        *,
        change_budget: typing.Optional[typing.Union["ElasticsearchSpecUpdateStrategyChangeBudget", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''UpdateStrategy specifies how updates to the cluster should be performed.

        :param change_budget: ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.

        :schema: ElasticsearchSpecUpdateStrategy
        '''
        if isinstance(change_budget, dict):
            change_budget = ElasticsearchSpecUpdateStrategyChangeBudget(**change_budget)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__ab08b0218ae2ea3c9bdb71f33ac1ed7d215f624cc1291cdf3bf55f4aa6e72f4e)
            check_type(argname="argument change_budget", value=change_budget, expected_type=type_hints["change_budget"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if change_budget is not None:
            self._values["change_budget"] = change_budget

    @builtins.property
    def change_budget(
        self,
    ) -> typing.Optional["ElasticsearchSpecUpdateStrategyChangeBudget"]:
        '''ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.

        :schema: ElasticsearchSpecUpdateStrategy#changeBudget
        '''
        result = self._values.get("change_budget")
        return typing.cast(typing.Optional["ElasticsearchSpecUpdateStrategyChangeBudget"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecUpdateStrategy(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="coelastick8selasticsearch.ElasticsearchSpecUpdateStrategyChangeBudget",
    jsii_struct_bases=[],
    name_mapping={"max_surge": "maxSurge", "max_unavailable": "maxUnavailable"},
)
class ElasticsearchSpecUpdateStrategyChangeBudget:
    def __init__(
        self,
        *,
        max_surge: typing.Optional[jsii.Number] = None,
        max_unavailable: typing.Optional[jsii.Number] = None,
    ) -> None:
        '''ChangeBudget defines the constraints to consider when applying changes to the Elasticsearch cluster.

        :param max_surge: MaxSurge is the maximum number of new pods that can be created exceeding the original number of pods defined in the specification. MaxSurge is only taken into consideration when scaling up. Setting a negative value will disable the restriction. Defaults to unbounded if not specified. Default: unbounded if not specified.
        :param max_unavailable: MaxUnavailable is the maximum number of pods that can be unavailable (not ready) during the update due to circumstances under the control of the operator. Setting a negative value will disable this restriction. Defaults to 1 if not specified. Default: 1 if not specified.

        :schema: ElasticsearchSpecUpdateStrategyChangeBudget
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__b4b0e7558258247290e73b4bc1afa4788d78fe680e21b9fc297ebfe54af88b54)
            check_type(argname="argument max_surge", value=max_surge, expected_type=type_hints["max_surge"])
            check_type(argname="argument max_unavailable", value=max_unavailable, expected_type=type_hints["max_unavailable"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if max_surge is not None:
            self._values["max_surge"] = max_surge
        if max_unavailable is not None:
            self._values["max_unavailable"] = max_unavailable

    @builtins.property
    def max_surge(self) -> typing.Optional[jsii.Number]:
        '''MaxSurge is the maximum number of new pods that can be created exceeding the original number of pods defined in the specification.

        MaxSurge is only taken into consideration when scaling up. Setting a negative value will disable the restriction. Defaults to unbounded if not specified.

        :default: unbounded if not specified.

        :schema: ElasticsearchSpecUpdateStrategyChangeBudget#maxSurge
        '''
        result = self._values.get("max_surge")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def max_unavailable(self) -> typing.Optional[jsii.Number]:
        '''MaxUnavailable is the maximum number of pods that can be unavailable (not ready) during the update due to circumstances under the control of the operator.

        Setting a negative value will disable this restriction. Defaults to 1 if not specified.

        :default: 1 if not specified.

        :schema: ElasticsearchSpecUpdateStrategyChangeBudget#maxUnavailable
        '''
        result = self._values.get("max_unavailable")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ElasticsearchSpecUpdateStrategyChangeBudget(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "Elasticsearch",
    "ElasticsearchProps",
    "ElasticsearchSpec",
    "ElasticsearchSpecAuth",
    "ElasticsearchSpecAuthFileRealm",
    "ElasticsearchSpecAuthRoles",
    "ElasticsearchSpecHttp",
    "ElasticsearchSpecHttpService",
    "ElasticsearchSpecHttpServiceSpec",
    "ElasticsearchSpecHttpServiceSpecPorts",
    "ElasticsearchSpecHttpServiceSpecPortsTargetPort",
    "ElasticsearchSpecHttpServiceSpecSessionAffinityConfig",
    "ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp",
    "ElasticsearchSpecHttpTls",
    "ElasticsearchSpecHttpTlsCertificate",
    "ElasticsearchSpecHttpTlsSelfSignedCertificate",
    "ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames",
    "ElasticsearchSpecNodeSets",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplates",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity",
    "ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions",
    "ElasticsearchSpecPodDisruptionBudget",
    "ElasticsearchSpecPodDisruptionBudgetSpec",
    "ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable",
    "ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable",
    "ElasticsearchSpecPodDisruptionBudgetSpecSelector",
    "ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions",
    "ElasticsearchSpecRemoteClusters",
    "ElasticsearchSpecRemoteClustersElasticsearchRef",
    "ElasticsearchSpecSecureSettings",
    "ElasticsearchSpecSecureSettingsEntries",
    "ElasticsearchSpecTransport",
    "ElasticsearchSpecTransportService",
    "ElasticsearchSpecTransportServiceSpec",
    "ElasticsearchSpecTransportServiceSpecPorts",
    "ElasticsearchSpecTransportServiceSpecPortsTargetPort",
    "ElasticsearchSpecTransportServiceSpecSessionAffinityConfig",
    "ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp",
    "ElasticsearchSpecUpdateStrategy",
    "ElasticsearchSpecUpdateStrategyChangeBudget",
]

publication.publish()

def _typecheckingstub__cff49251abdb9bc40dc010529b39465d1ea11e8af5fe7572663447945f233b48(
    scope: _constructs_77d1e7e8.Construct,
    id: builtins.str,
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[ElasticsearchSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__a2ff91b5fa5c005dc0c0c8190052ea03c7f1232426b43511f8a30c637128c57a(
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[ElasticsearchSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__c6eef5c525b0140cddde99d1631259a5871adb8196d7f0456a2a9d947c378681(
    *,
    node_sets: typing.Sequence[typing.Union[ElasticsearchSpecNodeSets, typing.Dict[builtins.str, typing.Any]]],
    version: builtins.str,
    auth: typing.Optional[typing.Union[ElasticsearchSpecAuth, typing.Dict[builtins.str, typing.Any]]] = None,
    http: typing.Optional[typing.Union[ElasticsearchSpecHttp, typing.Dict[builtins.str, typing.Any]]] = None,
    image: typing.Optional[builtins.str] = None,
    pod_disruption_budget: typing.Optional[typing.Union[ElasticsearchSpecPodDisruptionBudget, typing.Dict[builtins.str, typing.Any]]] = None,
    remote_clusters: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecRemoteClusters, typing.Dict[builtins.str, typing.Any]]]] = None,
    secure_settings: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecSecureSettings, typing.Dict[builtins.str, typing.Any]]]] = None,
    service_account_name: typing.Optional[builtins.str] = None,
    transport: typing.Optional[typing.Union[ElasticsearchSpecTransport, typing.Dict[builtins.str, typing.Any]]] = None,
    update_strategy: typing.Optional[typing.Union[ElasticsearchSpecUpdateStrategy, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__014be2e01e8ecafba07c29f3adba7ad45de29b4ccdae036e2f8e6dbf0c7edb12(
    *,
    file_realm: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecAuthFileRealm, typing.Dict[builtins.str, typing.Any]]]] = None,
    roles: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecAuthRoles, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ab97c2f772134b0ffd54af352cd50e1e2f7eebc4ee2082ade51a096c01270f92(
    *,
    secret_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__f74c6873123c00453468fbbd191137d108675682e4c5f1eb5508bf357a67e335(
    *,
    secret_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__b26bfbe66ad0d5c0f44c4464fa8fb7c1394e6ae6a9109e6d681de36d0c26a392(
    *,
    service: typing.Optional[typing.Union[ElasticsearchSpecHttpService, typing.Dict[builtins.str, typing.Any]]] = None,
    tls: typing.Optional[typing.Union[ElasticsearchSpecHttpTls, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__147ecf31c16c5cc1934011e5c9f84b9626335d3b0d7cbccc710dcf7198fa8cc8(
    *,
    metadata: typing.Any = None,
    spec: typing.Optional[typing.Union[ElasticsearchSpecHttpServiceSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__64fc7a16e4a9e27eb6f43d07c225f9c63d809d7f224fa9855636e1b15e3e976a(
    *,
    cluster_ip: typing.Optional[builtins.str] = None,
    external_i_ps: typing.Optional[typing.Sequence[builtins.str]] = None,
    external_name: typing.Optional[builtins.str] = None,
    external_traffic_policy: typing.Optional[builtins.str] = None,
    health_check_node_port: typing.Optional[jsii.Number] = None,
    ip_family: typing.Optional[builtins.str] = None,
    load_balancer_ip: typing.Optional[builtins.str] = None,
    load_balancer_source_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
    ports: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecHttpServiceSpecPorts, typing.Dict[builtins.str, typing.Any]]]] = None,
    publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
    selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    session_affinity: typing.Optional[builtins.str] = None,
    session_affinity_config: typing.Optional[typing.Union[ElasticsearchSpecHttpServiceSpecSessionAffinityConfig, typing.Dict[builtins.str, typing.Any]]] = None,
    topology_keys: typing.Optional[typing.Sequence[builtins.str]] = None,
    type: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__14da688522ff22d5a8932a6b237c2fb34d5d5336bbff0b427d3004694214576a(
    *,
    port: jsii.Number,
    name: typing.Optional[builtins.str] = None,
    node_port: typing.Optional[jsii.Number] = None,
    protocol: typing.Optional[builtins.str] = None,
    target_port: typing.Optional[ElasticsearchSpecHttpServiceSpecPortsTargetPort] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__f968e9b23ed6f3a499f052de01b4f98893fe59f7b0f4a8cfa5751f327237433f(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__da446c2e533c6ed164c72a5f6e2d1714807c7a1dbfa4dd5c54855d74280edc8f(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__b2ea20a8ac52d2bcdf45bf29295c390af2c8440a4f4613887a0aa811134ca5dc(
    *,
    client_ip: typing.Optional[typing.Union[ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ac7a421c3bd09f931320ef8f12c8f867f049824e08a4a77c286a86631af5fe3e(
    *,
    timeout_seconds: typing.Optional[jsii.Number] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__d1de47e8bc1c56f7339289c5a26efab1e7a6958c29eae6311e6f573a22e9d119(
    *,
    certificate: typing.Optional[typing.Union[ElasticsearchSpecHttpTlsCertificate, typing.Dict[builtins.str, typing.Any]]] = None,
    self_signed_certificate: typing.Optional[typing.Union[ElasticsearchSpecHttpTlsSelfSignedCertificate, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ea06ef8f734e2d3709a9398dad037f2ba7f9688c6b0ae87451170dbb826d497c(
    *,
    secret_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__12ab07cdc98664637d31d5228571205c9343b8d79834ecbbc53f8a928c889089(
    *,
    disabled: typing.Optional[builtins.bool] = None,
    subject_alt_names: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__e052a1987973406b45d1fe12dd50ef10c88f27ab3da9507c6f41498ba5b8961f(
    *,
    dns: typing.Optional[builtins.str] = None,
    ip: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__1af23cf8a21065f2fd2a8d90b7594e7e6a73d08926caa2c6703463c1ba9eed99(
    *,
    count: jsii.Number,
    name: builtins.str,
    config: typing.Any = None,
    pod_template: typing.Any = None,
    volume_claim_templates: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplates, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__fef0c761188a2a995d8ed03c72c7cacbd27d9b778a54a69317b04cd9ef47a5c7(
    *,
    api_version: typing.Optional[builtins.str] = None,
    kind: typing.Optional[builtins.str] = None,
    metadata: typing.Any = None,
    spec: typing.Optional[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec, typing.Dict[builtins.str, typing.Any]]] = None,
    status: typing.Optional[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__9cfa1966f1a0a2011144de9d34f2afe7628a31bfc1baaad84336692ca25f785e(
    *,
    access_modes: typing.Optional[typing.Sequence[builtins.str]] = None,
    data_source: typing.Optional[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource, typing.Dict[builtins.str, typing.Any]]] = None,
    resources: typing.Optional[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources, typing.Dict[builtins.str, typing.Any]]] = None,
    selector: typing.Optional[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector, typing.Dict[builtins.str, typing.Any]]] = None,
    storage_class_name: typing.Optional[builtins.str] = None,
    volume_mode: typing.Optional[builtins.str] = None,
    volume_name: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__dc20007f03c3426b03f5fce03b2850955c9be4475c44d50c6fc9ba92fd95e6a8(
    *,
    kind: builtins.str,
    name: builtins.str,
    api_group: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__c1acfdb8c71436548ac556206a1c975b55ca141ff4e823361c58dff162c42518(
    *,
    limits: typing.Optional[typing.Mapping[builtins.str, ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits]] = None,
    requests: typing.Optional[typing.Mapping[builtins.str, ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ff9e234b079134d165327a63d410e9b6fa6716e01b3df98193d739da8e29070d(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__1daaf04315b1d9af9a7569c6ed918137474c38978727f88544507bc7f40b61d4(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__439a60e316385b21067cf383deee6374c7ccfd9dcd1a02c408e427364a766913(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__63acda7c19f93cf9962e446fd6c798673b83c5165eff0ffbccf67b75e96cea6d(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__4003e6363e7deeb150279fb42daf1723894a6b51dc30eedda55e26d956e86626(
    *,
    match_expressions: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions, typing.Dict[builtins.str, typing.Any]]]] = None,
    match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__4ef9bcc9702207b4a4c28053e84022b7fe2cde71d6601c662a59e4ad49c03d83(
    *,
    key: builtins.str,
    operator: builtins.str,
    values: typing.Optional[typing.Sequence[builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__dc69d79607ad5463426b98d098e6981a5c2107e6d08593bbba0f2a4a93f3ebfe(
    *,
    access_modes: typing.Optional[typing.Sequence[builtins.str]] = None,
    capacity: typing.Optional[typing.Mapping[builtins.str, ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity]] = None,
    conditions: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions, typing.Dict[builtins.str, typing.Any]]]] = None,
    phase: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__6f30641db5745931d60aca50f4ba8809e0da636ea1695769b302b3fe9b1d88a1(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__c1f0a059d8906cfc9dbdac71bb7b71c97e07866ffc4b2127bf8fcba689ea3195(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__eb74e35f8fba545c14c47021cd62f76a82e2ce53e333e3d3c813e8d07054a793(
    *,
    status: builtins.str,
    type: builtins.str,
    last_probe_time: typing.Optional[datetime.datetime] = None,
    last_transition_time: typing.Optional[datetime.datetime] = None,
    message: typing.Optional[builtins.str] = None,
    reason: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__4f611c0dd3ed5c385b33f2edc8959eca1ab86996d7e25f0bcb8f514fe3279910(
    *,
    metadata: typing.Any = None,
    spec: typing.Optional[typing.Union[ElasticsearchSpecPodDisruptionBudgetSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__aee713f9e43b25ffcd24f4f87fdea0505702e533845c8c57edd430bbf348cf18(
    *,
    max_unavailable: typing.Optional[ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable] = None,
    min_available: typing.Optional[ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable] = None,
    selector: typing.Optional[typing.Union[ElasticsearchSpecPodDisruptionBudgetSpecSelector, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__a2e6e3fefb0dc7ee4b95c616c21b165a387e362e99cfaa146482510911434ec5(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__47e121c83a56259669f693f29faca1eb84cf7cb61796305ecb199cb1d4b9dcde(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ece8f46e41867df06de5811d240bca072c3913a3395fdde4dd955fa8ac601478(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__e0a13d5966b53369a32d57a7ea5ffa43052bf73194e937e094c823a46b3e1653(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__0a126605cbc6a3dad2e373993140b2d4dffcc774226427fa982bd7b1a37f629f(
    *,
    match_expressions: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions, typing.Dict[builtins.str, typing.Any]]]] = None,
    match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__46350c4c43c6d14f0b89ad9224376d24c4e006d1fba2f8687f35ab5c8102fb45(
    *,
    key: builtins.str,
    operator: builtins.str,
    values: typing.Optional[typing.Sequence[builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__df390b7ea7ff32accb7c2cccb79fae938043c95e382aff92f04e2f109c3657cf(
    *,
    name: builtins.str,
    elasticsearch_ref: typing.Optional[typing.Union[ElasticsearchSpecRemoteClustersElasticsearchRef, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__052aca3c2596491ebd2920bf0ea20f9a1694959773552c9969246616c28fe9db(
    *,
    name: builtins.str,
    namespace: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__d7ad0bb1913dd37a5ff1637e57770fc542f9979a6710137ed13c84704df39032(
    *,
    secret_name: builtins.str,
    entries: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecSecureSettingsEntries, typing.Dict[builtins.str, typing.Any]]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__c898fe00aac1dee3feb73fc0cc6b8b0ede63c6d1bfc1af2f56e032c29d3c2d0d(
    *,
    key: builtins.str,
    path: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__23606e3001af8deb54438d5e6c2095e3514206cf161351ce82c54de88f275f8f(
    *,
    service: typing.Optional[typing.Union[ElasticsearchSpecTransportService, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__1326003475cab7d33699c82b742b126cb78d230df97515bec73321dc3eeab9ce(
    *,
    metadata: typing.Any = None,
    spec: typing.Optional[typing.Union[ElasticsearchSpecTransportServiceSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__9dda401adb9849273add2354ed76266589bb42090862c12026d41284186043e1(
    *,
    cluster_ip: typing.Optional[builtins.str] = None,
    external_i_ps: typing.Optional[typing.Sequence[builtins.str]] = None,
    external_name: typing.Optional[builtins.str] = None,
    external_traffic_policy: typing.Optional[builtins.str] = None,
    health_check_node_port: typing.Optional[jsii.Number] = None,
    ip_family: typing.Optional[builtins.str] = None,
    load_balancer_ip: typing.Optional[builtins.str] = None,
    load_balancer_source_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
    ports: typing.Optional[typing.Sequence[typing.Union[ElasticsearchSpecTransportServiceSpecPorts, typing.Dict[builtins.str, typing.Any]]]] = None,
    publish_not_ready_addresses: typing.Optional[builtins.bool] = None,
    selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    session_affinity: typing.Optional[builtins.str] = None,
    session_affinity_config: typing.Optional[typing.Union[ElasticsearchSpecTransportServiceSpecSessionAffinityConfig, typing.Dict[builtins.str, typing.Any]]] = None,
    topology_keys: typing.Optional[typing.Sequence[builtins.str]] = None,
    type: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__f9d10cba9f59b9a372d428cf4d116cc99ae9924a172096e5920a8a7508ae0ceb(
    *,
    port: jsii.Number,
    name: typing.Optional[builtins.str] = None,
    node_port: typing.Optional[jsii.Number] = None,
    protocol: typing.Optional[builtins.str] = None,
    target_port: typing.Optional[ElasticsearchSpecTransportServiceSpecPortsTargetPort] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__e132fc78e0455ba7e87a3d9506be7f455ed0250fce660eb648a3d7bd0decd192(
    value: jsii.Number,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ed151426d3cecf8a4a2e89777d38f1262ee92850857932a289b8e1b3ad6659bc(
    value: builtins.str,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__caae97945658bb38454cb9eab07528320064b31df8ab591cde397dbbbe5d980a(
    *,
    client_ip: typing.Optional[typing.Union[ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__6fa6f385c5ae8a685ef7d6bc3cab2340bd0934bd061c6edf70ecfabf3daf7bb7(
    *,
    timeout_seconds: typing.Optional[jsii.Number] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__ab08b0218ae2ea3c9bdb71f33ac1ed7d215f624cc1291cdf3bf55f4aa6e72f4e(
    *,
    change_budget: typing.Optional[typing.Union[ElasticsearchSpecUpdateStrategyChangeBudget, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__b4b0e7558258247290e73b4bc1afa4788d78fe680e21b9fc297ebfe54af88b54(
    *,
    max_surge: typing.Optional[jsii.Number] = None,
    max_unavailable: typing.Optional[jsii.Number] = None,
) -> None:
    """Type checking stubs"""
    pass
