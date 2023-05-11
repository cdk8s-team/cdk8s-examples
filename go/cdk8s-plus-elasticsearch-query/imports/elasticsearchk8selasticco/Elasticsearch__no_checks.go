//go:build no_runtime_type_checking

package elasticsearchk8selasticco

// Building without runtime type checking enabled, so all the below just return nil

func validateElasticsearch_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateElasticsearch_IsConstructParameters(x interface{}) error {
	return nil
}

func validateElasticsearch_ManifestParameters(props *ElasticsearchProps) error {
	return nil
}

func validateElasticsearch_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewElasticsearchParameters(scope constructs.Construct, id *string, props *ElasticsearchProps) error {
	return nil
}

