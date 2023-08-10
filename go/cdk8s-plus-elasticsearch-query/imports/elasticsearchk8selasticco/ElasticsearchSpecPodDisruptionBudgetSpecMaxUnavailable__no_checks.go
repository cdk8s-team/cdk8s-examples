//go:build no_runtime_type_checking

package elasticsearchk8selasticco

// Building without runtime type checking enabled, so all the below just return nil

func validateElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable_FromNumberParameters(value *float64) error {
	return nil
}

func validateElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable_FromStringParameters(value *string) error {
	return nil
}

