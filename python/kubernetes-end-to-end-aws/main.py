#!/usr/bin/env python3
from constructs import Construct
import cdk8s

import cdk8s_plus_26 as kplus
from aws_cdk import aws_eks as eks
from aws_cdk import CfnOutput, App, Stack
from aws_cdk import lambda_layer_kubectl_v25 as kubectl


class KubernetesEndToEndAws(Stack):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        # AWS CDK provides a construct library for defining EKS clusters. All you need to do
        # is specify a version, and it will create a 2 node cluster inside a dedicated VPC.
        # this can also be an imported cluster that has been pre-created with the AWS CDK.
        cluster = eks.Cluster(
            self,
            "Cluster",
            version=eks.KubernetesVersion.V1_25,
            # In order to access applications inside the clusters from the internet,
            # the cluster needs the ability to provision on-demand AWS load balancers that
            # route to internal Kubernetes resources.
            # (see https://github.com/aws/aws-cdk/tree/main/packages/aws-cdk-lib/aws-eks#alb-controller)
            alb_controller={"version": eks.AlbControllerVersion.V2_4_1},
            # In addition, the `eks.Cluster` construct is able to apply Kubernetes manifests onto the
            # cluster (we will use that capability later) via the `kubectl` utility.
            # Kubernetes recommends to always match the version of `kubectl` to the version of your
            # cluster.
            kubectl_layer=kubectl.KubectlV25Layer(self, "Kubectl"),
        )

        # Kubernetes clusters often contain common middleware that has cross-application concerns
        # such as observability, certificate management, and more. Such middleware can be easily
        # installed with [helm](https://helm.sh/), which is natively supported by the `eks.Cluster` construct.
        # In this example, we install KubeView, a visualizer that helps you understand the relationships
        # between Kubernetes resources in your cluster.
        # (see https://artifacthub.io/packages/helm/kubeview/kubeview)
        cluster.add_helm_chart(
            "KubeView",
            repository="https://benc-uk.github.io/kubeview/charts",
            chart="kubeview",
            namespace="kube-system",
            values={
                # control the service name since we will need to
                # reference to it from our app
                "fullnameOverride": "kubeview"
            },
        )

        # Kubeview is exposed via an ELB, and to access it, we need to fetch its generated DNS address.
        # The address is stored in the state of the Kubernetes service that is backed by the ELB, and
        # can be fetched using the `getServiceLoadBalancerAddress` method:
        kube_view_address = cluster.get_service_load_balancer_address(
            "kubeview", namespace="kube-system"
        )

        # We also define a CloudFormation output for this value, so that we can see it once
        # deployment finishes successfully.
        CfnOutput(self, "KubeViewEndpoint", value=f"http://{kube_view_address}")

        # Now its time to define our kuberntes workload. We use a very simple
        # http server that responds with a welcome message. To define this workload,
        # we'll use cdk8s-plus.
        chart = cdk8s.Chart(cdk8s.App(), "HttpEcho")
        deployment = kplus.Deployment(
            chart,
            "Deployment",
            containers=[
                kplus.ContainerProps(
                    image="paulbouwer/hello-kubernetes:1.5",
                    port_number=8080,
                    # required because the default image runs with a root user
                    # and cdk8s-plus forbids that by default.
                    security_context={"user": 1005},
                )
            ],
        )

        # To expose this deployment to the outside world, we will use a
        # Kubernetes ingress resource:
        ingress = kplus.Ingress(chart, "Ingress")
        service = deployment.expose_via_service(
            service_type=kplus.ServiceType.NODE_PORT
        )
        ingress.add_rule("/", kplus.IngressBackend.from_service(service))

        # Deploying this workload onto the cluster is done via the `addCdk8sChart` method:
        http_server = cluster.add_cdk8s_chart(
            chart.node.id,
            chart,
            # Ingress resources need to be specially annotated for them to be picked up and
            # implemented by the AWS Load Balancer Controller. Setting this property to `true` will make the cluster
            # automatically detect `Ingress` resources, and add the necessary annotation.
            ingress_alb=True,
            # By default, the provisioned ALB is `internal`, so we need explicitly
            # make it `internet-facing`
            ingress_alb_scheme=eks.AlbScheme.INTERNET_FACING,
        )

        # the deletion of `httpServer` is what instructs the controller to delete the ELB.
        # so we need to make sure this happens before the controller is deleted.
        http_server.node.add_dependency(cluster.alb_controller)

        # And, similarly to the KubeView endpoint, we need to fetch the generated address of the ALB,
        # this time from the state of the ingress resource.
        app_address = cluster.get_ingress_load_balancer_address(ingress.name)

        # We also define a CloudFormation output for this value, so that we can see it once
        # deployment finishes successfully.
        CfnOutput(self, "ApplicationEndpoint", value=f"http://{app_address}")


app = App()
KubernetesEndToEndAws(app, "kubernetes-end-to-end-aws")

app.synth()
