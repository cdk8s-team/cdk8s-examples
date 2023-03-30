import { Cdk8sPlusIngress } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new Cdk8sPlusIngress(app, 'cdk8s-plus-ingress');

  expect(Testing.synth(chart)).toMatchSnapshot();
});