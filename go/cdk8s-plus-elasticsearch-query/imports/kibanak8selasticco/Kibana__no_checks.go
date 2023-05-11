//go:build no_runtime_type_checking

package kibanak8selasticco

// Building without runtime type checking enabled, so all the below just return nil

func validateKibana_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKibana_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKibana_ManifestParameters(props *KibanaProps) error {
	return nil
}

func validateKibana_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKibanaParameters(scope constructs.Construct, id *string, props *KibanaProps) error {
	return nil
}

