import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import { Certificate } from './imports/cert-manager.io';

export class HelloCrd extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    new Certificate(this, 'Certificate', {
      spec: {
        secretName: 'secret',
        issuerRef: {
          name: 'issuer'
        }
      }
    });

  }
}

const app = new App();
new HelloCrd(app, 'hello-crd');
app.synth();