// generated by cdk8s
import { ApiObject, ApiObjectMetadata, GroupVersionKind } from 'cdk8s';
import { Construct } from 'constructs';


/**
 * A Certificate resource should be created to ensure an up to date and signed x509 certificate is stored in the Kubernetes Secret resource named in `spec.secretName`. 
 The stored certificate will be renewed before it expires (as configured by `spec.renewBefore`).
 *
 * @schema Certificate
 */
export class Certificate extends ApiObject {
  /**
   * Returns the apiVersion and kind for "Certificate"
   */
  public static readonly GVK: GroupVersionKind = {
    apiVersion: 'cert-manager.io/v1',
    kind: 'Certificate',
  }

  /**
   * Renders a Kubernetes manifest for "Certificate".
   *
   * This can be used to inline resource manifests inside other objects (e.g. as templates).
   *
   * @param props initialization props
   */
  public static manifest(props: CertificateProps): any {
    return {
      ...Certificate.GVK,
      ...toJson_CertificateProps(props),
    };
  }

  /**
   * Defines a "Certificate" API object
   * @param scope the scope in which to define this object
   * @param id a scope-local name for the object
   * @param props initialization props
   */
  public constructor(scope: Construct, id: string, props: CertificateProps) {
    super(scope, id, {
      ...Certificate.GVK,
      ...props,
    });
  }

  /**
   * Renders the object to Kubernetes JSON.
   */
  public toJson(): any {
    const resolved = super.toJson();

    return {
      ...Certificate.GVK,
      ...toJson_CertificateProps(resolved),
    };
  }
}

/**
 * A Certificate resource should be created to ensure an up to date and signed x509 certificate is stored in the Kubernetes Secret resource named in `spec.secretName`.
 * The stored certificate will be renewed before it expires (as configured by `spec.renewBefore`).
 *
 * @schema Certificate
 */
export interface CertificateProps {
  /**
   * @schema Certificate#metadata
   */
  readonly metadata?: ApiObjectMetadata;

  /**
   * Desired state of the Certificate resource.
   *
   * @schema Certificate#spec
   */
  readonly spec: CertificateSpec;

}

/**
 * Converts an object of type 'CertificateProps' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateProps(obj: CertificateProps | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'metadata': obj.metadata,
    'spec': toJson_CertificateSpec(obj.spec),
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * Desired state of the Certificate resource.
 *
 * @schema CertificateSpec
 */
export interface CertificateSpec {
  /**
   * AdditionalOutputFormats defines extra output formats of the private key and signed certificate chain to be written to this Certificate's target Secret. This is an Alpha Feature and is only enabled with the `--feature-gates=AdditionalCertificateOutputFormats=true` option on both the controller and webhook components.
   *
   * @schema CertificateSpec#additionalOutputFormats
   */
  readonly additionalOutputFormats?: CertificateSpecAdditionalOutputFormats[];

  /**
   * CommonName is a common name to be used on the Certificate. The CommonName should have a length of 64 characters or fewer to avoid generating invalid CSRs. This value is ignored by TLS clients when any subject alt name is set. This is x509 behaviour: https://tools.ietf.org/html/rfc6125#section-6.4.4
   *
   * @schema CertificateSpec#commonName
   */
  readonly commonName?: string;

  /**
   * DNSNames is a list of DNS subjectAltNames to be set on the Certificate.
   *
   * @schema CertificateSpec#dnsNames
   */
  readonly dnsNames?: string[];

  /**
   * The requested 'duration' (i.e. lifetime) of the Certificate. This option may be ignored/overridden by some issuer types. If unset this defaults to 90 days. Certificate will be renewed either 2/3 through its duration or `renewBefore` period before its expiry, whichever is later. Minimum accepted duration is 1 hour. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration
   *
   * @schema CertificateSpec#duration
   */
  readonly duration?: string;

  /**
   * EmailAddresses is a list of email subjectAltNames to be set on the Certificate.
   *
   * @schema CertificateSpec#emailAddresses
   */
  readonly emailAddresses?: string[];

  /**
   * EncodeUsagesInRequest controls whether key usages should be present in the CertificateRequest
   *
   * @schema CertificateSpec#encodeUsagesInRequest
   */
  readonly encodeUsagesInRequest?: boolean;

  /**
   * IPAddresses is a list of IP address subjectAltNames to be set on the Certificate.
   *
   * @schema CertificateSpec#ipAddresses
   */
  readonly ipAddresses?: string[];

  /**
   * IsCA will mark this Certificate as valid for certificate signing. This will automatically add the `cert sign` usage to the list of `usages`.
   *
   * @schema CertificateSpec#isCA
   */
  readonly isCa?: boolean;

  /**
   * IssuerRef is a reference to the issuer for this certificate. If the `kind` field is not set, or set to `Issuer`, an Issuer resource with the given name in the same namespace as the Certificate will be used. If the `kind` field is set to `ClusterIssuer`, a ClusterIssuer with the provided name will be used. The `name` field in this stanza is required at all times.
   *
   * @schema CertificateSpec#issuerRef
   */
  readonly issuerRef: CertificateSpecIssuerRef;

  /**
   * Keystores configures additional keystore output formats stored in the `secretName` Secret resource.
   *
   * @schema CertificateSpec#keystores
   */
  readonly keystores?: CertificateSpecKeystores;

  /**
   * LiteralSubject is an LDAP formatted string that represents the [X.509 Subject field](https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6). Use this *instead* of the Subject field if you need to ensure the correct ordering of the RDN sequence, such as when issuing certs for LDAP authentication. See https://github.com/cert-manager/cert-manager/issues/3203, https://github.com/cert-manager/cert-manager/issues/4424. This field is alpha level and is only supported by cert-manager installations where LiteralCertificateSubject feature gate is enabled on both cert-manager controller and webhook.
   *
   * @schema CertificateSpec#literalSubject
   */
  readonly literalSubject?: string;

  /**
   * Options to control private keys used for the Certificate.
   *
   * @schema CertificateSpec#privateKey
   */
  readonly privateKey?: CertificateSpecPrivateKey;

  /**
   * How long before the currently issued certificate's expiry cert-manager should renew the certificate. The default is 2/3 of the issued certificate's duration. Minimum accepted value is 5 minutes. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration
   *
   * @schema CertificateSpec#renewBefore
   */
  readonly renewBefore?: string;

  /**
   * revisionHistoryLimit is the maximum number of CertificateRequest revisions that are maintained in the Certificate's history. Each revision represents a single `CertificateRequest` created by this Certificate, either when it was created, renewed, or Spec was changed. Revisions will be removed by oldest first if the number of revisions exceeds this number. If set, revisionHistoryLimit must be a value of `1` or greater. If unset (`nil`), revisions will not be garbage collected. Default value is `nil`.
   *
   * @schema CertificateSpec#revisionHistoryLimit
   */
  readonly revisionHistoryLimit?: number;

  /**
   * SecretName is the name of the secret resource that will be automatically created and managed by this Certificate resource. It will be populated with a private key and certificate, signed by the denoted issuer.
   *
   * @schema CertificateSpec#secretName
   */
  readonly secretName: string;

  /**
   * SecretTemplate defines annotations and labels to be copied to the Certificate's Secret. Labels and annotations on the Secret will be changed as they appear on the SecretTemplate when added or removed. SecretTemplate annotations are added in conjunction with, and cannot overwrite, the base set of annotations cert-manager sets on the Certificate's Secret.
   *
   * @schema CertificateSpec#secretTemplate
   */
  readonly secretTemplate?: CertificateSpecSecretTemplate;

  /**
   * Full X509 name specification (https://golang.org/pkg/crypto/x509/pkix/#Name).
   *
   * @schema CertificateSpec#subject
   */
  readonly subject?: CertificateSpecSubject;

  /**
   * URIs is a list of URI subjectAltNames to be set on the Certificate.
   *
   * @schema CertificateSpec#uris
   */
  readonly uris?: string[];

  /**
   * Usages is the set of x509 usages that are requested for the certificate. Defaults to `digital signature` and `key encipherment` if not specified.
   *
   * @default digital signature` and `key encipherment` if not specified.
   * @schema CertificateSpec#usages
   */
  readonly usages?: CertificateSpecUsages[];

}

/**
 * Converts an object of type 'CertificateSpec' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpec(obj: CertificateSpec | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'additionalOutputFormats': obj.additionalOutputFormats?.map(y => toJson_CertificateSpecAdditionalOutputFormats(y)),
    'commonName': obj.commonName,
    'dnsNames': obj.dnsNames?.map(y => y),
    'duration': obj.duration,
    'emailAddresses': obj.emailAddresses?.map(y => y),
    'encodeUsagesInRequest': obj.encodeUsagesInRequest,
    'ipAddresses': obj.ipAddresses?.map(y => y),
    'isCA': obj.isCa,
    'issuerRef': toJson_CertificateSpecIssuerRef(obj.issuerRef),
    'keystores': toJson_CertificateSpecKeystores(obj.keystores),
    'literalSubject': obj.literalSubject,
    'privateKey': toJson_CertificateSpecPrivateKey(obj.privateKey),
    'renewBefore': obj.renewBefore,
    'revisionHistoryLimit': obj.revisionHistoryLimit,
    'secretName': obj.secretName,
    'secretTemplate': toJson_CertificateSpecSecretTemplate(obj.secretTemplate),
    'subject': toJson_CertificateSpecSubject(obj.subject),
    'uris': obj.uris?.map(y => y),
    'usages': obj.usages?.map(y => y),
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * CertificateAdditionalOutputFormat defines an additional output format of a Certificate resource. These contain supplementary data formats of the signed certificate chain and paired private key.
 *
 * @schema CertificateSpecAdditionalOutputFormats
 */
export interface CertificateSpecAdditionalOutputFormats {
  /**
   * Type is the name of the format type that should be written to the Certificate's target Secret.
   *
   * @schema CertificateSpecAdditionalOutputFormats#type
   */
  readonly type: CertificateSpecAdditionalOutputFormatsType;

}

/**
 * Converts an object of type 'CertificateSpecAdditionalOutputFormats' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecAdditionalOutputFormats(obj: CertificateSpecAdditionalOutputFormats | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'type': obj.type,
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * IssuerRef is a reference to the issuer for this certificate. If the `kind` field is not set, or set to `Issuer`, an Issuer resource with the given name in the same namespace as the Certificate will be used. If the `kind` field is set to `ClusterIssuer`, a ClusterIssuer with the provided name will be used. The `name` field in this stanza is required at all times.
 *
 * @schema CertificateSpecIssuerRef
 */
export interface CertificateSpecIssuerRef {
  /**
   * Group of the resource being referred to.
   *
   * @schema CertificateSpecIssuerRef#group
   */
  readonly group?: string;

  /**
   * Kind of the resource being referred to.
   *
   * @schema CertificateSpecIssuerRef#kind
   */
  readonly kind?: string;

  /**
   * Name of the resource being referred to.
   *
   * @schema CertificateSpecIssuerRef#name
   */
  readonly name: string;

}

/**
 * Converts an object of type 'CertificateSpecIssuerRef' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecIssuerRef(obj: CertificateSpecIssuerRef | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'group': obj.group,
    'kind': obj.kind,
    'name': obj.name,
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * Keystores configures additional keystore output formats stored in the `secretName` Secret resource.
 *
 * @schema CertificateSpecKeystores
 */
export interface CertificateSpecKeystores {
  /**
   * JKS configures options for storing a JKS keystore in the `spec.secretName` Secret resource.
   *
   * @schema CertificateSpecKeystores#jks
   */
  readonly jks?: CertificateSpecKeystoresJks;

  /**
   * PKCS12 configures options for storing a PKCS12 keystore in the `spec.secretName` Secret resource.
   *
   * @schema CertificateSpecKeystores#pkcs12
   */
  readonly pkcs12?: CertificateSpecKeystoresPkcs12;

}

/**
 * Converts an object of type 'CertificateSpecKeystores' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecKeystores(obj: CertificateSpecKeystores | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'jks': toJson_CertificateSpecKeystoresJks(obj.jks),
    'pkcs12': toJson_CertificateSpecKeystoresPkcs12(obj.pkcs12),
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * Options to control private keys used for the Certificate.
 *
 * @schema CertificateSpecPrivateKey
 */
export interface CertificateSpecPrivateKey {
  /**
   * Algorithm is the private key algorithm of the corresponding private key for this certificate. If provided, allowed values are either `RSA`,`Ed25519` or `ECDSA` If `algorithm` is specified and `size` is not provided, key size of 256 will be used for `ECDSA` key algorithm and key size of 2048 will be used for `RSA` key algorithm. key size is ignored when using the `Ed25519` key algorithm.
   *
   * @schema CertificateSpecPrivateKey#algorithm
   */
  readonly algorithm?: CertificateSpecPrivateKeyAlgorithm;

  /**
   * The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in. If provided, allowed values are `PKCS1` and `PKCS8` standing for PKCS#1 and PKCS#8, respectively. Defaults to `PKCS1` if not specified.
   *
   * @default PKCS1` if not specified.
   * @schema CertificateSpecPrivateKey#encoding
   */
  readonly encoding?: CertificateSpecPrivateKeyEncoding;

  /**
   * RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed. If set to Never, a private key will only be generated if one does not already exist in the target `spec.secretName`. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to Always, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is 'Never' for backward compatibility.
   *
   * @default Never' for backward compatibility.
   * @schema CertificateSpecPrivateKey#rotationPolicy
   */
  readonly rotationPolicy?: CertificateSpecPrivateKeyRotationPolicy;

  /**
   * Size is the key bit size of the corresponding private key for this certificate. If `algorithm` is set to `RSA`, valid values are `2048`, `4096` or `8192`, and will default to `2048` if not specified. If `algorithm` is set to `ECDSA`, valid values are `256`, `384` or `521`, and will default to `256` if not specified. If `algorithm` is set to `Ed25519`, Size is ignored. No other values are allowed.
   *
   * @schema CertificateSpecPrivateKey#size
   */
  readonly size?: number;

}

/**
 * Converts an object of type 'CertificateSpecPrivateKey' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecPrivateKey(obj: CertificateSpecPrivateKey | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'algorithm': obj.algorithm,
    'encoding': obj.encoding,
    'rotationPolicy': obj.rotationPolicy,
    'size': obj.size,
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * SecretTemplate defines annotations and labels to be copied to the Certificate's Secret. Labels and annotations on the Secret will be changed as they appear on the SecretTemplate when added or removed. SecretTemplate annotations are added in conjunction with, and cannot overwrite, the base set of annotations cert-manager sets on the Certificate's Secret.
 *
 * @schema CertificateSpecSecretTemplate
 */
export interface CertificateSpecSecretTemplate {
  /**
   * Annotations is a key value map to be copied to the target Kubernetes Secret.
   *
   * @schema CertificateSpecSecretTemplate#annotations
   */
  readonly annotations?: { [key: string]: string };

  /**
   * Labels is a key value map to be copied to the target Kubernetes Secret.
   *
   * @schema CertificateSpecSecretTemplate#labels
   */
  readonly labels?: { [key: string]: string };

}

/**
 * Converts an object of type 'CertificateSpecSecretTemplate' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecSecretTemplate(obj: CertificateSpecSecretTemplate | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'annotations': ((obj.annotations) === undefined) ? undefined : (Object.entries(obj.annotations).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {})),
    'labels': ((obj.labels) === undefined) ? undefined : (Object.entries(obj.labels).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {})),
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * Full X509 name specification (https://golang.org/pkg/crypto/x509/pkix/#Name).
 *
 * @schema CertificateSpecSubject
 */
export interface CertificateSpecSubject {
  /**
   * Countries to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#countries
   */
  readonly countries?: string[];

  /**
   * Cities to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#localities
   */
  readonly localities?: string[];

  /**
   * Organizational Units to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#organizationalUnits
   */
  readonly organizationalUnits?: string[];

  /**
   * Organizations to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#organizations
   */
  readonly organizations?: string[];

  /**
   * Postal codes to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#postalCodes
   */
  readonly postalCodes?: string[];

  /**
   * State/Provinces to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#provinces
   */
  readonly provinces?: string[];

  /**
   * Serial number to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#serialNumber
   */
  readonly serialNumber?: string;

  /**
   * Street addresses to be used on the Certificate.
   *
   * @schema CertificateSpecSubject#streetAddresses
   */
  readonly streetAddresses?: string[];

}

/**
 * Converts an object of type 'CertificateSpecSubject' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecSubject(obj: CertificateSpecSubject | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'countries': obj.countries?.map(y => y),
    'localities': obj.localities?.map(y => y),
    'organizationalUnits': obj.organizationalUnits?.map(y => y),
    'organizations': obj.organizations?.map(y => y),
    'postalCodes': obj.postalCodes?.map(y => y),
    'provinces': obj.provinces?.map(y => y),
    'serialNumber': obj.serialNumber,
    'streetAddresses': obj.streetAddresses?.map(y => y),
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * KeyUsage specifies valid usage contexts for keys. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3 https://tools.ietf.org/html/rfc5280#section-4.2.1.12
 * Valid KeyUsage values are as follows: "signing", "digital signature", "content commitment", "key encipherment", "key agreement", "data encipherment", "cert sign", "crl sign", "encipher only", "decipher only", "any", "server auth", "client auth", "code signing", "email protection", "s/mime", "ipsec end system", "ipsec tunnel", "ipsec user", "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
 *
 * @schema CertificateSpecUsages
 */
export enum CertificateSpecUsages {
  /** signing */
  SIGNING = "signing",
  /** digital signature */
  DIGITAL_SIGNATURE = "digital signature",
  /** content commitment */
  CONTENT_COMMITMENT = "content commitment",
  /** key encipherment */
  KEY_ENCIPHERMENT = "key encipherment",
  /** key agreement */
  KEY_AGREEMENT = "key agreement",
  /** data encipherment */
  DATA_ENCIPHERMENT = "data encipherment",
  /** cert sign */
  CERT_SIGN = "cert sign",
  /** crl sign */
  CRL_SIGN = "crl sign",
  /** encipher only */
  ENCIPHER_ONLY = "encipher only",
  /** decipher only */
  DECIPHER_ONLY = "decipher only",
  /** any */
  ANY = "any",
  /** server auth */
  SERVER_AUTH = "server auth",
  /** client auth */
  CLIENT_AUTH = "client auth",
  /** code signing */
  CODE_SIGNING = "code signing",
  /** email protection */
  EMAIL_PROTECTION = "email protection",
  /** s/mime */
  S_MIME = "s/mime",
  /** ipsec end system */
  IPSEC_END_SYSTEM = "ipsec end system",
  /** ipsec tunnel */
  IPSEC_TUNNEL = "ipsec tunnel",
  /** ipsec user */
  IPSEC_USER = "ipsec user",
  /** timestamping */
  TIMESTAMPING = "timestamping",
  /** ocsp signing */
  OCSP_SIGNING = "ocsp signing",
  /** microsoft sgc */
  MICROSOFT_SGC = "microsoft sgc",
  /** netscape sgc */
  NETSCAPE_SGC = "netscape sgc",
}

/**
 * Type is the name of the format type that should be written to the Certificate's target Secret.
 *
 * @schema CertificateSpecAdditionalOutputFormatsType
 */
export enum CertificateSpecAdditionalOutputFormatsType {
  /** DER */
  DER = "DER",
  /** CombinedPEM */
  COMBINED_PEM = "CombinedPEM",
}

/**
 * JKS configures options for storing a JKS keystore in the `spec.secretName` Secret resource.
 *
 * @schema CertificateSpecKeystoresJks
 */
export interface CertificateSpecKeystoresJks {
  /**
   * Create enables JKS keystore creation for the Certificate. If true, a file named `keystore.jks` will be created in the target Secret resource, encrypted using the password stored in `passwordSecretRef`. The keystore file will be updated immediately. A file named `truststore.jks` will also be created in the target Secret resource, encrypted using the password stored in `passwordSecretRef` containing the issuing Certificate Authority
   *
   * @schema CertificateSpecKeystoresJks#create
   */
  readonly create: boolean;

  /**
   * PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the JKS keystore.
   *
   * @schema CertificateSpecKeystoresJks#passwordSecretRef
   */
  readonly passwordSecretRef: CertificateSpecKeystoresJksPasswordSecretRef;

}

/**
 * Converts an object of type 'CertificateSpecKeystoresJks' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecKeystoresJks(obj: CertificateSpecKeystoresJks | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'create': obj.create,
    'passwordSecretRef': toJson_CertificateSpecKeystoresJksPasswordSecretRef(obj.passwordSecretRef),
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * PKCS12 configures options for storing a PKCS12 keystore in the `spec.secretName` Secret resource.
 *
 * @schema CertificateSpecKeystoresPkcs12
 */
export interface CertificateSpecKeystoresPkcs12 {
  /**
   * Create enables PKCS12 keystore creation for the Certificate. If true, a file named `keystore.p12` will be created in the target Secret resource, encrypted using the password stored in `passwordSecretRef`. The keystore file will be updated immediately. A file named `truststore.p12` will also be created in the target Secret resource, encrypted using the password stored in `passwordSecretRef` containing the issuing Certificate Authority
   *
   * @schema CertificateSpecKeystoresPkcs12#create
   */
  readonly create: boolean;

  /**
   * PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the PKCS12 keystore.
   *
   * @schema CertificateSpecKeystoresPkcs12#passwordSecretRef
   */
  readonly passwordSecretRef: CertificateSpecKeystoresPkcs12PasswordSecretRef;

}

/**
 * Converts an object of type 'CertificateSpecKeystoresPkcs12' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecKeystoresPkcs12(obj: CertificateSpecKeystoresPkcs12 | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'create': obj.create,
    'passwordSecretRef': toJson_CertificateSpecKeystoresPkcs12PasswordSecretRef(obj.passwordSecretRef),
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * Algorithm is the private key algorithm of the corresponding private key for this certificate. If provided, allowed values are either `RSA`,`Ed25519` or `ECDSA` If `algorithm` is specified and `size` is not provided, key size of 256 will be used for `ECDSA` key algorithm and key size of 2048 will be used for `RSA` key algorithm. key size is ignored when using the `Ed25519` key algorithm.
 *
 * @schema CertificateSpecPrivateKeyAlgorithm
 */
export enum CertificateSpecPrivateKeyAlgorithm {
  /** RSA */
  RSA = "RSA",
  /** ECDSA */
  ECDSA = "ECDSA",
  /** Ed25519 */
  ED25519 = "Ed25519",
}

/**
 * The private key cryptography standards (PKCS) encoding for this certificate's private key to be encoded in. If provided, allowed values are `PKCS1` and `PKCS8` standing for PKCS#1 and PKCS#8, respectively. Defaults to `PKCS1` if not specified.
 *
 * @default PKCS1` if not specified.
 * @schema CertificateSpecPrivateKeyEncoding
 */
export enum CertificateSpecPrivateKeyEncoding {
  /** PKCS1 */
  PKCS1 = "PKCS1",
  /** PKCS8 */
  PKCS8 = "PKCS8",
}

/**
 * RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed. If set to Never, a private key will only be generated if one does not already exist in the target `spec.secretName`. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to Always, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is 'Never' for backward compatibility.
 *
 * @default Never' for backward compatibility.
 * @schema CertificateSpecPrivateKeyRotationPolicy
 */
export enum CertificateSpecPrivateKeyRotationPolicy {
  /** Never */
  NEVER = "Never",
  /** Always */
  ALWAYS = "Always",
}

/**
 * PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the JKS keystore.
 *
 * @schema CertificateSpecKeystoresJksPasswordSecretRef
 */
export interface CertificateSpecKeystoresJksPasswordSecretRef {
  /**
   * The key of the entry in the Secret resource's `data` field to be used. Some instances of this field may be defaulted, in others it may be required.
   *
   * @schema CertificateSpecKeystoresJksPasswordSecretRef#key
   */
  readonly key?: string;

  /**
   * Name of the resource being referred to. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   *
   * @schema CertificateSpecKeystoresJksPasswordSecretRef#name
   */
  readonly name: string;

}

/**
 * Converts an object of type 'CertificateSpecKeystoresJksPasswordSecretRef' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecKeystoresJksPasswordSecretRef(obj: CertificateSpecKeystoresJksPasswordSecretRef | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'key': obj.key,
    'name': obj.name,
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

/**
 * PasswordSecretRef is a reference to a key in a Secret resource containing the password used to encrypt the PKCS12 keystore.
 *
 * @schema CertificateSpecKeystoresPkcs12PasswordSecretRef
 */
export interface CertificateSpecKeystoresPkcs12PasswordSecretRef {
  /**
   * The key of the entry in the Secret resource's `data` field to be used. Some instances of this field may be defaulted, in others it may be required.
   *
   * @schema CertificateSpecKeystoresPkcs12PasswordSecretRef#key
   */
  readonly key?: string;

  /**
   * Name of the resource being referred to. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   *
   * @schema CertificateSpecKeystoresPkcs12PasswordSecretRef#name
   */
  readonly name: string;

}

/**
 * Converts an object of type 'CertificateSpecKeystoresPkcs12PasswordSecretRef' to JSON representation.
 */
/* eslint-disable max-len, quote-props */
export function toJson_CertificateSpecKeystoresPkcs12PasswordSecretRef(obj: CertificateSpecKeystoresPkcs12PasswordSecretRef | undefined): Record<string, any> | undefined {
  if (obj === undefined) { return undefined; }
  const result = {
    'key': obj.key,
    'name': obj.name,
  };
  // filter undefined values
  return Object.entries(result).reduce((r, i) => (i[1] === undefined) ? r : ({ ...r, [i[0]]: i[1] }), {});
}
/* eslint-enable max-len, quote-props */

