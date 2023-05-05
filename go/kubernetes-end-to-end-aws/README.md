# Kubernetes End-2-End | AWS

Example of how to define and deploy a cdk8s application onto an Amazon EKS cluster. At a high-level, it consists of:

- An Amazon EKS cluster defined with the AWS CDK.
- A Kubernetes workload defined with cdk8s.

Everything is deployed via the AWS CDK, which can natively integrate with cdk8s to 
deploy Kubernetes manifests.

> More detailed information is available inline with the [code](./main.go).

## Architecture

![](./architecture.png)

## Deploy

```console
git clone https://github.com/cdk8s-team/cdk8s-examples.git
```

```console
cd cdk8s-examples/go/kubernetes-end-to-end-aws
```

```console
npm install
```

```console
npm run deploy
```

## Destroy 

```console
npm run destroy
```
