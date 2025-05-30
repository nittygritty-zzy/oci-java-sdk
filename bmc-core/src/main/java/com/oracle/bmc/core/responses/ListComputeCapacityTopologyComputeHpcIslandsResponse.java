/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListComputeCapacityTopologyComputeHpcIslandsResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
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

    /** The returned {@code ComputeHpcIslandCollection} instance. */
    private com.oracle.bmc.core.model.ComputeHpcIslandCollection computeHpcIslandCollection;

    /**
     * The returned {@code ComputeHpcIslandCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.core.model.ComputeHpcIslandCollection getComputeHpcIslandCollection() {
        return computeHpcIslandCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcRequestId",
        "computeHpcIslandCollection"
    })
    private ListComputeCapacityTopologyComputeHpcIslandsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.core.model.ComputeHpcIslandCollection computeHpcIslandCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.computeHpcIslandCollection = computeHpcIslandCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListComputeCapacityTopologyComputeHpcIslandsResponse> {
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
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
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

        /** The returned {@code ComputeHpcIslandCollection} instance. */
        private com.oracle.bmc.core.model.ComputeHpcIslandCollection computeHpcIslandCollection;

        /**
         * The returned {@code ComputeHpcIslandCollection} instance.
         *
         * @param computeHpcIslandCollection the value to set
         * @return this builder
         */
        public Builder computeHpcIslandCollection(
                com.oracle.bmc.core.model.ComputeHpcIslandCollection computeHpcIslandCollection) {
            this.computeHpcIslandCollection = computeHpcIslandCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListComputeCapacityTopologyComputeHpcIslandsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            computeHpcIslandCollection(o.getComputeHpcIslandCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListComputeCapacityTopologyComputeHpcIslandsResponse build() {
            return new ListComputeCapacityTopologyComputeHpcIslandsResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcRequestId,
                    computeHpcIslandCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",computeHpcIslandCollection=")
                .append(String.valueOf(computeHpcIslandCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListComputeCapacityTopologyComputeHpcIslandsResponse)) {
            return false;
        }

        ListComputeCapacityTopologyComputeHpcIslandsResponse other =
                (ListComputeCapacityTopologyComputeHpcIslandsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.computeHpcIslandCollection, other.computeHpcIslandCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHpcIslandCollection == null
                                ? 43
                                : this.computeHpcIslandCollection.hashCode());
        return result;
    }
}
