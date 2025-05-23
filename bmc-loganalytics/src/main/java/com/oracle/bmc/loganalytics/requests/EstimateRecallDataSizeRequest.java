/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/EstimateRecallDataSizeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * EstimateRecallDataSizeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class EstimateRecallDataSizeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** This is the input to estimate the size of data to be recalled. */
    private com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails
            estimateRecallDataSizeDetails;

    /** This is the input to estimate the size of data to be recalled. */
    public com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails
            getEstimateRecallDataSizeDetails() {
        return estimateRecallDataSizeDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails getBody$() {
        return estimateRecallDataSizeDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    EstimateRecallDataSizeRequest,
                    com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** This is the input to estimate the size of data to be recalled. */
        private com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails
                estimateRecallDataSizeDetails = null;

        /**
         * This is the input to estimate the size of data to be recalled.
         *
         * @param estimateRecallDataSizeDetails the value to set
         * @return this builder instance
         */
        public Builder estimateRecallDataSizeDetails(
                com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails
                        estimateRecallDataSizeDetails) {
            this.estimateRecallDataSizeDetails = estimateRecallDataSizeDetails;
            return this;
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
        public Builder copy(EstimateRecallDataSizeRequest o) {
            namespaceName(o.getNamespaceName());
            estimateRecallDataSizeDetails(o.getEstimateRecallDataSizeDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of EstimateRecallDataSizeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of EstimateRecallDataSizeRequest
         */
        public EstimateRecallDataSizeRequest build() {
            EstimateRecallDataSizeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeDetails body) {
            estimateRecallDataSizeDetails(body);
            return this;
        }

        /**
         * Build the instance of EstimateRecallDataSizeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of EstimateRecallDataSizeRequest
         */
        public EstimateRecallDataSizeRequest buildWithoutInvocationCallback() {
            EstimateRecallDataSizeRequest request = new EstimateRecallDataSizeRequest();
            request.namespaceName = namespaceName;
            request.estimateRecallDataSizeDetails = estimateRecallDataSizeDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new EstimateRecallDataSizeRequest(namespaceName, estimateRecallDataSizeDetails,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .estimateRecallDataSizeDetails(estimateRecallDataSizeDetails)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",estimateRecallDataSizeDetails=")
                .append(String.valueOf(this.estimateRecallDataSizeDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimateRecallDataSizeRequest)) {
            return false;
        }

        EstimateRecallDataSizeRequest other = (EstimateRecallDataSizeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.estimateRecallDataSizeDetails, other.estimateRecallDataSizeDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.estimateRecallDataSizeDetails == null
                                ? 43
                                : this.estimateRecallDataSizeDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
