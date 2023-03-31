package main

import (
	"example.com/cdk8s-crd/imports/certmanagerio"
	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

func NewCertificate(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	certmanagerio.NewCertificate(chart, jsii.String("Certificate"), &certmanagerio.CertificateProps{
		Spec: &certmanagerio.CertificateSpec{
			SecretName: jsii.String("secret"),
			IssuerRef: &certmanagerio.CertificateSpecIssuerRef{
				Name: jsii.String("issuer"),
			},
		},
	})

	return chart
}

func main() {
	app := cdk8s.NewApp(nil)
	NewCertificate(app, "certificate")
	app.Synth()
}
