import { Composition } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new Composition(app, 'composition');

  expect(Testing.synth(chart)).toMatchSnapshot();
});