package imports.co.elastic.k8s.elasticsearch;

/**
 * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.061Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable")
public class ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable extends software.amazon.jsii.JsiiObject {

    protected ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable.class, "fromNumber", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable.class, "fromString", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMaxUnavailable.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }
}
