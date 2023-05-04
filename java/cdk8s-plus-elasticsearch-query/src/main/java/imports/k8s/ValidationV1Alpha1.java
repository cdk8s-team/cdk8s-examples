package imports.k8s;

/**
 * Validation specifies the CEL expression which is used to apply the validation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.983Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ValidationV1Alpha1")
@software.amazon.jsii.Jsii.Proxy(ValidationV1Alpha1.Jsii$Proxy.class)
public interface ValidationV1Alpha1 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Expression represents the expression which will be evaluated by CEL.
     * <p>
     * ref: https://github.com/google/cel-spec CEL expressions have access to the contents of the Admission request/response, organized into CEL variables as well as some other useful variables:
     * <p>
     * 'object' - The object from the incoming request. The value is null for DELETE requests. 'oldObject' - The existing object. The value is null for CREATE requests. 'request' - Attributes of the admission request(<a href="/pkg/apis/admission/types.go#AdmissionRequest">ref</a>). 'params' - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind.
     * <p>
     * The <code>apiVersion</code>, <code>kind</code>, <code>metadata.name</code> and <code>metadata.generateName</code> are always accessible from the root of the object. No other metadata properties are accessible.
     * <p>
     * Only property names of the form <code>[a-zA-Z_.-/][a-zA-Z0-9_.-/]*</code> are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - '<strong>' escapes to '<strong>underscores</strong>' - '.' escapes to '<strong>dot</strong>' - '-' escapes to '<strong>dash</strong>' - '/' escapes to '<strong>slash</strong>' - Property names that exactly match a CEL RESERVED keyword escape to '</strong>{keyword}__'. The keywords are:
     * "true", "false", "null", "in", "as", "break", "const", "continue", "else", "for", "function", "if",
     * "import", "let", "loop", "package", "namespace", "return".
     * Examples:
     * <p>
     * <ul>
     * <li>Expression accessing a property named "namespace": {"Expression": "object.<strong>namespace</strong> &gt; 0"}</li>
     * <li>Expression accessing a property named "x-prop": {"Expression": "object.x__dash__prop &gt; 0"}</li>
     * <li>Expression accessing a property named "redact__d": {"Expression": "object.redact__underscores__d &gt; 0"}</li>
     * </ul>
     * <p>
     * Equality on arrays with list type of 'set' or 'map' ignores element order, i.e. [1, 2] == [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:
     * <p>
     * <ul>
     * <li>'set': <code>X + Y</code> performs a union where the array positions of all elements in <code>X</code> are preserved and
     * non-intersecting elements in <code>Y</code> are appended, retaining their partial order.</li>
     * <li>'map': <code>X + Y</code> performs a merge where the array positions of all keys in <code>X</code> are preserved but the values
     * are overwritten by values in <code>Y</code> when the key sets of <code>X</code> and <code>Y</code> intersect. Elements in <code>Y</code> with
     * non-intersecting keys are appended, retaining their partial order.
     * Required.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExpression();

    /**
     * Message represents the message displayed when validation fails.
     * <p>
     * The message is required if the Expression contains line breaks. The message must not contain line breaks. If unset, the message is "failed rule: {Rule}". e.g. "must be a URL with the host matching spec.host" If the Expression contains line breaks. Message is required. The message must not contain line breaks. If unset, the message is "failed Expression: {Expression}".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * Reason represents a machine-readable description of why this validation failed.
     * <p>
     * If this is the first validation in the list to fail, this reason, as well as the corresponding HTTP response code, are used in the HTTP response to the client. The currently supported reasons are: "Unauthorized", "Forbidden", "Invalid", "RequestEntityTooLarge". If not set, StatusReasonInvalid is used in the response to the client.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidationV1Alpha1}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidationV1Alpha1}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidationV1Alpha1> {
        java.lang.String expression;
        java.lang.String message;
        java.lang.String reason;

        /**
         * Sets the value of {@link ValidationV1Alpha1#getExpression}
         * @param expression Expression represents the expression which will be evaluated by CEL. This parameter is required.
         *                   ref: https://github.com/google/cel-spec CEL expressions have access to the contents of the Admission request/response, organized into CEL variables as well as some other useful variables:
         *                   <p>
         *                   'object' - The object from the incoming request. The value is null for DELETE requests. 'oldObject' - The existing object. The value is null for CREATE requests. 'request' - Attributes of the admission request(<a href="/pkg/apis/admission/types.go#AdmissionRequest">ref</a>). 'params' - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind.
         *                   <p>
         *                   The <code>apiVersion</code>, <code>kind</code>, <code>metadata.name</code> and <code>metadata.generateName</code> are always accessible from the root of the object. No other metadata properties are accessible.
         *                   <p>
         *                   Only property names of the form <code>[a-zA-Z_.-/][a-zA-Z0-9_.-/]*</code> are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - '<strong>' escapes to '<strong>underscores</strong>' - '.' escapes to '<strong>dot</strong>' - '-' escapes to '<strong>dash</strong>' - '/' escapes to '<strong>slash</strong>' - Property names that exactly match a CEL RESERVED keyword escape to '</strong>{keyword}__'. The keywords are:
         *                   "true", "false", "null", "in", "as", "break", "const", "continue", "else", "for", "function", "if",
         *                   "import", "let", "loop", "package", "namespace", "return".
         *                   Examples:
         *                   <p>
         *                   <ul>
         *                   <li>Expression accessing a property named "namespace": {"Expression": "object.<strong>namespace</strong> &gt; 0"}</li>
         *                   <li>Expression accessing a property named "x-prop": {"Expression": "object.x__dash__prop &gt; 0"}</li>
         *                   <li>Expression accessing a property named "redact__d": {"Expression": "object.redact__underscores__d &gt; 0"}</li>
         *                   </ul>
         *                   <p>
         *                   Equality on arrays with list type of 'set' or 'map' ignores element order, i.e. [1, 2] == [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:
         *                   <p>
         *                   <ul>
         *                   <li>'set': <code>X + Y</code> performs a union where the array positions of all elements in <code>X</code> are preserved and
         *                   non-intersecting elements in <code>Y</code> are appended, retaining their partial order.</li>
         *                   <li>'map': <code>X + Y</code> performs a merge where the array positions of all keys in <code>X</code> are preserved but the values
         *                   are overwritten by values in <code>Y</code> when the key sets of <code>X</code> and <code>Y</code> intersect. Elements in <code>Y</code> with
         *                   non-intersecting keys are appended, retaining their partial order.
         *                   Required.</li>
         *                   </ul>
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Sets the value of {@link ValidationV1Alpha1#getMessage}
         * @param message Message represents the message displayed when validation fails.
         *                The message is required if the Expression contains line breaks. The message must not contain line breaks. If unset, the message is "failed rule: {Rule}". e.g. "must be a URL with the host matching spec.host" If the Expression contains line breaks. Message is required. The message must not contain line breaks. If unset, the message is "failed Expression: {Expression}".
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link ValidationV1Alpha1#getReason}
         * @param reason Reason represents a machine-readable description of why this validation failed.
         *               If this is the first validation in the list to fail, this reason, as well as the corresponding HTTP response code, are used in the HTTP response to the client. The currently supported reasons are: "Unauthorized", "Forbidden", "Invalid", "RequestEntityTooLarge". If not set, StatusReasonInvalid is used in the response to the client.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidationV1Alpha1}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidationV1Alpha1 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ValidationV1Alpha1}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidationV1Alpha1 {
        private final java.lang.String expression;
        private final java.lang.String message;
        private final java.lang.String reason;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.expression = software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reason = software.amazon.jsii.Kernel.get(this, "reason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.expression = java.util.Objects.requireNonNull(builder.expression, "expression is required");
            this.message = builder.message;
            this.reason = builder.reason;
        }

        @Override
        public final java.lang.String getExpression() {
            return this.expression;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("expression", om.valueToTree(this.getExpression()));
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ValidationV1Alpha1"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidationV1Alpha1.Jsii$Proxy that = (ValidationV1Alpha1.Jsii$Proxy) o;

            if (!expression.equals(that.expression)) return false;
            if (this.message != null ? !this.message.equals(that.message) : that.message != null) return false;
            return this.reason != null ? this.reason.equals(that.reason) : that.reason == null;
        }

        @Override
        public final int hashCode() {
            int result = this.expression.hashCode();
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            return result;
        }
    }
}
