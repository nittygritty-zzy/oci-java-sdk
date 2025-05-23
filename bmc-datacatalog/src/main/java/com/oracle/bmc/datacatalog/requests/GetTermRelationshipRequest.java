/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetTermRelationshipExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTermRelationshipRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class GetTermRelationshipRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Unique glossary key. */
    private String glossaryKey;

    /** Unique glossary key. */
    public String getGlossaryKey() {
        return glossaryKey;
    }
    /** Unique glossary term key. */
    private String termKey;

    /** Unique glossary term key. */
    public String getTermKey() {
        return termKey;
    }
    /** Unique glossary term relationship key. */
    private String termRelationshipKey;

    /** Unique glossary term relationship key. */
    public String getTermRelationshipKey() {
        return termRelationshipKey;
    }
    /** Specifies the fields to return in a term relationship response. */
    private java.util.List<Fields> fields;

    /** Specifies the fields to return in a term relationship response. */
    public enum Fields implements com.oracle.bmc.http.internal.BmcEnum {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        RelatedTermKey("relatedTermKey"),
        RelatedTermDisplayName("relatedTermDisplayName"),
        ParentTermKey("parentTermKey"),
        ParentTermDisplayName("parentTermDisplayName"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        Uri("uri"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /** Specifies the fields to return in a term relationship response. */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetTermRelationshipRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** Unique glossary key. */
        private String glossaryKey = null;

        /**
         * Unique glossary key.
         *
         * @param glossaryKey the value to set
         * @return this builder instance
         */
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            return this;
        }

        /** Unique glossary term key. */
        private String termKey = null;

        /**
         * Unique glossary term key.
         *
         * @param termKey the value to set
         * @return this builder instance
         */
        public Builder termKey(String termKey) {
            this.termKey = termKey;
            return this;
        }

        /** Unique glossary term relationship key. */
        private String termRelationshipKey = null;

        /**
         * Unique glossary term relationship key.
         *
         * @param termRelationshipKey the value to set
         * @return this builder instance
         */
        public Builder termRelationshipKey(String termRelationshipKey) {
            this.termRelationshipKey = termRelationshipKey;
            return this;
        }

        /** Specifies the fields to return in a term relationship response. */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a term relationship response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a term relationship response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(GetTermRelationshipRequest o) {
            catalogId(o.getCatalogId());
            glossaryKey(o.getGlossaryKey());
            termKey(o.getTermKey());
            termRelationshipKey(o.getTermRelationshipKey());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTermRelationshipRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetTermRelationshipRequest
         */
        public GetTermRelationshipRequest build() {
            GetTermRelationshipRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTermRelationshipRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTermRelationshipRequest
         */
        public GetTermRelationshipRequest buildWithoutInvocationCallback() {
            GetTermRelationshipRequest request = new GetTermRelationshipRequest();
            request.catalogId = catalogId;
            request.glossaryKey = glossaryKey;
            request.termKey = termKey;
            request.termRelationshipKey = termRelationshipKey;
            request.fields = fields;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetTermRelationshipRequest(catalogId, glossaryKey, termKey, termRelationshipKey,
            // fields, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .glossaryKey(glossaryKey)
                .termKey(termKey)
                .termRelationshipKey(termRelationshipKey)
                .fields(fields)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(",termKey=").append(String.valueOf(this.termKey));
        sb.append(",termRelationshipKey=").append(String.valueOf(this.termRelationshipKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTermRelationshipRequest)) {
            return false;
        }

        GetTermRelationshipRequest other = (GetTermRelationshipRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.termKey, other.termKey)
                && java.util.Objects.equals(this.termRelationshipKey, other.termRelationshipKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result = (result * PRIME) + (this.termKey == null ? 43 : this.termKey.hashCode());
        result =
                (result * PRIME)
                        + (this.termRelationshipKey == null
                                ? 43
                                : this.termRelationshipKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
