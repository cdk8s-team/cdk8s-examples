package imports.k8s;

/**
 * Affinity is a group of affinity scheduling rules.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.726Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Affinity")
@software.amazon.jsii.Jsii.Proxy(Affinity.Jsii$Proxy.class)
public interface Affinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes node affinity scheduling rules for the pod.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.NodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodAffinity getPodAffinity() {
        return null;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodAntiAffinity getPodAntiAffinity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Affinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Affinity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Affinity> {
        imports.k8s.NodeAffinity nodeAffinity;
        imports.k8s.PodAffinity podAffinity;
        imports.k8s.PodAntiAffinity podAntiAffinity;

        /**
         * Sets the value of {@link Affinity#getNodeAffinity}
         * @param nodeAffinity Describes node affinity scheduling rules for the pod.
         * @return {@code this}
         */
        public Builder nodeAffinity(imports.k8s.NodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link Affinity#getPodAffinity}
         * @param podAffinity Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
         * @return {@code this}
         */
        public Builder podAffinity(imports.k8s.PodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        /**
         * Sets the value of {@link Affinity#getPodAntiAffinity}
         * @param podAntiAffinity Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
         * @return {@code this}
         */
        public Builder podAntiAffinity(imports.k8s.PodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Affinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Affinity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Affinity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Affinity {
        private final imports.k8s.NodeAffinity nodeAffinity;
        private final imports.k8s.PodAffinity podAffinity;
        private final imports.k8s.PodAntiAffinity podAntiAffinity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeAffinity = software.amazon.jsii.Kernel.get(this, "nodeAffinity", software.amazon.jsii.NativeType.forClass(imports.k8s.NodeAffinity.class));
            this.podAffinity = software.amazon.jsii.Kernel.get(this, "podAffinity", software.amazon.jsii.NativeType.forClass(imports.k8s.PodAffinity.class));
            this.podAntiAffinity = software.amazon.jsii.Kernel.get(this, "podAntiAffinity", software.amazon.jsii.NativeType.forClass(imports.k8s.PodAntiAffinity.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeAffinity = builder.nodeAffinity;
            this.podAffinity = builder.podAffinity;
            this.podAntiAffinity = builder.podAntiAffinity;
        }

        @Override
        public final imports.k8s.NodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public final imports.k8s.PodAffinity getPodAffinity() {
            return this.podAffinity;
        }

        @Override
        public final imports.k8s.PodAntiAffinity getPodAntiAffinity() {
            return this.podAntiAffinity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNodeAffinity() != null) {
                data.set("nodeAffinity", om.valueToTree(this.getNodeAffinity()));
            }
            if (this.getPodAffinity() != null) {
                data.set("podAffinity", om.valueToTree(this.getPodAffinity()));
            }
            if (this.getPodAntiAffinity() != null) {
                data.set("podAntiAffinity", om.valueToTree(this.getPodAntiAffinity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Affinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Affinity.Jsii$Proxy that = (Affinity.Jsii$Proxy) o;

            if (this.nodeAffinity != null ? !this.nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null) return false;
            if (this.podAffinity != null ? !this.podAffinity.equals(that.podAffinity) : that.podAffinity != null) return false;
            return this.podAntiAffinity != null ? this.podAntiAffinity.equals(that.podAntiAffinity) : that.podAntiAffinity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.nodeAffinity != null ? this.nodeAffinity.hashCode() : 0;
            result = 31 * result + (this.podAffinity != null ? this.podAffinity.hashCode() : 0);
            result = 31 * result + (this.podAntiAffinity != null ? this.podAntiAffinity.hashCode() : 0);
            return result;
        }
    }
}
