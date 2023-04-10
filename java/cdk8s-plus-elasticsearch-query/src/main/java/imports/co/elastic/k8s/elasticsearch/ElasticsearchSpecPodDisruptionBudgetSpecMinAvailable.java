package imports.co.elastic.k8s.elasticsearch;

/**
 * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:14.061Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.elasticsearch.$Module.class, fqn = "coelastick8selasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable")
public class ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable extends software.amazon.jsii.JsiiObject {

    protected ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable.class, "fromNumber", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable.class, "fromString", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.elasticsearch.ElasticsearchSpecPodDisruptionBudgetSpecMinAvailable.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }
}
