import { Construct } from 'constructs';
import { App, Chart, Helm } from 'cdk8s';

export class Redis extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);
    
    new Helm(this, 'redis', {
      chart: 'bitnami/redis',
      version: '17.9.2',
      values: {
        auth: {
          password: 'sdweqweq'
        },
        sentinel: {
          enabled: true
        },
      }
    });
  }
}

const app = new App();
new Redis(app, 'redis');
app.synth();