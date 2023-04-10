#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart

import os

import cdk8s_plus_26 as kplus
from imports.co.elastic.k8s import elasticsearch as es


class ElasticsearchQuery(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        es_port = 9200
        elastic = es.Elasticsearch(
            self,
            "Elasticsearch",
            spec=es.ElasticsearchSpec(
                version="7.7.1",
                node_sets=[
                    es.ElasticsearchSpecNodeSets(
                        count=1,
                        name="default",
                        config={
                            "node.master": True,
                            "node.data": True,
                            "node.ingest": True,
                            "node.store.allow_mmap": False,
                            "xpack.security.enabled": True,
                            "xpack.security.http.ssl.enabled": False,
                        },
                    )
                ],
                http=es.ElasticsearchSpecHttp(
                    service=es.ElasticsearchSpecHttpService(
                        spec=es.ElasticsearchSpecHttpServiceSpec(
                            ports=[
                                es.ElasticsearchSpecHttpServiceSpecPorts(port=es_port)
                            ]
                        )
                    ),
                    tls=es.ElasticsearchSpecHttpTls(
                        self_signed_certificate=es.ElasticsearchSpecHttpTlsSelfSignedCertificate(
                            disabled=True
                        )
                    ),
                ),
            ),
        )

        password_secret = kplus.Secret.from_secret_name(
            self, "Secret", f"${elastic.name}-es-elastic-user"
        )

        deployment = kplus.Deployment(
            self,
            "Deployment",
            replicas=1,
        )

        working_dir = "/root"
        query_port = 8000
        container = deployment.add_container(
            image="node:12.18.0-stretch",
            working_dir=working_dir,
            command=["node", "query.js", f"{query_port}"],
            port=query_port,
            env_variables={
                "ELASTIC_USERNAME": kplus.EnvValue.from_value("elastic"),
                "ELASTIC_ENDPOINT": kplus.EnvValue.from_value(
                    f"http://${elastic.name}-es-http:${es_port}"
                ),
                "ELASTIC_PASSWORD": kplus.EnvValue.from_secret_value(
                    kplus.SecretValue(secret=password_secret, key="elastic")
                ),
            },
        )

        config_map = kplus.ConfigMap(self, "Config")
        config_map.add_file(f"{os.path.dirname(__file__)}/query.js")

        volume = kplus.Volume.from_config_map(self, "Volume", config_map)
        container.mount(working_dir, volume)

        deployment.expose_via_service()


app = App()
ElasticsearchQuery(app, "elasticseach-query")

app.synth()
