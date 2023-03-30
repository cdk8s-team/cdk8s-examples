#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart

from imports.io import cert_manager


class Certificate(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        cert_manager.Certificate(
            self,
            "Certificate",
            spec=cert_manager.CertificateSpec(
                secret_name="secret",
                issuer_ref=cert_manager.CertificateSpecIssuerRef(name="issuer"),
            ),
        )


app = App()
Certificate(app, "dashboard")

app.synth()
