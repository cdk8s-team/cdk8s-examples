package main

import (
	"fmt"
	"strconv"

	"example.com/cdk8s-plus-elasticsearch-query/imports/elasticsearchk8selasticco"
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
	"github.com/cdk8s-team/cdk8s-plus-go/cdk8splus26/v2"
)

func NewElasticsearchQuery(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	es_port := 9200
	elastic := elasticsearchk8selasticco.NewElasticsearch(chart, jsii.String("Elasticsearch"), &elasticsearchk8selasticco.ElasticsearchProps{
		Spec: &elasticsearchk8selasticco.ElasticsearchSpec{
			Version: jsii.String("7.7.1"),
			NodeSets: &[]*elasticsearchk8selasticco.ElasticsearchSpecNodeSets{{
				Count: jsii.Number(1),
				Name:  jsii.String("default"),
				Config: &map[string]interface{}{
					"node.master":                     true,
					"node.data":                       true,
					"node.ingest":                     true,
					"node.store.allow_mmap":           false,
					"xpack.security.enabled":          true,
					"xpack.security.http.ssl.enabled": false,
				},
			}},
			Http: &elasticsearchk8selasticco.ElasticsearchSpecHttp{
				Service: &elasticsearchk8selasticco.ElasticsearchSpecHttpService{
					Spec: &elasticsearchk8selasticco.ElasticsearchSpecHttpServiceSpec{
						Ports: &[]*elasticsearchk8selasticco.ElasticsearchSpecHttpServiceSpecPorts{{
							Port: jsii.Number(es_port),
						}},
					},
				},
				Tls: &elasticsearchk8selasticco.ElasticsearchSpecHttpTls{
					SelfSignedCertificate: &elasticsearchk8selasticco.ElasticsearchSpecHttpTlsSelfSignedCertificate{
						Disabled: jsii.Bool(true),
					},
				},
			},
		},
	})

	passwordSecret := cdk8splus26.Secret_FromSecretName(chart, jsii.String("Secret"), jsii.String(fmt.Sprintf("%s-es-elastic-user", *elastic.Name())))

	deployment := cdk8splus26.NewDeployment(chart, jsii.String("Deployment"), &cdk8splus26.DeploymentProps{
		Replicas: jsii.Number(1),
	})

	workingDir := jsii.String("/root")
	queryPort := 8000
	container := deployment.AddContainer(&cdk8splus26.ContainerProps{
		Image:      jsii.String("node:12.18.0-stretch"),
		WorkingDir: workingDir,
		Command:    &[]*string{jsii.String("node"), jsii.String("query.js"), jsii.String(strconv.FormatInt(int64(queryPort), 10))},
		Port:       jsii.Number(queryPort),
		EnvVariables: &map[string]cdk8splus26.EnvValue{
			"ELASTIC_USERNAME": cdk8splus26.EnvValue_FromValue(jsii.String("elastic")),
			"ELASTIC_ENDPOINT": cdk8splus26.EnvValue_FromValue(jsii.String(fmt.Sprintf("http://%s-es-http:%d", *elastic.Name(), es_port))),
			"ELASTIC_PASSWORD": cdk8splus26.EnvValue_FromSecretValue(&cdk8splus26.SecretValue{Secret: passwordSecret, Key: jsii.String("elastic")}, nil),
		},
	})

	configMap := cdk8splus26.NewConfigMap(chart, jsii.String("Config"), nil)
	configMap.AddFile(jsii.String("./query.js"), nil)

	volume := cdk8splus26.Volume_FromConfigMap(chart, jsii.String("Volume"), configMap, nil)
	container.Mount(workingDir, volume, nil)

	deployment.ExposeViaService(nil)

	return chart

}

func main() {
	app := cdk8s.NewApp(nil)
	NewElasticsearchQuery(app, "elasticsearch-query")
	app.Synth()
}
