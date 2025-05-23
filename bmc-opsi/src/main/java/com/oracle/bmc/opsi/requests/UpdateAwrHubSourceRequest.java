/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateAwrHubSourceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAwrHubSourceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateAwrHubSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails> {

    /** The configuration to be updated. */
    private com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails updateAwrHubSourceDetails;

    /** The configuration to be updated. */
    public com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails getUpdateAwrHubSourceDetails() {
        return updateAwrHubSourceDetails;
    }
    /** Unique Awr Hub Source identifier */
    private String awrHubSourceId;

    /** Unique Awr Hub Source identifier */
    public String getAwrHubSourceId() {
        return awrHubSourceId;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
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
    public com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails getBody$() {
        return updateAwrHubSourceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAwrHubSourceRequest,
                    com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The configuration to be updated. */
        private com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails updateAwrHubSourceDetails =
                null;

        /**
         * The configuration to be updated.
         *
         * @param updateAwrHubSourceDetails the value to set
         * @return this builder instance
         */
        public Builder updateAwrHubSourceDetails(
                com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails updateAwrHubSourceDetails) {
            this.updateAwrHubSourceDetails = updateAwrHubSourceDetails;
            return this;
        }

        /** Unique Awr Hub Source identifier */
        private String awrHubSourceId = null;

        /**
         * Unique Awr Hub Source identifier
         *
         * @param awrHubSourceId the value to set
         * @return this builder instance
         */
        public Builder awrHubSourceId(String awrHubSourceId) {
            this.awrHubSourceId = awrHubSourceId;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(UpdateAwrHubSourceRequest o) {
            updateAwrHubSourceDetails(o.getUpdateAwrHubSourceDetails());
            awrHubSourceId(o.getAwrHubSourceId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAwrHubSourceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAwrHubSourceRequest
         */
        public UpdateAwrHubSourceRequest build() {
            UpdateAwrHubSourceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.opsi.model.UpdateAwrHubSourceDetails body) {
            updateAwrHubSourceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAwrHubSourceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAwrHubSourceRequest
         */
        public UpdateAwrHubSourceRequest buildWithoutInvocationCallback() {
            UpdateAwrHubSourceRequest request = new UpdateAwrHubSourceRequest();
            request.updateAwrHubSourceDetails = updateAwrHubSourceDetails;
            request.awrHubSourceId = awrHubSourceId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAwrHubSourceRequest(updateAwrHubSourceDetails, awrHubSourceId, ifMatch,
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
                .updateAwrHubSourceDetails(updateAwrHubSourceDetails)
                .awrHubSourceId(awrHubSourceId)
                .ifMatch(ifMatch)
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
        sb.append(",updateAwrHubSourceDetails=")
                .append(String.valueOf(this.updateAwrHubSourceDetails));
        sb.append(",awrHubSourceId=").append(String.valueOf(this.awrHubSourceId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAwrHubSourceRequest)) {
            return false;
        }

        UpdateAwrHubSourceRequest other = (UpdateAwrHubSourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateAwrHubSourceDetails, other.updateAwrHubSourceDetails)
                && java.util.Objects.equals(this.awrHubSourceId, other.awrHubSourceId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateAwrHubSourceDetails == null
                                ? 43
                                : this.updateAwrHubSourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.awrHubSourceId == null ? 43 : this.awrHubSourceId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
