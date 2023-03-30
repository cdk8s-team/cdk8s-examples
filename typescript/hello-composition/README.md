# Hello cdk8s

This example shows how to compose multiple Kubernetes resources into a custom construct.

#### 1) Synthesize the Kubernetes manifests

```console
$ yarn synth
```

> You can also look at the generated manifests [here](./dist/).

#### 2) Apply Kubernetes manifests to your cluster

```console
kubectl apply -f dist/hellok8s.k8s.yaml
```
