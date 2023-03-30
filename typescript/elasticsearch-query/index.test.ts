import { ElasticsearchQuery } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new ElasticsearchQuery(app, 'elasticsearch-query');

  expect(Testing.synth(chart)).toMatchSnapshot();
});