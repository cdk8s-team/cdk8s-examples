#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart, Duration

import cdk8s_plus_26 as kplus


class PodInfo(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        port_number = 9898

        deployment = kplus.Deployment(self, "Deployment")

        deployment.metadata.add_annotation("prometheus.io/scrape", "true")
        deployment.metadata.add_annotation("prometheus.io/port", f"{port_number}")

        container = deployment.add_container(
            image="stefanprodan/podinfo:3.0.0",
            command=[
                "./podinfo",
                f"--port={port_number}",
                "--level=info",
                "--random-error=true",
            ],
            image_pull_policy=kplus.ImagePullPolicy.IF_NOT_PRESENT,
            port_number=port_number,
            liveness=kplus.Probe.from_command(
                ["podcli", "check", "http", f"localhost:${port_number}/healthz"],
                initial_delay_seconds=Duration.seconds(1),
                timeout_seconds=Duration.seconds(5),
            ),
            readiness=kplus.Probe.from_command(
                ["podcli", "check", "http", f"localhost:${port_number}/readyz"],
                initial_delay_seconds=Duration.seconds(1),
                timeout_seconds=Duration.seconds(5),
            ),
        )

        container.env.add_variable(
            "PODINFO_UI_MESSAGE",
            kplus.EnvValue.from_value("this is my podinfo message"),
        )
        container.mount("/data", kplus.Volume.from_empty_dir(self, "data", "data"))

        kplus.HorizontalPodAutoscaler(
            self,
            "HPA",
            target=deployment,
            max_replicas=100,
            min_replicas=2,
            metrics=[
                kplus.Metric.resource_cpu(kplus.MetricTarget.average_utilization(80))
            ],
        )

        service = deployment.expose_via_service()

        service.expose_via_ingress("/*")


app = App()
PodInfo(app, "pod-info")

app.synth()
