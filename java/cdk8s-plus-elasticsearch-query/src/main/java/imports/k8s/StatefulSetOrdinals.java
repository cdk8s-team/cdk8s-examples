package imports.k8s;

/**
 * StatefulSetOrdinals describes the policy used for replica ordinal assignment in this StatefulSet.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.942Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StatefulSetOrdinals")
@software.amazon.jsii.Jsii.Proxy(StatefulSetOrdinals.Jsii$Proxy.class)
public interface StatefulSetOrdinals extends software.amazon.jsii.JsiiSerializable {

    /**
     * start is the number representing the first replica's index.
     * <p>
     * It may be used to number replicas from an alternate index (eg: 1-indexed) over the default 0-indexed names, or to orchestrate progressive movement of replicas from one StatefulSet to another. If set, replica indices will be in the range:
     * [.spec.ordinals.start, .spec.ordinals.start + .spec.replicas).
     * If unset, defaults to 0. Replica indices will be in the range:
     * [0, .spec.replicas).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getStart() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetOrdinals}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetOrdinals}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetOrdinals> {
        java.lang.Number start;

        /**
         * Sets the value of {@link StatefulSetOrdinals#getStart}
         * @param start start is the number representing the first replica's index.
         *              It may be used to number replicas from an alternate index (eg: 1-indexed) over the default 0-indexed names, or to orchestrate progressive movement of replicas from one StatefulSet to another. If set, replica indices will be in the range:
         *              [.spec.ordinals.start, .spec.ordinals.start + .spec.replicas).
         *              If unset, defaults to 0. Replica indices will be in the range:
         *              [0, .spec.replicas).
         * @return {@code this}
         */
        public Builder start(java.lang.Number start) {
            this.start = start;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetOrdinals}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetOrdinals build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StatefulSetOrdinals}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetOrdinals {
        private final java.lang.Number start;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.start = software.amazon.jsii.Kernel.get(this, "start", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.start = builder.start;
        }

        @Override
        public final java.lang.Number getStart() {
            return this.start;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getStart() != null) {
                data.set("start", om.valueToTree(this.getStart()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatefulSetOrdinals"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetOrdinals.Jsii$Proxy that = (StatefulSetOrdinals.Jsii$Proxy) o;

            return this.start != null ? this.start.equals(that.start) : that.start == null;
        }

        @Override
        public final int hashCode() {
            int result = this.start != null ? this.start.hashCode() : 0;
            return result;
        }
    }
}
