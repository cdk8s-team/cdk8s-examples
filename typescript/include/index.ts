import { Construct } from 'constructs';
import { App, Chart, Include } from 'cdk8s';

export class Dashboard extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    new Include(this, 'dashboard', {
      url: `${__dirname}/dashboard.yaml`
    });

  }
}

const app = new App();
new Dashboard(app, 'dashboard');
app.synth();