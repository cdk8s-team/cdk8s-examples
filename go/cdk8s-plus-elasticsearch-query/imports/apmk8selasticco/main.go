package apmk8selasticco

import (
	"reflect"

	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

func init() {
	_jsii_.RegisterClass(
		"apmk8selasticco.ApmServer",
		reflect.TypeOf((*ApmServer)(nil)).Elem(),
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
			j := jsiiProxy_ApmServer{}
			_jsii_.InitJsiiProxy(&j.Type__cdk8sApiObject)
			return &j
		},
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerProps",
		reflect.TypeOf((*ApmServerProps)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpec",
		reflect.TypeOf((*ApmServerSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecElasticsearchRef",
		reflect.TypeOf((*ApmServerSpecElasticsearchRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttp",
		reflect.TypeOf((*ApmServerSpecHttp)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpService",
		reflect.TypeOf((*ApmServerSpecHttpService)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpServiceSpec",
		reflect.TypeOf((*ApmServerSpecHttpServiceSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpServiceSpecPorts",
		reflect.TypeOf((*ApmServerSpecHttpServiceSpecPorts)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"apmk8selasticco.ApmServerSpecHttpServiceSpecPortsTargetPort",
		reflect.TypeOf((*ApmServerSpecHttpServiceSpecPortsTargetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ApmServerSpecHttpServiceSpecPortsTargetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpServiceSpecSessionAffinityConfig",
		reflect.TypeOf((*ApmServerSpecHttpServiceSpecSessionAffinityConfig)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp",
		reflect.TypeOf((*ApmServerSpecHttpServiceSpecSessionAffinityConfigClientIp)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpTls",
		reflect.TypeOf((*ApmServerSpecHttpTls)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpTlsCertificate",
		reflect.TypeOf((*ApmServerSpecHttpTlsCertificate)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpTlsSelfSignedCertificate",
		reflect.TypeOf((*ApmServerSpecHttpTlsSelfSignedCertificate)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames",
		reflect.TypeOf((*ApmServerSpecHttpTlsSelfSignedCertificateSubjectAltNames)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecSecureSettings",
		reflect.TypeOf((*ApmServerSpecSecureSettings)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"apmk8selasticco.ApmServerSpecSecureSettingsEntries",
		reflect.TypeOf((*ApmServerSpecSecureSettingsEntries)(nil)).Elem(),
	)
}
