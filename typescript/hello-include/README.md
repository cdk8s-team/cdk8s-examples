# Hello Include

This example application shows how to use the [`Include`](https://cdk8s.io/docs/latest/basics/include/) construct.

#### 1) Synthesize the Kubernetes manifests

```console
$ yarn synth
```

> You can also look at the generated manifests [here](./dist/).

#### 2) Apply Kubernetes manifests to your cluster

```console
kubectl apply -f dist/hello-k8s.k8s.yaml
```
