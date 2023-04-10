//go:build no_runtime_type_checking

// apmk8selasticco
package apmk8selasticco

// Building without runtime type checking enabled, so all the below just return nil

func validateApmServer_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateApmServer_IsConstructParameters(x interface{}) error {
	return nil
}

func validateApmServer_ManifestParameters(props *ApmServerProps) error {
	return nil
}

func validateApmServer_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewApmServerParameters(scope constructs.Construct, id *string, props *ApmServerProps) error {
	return nil
}

