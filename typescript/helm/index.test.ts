import { Redis } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new Redis(app, 'helm');

  expect(Testing.synth(chart)).toMatchSnapshot();
});