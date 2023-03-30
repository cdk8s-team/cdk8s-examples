import { Certificate } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new Certificate(app, 'certificate');

  expect(Testing.synth(chart)).toMatchSnapshot();
});