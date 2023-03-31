package com.example.app;

import software.constructs.Construct;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import imports.k8s.Container;
import imports.k8s.ContainerPort;
import imports.k8s.DeploymentSpec;
import imports.k8s.IntOrString;
import imports.k8s.KubeDeployment;
import imports.k8s.KubeDeploymentProps;
import imports.k8s.KubeService;
import imports.k8s.KubeServiceProps;
import imports.k8s.LabelSelector;
import imports.k8s.ObjectMeta;
import imports.k8s.PodSpec;
import imports.k8s.PodTemplateSpec;
import imports.k8s.ServicePort;
import imports.k8s.ServiceSpec;

public class Main extends Chart {

  public Main(final Construct scope, final String id) {
    this(scope, id, null);
  }

  public Main(final Construct scope, final String id, final ChartProps props) {
    super(scope, id, props);

    Map<String, String> label = Collections.singletonMap("app", "hello-k8s");

    new KubeService(this, "service", KubeServiceProps.builder()
        .spec(ServiceSpec.builder()
            .type("LoadBalancer")
            .ports(List.of(ServicePort.builder()
                .port(80)
                .targetPort(IntOrString.fromNumber(8080))
                .build()))
            .selector(label)
            .build())
        .build());

    new KubeDeployment(this, "deployment", KubeDeploymentProps.builder()
        .spec(DeploymentSpec.builder()
            .replicas(1)
            .selector(LabelSelector.builder()
                .matchLabels(label)
                .build())
            .template(PodTemplateSpec.builder()
                .metadata(ObjectMeta.builder().labels(label)
                    .build())
                .spec(PodSpec.builder()
                    .containers(List.of(Container.builder()
                        .name("hello-kubernetes")
                        .image("paulbouwer/hello-kubernetes:1.7")
                        .ports(List.of(ContainerPort.builder()
                            .containerPort(8080)
                            .build()))
                        .build()))
                    .build())
                .build())
            .build())
        .build());

  }

  public static void main(String[] args) {

    final App app = new App();
    new Main(app, "core");
    app.synth();

  }
}