/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa;

import com.oracle.bmc.waa.requests.*;
import com.oracle.bmc.waa.responses.*;

/**
 * API for the Web Application Acceleration service. Use this API to manage regional Web App
 * Acceleration policies such as Caching and Compression for accelerating HTTP services.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public interface WaaAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Moves a Web App Acceleration resource from one compartment to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeWebAppAccelerationCompartmentResponse>
            changeWebAppAccelerationCompartment(
                    ChangeWebAppAccelerationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppAccelerationCompartmentRequest,
                                    ChangeWebAppAccelerationCompartmentResponse>
                            handler);

    /**
     * Moves a WebAppAccelerationfPolicy resource from one compartment to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeWebAppAccelerationPolicyCompartmentResponse>
            changeWebAppAccelerationPolicyCompartment(
                    ChangeWebAppAccelerationPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeWebAppAccelerationPolicyCompartmentRequest,
                                    ChangeWebAppAccelerationPolicyCompartmentResponse>
                            handler);

    /**
     * Creates a new WebAppAcceleration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateWebAppAccelerationResponse> createWebAppAcceleration(
            CreateWebAppAccelerationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateWebAppAccelerationRequest, CreateWebAppAccelerationResponse>
                    handler);

    /**
     * Creates a new WebAppAccelerationPolicy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateWebAppAccelerationPolicyResponse>
            createWebAppAccelerationPolicy(
                    CreateWebAppAccelerationPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateWebAppAccelerationPolicyRequest,
                                    CreateWebAppAccelerationPolicyResponse>
                            handler);

    /**
     * Deletes a WebAppAcceleration resource identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWebAppAccelerationResponse> deleteWebAppAcceleration(
            DeleteWebAppAccelerationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWebAppAccelerationRequest, DeleteWebAppAccelerationResponse>
                    handler);

    /**
     * Deletes a WebAppAccelerationPolicy resource identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWebAppAccelerationPolicyResponse>
            deleteWebAppAccelerationPolicy(
                    DeleteWebAppAccelerationPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteWebAppAccelerationPolicyRequest,
                                    DeleteWebAppAccelerationPolicyResponse>
                            handler);

    /**
     * Gets a WebAppAcceleration by OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWebAppAccelerationResponse> getWebAppAcceleration(
            GetWebAppAccelerationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
                    handler);

    /**
     * Gets a WebAppAccelerationPolicy with the given OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWebAppAccelerationPolicyResponse> getWebAppAccelerationPolicy(
            GetWebAppAccelerationPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWebAppAccelerationPolicyRequest, GetWebAppAccelerationPolicyResponse>
                    handler);

    /**
     * Gets a list of all WebAppAccelerationPolicies in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWebAppAccelerationPoliciesResponse>
            listWebAppAccelerationPolicies(
                    ListWebAppAccelerationPoliciesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListWebAppAccelerationPoliciesRequest,
                                    ListWebAppAccelerationPoliciesResponse>
                            handler);

    /**
     * Gets a list of all WebAppAccelerations in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWebAppAccelerationsResponse> listWebAppAccelerations(
            ListWebAppAccelerationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>
                    handler);

    /**
     * Clears resources from the cache of the WebAppAcceleration. Each new request for a purged
     * resource will be forwarded to the origin server to fetch a new version of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PurgeWebAppAccelerationCacheResponse> purgeWebAppAccelerationCache(
            PurgeWebAppAccelerationCacheRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PurgeWebAppAccelerationCacheRequest,
                            PurgeWebAppAccelerationCacheResponse>
                    handler);

    /**
     * Updates the WebAppAcceleration identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWebAppAccelerationResponse> updateWebAppAcceleration(
            UpdateWebAppAccelerationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateWebAppAccelerationRequest, UpdateWebAppAccelerationResponse>
                    handler);

    /**
     * Update the WebAppAccelerationPolicy identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWebAppAccelerationPolicyResponse>
            updateWebAppAccelerationPolicy(
                    UpdateWebAppAccelerationPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateWebAppAccelerationPolicyRequest,
                                    UpdateWebAppAccelerationPolicyResponse>
                            handler);
}
