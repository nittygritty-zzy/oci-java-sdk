/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.requests;

import com.oracle.bmc.identitydomains.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMyOAuth2ClientCredentialExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PatchMyOAuth2ClientCredentialRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class PatchMyOAuth2ClientCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.identitydomains.model.PatchOp> {

    /** ID of the resource */
    private String myOAuth2ClientCredentialId;

    /** ID of the resource */
    public String getMyOAuth2ClientCredentialId() {
        return myOAuth2ClientCredentialId;
    }
    /**
     * The Authorization field value consists of credentials containing the authentication
     * information of the user agent for the realm of the resource being requested.
     */
    private String authorization;

    /**
     * The Authorization field value consists of credentials containing the authentication
     * information of the user agent for the realm of the resource being requested.
     */
    public String getAuthorization() {
        return authorization;
    }
    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are
     * Earliest Version or Latest Version as specified in each REST API endpoint description, or any
     * sequential number inbetween. All schema attributes/body parameters are a part of version 1.
     * After version 1, any attributes added or deprecated will be tagged with the version that they
     * were added to or deprecated in. If no version is provided, the latest schema version is
     * returned.
     */
    private String resourceTypeSchemaVersion;

    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are
     * Earliest Version or Latest Version as specified in each REST API endpoint description, or any
     * sequential number inbetween. All schema attributes/body parameters are a part of version 1.
     * After version 1, any attributes added or deprecated will be tagged with the version that they
     * were added to or deprecated in. If no version is provided, the latest schema version is
     * returned.
     */
    public String getResourceTypeSchemaVersion() {
        return resourceTypeSchemaVersion;
    }
    /**
     * Update the MyOAuth2ClientCredential with SCIM Patch schema.
     *
     * <p>Before you specify an attribute-value in a request to update a resource, please check the
     * **'mutability'** property of that attribute in the resource-type schema below. Clicking on an
     * attribute-row will expand that row to show the **SCIM++ Properties** of that attribute. -
     * Your request to create, update or replace a resource may specify in its payload a value for
     * any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or
     * *mutability:immutable*: - The SCIM APIs to create a resource will ignore silently any value
     * that you specify for an attribute that is defined as *mutability:readOnly*. - The SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify a
     * value for an attribute that is defined as *mutability:readOnly*. - Similarly, the SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify any
     * value for an attribute that is defined as *mutability:immutable* and that already has a value
     * in the specified resource.
     *
     * <p>Also, before you use the query-parameter attributes to request specific attributes, please
     * check the **'returned'** property of that attribute in the resource-type schema below: - Your
     * request to read a resource (or to search a resource-type) can specify as the value of
     * attributes any attributes that are defined as *returned:default* or *returned:request* or
     * *returned:always*: - If you request a specific set of attributes, the SCIM APIs to read a
     * resource (or to search a resource-type) will return in each resource the set of attributes
     * that you requested, as well as any attribute that is defined as *returned:always*. - If you
     * do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a
     * resource-type) will return in each resource the the set of attributes defined as
     * *returned:default*, as well as any attribute that is defined as *returned:always*. - The SCIM
     * APIs to read a resource (or to search a resource-type) will ignore silently any request to
     * return an attribute that is defined as *returned:never*.
     */
    private com.oracle.bmc.identitydomains.model.PatchOp patchOp;

    /**
     * Update the MyOAuth2ClientCredential with SCIM Patch schema.
     *
     * <p>Before you specify an attribute-value in a request to update a resource, please check the
     * **'mutability'** property of that attribute in the resource-type schema below. Clicking on an
     * attribute-row will expand that row to show the **SCIM++ Properties** of that attribute. -
     * Your request to create, update or replace a resource may specify in its payload a value for
     * any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or
     * *mutability:immutable*: - The SCIM APIs to create a resource will ignore silently any value
     * that you specify for an attribute that is defined as *mutability:readOnly*. - The SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify a
     * value for an attribute that is defined as *mutability:readOnly*. - Similarly, the SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify any
     * value for an attribute that is defined as *mutability:immutable* and that already has a value
     * in the specified resource.
     *
     * <p>Also, before you use the query-parameter attributes to request specific attributes, please
     * check the **'returned'** property of that attribute in the resource-type schema below: - Your
     * request to read a resource (or to search a resource-type) can specify as the value of
     * attributes any attributes that are defined as *returned:default* or *returned:request* or
     * *returned:always*: - If you request a specific set of attributes, the SCIM APIs to read a
     * resource (or to search a resource-type) will return in each resource the set of attributes
     * that you requested, as well as any attribute that is defined as *returned:always*. - If you
     * do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a
     * resource-type) will return in each resource the the set of attributes defined as
     * *returned:default*, as well as any attribute that is defined as *returned:always*. - The SCIM
     * APIs to read a resource (or to search a resource-type) will ignore silently any request to
     * return an attribute that is defined as *returned:never*.
     */
    public com.oracle.bmc.identitydomains.model.PatchOp getPatchOp() {
        return patchOp;
    }
    /** Used to make the request conditional on an ETag */
    private String ifMatch;

    /** Used to make the request conditional on an ETag */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is
     * retried. Idempotency tokens expire after 24 hours.
     */
    private String opcRetryToken;

    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is
     * retried. Idempotency tokens expire after 24 hours.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identitydomains.model.PatchOp getBody$() {
        return patchOp;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PatchMyOAuth2ClientCredentialRequest,
                    com.oracle.bmc.identitydomains.model.PatchOp> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** ID of the resource */
        private String myOAuth2ClientCredentialId = null;

        /**
         * ID of the resource
         *
         * @param myOAuth2ClientCredentialId the value to set
         * @return this builder instance
         */
        public Builder myOAuth2ClientCredentialId(String myOAuth2ClientCredentialId) {
            this.myOAuth2ClientCredentialId = myOAuth2ClientCredentialId;
            return this;
        }

        /**
         * The Authorization field value consists of credentials containing the authentication
         * information of the user agent for the realm of the resource being requested.
         */
        private String authorization = null;

        /**
         * The Authorization field value consists of credentials containing the authentication
         * information of the user agent for the realm of the resource being requested.
         *
         * @param authorization the value to set
         * @return this builder instance
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values
         * are Earliest Version or Latest Version as specified in each REST API endpoint
         * description, or any sequential number inbetween. All schema attributes/body parameters
         * are a part of version 1. After version 1, any attributes added or deprecated will be
         * tagged with the version that they were added to or deprecated in. If no version is
         * provided, the latest schema version is returned.
         */
        private String resourceTypeSchemaVersion = null;

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values
         * are Earliest Version or Latest Version as specified in each REST API endpoint
         * description, or any sequential number inbetween. All schema attributes/body parameters
         * are a part of version 1. After version 1, any attributes added or deprecated will be
         * tagged with the version that they were added to or deprecated in. If no version is
         * provided, the latest schema version is returned.
         *
         * @param resourceTypeSchemaVersion the value to set
         * @return this builder instance
         */
        public Builder resourceTypeSchemaVersion(String resourceTypeSchemaVersion) {
            this.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            return this;
        }

        /**
         * Update the MyOAuth2ClientCredential with SCIM Patch schema.
         *
         * <p>Before you specify an attribute-value in a request to update a resource, please check
         * the **'mutability'** property of that attribute in the resource-type schema below.
         * Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of
         * that attribute. - Your request to create, update or replace a resource may specify in its
         * payload a value for any attribute that is defined as *mutability:readWrite* or
         * *mutability:writeOnly* or *mutability:immutable*: - The SCIM APIs to create a resource
         * will ignore silently any value that you specify for an attribute that is defined as
         * *mutability:readOnly*. - The SCIM APIs to update or replace a resource will fail with an
         * error 400 Bad Request if you specify a value for an attribute that is defined as
         * *mutability:readOnly*. - Similarly, the SCIM APIs to update or replace a resource will
         * fail with an error 400 Bad Request if you specify any value for an attribute that is
         * defined as *mutability:immutable* and that already has a value in the specified resource.
         *
         * <p>Also, before you use the query-parameter attributes to request specific attributes,
         * please check the **'returned'** property of that attribute in the resource-type schema
         * below: - Your request to read a resource (or to search a resource-type) can specify as
         * the value of attributes any attributes that are defined as *returned:default* or
         * *returned:request* or *returned:always*: - If you request a specific set of attributes,
         * the SCIM APIs to read a resource (or to search a resource-type) will return in each
         * resource the set of attributes that you requested, as well as any attribute that is
         * defined as *returned:always*. - If you do not request a specific set of attributes, the
         * SCIM APIs to read a resource (or to search a resource-type) will return in each resource
         * the the set of attributes defined as *returned:default*, as well as any attribute that is
         * defined as *returned:always*. - The SCIM APIs to read a resource (or to search a
         * resource-type) will ignore silently any request to return an attribute that is defined as
         * *returned:never*.
         */
        private com.oracle.bmc.identitydomains.model.PatchOp patchOp = null;

        /**
         * Update the MyOAuth2ClientCredential with SCIM Patch schema.
         *
         * <p>Before you specify an attribute-value in a request to update a resource, please check
         * the **'mutability'** property of that attribute in the resource-type schema below.
         * Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of
         * that attribute. - Your request to create, update or replace a resource may specify in its
         * payload a value for any attribute that is defined as *mutability:readWrite* or
         * *mutability:writeOnly* or *mutability:immutable*: - The SCIM APIs to create a resource
         * will ignore silently any value that you specify for an attribute that is defined as
         * *mutability:readOnly*. - The SCIM APIs to update or replace a resource will fail with an
         * error 400 Bad Request if you specify a value for an attribute that is defined as
         * *mutability:readOnly*. - Similarly, the SCIM APIs to update or replace a resource will
         * fail with an error 400 Bad Request if you specify any value for an attribute that is
         * defined as *mutability:immutable* and that already has a value in the specified resource.
         *
         * <p>Also, before you use the query-parameter attributes to request specific attributes,
         * please check the **'returned'** property of that attribute in the resource-type schema
         * below: - Your request to read a resource (or to search a resource-type) can specify as
         * the value of attributes any attributes that are defined as *returned:default* or
         * *returned:request* or *returned:always*: - If you request a specific set of attributes,
         * the SCIM APIs to read a resource (or to search a resource-type) will return in each
         * resource the set of attributes that you requested, as well as any attribute that is
         * defined as *returned:always*. - If you do not request a specific set of attributes, the
         * SCIM APIs to read a resource (or to search a resource-type) will return in each resource
         * the the set of attributes defined as *returned:default*, as well as any attribute that is
         * defined as *returned:always*. - The SCIM APIs to read a resource (or to search a
         * resource-type) will ignore silently any request to return an attribute that is defined as
         * *returned:never*.
         *
         * @param patchOp the value to set
         * @return this builder instance
         */
        public Builder patchOp(com.oracle.bmc.identitydomains.model.PatchOp patchOp) {
            this.patchOp = patchOp;
            return this;
        }

        /** Used to make the request conditional on an ETag */
        private String ifMatch = null;

        /**
         * Used to make the request conditional on an ETag
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the
         * request is retried. Idempotency tokens expire after 24 hours.
         */
        private String opcRetryToken = null;

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the
         * request is retried. Idempotency tokens expire after 24 hours.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(PatchMyOAuth2ClientCredentialRequest o) {
            myOAuth2ClientCredentialId(o.getMyOAuth2ClientCredentialId());
            authorization(o.getAuthorization());
            resourceTypeSchemaVersion(o.getResourceTypeSchemaVersion());
            patchOp(o.getPatchOp());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PatchMyOAuth2ClientCredentialRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PatchMyOAuth2ClientCredentialRequest
         */
        public PatchMyOAuth2ClientCredentialRequest build() {
            PatchMyOAuth2ClientCredentialRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identitydomains.model.PatchOp body) {
            patchOp(body);
            return this;
        }

        /**
         * Build the instance of PatchMyOAuth2ClientCredentialRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PatchMyOAuth2ClientCredentialRequest
         */
        public PatchMyOAuth2ClientCredentialRequest buildWithoutInvocationCallback() {
            PatchMyOAuth2ClientCredentialRequest request =
                    new PatchMyOAuth2ClientCredentialRequest();
            request.myOAuth2ClientCredentialId = myOAuth2ClientCredentialId;
            request.authorization = authorization;
            request.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            request.patchOp = patchOp;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new PatchMyOAuth2ClientCredentialRequest(myOAuth2ClientCredentialId, authorization,
            // resourceTypeSchemaVersion, patchOp, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .myOAuth2ClientCredentialId(myOAuth2ClientCredentialId)
                .authorization(authorization)
                .resourceTypeSchemaVersion(resourceTypeSchemaVersion)
                .patchOp(patchOp)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",myOAuth2ClientCredentialId=")
                .append(String.valueOf(this.myOAuth2ClientCredentialId));
        sb.append(",authorization=").append(String.valueOf(this.authorization));
        sb.append(",resourceTypeSchemaVersion=")
                .append(String.valueOf(this.resourceTypeSchemaVersion));
        sb.append(",patchOp=").append(String.valueOf(this.patchOp));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchMyOAuth2ClientCredentialRequest)) {
            return false;
        }

        PatchMyOAuth2ClientCredentialRequest other = (PatchMyOAuth2ClientCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.myOAuth2ClientCredentialId, other.myOAuth2ClientCredentialId)
                && java.util.Objects.equals(this.authorization, other.authorization)
                && java.util.Objects.equals(
                        this.resourceTypeSchemaVersion, other.resourceTypeSchemaVersion)
                && java.util.Objects.equals(this.patchOp, other.patchOp)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.myOAuth2ClientCredentialId == null
                                ? 43
                                : this.myOAuth2ClientCredentialId.hashCode());
        result =
                (result * PRIME)
                        + (this.authorization == null ? 43 : this.authorization.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeSchemaVersion == null
                                ? 43
                                : this.resourceTypeSchemaVersion.hashCode());
        result = (result * PRIME) + (this.patchOp == null ? 43 : this.patchOp.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
