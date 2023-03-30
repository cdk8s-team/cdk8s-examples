import { Construct } from 'constructs';
import { App, Chart, Duration } from 'cdk8s';
import * as kplus from 'cdk8s-plus-26';
import { Deployment } from 'cdk8s-plus-26';

export class PodInfo extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const portNumber = 9898;

    const deployment = new Deployment(this, 'Deployment');

    deployment.metadata.addAnnotation('prometheus.io/scrape', 'true');
    deployment.metadata.addAnnotation('prometheus.io/port', portNumber.toString());

    const container = deployment.addContainer({
      image: 'stefanprodan/podinfo:3.0.0',
      command: [
        './podinfo',
        `--port=${portNumber}`,
        '--level=info',
        '--random-error=true'
      ],
      imagePullPolicy: kplus.ImagePullPolicy.IF_NOT_PRESENT,
      portNumber,
      liveness: kplus.Probe.fromCommand(['podcli', 'check', 'http', `localhost:${portNumber}/healthz`], {
        initialDelaySeconds: Duration.seconds(1),
        timeoutSeconds: Duration.seconds(5),
      }),
      readiness: kplus.Probe.fromCommand(['podcli', 'check', 'http', `localhost:${portNumber}/readyz`], {
        initialDelaySeconds: Duration.seconds(1),
        timeoutSeconds: Duration.seconds(5),
      }),
    });
    container.env.addVariable('PODINFO_UI_MESSAGE', kplus.EnvValue.fromValue('this is my podinfo message'));
    container.mount('/data', kplus.Volume.fromEmptyDir(this, 'data', 'data'));

    new kplus.HorizontalPodAutoscaler(this, 'HPA', {
      target: deployment,
      maxReplicas: 100,
      minReplicas: 2,
      metrics: [kplus.Metric.resourceCpu(kplus.MetricTarget.averageUtilization(80))]
    });

    const service = deployment.exposeViaService();

    service.exposeViaIngress('/*');

  }

}

const app = new App();
new PodInfo(app, 'pod-info');
app.synth();