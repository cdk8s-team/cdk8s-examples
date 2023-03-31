// k8s
package k8s

import (
	_init_ "example.com/cdk8s-core/imports/k8s/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"

	"example.com/cdk8s-core/imports/k8s/internal"
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

// MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
type KubeMutatingWebhookConfigurationList interface {
	cdk8s.ApiObject
	// The group portion of the API version (e.g. `authorization.k8s.io`).
	ApiGroup() *string
	// The object's API version (e.g. `authorization.k8s.io/v1`).
	ApiVersion() *string
	// The chart in which this object is defined.
	Chart() cdk8s.Chart
	// The object kind.
	Kind() *string
	// Metadata associated with this API object.
	Metadata() cdk8s.ApiObjectMetadataDefinition
	// The name of the API object.
	//
	// If a name is specified in `metadata.name` this will be the name returned.
	// Otherwise, a name will be generated by calling
	// `Chart.of(this).generatedObjectName(this)`, which by default uses the
	// construct path to generate a DNS-compatible name for the resource.
	Name() *string
	// The tree node.
	Node() constructs.Node
	// Create a dependency between this ApiObject and other constructs.
	//
	// These can be other ApiObjects, Charts, or custom.
	AddDependency(dependencies ...constructs.IConstruct)
	// Applies a set of RFC-6902 JSON-Patch operations to the manifest synthesized for this API object.
	//
	// Example:
	//     kubePod.addJsonPatch(JsonPatch.replace('/spec/enableServiceLinks', true));
	//
	AddJsonPatch(ops ...cdk8s.JsonPatch)
	// Renders the object to Kubernetes JSON.
	ToJson() interface{}
	// Returns a string representation of this construct.
	ToString() *string
}

// The jsii proxy struct for KubeMutatingWebhookConfigurationList
type jsiiProxy_KubeMutatingWebhookConfigurationList struct {
	internal.Type__cdk8sApiObject
}

func (j *jsiiProxy_KubeMutatingWebhookConfigurationList) ApiGroup() *string {
	var returns *string
	_jsii_.Get(
		j,
		"apiGroup",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_KubeMutatingWebhookConfigurationList) ApiVersion() *string {
	var returns *string
	_jsii_.Get(
		j,
		"apiVersion",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_KubeMutatingWebhookConfigurationList) Chart() cdk8s.Chart {
	var returns cdk8s.Chart
	_jsii_.Get(
		j,
		"chart",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_KubeMutatingWebhookConfigurationList) Kind() *string {
	var returns *string
	_jsii_.Get(
		j,
		"kind",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_KubeMutatingWebhookConfigurationList) Metadata() cdk8s.ApiObjectMetadataDefinition {
	var returns cdk8s.ApiObjectMetadataDefinition
	_jsii_.Get(
		j,
		"metadata",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_KubeMutatingWebhookConfigurationList) Name() *string {
	var returns *string
	_jsii_.Get(
		j,
		"name",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_KubeMutatingWebhookConfigurationList) Node() constructs.Node {
	var returns constructs.Node
	_jsii_.Get(
		j,
		"node",
		&returns,
	)
	return returns
}


// Defines a "io.k8s.api.admissionregistration.v1.MutatingWebhookConfigurationList" API object.
func NewKubeMutatingWebhookConfigurationList(scope constructs.Construct, id *string, props *KubeMutatingWebhookConfigurationListProps) KubeMutatingWebhookConfigurationList {
	_init_.Initialize()

	if err := validateNewKubeMutatingWebhookConfigurationListParameters(scope, id, props); err != nil {
		panic(err)
	}
	j := jsiiProxy_KubeMutatingWebhookConfigurationList{}

	_jsii_.Create(
		"k8s.KubeMutatingWebhookConfigurationList",
		[]interface{}{scope, id, props},
		&j,
	)

	return &j
}

// Defines a "io.k8s.api.admissionregistration.v1.MutatingWebhookConfigurationList" API object.
func NewKubeMutatingWebhookConfigurationList_Override(k KubeMutatingWebhookConfigurationList, scope constructs.Construct, id *string, props *KubeMutatingWebhookConfigurationListProps) {
	_init_.Initialize()

	_jsii_.Create(
		"k8s.KubeMutatingWebhookConfigurationList",
		[]interface{}{scope, id, props},
		k,
	)
}

// Return whether the given object is an `ApiObject`.
//
// We do attribute detection since we can't reliably use 'instanceof'.
func KubeMutatingWebhookConfigurationList_IsApiObject(o interface{}) *bool {
	_init_.Initialize()

	if err := validateKubeMutatingWebhookConfigurationList_IsApiObjectParameters(o); err != nil {
		panic(err)
	}
	var returns *bool

	_jsii_.StaticInvoke(
		"k8s.KubeMutatingWebhookConfigurationList",
		"isApiObject",
		[]interface{}{o},
		&returns,
	)

	return returns
}

// Checks if `x` is a construct.
//
// Use this method instead of `instanceof` to properly detect `Construct`
// instances, even when the construct library is symlinked.
//
// Explanation: in JavaScript, multiple copies of the `constructs` library on
// disk are seen as independent, completely different libraries. As a
// consequence, the class `Construct` in each copy of the `constructs` library
// is seen as a different class, and an instance of one class will not test as
// `instanceof` the other class. `npm install` will not create installations
// like this, but users may manually symlink construct libraries together or
// use a monorepo tool: in those cases, multiple copies of the `constructs`
// library can be accidentally installed, and `instanceof` will behave
// unpredictably. It is safest to avoid using `instanceof`, and using
// this type-testing method instead.
//
// Returns: true if `x` is an object created from a class which extends `Construct`.
func KubeMutatingWebhookConfigurationList_IsConstruct(x interface{}) *bool {
	_init_.Initialize()

	if err := validateKubeMutatingWebhookConfigurationList_IsConstructParameters(x); err != nil {
		panic(err)
	}
	var returns *bool

	_jsii_.StaticInvoke(
		"k8s.KubeMutatingWebhookConfigurationList",
		"isConstruct",
		[]interface{}{x},
		&returns,
	)

	return returns
}

// Renders a Kubernetes manifest for "io.k8s.api.admissionregistration.v1.MutatingWebhookConfigurationList".
//
// This can be used to inline resource manifests inside other objects (e.g. as templates).
func KubeMutatingWebhookConfigurationList_Manifest(props *KubeMutatingWebhookConfigurationListProps) interface{} {
	_init_.Initialize()

	if err := validateKubeMutatingWebhookConfigurationList_ManifestParameters(props); err != nil {
		panic(err)
	}
	var returns interface{}

	_jsii_.StaticInvoke(
		"k8s.KubeMutatingWebhookConfigurationList",
		"manifest",
		[]interface{}{props},
		&returns,
	)

	return returns
}

// Returns the `ApiObject` named `Resource` which is a child of the given construct.
//
// If `c` is an `ApiObject`, it is returned directly. Throws an
// exception if the construct does not have a child named `Default` _or_ if
// this child is not an `ApiObject`.
func KubeMutatingWebhookConfigurationList_Of(c constructs.IConstruct) cdk8s.ApiObject {
	_init_.Initialize()

	if err := validateKubeMutatingWebhookConfigurationList_OfParameters(c); err != nil {
		panic(err)
	}
	var returns cdk8s.ApiObject

	_jsii_.StaticInvoke(
		"k8s.KubeMutatingWebhookConfigurationList",
		"of",
		[]interface{}{c},
		&returns,
	)

	return returns
}

func KubeMutatingWebhookConfigurationList_GVK() *cdk8s.GroupVersionKind {
	_init_.Initialize()
	var returns *cdk8s.GroupVersionKind
	_jsii_.StaticGet(
		"k8s.KubeMutatingWebhookConfigurationList",
		"GVK",
		&returns,
	)
	return returns
}

func (k *jsiiProxy_KubeMutatingWebhookConfigurationList) AddDependency(dependencies ...constructs.IConstruct) {
	args := []interface{}{}
	for _, a := range dependencies {
		args = append(args, a)
	}

	_jsii_.InvokeVoid(
		k,
		"addDependency",
		args,
	)
}

func (k *jsiiProxy_KubeMutatingWebhookConfigurationList) AddJsonPatch(ops ...cdk8s.JsonPatch) {
	args := []interface{}{}
	for _, a := range ops {
		args = append(args, a)
	}

	_jsii_.InvokeVoid(
		k,
		"addJsonPatch",
		args,
	)
}

func (k *jsiiProxy_KubeMutatingWebhookConfigurationList) ToJson() interface{} {
	var returns interface{}

	_jsii_.Invoke(
		k,
		"toJson",
		nil, // no parameters
		&returns,
	)

	return returns
}

func (k *jsiiProxy_KubeMutatingWebhookConfigurationList) ToString() *string {
	var returns *string

	_jsii_.Invoke(
		k,
		"toString",
		nil, // no parameters
		&returns,
	)

	return returns
}
