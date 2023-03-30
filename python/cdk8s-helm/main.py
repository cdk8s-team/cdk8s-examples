#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart, Helm


class Redis(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        Helm(
            self,
            "redis",
            chart="bitnami/redis",
            version="17.9.2",
            values={"auth": {"password": "sdweqweq"}, "sentinel": {"enabled": True}},
        )


app = App()
Redis(app, "redis")

app.synth()
