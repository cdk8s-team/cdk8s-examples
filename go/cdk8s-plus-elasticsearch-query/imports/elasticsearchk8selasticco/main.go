// elasticsearchk8selasticco
package elasticsearchk8selasticco

import (
	"reflect"

	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

func init() {
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.Elasticsearch",
		reflect.TypeOf((*Elasticsearch)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberMethod{JsiiMethod: "addDependency", GoMethod: "AddDependency"},
			_jsii_.MemberMethod{JsiiMethod: "addJsonPatch", GoMethod: "AddJsonPatch"},
			_jsii_.MemberProperty{JsiiProperty: "apiGroup", GoGetter: "ApiGroup"},
			_jsii_.MemberProperty{JsiiProperty: "apiVersion", GoGetter: "ApiVersion"},
			_jsii_.MemberProperty{JsiiProperty: "chart", GoGetter: "Chart"},
			_jsii_.MemberProperty{JsiiProperty: "kind", GoGetter: "Kind"},
			_jsii_.MemberProperty{JsiiProperty: "metadata", GoGetter: "Metadata"},
			_jsii_.MemberProperty{JsiiProperty: "name", GoGetter: "Name"},
			_jsii_.MemberProperty{JsiiProperty: "node", GoGetter: "Node"},
			_jsii_.MemberMethod{JsiiMethod: "toJson", GoMethod: "ToJson"},
			_jsii_.MemberMethod{JsiiMethod: "toString", GoMethod: "ToString"},
		},
		func() interface{} {
			j := jsiiProxy_Elasticsearch{}
			_jsii_.InitJsiiProxy(&j.Type__cdk8sApiObject)
			return &j
		},
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchProps",
		reflect.TypeOf((*ElasticsearchProps)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpec",
		reflect.TypeOf((*ElasticsearchSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecAuth",
		reflect.TypeOf((*ElasticsearchSpecAuth)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecAuthFileRealm",
		reflect.TypeOf((*ElasticsearchSpecAuthFileRealm)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecAuthRoles",
		reflect.TypeOf((*ElasticsearchSpecAuthRoles)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttp",
		reflect.TypeOf((*ElasticsearchSpecHttp)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpService",
		reflect.TypeOf((*ElasticsearchSpecHttpService)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpServiceSpec",
		reflect.TypeOf((*ElasticsearchSpecHttpServiceSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpServiceSpecPorts",
		reflect.TypeOf((*ElasticsearchSpecHttpServiceSpecPorts)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpServiceSpecPortsTargetPort",
		reflect.TypeOf((*ElasticsearchSpecHttpServiceSpecPortsTargetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ElasticsearchSpecHttpServiceSpecPortsTargetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpServiceSpecSessionAffinityConfig",
		reflect.TypeOf((*ElasticsearchSpecHttpServiceSpecSessionAffinityConfig)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp",
		reflect.TypeOf((*ElasticsearchSpecHttpServiceSpecSessionAffinityConfigClientIp)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpTls",
		reflect.TypeOf((*ElasticsearchSpecHttpTls)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpTlsCertificate",
		reflect.TypeOf((*ElasticsearchSpecHttpTlsCertificate)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpTlsSelfSignedCertificate",
		reflect.TypeOf((*ElasticsearchSpecHttpTlsSelfSignedCertificate)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames",
		reflect.TypeOf((*ElasticsearchSpecHttpTlsSelfSignedCertificateSubjectAltNames)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSets",
		reflect.TypeOf((*ElasticsearchSpecNodeSets)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplates",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplates)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecDataSource)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResources)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesLimits{}
		},
	)
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests{}
		},
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatus)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity{}
		},
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions",
		reflect.TypeOf((*ElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusConditions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudget",
		reflect.TypeOf((*ElasticsearchSpecPodDisruptionBudget)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpec",
		reflect.TypeOf((*ElasticsearchSpecPodDisruptionBudgetSpec)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable",
		reflect.TypeOf((*ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable{}
		},
	)
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable",
		reflect.TypeOf((*ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable{}
		},
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecSelector",
		reflect.TypeOf((*ElasticsearchSpecPodDisruptionBudgetSpecSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions",
		reflect.TypeOf((*ElasticsearchSpecPodDisruptionBudgetSpecSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecRemoteClusters",
		reflect.TypeOf((*ElasticsearchSpecRemoteClusters)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecRemoteClustersElasticsearchRef",
		reflect.TypeOf((*ElasticsearchSpecRemoteClustersElasticsearchRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecSecureSettings",
		reflect.TypeOf((*ElasticsearchSpecSecureSettings)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecSecureSettingsEntries",
		reflect.TypeOf((*ElasticsearchSpecSecureSettingsEntries)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecTransport",
		reflect.TypeOf((*ElasticsearchSpecTransport)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportService",
		reflect.TypeOf((*ElasticsearchSpecTransportService)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportServiceSpec",
		reflect.TypeOf((*ElasticsearchSpecTransportServiceSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportServiceSpecPorts",
		reflect.TypeOf((*ElasticsearchSpecTransportServiceSpecPorts)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportServiceSpecPortsTargetPort",
		reflect.TypeOf((*ElasticsearchSpecTransportServiceSpecPortsTargetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ElasticsearchSpecTransportServiceSpecPortsTargetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportServiceSpecSessionAffinityConfig",
		reflect.TypeOf((*ElasticsearchSpecTransportServiceSpecSessionAffinityConfig)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp",
		reflect.TypeOf((*ElasticsearchSpecTransportServiceSpecSessionAffinityConfigClientIp)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecUpdateStrategy",
		reflect.TypeOf((*ElasticsearchSpecUpdateStrategy)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"elasticsearchk8selasticco.ElasticsearchSpecUpdateStrategyChangeBudget",
		reflect.TypeOf((*ElasticsearchSpecUpdateStrategyChangeBudget)(nil)).Elem(),
	)
}
