package imports.k8s;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.943Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Quantity")
public class Quantity extends software.amazon.jsii.JsiiObject {

    protected Quantity(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Quantity(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull imports.k8s.Quantity fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.Quantity.class, "fromNumber", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull imports.k8s.Quantity fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.Quantity.class, "fromString", software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }
}
