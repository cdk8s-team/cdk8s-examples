package imports.k8s;

/**
 * ValidationRule describes a validation rule written in the CEL expression language.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.947Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ValidationRule")
@software.amazon.jsii.Jsii.Proxy(ValidationRule.Jsii$Proxy.class)
public interface ValidationRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Rule represents the expression which will be evaluated by CEL.
     * <p>
     * ref: https://github.com/google/cel-spec The Rule is scoped to the location of the x-kubernetes-validations extension in the schema. The <code>self</code> variable in the CEL expression is bound to the scoped value. Example: - Rule scoped to the root of a resource with a status subresource: {"rule": "self.status.actual &lt;= self.spec.maxDesired"}
     * <p>
     * If the Rule is scoped to an object with properties, the accessible properties of the object are field selectable via <code>self.field</code> and field presence can be checked via <code>has(self.field)</code>. Null valued fields are treated as absent fields in CEL expressions. If the Rule is scoped to an object with additionalProperties (i.e. a map) the value of the map are accessible via <code>self[mapKey]</code>, map containment can be checked via <code>mapKey in self</code> and all entries of the map are accessible via CEL macros and functions such as <code>self.all(...)</code>. If the Rule is scoped to an array, the elements of the array are accessible via <code>self[i]</code> and also by macros and functions. If the Rule is scoped to a scalar, <code>self</code> is bound to the scalar value. Examples: - Rule scoped to a map of objects: {"rule": "self.components['Widget'].priority &lt; 10"} - Rule scoped to a list of integers: {"rule": "self.values.all(value, value &gt;= 0 &amp;&amp; value &lt; 100)"} - Rule scoped to a string value: {"rule": "self.startsWith('kube')"}
     * <p>
     * The <code>apiVersion</code>, <code>kind</code>, <code>metadata.name</code> and <code>metadata.generateName</code> are always accessible from the root of the object and from any x-kubernetes-embedded-resource annotated objects. No other metadata properties are accessible.
     * <p>
     * Unknown data preserved in custom resources via x-kubernetes-preserve-unknown-fields is not accessible in CEL expressions. This includes: - Unknown field values that are preserved by object schemas with x-kubernetes-preserve-unknown-fields. - Object properties where the property schema is of an "unknown type". An "unknown type" is recursively defined as:
     * <p>
     * <ul>
     * <li>A schema with no type and x-kubernetes-preserve-unknown-fields set to true</li>
     * <li>An array where the items schema is of an "unknown type"</li>
     * <li>An object where the additionalProperties schema is of an "unknown type"</li>
     * </ul>
     * <p>
     * Only property names of the form <code>[a-zA-Z_.-/][a-zA-Z0-9_.-/]*</code> are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - '<strong>' escapes to '<strong>underscores</strong>' - '.' escapes to '<strong>dot</strong>' - '-' escapes to '<strong>dash</strong>' - '/' escapes to '<strong>slash</strong>' - Property names that exactly match a CEL RESERVED keyword escape to '</strong>{keyword}__'. The keywords are:
     * "true", "false", "null", "in", "as", "break", "const", "continue", "else", "for", "function", "if",
     * "import", "let", "loop", "package", "namespace", "return".
     * Examples:
     * <p>
     * <ul>
     * <li>Rule accessing a property named "namespace": {"rule": "self.<strong>namespace</strong> &gt; 0"}</li>
     * <li>Rule accessing a property named "x-prop": {"rule": "self.x__dash__prop &gt; 0"}</li>
     * <li>Rule accessing a property named "redact__d": {"rule": "self.redact__underscores__d &gt; 0"}</li>
     * </ul>
     * <p>
     * Equality on arrays with x-kubernetes-list-type of 'set' or 'map' ignores element order, i.e. [1, 2] == [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:
     * <p>
     * <ul>
     * <li>'set': <code>X + Y</code> performs a union where the array positions of all elements in <code>X</code> are preserved and
     * non-intersecting elements in <code>Y</code> are appended, retaining their partial order.</li>
     * <li>'map': <code>X + Y</code> performs a merge where the array positions of all keys in <code>X</code> are preserved but the values
     * are overwritten by values in <code>Y</code> when the key sets of <code>X</code> and <code>Y</code> intersect. Elements in <code>Y</code> with
     * non-intersecting keys are appended, retaining their partial order.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRule();

    /**
     * Message represents the message displayed when validation fails.
     * <p>
     * The message is required if the Rule contains line breaks. The message must not contain line breaks. If unset, the message is "failed rule: {Rule}". e.g. "must be a URL with the host matching spec.host"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidationRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidationRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidationRule> {
        java.lang.String rule;
        java.lang.String message;

        /**
         * Sets the value of {@link ValidationRule#getRule}
         * @param rule Rule represents the expression which will be evaluated by CEL. This parameter is required.
         *             ref: https://github.com/google/cel-spec The Rule is scoped to the location of the x-kubernetes-validations extension in the schema. The <code>self</code> variable in the CEL expression is bound to the scoped value. Example: - Rule scoped to the root of a resource with a status subresource: {"rule": "self.status.actual &lt;= self.spec.maxDesired"}
         *             <p>
         *             If the Rule is scoped to an object with properties, the accessible properties of the object are field selectable via <code>self.field</code> and field presence can be checked via <code>has(self.field)</code>. Null valued fields are treated as absent fields in CEL expressions. If the Rule is scoped to an object with additionalProperties (i.e. a map) the value of the map are accessible via <code>self[mapKey]</code>, map containment can be checked via <code>mapKey in self</code> and all entries of the map are accessible via CEL macros and functions such as <code>self.all(...)</code>. If the Rule is scoped to an array, the elements of the array are accessible via <code>self[i]</code> and also by macros and functions. If the Rule is scoped to a scalar, <code>self</code> is bound to the scalar value. Examples: - Rule scoped to a map of objects: {"rule": "self.components['Widget'].priority &lt; 10"} - Rule scoped to a list of integers: {"rule": "self.values.all(value, value &gt;= 0 &amp;&amp; value &lt; 100)"} - Rule scoped to a string value: {"rule": "self.startsWith('kube')"}
         *             <p>
         *             The <code>apiVersion</code>, <code>kind</code>, <code>metadata.name</code> and <code>metadata.generateName</code> are always accessible from the root of the object and from any x-kubernetes-embedded-resource annotated objects. No other metadata properties are accessible.
         *             <p>
         *             Unknown data preserved in custom resources via x-kubernetes-preserve-unknown-fields is not accessible in CEL expressions. This includes: - Unknown field values that are preserved by object schemas with x-kubernetes-preserve-unknown-fields. - Object properties where the property schema is of an "unknown type". An "unknown type" is recursively defined as:
         *             <p>
         *             <ul>
         *             <li>A schema with no type and x-kubernetes-preserve-unknown-fields set to true</li>
         *             <li>An array where the items schema is of an "unknown type"</li>
         *             <li>An object where the additionalProperties schema is of an "unknown type"</li>
         *             </ul>
         *             <p>
         *             Only property names of the form <code>[a-zA-Z_.-/][a-zA-Z0-9_.-/]*</code> are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - '<strong>' escapes to '<strong>underscores</strong>' - '.' escapes to '<strong>dot</strong>' - '-' escapes to '<strong>dash</strong>' - '/' escapes to '<strong>slash</strong>' - Property names that exactly match a CEL RESERVED keyword escape to '</strong>{keyword}__'. The keywords are:
         *             "true", "false", "null", "in", "as", "break", "const", "continue", "else", "for", "function", "if",
         *             "import", "let", "loop", "package", "namespace", "return".
         *             Examples:
         *             <p>
         *             <ul>
         *             <li>Rule accessing a property named "namespace": {"rule": "self.<strong>namespace</strong> &gt; 0"}</li>
         *             <li>Rule accessing a property named "x-prop": {"rule": "self.x__dash__prop &gt; 0"}</li>
         *             <li>Rule accessing a property named "redact__d": {"rule": "self.redact__underscores__d &gt; 0"}</li>
         *             </ul>
         *             <p>
         *             Equality on arrays with x-kubernetes-list-type of 'set' or 'map' ignores element order, i.e. [1, 2] == [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:
         *             <p>
         *             <ul>
         *             <li>'set': <code>X + Y</code> performs a union where the array positions of all elements in <code>X</code> are preserved and
         *             non-intersecting elements in <code>Y</code> are appended, retaining their partial order.</li>
         *             <li>'map': <code>X + Y</code> performs a merge where the array positions of all keys in <code>X</code> are preserved but the values
         *             are overwritten by values in <code>Y</code> when the key sets of <code>X</code> and <code>Y</code> intersect. Elements in <code>Y</code> with
         *             non-intersecting keys are appended, retaining their partial order.</li>
         *             </ul>
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link ValidationRule#getMessage}
         * @param message Message represents the message displayed when validation fails.
         *                The message is required if the Rule contains line breaks. The message must not contain line breaks. If unset, the message is "failed rule: {Rule}". e.g. "must be a URL with the host matching spec.host"
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidationRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidationRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ValidationRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidationRule {
        private final java.lang.String rule;
        private final java.lang.String message;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rule = java.util.Objects.requireNonNull(builder.rule, "rule is required");
            this.message = builder.message;
        }

        @Override
        public final java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rule", om.valueToTree(this.getRule()));
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ValidationRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidationRule.Jsii$Proxy that = (ValidationRule.Jsii$Proxy) o;

            if (!rule.equals(that.rule)) return false;
            return this.message != null ? this.message.equals(that.message) : that.message == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rule.hashCode();
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            return result;
        }
    }
}
