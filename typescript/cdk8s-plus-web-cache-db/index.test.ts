import { WebCacheDB } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new WebCacheDB(app, 'web-cache-db');

  expect(Testing.synth(chart)).toMatchSnapshot();
});