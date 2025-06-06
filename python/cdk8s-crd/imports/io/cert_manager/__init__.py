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


class Certificate(
    _cdk8s_d3d9af27.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="iocert-manager.Certificate",
):
    '''A Certificate resource should be created to ensure an up to date and signed X.509 certificate is stored in the Kubernetes Secret resource named in ``spec.secretName``.

    The stored certificate will be renewed before it expires (as configured by ``spec.renewBefore``).

    :schema: Certificate
    '''

    def __init__(
        self,
        scope: _constructs_77d1e7e8.Construct,
        id: builtins.str,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["CertificateSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Defines a "Certificate" API object.

        :param scope: the scope in which to define this object.
        :param id: a scope-local name for the object.
        :param metadata: 
        :param spec: Specification of the desired state of the Certificate resource. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__83eb4f4530b52ea6853e7191f39bd5a69bc44c12fc79ff4293d5c610eaab4318)
            check_type(argname="argument scope", value=scope, expected_type=type_hints["scope"])
            check_type(argname="argument id", value=id, expected_type=type_hints["id"])
        props = CertificateProps(metadata=metadata, spec=spec)

        jsii.create(self.__class__, self, [scope, id, props])

    @jsii.member(jsii_name="manifest")
    @builtins.classmethod
    def manifest(
        cls,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["CertificateSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> typing.Any:
        '''Renders a Kubernetes manifest for "Certificate".

        This can be used to inline resource manifests inside other objects (e.g. as templates).

        :param metadata: 
        :param spec: Specification of the desired state of the Certificate resource. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        '''
        props = CertificateProps(metadata=metadata, spec=spec)

        return typing.cast(typing.Any, jsii.sinvoke(cls, "manifest", [props]))

    @jsii.member(jsii_name="toJson")
    def to_json(self) -> typing.Any:
        '''Renders the object to Kubernetes JSON.'''
        return typing.cast(typing.Any, jsii.invoke(self, "toJson", []))

    @jsii.python.classproperty
    @jsii.member(jsii_name="GVK")
    def GVK(cls) -> _cdk8s_d3d9af27.GroupVersionKind:
        '''Returns the apiVersion and kind for "Certificate".'''
        return typing.cast(_cdk8s_d3d9af27.GroupVersionKind, jsii.sget(cls, "GVK"))


@jsii.data_type(
    jsii_type="iocert-manager.CertificateProps",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class CertificateProps:
    def __init__(
        self,
        *,
        metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
        spec: typing.Optional[typing.Union["CertificateSpec", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''A Certificate resource should be created to ensure an up to date and signed X.509 certificate is stored in the Kubernetes Secret resource named in ``spec.secretName``.

        The stored certificate will be renewed before it expires (as configured by ``spec.renewBefore``).

        :param metadata: 
        :param spec: Specification of the desired state of the Certificate resource. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status

        :schema: Certificate
        '''
        if isinstance(metadata, dict):
            metadata = _cdk8s_d3d9af27.ApiObjectMetadata(**metadata)
        if isinstance(spec, dict):
            spec = CertificateSpec(**spec)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__45dc788c1d2b0c9f9222a2fa306cf217f2020644af3fa92be5fa925ad20fa0c3)
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
        :schema: Certificate#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Optional[_cdk8s_d3d9af27.ApiObjectMetadata], result)

    @builtins.property
    def spec(self) -> typing.Optional["CertificateSpec"]:
        '''Specification of the desired state of the Certificate resource.

        https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status

        :schema: Certificate#spec
        '''
        result = self._values.get("spec")
        return typing.cast(typing.Optional["CertificateSpec"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateProps(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpec",
    jsii_struct_bases=[],
    name_mapping={
        "issuer_ref": "issuerRef",
        "secret_name": "secretName",
        "additional_output_formats": "additionalOutputFormats",
        "common_name": "commonName",
        "dns_names": "dnsNames",
        "duration": "duration",
        "email_addresses": "emailAddresses",
        "encode_usages_in_request": "encodeUsagesInRequest",
        "ip_addresses": "ipAddresses",
        "is_ca": "isCa",
        "keystores": "keystores",
        "literal_subject": "literalSubject",
        "name_constraints": "nameConstraints",
        "other_names": "otherNames",
        "private_key": "privateKey",
        "renew_before": "renewBefore",
        "renew_before_percentage": "renewBeforePercentage",
        "revision_history_limit": "revisionHistoryLimit",
        "secret_template": "secretTemplate",
        "signature_algorithm": "signatureAlgorithm",
        "subject": "subject",
        "uris": "uris",
        "usages": "usages",
    },
)
class CertificateSpec:
    def __init__(
        self,
        *,
        issuer_ref: typing.Union["CertificateSpecIssuerRef", typing.Dict[builtins.str, typing.Any]],
        secret_name: builtins.str,
        additional_output_formats: typing.Optional[typing.Sequence[typing.Union["CertificateSpecAdditionalOutputFormats", typing.Dict[builtins.str, typing.Any]]]] = None,
        common_name: typing.Optional[builtins.str] = None,
        dns_names: typing.Optional[typing.Sequence[builtins.str]] = None,
        duration: typing.Optional[builtins.str] = None,
        email_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
        encode_usages_in_request: typing.Optional[builtins.bool] = None,
        ip_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
        is_ca: typing.Optional[builtins.bool] = None,
        keystores: typing.Optional[typing.Union["CertificateSpecKeystores", typing.Dict[builtins.str, typing.Any]]] = None,
        literal_subject: typing.Optional[builtins.str] = None,
        name_constraints: typing.Optional[typing.Union["CertificateSpecNameConstraints", typing.Dict[builtins.str, typing.Any]]] = None,
        other_names: typing.Optional[typing.Sequence[typing.Union["CertificateSpecOtherNames", typing.Dict[builtins.str, typing.Any]]]] = None,
        private_key: typing.Optional[typing.Union["CertificateSpecPrivateKey", typing.Dict[builtins.str, typing.Any]]] = None,
        renew_before: typing.Optional[builtins.str] = None,
        renew_before_percentage: typing.Optional[jsii.Number] = None,
        revision_history_limit: typing.Optional[jsii.Number] = None,
        secret_template: typing.Optional[typing.Union["CertificateSpecSecretTemplate", typing.Dict[builtins.str, typing.Any]]] = None,
        signature_algorithm: typing.Optional["CertificateSpecSignatureAlgorithm"] = None,
        subject: typing.Optional[typing.Union["CertificateSpecSubject", typing.Dict[builtins.str, typing.Any]]] = None,
        uris: typing.Optional[typing.Sequence[builtins.str]] = None,
        usages: typing.Optional[typing.Sequence["CertificateSpecUsages"]] = None,
    ) -> None:
        '''Specification of the desired state of the Certificate resource.

        https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status

        :param issuer_ref: Reference to the issuer responsible for issuing the certificate. If the issuer is namespace-scoped, it must be in the same namespace as the Certificate. If the issuer is cluster-scoped, it can be used from any namespace. The ``name`` field of the reference must always be specified.
        :param secret_name: Name of the Secret resource that will be automatically created and managed by this Certificate resource. It will be populated with a private key and certificate, signed by the denoted issuer. The Secret resource lives in the same namespace as the Certificate resource.
        :param additional_output_formats: Defines extra output formats of the private key and signed certificate chain to be written to this Certificate's target Secret.
        :param common_name: Requested common name X509 certificate subject attribute. More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6 NOTE: TLS clients will ignore this value when any subject alternative name is set (see https://tools.ietf.org/html/rfc6125#section-6.4.4). Should have a length of 64 characters or fewer to avoid generating invalid CSRs. Cannot be set if the ``literalSubject`` field is set.
        :param dns_names: Requested DNS subject alternative names.
        :param duration: Requested 'duration' (i.e. lifetime) of the Certificate. Note that the issuer may choose to ignore the requested duration, just like any other requested attribute. If unset, this defaults to 90 days. Minimum accepted duration is 1 hour. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration.
        :param email_addresses: Requested email subject alternative names.
        :param encode_usages_in_request: Whether the KeyUsage and ExtKeyUsage extensions should be set in the encoded CSR. This option defaults to true, and should only be disabled if the target issuer does not support CSRs with these X509 KeyUsage/ ExtKeyUsage extensions.
        :param ip_addresses: Requested IP address subject alternative names.
        :param is_ca: Requested basic constraints isCA value. The isCA value is used to set the ``isCA`` field on the created CertificateRequest resources. Note that the issuer may choose to ignore the requested isCA value, just like any other requested attribute. If true, this will automatically add the ``cert sign`` usage to the list of requested ``usages``.
        :param keystores: Additional keystore output formats to be stored in the Certificate's Secret.
        :param literal_subject: Requested X.509 certificate subject, represented using the LDAP "String Representation of a Distinguished Name" [1]. Important: the LDAP string format also specifies the order of the attributes in the subject, this is important when issuing certs for LDAP authentication. Example: ``CN=foo,DC=corp,DC=example,DC=com`` More info [1]: https://datatracker.ietf.org/doc/html/rfc4514 More info: https://github.com/cert-manager/cert-manager/issues/3203 More info: https://github.com/cert-manager/cert-manager/issues/4424. Cannot be set if the ``subject`` or ``commonName`` field is set.
        :param name_constraints: x.509 certificate NameConstraint extension which MUST NOT be used in a non-CA certificate. More Info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.10. This is an Alpha Feature and is only enabled with the ``--feature-gates=NameConstraints=true`` option set on both the controller and webhook components.
        :param other_names: ``otherNames`` is an escape hatch for SAN that allows any type. We currently restrict the support to string like otherNames, cf RFC 5280 p 37 Any UTF8 String valued otherName can be passed with by setting the keys oid: x.x.x.x and UTF8Value: somevalue for ``otherName``. Most commonly this would be UPN set with oid: 1.3.6.1.4.1.311.20.2.3 You should ensure that any OID passed is valid for the UTF8String type as we do not explicitly validate this.
        :param private_key: Private key options. These include the key algorithm and size, the used encoding and the rotation policy.
        :param renew_before: How long before the currently issued certificate's expiry cert-manager should renew the certificate. For example, if a certificate is valid for 60 minutes, and ``renewBefore=10m``, cert-manager will begin to attempt to renew the certificate 50 minutes after it was issued (i.e. when there are 10 minutes remaining until the certificate is no longer valid). NOTE: The actual lifetime of the issued certificate is used to determine the renewal time. If an issuer returns a certificate with a different lifetime than the one requested, cert-manager will use the lifetime of the issued certificate. If unset, this defaults to 1/3 of the issued certificate's lifetime. Minimum accepted value is 5 minutes. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration. Cannot be set if the ``renewBeforePercentage`` field is set.
        :param renew_before_percentage: ``renewBeforePercentage`` is like ``renewBefore``, except it is a relative percentage rather than an absolute duration. For example, if a certificate is valid for 60 minutes, and ``renewBeforePercentage=25``, cert-manager will begin to attempt to renew the certificate 45 minutes after it was issued (i.e. when there are 15 minutes (25%) remaining until the certificate is no longer valid). NOTE: The actual lifetime of the issued certificate is used to determine the renewal time. If an issuer returns a certificate with a different lifetime than the one requested, cert-manager will use the lifetime of the issued certificate. Value must be an integer in the range (0,100). The minimum effective ``renewBefore`` derived from the ``renewBeforePercentage`` and ``duration`` fields is 5 minutes. Cannot be set if the ``renewBefore`` field is set.
        :param revision_history_limit: The maximum number of CertificateRequest revisions that are maintained in the Certificate's history. Each revision represents a single ``CertificateRequest`` created by this Certificate, either when it was created, renewed, or Spec was changed. Revisions will be removed by oldest first if the number of revisions exceeds this number. If set, revisionHistoryLimit must be a value of ``1`` or greater. Default value is ``1``.
        :param secret_template: Defines annotations and labels to be copied to the Certificate's Secret. Labels and annotations on the Secret will be changed as they appear on the SecretTemplate when added or removed. SecretTemplate annotations are added in conjunction with, and cannot overwrite, the base set of annotations cert-manager sets on the Certificate's Secret.
        :param signature_algorithm: Signature algorith to use. Allowed values for RSA keys: SHA256WithRSA, SHA384WithRSA, SHA512WithRSA. Allowed values for ECDSA keys: ECDSAWithSHA256, ECDSAWithSHA384, ECDSAWithSHA512. Allowed values for Ed25519 keys: PureEd25519.
        :param subject: Requested set of X509 certificate subject attributes. More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6. The common name attribute is specified separately in the ``commonName`` field. Cannot be set if the ``literalSubject`` field is set.
        :param uris: Requested URI subject alternative names.
        :param usages: Requested key usages and extended key usages. These usages are used to set the ``usages`` field on the created CertificateRequest resources. If ``encodeUsagesInRequest`` is unset or set to ``true``, the usages will additionally be encoded in the ``request`` field which contains the CSR blob. If unset, defaults to ``digital signature`` and ``key encipherment``.

        :schema: CertificateSpec
        '''
        if isinstance(issuer_ref, dict):
            issuer_ref = CertificateSpecIssuerRef(**issuer_ref)
        if isinstance(keystores, dict):
            keystores = CertificateSpecKeystores(**keystores)
        if isinstance(name_constraints, dict):
            name_constraints = CertificateSpecNameConstraints(**name_constraints)
        if isinstance(private_key, dict):
            private_key = CertificateSpecPrivateKey(**private_key)
        if isinstance(secret_template, dict):
            secret_template = CertificateSpecSecretTemplate(**secret_template)
        if isinstance(subject, dict):
            subject = CertificateSpecSubject(**subject)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__32dc1d8bfeef97dbd877eaeb718c4dc3768875c6ca7b447e1282f47888feb140)
            check_type(argname="argument issuer_ref", value=issuer_ref, expected_type=type_hints["issuer_ref"])
            check_type(argname="argument secret_name", value=secret_name, expected_type=type_hints["secret_name"])
            check_type(argname="argument additional_output_formats", value=additional_output_formats, expected_type=type_hints["additional_output_formats"])
            check_type(argname="argument common_name", value=common_name, expected_type=type_hints["common_name"])
            check_type(argname="argument dns_names", value=dns_names, expected_type=type_hints["dns_names"])
            check_type(argname="argument duration", value=duration, expected_type=type_hints["duration"])
            check_type(argname="argument email_addresses", value=email_addresses, expected_type=type_hints["email_addresses"])
            check_type(argname="argument encode_usages_in_request", value=encode_usages_in_request, expected_type=type_hints["encode_usages_in_request"])
            check_type(argname="argument ip_addresses", value=ip_addresses, expected_type=type_hints["ip_addresses"])
            check_type(argname="argument is_ca", value=is_ca, expected_type=type_hints["is_ca"])
            check_type(argname="argument keystores", value=keystores, expected_type=type_hints["keystores"])
            check_type(argname="argument literal_subject", value=literal_subject, expected_type=type_hints["literal_subject"])
            check_type(argname="argument name_constraints", value=name_constraints, expected_type=type_hints["name_constraints"])
            check_type(argname="argument other_names", value=other_names, expected_type=type_hints["other_names"])
            check_type(argname="argument private_key", value=private_key, expected_type=type_hints["private_key"])
            check_type(argname="argument renew_before", value=renew_before, expected_type=type_hints["renew_before"])
            check_type(argname="argument renew_before_percentage", value=renew_before_percentage, expected_type=type_hints["renew_before_percentage"])
            check_type(argname="argument revision_history_limit", value=revision_history_limit, expected_type=type_hints["revision_history_limit"])
            check_type(argname="argument secret_template", value=secret_template, expected_type=type_hints["secret_template"])
            check_type(argname="argument signature_algorithm", value=signature_algorithm, expected_type=type_hints["signature_algorithm"])
            check_type(argname="argument subject", value=subject, expected_type=type_hints["subject"])
            check_type(argname="argument uris", value=uris, expected_type=type_hints["uris"])
            check_type(argname="argument usages", value=usages, expected_type=type_hints["usages"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "issuer_ref": issuer_ref,
            "secret_name": secret_name,
        }
        if additional_output_formats is not None:
            self._values["additional_output_formats"] = additional_output_formats
        if common_name is not None:
            self._values["common_name"] = common_name
        if dns_names is not None:
            self._values["dns_names"] = dns_names
        if duration is not None:
            self._values["duration"] = duration
        if email_addresses is not None:
            self._values["email_addresses"] = email_addresses
        if encode_usages_in_request is not None:
            self._values["encode_usages_in_request"] = encode_usages_in_request
        if ip_addresses is not None:
            self._values["ip_addresses"] = ip_addresses
        if is_ca is not None:
            self._values["is_ca"] = is_ca
        if keystores is not None:
            self._values["keystores"] = keystores
        if literal_subject is not None:
            self._values["literal_subject"] = literal_subject
        if name_constraints is not None:
            self._values["name_constraints"] = name_constraints
        if other_names is not None:
            self._values["other_names"] = other_names
        if private_key is not None:
            self._values["private_key"] = private_key
        if renew_before is not None:
            self._values["renew_before"] = renew_before
        if renew_before_percentage is not None:
            self._values["renew_before_percentage"] = renew_before_percentage
        if revision_history_limit is not None:
            self._values["revision_history_limit"] = revision_history_limit
        if secret_template is not None:
            self._values["secret_template"] = secret_template
        if signature_algorithm is not None:
            self._values["signature_algorithm"] = signature_algorithm
        if subject is not None:
            self._values["subject"] = subject
        if uris is not None:
            self._values["uris"] = uris
        if usages is not None:
            self._values["usages"] = usages

    @builtins.property
    def issuer_ref(self) -> "CertificateSpecIssuerRef":
        '''Reference to the issuer responsible for issuing the certificate.

        If the issuer is namespace-scoped, it must be in the same namespace
        as the Certificate. If the issuer is cluster-scoped, it can be used
        from any namespace.

        The ``name`` field of the reference must always be specified.

        :schema: CertificateSpec#issuerRef
        '''
        result = self._values.get("issuer_ref")
        assert result is not None, "Required property 'issuer_ref' is missing"
        return typing.cast("CertificateSpecIssuerRef", result)

    @builtins.property
    def secret_name(self) -> builtins.str:
        '''Name of the Secret resource that will be automatically created and managed by this Certificate resource.

        It will be populated with a
        private key and certificate, signed by the denoted issuer. The Secret
        resource lives in the same namespace as the Certificate resource.

        :schema: CertificateSpec#secretName
        '''
        result = self._values.get("secret_name")
        assert result is not None, "Required property 'secret_name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def additional_output_formats(
        self,
    ) -> typing.Optional[typing.List["CertificateSpecAdditionalOutputFormats"]]:
        '''Defines extra output formats of the private key and signed certificate chain to be written to this Certificate's target Secret.

        :schema: CertificateSpec#additionalOutputFormats
        '''
        result = self._values.get("additional_output_formats")
        return typing.cast(typing.Optional[typing.List["CertificateSpecAdditionalOutputFormats"]], result)

    @builtins.property
    def common_name(self) -> typing.Optional[builtins.str]:
        '''Requested common name X509 certificate subject attribute.

        More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6
        NOTE: TLS clients will ignore this value when any subject alternative name is
        set (see https://tools.ietf.org/html/rfc6125#section-6.4.4).

        Should have a length of 64 characters or fewer to avoid generating invalid CSRs.
        Cannot be set if the ``literalSubject`` field is set.

        :schema: CertificateSpec#commonName
        '''
        result = self._values.get("common_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def dns_names(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Requested DNS subject alternative names.

        :schema: CertificateSpec#dnsNames
        '''
        result = self._values.get("dns_names")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def duration(self) -> typing.Optional[builtins.str]:
        '''Requested 'duration' (i.e. lifetime) of the Certificate. Note that the issuer may choose to ignore the requested duration, just like any other requested attribute.

        If unset, this defaults to 90 days.
        Minimum accepted duration is 1 hour.
        Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration.

        :schema: CertificateSpec#duration
        '''
        result = self._values.get("duration")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def email_addresses(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Requested email subject alternative names.

        :schema: CertificateSpec#emailAddresses
        '''
        result = self._values.get("email_addresses")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def encode_usages_in_request(self) -> typing.Optional[builtins.bool]:
        '''Whether the KeyUsage and ExtKeyUsage extensions should be set in the encoded CSR.

        This option defaults to true, and should only be disabled if the target
        issuer does not support CSRs with these X509 KeyUsage/ ExtKeyUsage extensions.

        :schema: CertificateSpec#encodeUsagesInRequest
        '''
        result = self._values.get("encode_usages_in_request")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def ip_addresses(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Requested IP address subject alternative names.

        :schema: CertificateSpec#ipAddresses
        '''
        result = self._values.get("ip_addresses")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def is_ca(self) -> typing.Optional[builtins.bool]:
        '''Requested basic constraints isCA value.

        The isCA value is used to set the ``isCA`` field on the created CertificateRequest
        resources. Note that the issuer may choose to ignore the requested isCA value, just
        like any other requested attribute.

        If true, this will automatically add the ``cert sign`` usage to the list
        of requested ``usages``.

        :schema: CertificateSpec#isCA
        '''
        result = self._values.get("is_ca")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def keystores(self) -> typing.Optional["CertificateSpecKeystores"]:
        '''Additional keystore output formats to be stored in the Certificate's Secret.

        :schema: CertificateSpec#keystores
        '''
        result = self._values.get("keystores")
        return typing.cast(typing.Optional["CertificateSpecKeystores"], result)

    @builtins.property
    def literal_subject(self) -> typing.Optional[builtins.str]:
        '''Requested X.509 certificate subject, represented using the LDAP "String Representation of a Distinguished Name" [1]. Important: the LDAP string format also specifies the order of the attributes in the subject, this is important when issuing certs for LDAP authentication. Example: ``CN=foo,DC=corp,DC=example,DC=com`` More info [1]: https://datatracker.ietf.org/doc/html/rfc4514 More info: https://github.com/cert-manager/cert-manager/issues/3203 More info: https://github.com/cert-manager/cert-manager/issues/4424.

        Cannot be set if the ``subject`` or ``commonName`` field is set.

        :schema: CertificateSpec#literalSubject
        '''
        result = self._values.get("literal_subject")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def name_constraints(self) -> typing.Optional["CertificateSpecNameConstraints"]:
        '''x.509 certificate NameConstraint extension which MUST NOT be used in a non-CA certificate. More Info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.10.

        This is an Alpha Feature and is only enabled with the
        ``--feature-gates=NameConstraints=true`` option set on both
        the controller and webhook components.

        :schema: CertificateSpec#nameConstraints
        '''
        result = self._values.get("name_constraints")
        return typing.cast(typing.Optional["CertificateSpecNameConstraints"], result)

    @builtins.property
    def other_names(self) -> typing.Optional[typing.List["CertificateSpecOtherNames"]]:
        '''``otherNames`` is an escape hatch for SAN that allows any type.

        We currently restrict the support to string like otherNames, cf RFC 5280 p 37
        Any UTF8 String valued otherName can be passed with by setting the keys oid: x.x.x.x and UTF8Value: somevalue for ``otherName``.
        Most commonly this would be UPN set with oid: 1.3.6.1.4.1.311.20.2.3
        You should ensure that any OID passed is valid for the UTF8String type as we do not explicitly validate this.

        :schema: CertificateSpec#otherNames
        '''
        result = self._values.get("other_names")
        return typing.cast(typing.Optional[typing.List["CertificateSpecOtherNames"]], result)

    @builtins.property
    def private_key(self) -> typing.Optional["CertificateSpecPrivateKey"]:
        '''Private key options.

        These include the key algorithm and size, the used
        encoding and the rotation policy.

        :schema: CertificateSpec#privateKey
        '''
        result = self._values.get("private_key")
        return typing.cast(typing.Optional["CertificateSpecPrivateKey"], result)

    @builtins.property
    def renew_before(self) -> typing.Optional[builtins.str]:
        '''How long before the currently issued certificate's expiry cert-manager should renew the certificate.

        For example, if a certificate is valid for 60 minutes,
        and ``renewBefore=10m``, cert-manager will begin to attempt to renew the certificate
        50 minutes after it was issued (i.e. when there are 10 minutes remaining until
        the certificate is no longer valid).

        NOTE: The actual lifetime of the issued certificate is used to determine the
        renewal time. If an issuer returns a certificate with a different lifetime than
        the one requested, cert-manager will use the lifetime of the issued certificate.

        If unset, this defaults to 1/3 of the issued certificate's lifetime.
        Minimum accepted value is 5 minutes.
        Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration.
        Cannot be set if the ``renewBeforePercentage`` field is set.

        :schema: CertificateSpec#renewBefore
        '''
        result = self._values.get("renew_before")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def renew_before_percentage(self) -> typing.Optional[jsii.Number]:
        '''``renewBeforePercentage`` is like ``renewBefore``, except it is a relative percentage rather than an absolute duration.

        For example, if a certificate is valid for 60
        minutes, and  ``renewBeforePercentage=25``, cert-manager will begin to attempt to
        renew the certificate 45 minutes after it was issued (i.e. when there are 15
        minutes (25%) remaining until the certificate is no longer valid).

        NOTE: The actual lifetime of the issued certificate is used to determine the
        renewal time. If an issuer returns a certificate with a different lifetime than
        the one requested, cert-manager will use the lifetime of the issued certificate.

        Value must be an integer in the range (0,100). The minimum effective
        ``renewBefore`` derived from the ``renewBeforePercentage`` and ``duration`` fields is 5
        minutes.
        Cannot be set if the ``renewBefore`` field is set.

        :schema: CertificateSpec#renewBeforePercentage
        '''
        result = self._values.get("renew_before_percentage")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def revision_history_limit(self) -> typing.Optional[jsii.Number]:
        '''The maximum number of CertificateRequest revisions that are maintained in the Certificate's history.

        Each revision represents a single ``CertificateRequest``
        created by this Certificate, either when it was created, renewed, or Spec
        was changed. Revisions will be removed by oldest first if the number of
        revisions exceeds this number.

        If set, revisionHistoryLimit must be a value of ``1`` or greater.
        Default value is ``1``.

        :schema: CertificateSpec#revisionHistoryLimit
        '''
        result = self._values.get("revision_history_limit")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def secret_template(self) -> typing.Optional["CertificateSpecSecretTemplate"]:
        '''Defines annotations and labels to be copied to the Certificate's Secret.

        Labels and annotations on the Secret will be changed as they appear on the
        SecretTemplate when added or removed. SecretTemplate annotations are added
        in conjunction with, and cannot overwrite, the base set of annotations
        cert-manager sets on the Certificate's Secret.

        :schema: CertificateSpec#secretTemplate
        '''
        result = self._values.get("secret_template")
        return typing.cast(typing.Optional["CertificateSpecSecretTemplate"], result)

    @builtins.property
    def signature_algorithm(
        self,
    ) -> typing.Optional["CertificateSpecSignatureAlgorithm"]:
        '''Signature algorith to use.

        Allowed values for RSA keys: SHA256WithRSA, SHA384WithRSA, SHA512WithRSA.
        Allowed values for ECDSA keys: ECDSAWithSHA256, ECDSAWithSHA384, ECDSAWithSHA512.
        Allowed values for Ed25519 keys: PureEd25519.

        :schema: CertificateSpec#signatureAlgorithm
        '''
        result = self._values.get("signature_algorithm")
        return typing.cast(typing.Optional["CertificateSpecSignatureAlgorithm"], result)

    @builtins.property
    def subject(self) -> typing.Optional["CertificateSpecSubject"]:
        '''Requested set of X509 certificate subject attributes. More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6.

        The common name attribute is specified separately in the ``commonName`` field.
        Cannot be set if the ``literalSubject`` field is set.

        :schema: CertificateSpec#subject
        '''
        result = self._values.get("subject")
        return typing.cast(typing.Optional["CertificateSpecSubject"], result)

    @builtins.property
    def uris(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Requested URI subject alternative names.

        :schema: CertificateSpec#uris
        '''
        result = self._values.get("uris")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def usages(self) -> typing.Optional[typing.List["CertificateSpecUsages"]]:
        '''Requested key usages and extended key usages.

        These usages are used to set the ``usages`` field on the created CertificateRequest
        resources. If ``encodeUsagesInRequest`` is unset or set to ``true``, the usages
        will additionally be encoded in the ``request`` field which contains the CSR blob.

        If unset, defaults to ``digital signature`` and ``key encipherment``.

        :schema: CertificateSpec#usages
        '''
        result = self._values.get("usages")
        return typing.cast(typing.Optional[typing.List["CertificateSpecUsages"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecAdditionalOutputFormats",
    jsii_struct_bases=[],
    name_mapping={"type": "type"},
)
class CertificateSpecAdditionalOutputFormats:
    def __init__(self, *, type: "CertificateSpecAdditionalOutputFormatsType") -> None:
        '''CertificateAdditionalOutputFormat defines an additional output format of a Certificate resource.

        These contain supplementary data formats of the signed
        certificate chain and paired private key.

        :param type: Type is the name of the format type that should be written to the Certificate's target Secret.

        :schema: CertificateSpecAdditionalOutputFormats
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__b105d0e0ff4812a7d27236854fdec57381ceb1aebb380c990c0158888686634f)
            check_type(argname="argument type", value=type, expected_type=type_hints["type"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "type": type,
        }

    @builtins.property
    def type(self) -> "CertificateSpecAdditionalOutputFormatsType":
        '''Type is the name of the format type that should be written to the Certificate's target Secret.

        :schema: CertificateSpecAdditionalOutputFormats#type
        '''
        result = self._values.get("type")
        assert result is not None, "Required property 'type' is missing"
        return typing.cast("CertificateSpecAdditionalOutputFormatsType", result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecAdditionalOutputFormats(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.enum(jsii_type="iocert-manager.CertificateSpecAdditionalOutputFormatsType")
class CertificateSpecAdditionalOutputFormatsType(enum.Enum):
    '''Type is the name of the format type that should be written to the Certificate's target Secret.

    :schema: CertificateSpecAdditionalOutputFormatsType
    '''

    DER = "DER"
    '''DER.'''
    COMBINED_PEM = "COMBINED_PEM"
    '''CombinedPEM.'''


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecIssuerRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "group": "group", "kind": "kind"},
)
class CertificateSpecIssuerRef:
    def __init__(
        self,
        *,
        name: builtins.str,
        group: typing.Optional[builtins.str] = None,
        kind: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Reference to the issuer responsible for issuing the certificate.

        If the issuer is namespace-scoped, it must be in the same namespace
        as the Certificate. If the issuer is cluster-scoped, it can be used
        from any namespace.

        The ``name`` field of the reference must always be specified.

        :param name: Name of the resource being referred to.
        :param group: Group of the resource being referred to.
        :param kind: Kind of the resource being referred to.

        :schema: CertificateSpecIssuerRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__250ffc36555234fb3774546a78f06060f14ef24da211d902560be0f8f100fb0b)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument group", value=group, expected_type=type_hints["group"])
            check_type(argname="argument kind", value=kind, expected_type=type_hints["kind"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "name": name,
        }
        if group is not None:
            self._values["group"] = group
        if kind is not None:
            self._values["kind"] = kind

    @builtins.property
    def name(self) -> builtins.str:
        '''Name of the resource being referred to.

        :schema: CertificateSpecIssuerRef#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def group(self) -> typing.Optional[builtins.str]:
        '''Group of the resource being referred to.

        :schema: CertificateSpecIssuerRef#group
        '''
        result = self._values.get("group")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def kind(self) -> typing.Optional[builtins.str]:
        '''Kind of the resource being referred to.

        :schema: CertificateSpecIssuerRef#kind
        '''
        result = self._values.get("kind")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecIssuerRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecKeystores",
    jsii_struct_bases=[],
    name_mapping={"jks": "jks", "pkcs12": "pkcs12"},
)
class CertificateSpecKeystores:
    def __init__(
        self,
        *,
        jks: typing.Optional[typing.Union["CertificateSpecKeystoresJks", typing.Dict[builtins.str, typing.Any]]] = None,
        pkcs12: typing.Optional[typing.Union["CertificateSpecKeystoresPkcs12", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''Additional keystore output formats to be stored in the Certificate's Secret.

        :param jks: JKS configures options for storing a JKS keystore in the ``spec.secretName`` Secret resource.
        :param pkcs12: PKCS12 configures options for storing a PKCS12 keystore in the ``spec.secretName`` Secret resource.

        :schema: CertificateSpecKeystores
        '''
        if isinstance(jks, dict):
            jks = CertificateSpecKeystoresJks(**jks)
        if isinstance(pkcs12, dict):
            pkcs12 = CertificateSpecKeystoresPkcs12(**pkcs12)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__304190a06d3e60433de1a2655ea13ece3d452ac5995f8f0e820230f00e479dd2)
            check_type(argname="argument jks", value=jks, expected_type=type_hints["jks"])
            check_type(argname="argument pkcs12", value=pkcs12, expected_type=type_hints["pkcs12"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if jks is not None:
            self._values["jks"] = jks
        if pkcs12 is not None:
            self._values["pkcs12"] = pkcs12

    @builtins.property
    def jks(self) -> typing.Optional["CertificateSpecKeystoresJks"]:
        '''JKS configures options for storing a JKS keystore in the ``spec.secretName`` Secret resource.

        :schema: CertificateSpecKeystores#jks
        '''
        result = self._values.get("jks")
        return typing.cast(typing.Optional["CertificateSpecKeystoresJks"], result)

    @builtins.property
    def pkcs12(self) -> typing.Optional["CertificateSpecKeystoresPkcs12"]:
        '''PKCS12 configures options for storing a PKCS12 keystore in the ``spec.secretName`` Secret resource.

        :schema: CertificateSpecKeystores#pkcs12
        '''
        result = self._values.get("pkcs12")
        return typing.cast(typing.Optional["CertificateSpecKeystoresPkcs12"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecKeystores(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecKeystoresJks",
    jsii_struct_bases=[],
    name_mapping={
        "create": "create",
        "alias": "alias",
        "password": "password",
        "password_secret_ref": "passwordSecretRef",
    },
)
class CertificateSpecKeystoresJks:
    def __init__(
        self,
        *,
        create: builtins.bool,
        alias: typing.Optional[builtins.str] = None,
        password: typing.Optional[builtins.str] = None,
        password_secret_ref: typing.Optional[typing.Union["CertificateSpecKeystoresJksPasswordSecretRef", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''JKS configures options for storing a JKS keystore in the ``spec.secretName`` Secret resource.

        :param create: Create enables JKS keystore creation for the Certificate. If true, a file named ``keystore.jks`` will be created in the target Secret resource, encrypted using the password stored in ``passwordSecretRef`` or ``password``. The keystore file will be updated immediately. If the issuer provided a CA certificate, a file named ``truststore.jks`` will also be created in the target Secret resource, encrypted using the password stored in ``passwordSecretRef`` containing the issuing Certificate Authority
        :param alias: Alias specifies the alias of the key in the keystore, required by the JKS format. If not provided, the default alias ``certificate`` will be used.
        :param password: Password provides a literal password used to encrypt the JKS keystore. Mutually exclusive with passwordSecretRef. One of password or passwordSecretRef must provide a password with a non-zero length.
        :param password_secret_ref: PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the JKS keystore. Mutually exclusive with password. One of password or passwordSecretRef must provide a password with a non-zero length.

        :schema: CertificateSpecKeystoresJks
        '''
        if isinstance(password_secret_ref, dict):
            password_secret_ref = CertificateSpecKeystoresJksPasswordSecretRef(**password_secret_ref)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__571b4581314dc6da5154732cbc505ea05f780b18877fbcbc24fd2e2fa8274e62)
            check_type(argname="argument create", value=create, expected_type=type_hints["create"])
            check_type(argname="argument alias", value=alias, expected_type=type_hints["alias"])
            check_type(argname="argument password", value=password, expected_type=type_hints["password"])
            check_type(argname="argument password_secret_ref", value=password_secret_ref, expected_type=type_hints["password_secret_ref"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "create": create,
        }
        if alias is not None:
            self._values["alias"] = alias
        if password is not None:
            self._values["password"] = password
        if password_secret_ref is not None:
            self._values["password_secret_ref"] = password_secret_ref

    @builtins.property
    def create(self) -> builtins.bool:
        '''Create enables JKS keystore creation for the Certificate.

        If true, a file named ``keystore.jks`` will be created in the target
        Secret resource, encrypted using the password stored in
        ``passwordSecretRef`` or ``password``.
        The keystore file will be updated immediately.
        If the issuer provided a CA certificate, a file named ``truststore.jks``
        will also be created in the target Secret resource, encrypted using the
        password stored in ``passwordSecretRef``
        containing the issuing Certificate Authority

        :schema: CertificateSpecKeystoresJks#create
        '''
        result = self._values.get("create")
        assert result is not None, "Required property 'create' is missing"
        return typing.cast(builtins.bool, result)

    @builtins.property
    def alias(self) -> typing.Optional[builtins.str]:
        '''Alias specifies the alias of the key in the keystore, required by the JKS format.

        If not provided, the default alias ``certificate`` will be used.

        :schema: CertificateSpecKeystoresJks#alias
        '''
        result = self._values.get("alias")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def password(self) -> typing.Optional[builtins.str]:
        '''Password provides a literal password used to encrypt the JKS keystore.

        Mutually exclusive with passwordSecretRef.
        One of password or passwordSecretRef must provide a password with a non-zero length.

        :schema: CertificateSpecKeystoresJks#password
        '''
        result = self._values.get("password")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def password_secret_ref(
        self,
    ) -> typing.Optional["CertificateSpecKeystoresJksPasswordSecretRef"]:
        '''PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the JKS keystore.

        Mutually exclusive with password.
        One of password or passwordSecretRef must provide a password with a non-zero length.

        :schema: CertificateSpecKeystoresJks#passwordSecretRef
        '''
        result = self._values.get("password_secret_ref")
        return typing.cast(typing.Optional["CertificateSpecKeystoresJksPasswordSecretRef"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecKeystoresJks(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecKeystoresJksPasswordSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "key": "key"},
)
class CertificateSpecKeystoresJksPasswordSecretRef:
    def __init__(
        self,
        *,
        name: builtins.str,
        key: typing.Optional[builtins.str] = None,
    ) -> None:
        '''PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the JKS keystore.

        Mutually exclusive with password.
        One of password or passwordSecretRef must provide a password with a non-zero length.

        :param name: Name of the resource being referred to. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
        :param key: The key of the entry in the Secret resource's ``data`` field to be used. Some instances of this field may be defaulted, in others it may be required.

        :schema: CertificateSpecKeystoresJksPasswordSecretRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__4c705b97f1ec6666fe596694a6020ae107ebdb667b49d9a0e8e70230b3299e82)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "name": name,
        }
        if key is not None:
            self._values["key"] = key

    @builtins.property
    def name(self) -> builtins.str:
        '''Name of the resource being referred to.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names

        :schema: CertificateSpecKeystoresJksPasswordSecretRef#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def key(self) -> typing.Optional[builtins.str]:
        '''The key of the entry in the Secret resource's ``data`` field to be used.

        Some instances of this field may be defaulted, in others it may be
        required.

        :schema: CertificateSpecKeystoresJksPasswordSecretRef#key
        '''
        result = self._values.get("key")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecKeystoresJksPasswordSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecKeystoresPkcs12",
    jsii_struct_bases=[],
    name_mapping={
        "create": "create",
        "password": "password",
        "password_secret_ref": "passwordSecretRef",
        "profile": "profile",
    },
)
class CertificateSpecKeystoresPkcs12:
    def __init__(
        self,
        *,
        create: builtins.bool,
        password: typing.Optional[builtins.str] = None,
        password_secret_ref: typing.Optional[typing.Union["CertificateSpecKeystoresPkcs12PasswordSecretRef", typing.Dict[builtins.str, typing.Any]]] = None,
        profile: typing.Optional["CertificateSpecKeystoresPkcs12Profile"] = None,
    ) -> None:
        '''PKCS12 configures options for storing a PKCS12 keystore in the ``spec.secretName`` Secret resource.

        :param create: Create enables PKCS12 keystore creation for the Certificate. If true, a file named ``keystore.p12`` will be created in the target Secret resource, encrypted using the password stored in ``passwordSecretRef`` or in ``password``. The keystore file will be updated immediately. If the issuer provided a CA certificate, a file named ``truststore.p12`` will also be created in the target Secret resource, encrypted using the password stored in ``passwordSecretRef`` containing the issuing Certificate Authority
        :param password: Password provides a literal password used to encrypt the PKCS#12 keystore. Mutually exclusive with passwordSecretRef. One of password or passwordSecretRef must provide a password with a non-zero length.
        :param password_secret_ref: PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the PKCS#12 keystore. Mutually exclusive with password. One of password or passwordSecretRef must provide a password with a non-zero length.
        :param profile: Profile specifies the key and certificate encryption algorithms and the HMAC algorithm used to create the PKCS12 keystore. Default value is ``LegacyRC2`` for backward compatibility. If provided, allowed values are: ``LegacyRC2``: Deprecated. Not supported by default in OpenSSL 3 or Java 20. ``LegacyDES``: Less secure algorithm. Use this option for maximal compatibility. ``Modern2023``: Secure algorithm. Use this option in case you have to always use secure algorithms (e.g., because of company policy). Please note that the security of the algorithm is not that important in reality, because the unencrypted certificate and private key are also stored in the Secret.

        :schema: CertificateSpecKeystoresPkcs12
        '''
        if isinstance(password_secret_ref, dict):
            password_secret_ref = CertificateSpecKeystoresPkcs12PasswordSecretRef(**password_secret_ref)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__c5382e8480294729cddd333c0c832e9c632efa49695fb65db41f2232ecd5fb79)
            check_type(argname="argument create", value=create, expected_type=type_hints["create"])
            check_type(argname="argument password", value=password, expected_type=type_hints["password"])
            check_type(argname="argument password_secret_ref", value=password_secret_ref, expected_type=type_hints["password_secret_ref"])
            check_type(argname="argument profile", value=profile, expected_type=type_hints["profile"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "create": create,
        }
        if password is not None:
            self._values["password"] = password
        if password_secret_ref is not None:
            self._values["password_secret_ref"] = password_secret_ref
        if profile is not None:
            self._values["profile"] = profile

    @builtins.property
    def create(self) -> builtins.bool:
        '''Create enables PKCS12 keystore creation for the Certificate.

        If true, a file named ``keystore.p12`` will be created in the target
        Secret resource, encrypted using the password stored in
        ``passwordSecretRef`` or in ``password``.
        The keystore file will be updated immediately.
        If the issuer provided a CA certificate, a file named ``truststore.p12`` will
        also be created in the target Secret resource, encrypted using the
        password stored in ``passwordSecretRef`` containing the issuing Certificate
        Authority

        :schema: CertificateSpecKeystoresPkcs12#create
        '''
        result = self._values.get("create")
        assert result is not None, "Required property 'create' is missing"
        return typing.cast(builtins.bool, result)

    @builtins.property
    def password(self) -> typing.Optional[builtins.str]:
        '''Password provides a literal password used to encrypt the PKCS#12 keystore.

        Mutually exclusive with passwordSecretRef.
        One of password or passwordSecretRef must provide a password with a non-zero length.

        :schema: CertificateSpecKeystoresPkcs12#password
        '''
        result = self._values.get("password")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def password_secret_ref(
        self,
    ) -> typing.Optional["CertificateSpecKeystoresPkcs12PasswordSecretRef"]:
        '''PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the PKCS#12 keystore.

        Mutually exclusive with password.
        One of password or passwordSecretRef must provide a password with a non-zero length.

        :schema: CertificateSpecKeystoresPkcs12#passwordSecretRef
        '''
        result = self._values.get("password_secret_ref")
        return typing.cast(typing.Optional["CertificateSpecKeystoresPkcs12PasswordSecretRef"], result)

    @builtins.property
    def profile(self) -> typing.Optional["CertificateSpecKeystoresPkcs12Profile"]:
        '''Profile specifies the key and certificate encryption algorithms and the HMAC algorithm used to create the PKCS12 keystore.

        Default value is ``LegacyRC2`` for backward compatibility.

        If provided, allowed values are:
        ``LegacyRC2``: Deprecated. Not supported by default in OpenSSL 3 or Java 20.
        ``LegacyDES``: Less secure algorithm. Use this option for maximal compatibility.
        ``Modern2023``: Secure algorithm. Use this option in case you have to always use secure algorithms
        (e.g., because of company policy). Please note that the security of the algorithm is not that important
        in reality, because the unencrypted certificate and private key are also stored in the Secret.

        :schema: CertificateSpecKeystoresPkcs12#profile
        '''
        result = self._values.get("profile")
        return typing.cast(typing.Optional["CertificateSpecKeystoresPkcs12Profile"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecKeystoresPkcs12(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecKeystoresPkcs12PasswordSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "key": "key"},
)
class CertificateSpecKeystoresPkcs12PasswordSecretRef:
    def __init__(
        self,
        *,
        name: builtins.str,
        key: typing.Optional[builtins.str] = None,
    ) -> None:
        '''PasswordSecretRef is a reference to a non-empty key in a Secret resource containing the password used to encrypt the PKCS#12 keystore.

        Mutually exclusive with password.
        One of password or passwordSecretRef must provide a password with a non-zero length.

        :param name: Name of the resource being referred to. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
        :param key: The key of the entry in the Secret resource's ``data`` field to be used. Some instances of this field may be defaulted, in others it may be required.

        :schema: CertificateSpecKeystoresPkcs12PasswordSecretRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__20086e6fd1b2e1e2a9457b1cfb63413328de2c314da016e54e9a15a2a0a98681)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
        self._values: typing.Dict[builtins.str, typing.Any] = {
            "name": name,
        }
        if key is not None:
            self._values["key"] = key

    @builtins.property
    def name(self) -> builtins.str:
        '''Name of the resource being referred to.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names

        :schema: CertificateSpecKeystoresPkcs12PasswordSecretRef#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def key(self) -> typing.Optional[builtins.str]:
        '''The key of the entry in the Secret resource's ``data`` field to be used.

        Some instances of this field may be defaulted, in others it may be
        required.

        :schema: CertificateSpecKeystoresPkcs12PasswordSecretRef#key
        '''
        result = self._values.get("key")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecKeystoresPkcs12PasswordSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.enum(jsii_type="iocert-manager.CertificateSpecKeystoresPkcs12Profile")
class CertificateSpecKeystoresPkcs12Profile(enum.Enum):
    '''Profile specifies the key and certificate encryption algorithms and the HMAC algorithm used to create the PKCS12 keystore.

    Default value is ``LegacyRC2`` for backward compatibility.

    If provided, allowed values are:
    ``LegacyRC2``: Deprecated. Not supported by default in OpenSSL 3 or Java 20.
    ``LegacyDES``: Less secure algorithm. Use this option for maximal compatibility.
    ``Modern2023``: Secure algorithm. Use this option in case you have to always use secure algorithms
    (e.g., because of company policy). Please note that the security of the algorithm is not that important
    in reality, because the unencrypted certificate and private key are also stored in the Secret.

    :schema: CertificateSpecKeystoresPkcs12Profile
    '''

    LEGACY_RC2 = "LEGACY_RC2"
    '''LegacyRC2.'''
    LEGACY_DES = "LEGACY_DES"
    '''LegacyDES.'''
    MODERN2023 = "MODERN2023"
    '''Modern2023.'''


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecNameConstraints",
    jsii_struct_bases=[],
    name_mapping={
        "critical": "critical",
        "excluded": "excluded",
        "permitted": "permitted",
    },
)
class CertificateSpecNameConstraints:
    def __init__(
        self,
        *,
        critical: typing.Optional[builtins.bool] = None,
        excluded: typing.Optional[typing.Union["CertificateSpecNameConstraintsExcluded", typing.Dict[builtins.str, typing.Any]]] = None,
        permitted: typing.Optional[typing.Union["CertificateSpecNameConstraintsPermitted", typing.Dict[builtins.str, typing.Any]]] = None,
    ) -> None:
        '''x.509 certificate NameConstraint extension which MUST NOT be used in a non-CA certificate. More Info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.10.

        This is an Alpha Feature and is only enabled with the
        ``--feature-gates=NameConstraints=true`` option set on both
        the controller and webhook components.

        :param critical: if true then the name constraints are marked critical.
        :param excluded: Excluded contains the constraints which must be disallowed. Any name matching a restriction in the excluded field is invalid regardless of information appearing in the permitted
        :param permitted: Permitted contains the constraints in which the names must be located.

        :schema: CertificateSpecNameConstraints
        '''
        if isinstance(excluded, dict):
            excluded = CertificateSpecNameConstraintsExcluded(**excluded)
        if isinstance(permitted, dict):
            permitted = CertificateSpecNameConstraintsPermitted(**permitted)
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__4e41e90c83f48c5162562588989d0033ac0148b3c79315d65e7db457c8bbb031)
            check_type(argname="argument critical", value=critical, expected_type=type_hints["critical"])
            check_type(argname="argument excluded", value=excluded, expected_type=type_hints["excluded"])
            check_type(argname="argument permitted", value=permitted, expected_type=type_hints["permitted"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if critical is not None:
            self._values["critical"] = critical
        if excluded is not None:
            self._values["excluded"] = excluded
        if permitted is not None:
            self._values["permitted"] = permitted

    @builtins.property
    def critical(self) -> typing.Optional[builtins.bool]:
        '''if true then the name constraints are marked critical.

        :schema: CertificateSpecNameConstraints#critical
        '''
        result = self._values.get("critical")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def excluded(self) -> typing.Optional["CertificateSpecNameConstraintsExcluded"]:
        '''Excluded contains the constraints which must be disallowed.

        Any name matching a
        restriction in the excluded field is invalid regardless
        of information appearing in the permitted

        :schema: CertificateSpecNameConstraints#excluded
        '''
        result = self._values.get("excluded")
        return typing.cast(typing.Optional["CertificateSpecNameConstraintsExcluded"], result)

    @builtins.property
    def permitted(self) -> typing.Optional["CertificateSpecNameConstraintsPermitted"]:
        '''Permitted contains the constraints in which the names must be located.

        :schema: CertificateSpecNameConstraints#permitted
        '''
        result = self._values.get("permitted")
        return typing.cast(typing.Optional["CertificateSpecNameConstraintsPermitted"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecNameConstraints(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecNameConstraintsExcluded",
    jsii_struct_bases=[],
    name_mapping={
        "dns_domains": "dnsDomains",
        "email_addresses": "emailAddresses",
        "ip_ranges": "ipRanges",
        "uri_domains": "uriDomains",
    },
)
class CertificateSpecNameConstraintsExcluded:
    def __init__(
        self,
        *,
        dns_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
        email_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
        ip_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
        uri_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''Excluded contains the constraints which must be disallowed.

        Any name matching a
        restriction in the excluded field is invalid regardless
        of information appearing in the permitted

        :param dns_domains: DNSDomains is a list of DNS domains that are permitted or excluded.
        :param email_addresses: EmailAddresses is a list of Email Addresses that are permitted or excluded.
        :param ip_ranges: IPRanges is a list of IP Ranges that are permitted or excluded. This should be a valid CIDR notation.
        :param uri_domains: URIDomains is a list of URI domains that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsExcluded
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__247066a7c5bf96c4f593b9dd37634902faee41c7166476230de716b98d28c0d1)
            check_type(argname="argument dns_domains", value=dns_domains, expected_type=type_hints["dns_domains"])
            check_type(argname="argument email_addresses", value=email_addresses, expected_type=type_hints["email_addresses"])
            check_type(argname="argument ip_ranges", value=ip_ranges, expected_type=type_hints["ip_ranges"])
            check_type(argname="argument uri_domains", value=uri_domains, expected_type=type_hints["uri_domains"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if dns_domains is not None:
            self._values["dns_domains"] = dns_domains
        if email_addresses is not None:
            self._values["email_addresses"] = email_addresses
        if ip_ranges is not None:
            self._values["ip_ranges"] = ip_ranges
        if uri_domains is not None:
            self._values["uri_domains"] = uri_domains

    @builtins.property
    def dns_domains(self) -> typing.Optional[typing.List[builtins.str]]:
        '''DNSDomains is a list of DNS domains that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsExcluded#dnsDomains
        '''
        result = self._values.get("dns_domains")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def email_addresses(self) -> typing.Optional[typing.List[builtins.str]]:
        '''EmailAddresses is a list of Email Addresses that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsExcluded#emailAddresses
        '''
        result = self._values.get("email_addresses")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def ip_ranges(self) -> typing.Optional[typing.List[builtins.str]]:
        '''IPRanges is a list of IP Ranges that are permitted or excluded.

        This should be a valid CIDR notation.

        :schema: CertificateSpecNameConstraintsExcluded#ipRanges
        '''
        result = self._values.get("ip_ranges")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def uri_domains(self) -> typing.Optional[typing.List[builtins.str]]:
        '''URIDomains is a list of URI domains that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsExcluded#uriDomains
        '''
        result = self._values.get("uri_domains")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecNameConstraintsExcluded(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecNameConstraintsPermitted",
    jsii_struct_bases=[],
    name_mapping={
        "dns_domains": "dnsDomains",
        "email_addresses": "emailAddresses",
        "ip_ranges": "ipRanges",
        "uri_domains": "uriDomains",
    },
)
class CertificateSpecNameConstraintsPermitted:
    def __init__(
        self,
        *,
        dns_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
        email_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
        ip_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
        uri_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''Permitted contains the constraints in which the names must be located.

        :param dns_domains: DNSDomains is a list of DNS domains that are permitted or excluded.
        :param email_addresses: EmailAddresses is a list of Email Addresses that are permitted or excluded.
        :param ip_ranges: IPRanges is a list of IP Ranges that are permitted or excluded. This should be a valid CIDR notation.
        :param uri_domains: URIDomains is a list of URI domains that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsPermitted
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__0b620fa1b845e5778a32c4ec4360e6a1161a21008669ce3ff996e0e05cf7c7cf)
            check_type(argname="argument dns_domains", value=dns_domains, expected_type=type_hints["dns_domains"])
            check_type(argname="argument email_addresses", value=email_addresses, expected_type=type_hints["email_addresses"])
            check_type(argname="argument ip_ranges", value=ip_ranges, expected_type=type_hints["ip_ranges"])
            check_type(argname="argument uri_domains", value=uri_domains, expected_type=type_hints["uri_domains"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if dns_domains is not None:
            self._values["dns_domains"] = dns_domains
        if email_addresses is not None:
            self._values["email_addresses"] = email_addresses
        if ip_ranges is not None:
            self._values["ip_ranges"] = ip_ranges
        if uri_domains is not None:
            self._values["uri_domains"] = uri_domains

    @builtins.property
    def dns_domains(self) -> typing.Optional[typing.List[builtins.str]]:
        '''DNSDomains is a list of DNS domains that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsPermitted#dnsDomains
        '''
        result = self._values.get("dns_domains")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def email_addresses(self) -> typing.Optional[typing.List[builtins.str]]:
        '''EmailAddresses is a list of Email Addresses that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsPermitted#emailAddresses
        '''
        result = self._values.get("email_addresses")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def ip_ranges(self) -> typing.Optional[typing.List[builtins.str]]:
        '''IPRanges is a list of IP Ranges that are permitted or excluded.

        This should be a valid CIDR notation.

        :schema: CertificateSpecNameConstraintsPermitted#ipRanges
        '''
        result = self._values.get("ip_ranges")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def uri_domains(self) -> typing.Optional[typing.List[builtins.str]]:
        '''URIDomains is a list of URI domains that are permitted or excluded.

        :schema: CertificateSpecNameConstraintsPermitted#uriDomains
        '''
        result = self._values.get("uri_domains")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecNameConstraintsPermitted(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecOtherNames",
    jsii_struct_bases=[],
    name_mapping={"oid": "oid", "utf8_value": "utf8Value"},
)
class CertificateSpecOtherNames:
    def __init__(
        self,
        *,
        oid: typing.Optional[builtins.str] = None,
        utf8_value: typing.Optional[builtins.str] = None,
    ) -> None:
        '''
        :param oid: OID is the object identifier for the otherName SAN. The object identifier must be expressed as a dotted string, for example, "1.2.840.113556.1.4.221".
        :param utf8_value: utf8Value is the string value of the otherName SAN. The utf8Value accepts any valid UTF8 string to set as value for the otherName SAN.

        :schema: CertificateSpecOtherNames
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__b7d18e6290327111a832f5aa91793478e1328e8cde647bcafbca8ee289177d21)
            check_type(argname="argument oid", value=oid, expected_type=type_hints["oid"])
            check_type(argname="argument utf8_value", value=utf8_value, expected_type=type_hints["utf8_value"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if oid is not None:
            self._values["oid"] = oid
        if utf8_value is not None:
            self._values["utf8_value"] = utf8_value

    @builtins.property
    def oid(self) -> typing.Optional[builtins.str]:
        '''OID is the object identifier for the otherName SAN.

        The object identifier must be expressed as a dotted string, for
        example, "1.2.840.113556.1.4.221".

        :schema: CertificateSpecOtherNames#oid
        '''
        result = self._values.get("oid")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def utf8_value(self) -> typing.Optional[builtins.str]:
        '''utf8Value is the string value of the otherName SAN.

        The utf8Value accepts any valid UTF8 string to set as value for the otherName SAN.

        :schema: CertificateSpecOtherNames#utf8Value
        '''
        result = self._values.get("utf8_value")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecOtherNames(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecPrivateKey",
    jsii_struct_bases=[],
    name_mapping={
        "algorithm": "algorithm",
        "encoding": "encoding",
        "rotation_policy": "rotationPolicy",
        "size": "size",
    },
)
class CertificateSpecPrivateKey:
    def __init__(
        self,
        *,
        algorithm: typing.Optional["CertificateSpecPrivateKeyAlgorithm"] = None,
        encoding: typing.Optional["CertificateSpecPrivateKeyEncoding"] = None,
        rotation_policy: typing.Optional["CertificateSpecPrivateKeyRotationPolicy"] = None,
        size: typing.Optional[jsii.Number] = None,
    ) -> None:
        '''Private key options.

        These include the key algorithm and size, the used
        encoding and the rotation policy.

        :param algorithm: Algorithm is the private key algorithm of the corresponding private key for this certificate. If provided, allowed values are either ``RSA``, ``ECDSA`` or ``Ed25519``. If ``algorithm`` is specified and ``size`` is not provided, key size of 2048 will be used for ``RSA`` key algorithm and key size of 256 will be used for ``ECDSA`` key algorithm. key size is ignored when using the ``Ed25519`` key algorithm.
        :param encoding: The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in. If provided, allowed values are ``PKCS1`` and ``PKCS8`` standing for PKCS#1 and PKCS#8, respectively. Defaults to ``PKCS1`` if not specified. Default: PKCS1` if not specified.
        :param rotation_policy: RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed. If set to ``Never``, a private key will only be generated if one does not already exist in the target ``spec.secretName``. If one does exist but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to ``Always``, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is ``Always``. The default was changed from ``Never`` to ``Always`` in cert-manager >=v1.18.0. The new default can be disabled by setting the ``--feature-gates=DefaultPrivateKeyRotationPolicyAlways=false`` option on the controller component. Default: Always`.
        :param size: Size is the key bit size of the corresponding private key for this certificate. If ``algorithm`` is set to ``RSA``, valid values are ``2048``, ``4096`` or ``8192``, and will default to ``2048`` if not specified. If ``algorithm`` is set to ``ECDSA``, valid values are ``256``, ``384`` or ``521``, and will default to ``256`` if not specified. If ``algorithm`` is set to ``Ed25519``, Size is ignored. No other values are allowed.

        :schema: CertificateSpecPrivateKey
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__1f5431d5942f0586bccd87c567d6a856c8a29cf36d3c9a803a66e150a76e9bd2)
            check_type(argname="argument algorithm", value=algorithm, expected_type=type_hints["algorithm"])
            check_type(argname="argument encoding", value=encoding, expected_type=type_hints["encoding"])
            check_type(argname="argument rotation_policy", value=rotation_policy, expected_type=type_hints["rotation_policy"])
            check_type(argname="argument size", value=size, expected_type=type_hints["size"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if algorithm is not None:
            self._values["algorithm"] = algorithm
        if encoding is not None:
            self._values["encoding"] = encoding
        if rotation_policy is not None:
            self._values["rotation_policy"] = rotation_policy
        if size is not None:
            self._values["size"] = size

    @builtins.property
    def algorithm(self) -> typing.Optional["CertificateSpecPrivateKeyAlgorithm"]:
        '''Algorithm is the private key algorithm of the corresponding private key for this certificate.

        If provided, allowed values are either ``RSA``, ``ECDSA`` or ``Ed25519``.
        If ``algorithm`` is specified and ``size`` is not provided,
        key size of 2048 will be used for ``RSA`` key algorithm and
        key size of 256 will be used for ``ECDSA`` key algorithm.
        key size is ignored when using the ``Ed25519`` key algorithm.

        :schema: CertificateSpecPrivateKey#algorithm
        '''
        result = self._values.get("algorithm")
        return typing.cast(typing.Optional["CertificateSpecPrivateKeyAlgorithm"], result)

    @builtins.property
    def encoding(self) -> typing.Optional["CertificateSpecPrivateKeyEncoding"]:
        '''The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in.

        If provided, allowed values are ``PKCS1`` and ``PKCS8`` standing for PKCS#1
        and PKCS#8, respectively.
        Defaults to ``PKCS1`` if not specified.

        :default: PKCS1` if not specified.

        :schema: CertificateSpecPrivateKey#encoding
        '''
        result = self._values.get("encoding")
        return typing.cast(typing.Optional["CertificateSpecPrivateKeyEncoding"], result)

    @builtins.property
    def rotation_policy(
        self,
    ) -> typing.Optional["CertificateSpecPrivateKeyRotationPolicy"]:
        '''RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.

        If set to ``Never``, a private key will only be generated if one does not
        already exist in the target ``spec.secretName``. If one does exist but it
        does not have the correct algorithm or size, a warning will be raised
        to await user intervention.
        If set to ``Always``, a private key matching the specified requirements
        will be generated whenever a re-issuance occurs.
        Default is ``Always``.
        The default was changed from ``Never`` to ``Always`` in cert-manager >=v1.18.0.
        The new default can be disabled by setting the
        ``--feature-gates=DefaultPrivateKeyRotationPolicyAlways=false`` option on
        the controller component.

        :default: Always`.

        :schema: CertificateSpecPrivateKey#rotationPolicy
        '''
        result = self._values.get("rotation_policy")
        return typing.cast(typing.Optional["CertificateSpecPrivateKeyRotationPolicy"], result)

    @builtins.property
    def size(self) -> typing.Optional[jsii.Number]:
        '''Size is the key bit size of the corresponding private key for this certificate.

        If ``algorithm`` is set to ``RSA``, valid values are ``2048``, ``4096`` or ``8192``,
        and will default to ``2048`` if not specified.
        If ``algorithm`` is set to ``ECDSA``, valid values are ``256``, ``384`` or ``521``,
        and will default to ``256`` if not specified.
        If ``algorithm`` is set to ``Ed25519``, Size is ignored.
        No other values are allowed.

        :schema: CertificateSpecPrivateKey#size
        '''
        result = self._values.get("size")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecPrivateKey(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.enum(jsii_type="iocert-manager.CertificateSpecPrivateKeyAlgorithm")
class CertificateSpecPrivateKeyAlgorithm(enum.Enum):
    '''Algorithm is the private key algorithm of the corresponding private key for this certificate.

    If provided, allowed values are either ``RSA``, ``ECDSA`` or ``Ed25519``.
    If ``algorithm`` is specified and ``size`` is not provided,
    key size of 2048 will be used for ``RSA`` key algorithm and
    key size of 256 will be used for ``ECDSA`` key algorithm.
    key size is ignored when using the ``Ed25519`` key algorithm.

    :schema: CertificateSpecPrivateKeyAlgorithm
    '''

    RSA = "RSA"
    '''RSA.'''
    ECDSA = "ECDSA"
    '''ECDSA.'''
    ED25519 = "ED25519"
    '''Ed25519.'''


@jsii.enum(jsii_type="iocert-manager.CertificateSpecPrivateKeyEncoding")
class CertificateSpecPrivateKeyEncoding(enum.Enum):
    '''The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in.

    If provided, allowed values are ``PKCS1`` and ``PKCS8`` standing for PKCS#1
    and PKCS#8, respectively.
    Defaults to ``PKCS1`` if not specified.

    :default: PKCS1` if not specified.

    :schema: CertificateSpecPrivateKeyEncoding
    '''

    PKCS1 = "PKCS1"
    '''PKCS1.'''
    PKCS8 = "PKCS8"
    '''PKCS8.'''


@jsii.enum(jsii_type="iocert-manager.CertificateSpecPrivateKeyRotationPolicy")
class CertificateSpecPrivateKeyRotationPolicy(enum.Enum):
    '''RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.

    If set to ``Never``, a private key will only be generated if one does not
    already exist in the target ``spec.secretName``. If one does exist but it
    does not have the correct algorithm or size, a warning will be raised
    to await user intervention.
    If set to ``Always``, a private key matching the specified requirements
    will be generated whenever a re-issuance occurs.
    Default is ``Always``.
    The default was changed from ``Never`` to ``Always`` in cert-manager >=v1.18.0.
    The new default can be disabled by setting the
    ``--feature-gates=DefaultPrivateKeyRotationPolicyAlways=false`` option on
    the controller component.

    :default: Always`.

    :schema: CertificateSpecPrivateKeyRotationPolicy
    '''

    NEVER = "NEVER"
    '''Never.'''
    ALWAYS = "ALWAYS"
    '''Always.'''


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecSecretTemplate",
    jsii_struct_bases=[],
    name_mapping={"annotations": "annotations", "labels": "labels"},
)
class CertificateSpecSecretTemplate:
    def __init__(
        self,
        *,
        annotations: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''Defines annotations and labels to be copied to the Certificate's Secret.

        Labels and annotations on the Secret will be changed as they appear on the
        SecretTemplate when added or removed. SecretTemplate annotations are added
        in conjunction with, and cannot overwrite, the base set of annotations
        cert-manager sets on the Certificate's Secret.

        :param annotations: Annotations is a key value map to be copied to the target Kubernetes Secret.
        :param labels: Labels is a key value map to be copied to the target Kubernetes Secret.

        :schema: CertificateSpecSecretTemplate
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__d7ae029c4b2099b6a6b000305048c978f265745e3d7c8a735bb3430f37562f6e)
            check_type(argname="argument annotations", value=annotations, expected_type=type_hints["annotations"])
            check_type(argname="argument labels", value=labels, expected_type=type_hints["labels"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if annotations is not None:
            self._values["annotations"] = annotations
        if labels is not None:
            self._values["labels"] = labels

    @builtins.property
    def annotations(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Annotations is a key value map to be copied to the target Kubernetes Secret.

        :schema: CertificateSpecSecretTemplate#annotations
        '''
        result = self._values.get("annotations")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def labels(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Labels is a key value map to be copied to the target Kubernetes Secret.

        :schema: CertificateSpecSecretTemplate#labels
        '''
        result = self._values.get("labels")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecSecretTemplate(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.enum(jsii_type="iocert-manager.CertificateSpecSignatureAlgorithm")
class CertificateSpecSignatureAlgorithm(enum.Enum):
    '''Signature algorith to use.

    Allowed values for RSA keys: SHA256WithRSA, SHA384WithRSA, SHA512WithRSA.
    Allowed values for ECDSA keys: ECDSAWithSHA256, ECDSAWithSHA384, ECDSAWithSHA512.
    Allowed values for Ed25519 keys: PureEd25519.

    :schema: CertificateSpecSignatureAlgorithm
    '''

    SHA256_WITH_RSA = "SHA256_WITH_RSA"
    '''SHA256WithRSA.'''
    SHA384_WITH_RSA = "SHA384_WITH_RSA"
    '''SHA384WithRSA.'''
    SHA512_WITH_RSA = "SHA512_WITH_RSA"
    '''SHA512WithRSA.'''
    ECDSA_WITH_SHA256 = "ECDSA_WITH_SHA256"
    '''ECDSAWithSHA256.'''
    ECDSA_WITH_SHA384 = "ECDSA_WITH_SHA384"
    '''ECDSAWithSHA384.'''
    ECDSA_WITH_SHA512 = "ECDSA_WITH_SHA512"
    '''ECDSAWithSHA512.'''
    PURE_ED25519 = "PURE_ED25519"
    '''PureEd25519.'''


@jsii.data_type(
    jsii_type="iocert-manager.CertificateSpecSubject",
    jsii_struct_bases=[],
    name_mapping={
        "countries": "countries",
        "localities": "localities",
        "organizational_units": "organizationalUnits",
        "organizations": "organizations",
        "postal_codes": "postalCodes",
        "provinces": "provinces",
        "serial_number": "serialNumber",
        "street_addresses": "streetAddresses",
    },
)
class CertificateSpecSubject:
    def __init__(
        self,
        *,
        countries: typing.Optional[typing.Sequence[builtins.str]] = None,
        localities: typing.Optional[typing.Sequence[builtins.str]] = None,
        organizational_units: typing.Optional[typing.Sequence[builtins.str]] = None,
        organizations: typing.Optional[typing.Sequence[builtins.str]] = None,
        postal_codes: typing.Optional[typing.Sequence[builtins.str]] = None,
        provinces: typing.Optional[typing.Sequence[builtins.str]] = None,
        serial_number: typing.Optional[builtins.str] = None,
        street_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''Requested set of X509 certificate subject attributes. More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6.

        The common name attribute is specified separately in the ``commonName`` field.
        Cannot be set if the ``literalSubject`` field is set.

        :param countries: Countries to be used on the Certificate.
        :param localities: Cities to be used on the Certificate.
        :param organizational_units: Organizational Units to be used on the Certificate.
        :param organizations: Organizations to be used on the Certificate.
        :param postal_codes: Postal codes to be used on the Certificate.
        :param provinces: State/Provinces to be used on the Certificate.
        :param serial_number: Serial number to be used on the Certificate.
        :param street_addresses: Street addresses to be used on the Certificate.

        :schema: CertificateSpecSubject
        '''
        if __debug__:
            type_hints = typing.get_type_hints(_typecheckingstub__c09209f0eeb0075bd242146e02938c5900db62860f11fdd3da07883247f6a4de)
            check_type(argname="argument countries", value=countries, expected_type=type_hints["countries"])
            check_type(argname="argument localities", value=localities, expected_type=type_hints["localities"])
            check_type(argname="argument organizational_units", value=organizational_units, expected_type=type_hints["organizational_units"])
            check_type(argname="argument organizations", value=organizations, expected_type=type_hints["organizations"])
            check_type(argname="argument postal_codes", value=postal_codes, expected_type=type_hints["postal_codes"])
            check_type(argname="argument provinces", value=provinces, expected_type=type_hints["provinces"])
            check_type(argname="argument serial_number", value=serial_number, expected_type=type_hints["serial_number"])
            check_type(argname="argument street_addresses", value=street_addresses, expected_type=type_hints["street_addresses"])
        self._values: typing.Dict[builtins.str, typing.Any] = {}
        if countries is not None:
            self._values["countries"] = countries
        if localities is not None:
            self._values["localities"] = localities
        if organizational_units is not None:
            self._values["organizational_units"] = organizational_units
        if organizations is not None:
            self._values["organizations"] = organizations
        if postal_codes is not None:
            self._values["postal_codes"] = postal_codes
        if provinces is not None:
            self._values["provinces"] = provinces
        if serial_number is not None:
            self._values["serial_number"] = serial_number
        if street_addresses is not None:
            self._values["street_addresses"] = street_addresses

    @builtins.property
    def countries(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Countries to be used on the Certificate.

        :schema: CertificateSpecSubject#countries
        '''
        result = self._values.get("countries")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def localities(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Cities to be used on the Certificate.

        :schema: CertificateSpecSubject#localities
        '''
        result = self._values.get("localities")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def organizational_units(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Organizational Units to be used on the Certificate.

        :schema: CertificateSpecSubject#organizationalUnits
        '''
        result = self._values.get("organizational_units")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def organizations(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Organizations to be used on the Certificate.

        :schema: CertificateSpecSubject#organizations
        '''
        result = self._values.get("organizations")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def postal_codes(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Postal codes to be used on the Certificate.

        :schema: CertificateSpecSubject#postalCodes
        '''
        result = self._values.get("postal_codes")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def provinces(self) -> typing.Optional[typing.List[builtins.str]]:
        '''State/Provinces to be used on the Certificate.

        :schema: CertificateSpecSubject#provinces
        '''
        result = self._values.get("provinces")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    @builtins.property
    def serial_number(self) -> typing.Optional[builtins.str]:
        '''Serial number to be used on the Certificate.

        :schema: CertificateSpecSubject#serialNumber
        '''
        result = self._values.get("serial_number")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def street_addresses(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Street addresses to be used on the Certificate.

        :schema: CertificateSpecSubject#streetAddresses
        '''
        result = self._values.get("street_addresses")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CertificateSpecSubject(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.enum(jsii_type="iocert-manager.CertificateSpecUsages")
class CertificateSpecUsages(enum.Enum):
    '''KeyUsage specifies valid usage contexts for keys. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3 https://tools.ietf.org/html/rfc5280#section-4.2.1.12.

    Valid KeyUsage values are as follows:
    "signing",
    "digital signature",
    "content commitment",
    "key encipherment",
    "key agreement",
    "data encipherment",
    "cert sign",
    "crl sign",
    "encipher only",
    "decipher only",
    "any",
    "server auth",
    "client auth",
    "code signing",
    "email protection",
    "s/mime",
    "ipsec end system",
    "ipsec tunnel",
    "ipsec user",
    "timestamping",
    "ocsp signing",
    "microsoft sgc",
    "netscape sgc"

    :schema: CertificateSpecUsages
    '''

    SIGNING = "SIGNING"
    '''signing.'''
    DIGITAL_SIGNATURE = "DIGITAL_SIGNATURE"
    '''digital signature.'''
    CONTENT_COMMITMENT = "CONTENT_COMMITMENT"
    '''content commitment.'''
    KEY_ENCIPHERMENT = "KEY_ENCIPHERMENT"
    '''key encipherment.'''
    KEY_AGREEMENT = "KEY_AGREEMENT"
    '''key agreement.'''
    DATA_ENCIPHERMENT = "DATA_ENCIPHERMENT"
    '''data encipherment.'''
    CERT_SIGN = "CERT_SIGN"
    '''cert sign.'''
    CRL_SIGN = "CRL_SIGN"
    '''crl sign.'''
    ENCIPHER_ONLY = "ENCIPHER_ONLY"
    '''encipher only.'''
    DECIPHER_ONLY = "DECIPHER_ONLY"
    '''decipher only.'''
    ANY = "ANY"
    '''any.'''
    SERVER_AUTH = "SERVER_AUTH"
    '''server auth.'''
    CLIENT_AUTH = "CLIENT_AUTH"
    '''client auth.'''
    CODE_SIGNING = "CODE_SIGNING"
    '''code signing.'''
    EMAIL_PROTECTION = "EMAIL_PROTECTION"
    '''email protection.'''
    S_MIME = "S_MIME"
    '''s/mime.'''
    IPSEC_END_SYSTEM = "IPSEC_END_SYSTEM"
    '''ipsec end system.'''
    IPSEC_TUNNEL = "IPSEC_TUNNEL"
    '''ipsec tunnel.'''
    IPSEC_USER = "IPSEC_USER"
    '''ipsec user.'''
    TIMESTAMPING = "TIMESTAMPING"
    '''timestamping.'''
    OCSP_SIGNING = "OCSP_SIGNING"
    '''ocsp signing.'''
    MICROSOFT_SGC = "MICROSOFT_SGC"
    '''microsoft sgc.'''
    NETSCAPE_SGC = "NETSCAPE_SGC"
    '''netscape sgc.'''


__all__ = [
    "Certificate",
    "CertificateProps",
    "CertificateSpec",
    "CertificateSpecAdditionalOutputFormats",
    "CertificateSpecAdditionalOutputFormatsType",
    "CertificateSpecIssuerRef",
    "CertificateSpecKeystores",
    "CertificateSpecKeystoresJks",
    "CertificateSpecKeystoresJksPasswordSecretRef",
    "CertificateSpecKeystoresPkcs12",
    "CertificateSpecKeystoresPkcs12PasswordSecretRef",
    "CertificateSpecKeystoresPkcs12Profile",
    "CertificateSpecNameConstraints",
    "CertificateSpecNameConstraintsExcluded",
    "CertificateSpecNameConstraintsPermitted",
    "CertificateSpecOtherNames",
    "CertificateSpecPrivateKey",
    "CertificateSpecPrivateKeyAlgorithm",
    "CertificateSpecPrivateKeyEncoding",
    "CertificateSpecPrivateKeyRotationPolicy",
    "CertificateSpecSecretTemplate",
    "CertificateSpecSignatureAlgorithm",
    "CertificateSpecSubject",
    "CertificateSpecUsages",
]

publication.publish()

def _typecheckingstub__83eb4f4530b52ea6853e7191f39bd5a69bc44c12fc79ff4293d5c610eaab4318(
    scope: _constructs_77d1e7e8.Construct,
    id: builtins.str,
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[CertificateSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__45dc788c1d2b0c9f9222a2fa306cf217f2020644af3fa92be5fa925ad20fa0c3(
    *,
    metadata: typing.Optional[typing.Union[_cdk8s_d3d9af27.ApiObjectMetadata, typing.Dict[builtins.str, typing.Any]]] = None,
    spec: typing.Optional[typing.Union[CertificateSpec, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__32dc1d8bfeef97dbd877eaeb718c4dc3768875c6ca7b447e1282f47888feb140(
    *,
    issuer_ref: typing.Union[CertificateSpecIssuerRef, typing.Dict[builtins.str, typing.Any]],
    secret_name: builtins.str,
    additional_output_formats: typing.Optional[typing.Sequence[typing.Union[CertificateSpecAdditionalOutputFormats, typing.Dict[builtins.str, typing.Any]]]] = None,
    common_name: typing.Optional[builtins.str] = None,
    dns_names: typing.Optional[typing.Sequence[builtins.str]] = None,
    duration: typing.Optional[builtins.str] = None,
    email_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
    encode_usages_in_request: typing.Optional[builtins.bool] = None,
    ip_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
    is_ca: typing.Optional[builtins.bool] = None,
    keystores: typing.Optional[typing.Union[CertificateSpecKeystores, typing.Dict[builtins.str, typing.Any]]] = None,
    literal_subject: typing.Optional[builtins.str] = None,
    name_constraints: typing.Optional[typing.Union[CertificateSpecNameConstraints, typing.Dict[builtins.str, typing.Any]]] = None,
    other_names: typing.Optional[typing.Sequence[typing.Union[CertificateSpecOtherNames, typing.Dict[builtins.str, typing.Any]]]] = None,
    private_key: typing.Optional[typing.Union[CertificateSpecPrivateKey, typing.Dict[builtins.str, typing.Any]]] = None,
    renew_before: typing.Optional[builtins.str] = None,
    renew_before_percentage: typing.Optional[jsii.Number] = None,
    revision_history_limit: typing.Optional[jsii.Number] = None,
    secret_template: typing.Optional[typing.Union[CertificateSpecSecretTemplate, typing.Dict[builtins.str, typing.Any]]] = None,
    signature_algorithm: typing.Optional[CertificateSpecSignatureAlgorithm] = None,
    subject: typing.Optional[typing.Union[CertificateSpecSubject, typing.Dict[builtins.str, typing.Any]]] = None,
    uris: typing.Optional[typing.Sequence[builtins.str]] = None,
    usages: typing.Optional[typing.Sequence[CertificateSpecUsages]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__b105d0e0ff4812a7d27236854fdec57381ceb1aebb380c990c0158888686634f(
    *,
    type: CertificateSpecAdditionalOutputFormatsType,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__250ffc36555234fb3774546a78f06060f14ef24da211d902560be0f8f100fb0b(
    *,
    name: builtins.str,
    group: typing.Optional[builtins.str] = None,
    kind: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__304190a06d3e60433de1a2655ea13ece3d452ac5995f8f0e820230f00e479dd2(
    *,
    jks: typing.Optional[typing.Union[CertificateSpecKeystoresJks, typing.Dict[builtins.str, typing.Any]]] = None,
    pkcs12: typing.Optional[typing.Union[CertificateSpecKeystoresPkcs12, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__571b4581314dc6da5154732cbc505ea05f780b18877fbcbc24fd2e2fa8274e62(
    *,
    create: builtins.bool,
    alias: typing.Optional[builtins.str] = None,
    password: typing.Optional[builtins.str] = None,
    password_secret_ref: typing.Optional[typing.Union[CertificateSpecKeystoresJksPasswordSecretRef, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__4c705b97f1ec6666fe596694a6020ae107ebdb667b49d9a0e8e70230b3299e82(
    *,
    name: builtins.str,
    key: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__c5382e8480294729cddd333c0c832e9c632efa49695fb65db41f2232ecd5fb79(
    *,
    create: builtins.bool,
    password: typing.Optional[builtins.str] = None,
    password_secret_ref: typing.Optional[typing.Union[CertificateSpecKeystoresPkcs12PasswordSecretRef, typing.Dict[builtins.str, typing.Any]]] = None,
    profile: typing.Optional[CertificateSpecKeystoresPkcs12Profile] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__20086e6fd1b2e1e2a9457b1cfb63413328de2c314da016e54e9a15a2a0a98681(
    *,
    name: builtins.str,
    key: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__4e41e90c83f48c5162562588989d0033ac0148b3c79315d65e7db457c8bbb031(
    *,
    critical: typing.Optional[builtins.bool] = None,
    excluded: typing.Optional[typing.Union[CertificateSpecNameConstraintsExcluded, typing.Dict[builtins.str, typing.Any]]] = None,
    permitted: typing.Optional[typing.Union[CertificateSpecNameConstraintsPermitted, typing.Dict[builtins.str, typing.Any]]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__247066a7c5bf96c4f593b9dd37634902faee41c7166476230de716b98d28c0d1(
    *,
    dns_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
    email_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
    ip_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
    uri_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__0b620fa1b845e5778a32c4ec4360e6a1161a21008669ce3ff996e0e05cf7c7cf(
    *,
    dns_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
    email_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
    ip_ranges: typing.Optional[typing.Sequence[builtins.str]] = None,
    uri_domains: typing.Optional[typing.Sequence[builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__b7d18e6290327111a832f5aa91793478e1328e8cde647bcafbca8ee289177d21(
    *,
    oid: typing.Optional[builtins.str] = None,
    utf8_value: typing.Optional[builtins.str] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__1f5431d5942f0586bccd87c567d6a856c8a29cf36d3c9a803a66e150a76e9bd2(
    *,
    algorithm: typing.Optional[CertificateSpecPrivateKeyAlgorithm] = None,
    encoding: typing.Optional[CertificateSpecPrivateKeyEncoding] = None,
    rotation_policy: typing.Optional[CertificateSpecPrivateKeyRotationPolicy] = None,
    size: typing.Optional[jsii.Number] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__d7ae029c4b2099b6a6b000305048c978f265745e3d7c8a735bb3430f37562f6e(
    *,
    annotations: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass

def _typecheckingstub__c09209f0eeb0075bd242146e02938c5900db62860f11fdd3da07883247f6a4de(
    *,
    countries: typing.Optional[typing.Sequence[builtins.str]] = None,
    localities: typing.Optional[typing.Sequence[builtins.str]] = None,
    organizational_units: typing.Optional[typing.Sequence[builtins.str]] = None,
    organizations: typing.Optional[typing.Sequence[builtins.str]] = None,
    postal_codes: typing.Optional[typing.Sequence[builtins.str]] = None,
    provinces: typing.Optional[typing.Sequence[builtins.str]] = None,
    serial_number: typing.Optional[builtins.str] = None,
    street_addresses: typing.Optional[typing.Sequence[builtins.str]] = None,
) -> None:
    """Type checking stubs"""
    pass
