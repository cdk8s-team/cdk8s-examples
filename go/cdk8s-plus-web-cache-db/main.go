package main

import (
	"strconv"

	"github.com/aws/constructs-go/constructs/v10"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
	"github.com/cdk8s-team/cdk8s-plus-go/cdk8splus26/v2"
)

func NewWebCacheDB(scope constructs.Construct, id string) cdk8s.Chart {

	chart := cdk8s.NewChart(scope, jsii.String(id), nil)

	storageNodes := cdk8splus26.Node_Labeled(cdk8splus26.NodeLabelQuery_Is(jsii.String("optimized"), jsii.String("storage")))
	memoryNodes := cdk8splus26.Node_Labeled(cdk8splus26.NodeLabelQuery_Is(jsii.String("optimized"), jsii.String("memory")))

	db := cdk8splus26.NewStatefulSet(chart, jsii.String("DB"), &cdk8splus26.StatefulSetProps{
		Containers: &[]*cdk8splus26.ContainerProps{{Image: jsii.String("db"), PortNumber: jsii.Number(8000)}},
		Replicas:   jsii.Number(2),
		Spread:     jsii.Bool(true),
		Isolate:    jsii.Bool(true),
	})
	db.Scheduling().Attract(storageNodes, nil)

	cache := cdk8splus26.NewDeployment(chart, jsii.String("Cache"), &cdk8splus26.DeploymentProps{
		Containers: &[]*cdk8splus26.ContainerProps{{
			Image:      jsii.String("cache"),
			PortNumber: jsii.Number(7000),
			EnvVariables: &map[string]cdk8splus26.EnvValue{
				"DB_HOST": cdk8splus26.EnvValue_FromValue(db.Service().Name()),
				"DB_PORT": cdk8splus26.EnvValue_FromValue(jsii.String(strconv.FormatFloat(*db.Service().Port(), 'f', 0, 64))),
			},
		}},
		Replicas: jsii.Number(2),
		Spread:   jsii.Bool(true),
		Isolate:  jsii.Bool(true),
	})
	cache.Scheduling().Attract(memoryNodes, nil)

	cacheService := cache.ExposeViaService(nil)

	web := cdk8splus26.NewDeployment(chart, jsii.String("Web"), &cdk8splus26.DeploymentProps{
		Containers: &[]*cdk8splus26.ContainerProps{{
			Image:      jsii.String("web"),
			PortNumber: jsii.Number(6000),
			EnvVariables: &map[string]cdk8splus26.EnvValue{
				"CACHE_HOST": cdk8splus26.EnvValue_FromValue(cacheService.Name()),
				"CACHE_PORT": cdk8splus26.EnvValue_FromValue(jsii.String(strconv.FormatFloat(*cacheService.Port(), 'f', 0, 64))),
			},
		}},
		Replicas: jsii.Number(2),
		Spread:   jsii.Bool(true),
		Isolate:  jsii.Bool(true),
	})
	web.Scheduling().Attract(memoryNodes, nil)

	web.Scheduling().Colocate(cache, nil)

	web.Connections().AllowTo(cache, nil)
	cache.Connections().AllowTo(db, nil)

	frontoffice := cdk8splus26.Group_FromName(chart, jsii.String("FOGroup"), jsii.String("frontoffice"))

	web.Permissions().GrantReadWrite(frontoffice)
	db.Permissions().GrantReadWrite(frontoffice)
	cache.Permissions().GrantReadWrite(frontoffice)

	web.ExposeViaService(&cdk8splus26.DeploymentExposeViaServiceOptions{ServiceType: cdk8splus26.ServiceType_LOAD_BALANCER})

	return chart

}

func main() {
	app := cdk8s.NewApp(nil)
	NewWebCacheDB(app, "web-cache-db")
	app.Synth()
}
