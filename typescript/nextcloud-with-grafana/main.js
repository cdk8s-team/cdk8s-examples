"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.NextCloud = void 0;
const fs_1 = require("fs");
const path_1 = require("path");
const cdk8s_1 = require("cdk8s");
const kplus = require("cdk8s-plus-25");
const yaml_1 = require("yaml");
const dbSecretKeys = [
    'MYSQL_DATABASE',
    'MYSQL_ROOT_PASSWORD',
    'MYSQL_USER',
    'MYSQL_PASSWORD',
];
const YAMLS_PATH = 'yamls/';
const CONFIG_PATH = (0, path_1.join)(YAMLS_PATH, 'config.yaml');
const FILES_ENCODING = 'utf8';
const STORAGE_CLASS = 'rawfile-btrfs';
/**
 * Creates secret for database
 *
 * @param {Chart} chart - chart object
 * @param {string} namespace
 * @param {string} path - path to secret file
 * @return {kplus.Secret}
 */
function getSecret(chart, namespace, path) {
    const secret = new kplus.Secret(chart, 'nextcloud-db-secret', {
        metadata: {
            namespace: namespace,
        },
    });
    const file = (0, fs_1.readFileSync)(path, FILES_ENCODING);
    const secrets = (0, yaml_1.parse)(file);
    dbSecretKeys.forEach((key) => {
        secret.addStringData(key, secrets[key]);
    });
    return secret;
}
/**
 * Gets default deployment object with given name as app:name label
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name - name of labels
 * @param {number} replicas - number of replicas
 *
 * @returns {kplus.Deployment}
 */
function getRawDeployment(chart, namespace, name, replicas) {
    return new kplus.Deployment(chart, name, {
        metadata: {
            labels: {
                app: name,
            },
            name: name,
            namespace: namespace,
        },
        replicas: replicas,
        securityContext: {
            ensureNonRoot: false,
        },
        podMetadata: {
            labels: {
                app: name,
            },
        },
    });
}
/**
 * Create database container
 *
 * @param {kplus.Deployment} mariadbDeployment - deplyoment object of database
 * @param {kplus.Secret} secret - secret object for MYSQL_... environment variables
 *
 * @returns {kplus.Container}
 */
function getMariadbContainer(mariadbDeployment, secret, port, name) {
    const mariadbContainer = mariadbDeployment.addContainer({
        name: name,
        image: 'mariadb:latest',
        resources: {},
        args: [
            '--transaction-isolation=READ-COMMITTED',
            '--binlog-format=ROW',
            '--max-connections=1000',
        ],
        ports: [{ number: port }],
        securityContext: {
            ensureNonRoot: false,
            readOnlyRootFilesystem: false,
        },
    });
    dbSecretKeys.forEach((key) => {
        const value = kplus.EnvValue.fromSecretValue({
            secret: secret,
            key: key,
        });
        mariadbContainer.env.addVariable(key, value);
    });
    return mariadbContainer;
}
/**
 * Creates a ClusterIP service
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name - suffix of service name
 * @param {kplus.Deployment} deployment - deplyoment object for service
 * @param {number} port - port number of service
 *
 * @returns {kplus.Service}
 */
function getService(chart, namespace, name, deployment, port) {
    return new kplus.Service(chart, 'Service'.concat(name), {
        metadata: {
            name: name,
            labels: {
                app: name,
            },
            namespace: namespace,
        },
        selector: deployment,
        ports: [{ port: port }],
    });
}
/**
 * Create persistent volume claim
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name - name of pvc
 * @param {number} size - size of pvc in gigabytes
 *
 * @returns {kplus.Pers}
 */
function pvc(chart, namespace, name, size, access_mod = kplus.PersistentVolumeAccessMode.READ_WRITE_ONCE) {
    const claim = new kplus.PersistentVolumeClaim(chart, name, {
        metadata: {
            namespace: namespace,
        },
        storage: cdk8s_1.Size.gibibytes(size),
        accessModes: [access_mod],
        storageClassName: STORAGE_CLASS,
    });
    return kplus.Volume.fromPersistentVolumeClaim(chart, 'Vol '.concat(name), claim);
}
/**
 * Creates all manifests for database
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {kplus.Secret} secret - secret object for MYSQL_XXX envs
 * @param {string} name
 * @param {number} port
 * @param {number} storage size of database in gigabytes
 *
 */
function mariadb(chart, namespace, secret, name, port, storage) {
    const mariadbDeployment = getRawDeployment(chart, namespace, name, 1);
    const mariadbContainer = getMariadbContainer(mariadbDeployment, secret, port, name);
    const dbPvc = pvc(chart, namespace, 'mariadb-pvc', storage);
    mariadbContainer.mount('/var/lib/mysql', dbPvc);
    getService(chart, namespace, name, mariadbDeployment, port);
}
/**
 * Creates all manifests for redis
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name
 * @param {number} port
 * @param {number} replicas
 */
function redis(chart, namespace, name, port, replicas) {
    const redisDeployment = getRawDeployment(chart, namespace, name, replicas);
    redisDeployment.addContainer({
        name: name,
        image: 'redis:latest',
        resources: {},
        ports: [{ number: port }],
        securityContext: {
            ensureNonRoot: false,
        },
    });
    getService(chart, namespace, name, redisDeployment, port);
}
/**
 * Creates cluster issuer
 *
 * @param {Chart} chart
 * @param {string} ca address of ca
 * @param {string} email
 * @returns {ApiObject}
 */
function addClusterIssuer(chart, ca, email) {
    const clusterIssuer = new cdk8s_1.ApiObject(chart, 'cluster-issuer', {
        apiVersion: 'cert-manager.io/v1',
        kind: 'ClusterIssuer',
        metadata: {
            name: 'acme-issuer',
            namespace: 'cert-manager',
        },
    });
    clusterIssuer.addJsonPatch(cdk8s_1.JsonPatch.add('/spec', {
        acme: {
            email: email,
            server: ca,
            privateKeySecretRef: { name: 'pvtkey-issuer' },
            solvers: [
                {
                    http01: {
                        ingress: {
                            class: 'traefik',
                        },
                    },
                },
            ],
        },
    }));
    return clusterIssuer;
}
/**
 * Creates certificate
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {ApiObject} clusterIssuer
 * @param {kplus.Secret} tlsSecret
 * @param {string} host
 */
function createCertificate(chart, namespace, clusterIssuer, tlsSecret, host) {
    const certi = new cdk8s_1.ApiObject(chart, 'certificate', {
        apiVersion: 'cert-manager.io/v1',
        kind: 'Certificate',
        metadata: {
            name: host,
            namespace: namespace,
        },
    });
    certi.addJsonPatch(cdk8s_1.JsonPatch.add('/spec', {
        secretName: tlsSecret.name,
        issuerRef: {
            name: clusterIssuer.name,
            kind: 'ClusterIssuer',
        },
        dnsNames: [host],
    }));
}
/**
 * Creates ingress manifest for nextcloud
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} path - suffix path of url
 * @param {kplus.Service} service - service to expose
 * @param {string} host
 * @param {string} ca address of ca
 * @param {string} email
 */
function addIngress(chart, namespace, path, service, host, ca, email) {
    const clusterIssuer = addClusterIssuer(chart, ca, email);
    const tlsSecret = new kplus.Secret(chart, 'tls-secret', {
        metadata: {
            namespace: namespace,
        },
        type: 'kubernetes.io/tls',
    });
    createCertificate(chart, namespace, clusterIssuer, tlsSecret, host);
    new kplus.Ingress(chart, 'ingress', {
        metadata: {
            name: 'ingress',
            namespace: namespace,
        },
        rules: [
            {
                host: host,
                path: path,
                backend: kplus.IngressBackend.fromService(service),
            },
        ],
        tls: [
            {
                hosts: [host],
                secret: tlsSecret,
            },
        ],
    });
}
/**
 * Creates all manifests for nextcloud core
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {kplus.Secret} secret - secret object to access MYSQL_XXX envs
 * @param {string} name
 * @param {number} port
 * @param {number} storage storage size of next cloud in gigibytes
 * @param {string[]} db_secret_keys list of secrets key
 * @param {string} redis_host url of redis
 * @param {string} admin_user admin username
 * @param {string} db_host url of database
 * @param {string} host address of host
 * @param {string} ca address of ca
 * @param {string} email email for ceritifcaste
 */
function nextCloud(chart, namespace, secret, name, port, storage, db_secret_keys, redis_host, admin_user, db_host, host, ca, email) {
    const nextCloudeDeployment = getRawDeployment(chart, namespace, name, 1);
    const nextCloudContainer = getNextCloudContainer(nextCloudeDeployment, secret, name, port, db_secret_keys, redis_host, admin_user, db_host, host);
    const nextCloudPvc = pvc(chart, namespace, 'nextcloud-pvc', storage);
    nextCloudContainer.mount('/var/www/html', nextCloudPvc);
    const nextCloudService = getService(chart, namespace, name, nextCloudeDeployment, port);
    addIngress(chart, namespace, '/', nextCloudService, host, ca, email);
}
/**
 * Creates container for nextcloud
 *
 * @param {kplus.Deployment} deployment - deplyoment object for nextcloud
 * @param {kplus.Secret} secret
 * @param {string} name
 * @param {number} port
 * @param {string[]} db_secret_keys list of secrets key
 * @param {string} redis_host url of redis
 * @param {string} admin_user admin username
 * @param {string} db_host url of database
 * @param {string} host address of host
 *
 * @returns {kplus.Container}
 */
function getNextCloudContainer(deployment, secret, name, port, db_secret_keys, redis_host, admin_user, db_host, host) {
    const nextCloudContainer = deployment.addContainer({
        name: name,
        image: 'nextcloud:apache',
        resources: {},
        ports: [{ number: port }],
        securityContext: {
            ensureNonRoot: false,
            readOnlyRootFilesystem: false,
        },
    });
    db_secret_keys.forEach((key) => {
        const value = kplus.EnvValue.fromSecretValue({
            secret: secret,
            key: key,
        });
        nextCloudContainer.env.addVariable(key, value);
    });
    const env = {
        REDIS_HOST: redis_host,
        // REDIS_HOST_PASSWORD: "",
        NEXTCLOUD_ADMIN_USER: admin_user,
        MYSQL_HOST: db_host,
        NEXTCLOUD_TRUSTED_DOMAINS: host,
    };
    Object.entries(env).forEach(([key, value]) => {
        nextCloudContainer.env.addVariable(key, kplus.EnvValue.fromValue(value));
    });
    nextCloudContainer.env.addVariable('NEXTCLOUD_ADMIN_PASSWORD', kplus.EnvValue.fromSecretValue({
        secret: secret,
        key: 'MYSQL_PASSWORD', /// just for testing
    }));
    return nextCloudContainer;
}
/**
 * Install traefik using helm
 */
function addTraefik(chart) {
    new cdk8s_1.Helm(chart, 'traefik', {
        releaseName: 'traefik',
        chart: 'traefik/traefik',
        values: {
            additionalArguments: [
                '--serversTransport.insecureSkipVerify=true',
                '--log.level=DEBUG',
                '--metrics.prometheus=true',
            ],
            deployment: {
                additionalContainers: [],
                annotations: {},
                enabled: true,
                initContainers: [],
                podAnnotations: {},
                replicas: 1,
            },
            globalArguments: [
                '--global.sendanonymoususage=false',
                '--global.checknewversion=false',
            ],
            ingressRoute: { dashboard: { enabled: false } },
            ports: {
                web: { redirectTo: 'websecure' },
                websecure: { tls: { enabled: true } },
                metrics: {
                    port: 9100,
                    expose: false,
                    exposedPort: 9100,
                    protocol: 'TCP',
                },
            },
            hub: {
                enabled: true,
            },
            metrics: {
                prometheus: {
                    entryPoint: 'metrics',
                    addRoutersLabels: true,
                    addServicesLabels: true,
                },
            },
            providers: {
                kubernetesCRD: {
                    allowExternalNameServices: true,
                    enabled: true,
                    ingressClass: 'traefik-external',
                },
                kubernetesIngress: {
                    allowExternalNameServices: true,
                    enabled: true,
                    publishedService: { enabled: false },
                },
            },
            rbac: { enabled: true },
            service: {
                annotations: {},
                enabled: true,
                externalIPs: [],
                labels: {},
                loadBalancerSourceRanges: [],
                type: 'LoadBalancer',
            },
        },
    });
}
/**
 * Add cert-manager using helm
 */
function addCertManager(chart) {
    new cdk8s_1.Helm(chart, 'cert-manager', {
        releaseName: 'cert-manager',
        namespace: 'cert-manager',
        version: 'v1.9.1',
        chart: 'jetstack/cert-manager',
        values: {
            extraArgs: [
                '--dns01-recursive-nameservers=1.1.1.1:53,9.9.9.9:53',
                '--dns01-recursive-nameservers-only',
            ],
            installCRDs: false,
            podDnsConfig: { nameservers: ['1.1.1.1', '9.9.9.9'] },
            podDnsPolicy: 'None',
            replicaCount: 1,
        },
    });
}
/**
 * Create victoria
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name
 * @param {number} port port of victoria
 * @param {string} prom_file_path path to store prometheus config file
 * @param {string} prom_config_name name of prometheus config file
 * @param {string} config_path path to prometheus config file
 * @param {number} storage size of storage in gigabytes
 */
function victoriaMetrics(chart, namespace, name, port, prom_file_path, prom_config_name, config_path, storage) {
    const deployment = getRawDeployment(chart, namespace, name, 1);
    const container = deployment.addContainer({
        name: name,
        image: 'victoriametrics/victoria-metrics:latest',
        resources: {},
        ports: [{ number: port }],
        securityContext: {
            ensureNonRoot: false,
        },
        args: ['-promscrape.config='.concat(prom_file_path, prom_config_name)],
    });
    const config = new kplus.ConfigMap(chart, 'vic-config', {
        metadata: {
            name: name,
            namespace: namespace,
        },
    });
    config.addFile((0, path_1.join)(YAMLS_PATH, config_path), prom_config_name);
    const volume = kplus.Volume.fromConfigMap(chart, 'ConfigMap', config);
    container.mount(prom_file_path, volume);
    const vmvc = pvc(chart, namespace, 'victoria-pvc', storage);
    container.mount('/victoria-metrics-data', vmvc);
    getService(chart, namespace, name, deployment, port);
}
/**
 * Create garafan
 *
 * @param {Chart} chart
 * @param {sttring} namespace
 * @param {string} name name of grafana
 * @param {number} port port of grafana
 * @param {number} storage size of grafana storage in gigabytes
 */
function grafana(chart, namespace, name, port, storage) {
    const deployment = getRawDeployment(chart, namespace, name, 1);
    const pvcGrafana = pvc(chart, namespace, 'volGrafana', storage);
    const initContainer = deployment.addInitContainer({
        name: 'chown',
        image: 'busybox:latest',
        resources: {},
        securityContext: {
            ensureNonRoot: false,
            readOnlyRootFilesystem: false,
        },
        command: ['chown', '-R', '472:472', '/var/lib/grafana'],
    });
    initContainer.mount('/var/lib/grafana', pvcGrafana);
    const container = deployment.addContainer({
        name: name,
        image: 'grafana/grafana:latest',
        resources: {},
        ports: [{ number: port }],
        securityContext: {
            ensureNonRoot: false,
            readOnlyRootFilesystem: false,
        },
    });
    container.mount('/var/lib/grafana', pvcGrafana);
    getService(chart, namespace, name, deployment, port);
}
function createNamespace(chart, name) {
    new kplus.Namespace(chart, name.concat('-ns'), {
        metadata: {
            name: name,
        },
    });
}
class NextCloud extends cdk8s_1.Chart {
    constructor(scope, id, props = {}) {
        super(scope, id, props);
        const configFile = (0, fs_1.readFileSync)(CONFIG_PATH, FILES_ENCODING);
        const config = (0, yaml_1.parse)(configFile);
        const MARIADB = config.db.name;
        const DB_PORT = config.db.port;
        const DB_STORAGE = config.db.storage;
        const REDIS = config.redis.name;
        const REDIS_PORT = config.redis.port;
        const REDIS_REPLICAS = config.redis.replicas;
        const NEXT_CLOUD = config.nextcloud.name;
        const NEXTCLOUD_PORT = config.nextcloud.port;
        const NBEXTCLOUD_STORAGE = config.nextcloud.storage;
        const ADD_TRAEFIK = config.helm.traeifk;
        const ADD_CERT_MANAGER = config.helm.cert_manager;
        const HOST = config.network.host;
        const STAGING = config.network.staging;
        const PRODUCTION_TLS = config.network.production_tls;
        const STAGING_TLS = config.network.staging_tls;
        const EMAIL_TLS = config.network.email_tls;
        const DATABASE_CREDENTIALS_PATH = (0, path_1.join)(YAMLS_PATH, config.database_credentials_path);
        const GRAFANA = config.grafana.name;
        const GRAFANA_PORT = config.grafana.port;
        const GRAFANA_STORAGE = config.grafana.storage;
        const viccon = config.victoria;
        const VICTORIA = viccon.name;
        const VICTORIA_PORT = viccon.port;
        const VICTORIA_CONFIG_PATH = viccon.config_file;
        const PROM_FILE_PATH = viccon.prom_path;
        const PROM_CONFIG_NAME = viccon.prom_config_name;
        const VICTORIA_STORAGE = viccon.storage;
        const NS_MAIN = config.namespace.main;
        const NS_METRICS = config.namespace.metrics;
        createNamespace(this, NS_MAIN);
        createNamespace(this, NS_METRICS);
        if (ADD_TRAEFIK)
            addTraefik(this);
        if (ADD_CERT_MANAGER)
            addCertManager(this);
        const secret = getSecret(this, NS_MAIN, DATABASE_CREDENTIALS_PATH);
        mariadb(this, NS_MAIN, secret, MARIADB, DB_PORT, DB_STORAGE);
        redis(this, NS_MAIN, REDIS, REDIS_PORT, REDIS_REPLICAS);
        nextCloud(this, NS_MAIN, secret, NEXT_CLOUD, NEXTCLOUD_PORT, NBEXTCLOUD_STORAGE, dbSecretKeys, REDIS, 'admin', MARIADB, HOST, [PRODUCTION_TLS, STAGING_TLS][Number(STAGING)], EMAIL_TLS);
        victoriaMetrics(this, NS_METRICS, VICTORIA, VICTORIA_PORT, PROM_FILE_PATH, PROM_CONFIG_NAME, VICTORIA_CONFIG_PATH, VICTORIA_STORAGE);
        grafana(this, NS_METRICS, GRAFANA, GRAFANA_PORT, GRAFANA_STORAGE);
    }
}
exports.NextCloud = NextCloud;
const app = new cdk8s_1.App();
new NextCloud(app, 'nextcloud');
app.synth();
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoibWFpbi5qcyIsInNvdXJjZVJvb3QiOiIiLCJzb3VyY2VzIjpbIm1haW4udHMiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6Ijs7O0FBQUEsMkJBQWtDO0FBQ2xDLCtCQUE0QjtBQUM1QixpQ0FRZTtBQUNmLHVDQUF1QztBQUV2QywrQkFBNkI7QUFFN0IsTUFBTSxZQUFZLEdBQUc7SUFDbkIsZ0JBQWdCO0lBQ2hCLHFCQUFxQjtJQUNyQixZQUFZO0lBQ1osZ0JBQWdCO0NBQ2pCLENBQUM7QUFFRixNQUFNLFVBQVUsR0FBRyxRQUFRLENBQUM7QUFDNUIsTUFBTSxXQUFXLEdBQUcsSUFBQSxXQUFJLEVBQUMsVUFBVSxFQUFFLGFBQWEsQ0FBQyxDQUFDO0FBQ3BELE1BQU0sY0FBYyxHQUFHLE1BQU0sQ0FBQztBQUM5QixNQUFNLGFBQWEsR0FBRyxlQUFlLENBQUM7QUFFdEM7Ozs7Ozs7R0FPRztBQUNILFNBQVMsU0FBUyxDQUNoQixLQUFZLEVBQ1osU0FBaUIsRUFDakIsSUFBWTtJQUVaLE1BQU0sTUFBTSxHQUFHLElBQUksS0FBSyxDQUFDLE1BQU0sQ0FBQyxLQUFLLEVBQUUscUJBQXFCLEVBQUU7UUFDNUQsUUFBUSxFQUFFO1lBQ1IsU0FBUyxFQUFFLFNBQVM7U0FDckI7S0FDRixDQUFDLENBQUM7SUFDSCxNQUFNLElBQUksR0FBRyxJQUFBLGlCQUFZLEVBQUMsSUFBSSxFQUFFLGNBQWMsQ0FBQyxDQUFDO0lBQ2hELE1BQU0sT0FBTyxHQUFHLElBQUEsWUFBSyxFQUFDLElBQUksQ0FBQyxDQUFDO0lBQzVCLFlBQVksQ0FBQyxPQUFPLENBQUMsQ0FBQyxHQUFHLEVBQUUsRUFBRTtRQUMzQixNQUFNLENBQUMsYUFBYSxDQUFDLEdBQUcsRUFBRSxPQUFPLENBQUMsR0FBRyxDQUFDLENBQUMsQ0FBQztJQUMxQyxDQUFDLENBQUMsQ0FBQztJQUNILE9BQU8sTUFBTSxDQUFDO0FBQ2hCLENBQUM7QUFFRDs7Ozs7Ozs7O0dBU0c7QUFDSCxTQUFTLGdCQUFnQixDQUN2QixLQUFZ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QUFVLEVBQUUsT0FBTyxFQUFFLFlBQVksRUFBRSxlQUFlLENBQUMsQ0FBQztJQUNwRSxDQUFDO0NBQ0Y7QUE3RUQsOEJBNkVDO0FBRUQsTUFBTSxHQUFHLEdBQUcsSUFBSSxXQUFHLEVBQUUsQ0FBQztBQUN0QixJQUFJLFNBQVMsQ0FBQyxHQUFHLEVBQUUsV0FBVyxDQUFDLENBQUM7QUFDaEMsR0FBRyxDQUFDLEtBQUssRUFBRSxDQUFDIiwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IHsgcmVhZEZpbGVTeW5jIH0gZnJvbSAnZnMnO1xuaW1wb3J0IHsgam9pbiB9IGZyb20gJ3BhdGgnO1xuaW1wb3J0IHtcbiAgQXBwLFxuICBIZWxtLFxuICBKc29uUGF0Y2gsXG4gIEFwaU9iamVjdCxcbiAgQ2hhcnQsXG4gIENoYXJ0UHJvcHMsXG4gIFNpemUsXG59IGZyb20gJ2NkazhzJztcbmltcG9ydCAqIGFzIGtwbHVzIGZyb20gJ2NkazhzLXBsdXMtMjUnO1xuaW1wb3J0IHsgQ29uc3RydWN0IH0gZnJvbSAnY29uc3RydWN0cyc7XG5pbXBvcnQgeyBwYXJzZSB9IGZyb20gJ3lhbWwnO1xuXG5jb25zdCBkYlNlY3JldEtleXMgPSBbXG4gICdNWVNRTF9EQVRBQkFTRScsXG4gICdNWVNRTF9ST09UX1BBU1NXT1JEJyxcbiAgJ01ZU1FMX1VTRVInLFxuICAnTVlTUUxfUEFTU1dPUkQnLFxuXTtcblxuY29uc3QgWUFNTFNfUEFUSCA9ICd5YW1scy8nO1xuY29uc3QgQ09ORklHX1BBVEggPSBqb2luKFlBTUxTX1BBVEgsICdjb25maWcueWFtbCcpO1xuY29uc3QgRklMRVNfRU5DT0RJTkcgPSAndXRmOCc7XG5jb25zdCBTVE9SQUdFX0NMQVNTID0gJ3Jhd2ZpbGUtYnRyZnMnO1xuXG4vKipcbiAqIENyZWF0ZXMgc2VjcmV0IGZvciBkYXRhYmFzZVxuICpcbiAqIEBwYXJhbSB7Q2hhcnR9IGNoYXJ0IC0gY2hhcnQgb2JqZWN0XG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZXNwYWNlXG4gKiBAcGFyYW0ge3N0cmluZ30gcGF0aCAtIHBhdGggdG8gc2VjcmV0IGZpbGVcbiAqIEByZXR1cm4ge2twbHVzLlNlY3JldH1cbiAqL1xuZnVuY3Rpb24gZ2V0U2VjcmV0KFxuICBjaGFydDogQ2hhcnQsXG4gIG5hbWVzcGFjZTogc3RyaW5nLFxuICBwYXRoOiBzdHJpbmcsXG4pOiBrcGx1cy5TZWNyZXQge1xuICBjb25zdCBzZWNyZXQgPSBuZXcga3BsdXMuU2VjcmV0KGNoYXJ0LCAnbmV4dGNsb3VkLWRiLXNlY3JldCcsIHtcbiAgICBtZXRhZGF0YToge1xuICAgICAgbmFtZXNwYWNlOiBuYW1lc3BhY2UsXG4gICAgfSxcbiAgfSk7XG4gIGNvbnN0IGZpbGUgPSByZWFkRmlsZVN5bmMocGF0aCwgRklMRVNfRU5DT0RJTkcpO1xuICBjb25zdCBzZWNyZXRzID0gcGFyc2UoZmlsZSk7XG4gIGRiU2VjcmV0S2V5cy5mb3JFYWNoKChrZXkpID0+IHtcbiAgICBzZWNyZXQuYWRkU3RyaW5nRGF0YShrZXksIHNlY3JldHNba2V5XSk7XG4gIH0pO1xuICByZXR1cm4gc2VjcmV0O1xufVxuXG4vKipcbiAqIEdldHMgZGVmYXVsdCBkZXBsb3ltZW50IG9iamVjdCB3aXRoIGdpdmVuIG5hbWUgYXMgYXBwOm5hbWUgbGFiZWxcbiAqXG4gKiBAcGFyYW0ge0NoYXJ0fSBjaGFydFxuICogQHBhcmFtIHtzdHJpbmd9IG5hbWVzcGFjZVxuICogQHBhcmFtIHtzdHJpbmd9IG5hbWUgLSBuYW1lIG9mIGxhYmVsc1xuICogQHBhcmFtIHtudW1iZXJ9IHJlcGxpY2FzIC0gbnVtYmVyIG9mIHJlcGxpY2FzXG4gKlxuICogQHJldHVybnMge2twbHVzLkRlcGxveW1lbnR9XG4gKi9cbmZ1bmN0aW9uIGdldFJhd0RlcGxveW1lbnQoXG4gIGNoYXJ0OiBDaGFydCxcbiAgbmFtZXNwYWNlOiBzdHJpbmcsXG4gIG5hbWU6IHN0cmluZyxcbiAgcmVwbGljYXM6IG51bWJlcixcbik6IGtwbHVzLkRlcGxveW1lbnQge1xuICByZXR1cm4gbmV3IGtwbHVzLkRlcGxveW1lbnQoY2hhcnQsIG5hbWUsIHtcbiAgICBtZXRhZGF0YToge1xuICAgICAgbGFiZWxzOiB7XG4gICAgICAgIGFwcDogbmFtZSxcbiAgICAgIH0sXG4gICAgICBuYW1lOiBuYW1lLFxuICAgICAgbmFtZXNwYWNlOiBuYW1lc3BhY2UsXG4gICAgfSxcbiAgICByZXBsaWNhczogcmVwbGljYXMsXG4gICAgc2VjdXJpdHlDb250ZXh0OiB7XG4gICAgICBlbnN1cmVOb25Sb290OiBmYWxzZSxcbiAgICB9LFxuICAgIHBvZE1ldGFkYXRhOiB7XG4gICAgICBsYWJlbHM6IHtcbiAgICAgICAgYXBwOiBuYW1lLFxuICAgICAgfSxcbiAgICB9LFxuICB9KTtcbn1cblxuLyoqXG4gKiBDcmVhdGUgZGF0YWJhc2UgY29udGFpbmVyXG4gKlxuICogQHBhcmFtIHtrcGx1cy5EZXBsb3ltZW50fSBtYXJpYWRiRGVwbG95bWVudCAtIGRlcGx5b21lbnQgb2JqZWN0IG9mIGRhdGFiYXNlXG4gKiBAcGFyYW0ge2twbHVzLlNlY3JldH0gc2VjcmV0IC0gc2VjcmV0IG9iamVjdCBmb3IgTVlTUUxfLi4uIGVudmlyb25tZW50IHZhcmlhYmxlc1xuICpcbiAqIEByZXR1cm5zIHtrcGx1cy5Db250YWluZXJ9XG4gKi9cbmZ1bmN0aW9uIGdldE1hcmlhZGJDb250YWluZXIoXG4gIG1hcmlhZGJEZXBsb3ltZW50OiBrcGx1cy5EZXBsb3ltZW50LFxuICBzZWNyZXQ6IGtwbHVzLlNlY3JldCxcbiAgcG9ydDogbnVtYmVyLFxuICBuYW1lOiBzdHJpbmcsXG4pOiBrcGx1cy5Db250YWluZXIge1xuICBjb25zdCBtYXJpYWRiQ29udGFpbmVyID0gbWFyaWFkYkRlcGxveW1lbnQuYWRkQ29udGFpbmVyKHtcbiAgICBuYW1lOiBuYW1lLFxuICAgIGltYWdlOiAnbWFyaWFkYjpsYXRlc3QnLFxuICAgIHJlc291cmNlczoge30sXG4gICAgYXJnczogW1xuICAgICAgJy0tdHJhbnNhY3Rpb24taXNvbGF0aW9uPVJFQUQtQ09NTUlUVEVEJyxcbiAgICAgICctLWJpbmxvZy1mb3JtYXQ9Uk9XJyxcbiAgICAgICctLW1heC1jb25uZWN0aW9ucz0xMDAwJyxcbiAgICBdLFxuICAgIHBvcnRzOiBbeyBudW1iZXI6IHBvcnQgfV0sXG4gICAgc2VjdXJpdHlDb250ZXh0OiB7XG4gICAgICBlbnN1cmVOb25Sb290OiBmYWxzZSxcbiAgICAgIHJlYWRPbmx5Um9vdEZpbGVzeXN0ZW06IGZhbHNlLFxuICAgIH0sXG4gIH0pO1xuICBkYlNlY3JldEtleXMuZm9yRWFjaCgoa2V5KSA9PiB7XG4gICAgY29uc3QgdmFsdWUgPSBrcGx1cy5FbnZWYWx1ZS5mcm9tU2VjcmV0VmFsdWUoe1xuICAgICAgc2VjcmV0OiBzZWNyZXQsXG4gICAgICBrZXk6IGtleSxcbiAgICB9KTtcbiAgICBtYXJpYWRiQ29udGFpbmVyLmVudi5hZGRWYXJpYWJsZShrZXksIHZhbHVlKTtcbiAgfSk7XG4gIHJldHVybiBtYXJpYWRiQ29udGFpbmVyO1xufVxuXG4vKipcbiAqIENyZWF0ZXMgYSBDbHVzdGVySVAgc2VydmljZVxuICpcbiAqIEBwYXJhbSB7Q2hhcnR9IGNoYXJ0XG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZXNwYWNlXG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZSAtIHN1ZmZpeCBvZiBzZXJ2aWNlIG5hbWVcbiAqIEBwYXJhbSB7a3BsdXMuRGVwbG95bWVudH0gZGVwbG95bWVudCAtIGRlcGx5b21lbnQgb2JqZWN0IGZvciBzZXJ2aWNlXG4gKiBAcGFyYW0ge251bWJlcn0gcG9ydCAtIHBvcnQgbnVtYmVyIG9mIHNlcnZpY2VcbiAqXG4gKiBAcmV0dXJucyB7a3BsdXMuU2VydmljZX1cbiAqL1xuZnVuY3Rpb24gZ2V0U2VydmljZShcbiAgY2hhcnQ6IENoYXJ0LFxuICBuYW1lc3BhY2U6IHN0cmluZyxcbiAgbmFtZTogc3RyaW5nLFxuICBkZXBsb3ltZW50OiBrcGx1cy5EZXBsb3ltZW50LFxuICBwb3J0OiBudW1iZXIsXG4pOiBrcGx1cy5TZXJ2aWNlIHtcbiAgcmV0dXJuIG5ldyBrcGx1cy5TZXJ2aWNlKGNoYXJ0LCAnU2VydmljZScuY29uY2F0KG5hbWUpLCB7XG4gICAgbWV0YWRhdGE6IHtcbiAgICAgIG5hbWU6IG5hbWUsXG4gICAgICBsYWJlbHM6IHtcbiAgICAgICAgYXBwOiBuYW1lLFxuICAgICAgfSxcbiAgICAgIG5hbWVzcGFjZTogbmFtZXNwYWNlLFxuICAgIH0sXG4gICAgc2VsZWN0b3I6IGRlcGxveW1lbnQsXG4gICAgcG9ydHM6IFt7IHBvcnQ6IHBvcnQgfV0sXG4gIH0pO1xufVxuXG4vKipcbiAqIENyZWF0ZSBwZXJzaXN0ZW50IHZvbHVtZSBjbGFpbVxuICpcbiAqIEBwYXJhbSB7Q2hhcnR9IGNoYXJ0XG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZXNwYWNlXG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZSAtIG5hbWUgb2YgcHZjXG4gKiBAcGFyYW0ge251bWJlcn0gc2l6ZSAtIHNpemUgb2YgcHZjIGluIGdpZ2FieXRlc1xuICpcbiAqIEByZXR1cm5zIHtrcGx1cy5QZXJzfVxuICovXG5mdW5jdGlvbiBwdmMoXG4gIGNoYXJ0OiBDaGFydCxcbiAgbmFtZXNwYWNlOiBzdHJpbmcsXG4gIG5hbWU6IHN0cmluZyxcbiAgc2l6ZTogbnVtYmVyLFxuICBhY2Nlc3NfbW9kID0ga3BsdXMuUGVyc2lzdGVudFZvbHVtZUFjY2Vzc01vZGUuUkVBRF9XUklURV9PTkNFLFxuKToga3BsdXMuVm9sdW1lIHtcbiAgY29uc3QgY2xhaW0gPSBuZXcga3BsdXMuUGVyc2lzdGVudFZvbHVtZUNsYWltKGNoYXJ0LCBuYW1lLCB7XG4gICAgbWV0YWRhdGE6IHtcbiAgICAgIG5hbWVzcGFjZTogbmFtZXNwYWNlLFxuICAgIH0sXG4gICAgc3RvcmFnZTogU2l6ZS5naWJpYnl0ZXMoc2l6ZSksXG4gICAgYWNjZXNzTW9kZXM6IFthY2Nlc3NfbW9kXSxcbiAgICBzdG9yYWdlQ2xhc3NOYW1lOiBTVE9SQUdFX0NMQVNTLFxuICB9KTtcbiAgcmV0dXJuIGtwbHVzLlZvbHVtZS5mcm9tUGVyc2lzdGVudFZvbHVtZUNsYWltKFxuICAgIGNoYXJ0LFxuICAgICdWb2wgJy5jb25jYXQobmFtZSksXG4gICAgY2xhaW0sXG4gICk7XG59XG5cbi8qKlxuICogQ3JlYXRlcyBhbGwgbWFuaWZlc3RzIGZvciBkYXRhYmFzZVxuICpcbiAqIEBwYXJhbSB7Q2hhcnR9IGNoYXJ0XG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZXNwYWNlXG4gKiBAcGFyYW0ge2twbHVzLlNlY3JldH0gc2VjcmV0IC0gc2VjcmV0IG9iamVjdCBmb3IgTVlTUUxfWFhYIGVudnNcbiAqIEBwYXJhbSB7c3RyaW5nfSBuYW1lXG4gKiBAcGFyYW0ge251bWJlcn0gcG9ydFxuICogQHBhcmFtIHtudW1iZXJ9IHN0b3JhZ2Ugc2l6ZSBvZiBkYXRhYmFzZSBpbiBnaWdhYnl0ZXNcbiAqXG4gKi9cbmZ1bmN0aW9uIG1hcmlhZGIoXG4gIGNoYXJ0OiBDaGFydCxcbiAgbmFtZXNwYWNlOiBzdHJpbmcsXG4gIHNlY3JldDoga3BsdXMuU2VjcmV0LFxuICBuYW1lOiBzdHJpbmcsXG4gIHBvcnQ6IG51bWJlcixcbiAgc3RvcmFnZTogbnVtYmVyLFxuKSB7XG4gIGNvbnN0IG1hcmlhZGJEZXBsb3ltZW50ID0gZ2V0UmF3RGVwbG95bWVudChjaGFydCwgbmFtZXNwYWNlLCBuYW1lLCAxKTtcbiAgY29uc3QgbWFyaWFkYkNvbnRhaW5lciA9IGdldE1hcmlhZGJDb250YWluZXIoXG4gICAgbWFyaWFkYkRlcGxveW1lbnQsXG4gICAgc2VjcmV0LFxuICAgIHBvcnQsXG4gICAgbmFtZSxcbiAgKTtcbiAgY29uc3QgZGJQdmMgPSBwdmMoY2hhcnQsIG5hbWVzcGFjZSwgJ21hcmlhZGItcHZjJywgc3RvcmFnZSk7XG4gIG1hcmlhZGJDb250YWluZXIubW91bnQoJy92YXIvbGliL215c3FsJywgZGJQdmMpO1xuICBnZXRTZXJ2aWNlKGNoYXJ0LCBuYW1lc3BhY2UsIG5hbWUsIG1hcmlhZGJEZXBsb3ltZW50LCBwb3J0KTtcbn1cblxuLyoqXG4gKiBDcmVhdGVzIGFsbCBtYW5pZmVzdHMgZm9yIHJlZGlzXG4gKlxuICogQHBhcmFtIHtDaGFydH0gY2hhcnRcbiAqIEBwYXJhbSB7c3RyaW5nfSBuYW1lc3BhY2VcbiAqIEBwYXJhbSB7c3RyaW5nfSBuYW1lXG4gKiBAcGFyYW0ge251bWJlcn0gcG9ydFxuICogQHBhcmFtIHtudW1iZXJ9IHJlcGxpY2FzXG4gKi9cbmZ1bmN0aW9uIHJlZGlzKFxuICBjaGFydDogQ2hhcnQsXG4gIG5hbWVzcGFjZTogc3RyaW5nLFxuICBuYW1lOiBzdHJpbmcsXG4gIHBvcnQ6IG51bWJlcixcbiAgcmVwbGljYXM6IG51bWJlcixcbikge1xuICBjb25zdCByZWRpc0RlcGxveW1lbnQgPSBnZXRSYXdEZXBsb3ltZW50KGNoYXJ0LCBuYW1lc3BhY2UsIG5hbWUsIHJlcGxpY2FzKTtcbiAgcmVkaXNEZXBsb3ltZW50LmFkZENvbnRhaW5lcih7XG4gICAgbmFtZTogbmFtZSxcbiAgICBpbWFnZTogJ3JlZGlzOmxhdGVzdCcsXG4gICAgcmVzb3VyY2VzOiB7fSxcbiAgICBwb3J0czogW3sgbnVtYmVyOiBwb3J0IH1dLFxuICAgIHNlY3VyaXR5Q29udGV4dDoge1xuICAgICAgZW5zdXJlTm9uUm9vdDogZmFsc2UsXG4gICAgfSxcbiAgfSk7XG4gIGdldFNlcnZpY2UoY2hhcnQsIG5hbWVzcGFjZSwgbmFtZSwgcmVkaXNEZXBsb3ltZW50LCBwb3J0KTtcbn1cblxuLyoqXG4gKiBDcmVhdGVzIGNsdXN0ZXIgaXNzdWVyXG4gKlxuICogQHBhcmFtIHtDaGFydH0gY2hhcnRcbiAqIEBwYXJhbSB7c3RyaW5nfSBjYSBhZGRyZXNzIG9mIGNhXG4gKiBAcGFyYW0ge3N0cmluZ30gZW1haWxcbiAqIEByZXR1cm5zIHtBcGlPYmplY3R9XG4gKi9cblxuZnVuY3Rpb24gYWRkQ2x1c3Rlcklzc3VlcihjaGFydDogQ2hhcnQsIGNhOiBzdHJpbmcsIGVtYWlsOiBzdHJpbmcpOiBBcGlPYmplY3Qge1xuICBjb25zdCBjbHVzdGVySXNzdWVyID0gbmV3IEFwaU9iamVjdChjaGFydCwgJ2NsdXN0ZXItaXNzdWVyJywge1xuICAgIGFwaVZlcnNpb246ICdjZXJ0LW1hbmFnZXIuaW8vdjEnLFxuICAgIGtpbmQ6ICdDbHVzdGVySXNzdWVyJyxcbiAgICBtZXRhZGF0YToge1xuICAgICAgbmFtZTogJ2FjbWUtaXNzdWVyJyxcbiAgICAgIG5hbWVzcGFjZTogJ2NlcnQtbWFuYWdlcicsXG4gICAgfSxcbiAgfSk7XG4gIGNsdXN0ZXJJc3N1ZXIuYWRkSnNvblBhdGNoKFxuICAgIEpzb25QYXRjaC5hZGQoJy9zcGVjJywge1xuICAgICAgYWNtZToge1xuICAgICAgICBlbWFpbDogZW1haWwsXG4gICAgICAgIHNlcnZlcjogY2EsXG4gICAgICAgIHByaXZhdGVLZXlTZWNyZXRSZWY6IHsgbmFtZTogJ3B2dGtleS1pc3N1ZXInIH0sXG4gICAgICAgIHNvbHZlcnM6IFtcbiAgICAgICAgICB7XG4gICAgICAgICAgICBodHRwMDE6IHtcbiAgICAgICAgICAgICAgaW5ncmVzczoge1xuICAgICAgICAgICAgICAgIGNsYXNzOiAndHJhZWZpaycsXG4gICAgICAgICAgICAgIH0sXG4gICAgICAgICAgICB9LFxuICAgICAgICAgIH0sXG4gICAgICAgIF0sXG4gICAgICB9LFxuICAgIH0pLFxuICApO1xuICByZXR1cm4gY2x1c3Rlcklzc3Vlcjtcbn1cblxuLyoqXG4gKiBDcmVhdGVzIGNlcnRpZmljYXRlXG4gKlxuICogQHBhcmFtIHtDaGFydH0gY2hhcnRcbiAqIEBwYXJhbSB7c3RyaW5nfSBuYW1lc3BhY2VcbiAqIEBwYXJhbSB7QXBpT2JqZWN0fSBjbHVzdGVySXNzdWVyXG4gKiBAcGFyYW0ge2twbHVzLlNlY3JldH0gdGxzU2VjcmV0XG4gKiBAcGFyYW0ge3N0cmluZ30gaG9zdFxuICovXG5mdW5jdGlvbiBjcmVhdGVDZXJ0aWZpY2F0ZShcbiAgY2hhcnQ6IENoYXJ0LFxuICBuYW1lc3BhY2U6IHN0cmluZyxcbiAgY2x1c3Rlcklzc3VlcjogQXBpT2JqZWN0LFxuICB0bHNTZWNyZXQ6IGtwbHVzLlNlY3JldCxcbiAgaG9zdDogc3RyaW5nLFxuKSB7XG4gIGNvbnN0IGNlcnRpID0gbmV3IEFwaU9iamVjdChjaGFydCwgJ2NlcnRpZmljYXRlJywge1xuICAgIGFwaVZlcnNpb246ICdjZXJ0LW1hbmFnZXIuaW8vdjEnLFxuICAgIGtpbmQ6ICdDZXJ0aWZpY2F0ZScsXG4gICAgbWV0YWRhdGE6IHtcbiAgICAgIG5hbWU6IGhvc3QsXG4gICAgICBuYW1lc3BhY2U6IG5hbWVzcGFjZSxcbiAgICB9LFxuICB9KTtcblxuICBjZXJ0aS5hZGRKc29uUGF0Y2goXG4gICAgSnNvblBhdGNoLmFkZCgnL3NwZWMnLCB7XG4gICAgICBzZWNyZXROYW1lOiB0bHNTZWNyZXQubmFtZSxcbiAgICAgIGlzc3VlclJlZjoge1xuICAgICAgICBuYW1lOiBjbHVzdGVySXNzdWVyLm5hbWUsXG4gICAgICAgIGtpbmQ6ICdDbHVzdGVySXNzdWVyJyxcbiAgICAgIH0sXG4gICAgICBkbnNOYW1lczogW2hvc3RdLFxuICAgIH0pLFxuICApO1xufVxuXG4vKipcbiAqIENyZWF0ZXMgaW5ncmVzcyBtYW5pZmVzdCBmb3IgbmV4dGNsb3VkXG4gKlxuICogQHBhcmFtIHtDaGFydH0gY2hhcnRcbiAqIEBwYXJhbSB7c3RyaW5nfSBuYW1lc3BhY2VcbiAqIEBwYXJhbSB7c3RyaW5nfSBwYXRoIC0gc3VmZml4IHBhdGggb2YgdXJsXG4gKiBAcGFyYW0ge2twbHVzLlNlcnZpY2V9IHNlcnZpY2UgLSBzZXJ2aWNlIHRvIGV4cG9zZVxuICogQHBhcmFtIHtzdHJpbmd9IGhvc3RcbiAqIEBwYXJhbSB7c3RyaW5nfSBjYSBhZGRyZXNzIG9mIGNhXG4gKiBAcGFyYW0ge3N0cmluZ30gZW1haWxcbiAqL1xuZnVuY3Rpb24gYWRkSW5ncmVzcyhcbiAgY2hhcnQ6IENoYXJ0LFxuICBuYW1lc3BhY2U6IHN0cmluZyxcbiAgcGF0aDogc3RyaW5nLFxuICBzZXJ2aWNlOiBrcGx1cy5TZXJ2aWNlLFxuICBob3N0OiBzdHJpbmcsXG4gIGNhOiBzdHJpbmcsXG4gIGVtYWlsOiBzdHJpbmcsXG4pIHtcbiAgY29uc3QgY2x1c3Rlcklzc3VlciA9IGFkZENsdXN0ZXJJc3N1ZXIoY2hhcnQsIGNhLCBlbWFpbCk7XG5cbiAgY29uc3QgdGxzU2VjcmV0ID0gbmV3IGtwbHVzLlNlY3JldChjaGFydCwgJ3Rscy1zZWNyZXQnLCB7XG4gICAgbWV0YWRhdGE6IHtcbiAgICAgIG5hbWVzcGFjZTogbmFtZXNwYWNlLFxuICAgIH0sXG4gICAgdHlwZTogJ2t1YmVybmV0ZXMuaW8vdGxzJyxcbiAgfSk7XG4gIGNyZWF0ZUNlcnRpZmljYXRlKGNoYXJ0LCBuYW1lc3BhY2UsIGNsdXN0ZXJJc3N1ZXIsIHRsc1NlY3JldCwgaG9zdCk7XG4gIG5ldyBrcGx1cy5JbmdyZXNzKGNoYXJ0LCAnaW5ncmVzcycsIHtcbiAgICBtZXRhZGF0YToge1xuICAgICAgbmFtZTogJ2luZ3Jlc3MnLFxuICAgICAgbmFtZXNwYWNlOiBuYW1lc3BhY2UsXG4gICAgfSxcbiAgICBydWxlczogW1xuICAgICAge1xuICAgICAgICBob3N0OiBob3N0LFxuICAgICAgICBwYXRoOiBwYXRoLFxuICAgICAgICBiYWNrZW5kOiBrcGx1cy5JbmdyZXNzQmFja2VuZC5mcm9tU2VydmljZShzZXJ2aWNlKSxcbiAgICAgIH0sXG4gICAgXSxcbiAgICB0bHM6IFtcbiAgICAgIHtcbiAgICAgICAgaG9zdHM6IFtob3N0XSxcbiAgICAgICAgc2VjcmV0OiB0bHNTZWNyZXQsXG4gICAgICB9LFxuICAgIF0sXG4gIH0pO1xufVxuXG4vKipcbiAqIENyZWF0ZXMgYWxsIG1hbmlmZXN0cyBmb3IgbmV4dGNsb3VkIGNvcmVcbiAqXG4gKiBAcGFyYW0ge0NoYXJ0fSBjaGFydFxuICogQHBhcmFtIHtzdHJpbmd9IG5hbWVzcGFjZVxuICogQHBhcmFtIHtrcGx1cy5TZWNyZXR9IHNlY3JldCAtIHNlY3JldCBvYmplY3QgdG8gYWNjZXNzIE1ZU1FMX1hYWCBlbnZzXG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZVxuICogQHBhcmFtIHtudW1iZXJ9IHBvcnRcbiAqIEBwYXJhbSB7bnVtYmVyfSBzdG9yYWdlIHN0b3JhZ2Ugc2l6ZSBvZiBuZXh0IGNsb3VkIGluIGdpZ2lieXRlc1xuICogQHBhcmFtIHtzdHJpbmdbXX0gZGJfc2VjcmV0X2tleXMgbGlzdCBvZiBzZWNyZXRzIGtleVxuICogQHBhcmFtIHtzdHJpbmd9IHJlZGlzX2hvc3QgdXJsIG9mIHJlZGlzXG4gKiBAcGFyYW0ge3N0cmluZ30gYWRtaW5fdXNlciBhZG1pbiB1c2VybmFtZVxuICogQHBhcmFtIHtzdHJpbmd9IGRiX2hvc3QgdXJsIG9mIGRhdGFiYXNlXG4gKiBAcGFyYW0ge3N0cmluZ30gaG9zdCBhZGRyZXNzIG9mIGhvc3RcbiAqIEBwYXJhbSB7c3RyaW5nfSBjYSBhZGRyZXNzIG9mIGNhXG4gKiBAcGFyYW0ge3N0cmluZ30gZW1haWwgZW1haWwgZm9yIGNlcml0aWZjYXN0ZVxuICovXG5mdW5jdGlvbiBuZXh0Q2xvdWQoXG4gIGNoYXJ0OiBDaGFydCxcbiAgbmFtZXNwYWNlOiBzdHJpbmcsXG4gIHNlY3JldDoga3BsdXMuU2VjcmV0LFxuICBuYW1lOiBzdHJpbmcsXG4gIHBvcnQ6IG51bWJlcixcbiAgc3RvcmFnZTogbnVtYmVyLFxuICBkYl9zZWNyZXRfa2V5czogc3RyaW5nW10sXG4gIHJlZGlzX2hvc3Q6IHN0cmluZyxcbiAgYWRtaW5fdXNlcjogc3RyaW5nLFxuICBkYl9ob3N0OiBzdHJpbmcsXG4gIGhvc3Q6IHN0cmluZyxcbiAgY2E6IHN0cmluZyxcbiAgZW1haWw6IHN0cmluZyxcbikge1xuICBjb25zdCBuZXh0Q2xvdWRlRGVwbG95bWVudCA9IGdldFJhd0RlcGxveW1lbnQoY2hhcnQsIG5hbWVzcGFjZSwgbmFtZSwgMSk7XG4gIGNvbnN0IG5leHRDbG91ZENvbnRhaW5lciA9IGdldE5leHRDbG91ZENvbnRhaW5lcihcbiAgICBuZXh0Q2xvdWRlRGVwbG95bWVudCxcbiAgICBzZWNyZXQsXG4gICAgbmFtZSxcbiAgICBwb3J0LFxuICAgIGRiX3NlY3JldF9rZXlzLFxuICAgIHJlZGlzX2hvc3QsXG4gICAgYWRtaW5fdXNlcixcbiAgICBkYl9ob3N0LFxuICAgIGhvc3QsXG4gICk7XG4gIGNvbnN0IG5leHRDbG91ZFB2YyA9IHB2YyhjaGFydCwgbmFtZXNwYWNlLCAnbmV4dGNsb3VkLXB2YycsIHN0b3JhZ2UpO1xuICBuZXh0Q2xvdWRDb250YWluZXIubW91bnQoJy92YXIvd3d3L2h0bWwnLCBuZXh0Q2xvdWRQdmMpO1xuICBjb25zdCBuZXh0Q2xvdWRTZXJ2aWNlID0gZ2V0U2VydmljZShcbiAgICBjaGFydCxcbiAgICBuYW1lc3BhY2UsXG4gICAgbmFtZSxcbiAgICBuZXh0Q2xvdWRlRGVwbG95bWVudCxcbiAgICBwb3J0LFxuICApO1xuXG4gIGFkZEluZ3Jlc3MoY2hhcnQsIG5hbWVzcGFjZSwgJy8nLCBuZXh0Q2xvdWRTZXJ2aWNlLCBob3N0LCBjYSwgZW1haWwpO1xufVxuXG4vKipcbiAqIENyZWF0ZXMgY29udGFpbmVyIGZvciBuZXh0Y2xvdWRcbiAqXG4gKiBAcGFyYW0ge2twbHVzLkRlcGxveW1lbnR9IGRlcGxveW1lbnQgLSBkZXBseW9tZW50IG9iamVjdCBmb3IgbmV4dGNsb3VkXG4gKiBAcGFyYW0ge2twbHVzLlNlY3JldH0gc2VjcmV0XG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZVxuICogQHBhcmFtIHtudW1iZXJ9IHBvcnRcbiAqIEBwYXJhbSB7c3RyaW5nW119IGRiX3NlY3JldF9rZXlzIGxpc3Qgb2Ygc2VjcmV0cyBrZXlcbiAqIEBwYXJhbSB7c3RyaW5nfSByZWRpc19ob3N0IHVybCBvZiByZWRpc1xuICogQHBhcmFtIHtzdHJpbmd9IGFkbWluX3VzZXIgYWRtaW4gdXNlcm5hbWVcbiAqIEBwYXJhbSB7c3RyaW5nfSBkYl9ob3N0IHVybCBvZiBkYXRhYmFzZVxuICogQHBhcmFtIHtzdHJpbmd9IGhvc3QgYWRkcmVzcyBvZiBob3N0XG4gKlxuICogQHJldHVybnMge2twbHVzLkNvbnRhaW5lcn1cbiAqL1xuZnVuY3Rpb24gZ2V0TmV4dENsb3VkQ29udGFpbmVyKFxuICBkZXBsb3ltZW50OiBrcGx1cy5EZXBsb3ltZW50LFxuICBzZWNyZXQ6IGtwbHVzLlNlY3JldCxcbiAgbmFtZTogc3RyaW5nLFxuICBwb3J0OiBudW1iZXIsXG4gIGRiX3NlY3JldF9rZXlzOiBzdHJpbmdbXSxcbiAgcmVkaXNfaG9zdDogc3RyaW5nLFxuICBhZG1pbl91c2VyOiBzdHJpbmcsXG4gIGRiX2hvc3Q6IHN0cmluZyxcbiAgaG9zdDogc3RyaW5nLFxuKToga3BsdXMuQ29udGFpbmVyIHtcbiAgY29uc3QgbmV4dENsb3VkQ29udGFpbmVyID0gZGVwbG95bWVudC5hZGRDb250YWluZXIoe1xuICAgIG5hbWU6IG5hbWUsXG4gICAgaW1hZ2U6ICduZXh0Y2xvdWQ6YXBhY2hlJyxcbiAgICByZXNvdXJjZXM6IHt9LFxuICAgIHBvcnRzOiBbeyBudW1iZXI6IHBvcnQgfV0sXG4gICAgc2VjdXJpdHlDb250ZXh0OiB7XG4gICAgICBlbnN1cmVOb25Sb290OiBmYWxzZSxcbiAgICAgIHJlYWRPbmx5Um9vdEZpbGVzeXN0ZW06IGZhbHNlLFxuICAgIH0sXG4gIH0pO1xuICBkYl9zZWNyZXRfa2V5cy5mb3JFYWNoKChrZXkpID0+IHtcbiAgICBjb25zdCB2YWx1ZSA9IGtwbHVzLkVudlZhbHVlLmZyb21TZWNyZXRWYWx1ZSh7XG4gICAgICBzZWNyZXQ6IHNlY3JldCxcbiAgICAgIGtleToga2V5LFxuICAgIH0pO1xuICAgIG5leHRDbG91ZENvbnRhaW5lci5lbnYuYWRkVmFyaWFibGUoa2V5LCB2YWx1ZSk7XG4gIH0pO1xuICBjb25zdCBlbnYgPSB7XG4gICAgUkVESVNfSE9TVDogcmVkaXNfaG9zdCxcbiAgICAvLyBSRURJU19IT1NUX1BBU1NXT1JEOiBcIlwiLFxuICAgIE5FWFRDTE9VRF9BRE1JTl9VU0VSOiBhZG1pbl91c2VyLFxuICAgIE1ZU1FMX0hPU1Q6IGRiX2hvc3QsXG4gICAgTkVYVENMT1VEX1RSVVNURURfRE9NQUlOUzogaG9zdCxcbiAgfTtcbiAgT2JqZWN0LmVudHJpZXMoZW52KS5mb3JFYWNoKChba2V5LCB2YWx1ZV0pID0+IHtcbiAgICBuZXh0Q2xvdWRDb250YWluZXIuZW52LmFkZFZhcmlhYmxlKGtleSwga3BsdXMuRW52VmFsdWUuZnJvbVZhbHVlKHZhbHVlKSk7XG4gIH0pO1xuICBuZXh0Q2xvdWRDb250YWluZXIuZW52LmFkZFZhcmlhYmxlKFxuICAgICdORVhUQ0xPVURfQURNSU5fUEFTU1dPUkQnLFxuICAgIGtwbHVzLkVudlZhbHVlLmZyb21TZWNyZXRWYWx1ZSh7XG4gICAgICBzZWNyZXQ6IHNlY3JldCxcbiAgICAgIGtleTogJ01ZU1FMX1BBU1NXT1JEJywgLy8vIGp1c3QgZm9yIHRlc3RpbmdcbiAgICB9KSxcbiAgKTtcbiAgcmV0dXJuIG5leHRDbG91ZENvbnRhaW5lcjtcbn1cblxuLyoqXG4gKiBJbnN0YWxsIHRyYWVmaWsgdXNpbmcgaGVsbVxuICovXG5mdW5jdGlvbiBhZGRUcmFlZmlrKGNoYXJ0OiBDaGFydCkge1xuICBuZXcgSGVsbShjaGFydCwgJ3RyYWVmaWsnLCB7XG4gICAgcmVsZWFzZU5hbWU6ICd0cmFlZmlrJyxcbiAgICBjaGFydDogJ3RyYWVmaWsvdHJhZWZpaycsXG4gICAgdmFsdWVzOiB7XG4gICAgICBhZGRpdGlvbmFsQXJndW1lbnRzOiBbXG4gICAgICAgICctLXNlcnZlcnNUcmFuc3BvcnQuaW5zZWN1cmVTa2lwVmVyaWZ5PXRydWUnLFxuICAgICAgICAnLS1sb2cubGV2ZWw9REVCVUcnLFxuICAgICAgICAnLS1tZXRyaWNzLnByb21ldGhldXM9dHJ1ZScsXG4gICAgICBdLFxuICAgICAgZGVwbG95bWVudDoge1xuICAgICAgICBhZGRpdGlvbmFsQ29udGFpbmVyczogW10sXG4gICAgICAgIGFubm90YXRpb25zOiB7fSxcbiAgICAgICAgZW5hYmxlZDogdHJ1ZSxcbiAgICAgICAgaW5pdENvbnRhaW5lcnM6IFtdLFxuICAgICAgICBwb2RBbm5vdGF0aW9uczoge30sXG4gICAgICAgIHJlcGxpY2FzOiAxLFxuICAgICAgfSxcbiAgICAgIGdsb2JhbEFyZ3VtZW50czogW1xuICAgICAgICAnLS1nbG9iYWwuc2VuZGFub255bW91c3VzYWdlPWZhbHNlJyxcbiAgICAgICAgJy0tZ2xvYmFsLmNoZWNrbmV3dmVyc2lvbj1mYWxzZScsXG4gICAgICBdLFxuICAgICAgaW5ncmVzc1JvdXRlOiB7IGRhc2hib2FyZDogeyBlbmFibGVkOiBmYWxzZSB9IH0sXG4gICAgICBwb3J0czoge1xuICAgICAgICB3ZWI6IHsgcmVkaXJlY3RUbzogJ3dlYnNlY3VyZScgfSxcbiAgICAgICAgd2Vic2VjdXJlOiB7IHRsczogeyBlbmFibGVkOiB0cnVlIH0gfSxcbiAgICAgICAgbWV0cmljczoge1xuICAgICAgICAgIHBvcnQ6IDkxMDAsXG4gICAgICAgICAgZXhwb3NlOiBmYWxzZSxcbiAgICAgICAgICBleHBvc2VkUG9ydDogOTEwMCxcbiAgICAgICAgICBwcm90b2NvbDogJ1RDUCcsXG4gICAgICAgIH0sXG4gICAgICB9LFxuICAgICAgaHViOiB7XG4gICAgICAgIGVuYWJsZWQ6IHRydWUsXG4gICAgICB9LFxuICAgICAgbWV0cmljczoge1xuICAgICAgICBwcm9tZXRoZXVzOiB7XG4gICAgICAgICAgZW50cnlQb2ludDogJ21ldHJpY3MnLFxuICAgICAgICAgIGFkZFJvdXRlcnNMYWJlbHM6IHRydWUsXG4gICAgICAgICAgYWRkU2VydmljZXNMYWJlbHM6IHRydWUsXG4gICAgICAgIH0sXG4gICAgICB9LFxuICAgICAgcHJvdmlkZXJzOiB7XG4gICAgICAgIGt1YmVybmV0ZXNDUkQ6IHtcbiAgICAgICAgICBhbGxvd0V4dGVybmFsTmFtZVNlcnZpY2VzOiB0cnVlLFxuICAgICAgICAgIGVuYWJsZWQ6IHRydWUsXG4gICAgICAgICAgaW5ncmVzc0NsYXNzOiAndHJhZWZpay1leHRlcm5hbCcsXG4gICAgICAgIH0sXG4gICAgICAgIGt1YmVybmV0ZXNJbmdyZXNzOiB7XG4gICAgICAgICAgYWxsb3dFeHRlcm5hbE5hbWVTZXJ2aWNlczogdHJ1ZSxcbiAgICAgICAgICBlbmFibGVkOiB0cnVlLFxuICAgICAgICAgIHB1Ymxpc2hlZFNlcnZpY2U6IHsgZW5hYmxlZDogZmFsc2UgfSxcbiAgICAgICAgfSxcbiAgICAgIH0sXG4gICAgICByYmFjOiB7IGVuYWJsZWQ6IHRydWUgfSxcbiAgICAgIHNlcnZpY2U6IHtcbiAgICAgICAgYW5ub3RhdGlvbnM6IHt9LFxuICAgICAgICBlbmFibGVkOiB0cnVlLFxuICAgICAgICBleHRlcm5hbElQczogW10sXG4gICAgICAgIGxhYmVsczoge30sXG4gICAgICAgIGxvYWRCYWxhbmNlclNvdXJjZVJhbmdlczogW10sXG4gICAgICAgIHR5cGU6ICdMb2FkQmFsYW5jZXInLFxuICAgICAgfSxcbiAgICB9LFxuICB9KTtcbn1cblxuLyoqXG4gKiBBZGQgY2VydC1tYW5hZ2VyIHVzaW5nIGhlbG1cbiAqL1xuZnVuY3Rpb24gYWRkQ2VydE1hbmFnZXIoY2hhcnQ6IENoYXJ0KSB7XG4gIG5ldyBIZWxtKGNoYXJ0LCAnY2VydC1tYW5hZ2VyJywge1xuICAgIHJlbGVhc2VOYW1lOiAnY2VydC1tYW5hZ2VyJyxcbiAgICBuYW1lc3BhY2U6ICdjZXJ0LW1hbmFnZXInLFxuICAgIHZlcnNpb246ICd2MS45LjEnLFxuICAgIGNoYXJ0OiAnamV0c3RhY2svY2VydC1tYW5hZ2VyJyxcbiAgICB2YWx1ZXM6IHtcbiAgICAgIGV4dHJhQXJnczogW1xuICAgICAgICAnLS1kbnMwMS1yZWN1cnNpdmUtbmFtZXNlcnZlcnM9MS4xLjEuMTo1Myw5LjkuOS45OjUzJyxcbiAgICAgICAgJy0tZG5zMDEtcmVjdXJzaXZlLW5hbWVzZXJ2ZXJzLW9ubHknLFxuICAgICAgXSxcbiAgICAgIGluc3RhbGxDUkRzOiBmYWxzZSxcbiAgICAgIHBvZERuc0NvbmZpZzogeyBuYW1lc2VydmVyczogWycxLjEuMS4xJywgJzkuOS45LjknXSB9LFxuICAgICAgcG9kRG5zUG9saWN5OiAnTm9uZScsXG4gICAgICByZXBsaWNhQ291bnQ6IDEsXG4gICAgfSxcbiAgfSk7XG59XG5cbi8qKlxuICogQ3JlYXRlIHZpY3RvcmlhXG4gKlxuICogQHBhcmFtIHtDaGFydH0gY2hhcnRcbiAqIEBwYXJhbSB7c3RyaW5nfSBuYW1lc3BhY2VcbiAqIEBwYXJhbSB7c3RyaW5nfSBuYW1lXG4gKiBAcGFyYW0ge251bWJlcn0gcG9ydCBwb3J0IG9mIHZpY3RvcmlhXG4gKiBAcGFyYW0ge3N0cmluZ30gcHJvbV9maWxlX3BhdGggcGF0aCB0byBzdG9yZSBwcm9tZXRoZXVzIGNvbmZpZyBmaWxlXG4gKiBAcGFyYW0ge3N0cmluZ30gcHJvbV9jb25maWdfbmFtZSBuYW1lIG9mIHByb21ldGhldXMgY29uZmlnIGZpbGVcbiAqIEBwYXJhbSB7c3RyaW5nfSBjb25maWdfcGF0aCBwYXRoIHRvIHByb21ldGhldXMgY29uZmlnIGZpbGVcbiAqIEBwYXJhbSB7bnVtYmVyfSBzdG9yYWdlIHNpemUgb2Ygc3RvcmFnZSBpbiBnaWdhYnl0ZXNcbiAqL1xuZnVuY3Rpb24gdmljdG9yaWFNZXRyaWNzKFxuICBjaGFydDogQ2hhcnQsXG4gIG5hbWVzcGFjZTogc3RyaW5nLFxuICBuYW1lOiBzdHJpbmcsXG4gIHBvcnQ6IG51bWJlcixcbiAgcHJvbV9maWxlX3BhdGg6IHN0cmluZyxcbiAgcHJvbV9jb25maWdfbmFtZTogc3RyaW5nLFxuICBjb25maWdfcGF0aDogc3RyaW5nLFxuICBzdG9yYWdlOiBudW1iZXIsXG4pIHtcbiAgY29uc3QgZGVwbG95bWVudCA9IGdldFJhd0RlcGxveW1lbnQoY2hhcnQsIG5hbWVzcGFjZSwgbmFtZSwgMSk7XG4gIGNvbnN0IGNvbnRhaW5lciA9IGRlcGxveW1lbnQuYWRkQ29udGFpbmVyKHtcbiAgICBuYW1lOiBuYW1lLFxuICAgIGltYWdlOiAndmljdG9yaWFtZXRyaWNzL3ZpY3RvcmlhLW1ldHJpY3M6bGF0ZXN0JyxcbiAgICByZXNvdXJjZXM6IHt9LFxuICAgIHBvcnRzOiBbeyBudW1iZXI6IHBvcnQgfV0sXG4gICAgc2VjdXJpdHlDb250ZXh0OiB7XG4gICAgICBlbnN1cmVOb25Sb290OiBmYWxzZSxcbiAgICB9LFxuICAgIGFyZ3M6IFsnLXByb21zY3JhcGUuY29uZmlnPScuY29uY2F0KHByb21fZmlsZV9wYXRoLCBwcm9tX2NvbmZpZ19uYW1lKV0sXG4gIH0pO1xuXG4gIGNvbnN0IGNvbmZpZyA9IG5ldyBrcGx1cy5Db25maWdNYXAoY2hhcnQsICd2aWMtY29uZmlnJywge1xuICAgIG1ldGFkYXRhOiB7XG4gICAgICBuYW1lOiBuYW1lLFxuICAgICAgbmFtZXNwYWNlOiBuYW1lc3BhY2UsXG4gICAgfSxcbiAgfSk7XG4gIGNvbmZpZy5hZGRGaWxlKGpvaW4oWUFNTFNfUEFUSCwgY29uZmlnX3BhdGgpLCBwcm9tX2NvbmZpZ19uYW1lKTtcbiAgY29uc3Qgdm9sdW1lID0ga3BsdXMuVm9sdW1lLmZyb21Db25maWdNYXAoY2hhcnQsICdDb25maWdNYXAnLCBjb25maWcpO1xuICBjb250YWluZXIubW91bnQocHJvbV9maWxlX3BhdGgsIHZvbHVtZSk7XG5cbiAgY29uc3Qgdm12YyA9IHB2YyhjaGFydCwgbmFtZXNwYWNlLCAndmljdG9yaWEtcHZjJywgc3RvcmFnZSk7XG4gIGNvbnRhaW5lci5tb3VudCgnL3ZpY3RvcmlhLW1ldHJpY3MtZGF0YScsIHZtdmMpO1xuICBnZXRTZXJ2aWNlKGNoYXJ0LCBuYW1lc3BhY2UsIG5hbWUsIGRlcGxveW1lbnQsIHBvcnQpO1xufVxuXG4vKipcbiAqIENyZWF0ZSBnYXJhZmFuXG4gKlxuICogQHBhcmFtIHtDaGFydH0gY2hhcnRcbiAqIEBwYXJhbSB7c3R0cmluZ30gbmFtZXNwYWNlXG4gKiBAcGFyYW0ge3N0cmluZ30gbmFtZSBuYW1lIG9mIGdyYWZhbmFcbiAqIEBwYXJhbSB7bnVtYmVyfSBwb3J0IHBvcnQgb2YgZ3JhZmFuYVxuICogQHBhcmFtIHtudW1iZXJ9IHN0b3JhZ2Ugc2l6ZSBvZiBncmFmYW5hIHN0b3JhZ2UgaW4gZ2lnYWJ5dGVzXG4gKi9cbmZ1bmN0aW9uIGdyYWZhbmEoXG4gIGNoYXJ0OiBDaGFydCxcbiAgbmFtZXNwYWNlOiBzdHJpbmcsXG4gIG5hbWU6IHN0cmluZyxcbiAgcG9ydDogbnVtYmVyLFxuICBzdG9yYWdlOiBudW1iZXIsXG4pIHtcbiAgY29uc3QgZGVwbG95bWVudCA9IGdldFJhd0RlcGxveW1lbnQoY2hhcnQsIG5hbWVzcGFjZSwgbmFtZSwgMSk7XG4gIGNvbnN0IHB2Y0dyYWZhbmEgPSBwdmMoY2hhcnQsIG5hbWVzcGFjZSwgJ3ZvbEdyYWZhbmEnLCBzdG9yYWdlKTtcbiAgY29uc3QgaW5pdENvbnRhaW5lciA9IGRlcGxveW1lbnQuYWRkSW5pdENvbnRhaW5lcih7XG4gICAgbmFtZTogJ2Nob3duJyxcbiAgICBpbWFnZTogJ2J1c3lib3g6bGF0ZXN0JyxcbiAgICByZXNvdXJjZXM6IHt9LFxuICAgIHNlY3VyaXR5Q29udGV4dDoge1xuICAgICAgZW5zdXJlTm9uUm9vdDogZmFsc2UsXG4gICAgICByZWFkT25seVJvb3RGaWxlc3lzdGVtOiBmYWxzZSxcbiAgICB9LFxuICAgIGNvbW1hbmQ6IFsnY2hvd24nLCAnLVInLCAnNDcyOjQ3MicsICcvdmFyL2xpYi9ncmFmYW5hJ10sXG4gIH0pO1xuXG4gIGluaXRDb250YWluZXIubW91bnQoJy92YXIvbGliL2dyYWZhbmEnLCBwdmNHcmFmYW5hKTtcblxuICBjb25zdCBjb250YWluZXIgPSBkZXBsb3ltZW50LmFkZENvbnRhaW5lcih7XG4gICAgbmFtZTogbmFtZSxcbiAgICBpbWFnZTogJ2dyYWZhbmEvZ3JhZmFuYTpsYXRlc3QnLFxuICAgIHJlc291cmNlczoge30sXG4gICAgcG9ydHM6IFt7IG51bWJlcjogcG9ydCB9XSxcbiAgICBzZWN1cml0eUNvbnRleHQ6IHtcbiAgICAgIGVuc3VyZU5vblJvb3Q6IGZhbHNlLFxuICAgICAgcmVhZE9ubHlSb290RmlsZXN5c3RlbTogZmFsc2UsXG4gICAgfSxcbiAgfSk7XG4gIGNvbnRhaW5lci5tb3VudCgnL3Zhci9saWIvZ3JhZmFuYScsIHB2Y0dyYWZhbmEpO1xuICBnZXRTZXJ2aWNlKGNoYXJ0LCBuYW1lc3BhY2UsIG5hbWUsIGRlcGxveW1lbnQsIHBvcnQpO1xufVxuXG5mdW5jdGlvbiBjcmVhdGVOYW1lc3BhY2UoY2hhcnQ6IENoYXJ0LCBuYW1lOiBzdHJpbmcpIHtcbiAgbmV3IGtwbHVzLk5hbWVzcGFjZShjaGFydCwgbmFtZS5jb25jYXQoJy1ucycpLCB7XG4gICAgbWV0YWRhdGE6IHtcbiAgICAgIG5hbWU6IG5hbWUsXG4gICAgfSxcbiAgfSk7XG59XG5cbmV4cG9ydCBjbGFzcyBOZXh0Q2xvdWQgZXh0ZW5kcyBDaGFydCB7XG4gIGNvbnN0cnVjdG9yKHNjb3BlOiBDb25zdHJ1Y3QsIGlkOiBzdHJpbmcsIHByb3BzOiBDaGFydFByb3BzID0ge30pIHtcbiAgICBzdXBlcihzY29wZSwgaWQsIHByb3BzKTtcblxuICAgIGNvbnN0IGNvbmZpZ0ZpbGUgPSByZWFkRmlsZVN5bmMoQ09ORklHX1BBVEgsIEZJTEVTX0VOQ09ESU5HKTtcbiAgICBjb25zdCBjb25maWcgPSBwYXJzZShjb25maWdGaWxlKTtcblxuICAgIGNvbnN0IE1BUklBREIgPSBjb25maWcuZGIubmFtZTtcbiAgICBjb25zdCBEQl9QT1JUID0gY29uZmlnLmRiLnBvcnQ7XG4gICAgY29uc3QgREJfU1RPUkFHRSA9IGNvbmZpZy5kYi5zdG9yYWdlO1xuICAgIGNvbnN0IFJFRElTID0gY29uZmlnLnJlZGlzLm5hbWU7XG4gICAgY29uc3QgUkVESVNfUE9SVCA9IGNvbmZpZy5yZWRpcy5wb3J0O1xuICAgIGNvbnN0IFJFRElTX1JFUExJQ0FTID0gY29uZmlnLnJlZGlzLnJlcGxpY2FzO1xuICAgIGNvbnN0IE5FWFRfQ0xPVUQgPSBjb25maWcubmV4dGNsb3VkLm5hbWU7XG4gICAgY29uc3QgTkVYVENMT1VEX1BPUlQgPSBjb25maWcubmV4dGNsb3VkLnBvcnQ7XG4gICAgY29uc3QgTkJFWFRDTE9VRF9TVE9SQUdFID0gY29uZmlnLm5leHRjbG91ZC5zdG9yYWdlO1xuICAgIGNvbnN0IEFERF9UUkFFRklLID0gY29uZmlnLmhlbG0udHJhZWlmaztcbiAgICBjb25zdCBBRERfQ0VSVF9NQU5BR0VSID0gY29uZmlnLmhlbG0uY2VydF9tYW5hZ2VyO1xuICAgIGNvbnN0IEhPU1QgPSBjb25maWcubmV0d29yay5ob3N0O1xuICAgIGNvbnN0IFNUQUdJTkcgPSBjb25maWcubmV0d29yay5zdGFnaW5nO1xuICAgIGNvbnN0IFBST0RVQ1RJT05fVExTID0gY29uZmlnLm5ldHdvcmsucHJvZHVjdGlvbl90bHM7XG4gICAgY29uc3QgU1RBR0lOR19UTFMgPSBjb25maWcubmV0d29yay5zdGFnaW5nX3RscztcbiAgICBjb25zdCBFTUFJTF9UTFMgPSBjb25maWcubmV0d29yay5lbWFpbF90bHM7XG4gICAgY29uc3QgREFUQUJBU0VfQ1JFREVOVElBTFNfUEFUSCA9IGpvaW4oXG4gICAgICBZQU1MU19QQVRILFxuICAgICAgY29uZmlnLmRhdGFiYXNlX2NyZWRlbnRpYWxzX3BhdGgsXG4gICAgKTtcbiAgICBjb25zdCBHUkFGQU5BID0gY29uZmlnLmdyYWZhbmEubmFtZTtcbiAgICBjb25zdCBHUkFGQU5BX1BPUlQgPSBjb25maWcuZ3JhZmFuYS5wb3J0O1xuICAgIGNvbnN0IEdSQUZBTkFfU1RPUkFHRSA9IGNvbmZpZy5ncmFmYW5hLnN0b3JhZ2U7XG4gICAgY29uc3QgdmljY29uID0gY29uZmlnLnZpY3RvcmlhO1xuICAgIGNvbnN0IFZJQ1RPUklBID0gdmljY29uLm5hbWU7XG4gICAgY29uc3QgVklDVE9SSUFfUE9SVCA9IHZpY2Nvbi5wb3J0O1xuICAgIGNvbnN0IFZJQ1RPUklBX0NPTkZJR19QQVRIID0gdmljY29uLmNvbmZpZ19maWxlO1xuICAgIGNvbnN0IFBST01fRklMRV9QQVRIID0gdmljY29uLnByb21fcGF0aDtcbiAgICBjb25zdCBQUk9NX0NPTkZJR19OQU1FID0gdmljY29uLnByb21fY29uZmlnX25hbWU7XG4gICAgY29uc3QgVklDVE9SSUFfU1RPUkFHRSA9IHZpY2Nvbi5zdG9yYWdlO1xuXG4gICAgY29uc3QgTlNfTUFJTiA9IGNvbmZpZy5uYW1lc3BhY2UubWFpbjtcbiAgICBjb25zdCBOU19NRVRSSUNTID0gY29uZmlnLm5hbWVzcGFjZS5tZXRyaWNzO1xuXG4gICAgY3JlYXRlTmFtZXNwYWNlKHRoaXMsIE5TX01BSU4pO1xuICAgIGNyZWF0ZU5hbWVzcGFjZSh0aGlzLCBOU19NRVRSSUNTKTtcblxuICAgIGlmIChBRERfVFJBRUZJSykgYWRkVHJhZWZpayh0aGlzKTtcbiAgICBpZiAoQUREX0NFUlRfTUFOQUdFUikgYWRkQ2VydE1hbmFnZXIodGhpcyk7XG5cbiAgICBjb25zdCBzZWNyZXQgPSBnZXRTZWNyZXQodGhpcywgTlNfTUFJTiwgREFUQUJBU0VfQ1JFREVOVElBTFNfUEFUSCk7XG4gICAgbWFyaWFkYih0aGlzLCBOU19NQUlOLCBzZWNyZXQsIE1BUklBREIsIERCX1BPUlQsIERCX1NUT1JBR0UpO1xuICAgIHJlZGlzKHRoaXMsIE5TX01BSU4sIFJFRElTLCBSRURJU19QT1JULCBSRURJU19SRVBMSUNBUyk7XG4gICAgbmV4dENsb3VkKFxuICAgICAgdGhpcyxcbiAgICAgIE5TX01BSU4sXG4gICAgICBzZWNyZXQsXG4gICAgICBORVhUX0NMT1VELFxuICAgICAgTkVYVENMT1VEX1BPUlQsXG4gICAgICBOQkVYVENMT1VEX1NUT1JBR0UsXG4gICAgICBkYlNlY3JldEtleXMsXG4gICAgICBSRURJUyxcbiAgICAgICdhZG1pbicsXG4gICAgICBNQVJJQURCLFxuICAgICAgSE9TVCxcbiAgICAgIFtQUk9EVUNUSU9OX1RMUywgU1RBR0lOR19UTFNdW051bWJlcihTVEFHSU5HKV0sXG4gICAgICBFTUFJTF9UTFMsXG4gICAgKTtcbiAgICB2aWN0b3JpYU1ldHJpY3MoXG4gICAgICB0aGlzLFxuICAgICAgTlNfTUVUUklDUyxcbiAgICAgIFZJQ1RPUklBLFxuICAgICAgVklDVE9SSUFfUE9SVCxcbiAgICAgIFBST01fRklMRV9QQVRILFxuICAgICAgUFJPTV9DT05GSUdfTkFNRSxcbiAgICAgIFZJQ1RPUklBX0NPTkZJR19QQVRILFxuICAgICAgVklDVE9SSUFfU1RPUkFHRSxcbiAgICApO1xuICAgIGdyYWZhbmEodGhpcywgTlNfTUVUUklDUywgR1JBRkFOQSwgR1JBRkFOQV9QT1JULCBHUkFGQU5BX1NUT1JBR0UpO1xuICB9XG59XG5cbmNvbnN0IGFwcCA9IG5ldyBBcHAoKTtcbm5ldyBOZXh0Q2xvdWQoYXBwLCAnbmV4dGNsb3VkJyk7XG5hcHAuc3ludGgoKTtcbiJdfQ==