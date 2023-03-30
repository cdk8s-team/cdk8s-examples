import { Dashboard } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new Dashboard(app, 'dashboard');

  expect(Testing.synth(chart)).toMatchSnapshot();
});