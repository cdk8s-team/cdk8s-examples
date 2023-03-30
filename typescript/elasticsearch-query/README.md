# Elasticsearch Query | cdk8s+

This directory contains an a small query service that hits an elasticsearch endpoint to perform a free text query. 
It contains the following components:

#### Elasticsearch Cluster

The Elasticsearch cluster is created using the [ElasticCloud CRD](https://download.elastic.co/downloads/eck/1.1.2/all-in-one.yaml). 
The code has been pre-imported and [included](./imports/elasticsearch.k8s.elastic.co/elasticsearch.ts) in this application.

> To learn mode about using CRD's with `cdk8s`, see [Custom Resource Definitions](https://cdk8s.io/docs/latest/cli/import/#crds) and [CRD Example](../crd/)

#### Query Deployment

A kubernetes deployment is created using the [`Deployment`](https://cdk8s.io/docs/latest/plus/cdk8s-plus-26/deployment/) construct.

#### Query Service

A kubernetes service that serves the deployment is created using the [`Service`](https://cdk8s.io/docs/latest/plus/cdk8s-plus-26/service/) construct.

## Synth

To synthesize a Kubernetes manifest from the TypeScript code, run:

`yarn synth`

## Apply

Before you can apply the manifest, you need to install the Elasticsearch Operator and CRD to your cluster. To do that, run the command (just once):

`kubectl apply -f https://download.elastic.co/downloads/eck/1.1.2/all-in-one.yaml`

To apply the manifest to your Kubernetes cluster, run:

`kubectl apply -f dist/elasticsearchquery.k8s.yaml`

## Indexing Data

This example has a [`data.txt`](./data.txt) file that contains some mock documents that can be indexed to the 
Elasticsearch cluster, for quick development iterations.

`yarn index-mock-data`
