/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreateOrUpdateGitRefExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateOrUpdateGitRefRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class CreateOrUpdateGitRefRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails> {

    /** Unique repository identifier. */
    private String repositoryId;

    /** Unique repository identifier. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /** The information to create a reference with the type specified in the query. */
    private com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails createOrUpdateGitRefDetails;

    /** The information to create a reference with the type specified in the query. */
    public com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails
            getCreateOrUpdateGitRefDetails() {
        return createOrUpdateGitRefDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated earlier due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated earlier due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
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
    public com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails getBody$() {
        return createOrUpdateGitRefDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateOrUpdateGitRefRequest,
                    com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique repository identifier. */
        private String repositoryId = null;

        /**
         * Unique repository identifier.
         *
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /** The information to create a reference with the type specified in the query. */
        private com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails
                createOrUpdateGitRefDetails = null;

        /**
         * The information to create a reference with the type specified in the query.
         *
         * @param createOrUpdateGitRefDetails the value to set
         * @return this builder instance
         */
        public Builder createOrUpdateGitRefDetails(
                com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails
                        createOrUpdateGitRefDetails) {
            this.createOrUpdateGitRefDetails = createOrUpdateGitRefDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated earlier due to conflicting operations. For example, if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated earlier due to conflicting operations. For example, if a
         * resource has been deleted and purged from the system, then a retry of the original
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
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
        public Builder copy(CreateOrUpdateGitRefRequest o) {
            repositoryId(o.getRepositoryId());
            createOrUpdateGitRefDetails(o.getCreateOrUpdateGitRefDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOrUpdateGitRefRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateOrUpdateGitRefRequest
         */
        public CreateOrUpdateGitRefRequest build() {
            CreateOrUpdateGitRefRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.devops.model.CreateOrUpdateGitRefDetails body) {
            createOrUpdateGitRefDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOrUpdateGitRefRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOrUpdateGitRefRequest
         */
        public CreateOrUpdateGitRefRequest buildWithoutInvocationCallback() {
            CreateOrUpdateGitRefRequest request = new CreateOrUpdateGitRefRequest();
            request.repositoryId = repositoryId;
            request.createOrUpdateGitRefDetails = createOrUpdateGitRefDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateOrUpdateGitRefRequest(repositoryId, createOrUpdateGitRefDetails, ifMatch,
            // opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .repositoryId(repositoryId)
                .createOrUpdateGitRefDetails(createOrUpdateGitRefDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",createOrUpdateGitRefDetails=")
                .append(String.valueOf(this.createOrUpdateGitRefDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOrUpdateGitRefRequest)) {
            return false;
        }

        CreateOrUpdateGitRefRequest other = (CreateOrUpdateGitRefRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(
                        this.createOrUpdateGitRefDetails, other.createOrUpdateGitRefDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.createOrUpdateGitRefDetails == null
                                ? 43
                                : this.createOrUpdateGitRefDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
