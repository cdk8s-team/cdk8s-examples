package imports.k8s;

/**
 * ObjectReference contains enough information to let you inspect or modify the referred object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.877Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ObjectReference")
@software.amazon.jsii.Jsii.Proxy(ObjectReference.Jsii$Proxy.class)
public interface ObjectReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * API version of the referent.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFieldPath() {
        return null;
    }

    /**
     * Kind of the referent.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * Name of the referent.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Namespace of the referent.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * Specific resourceVersion to which this reference is made, if any.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceVersion() {
        return null;
    }

    /**
     * UID of the referent.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ObjectReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ObjectReference}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ObjectReference> {
        java.lang.String apiVersion;
        java.lang.String fieldPath;
        java.lang.String kind;
        java.lang.String name;
        java.lang.String namespace;
        java.lang.String resourceVersion;
        java.lang.String uid;

        /**
         * Sets the value of {@link ObjectReference#getApiVersion}
         * @param apiVersion API version of the referent.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link ObjectReference#getFieldPath}
         * @param fieldPath If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
         * @return {@code this}
         */
        public Builder fieldPath(java.lang.String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * Sets the value of {@link ObjectReference#getKind}
         * @param kind Kind of the referent.
         *             More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link ObjectReference#getName}
         * @param name Name of the referent.
         *             More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ObjectReference#getNamespace}
         * @param namespace Namespace of the referent.
         *                  More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ObjectReference#getResourceVersion}
         * @param resourceVersion Specific resourceVersion to which this reference is made, if any.
         *                        More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
         * @return {@code this}
         */
        public Builder resourceVersion(java.lang.String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Sets the value of {@link ObjectReference#getUid}
         * @param uid UID of the referent.
         *            More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ObjectReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ObjectReference build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ObjectReference}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ObjectReference {
        private final java.lang.String apiVersion;
        private final java.lang.String fieldPath;
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.lang.String resourceVersion;
        private final java.lang.String uid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldPath = software.amazon.jsii.Kernel.get(this, "fieldPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kind = software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceVersion = software.amazon.jsii.Kernel.get(this, "resourceVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.uid = software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = builder.apiVersion;
            this.fieldPath = builder.fieldPath;
            this.kind = builder.kind;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.resourceVersion = builder.resourceVersion;
            this.uid = builder.uid;
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public final java.lang.String getFieldPath() {
            return this.fieldPath;
        }

        @Override
        public final java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getResourceVersion() {
            return this.resourceVersion;
        }

        @Override
        public final java.lang.String getUid() {
            return this.uid;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getFieldPath() != null) {
                data.set("fieldPath", om.valueToTree(this.getFieldPath()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getResourceVersion() != null) {
                data.set("resourceVersion", om.valueToTree(this.getResourceVersion()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ObjectReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ObjectReference.Jsii$Proxy that = (ObjectReference.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            if (this.fieldPath != null ? !this.fieldPath.equals(that.fieldPath) : that.fieldPath != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.resourceVersion != null ? !this.resourceVersion.equals(that.resourceVersion) : that.resourceVersion != null) return false;
            return this.uid != null ? this.uid.equals(that.uid) : that.uid == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.fieldPath != null ? this.fieldPath.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.resourceVersion != null ? this.resourceVersion.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            return result;
        }
    }
}
