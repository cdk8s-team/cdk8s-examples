package com.example.composition;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

public class WebServices extends Chart {

        public WebServices(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public WebServices(final Construct scope, final String id, final ChartProps props) {
                super(scope, id, props);

                new WebService(this, "hello", new WebServiceProps.Builder()
                                .image("paulbouwer/hello-kubernetes:1.7")
                                .replicas(2)
                                .build());

                new WebService(this, "ghost", new WebServiceProps.Builder()
                                .image("ghost")
                                .containerPort(2368)
                                .build());

        }

        public static void main(String[] args) {

                final App app = new App();
                new WebServices(app, "web-services");
                app.synth();

        }
}