import { HelloInclude } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new HelloInclude(app, 'include');

  expect(Testing.synth(chart)).toMatchSnapshot();
});