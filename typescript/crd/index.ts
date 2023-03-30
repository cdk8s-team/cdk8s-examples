import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import * as cert from './imports/cert-manager.io';

export class Certificate extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    new cert.Certificate(this, 'Certificate', {
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
new Certificate(app, 'certificate');
app.synth();