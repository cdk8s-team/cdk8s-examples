package imports.k8s;

/**
 * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.864Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MetricSpecV2")
@software.amazon.jsii.Jsii.Proxy(MetricSpecV2.Jsii$Proxy.class)
public interface MetricSpecV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * type is the type of metric source.
     * <p>
     * It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ContainerResourceMetricSourceV2 getContainerResource() {
        return null;
    }

    /**
     * external refers to a global metric that is not associated with any Kubernetes object.
     * <p>
     * It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ExternalMetricSourceV2 getExternal() {
        return null;
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMetricSourceV2 getObject() {
        return null;
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
     * <p>
     * The values will be averaged together before being compared to the target value.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodsMetricSourceV2 getPods() {
        return null;
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceMetricSourceV2 getResource() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetricSpecV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricSpecV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricSpecV2> {
        java.lang.String type;
        imports.k8s.ContainerResourceMetricSourceV2 containerResource;
        imports.k8s.ExternalMetricSourceV2 external;
        imports.k8s.ObjectMetricSourceV2 object;
        imports.k8s.PodsMetricSourceV2 pods;
        imports.k8s.ResourceMetricSourceV2 resource;

        /**
         * Sets the value of {@link MetricSpecV2#getType}
         * @param type type is the type of metric source. This parameter is required.
         *             It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpecV2#getContainerResource}
         * @param containerResource containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
         * @return {@code this}
         */
        public Builder containerResource(imports.k8s.ContainerResourceMetricSourceV2 containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpecV2#getExternal}
         * @param external external refers to a global metric that is not associated with any Kubernetes object.
         *                 It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
         * @return {@code this}
         */
        public Builder external(imports.k8s.ExternalMetricSourceV2 external) {
            this.external = external;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpecV2#getObject}
         * @param object object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
         * @return {@code this}
         */
        public Builder object(imports.k8s.ObjectMetricSourceV2 object) {
            this.object = object;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpecV2#getPods}
         * @param pods pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
         *             The values will be averaged together before being compared to the target value.
         * @return {@code this}
         */
        public Builder pods(imports.k8s.PodsMetricSourceV2 pods) {
            this.pods = pods;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpecV2#getResource}
         * @param resource resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
         * @return {@code this}
         */
        public Builder resource(imports.k8s.ResourceMetricSourceV2 resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricSpecV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricSpecV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricSpecV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricSpecV2 {
        private final java.lang.String type;
        private final imports.k8s.ContainerResourceMetricSourceV2 containerResource;
        private final imports.k8s.ExternalMetricSourceV2 external;
        private final imports.k8s.ObjectMetricSourceV2 object;
        private final imports.k8s.PodsMetricSourceV2 pods;
        private final imports.k8s.ResourceMetricSourceV2 resource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerResource = software.amazon.jsii.Kernel.get(this, "containerResource", software.amazon.jsii.NativeType.forClass(imports.k8s.ContainerResourceMetricSourceV2.class));
            this.external = software.amazon.jsii.Kernel.get(this, "external", software.amazon.jsii.NativeType.forClass(imports.k8s.ExternalMetricSourceV2.class));
            this.object = software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMetricSourceV2.class));
            this.pods = software.amazon.jsii.Kernel.get(this, "pods", software.amazon.jsii.NativeType.forClass(imports.k8s.PodsMetricSourceV2.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceMetricSourceV2.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.containerResource = builder.containerResource;
            this.external = builder.external;
            this.object = builder.object;
            this.pods = builder.pods;
            this.resource = builder.resource;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.k8s.ContainerResourceMetricSourceV2 getContainerResource() {
            return this.containerResource;
        }

        @Override
        public final imports.k8s.ExternalMetricSourceV2 getExternal() {
            return this.external;
        }

        @Override
        public final imports.k8s.ObjectMetricSourceV2 getObject() {
            return this.object;
        }

        @Override
        public final imports.k8s.PodsMetricSourceV2 getPods() {
            return this.pods;
        }

        @Override
        public final imports.k8s.ResourceMetricSourceV2 getResource() {
            return this.resource;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getContainerResource() != null) {
                data.set("containerResource", om.valueToTree(this.getContainerResource()));
            }
            if (this.getExternal() != null) {
                data.set("external", om.valueToTree(this.getExternal()));
            }
            if (this.getObject() != null) {
                data.set("object", om.valueToTree(this.getObject()));
            }
            if (this.getPods() != null) {
                data.set("pods", om.valueToTree(this.getPods()));
            }
            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.MetricSpecV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricSpecV2.Jsii$Proxy that = (MetricSpecV2.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.containerResource != null ? !this.containerResource.equals(that.containerResource) : that.containerResource != null) return false;
            if (this.external != null ? !this.external.equals(that.external) : that.external != null) return false;
            if (this.object != null ? !this.object.equals(that.object) : that.object != null) return false;
            if (this.pods != null ? !this.pods.equals(that.pods) : that.pods != null) return false;
            return this.resource != null ? this.resource.equals(that.resource) : that.resource == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.containerResource != null ? this.containerResource.hashCode() : 0);
            result = 31 * result + (this.external != null ? this.external.hashCode() : 0);
            result = 31 * result + (this.object != null ? this.object.hashCode() : 0);
            result = 31 * result + (this.pods != null ? this.pods.hashCode() : 0);
            result = 31 * result + (this.resource != null ? this.resource.hashCode() : 0);
            return result;
        }
    }
}
