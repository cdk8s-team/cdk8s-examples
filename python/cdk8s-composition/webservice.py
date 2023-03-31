from constructs import Construct
from cdk8s import Names

from imports import k8s


class WebService(Construct):
    def __init__(
        self,
        scope: Construct,
        id: str,
        *,
        image: str,
        replicas=1,
        port=80,
        container_port=8080,
        **kwargs
    ):
        super().__init__(scope, id)

        label = {"app": Names.to_label_value(self)}

        k8s.KubeService(
            self,
            "service",
            spec=k8s.ServiceSpec(
                type="LoadBalancer",
                ports=[
                    k8s.ServicePort(
                        port=port,
                        target_port=k8s.IntOrString.from_number(container_port),
                    )
                ],
                selector=label,
            ),
        )

        k8s.KubeDeployment(
            self,
            "deployment",
            spec=k8s.DeploymentSpec(
                replicas=replicas,
                selector=k8s.LabelSelector(match_labels=label),
                template=k8s.PodTemplateSpec(
                    metadata=k8s.ObjectMeta(labels=label),
                    spec=k8s.PodSpec(
                        containers=[
                            k8s.Container(
                                name="web",
                                image=image,
                                ports=[
                                    k8s.ContainerPort(container_port=container_port)
                                ],
                            )
                        ]
                    ),
                ),
            ),
        )
