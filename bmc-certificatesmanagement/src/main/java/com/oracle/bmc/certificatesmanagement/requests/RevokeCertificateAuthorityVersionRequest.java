/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.requests;

import com.oracle.bmc.certificatesmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificatesmanagement/RevokeCertificateAuthorityVersionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RevokeCertificateAuthorityVersionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class RevokeCertificateAuthorityVersionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.certificatesmanagement.model
                        .RevokeCertificateAuthorityVersionDetails> {

    /** The OCID of the certificate authority (CA). */
    private String certificateAuthorityId;

    /** The OCID of the certificate authority (CA). */
    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }
    /** The version number of the certificate authority (CA). */
    private Long certificateAuthorityVersionNumber;

    /** The version number of the certificate authority (CA). */
    public Long getCertificateAuthorityVersionNumber() {
        return certificateAuthorityVersionNumber;
    }
    /** The details of the request to revoke a CA version. */
    private com.oracle.bmc.certificatesmanagement.model.RevokeCertificateAuthorityVersionDetails
            revokeCertificateAuthorityVersionDetails;

    /** The details of the request to revoke a CA version. */
    public com.oracle.bmc.certificatesmanagement.model.RevokeCertificateAuthorityVersionDetails
            getRevokeCertificateAuthorityVersionDetails() {
        return revokeCertificateAuthorityVersionDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
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
    public com.oracle.bmc.certificatesmanagement.model.RevokeCertificateAuthorityVersionDetails
            getBody$() {
        return revokeCertificateAuthorityVersionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RevokeCertificateAuthorityVersionRequest,
                    com.oracle.bmc.certificatesmanagement.model
                            .RevokeCertificateAuthorityVersionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the certificate authority (CA). */
        private String certificateAuthorityId = null;

        /**
         * The OCID of the certificate authority (CA).
         *
         * @param certificateAuthorityId the value to set
         * @return this builder instance
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        /** The version number of the certificate authority (CA). */
        private Long certificateAuthorityVersionNumber = null;

        /**
         * The version number of the certificate authority (CA).
         *
         * @param certificateAuthorityVersionNumber the value to set
         * @return this builder instance
         */
        public Builder certificateAuthorityVersionNumber(Long certificateAuthorityVersionNumber) {
            this.certificateAuthorityVersionNumber = certificateAuthorityVersionNumber;
            return this;
        }

        /** The details of the request to revoke a CA version. */
        private com.oracle.bmc.certificatesmanagement.model.RevokeCertificateAuthorityVersionDetails
                revokeCertificateAuthorityVersionDetails = null;

        /**
         * The details of the request to revoke a CA version.
         *
         * @param revokeCertificateAuthorityVersionDetails the value to set
         * @return this builder instance
         */
        public Builder revokeCertificateAuthorityVersionDetails(
                com.oracle.bmc.certificatesmanagement.model.RevokeCertificateAuthorityVersionDetails
                        revokeCertificateAuthorityVersionDetails) {
            this.revokeCertificateAuthorityVersionDetails =
                    revokeCertificateAuthorityVersionDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
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
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
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
        public Builder copy(RevokeCertificateAuthorityVersionRequest o) {
            certificateAuthorityId(o.getCertificateAuthorityId());
            certificateAuthorityVersionNumber(o.getCertificateAuthorityVersionNumber());
            revokeCertificateAuthorityVersionDetails(
                    o.getRevokeCertificateAuthorityVersionDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RevokeCertificateAuthorityVersionRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RevokeCertificateAuthorityVersionRequest
         */
        public RevokeCertificateAuthorityVersionRequest build() {
            RevokeCertificateAuthorityVersionRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.certificatesmanagement.model.RevokeCertificateAuthorityVersionDetails
                        body) {
            revokeCertificateAuthorityVersionDetails(body);
            return this;
        }

        /**
         * Build the instance of RevokeCertificateAuthorityVersionRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RevokeCertificateAuthorityVersionRequest
         */
        public RevokeCertificateAuthorityVersionRequest buildWithoutInvocationCallback() {
            RevokeCertificateAuthorityVersionRequest request =
                    new RevokeCertificateAuthorityVersionRequest();
            request.certificateAuthorityId = certificateAuthorityId;
            request.certificateAuthorityVersionNumber = certificateAuthorityVersionNumber;
            request.revokeCertificateAuthorityVersionDetails =
                    revokeCertificateAuthorityVersionDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new RevokeCertificateAuthorityVersionRequest(certificateAuthorityId,
            // certificateAuthorityVersionNumber, revokeCertificateAuthorityVersionDetails,
            // opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateAuthorityId(certificateAuthorityId)
                .certificateAuthorityVersionNumber(certificateAuthorityVersionNumber)
                .revokeCertificateAuthorityVersionDetails(revokeCertificateAuthorityVersionDetails)
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
        sb.append(",certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(",certificateAuthorityVersionNumber=")
                .append(String.valueOf(this.certificateAuthorityVersionNumber));
        sb.append(",revokeCertificateAuthorityVersionDetails=")
                .append(String.valueOf(this.revokeCertificateAuthorityVersionDetails));
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
        if (!(o instanceof RevokeCertificateAuthorityVersionRequest)) {
            return false;
        }

        RevokeCertificateAuthorityVersionRequest other =
                (RevokeCertificateAuthorityVersionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(
                        this.certificateAuthorityVersionNumber,
                        other.certificateAuthorityVersionNumber)
                && java.util.Objects.equals(
                        this.revokeCertificateAuthorityVersionDetails,
                        other.revokeCertificateAuthorityVersionDetails)
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
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityVersionNumber == null
                                ? 43
                                : this.certificateAuthorityVersionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.revokeCertificateAuthorityVersionDetails == null
                                ? 43
                                : this.revokeCertificateAuthorityVersionDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
