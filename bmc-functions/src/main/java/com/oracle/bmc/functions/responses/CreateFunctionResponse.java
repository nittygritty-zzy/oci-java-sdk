/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.responses;

import com.oracle.bmc.functions.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class CreateFunctionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. Add this value to the {@code if-match} parameter in a PUT
     * or DELETE operation. The resource will be updated only if the value you provide matches the
     * {@code etag} on the resource.
     */
    private String etag;

    /**
     * For optimistic concurrency control. Add this value to the {@code if-match} parameter in a PUT
     * or DELETE operation. The resource will be updated only if the value you provide matches the
     * {@code etag} on the resource.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code Function} instance. */
    private com.oracle.bmc.functions.model.Function function;

    /**
     * The returned {@code Function} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.functions.model.Function getFunction() {
        return function;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "function"
    })
    private CreateFunctionResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.functions.model.Function function) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.function = function;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateFunctionResponse> {
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

        /**
         * For optimistic concurrency control. Add this value to the {@code if-match} parameter in a
         * PUT or DELETE operation. The resource will be updated only if the value you provide
         * matches the {@code etag} on the resource.
         */
        private String etag;

        /**
         * For optimistic concurrency control. Add this value to the {@code if-match} parameter in a
         * PUT or DELETE operation. The resource will be updated only if the value you provide
         * matches the {@code etag} on the resource.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code Function} instance. */
        private com.oracle.bmc.functions.model.Function function;

        /**
         * The returned {@code Function} instance.
         *
         * @param function the value to set
         * @return this builder
         */
        public Builder function(com.oracle.bmc.functions.model.Function function) {
            this.function = function;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateFunctionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            function(o.getFunction());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateFunctionResponse build() {
            return new CreateFunctionResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, function);
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
        sb.append(",function=").append(String.valueOf(function));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFunctionResponse)) {
            return false;
        }

        CreateFunctionResponse other = (CreateFunctionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.function, other.function);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.function == null ? 43 : this.function.hashCode());
        return result;
    }
}
