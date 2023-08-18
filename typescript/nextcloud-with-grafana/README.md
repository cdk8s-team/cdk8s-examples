This example creates

- nextcloud
- mariadb
- redis
- traefik
- cert-manager
- certificate issuer
- victoria metrics
- grafana

## Config

You can config project using `yamls/config.yaml` and these values at the top of `main.ts`

```js
const YAMLS_PATH = "../yamls/";
const CONFIG_PATH = path.join(YAMLS_PATH, "config.yaml");
const FILES_ENCODING = "utf8";
const STORAGE_CLASS = "rawfile-btrfs";
```

Database credentials are in `yamls/database_credentials.yaml`  
Victoria metrics config file is in `yamls/victorial.yaml`, this file contains scrape configs.

## Add repos to helm

```shell
helm repo add traefik https://helm.traefik.io/traefik
helm repo add jetstack https://charts.jetstack.io
helm repo update
```

## Install nextcloud

```shell
kubectl apply -f dist/nextcloud.k8s.yaml
```

## Grafana

```shell
kubectl port-forward deploy/grafana 3000 -n metrics
```
