import { PodInfo } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new PodInfo(app, 'pod-info');

  expect(Testing.synth(chart)).toMatchSnapshot();
});