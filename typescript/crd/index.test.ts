import { Crd } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new Crd(app, 'crd');

  expect(Testing.synth(chart)).toMatchSnapshot();
});