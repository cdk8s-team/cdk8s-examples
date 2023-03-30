import { WebServices } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new WebServices(app, 'web-services');

  expect(Testing.synth(chart)).toMatchSnapshot();
});