// kibanak8selasticco
package kibanak8selasticco

import (
	"reflect"

	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

func init() {
	_jsii_.RegisterClass(
		"kibanak8selasticco.Kibana",
		reflect.TypeOf((*Kibana)(nil)).Elem(),
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
			j := jsiiProxy_Kibana{}
			_jsii_.InitJsiiProxy(&j.Type__cdk8sApiObject)
			return &j
		},
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaProps",
		reflect.TypeOf((*KibanaProps)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpec",
		reflect.TypeOf((*KibanaSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecElasticsearchRef",
		reflect.TypeOf((*KibanaSpecElasticsearchRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttp",
		reflect.TypeOf((*KibanaSpecHttp)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpService",
		reflect.TypeOf((*KibanaSpecHttpService)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpServiceSpec",
		reflect.TypeOf((*KibanaSpecHttpServiceSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpServiceSpecPorts",
		reflect.TypeOf((*KibanaSpecHttpServiceSpecPorts)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"kibanak8selasticco.KibanaSpecHttpServiceSpecPortsTargetPort",
		reflect.TypeOf((*KibanaSpecHttpServiceSpecPortsTargetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_KibanaSpecHttpServiceSpecPortsTargetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpServiceSpecSessionAffinityConfig",
		reflect.TypeOf((*KibanaSpecHttpServiceSpecSessionAffinityConfig)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp",
		reflect.TypeOf((*KibanaSpecHttpServiceSpecSessionAffinityConfigClientIp)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpTls",
		reflect.TypeOf((*KibanaSpecHttpTls)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpTlsCertificate",
		reflect.TypeOf((*KibanaSpecHttpTlsCertificate)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpTlsSelfSignedCertificate",
		reflect.TypeOf((*KibanaSpecHttpTlsSelfSignedCertificate)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames",
		reflect.TypeOf((*KibanaSpecHttpTlsSelfSignedCertificateSubjectAltNames)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecSecureSettings",
		reflect.TypeOf((*KibanaSpecSecureSettings)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"kibanak8selasticco.KibanaSpecSecureSettingsEntries",
		reflect.TypeOf((*KibanaSpecSecureSettingsEntries)(nil)).Elem(),
	)
}
