/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetTemplateResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code LogAnalyticsTemplate} instance. */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsTemplate logAnalyticsTemplate;

    /**
     * The returned {@code LogAnalyticsTemplate} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.LogAnalyticsTemplate getLogAnalyticsTemplate() {
        return logAnalyticsTemplate;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "logAnalyticsTemplate"
    })
    private GetTemplateResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.LogAnalyticsTemplate logAnalyticsTemplate) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.logAnalyticsTemplate = logAnalyticsTemplate;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetTemplateResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code LogAnalyticsTemplate} instance. */
        private com.oracle.bmc.loganalytics.model.LogAnalyticsTemplate logAnalyticsTemplate;

        /**
         * The returned {@code LogAnalyticsTemplate} instance.
         *
         * @param logAnalyticsTemplate the value to set
         * @return this builder
         */
        public Builder logAnalyticsTemplate(
                com.oracle.bmc.loganalytics.model.LogAnalyticsTemplate logAnalyticsTemplate) {
            this.logAnalyticsTemplate = logAnalyticsTemplate;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetTemplateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            logAnalyticsTemplate(o.getLogAnalyticsTemplate());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetTemplateResponse build() {
            return new GetTemplateResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, logAnalyticsTemplate);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",logAnalyticsTemplate=").append(String.valueOf(logAnalyticsTemplate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTemplateResponse)) {
            return false;
        }

        GetTemplateResponse other = (GetTemplateResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.logAnalyticsTemplate, other.logAnalyticsTemplate);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.logAnalyticsTemplate == null
                                ? 43
                                : this.logAnalyticsTemplate.hashCode());
        return result;
    }
}
