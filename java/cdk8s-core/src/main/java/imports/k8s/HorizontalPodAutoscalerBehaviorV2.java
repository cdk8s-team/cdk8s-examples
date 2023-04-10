package imports.k8s;

/**
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.847Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HorizontalPodAutoscalerBehaviorV2")
@software.amazon.jsii.Jsii.Proxy(HorizontalPodAutoscalerBehaviorV2.Jsii$Proxy.class)
public interface HorizontalPodAutoscalerBehaviorV2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * scaleDown is scaling policy for scaling Down.
     * <p>
     * If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HpaScalingRulesV2 getScaleDown() {
        return null;
    }

    /**
     * scaleUp is scaling policy for scaling Up.
     * <p>
     * If not set, the default value is the higher of:
     * <p>
     * <ul>
     * <li>increase no more than 4 pods per 60 seconds</li>
     * <li>double the number of pods per 60 seconds
     * No stabilization is used.</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HpaScalingRulesV2 getScaleUp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HorizontalPodAutoscalerBehaviorV2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HorizontalPodAutoscalerBehaviorV2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HorizontalPodAutoscalerBehaviorV2> {
        imports.k8s.HpaScalingRulesV2 scaleDown;
        imports.k8s.HpaScalingRulesV2 scaleUp;

        /**
         * Sets the value of {@link HorizontalPodAutoscalerBehaviorV2#getScaleDown}
         * @param scaleDown scaleDown is scaling policy for scaling Down.
         *                  If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
         * @return {@code this}
         */
        public Builder scaleDown(imports.k8s.HpaScalingRulesV2 scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }

        /**
         * Sets the value of {@link HorizontalPodAutoscalerBehaviorV2#getScaleUp}
         * @param scaleUp scaleUp is scaling policy for scaling Up.
         *                If not set, the default value is the higher of:
         *                <p>
         *                <ul>
         *                <li>increase no more than 4 pods per 60 seconds</li>
         *                <li>double the number of pods per 60 seconds
         *                No stabilization is used.</li>
         *                </ul>
         * @return {@code this}
         */
        public Builder scaleUp(imports.k8s.HpaScalingRulesV2 scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HorizontalPodAutoscalerBehaviorV2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HorizontalPodAutoscalerBehaviorV2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link HorizontalPodAutoscalerBehaviorV2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HorizontalPodAutoscalerBehaviorV2 {
        private final imports.k8s.HpaScalingRulesV2 scaleDown;
        private final imports.k8s.HpaScalingRulesV2 scaleUp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.scaleDown = software.amazon.jsii.Kernel.get(this, "scaleDown", software.amazon.jsii.NativeType.forClass(imports.k8s.HpaScalingRulesV2.class));
            this.scaleUp = software.amazon.jsii.Kernel.get(this, "scaleUp", software.amazon.jsii.NativeType.forClass(imports.k8s.HpaScalingRulesV2.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.scaleDown = builder.scaleDown;
            this.scaleUp = builder.scaleUp;
        }

        @Override
        public final imports.k8s.HpaScalingRulesV2 getScaleDown() {
            return this.scaleDown;
        }

        @Override
        public final imports.k8s.HpaScalingRulesV2 getScaleUp() {
            return this.scaleUp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getScaleDown() != null) {
                data.set("scaleDown", om.valueToTree(this.getScaleDown()));
            }
            if (this.getScaleUp() != null) {
                data.set("scaleUp", om.valueToTree(this.getScaleUp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HorizontalPodAutoscalerBehaviorV2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HorizontalPodAutoscalerBehaviorV2.Jsii$Proxy that = (HorizontalPodAutoscalerBehaviorV2.Jsii$Proxy) o;

            if (this.scaleDown != null ? !this.scaleDown.equals(that.scaleDown) : that.scaleDown != null) return false;
            return this.scaleUp != null ? this.scaleUp.equals(that.scaleUp) : that.scaleUp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.scaleDown != null ? this.scaleDown.hashCode() : 0;
            result = 31 * result + (this.scaleUp != null ? this.scaleUp.hashCode() : 0);
            return result;
        }
    }
}
