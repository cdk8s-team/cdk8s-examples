import { HelloCrd } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new HelloCrd(app, 'hello-crd');

  expect(Testing.synth(chart)).toMatchSnapshot();
});