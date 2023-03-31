package imports.k8s;

/**
 * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.858Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.JsonSchemaProps")
@software.amazon.jsii.Jsii.Proxy(JsonSchemaProps.Jsii$Proxy.class)
public interface JsonSchemaProps extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAdditionalItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAdditionalProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.JsonSchemaProps> getAllOf() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.JsonSchemaProps> getAnyOf() {
        return null;
    }

    /**
     * default is a default value for undefined object fields.
     * <p>
     * Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDefaultValue() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> getDefinitions() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getDependencies() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.Object> getEnumValue() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getExample() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExclusiveMaximum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExclusiveMinimum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ExternalDocumentation getExternalDocs() {
        return null;
    }

    /**
     * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:.
     * <p>
     * <ul>
     * <li>bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFormat() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxLength() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinimum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinLength() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMultipleOf() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.JsonSchemaProps getNot() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getNullable() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.JsonSchemaProps> getOneOf() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPattern() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> getPatternProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> getProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRef() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRequired() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSchema() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTitle() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUniqueItems() {
        return null;
    }

    /**
     * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getXKubernetesEmbeddedResource() {
        return null;
    }

    /**
     * x-kubernetes-int-or-string specifies that this value is either an integer or a string.
     * <p>
     * If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
     * <p>
     * <ol>
     * <li>anyOf:</li>
     * </ol>
     * <p>
     * <ul>
     * <li>type: integer</li>
     * <li>type: string</li>
     * </ul>
     * <p>
     * <ol>
     * <li>allOf:</li>
     * </ol>
     * <p>
     * <ul>
     * <li>anyOf:</li>
     * <li>type: integer</li>
     * <li>type: string</li>
     * <li>... zero or more</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getXKubernetesIntOrString() {
        return null;
    }

    /**
     * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
     * <p>
     * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
     * <p>
     * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getXKubernetesListMapKeys() {
        return null;
    }

    /**
     * x-kubernetes-list-type annotates an array to further describe its topology.
     * <p>
     * This extension must only be used on lists and may have 3 possible values:
     * <p>
     * <ol>
     * <li><code>atomic</code>: the list is treated as a single entity, like a scalar.
     * Atomic lists will be entirely replaced when updated. This extension
     * may be used on any type of list (struct, scalar, ...).</li>
     * <li><code>set</code>:
     * Sets are lists that must not have multiple items with the same value. Each
     * value must be a scalar, an object with x-kubernetes-map-type <code>atomic</code> or an
     * array with x-kubernetes-list-type <code>atomic</code>.</li>
     * <li><code>map</code>:
     * These lists are like maps in that their elements have a non-index key
     * used to identify them. Order is preserved upon merge. The map tag
     * must only be used on a list with elements of type object.
     * Defaults to atomic for arrays.</li>
     * </ol>
     * <p>
     * Default: atomic for arrays.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getXKubernetesListType() {
        return null;
    }

    /**
     * x-kubernetes-map-type annotates an object to further describe its topology.
     * <p>
     * This extension must only be used when type is object and may have 2 possible values:
     * <p>
     * <ol>
     * <li><code>granular</code>:
     * These maps are actual maps (key-value pairs) and each fields are independent
     * from each other (they can each be manipulated by separate actors). This is
     * the default behaviour for all maps.</li>
     * <li><code>atomic</code>: the list is treated as a single entity, like a scalar.
     * Atomic maps will be entirely replaced when updated.</li>
     * </ol>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getXKubernetesMapType() {
        return null;
    }

    /**
     * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema.
     * <p>
     * This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getXKubernetesPreserveUnknownFields() {
        return null;
    }

    /**
     * x-kubernetes-validations describes a list of validation rules written in the CEL expression language.
     * <p>
     * This field is an alpha-level. Using this field requires the feature gate <code>CustomResourceValidationExpressions</code> to be enabled.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ValidationRule> getXKubernetesValidations() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JsonSchemaProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JsonSchemaProps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<JsonSchemaProps> {
        java.lang.Object additionalItems;
        java.lang.Object additionalProperties;
        java.util.List<imports.k8s.JsonSchemaProps> allOf;
        java.util.List<imports.k8s.JsonSchemaProps> anyOf;
        java.lang.Object defaultValue;
        java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> definitions;
        java.util.Map<java.lang.String, java.lang.Object> dependencies;
        java.lang.String description;
        java.util.List<java.lang.Object> enumValue;
        java.lang.Object example;
        java.lang.Boolean exclusiveMaximum;
        java.lang.Boolean exclusiveMinimum;
        imports.k8s.ExternalDocumentation externalDocs;
        java.lang.String format;
        java.lang.String id;
        java.lang.Object items;
        java.lang.Number maximum;
        java.lang.Number maxItems;
        java.lang.Number maxLength;
        java.lang.Number maxProperties;
        java.lang.Number minimum;
        java.lang.Number minItems;
        java.lang.Number minLength;
        java.lang.Number minProperties;
        java.lang.Number multipleOf;
        imports.k8s.JsonSchemaProps not;
        java.lang.Boolean nullable;
        java.util.List<imports.k8s.JsonSchemaProps> oneOf;
        java.lang.String pattern;
        java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> patternProperties;
        java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> properties;
        java.lang.String ref;
        java.util.List<java.lang.String> required;
        java.lang.String schema;
        java.lang.String title;
        java.lang.String type;
        java.lang.Boolean uniqueItems;
        java.lang.Boolean xKubernetesEmbeddedResource;
        java.lang.Boolean xKubernetesIntOrString;
        java.util.List<java.lang.String> xKubernetesListMapKeys;
        java.lang.String xKubernetesListType;
        java.lang.String xKubernetesMapType;
        java.lang.Boolean xKubernetesPreserveUnknownFields;
        java.util.List<imports.k8s.ValidationRule> xKubernetesValidations;

        /**
         * Sets the value of {@link JsonSchemaProps#getAdditionalItems}
         * @param additionalItems the value to be set.
         * @return {@code this}
         */
        public Builder additionalItems(java.lang.Object additionalItems) {
            this.additionalItems = additionalItems;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getAdditionalProperties}
         * @param additionalProperties the value to be set.
         * @return {@code this}
         */
        public Builder additionalProperties(java.lang.Object additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getAllOf}
         * @param allOf the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder allOf(java.util.List<? extends imports.k8s.JsonSchemaProps> allOf) {
            this.allOf = (java.util.List<imports.k8s.JsonSchemaProps>)allOf;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getAnyOf}
         * @param anyOf the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder anyOf(java.util.List<? extends imports.k8s.JsonSchemaProps> anyOf) {
            this.anyOf = (java.util.List<imports.k8s.JsonSchemaProps>)anyOf;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getDefaultValue}
         * @param defaultValue default is a default value for undefined object fields.
         *                     Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
         * @return {@code this}
         */
        public Builder defaultValue(java.lang.Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getDefinitions}
         * @param definitions the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder definitions(java.util.Map<java.lang.String, ? extends imports.k8s.JsonSchemaProps> definitions) {
            this.definitions = (java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps>)definitions;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getDependencies}
         * @param dependencies the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder dependencies(java.util.Map<java.lang.String, ? extends java.lang.Object> dependencies) {
            this.dependencies = (java.util.Map<java.lang.String, java.lang.Object>)dependencies;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getEnumValue}
         * @param enumValue the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder enumValue(java.util.List<? extends java.lang.Object> enumValue) {
            this.enumValue = (java.util.List<java.lang.Object>)enumValue;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getExample}
         * @param example the value to be set.
         * @return {@code this}
         */
        public Builder example(java.lang.Object example) {
            this.example = example;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getExclusiveMaximum}
         * @param exclusiveMaximum the value to be set.
         * @return {@code this}
         */
        public Builder exclusiveMaximum(java.lang.Boolean exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getExclusiveMinimum}
         * @param exclusiveMinimum the value to be set.
         * @return {@code this}
         */
        public Builder exclusiveMinimum(java.lang.Boolean exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getExternalDocs}
         * @param externalDocs the value to be set.
         * @return {@code this}
         */
        public Builder externalDocs(imports.k8s.ExternalDocumentation externalDocs) {
            this.externalDocs = externalDocs;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getFormat}
         * @param format format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:.
         *               <ul>
         *               <li>bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.</li>
         *               </ul>
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getItems}
         * @param items the value to be set.
         * @return {@code this}
         */
        public Builder items(java.lang.Object items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMaximum}
         * @param maximum the value to be set.
         * @return {@code this}
         */
        public Builder maximum(java.lang.Number maximum) {
            this.maximum = maximum;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMaxItems}
         * @param maxItems the value to be set.
         * @return {@code this}
         */
        public Builder maxItems(java.lang.Number maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMaxLength}
         * @param maxLength the value to be set.
         * @return {@code this}
         */
        public Builder maxLength(java.lang.Number maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMaxProperties}
         * @param maxProperties the value to be set.
         * @return {@code this}
         */
        public Builder maxProperties(java.lang.Number maxProperties) {
            this.maxProperties = maxProperties;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMinimum}
         * @param minimum the value to be set.
         * @return {@code this}
         */
        public Builder minimum(java.lang.Number minimum) {
            this.minimum = minimum;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMinItems}
         * @param minItems the value to be set.
         * @return {@code this}
         */
        public Builder minItems(java.lang.Number minItems) {
            this.minItems = minItems;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMinLength}
         * @param minLength the value to be set.
         * @return {@code this}
         */
        public Builder minLength(java.lang.Number minLength) {
            this.minLength = minLength;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMinProperties}
         * @param minProperties the value to be set.
         * @return {@code this}
         */
        public Builder minProperties(java.lang.Number minProperties) {
            this.minProperties = minProperties;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getMultipleOf}
         * @param multipleOf the value to be set.
         * @return {@code this}
         */
        public Builder multipleOf(java.lang.Number multipleOf) {
            this.multipleOf = multipleOf;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getNot}
         * @param not the value to be set.
         * @return {@code this}
         */
        public Builder not(imports.k8s.JsonSchemaProps not) {
            this.not = not;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getNullable}
         * @param nullable the value to be set.
         * @return {@code this}
         */
        public Builder nullable(java.lang.Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getOneOf}
         * @param oneOf the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder oneOf(java.util.List<? extends imports.k8s.JsonSchemaProps> oneOf) {
            this.oneOf = (java.util.List<imports.k8s.JsonSchemaProps>)oneOf;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getPattern}
         * @param pattern the value to be set.
         * @return {@code this}
         */
        public Builder pattern(java.lang.String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getPatternProperties}
         * @param patternProperties the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder patternProperties(java.util.Map<java.lang.String, ? extends imports.k8s.JsonSchemaProps> patternProperties) {
            this.patternProperties = (java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps>)patternProperties;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getProperties}
         * @param properties the value to be set.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder properties(java.util.Map<java.lang.String, ? extends imports.k8s.JsonSchemaProps> properties) {
            this.properties = (java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps>)properties;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getRef}
         * @param ref the value to be set.
         * @return {@code this}
         */
        public Builder ref(java.lang.String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getRequired}
         * @param required the value to be set.
         * @return {@code this}
         */
        public Builder required(java.util.List<java.lang.String> required) {
            this.required = required;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getSchema}
         * @param schema the value to be set.
         * @return {@code this}
         */
        public Builder schema(java.lang.String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getTitle}
         * @param title the value to be set.
         * @return {@code this}
         */
        public Builder title(java.lang.String title) {
            this.title = title;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getUniqueItems}
         * @param uniqueItems the value to be set.
         * @return {@code this}
         */
        public Builder uniqueItems(java.lang.Boolean uniqueItems) {
            this.uniqueItems = uniqueItems;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getXKubernetesEmbeddedResource}
         * @param xKubernetesEmbeddedResource x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
         * @return {@code this}
         */
        public Builder xKubernetesEmbeddedResource(java.lang.Boolean xKubernetesEmbeddedResource) {
            this.xKubernetesEmbeddedResource = xKubernetesEmbeddedResource;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getXKubernetesIntOrString}
         * @param xKubernetesIntOrString x-kubernetes-int-or-string specifies that this value is either an integer or a string.
         *                               If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
         *                               <p>
         *                               <ol>
         *                               <li>anyOf:</li>
         *                               </ol>
         *                               <p>
         *                               <ul>
         *                               <li>type: integer</li>
         *                               <li>type: string</li>
         *                               </ul>
         *                               <p>
         *                               <ol>
         *                               <li>allOf:</li>
         *                               </ol>
         *                               <p>
         *                               <ul>
         *                               <li>anyOf:</li>
         *                               <li>type: integer</li>
         *                               <li>type: string</li>
         *                               <li>... zero or more</li>
         *                               </ul>
         * @return {@code this}
         */
        public Builder xKubernetesIntOrString(java.lang.Boolean xKubernetesIntOrString) {
            this.xKubernetesIntOrString = xKubernetesIntOrString;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getXKubernetesListMapKeys}
         * @param xKubernetesListMapKeys x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
         *                               This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
         *                               <p>
         *                               The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
         * @return {@code this}
         */
        public Builder xKubernetesListMapKeys(java.util.List<java.lang.String> xKubernetesListMapKeys) {
            this.xKubernetesListMapKeys = xKubernetesListMapKeys;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getXKubernetesListType}
         * @param xKubernetesListType x-kubernetes-list-type annotates an array to further describe its topology.
         *                            This extension must only be used on lists and may have 3 possible values:
         *                            <p>
         *                            <ol>
         *                            <li><code>atomic</code>: the list is treated as a single entity, like a scalar.
         *                            Atomic lists will be entirely replaced when updated. This extension
         *                            may be used on any type of list (struct, scalar, ...).</li>
         *                            <li><code>set</code>:
         *                            Sets are lists that must not have multiple items with the same value. Each
         *                            value must be a scalar, an object with x-kubernetes-map-type <code>atomic</code> or an
         *                            array with x-kubernetes-list-type <code>atomic</code>.</li>
         *                            <li><code>map</code>:
         *                            These lists are like maps in that their elements have a non-index key
         *                            used to identify them. Order is preserved upon merge. The map tag
         *                            must only be used on a list with elements of type object.
         *                            Defaults to atomic for arrays.</li>
         *                            </ol>
         * @return {@code this}
         */
        public Builder xKubernetesListType(java.lang.String xKubernetesListType) {
            this.xKubernetesListType = xKubernetesListType;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getXKubernetesMapType}
         * @param xKubernetesMapType x-kubernetes-map-type annotates an object to further describe its topology.
         *                           This extension must only be used when type is object and may have 2 possible values:
         *                           <p>
         *                           <ol>
         *                           <li><code>granular</code>:
         *                           These maps are actual maps (key-value pairs) and each fields are independent
         *                           from each other (they can each be manipulated by separate actors). This is
         *                           the default behaviour for all maps.</li>
         *                           <li><code>atomic</code>: the list is treated as a single entity, like a scalar.
         *                           Atomic maps will be entirely replaced when updated.</li>
         *                           </ol>
         * @return {@code this}
         */
        public Builder xKubernetesMapType(java.lang.String xKubernetesMapType) {
            this.xKubernetesMapType = xKubernetesMapType;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getXKubernetesPreserveUnknownFields}
         * @param xKubernetesPreserveUnknownFields x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema.
         *                                         This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
         * @return {@code this}
         */
        public Builder xKubernetesPreserveUnknownFields(java.lang.Boolean xKubernetesPreserveUnknownFields) {
            this.xKubernetesPreserveUnknownFields = xKubernetesPreserveUnknownFields;
            return this;
        }

        /**
         * Sets the value of {@link JsonSchemaProps#getXKubernetesValidations}
         * @param xKubernetesValidations x-kubernetes-validations describes a list of validation rules written in the CEL expression language.
         *                               This field is an alpha-level. Using this field requires the feature gate <code>CustomResourceValidationExpressions</code> to be enabled.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder xKubernetesValidations(java.util.List<? extends imports.k8s.ValidationRule> xKubernetesValidations) {
            this.xKubernetesValidations = (java.util.List<imports.k8s.ValidationRule>)xKubernetesValidations;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JsonSchemaProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public JsonSchemaProps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link JsonSchemaProps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JsonSchemaProps {
        private final java.lang.Object additionalItems;
        private final java.lang.Object additionalProperties;
        private final java.util.List<imports.k8s.JsonSchemaProps> allOf;
        private final java.util.List<imports.k8s.JsonSchemaProps> anyOf;
        private final java.lang.Object defaultValue;
        private final java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> definitions;
        private final java.util.Map<java.lang.String, java.lang.Object> dependencies;
        private final java.lang.String description;
        private final java.util.List<java.lang.Object> enumValue;
        private final java.lang.Object example;
        private final java.lang.Boolean exclusiveMaximum;
        private final java.lang.Boolean exclusiveMinimum;
        private final imports.k8s.ExternalDocumentation externalDocs;
        private final java.lang.String format;
        private final java.lang.String id;
        private final java.lang.Object items;
        private final java.lang.Number maximum;
        private final java.lang.Number maxItems;
        private final java.lang.Number maxLength;
        private final java.lang.Number maxProperties;
        private final java.lang.Number minimum;
        private final java.lang.Number minItems;
        private final java.lang.Number minLength;
        private final java.lang.Number minProperties;
        private final java.lang.Number multipleOf;
        private final imports.k8s.JsonSchemaProps not;
        private final java.lang.Boolean nullable;
        private final java.util.List<imports.k8s.JsonSchemaProps> oneOf;
        private final java.lang.String pattern;
        private final java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> patternProperties;
        private final java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> properties;
        private final java.lang.String ref;
        private final java.util.List<java.lang.String> required;
        private final java.lang.String schema;
        private final java.lang.String title;
        private final java.lang.String type;
        private final java.lang.Boolean uniqueItems;
        private final java.lang.Boolean xKubernetesEmbeddedResource;
        private final java.lang.Boolean xKubernetesIntOrString;
        private final java.util.List<java.lang.String> xKubernetesListMapKeys;
        private final java.lang.String xKubernetesListType;
        private final java.lang.String xKubernetesMapType;
        private final java.lang.Boolean xKubernetesPreserveUnknownFields;
        private final java.util.List<imports.k8s.ValidationRule> xKubernetesValidations;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.additionalItems = software.amazon.jsii.Kernel.get(this, "additionalItems", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.additionalProperties = software.amazon.jsii.Kernel.get(this, "additionalProperties", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.allOf = software.amazon.jsii.Kernel.get(this, "allOf", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.JsonSchemaProps.class)));
            this.anyOf = software.amazon.jsii.Kernel.get(this, "anyOf", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.JsonSchemaProps.class)));
            this.defaultValue = software.amazon.jsii.Kernel.get(this, "default", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.definitions = software.amazon.jsii.Kernel.get(this, "definitions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.JsonSchemaProps.class)));
            this.dependencies = software.amazon.jsii.Kernel.get(this, "dependencies", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enumValue = software.amazon.jsii.Kernel.get(this, "enum", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.example = software.amazon.jsii.Kernel.get(this, "example", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.exclusiveMaximum = software.amazon.jsii.Kernel.get(this, "exclusiveMaximum", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.exclusiveMinimum = software.amazon.jsii.Kernel.get(this, "exclusiveMinimum", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.externalDocs = software.amazon.jsii.Kernel.get(this, "externalDocs", software.amazon.jsii.NativeType.forClass(imports.k8s.ExternalDocumentation.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maximum = software.amazon.jsii.Kernel.get(this, "maximum", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxItems = software.amazon.jsii.Kernel.get(this, "maxItems", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxLength = software.amazon.jsii.Kernel.get(this, "maxLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxProperties = software.amazon.jsii.Kernel.get(this, "maxProperties", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minimum = software.amazon.jsii.Kernel.get(this, "minimum", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minItems = software.amazon.jsii.Kernel.get(this, "minItems", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minLength = software.amazon.jsii.Kernel.get(this, "minLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minProperties = software.amazon.jsii.Kernel.get(this, "minProperties", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.multipleOf = software.amazon.jsii.Kernel.get(this, "multipleOf", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.not = software.amazon.jsii.Kernel.get(this, "not", software.amazon.jsii.NativeType.forClass(imports.k8s.JsonSchemaProps.class));
            this.nullable = software.amazon.jsii.Kernel.get(this, "nullable", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.oneOf = software.amazon.jsii.Kernel.get(this, "oneOf", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.JsonSchemaProps.class)));
            this.pattern = software.amazon.jsii.Kernel.get(this, "pattern", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.patternProperties = software.amazon.jsii.Kernel.get(this, "patternProperties", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.JsonSchemaProps.class)));
            this.properties = software.amazon.jsii.Kernel.get(this, "properties", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.JsonSchemaProps.class)));
            this.ref = software.amazon.jsii.Kernel.get(this, "ref", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.required = software.amazon.jsii.Kernel.get(this, "required", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.title = software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.uniqueItems = software.amazon.jsii.Kernel.get(this, "uniqueItems", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.xKubernetesEmbeddedResource = software.amazon.jsii.Kernel.get(this, "xKubernetesEmbeddedResource", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.xKubernetesIntOrString = software.amazon.jsii.Kernel.get(this, "xKubernetesIntOrString", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.xKubernetesListMapKeys = software.amazon.jsii.Kernel.get(this, "xKubernetesListMapKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.xKubernetesListType = software.amazon.jsii.Kernel.get(this, "xKubernetesListType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.xKubernetesMapType = software.amazon.jsii.Kernel.get(this, "xKubernetesMapType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.xKubernetesPreserveUnknownFields = software.amazon.jsii.Kernel.get(this, "xKubernetesPreserveUnknownFields", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.xKubernetesValidations = software.amazon.jsii.Kernel.get(this, "xKubernetesValidations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ValidationRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.additionalItems = builder.additionalItems;
            this.additionalProperties = builder.additionalProperties;
            this.allOf = (java.util.List<imports.k8s.JsonSchemaProps>)builder.allOf;
            this.anyOf = (java.util.List<imports.k8s.JsonSchemaProps>)builder.anyOf;
            this.defaultValue = builder.defaultValue;
            this.definitions = (java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps>)builder.definitions;
            this.dependencies = (java.util.Map<java.lang.String, java.lang.Object>)builder.dependencies;
            this.description = builder.description;
            this.enumValue = (java.util.List<java.lang.Object>)builder.enumValue;
            this.example = builder.example;
            this.exclusiveMaximum = builder.exclusiveMaximum;
            this.exclusiveMinimum = builder.exclusiveMinimum;
            this.externalDocs = builder.externalDocs;
            this.format = builder.format;
            this.id = builder.id;
            this.items = builder.items;
            this.maximum = builder.maximum;
            this.maxItems = builder.maxItems;
            this.maxLength = builder.maxLength;
            this.maxProperties = builder.maxProperties;
            this.minimum = builder.minimum;
            this.minItems = builder.minItems;
            this.minLength = builder.minLength;
            this.minProperties = builder.minProperties;
            this.multipleOf = builder.multipleOf;
            this.not = builder.not;
            this.nullable = builder.nullable;
            this.oneOf = (java.util.List<imports.k8s.JsonSchemaProps>)builder.oneOf;
            this.pattern = builder.pattern;
            this.patternProperties = (java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps>)builder.patternProperties;
            this.properties = (java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps>)builder.properties;
            this.ref = builder.ref;
            this.required = builder.required;
            this.schema = builder.schema;
            this.title = builder.title;
            this.type = builder.type;
            this.uniqueItems = builder.uniqueItems;
            this.xKubernetesEmbeddedResource = builder.xKubernetesEmbeddedResource;
            this.xKubernetesIntOrString = builder.xKubernetesIntOrString;
            this.xKubernetesListMapKeys = builder.xKubernetesListMapKeys;
            this.xKubernetesListType = builder.xKubernetesListType;
            this.xKubernetesMapType = builder.xKubernetesMapType;
            this.xKubernetesPreserveUnknownFields = builder.xKubernetesPreserveUnknownFields;
            this.xKubernetesValidations = (java.util.List<imports.k8s.ValidationRule>)builder.xKubernetesValidations;
        }

        @Override
        public final java.lang.Object getAdditionalItems() {
            return this.additionalItems;
        }

        @Override
        public final java.lang.Object getAdditionalProperties() {
            return this.additionalProperties;
        }

        @Override
        public final java.util.List<imports.k8s.JsonSchemaProps> getAllOf() {
            return this.allOf;
        }

        @Override
        public final java.util.List<imports.k8s.JsonSchemaProps> getAnyOf() {
            return this.anyOf;
        }

        @Override
        public final java.lang.Object getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> getDefinitions() {
            return this.definitions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getDependencies() {
            return this.dependencies;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.util.List<java.lang.Object> getEnumValue() {
            return this.enumValue;
        }

        @Override
        public final java.lang.Object getExample() {
            return this.example;
        }

        @Override
        public final java.lang.Boolean getExclusiveMaximum() {
            return this.exclusiveMaximum;
        }

        @Override
        public final java.lang.Boolean getExclusiveMinimum() {
            return this.exclusiveMinimum;
        }

        @Override
        public final imports.k8s.ExternalDocumentation getExternalDocs() {
            return this.externalDocs;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getItems() {
            return this.items;
        }

        @Override
        public final java.lang.Number getMaximum() {
            return this.maximum;
        }

        @Override
        public final java.lang.Number getMaxItems() {
            return this.maxItems;
        }

        @Override
        public final java.lang.Number getMaxLength() {
            return this.maxLength;
        }

        @Override
        public final java.lang.Number getMaxProperties() {
            return this.maxProperties;
        }

        @Override
        public final java.lang.Number getMinimum() {
            return this.minimum;
        }

        @Override
        public final java.lang.Number getMinItems() {
            return this.minItems;
        }

        @Override
        public final java.lang.Number getMinLength() {
            return this.minLength;
        }

        @Override
        public final java.lang.Number getMinProperties() {
            return this.minProperties;
        }

        @Override
        public final java.lang.Number getMultipleOf() {
            return this.multipleOf;
        }

        @Override
        public final imports.k8s.JsonSchemaProps getNot() {
            return this.not;
        }

        @Override
        public final java.lang.Boolean getNullable() {
            return this.nullable;
        }

        @Override
        public final java.util.List<imports.k8s.JsonSchemaProps> getOneOf() {
            return this.oneOf;
        }

        @Override
        public final java.lang.String getPattern() {
            return this.pattern;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> getPatternProperties() {
            return this.patternProperties;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.JsonSchemaProps> getProperties() {
            return this.properties;
        }

        @Override
        public final java.lang.String getRef() {
            return this.ref;
        }

        @Override
        public final java.util.List<java.lang.String> getRequired() {
            return this.required;
        }

        @Override
        public final java.lang.String getSchema() {
            return this.schema;
        }

        @Override
        public final java.lang.String getTitle() {
            return this.title;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Boolean getUniqueItems() {
            return this.uniqueItems;
        }

        @Override
        public final java.lang.Boolean getXKubernetesEmbeddedResource() {
            return this.xKubernetesEmbeddedResource;
        }

        @Override
        public final java.lang.Boolean getXKubernetesIntOrString() {
            return this.xKubernetesIntOrString;
        }

        @Override
        public final java.util.List<java.lang.String> getXKubernetesListMapKeys() {
            return this.xKubernetesListMapKeys;
        }

        @Override
        public final java.lang.String getXKubernetesListType() {
            return this.xKubernetesListType;
        }

        @Override
        public final java.lang.String getXKubernetesMapType() {
            return this.xKubernetesMapType;
        }

        @Override
        public final java.lang.Boolean getXKubernetesPreserveUnknownFields() {
            return this.xKubernetesPreserveUnknownFields;
        }

        @Override
        public final java.util.List<imports.k8s.ValidationRule> getXKubernetesValidations() {
            return this.xKubernetesValidations;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAdditionalItems() != null) {
                data.set("additionalItems", om.valueToTree(this.getAdditionalItems()));
            }
            if (this.getAdditionalProperties() != null) {
                data.set("additionalProperties", om.valueToTree(this.getAdditionalProperties()));
            }
            if (this.getAllOf() != null) {
                data.set("allOf", om.valueToTree(this.getAllOf()));
            }
            if (this.getAnyOf() != null) {
                data.set("anyOf", om.valueToTree(this.getAnyOf()));
            }
            if (this.getDefaultValue() != null) {
                data.set("default", om.valueToTree(this.getDefaultValue()));
            }
            if (this.getDefinitions() != null) {
                data.set("definitions", om.valueToTree(this.getDefinitions()));
            }
            if (this.getDependencies() != null) {
                data.set("dependencies", om.valueToTree(this.getDependencies()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEnumValue() != null) {
                data.set("enum", om.valueToTree(this.getEnumValue()));
            }
            if (this.getExample() != null) {
                data.set("example", om.valueToTree(this.getExample()));
            }
            if (this.getExclusiveMaximum() != null) {
                data.set("exclusiveMaximum", om.valueToTree(this.getExclusiveMaximum()));
            }
            if (this.getExclusiveMinimum() != null) {
                data.set("exclusiveMinimum", om.valueToTree(this.getExclusiveMinimum()));
            }
            if (this.getExternalDocs() != null) {
                data.set("externalDocs", om.valueToTree(this.getExternalDocs()));
            }
            if (this.getFormat() != null) {
                data.set("format", om.valueToTree(this.getFormat()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }
            if (this.getMaximum() != null) {
                data.set("maximum", om.valueToTree(this.getMaximum()));
            }
            if (this.getMaxItems() != null) {
                data.set("maxItems", om.valueToTree(this.getMaxItems()));
            }
            if (this.getMaxLength() != null) {
                data.set("maxLength", om.valueToTree(this.getMaxLength()));
            }
            if (this.getMaxProperties() != null) {
                data.set("maxProperties", om.valueToTree(this.getMaxProperties()));
            }
            if (this.getMinimum() != null) {
                data.set("minimum", om.valueToTree(this.getMinimum()));
            }
            if (this.getMinItems() != null) {
                data.set("minItems", om.valueToTree(this.getMinItems()));
            }
            if (this.getMinLength() != null) {
                data.set("minLength", om.valueToTree(this.getMinLength()));
            }
            if (this.getMinProperties() != null) {
                data.set("minProperties", om.valueToTree(this.getMinProperties()));
            }
            if (this.getMultipleOf() != null) {
                data.set("multipleOf", om.valueToTree(this.getMultipleOf()));
            }
            if (this.getNot() != null) {
                data.set("not", om.valueToTree(this.getNot()));
            }
            if (this.getNullable() != null) {
                data.set("nullable", om.valueToTree(this.getNullable()));
            }
            if (this.getOneOf() != null) {
                data.set("oneOf", om.valueToTree(this.getOneOf()));
            }
            if (this.getPattern() != null) {
                data.set("pattern", om.valueToTree(this.getPattern()));
            }
            if (this.getPatternProperties() != null) {
                data.set("patternProperties", om.valueToTree(this.getPatternProperties()));
            }
            if (this.getProperties() != null) {
                data.set("properties", om.valueToTree(this.getProperties()));
            }
            if (this.getRef() != null) {
                data.set("ref", om.valueToTree(this.getRef()));
            }
            if (this.getRequired() != null) {
                data.set("required", om.valueToTree(this.getRequired()));
            }
            if (this.getSchema() != null) {
                data.set("schema", om.valueToTree(this.getSchema()));
            }
            if (this.getTitle() != null) {
                data.set("title", om.valueToTree(this.getTitle()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getUniqueItems() != null) {
                data.set("uniqueItems", om.valueToTree(this.getUniqueItems()));
            }
            if (this.getXKubernetesEmbeddedResource() != null) {
                data.set("xKubernetesEmbeddedResource", om.valueToTree(this.getXKubernetesEmbeddedResource()));
            }
            if (this.getXKubernetesIntOrString() != null) {
                data.set("xKubernetesIntOrString", om.valueToTree(this.getXKubernetesIntOrString()));
            }
            if (this.getXKubernetesListMapKeys() != null) {
                data.set("xKubernetesListMapKeys", om.valueToTree(this.getXKubernetesListMapKeys()));
            }
            if (this.getXKubernetesListType() != null) {
                data.set("xKubernetesListType", om.valueToTree(this.getXKubernetesListType()));
            }
            if (this.getXKubernetesMapType() != null) {
                data.set("xKubernetesMapType", om.valueToTree(this.getXKubernetesMapType()));
            }
            if (this.getXKubernetesPreserveUnknownFields() != null) {
                data.set("xKubernetesPreserveUnknownFields", om.valueToTree(this.getXKubernetesPreserveUnknownFields()));
            }
            if (this.getXKubernetesValidations() != null) {
                data.set("xKubernetesValidations", om.valueToTree(this.getXKubernetesValidations()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.JsonSchemaProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JsonSchemaProps.Jsii$Proxy that = (JsonSchemaProps.Jsii$Proxy) o;

            if (this.additionalItems != null ? !this.additionalItems.equals(that.additionalItems) : that.additionalItems != null) return false;
            if (this.additionalProperties != null ? !this.additionalProperties.equals(that.additionalProperties) : that.additionalProperties != null) return false;
            if (this.allOf != null ? !this.allOf.equals(that.allOf) : that.allOf != null) return false;
            if (this.anyOf != null ? !this.anyOf.equals(that.anyOf) : that.anyOf != null) return false;
            if (this.defaultValue != null ? !this.defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
            if (this.definitions != null ? !this.definitions.equals(that.definitions) : that.definitions != null) return false;
            if (this.dependencies != null ? !this.dependencies.equals(that.dependencies) : that.dependencies != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.enumValue != null ? !this.enumValue.equals(that.enumValue) : that.enumValue != null) return false;
            if (this.example != null ? !this.example.equals(that.example) : that.example != null) return false;
            if (this.exclusiveMaximum != null ? !this.exclusiveMaximum.equals(that.exclusiveMaximum) : that.exclusiveMaximum != null) return false;
            if (this.exclusiveMinimum != null ? !this.exclusiveMinimum.equals(that.exclusiveMinimum) : that.exclusiveMinimum != null) return false;
            if (this.externalDocs != null ? !this.externalDocs.equals(that.externalDocs) : that.externalDocs != null) return false;
            if (this.format != null ? !this.format.equals(that.format) : that.format != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.items != null ? !this.items.equals(that.items) : that.items != null) return false;
            if (this.maximum != null ? !this.maximum.equals(that.maximum) : that.maximum != null) return false;
            if (this.maxItems != null ? !this.maxItems.equals(that.maxItems) : that.maxItems != null) return false;
            if (this.maxLength != null ? !this.maxLength.equals(that.maxLength) : that.maxLength != null) return false;
            if (this.maxProperties != null ? !this.maxProperties.equals(that.maxProperties) : that.maxProperties != null) return false;
            if (this.minimum != null ? !this.minimum.equals(that.minimum) : that.minimum != null) return false;
            if (this.minItems != null ? !this.minItems.equals(that.minItems) : that.minItems != null) return false;
            if (this.minLength != null ? !this.minLength.equals(that.minLength) : that.minLength != null) return false;
            if (this.minProperties != null ? !this.minProperties.equals(that.minProperties) : that.minProperties != null) return false;
            if (this.multipleOf != null ? !this.multipleOf.equals(that.multipleOf) : that.multipleOf != null) return false;
            if (this.not != null ? !this.not.equals(that.not) : that.not != null) return false;
            if (this.nullable != null ? !this.nullable.equals(that.nullable) : that.nullable != null) return false;
            if (this.oneOf != null ? !this.oneOf.equals(that.oneOf) : that.oneOf != null) return false;
            if (this.pattern != null ? !this.pattern.equals(that.pattern) : that.pattern != null) return false;
            if (this.patternProperties != null ? !this.patternProperties.equals(that.patternProperties) : that.patternProperties != null) return false;
            if (this.properties != null ? !this.properties.equals(that.properties) : that.properties != null) return false;
            if (this.ref != null ? !this.ref.equals(that.ref) : that.ref != null) return false;
            if (this.required != null ? !this.required.equals(that.required) : that.required != null) return false;
            if (this.schema != null ? !this.schema.equals(that.schema) : that.schema != null) return false;
            if (this.title != null ? !this.title.equals(that.title) : that.title != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.uniqueItems != null ? !this.uniqueItems.equals(that.uniqueItems) : that.uniqueItems != null) return false;
            if (this.xKubernetesEmbeddedResource != null ? !this.xKubernetesEmbeddedResource.equals(that.xKubernetesEmbeddedResource) : that.xKubernetesEmbeddedResource != null) return false;
            if (this.xKubernetesIntOrString != null ? !this.xKubernetesIntOrString.equals(that.xKubernetesIntOrString) : that.xKubernetesIntOrString != null) return false;
            if (this.xKubernetesListMapKeys != null ? !this.xKubernetesListMapKeys.equals(that.xKubernetesListMapKeys) : that.xKubernetesListMapKeys != null) return false;
            if (this.xKubernetesListType != null ? !this.xKubernetesListType.equals(that.xKubernetesListType) : that.xKubernetesListType != null) return false;
            if (this.xKubernetesMapType != null ? !this.xKubernetesMapType.equals(that.xKubernetesMapType) : that.xKubernetesMapType != null) return false;
            if (this.xKubernetesPreserveUnknownFields != null ? !this.xKubernetesPreserveUnknownFields.equals(that.xKubernetesPreserveUnknownFields) : that.xKubernetesPreserveUnknownFields != null) return false;
            return this.xKubernetesValidations != null ? this.xKubernetesValidations.equals(that.xKubernetesValidations) : that.xKubernetesValidations == null;
        }

        @Override
        public final int hashCode() {
            int result = this.additionalItems != null ? this.additionalItems.hashCode() : 0;
            result = 31 * result + (this.additionalProperties != null ? this.additionalProperties.hashCode() : 0);
            result = 31 * result + (this.allOf != null ? this.allOf.hashCode() : 0);
            result = 31 * result + (this.anyOf != null ? this.anyOf.hashCode() : 0);
            result = 31 * result + (this.defaultValue != null ? this.defaultValue.hashCode() : 0);
            result = 31 * result + (this.definitions != null ? this.definitions.hashCode() : 0);
            result = 31 * result + (this.dependencies != null ? this.dependencies.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.enumValue != null ? this.enumValue.hashCode() : 0);
            result = 31 * result + (this.example != null ? this.example.hashCode() : 0);
            result = 31 * result + (this.exclusiveMaximum != null ? this.exclusiveMaximum.hashCode() : 0);
            result = 31 * result + (this.exclusiveMinimum != null ? this.exclusiveMinimum.hashCode() : 0);
            result = 31 * result + (this.externalDocs != null ? this.externalDocs.hashCode() : 0);
            result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.items != null ? this.items.hashCode() : 0);
            result = 31 * result + (this.maximum != null ? this.maximum.hashCode() : 0);
            result = 31 * result + (this.maxItems != null ? this.maxItems.hashCode() : 0);
            result = 31 * result + (this.maxLength != null ? this.maxLength.hashCode() : 0);
            result = 31 * result + (this.maxProperties != null ? this.maxProperties.hashCode() : 0);
            result = 31 * result + (this.minimum != null ? this.minimum.hashCode() : 0);
            result = 31 * result + (this.minItems != null ? this.minItems.hashCode() : 0);
            result = 31 * result + (this.minLength != null ? this.minLength.hashCode() : 0);
            result = 31 * result + (this.minProperties != null ? this.minProperties.hashCode() : 0);
            result = 31 * result + (this.multipleOf != null ? this.multipleOf.hashCode() : 0);
            result = 31 * result + (this.not != null ? this.not.hashCode() : 0);
            result = 31 * result + (this.nullable != null ? this.nullable.hashCode() : 0);
            result = 31 * result + (this.oneOf != null ? this.oneOf.hashCode() : 0);
            result = 31 * result + (this.pattern != null ? this.pattern.hashCode() : 0);
            result = 31 * result + (this.patternProperties != null ? this.patternProperties.hashCode() : 0);
            result = 31 * result + (this.properties != null ? this.properties.hashCode() : 0);
            result = 31 * result + (this.ref != null ? this.ref.hashCode() : 0);
            result = 31 * result + (this.required != null ? this.required.hashCode() : 0);
            result = 31 * result + (this.schema != null ? this.schema.hashCode() : 0);
            result = 31 * result + (this.title != null ? this.title.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.uniqueItems != null ? this.uniqueItems.hashCode() : 0);
            result = 31 * result + (this.xKubernetesEmbeddedResource != null ? this.xKubernetesEmbeddedResource.hashCode() : 0);
            result = 31 * result + (this.xKubernetesIntOrString != null ? this.xKubernetesIntOrString.hashCode() : 0);
            result = 31 * result + (this.xKubernetesListMapKeys != null ? this.xKubernetesListMapKeys.hashCode() : 0);
            result = 31 * result + (this.xKubernetesListType != null ? this.xKubernetesListType.hashCode() : 0);
            result = 31 * result + (this.xKubernetesMapType != null ? this.xKubernetesMapType.hashCode() : 0);
            result = 31 * result + (this.xKubernetesPreserveUnknownFields != null ? this.xKubernetesPreserveUnknownFields.hashCode() : 0);
            result = 31 * result + (this.xKubernetesValidations != null ? this.xKubernetesValidations.hashCode() : 0);
            return result;
        }
    }
}
