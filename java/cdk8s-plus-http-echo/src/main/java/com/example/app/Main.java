package com.example.app;

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

                Ingress ingress = new Ingress(this, "Ingress");
                ingress.addRule("/", this.echoBackend("root"));
                ingress.addRule("/foo", this.echoBackend("foo"));
                ingress.addRule("/foo/bar", this.echoBackend("foo-bar"));
                ingress.addHostDefaultBackend("my.host", this.echoBackend("my.host/hey"));
        }

        private IngressBackend echoBackend(String text) {
                Deployment deploy = new Deployment(this, text, DeploymentProps.builder()
                                .containers(List.of(ContainerProps.builder()
                                                .image("hashicorp/http-echo")
                                                .args(List.of("-text", text))
                                                .portNumber(5678)
                                                .build()))
                                .build());

                return IngressBackend.fromService(deploy.exposeViaService(ExposeDeploymentViaIngressOptions.builder()
                                .ports(List.of(ServicePort.builder()
                                                .port(5678)
                                                .build()))
                                .build()));
        }

        public static void main(String[] args) {

                final App app = new App();
                new Main(app, "pod-info");
                app.synth();

        }
}