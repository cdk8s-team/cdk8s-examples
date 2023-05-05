package com.example.webcachedb;

import org.cdk8s.Duration;
import org.cdk8s.plus26.*;
import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebCacheDB extends Chart {

        public WebCacheDB(final Construct scope, final String id) {
                this(scope, id, null);
        }

        public WebCacheDB(final Construct scope, final String id, final ChartProps props) {
                super(scope, id, props);

                LabeledNode storageNodes = Node.labeled(NodeLabelQuery.is("optimized", "storage"));
                LabeledNode memoryNodes = Node.labeled(NodeLabelQuery.is("optimized", "memory"));

                StatefulSet db = new StatefulSet(this, "DB", StatefulSetProps.builder()
                                .containers(List.of(ContainerProps.builder()
                                                .image("db")
                                                .portNumber(8000)
                                                .build()))
                                .replicas(2)
                                .spread(true)
                                .isolate(true)
                                .build());
                db.getScheduling().attract(storageNodes);

                Map<String, EnvValue> cacheEnv = new HashMap<>();
                cacheEnv.put("DB_HOST", EnvValue.fromValue(db.getService().getName()));
                cacheEnv.put("DB_PORT", EnvValue.fromValue(db.getService().getPort().toString()));
                Deployment cache = new Deployment(this, "Cache", DeploymentProps.builder()
                                .containers(List.of(ContainerProps.builder()
                                                .image("'cache'")
                                                .portNumber(7000)
                                                .envVariables(cacheEnv)
                                                .build()))
                                .replicas(2)
                                .spread(true)
                                .isolate(true)
                                .build());
                cache.getScheduling().attract(memoryNodes);

                Service cacheService = cache.exposeViaService();

                Map<String, EnvValue> webEnv = new HashMap<>();
                cacheEnv.put("CACHE_HOST", EnvValue.fromValue(cacheService.getName()));
                cacheEnv.put("CACHE_PORT", EnvValue.fromValue(cacheService.getPort().toString()));

                Deployment web = new Deployment(this, "Web", DeploymentProps.builder()
                                .containers(List.of(ContainerProps.builder()
                                                .image("web")
                                                .portNumber(6000)
                                                .envVariables(webEnv)
                                                .build()))
                                .replicas(2)
                                .spread(true)
                                .isolate(true)
                                .build());
                web.getScheduling().attract(memoryNodes);
                web.getScheduling().colocate(cache);

                web.getConnections().allowTo(cache);
                cache.getConnections().allowTo(db);

                Group frontoffice = Group.fromName(this, "FOGroup", "frontoffice");

                web.getPermissions().grantReadWrite(frontoffice);
                db.getPermissions().grantReadWrite(frontoffice);
                cache.getPermissions().grantReadWrite(frontoffice);

                web.exposeViaService(DeploymentExposeViaServiceOptions.builder()
                                .serviceType(ServiceType.LOAD_BALANCER).build());
        }

        public static void main(String[] args) {

                final App app = new App();
                new WebCacheDB(app, "web-cache-db");
                app.synth();

        }
}