import { HelloComposition } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new HelloComposition(app, 'hello-k8s');

  expect(Testing.synth(chart)).toMatchSnapshot();
});