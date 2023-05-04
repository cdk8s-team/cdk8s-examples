package imports.k8s;

/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.945Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Toleration")
@software.amazon.jsii.Jsii.Proxy(Toleration.Jsii$Proxy.class)
public interface Toleration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Effect indicates the taint effect to match.
     * <p>
     * Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEffect() {
        return null;
    }

    /**
     * Key is the taint key that the toleration applies to.
     * <p>
     * Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * Operator represents a key's relationship to the value.
     * <p>
     * Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * <p>
     * Default: Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOperator() {
        return null;
    }

    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
     * <p>
     * By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTolerationSeconds() {
        return null;
    }

    /**
     * Value is the taint value the toleration matches to.
     * <p>
     * If the operator is Exists, the value should be empty, otherwise just a regular string.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Toleration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Toleration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Toleration> {
        java.lang.String effect;
        java.lang.String key;
        java.lang.String operator;
        java.lang.Number tolerationSeconds;
        java.lang.String value;

        /**
         * Sets the value of {@link Toleration#getEffect}
         * @param effect Effect indicates the taint effect to match.
         *               Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
         * @return {@code this}
         */
        public Builder effect(java.lang.String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * Sets the value of {@link Toleration#getKey}
         * @param key Key is the taint key that the toleration applies to.
         *            Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link Toleration#getOperator}
         * @param operator Operator represents a key's relationship to the value.
         *                 Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link Toleration#getTolerationSeconds}
         * @param tolerationSeconds TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
         *                          By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
         * @return {@code this}
         */
        public Builder tolerationSeconds(java.lang.Number tolerationSeconds) {
            this.tolerationSeconds = tolerationSeconds;
            return this;
        }

        /**
         * Sets the value of {@link Toleration#getValue}
         * @param value Value is the taint value the toleration matches to.
         *              If the operator is Exists, the value should be empty, otherwise just a regular string.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Toleration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Toleration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Toleration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Toleration {
        private final java.lang.String effect;
        private final java.lang.String key;
        private final java.lang.String operator;
        private final java.lang.Number tolerationSeconds;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.effect = software.amazon.jsii.Kernel.get(this, "effect", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tolerationSeconds = software.amazon.jsii.Kernel.get(this, "tolerationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.effect = builder.effect;
            this.key = builder.key;
            this.operator = builder.operator;
            this.tolerationSeconds = builder.tolerationSeconds;
            this.value = builder.value;
        }

        @Override
        public final java.lang.String getEffect() {
            return this.effect;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final java.lang.Number getTolerationSeconds() {
            return this.tolerationSeconds;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEffect() != null) {
                data.set("effect", om.valueToTree(this.getEffect()));
            }
            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }
            if (this.getOperator() != null) {
                data.set("operator", om.valueToTree(this.getOperator()));
            }
            if (this.getTolerationSeconds() != null) {
                data.set("tolerationSeconds", om.valueToTree(this.getTolerationSeconds()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Toleration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Toleration.Jsii$Proxy that = (Toleration.Jsii$Proxy) o;

            if (this.effect != null ? !this.effect.equals(that.effect) : that.effect != null) return false;
            if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;
            if (this.operator != null ? !this.operator.equals(that.operator) : that.operator != null) return false;
            if (this.tolerationSeconds != null ? !this.tolerationSeconds.equals(that.tolerationSeconds) : that.tolerationSeconds != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.effect != null ? this.effect.hashCode() : 0;
            result = 31 * result + (this.key != null ? this.key.hashCode() : 0);
            result = 31 * result + (this.operator != null ? this.operator.hashCode() : 0);
            result = 31 * result + (this.tolerationSeconds != null ? this.tolerationSeconds.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
