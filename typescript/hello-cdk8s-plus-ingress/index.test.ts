import { HelloCdk8sPlusIngress } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new HelloCdk8sPlusIngress(app, 'hello-cdk8s-plus-ingress');

  expect(Testing.synth(chart)).toMatchSnapshot();
});