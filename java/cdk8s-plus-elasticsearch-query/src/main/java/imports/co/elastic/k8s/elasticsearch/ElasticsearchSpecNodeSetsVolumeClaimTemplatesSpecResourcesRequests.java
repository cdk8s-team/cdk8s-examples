package imports.co.elastic.k8s.elasticsearch;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.059Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests")
public class ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests extends software.amazon.jsii.JsiiObject {

    protected ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests.class, "fromNumber", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests.class, "fromString", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecNodeSetsVolumeClaimTemplatesSpecResourcesRequests.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }
}
