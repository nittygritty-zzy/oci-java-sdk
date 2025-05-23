/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeGpuMemoryFabricExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetComputeGpuMemoryFabricRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetComputeGpuMemoryFabricRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compute GPU memory fabric. */
    private String computeGpuMemoryFabricId;

    /** The OCID of the compute GPU memory fabric. */
    public String getComputeGpuMemoryFabricId() {
        return computeGpuMemoryFabricId;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetComputeGpuMemoryFabricRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compute GPU memory fabric. */
        private String computeGpuMemoryFabricId = null;

        /**
         * The OCID of the compute GPU memory fabric.
         *
         * @param computeGpuMemoryFabricId the value to set
         * @return this builder instance
         */
        public Builder computeGpuMemoryFabricId(String computeGpuMemoryFabricId) {
            this.computeGpuMemoryFabricId = computeGpuMemoryFabricId;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(GetComputeGpuMemoryFabricRequest o) {
            computeGpuMemoryFabricId(o.getComputeGpuMemoryFabricId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetComputeGpuMemoryFabricRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetComputeGpuMemoryFabricRequest
         */
        public GetComputeGpuMemoryFabricRequest build() {
            GetComputeGpuMemoryFabricRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetComputeGpuMemoryFabricRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetComputeGpuMemoryFabricRequest
         */
        public GetComputeGpuMemoryFabricRequest buildWithoutInvocationCallback() {
            GetComputeGpuMemoryFabricRequest request = new GetComputeGpuMemoryFabricRequest();
            request.computeGpuMemoryFabricId = computeGpuMemoryFabricId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetComputeGpuMemoryFabricRequest(computeGpuMemoryFabricId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computeGpuMemoryFabricId(computeGpuMemoryFabricId)
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
        sb.append(",computeGpuMemoryFabricId=")
                .append(String.valueOf(this.computeGpuMemoryFabricId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetComputeGpuMemoryFabricRequest)) {
            return false;
        }

        GetComputeGpuMemoryFabricRequest other = (GetComputeGpuMemoryFabricRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.computeGpuMemoryFabricId, other.computeGpuMemoryFabricId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeGpuMemoryFabricId == null
                                ? 43
                                : this.computeGpuMemoryFabricId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
