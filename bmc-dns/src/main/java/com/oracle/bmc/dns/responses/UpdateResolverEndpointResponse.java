/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class UpdateResolverEndpointResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The current version of the resource, ending with a representation-specific suffix. This value
     * may be used in If-Match and If-None-Match headers for later requests of the same resource.
     */
    private String etag;

    /**
     * The current version of the resource, ending with a representation-specific suffix. This value
     * may be used in If-Match and If-None-Match headers for later requests of the same resource.
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

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
     * status of the asynchronous operation.
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
     * status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** The returned {@code ResolverEndpoint} instance. */
    private com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint;

    /**
     * The returned {@code ResolverEndpoint} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dns.model.ResolverEndpoint getResolverEndpoint() {
        return resolverEndpoint;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "opcWorkRequestId",
        "resolverEndpoint"
    })
    private UpdateResolverEndpointResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.resolverEndpoint = resolverEndpoint;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    UpdateResolverEndpointResponse> {
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
         * The current version of the resource, ending with a representation-specific suffix. This
         * value may be used in If-Match and If-None-Match headers for later requests of the same
         * resource.
         */
        private String etag;

        /**
         * The current version of the resource, ending with a representation-specific suffix. This
         * value may be used in If-Match and If-None-Match headers for later requests of the same
         * resource.
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

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
         * status of the asynchronous operation.
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query
         * status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** The returned {@code ResolverEndpoint} instance. */
        private com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint;

        /**
         * The returned {@code ResolverEndpoint} instance.
         *
         * @param resolverEndpoint the value to set
         * @return this builder
         */
        public Builder resolverEndpoint(
                com.oracle.bmc.dns.model.ResolverEndpoint resolverEndpoint) {
            this.resolverEndpoint = resolverEndpoint;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateResolverEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            resolverEndpoint(o.getResolverEndpoint());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateResolverEndpointResponse build() {
            return new UpdateResolverEndpointResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    opcWorkRequestId,
                    resolverEndpoint);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",resolverEndpoint=").append(String.valueOf(resolverEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateResolverEndpointResponse)) {
            return false;
        }

        UpdateResolverEndpointResponse other = (UpdateResolverEndpointResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.resolverEndpoint, other.resolverEndpoint);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.resolverEndpoint == null ? 43 : this.resolverEndpoint.hashCode());
        return result;
    }
}
