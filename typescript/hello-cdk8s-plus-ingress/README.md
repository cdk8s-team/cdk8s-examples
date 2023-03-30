# Hello cdk8s

This example shows how to use the [`Ingress`](https://cdk8s.io/docs/latest/plus/cdk8s-plus-26/ingress/) 
resource from the `cdk8s-plus` library.

#### 1) Synthesize the Kubernetes manifests

```console
$ yarn synth
```

> You can also look at the generated manifests [here](./dist/).

#### 2) Apply Kubernetes manifests to your cluster

```console
kubectl apply -f dist/hellok8s.k8s.yaml
```
