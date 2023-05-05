package com.example.helm;

import software.constructs.Construct;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;
import org.cdk8s.Helm;
import org.cdk8s.HelmProps;

public class Redis extends Chart {

        public Redis(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public Redis(final Construct scope, final String id, final ChartProps props) {
                super(scope, id, props);

                Map<String, Object> values = new HashMap<>();

                values.put("auth", Collections.singletonMap("password", "sdweqweq"));
                values.put("sentinel", Collections.singletonMap("enabled", true));

                new Helm(this, "redis", HelmProps.builder()
                                .chart("bitnami/redis")
                                .version("17.9.2")
                                .values(values)
                                .build());

        }

        public static void main(String[] args) {

                final App app = new App();
                new Redis(app, "redis");
                app.synth();

        }
}