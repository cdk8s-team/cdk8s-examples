//go:build !no_runtime_type_checking

// apmk8selasticco
package apmk8selasticco

import (
	"fmt"
)

func validateApmServerSpecHttpServiceSpecPortsTargetPort_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateApmServerSpecHttpServiceSpecPortsTargetPort_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

