/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class AttributesClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Attributes {
    /** Service instance for Attributes. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ATTRIBUTES")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-trace.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AttributesClient.class);

    AttributesClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AttributesClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apmtraces";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public AttributesClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AttributesClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public BulkActivateAttributeResponse bulkActivateAttribute(
            BulkActivateAttributeRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getBulkActivateAttributeDetails(),
                "bulkActivateAttributeDetails is required");

        return clientCall(request, BulkActivateAttributeResponse::builder)
                .logger(LOG, "bulkActivateAttribute")
                .serviceDetails(
                        "Attributes",
                        "BulkActivateAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/BulkActivationStatus/BulkActivateAttribute")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkActivateAttributeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("actions")
                .appendPathParam("activateAttributes")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.BulkActivationStatus.class,
                        BulkActivateAttributeResponse.Builder::bulkActivationStatus)
                .handleResponseHeaderString(
                        "opc-request-id", BulkActivateAttributeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BulkDeActivateAttributeResponse bulkDeActivateAttribute(
            BulkDeActivateAttributeRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getBulkDeActivateAttributeDetails(),
                "bulkDeActivateAttributeDetails is required");

        return clientCall(request, BulkDeActivateAttributeResponse::builder)
                .logger(LOG, "bulkDeActivateAttribute")
                .serviceDetails(
                        "Attributes",
                        "BulkDeActivateAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/BulkDeActivationStatus/BulkDeActivateAttribute")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkDeActivateAttributeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("actions")
                .appendPathParam("deActivateAttributes")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.BulkDeActivationStatus.class,
                        BulkDeActivateAttributeResponse.Builder::bulkDeActivationStatus)
                .handleResponseHeaderString(
                        "opc-request-id", BulkDeActivateAttributeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BulkPinAttributeResponse bulkPinAttribute(BulkPinAttributeRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getBulkPinAttributeDetails(), "bulkPinAttributeDetails is required");

        return clientCall(request, BulkPinAttributeResponse::builder)
                .logger(LOG, "bulkPinAttribute")
                .serviceDetails(
                        "Attributes",
                        "BulkPinAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/BulkPinStatus/BulkPinAttribute")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkPinAttributeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("actions")
                .appendPathParam("pinAttributes")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.BulkPinStatus.class,
                        BulkPinAttributeResponse.Builder::bulkPinStatus)
                .handleResponseHeaderString(
                        "opc-request-id", BulkPinAttributeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BulkUnpinAttributeResponse bulkUnpinAttribute(BulkUnpinAttributeRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getBulkUnpinAttributeDetails(), "bulkUnpinAttributeDetails is required");

        return clientCall(request, BulkUnpinAttributeResponse::builder)
                .logger(LOG, "bulkUnpinAttribute")
                .serviceDetails(
                        "Attributes",
                        "BulkUnpinAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/BulkUnpinStatus/BulkUnpinAttribute")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUnpinAttributeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("actions")
                .appendPathParam("unPinAttributes")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.BulkUnpinStatus.class,
                        BulkUnpinAttributeResponse.Builder::bulkUnpinStatus)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUnpinAttributeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BulkUpdateAttributeResponse bulkUpdateAttribute(BulkUpdateAttributeRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getBulkUpdateAttributeDetails(), "bulkUpdateAttributeDetails is required");

        return clientCall(request, BulkUpdateAttributeResponse::builder)
                .logger(LOG, "bulkUpdateAttribute")
                .serviceDetails(
                        "Attributes",
                        "BulkUpdateAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/BulkUpdateAttributeStatus/BulkUpdateAttribute")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUpdateAttributeRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("actions")
                .appendPathParam("updateAttributes")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.BulkUpdateAttributeStatus.class,
                        BulkUpdateAttributeResponse.Builder::bulkUpdateAttributeStatus)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUpdateAttributeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BulkUpdateAttributeNotesResponse bulkUpdateAttributeNotes(
            BulkUpdateAttributeNotesRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getBulkUpdateAttributeNotesDetails(),
                "bulkUpdateAttributeNotesDetails is required");

        return clientCall(request, BulkUpdateAttributeNotesResponse::builder)
                .logger(LOG, "bulkUpdateAttributeNotes")
                .serviceDetails(
                        "Attributes",
                        "BulkUpdateAttributeNotes",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/BulkUpdateNotesStatus/BulkUpdateAttributeNotes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUpdateAttributeNotesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("actions")
                .appendPathParam("updateNotes")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.BulkUpdateNotesStatus.class,
                        BulkUpdateAttributeNotesResponse.Builder::bulkUpdateNotesStatus)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUpdateAttributeNotesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetStatusAutoActivateResponse getStatusAutoActivate(
            GetStatusAutoActivateRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(request.getDataKeyType(), "dataKeyType is required");

        return clientCall(request, GetStatusAutoActivateResponse::builder)
                .logger(LOG, "getStatusAutoActivate")
                .serviceDetails(
                        "Attributes",
                        "GetStatusAutoActivate",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/AutoActivateStatus/GetStatusAutoActivate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStatusAutoActivateRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("autoActivateStatus")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendEnumQueryParam("dataKeyType", request.getDataKeyType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.AutoActivateStatus.class,
                        GetStatusAutoActivateResponse.Builder::autoActivateStatus)
                .handleResponseHeaderString(
                        "opc-request-id", GetStatusAutoActivateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PutToggleAutoActivateResponse putToggleAutoActivate(
            PutToggleAutoActivateRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(request.getIsAutoActivateOn(), "isAutoActivateOn is required");

        Objects.requireNonNull(request.getDataKeyType(), "dataKeyType is required");

        return clientCall(request, PutToggleAutoActivateResponse::builder)
                .logger(LOG, "putToggleAutoActivate")
                .serviceDetails(
                        "Attributes",
                        "PutToggleAutoActivate",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/AutoActivateToggleStatus/PutToggleAutoActivate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PutToggleAutoActivateRequest::builder)
                .basePath("/20200630")
                .appendPathParam("attributes")
                .appendPathParam("actions")
                .appendPathParam("autoActivate")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("isAutoActivateOn", request.getIsAutoActivateOn())
                .appendEnumQueryParam("dataKeyType", request.getDataKeyType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.AutoActivateToggleStatus.class,
                        PutToggleAutoActivateResponse.Builder::autoActivateToggleStatus)
                .handleResponseHeaderString(
                        "opc-request-id", PutToggleAutoActivateResponse.Builder::opcRequestId)
                .callSync();
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttributesClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttributesClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttributesClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttributesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttributesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttributesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttributesClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}
