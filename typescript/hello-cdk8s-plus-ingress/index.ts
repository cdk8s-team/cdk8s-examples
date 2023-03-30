import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';
import * as kplus from 'cdk8s-plus-26';

export class HelloCdk8sPlusIngress extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const ingress = new kplus.Ingress(this, 'ingress');
    ingress.addRule('/', this.echoBackend('root'));
    ingress.addRule('/foo', this.echoBackend('foo'));
    ingress.addRule('/foo/bar', this.echoBackend('foo-bar'));

    ingress.addHostDefaultBackend('my.host', this.echoBackend('my.host/hey'));

  }

  private echoBackend(text: string) {
    const deploy = new kplus.Deployment(this, text, {
      containers: [
        {
          image: 'hashicorp/http-echo',
          args: [ '-text', text ],
          portNumber: 5678,
        }
      ]
    });

    return kplus.IngressBackend.fromService(deploy.exposeViaService({ ports: [ { port: 5678 } ] }));
  }

}

const app = new App();
new HelloCdk8sPlusIngress(app, 'hello-cdk8s-plus-ingress');
app.synth();