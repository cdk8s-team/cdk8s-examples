#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart, Include

class Dashboard(Chart):
    def __init__(self, scope: Construct, id: str):
      super().__init__(scope, id)

      Include(self, 'dashboard', url="https://raw.githubusercontent.com/kubernetes/dashboard/v2.7.0/aio/deploy/recommended.yaml")


app = App()
Dashboard(app, "dashboard")

app.synth()
