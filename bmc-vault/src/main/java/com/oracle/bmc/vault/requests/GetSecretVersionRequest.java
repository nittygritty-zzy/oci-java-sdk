/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.requests;

import com.oracle.bmc.vault.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/vault/GetSecretVersionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSecretVersionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public class GetSecretVersionRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the secret. */
    private String secretId;

    /** The OCID of the secret. */
    public String getSecretId() {
        return secretId;
    }
    /** The version number of the secret. */
    private Long secretVersionNumber;

    /** The version number of the secret. */
    public Long getSecretVersionNumber() {
        return secretVersionNumber;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSecretVersionRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the secret. */
        private String secretId = null;

        /**
         * The OCID of the secret.
         *
         * @param secretId the value to set
         * @return this builder instance
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            return this;
        }

        /** The version number of the secret. */
        private Long secretVersionNumber = null;

        /**
         * The version number of the secret.
         *
         * @param secretVersionNumber the value to set
         * @return this builder instance
         */
        public Builder secretVersionNumber(Long secretVersionNumber) {
            this.secretVersionNumber = secretVersionNumber;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
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
        public Builder copy(GetSecretVersionRequest o) {
            secretId(o.getSecretId());
            secretVersionNumber(o.getSecretVersionNumber());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSecretVersionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetSecretVersionRequest
         */
        public GetSecretVersionRequest build() {
            GetSecretVersionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSecretVersionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSecretVersionRequest
         */
        public GetSecretVersionRequest buildWithoutInvocationCallback() {
            GetSecretVersionRequest request = new GetSecretVersionRequest();
            request.secretId = secretId;
            request.secretVersionNumber = secretVersionNumber;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetSecretVersionRequest(secretId, secretVersionNumber, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .secretId(secretId)
                .secretVersionNumber(secretVersionNumber)
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
        sb.append(",secretId=").append(String.valueOf(this.secretId));
        sb.append(",secretVersionNumber=").append(String.valueOf(this.secretVersionNumber));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSecretVersionRequest)) {
            return false;
        }

        GetSecretVersionRequest other = (GetSecretVersionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.secretVersionNumber, other.secretVersionNumber)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretVersionNumber == null
                                ? 43
                                : this.secretVersionNumber.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
