/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDrgAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateDrgAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateDrgAttachmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG
     * attachment.
     */
    private String drgAttachmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG
     * attachment.
     */
    public String getDrgAttachmentId() {
        return drgAttachmentId;
    }
    /** Details object for updating a {@code DrgAttachment}. */
    private com.oracle.bmc.core.model.UpdateDrgAttachmentDetails updateDrgAttachmentDetails;

    /** Details object for updating a {@code DrgAttachment}. */
    public com.oracle.bmc.core.model.UpdateDrgAttachmentDetails getUpdateDrgAttachmentDetails() {
        return updateDrgAttachmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateDrgAttachmentDetails getBody$() {
        return updateDrgAttachmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDrgAttachmentRequest,
                    com.oracle.bmc.core.model.UpdateDrgAttachmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DRG attachment.
         */
        private String drgAttachmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DRG attachment.
         *
         * @param drgAttachmentId the value to set
         * @return this builder instance
         */
        public Builder drgAttachmentId(String drgAttachmentId) {
            this.drgAttachmentId = drgAttachmentId;
            return this;
        }

        /** Details object for updating a {@code DrgAttachment}. */
        private com.oracle.bmc.core.model.UpdateDrgAttachmentDetails updateDrgAttachmentDetails =
                null;

        /**
         * Details object for updating a {@code DrgAttachment}.
         *
         * @param updateDrgAttachmentDetails the value to set
         * @return this builder instance
         */
        public Builder updateDrgAttachmentDetails(
                com.oracle.bmc.core.model.UpdateDrgAttachmentDetails updateDrgAttachmentDetails) {
            this.updateDrgAttachmentDetails = updateDrgAttachmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateDrgAttachmentRequest o) {
            drgAttachmentId(o.getDrgAttachmentId());
            updateDrgAttachmentDetails(o.getUpdateDrgAttachmentDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDrgAttachmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDrgAttachmentRequest
         */
        public UpdateDrgAttachmentRequest build() {
            UpdateDrgAttachmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateDrgAttachmentDetails body) {
            updateDrgAttachmentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDrgAttachmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDrgAttachmentRequest
         */
        public UpdateDrgAttachmentRequest buildWithoutInvocationCallback() {
            UpdateDrgAttachmentRequest request = new UpdateDrgAttachmentRequest();
            request.drgAttachmentId = drgAttachmentId;
            request.updateDrgAttachmentDetails = updateDrgAttachmentDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateDrgAttachmentRequest(drgAttachmentId, updateDrgAttachmentDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .drgAttachmentId(drgAttachmentId)
                .updateDrgAttachmentDetails(updateDrgAttachmentDetails)
                .ifMatch(ifMatch);
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
        sb.append(",drgAttachmentId=").append(String.valueOf(this.drgAttachmentId));
        sb.append(",updateDrgAttachmentDetails=")
                .append(String.valueOf(this.updateDrgAttachmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrgAttachmentRequest)) {
            return false;
        }

        UpdateDrgAttachmentRequest other = (UpdateDrgAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.drgAttachmentId, other.drgAttachmentId)
                && java.util.Objects.equals(
                        this.updateDrgAttachmentDetails, other.updateDrgAttachmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.drgAttachmentId == null ? 43 : this.drgAttachmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDrgAttachmentDetails == null
                                ? 43
                                : this.updateDrgAttachmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
