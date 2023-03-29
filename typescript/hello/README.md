# Hello cdk8s

This example application deploys [hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) using cdk8s.
You can apply this example into your own cluster with these step by step commands:

#### 1) Synthesize the Kubernetes manifests

```console
$ yarn synth
```

> You can also look at the generated manifests [here](./dist/).

#### 2) Apply Kubernetes manifests to your cluster

```console
kubectl apply -f dist/hellok8s.k8s.yaml
```
