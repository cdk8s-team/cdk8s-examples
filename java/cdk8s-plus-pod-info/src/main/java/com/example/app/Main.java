package com.example.app;

import org.cdk8s.Duration;
import org.cdk8s.plus26.*;
import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import java.util.List;

public class Main extends Chart {

        public Main(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public Main(final Construct scope, final String id, final ChartProps props) {
                super(scope, id, props);

                int portNumber = 9898;

                Deployment deployment = new Deployment(this, "Deployment");

                deployment.getMetadata().addAnnotation("prometheus.io/scrape", "true");
                deployment.getMetadata().addAnnotation("prometheus.io/port", Integer.toString(portNumber));

                Container container = deployment.addContainer(    ContainerProps.builder()
                        .image("stefanprodan/podinfo:3.0.0")
                        .command(List.of("./podinfo", "--port=" + portNumber, "--level=info", "--random-error=true"))
                        .imagePullPolicy(ImagePullPolicy.IF_NOT_PRESENT)
                        .portNumber(portNumber)
                        .liveness(Probe.fromCommand(List.of("podcli", "check", "http", "localhost:" + portNumber + "/healthz"), CommandProbeOptions.builder()
                                .initialDelaySeconds(Duration.seconds(1))
                                .timeoutSeconds(Duration.seconds(5))
                                .build()))
                        .readiness(Probe.fromCommand(List.of("podcli", "check", "http", "localhost:" + portNumber + "/readyz"), CommandProbeOptions.builder()
                                .initialDelaySeconds(Duration.seconds(1))
                                .timeoutSeconds(Duration.seconds(5))
                                .build()))
                        .build());

            container.getEnv().addVariable("PODINFO_UI_MESSAGE", EnvValue.fromValue("this is my podinfo message"));
            container.mount("/data", Volume.fromEmptyDir(this, "data", "data"));

            new HorizontalPodAutoscaler(this, "HPA", HorizontalPodAutoscalerProps.builder()
                    .target(deployment)
                    .maxReplicas(100)
                    .minReplicas(2)
                    .metrics(List.of(Metric.resourceCpu(MetricTarget.averageUtilization(80))))
                    .build());

            Service service = deployment.exposeViaService();

            service.exposeViaIngress("/*");

        }

        public static void main(String[] args) {

                final App app = new App();
                new Main(app, "pod-info");
                app.synth();

        }
}