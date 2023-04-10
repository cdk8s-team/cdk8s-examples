#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart

import cdk8s_plus_26 as kplus


class HttpEcho(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        ingress = kplus.Ingress(self, "ingress")
        ingress.add_rule("/", self.echo_backend("root"))
        ingress.add_rule("/foo", self.echo_backend("foo"))
        ingress.add_rule("/foo/bar", self.echo_backend("foo-bar"))

        ingress.add_host_default_backend("my.host", self.echo_backend("my.host/hey"))

    def echo_backend(self, text):
        deploy = kplus.Deployment(
            self,
            text,
            containers=[
                kplus.ContainerProps(
                    image="hashicorp/http-echo",
                    args=["-text", text],
                    port_number=5678,
                )
            ],
        )

        return kplus.IngressBackend.from_service(
            deploy.expose_via_service(ports=[kplus.ServicePort(port=5678)])
        )


app = App()
HttpEcho(app, "http-echo")

app.synth()
