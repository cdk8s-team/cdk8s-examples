import { HelloK8s } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new HelloK8s(app, 'k8s');

  expect(Testing.synth(chart)).toMatchSnapshot();
});