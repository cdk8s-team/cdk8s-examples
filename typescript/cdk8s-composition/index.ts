import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import { WebService } from './web-service';

export class WebServices extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    new WebService(this, 'hello', {
      image: 'paulbouwer/hello-kubernetes:1.7',
      replicas: 2
    });

    new WebService(this, 'ghost', {
      image: 'ghost',
      containerPort: 2368,
    });

  }
}

const app = new App();
new WebServices(app, 'web-services');
app.synth();