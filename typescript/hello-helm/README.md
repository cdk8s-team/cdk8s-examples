# Hello Helm

This example application deploys [bitnami/redis](https://github.com/bitnami/charts/tree/master/bitnami/redis) 
Helm chart with sentinel containers enabled.

Before running this, you will need to make sure you have `helm` installed and available in your PATH environment variable.

#### 1) Synthesize the Kubernetes manifests

```console
$ yarn synth
```

> You can also look at the generated manifests [here](./dist/).

#### 2) Apply Kubernetes manifests to your cluster

```console
kubectl apply -f dist/hello-k8s.k8s.yaml
```
