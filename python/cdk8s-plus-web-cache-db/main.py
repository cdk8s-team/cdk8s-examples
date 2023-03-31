#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart

import cdk8s_plus_26 as kplus


class WebCacheDB(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        storage_nodes = kplus.Node.labeled(
            kplus.NodeLabelQuery.is_("optimized", "storage")
        )
        memory_nodes = kplus.Node.labeled(
            kplus.NodeLabelQuery.is_("optimized", "memory")
        )

        db = kplus.StatefulSet(
            self,
            "DB",
            containers=[kplus.ContainerProps(image="db", port_number=8000)],
            replicas=2,
            spread=True,
            isolate=True,
        )
        db.scheduling.attract(storage_nodes)

        cache = kplus.Deployment(
            self,
            "Cache",
            containers=[
                kplus.ContainerProps(
                    image="cache",
                    port_number=7000,
                    env_variables={
                        "DB_HOST": kplus.EnvValue.from_value(db.service.name),
                        "DB_PORT": kplus.EnvValue.from_value(f"{db.service.port}"),
                    },
                )
            ],
            replicas=2,
            spread=True,
            isolate=True,
        )
        cache.scheduling.attract(memory_nodes)

        cache_service = cache.expose_via_service()

        web = kplus.Deployment(
            self,
            "Web",
            containers=[
                kplus.ContainerProps(
                    image="web",
                    port_number=6000,
                    env_variables={
                        "CACHE_HOST": kplus.EnvValue.from_value(cache_service.name),
                        "CACHE_PORT": kplus.EnvValue.from_value(
                            f"{cache_service.port}"
                        ),
                    },
                )
            ],
            replicas=2,
            spread=True,
            isolate=True,
        )

        web.scheduling.attract(memory_nodes)
        web.scheduling.colocate(cache)
        web.connections.allow_to(cache)
        cache.connections.allow_to(db)

        frontoffice = kplus.Group.from_name(self, "FOGroup", "frontoffice")
        web.permissions.grant_read_write(frontoffice)
        db.permissions.grant_read_write(frontoffice)
        cache.permissions.grant_read_write(frontoffice)

        web.expose_via_service(service_type=kplus.ServiceType.LOAD_BALANCER)


app = App()
WebCacheDB(app, "web-cache-db")

app.synth()
