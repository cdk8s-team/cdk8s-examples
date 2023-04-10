package imports.co.elastic.k8s.kibana;

/**
 * Number or name of the port to access on the pods targeted by the service.
 * <p>
 * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T16:02:16.005Z")
@software.amazon.jsii.Jsii(module = imports.co.elastic.k8s.kibana.$Module.class, fqn = "coelastick8skibana.KibanaSpecHttpServiceSpecPortsTargetPort")
public class KibanaSpecHttpServiceSpecPortsTargetPort extends software.amazon.jsii.JsiiObject {

    protected KibanaSpecHttpServiceSpecPortsTargetPort(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KibanaSpecHttpServiceSpecPortsTargetPort(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecPortsTargetPort fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecPortsTargetPort.class, "fromNumber", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecPortsTargetPort.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecPortsTargetPort fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecPortsTargetPort.class, "fromString", software.amazon.jsii.NativeType.forClass(imports.co.elastic.k8s.kibana.KibanaSpecHttpServiceSpecPortsTargetPort.class), new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }
}
