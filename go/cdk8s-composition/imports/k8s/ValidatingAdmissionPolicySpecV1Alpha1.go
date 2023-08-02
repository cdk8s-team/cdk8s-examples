package k8s


// ValidatingAdmissionPolicySpec is the specification of the desired behavior of the AdmissionPolicy.
type ValidatingAdmissionPolicySpecV1Alpha1 struct {
	// Validations contain CEL expressions which is used to apply the validation.
	//
	// A minimum of one validation is required for a policy definition. Required.
	Validations *[]*ValidationV1Alpha1 `field:"required" json:"validations" yaml:"validations"`
	// FailurePolicy defines how to handle failures for the admission policy.
	//
	// Failures can occur from invalid or mis-configured policy definitions or bindings. A policy is invalid if spec.paramKind refers to a non-existent Kind. A binding is invalid if spec.paramRef.name refers to a non-existent resource. Allowed values are Ignore or Fail. Defaults to Fail.
	// Default: Fail.
	//
	FailurePolicy *string `field:"optional" json:"failurePolicy" yaml:"failurePolicy"`
	// MatchConstraints specifies what resources this policy is designed to validate.
	//
	// The AdmissionPolicy cares about a request if it matches _all_ Constraints. However, in order to prevent clusters from being put into an unstable state that cannot be recovered from via the API ValidatingAdmissionPolicy cannot match ValidatingAdmissionPolicy and ValidatingAdmissionPolicyBinding. Required.
	MatchConstraints *MatchResourcesV1Alpha1 `field:"optional" json:"matchConstraints" yaml:"matchConstraints"`
	// ParamKind specifies the kind of resources used to parameterize this policy.
	//
	// If absent, there are no parameters for this policy and the param CEL variable will not be provided to validation expressions. If ParamKind refers to a non-existent kind, this policy definition is mis-configured and the FailurePolicy is applied. If paramKind is specified but paramRef is unset in ValidatingAdmissionPolicyBinding, the params variable will be null.
	ParamKind *ParamKindV1Alpha1 `field:"optional" json:"paramKind" yaml:"paramKind"`
}

