# Hello CRD

This example application shows how to use cdk8s to define custom resources.

#### 1) Synthesize the Kubernetes manifests

```console
$ yarn synth
```

> You can also look at the generated manifests [here](./dist/).

#### 2) Apply Kubernetes manifests to your cluster

```console
kubectl apply -f dist/hello-k8s.k8s.yaml
```
