/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalNonContainerDatabaseManagementFeatureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * EnableExternalNonContainerDatabaseManagementFeatureRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class EnableExternalNonContainerDatabaseManagementFeatureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .EnableExternalNonContainerDatabaseManagementFeatureDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * external non-container database.
     */
    private String externalNonContainerDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * external non-container database.
     */
    public String getExternalNonContainerDatabaseId() {
        return externalNonContainerDatabaseId;
    }
    /**
     * The details required to enable a Database Management feature for an external non-container
     * database.
     */
    private com.oracle.bmc.databasemanagement.model
                    .EnableExternalNonContainerDatabaseManagementFeatureDetails
            enableExternalNonContainerDatabaseManagementFeatureDetails;

    /**
     * The details required to enable a Database Management feature for an external non-container
     * database.
     */
    public com.oracle.bmc.databasemanagement.model
                    .EnableExternalNonContainerDatabaseManagementFeatureDetails
            getEnableExternalNonContainerDatabaseManagementFeatureDetails() {
        return enableExternalNonContainerDatabaseManagementFeatureDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.databasemanagement.model
                    .EnableExternalNonContainerDatabaseManagementFeatureDetails
            getBody$() {
        return enableExternalNonContainerDatabaseManagementFeatureDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    EnableExternalNonContainerDatabaseManagementFeatureRequest,
                    com.oracle.bmc.databasemanagement.model
                            .EnableExternalNonContainerDatabaseManagementFeatureDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * external non-container database.
         */
        private String externalNonContainerDatabaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * external non-container database.
         *
         * @param externalNonContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder externalNonContainerDatabaseId(String externalNonContainerDatabaseId) {
            this.externalNonContainerDatabaseId = externalNonContainerDatabaseId;
            return this;
        }

        /**
         * The details required to enable a Database Management feature for an external
         * non-container database.
         */
        private com.oracle.bmc.databasemanagement.model
                        .EnableExternalNonContainerDatabaseManagementFeatureDetails
                enableExternalNonContainerDatabaseManagementFeatureDetails = null;

        /**
         * The details required to enable a Database Management feature for an external
         * non-container database.
         *
         * @param enableExternalNonContainerDatabaseManagementFeatureDetails the value to set
         * @return this builder instance
         */
        public Builder enableExternalNonContainerDatabaseManagementFeatureDetails(
                com.oracle.bmc.databasemanagement.model
                                .EnableExternalNonContainerDatabaseManagementFeatureDetails
                        enableExternalNonContainerDatabaseManagementFeatureDetails) {
            this.enableExternalNonContainerDatabaseManagementFeatureDetails =
                    enableExternalNonContainerDatabaseManagementFeatureDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(EnableExternalNonContainerDatabaseManagementFeatureRequest o) {
            externalNonContainerDatabaseId(o.getExternalNonContainerDatabaseId());
            enableExternalNonContainerDatabaseManagementFeatureDetails(
                    o.getEnableExternalNonContainerDatabaseManagementFeatureDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of EnableExternalNonContainerDatabaseManagementFeatureRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of EnableExternalNonContainerDatabaseManagementFeatureRequest
         */
        public EnableExternalNonContainerDatabaseManagementFeatureRequest build() {
            EnableExternalNonContainerDatabaseManagementFeatureRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.databasemanagement.model
                                .EnableExternalNonContainerDatabaseManagementFeatureDetails
                        body) {
            enableExternalNonContainerDatabaseManagementFeatureDetails(body);
            return this;
        }

        /**
         * Build the instance of EnableExternalNonContainerDatabaseManagementFeatureRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of EnableExternalNonContainerDatabaseManagementFeatureRequest
         */
        public EnableExternalNonContainerDatabaseManagementFeatureRequest
                buildWithoutInvocationCallback() {
            EnableExternalNonContainerDatabaseManagementFeatureRequest request =
                    new EnableExternalNonContainerDatabaseManagementFeatureRequest();
            request.externalNonContainerDatabaseId = externalNonContainerDatabaseId;
            request.enableExternalNonContainerDatabaseManagementFeatureDetails =
                    enableExternalNonContainerDatabaseManagementFeatureDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new
            // EnableExternalNonContainerDatabaseManagementFeatureRequest(externalNonContainerDatabaseId, enableExternalNonContainerDatabaseManagementFeatureDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalNonContainerDatabaseId(externalNonContainerDatabaseId)
                .enableExternalNonContainerDatabaseManagementFeatureDetails(
                        enableExternalNonContainerDatabaseManagementFeatureDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",externalNonContainerDatabaseId=")
                .append(String.valueOf(this.externalNonContainerDatabaseId));
        sb.append(",enableExternalNonContainerDatabaseManagementFeatureDetails=")
                .append(
                        String.valueOf(
                                this.enableExternalNonContainerDatabaseManagementFeatureDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableExternalNonContainerDatabaseManagementFeatureRequest)) {
            return false;
        }

        EnableExternalNonContainerDatabaseManagementFeatureRequest other =
                (EnableExternalNonContainerDatabaseManagementFeatureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalNonContainerDatabaseId, other.externalNonContainerDatabaseId)
                && java.util.Objects.equals(
                        this.enableExternalNonContainerDatabaseManagementFeatureDetails,
                        other.enableExternalNonContainerDatabaseManagementFeatureDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalNonContainerDatabaseId == null
                                ? 43
                                : this.externalNonContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.enableExternalNonContainerDatabaseManagementFeatureDetails == null
                                ? 43
                                : this.enableExternalNonContainerDatabaseManagementFeatureDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
