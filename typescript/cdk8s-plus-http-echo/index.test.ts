import { HttpEcho } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new HttpEcho(app, 'http-echo');

  expect(Testing.synth(chart)).toMatchSnapshot();
});