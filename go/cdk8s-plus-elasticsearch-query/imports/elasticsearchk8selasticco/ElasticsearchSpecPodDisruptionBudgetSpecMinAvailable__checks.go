//go:build !no_runtime_type_checking

// elasticsearchk8selasticco
package elasticsearchk8selasticco

import (
	"fmt"
)

func validateElasticsearchSpecPodDisruptionBudgetSpecMinAvailable_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateElasticsearchSpecPodDisruptionBudgetSpecMinAvailable_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}
