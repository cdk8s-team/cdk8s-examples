#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart

from webservice import WebService


class WebServices(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        WebService(self, "hello", image="paulbouwer/hello-kubernetes:1.7", replicas=2)

        WebService(self, "ghost", image="ghost", container_port=2368)


app = App()
WebServices(app, "web-services")

app.synth()
