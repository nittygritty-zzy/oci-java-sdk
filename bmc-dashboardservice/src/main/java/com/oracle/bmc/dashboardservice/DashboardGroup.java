/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice;

import com.oracle.bmc.dashboardservice.requests.*;
import com.oracle.bmc.dashboardservice.responses.*;

/**
 * Use the Oracle Cloud Infrastructure Dashboards service API to manage dashboards in the Console.
 * Dashboards provide an organized and customizable view of resources and their metrics in the
 * Console. For more information, see
 * [Dashboards](https://docs.oracle.com/iaas/Content/Dashboards/home.htm).
 *
 * <p>*Important:** Resources for the Dashboards service are created in the tenacy's home region.
 * Although it is possible to create dashboard and dashboard group resources in regions other than
 * the home region, you won't be able to view those resources in the Console. Therefore, creating
 * resources outside of the home region is not recommended.
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
public interface DashboardGroup extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Moves a DashboardGroup resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/ChangeDashboardGroupCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDashboardGroupCompartment API.
     */
    ChangeDashboardGroupCompartmentResponse changeDashboardGroupCompartment(
            ChangeDashboardGroupCompartmentRequest request);

    /**
     * Creates a new dashboard group using the details provided in request body.
     *
     * <p>*Caution:** Resources for the Dashboard service are created in the tenacy's home region.
     * Although it is possible to create dashboard group resource in regions other than the home
     * region, you won't be able to view those resources in the Console. Therefore, creating
     * resources outside of the home region is not recommended.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/CreateDashboardGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDashboardGroup API.
     */
    CreateDashboardGroupResponse createDashboardGroup(CreateDashboardGroupRequest request);

    /**
     * Deletes the specified dashboard group. Uses the dashboard group's OCID to determine which
     * dashboard group to delete.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/DeleteDashboardGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDashboardGroup API.
     */
    DeleteDashboardGroupResponse deleteDashboardGroup(DeleteDashboardGroupRequest request);

    /**
     * Gets the specified dashboard group's information. Uses the dashboard group's OCID to
     * determine which dashboard to retrieve.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/GetDashboardGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDashboardGroup
     *     API.
     */
    GetDashboardGroupResponse getDashboardGroup(GetDashboardGroupRequest request);

    /**
     * Returns a list of dashboard groups with a specific compartment ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/ListDashboardGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDashboardGroups
     *     API.
     */
    ListDashboardGroupsResponse listDashboardGroups(ListDashboardGroupsRequest request);

    /**
     * Updates the specified dashboard group. Uses the dashboard group's OCID to determine which
     * dashboard group to update.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/UpdateDashboardGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDashboardGroup API.
     */
    UpdateDashboardGroupResponse updateDashboardGroup(UpdateDashboardGroupRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DashboardGroupWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DashboardGroupPaginators getPaginators();
}
