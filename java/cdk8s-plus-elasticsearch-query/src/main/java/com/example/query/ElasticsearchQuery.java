package com.example.query;

import imports.co.elastic.k8s.elasticsearch.*;
import org.cdk8s.Duration;
import org.cdk8s.plus26.*;
import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElasticsearchQuery extends Chart {

        public ElasticsearchQuery(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public ElasticsearchQuery(final Construct scope, final String id, final ChartProps props) {
                super(scope, id, props);

                int esPort = 9200;

                Map<String, Object> config = new HashMap<>();
                config.put("node.master", true);
                config.put("node.data", true);
                config.put("node.ingest", true);
                config.put("node.store.allow_mmap", false);
                config.put("xpack.security.enabled", true);
                config.put("xpack.security.http.ssl.enabled", false);

                Elasticsearch elastic = new Elasticsearch(this, "Elasticsearch", ElasticsearchProps.builder()
                                .spec(ElasticsearchSpec.builder()
                                                .version("7.7.1")
                                                .nodeSets(List.of(ElasticsearchSpecNodeSets.builder()
                                                                .count(1)
                                                                .name("'default'")
                                                                .config(config)
                                                                .build()))
                                                .http(ElasticsearchSpecHttp.builder()
                                                                .service(ElasticsearchSpecHttpService.builder()
                                                                                .spec(ElasticsearchSpecHttpServiceSpec
                                                                                                .builder()
                                                                                                .ports(List.of(ElasticsearchSpecHttpServiceSpecPorts
                                                                                                                .builder()
                                                                                                                .port(esPort)
                                                                                                                .build()))
                                                                                                .build())
                                                                                .build())
                                                                .tls(ElasticsearchSpecHttpTls.builder()
                                                                                .selfSignedCertificate(
                                                                                                ElasticsearchSpecHttpTlsSelfSignedCertificate
                                                                                                                .builder()
                                                                                                                .disabled(true)
                                                                                                                .build())
                                                                                .build())
                                                                .build())
                                                .build())
                                .build());

                ISecret passwordSecret = Secret.fromSecretName(this, "Secret", elastic.getName() + "-es-elastic-user");

                Deployment deployment = new Deployment(this, "Deployment", DeploymentProps.builder()
                                .replicas(1)
                                .build());

                String workingDir = "/root";
                int queryPort = 8000;
                Map<String, EnvValue> envVariables = new HashMap<>();
                envVariables.put("ELASTIC_USERNAME", EnvValue.fromValue("elastic"));
                envVariables.put("ELASTIC_PASSWORD", EnvValue.fromSecretValue(SecretValue.builder()
                                .secret(passwordSecret)
                                .key("elastic")
                                .build()));
                Container container = deployment.addContainer(ContainerProps.builder()
                                .image("node:12.18.0-stretch")
                                .workingDir(workingDir)
                                .command(List.of("node", "query.js", Integer.toString(queryPort)))
                                .portNumber(queryPort)
                                .envVariables(envVariables)
                                .build());

                ConfigMap configMap = new ConfigMap(this, "Config");
                configMap.addFile("query.js");

                Volume volume = Volume.fromConfigMap(this, "Volume", configMap);
                container.mount(workingDir, volume);

                deployment.exposeViaService();

        }

        public static void main(String[] args) {

                final App app = new App();
                new ElasticsearchQuery(app, "elasticsearch-query");
                app.synth();

        }
}