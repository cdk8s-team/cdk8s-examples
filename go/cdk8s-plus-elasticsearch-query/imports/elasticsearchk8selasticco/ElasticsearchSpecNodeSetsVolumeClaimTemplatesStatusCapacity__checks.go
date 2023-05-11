//go:build !no_runtime_type_checking

package elasticsearchk8selasticco

import (
	"fmt"
)

func validateElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateElasticsearchSpecNodeSetsVolumeClaimTemplatesStatusCapacity_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

