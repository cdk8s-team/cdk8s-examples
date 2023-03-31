package com.example.app;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import imports.io.cert_manager.Certificate;
import imports.io.cert_manager.CertificateProps;
import imports.io.cert_manager.CertificateSpec;
import imports.io.cert_manager.CertificateSpecIssuerRef;

public class Crd extends Chart {

        public Crd(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public Crd(final Construct scope, final String id, final ChartProps props) {
                super(scope, id, props);

                new Certificate(this, "Certificate", CertificateProps.builder()
                                .spec(CertificateSpec.builder()
                                                .secretName("secret")
                                                .issuerRef(CertificateSpecIssuerRef.builder()
                                                                .name("issuer")
                                                                .build())
                                                .build())
                                .build());

        }

        public static void main(String[] args) {

                final App app = new App();
                new Crd(app, "certificate");
                app.synth();

        }
}