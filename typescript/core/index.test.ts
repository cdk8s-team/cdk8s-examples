import { Core } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new Core(app, 'core');

  expect(Testing.synth(chart)).toMatchSnapshot();
});