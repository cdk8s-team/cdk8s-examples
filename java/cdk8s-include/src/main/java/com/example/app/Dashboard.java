package com.example.app;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;
import org.cdk8s.Include;
import org.cdk8s.IncludeProps;

public class Dashboard extends Chart {

        public Dashboard(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public Dashboard(final Construct scope, final String id, final ChartProps props) {
                super(scope, id, props);

                new Include(this, "dashboard", IncludeProps.builder()
                                .url("https://raw.githubusercontent.com/kubernetes/dashboard/v2.7.0/aio/deploy/recommended.yaml")
                                .build());

        }

        public static void main(String[] args) {

                final App app = new App();
                new Dashboard(app, "dashboard");
                app.synth();

        }
}