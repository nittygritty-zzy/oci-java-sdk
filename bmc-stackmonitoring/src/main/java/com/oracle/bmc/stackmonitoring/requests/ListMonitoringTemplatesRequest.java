/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/ListMonitoringTemplatesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListMonitoringTemplatesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ListMonitoringTemplatesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** The ID of the compartment in which data is listed. */
    private String compartmentId;

    /** The ID of the compartment in which data is listed. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return monitoring template based on input monitoringTemplateId */
    private String monitoringTemplateId;

    /** A filter to return monitoring template based on input monitoringTemplateId */
    public String getMonitoringTemplateId() {
        return monitoringTemplateId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.stackmonitoring.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeUpdated is
     * descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeUpdated is
     * descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
        LifeCycleState("lifeCycleState"),
        Status("status"),
        TimeUpdated("timeUpdated"),
        TimeCreated("timeCreated"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeUpdated is
     * descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return monitoring template based on name. */
    private String displayName;

    /** A filter to return monitoring template based on name. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return monitoring template based on input status */
    private com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleDetails status;

    /** A filter to return monitoring template based on input status */
    public com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleDetails getStatus() {
        return status;
    }
    /** A filter to return monitoring template based on Lifecycle State */
    private com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleStates lifecycleState;

    /** A filter to return monitoring template based on Lifecycle State */
    public com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleStates
            getLifecycleState() {
        return lifecycleState;
    }
    /** Multiple resource types filter. */
    private java.util.List<String> resourceTypes;

    /** Multiple resource types filter. */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }
    /** metricName filter. */
    private java.util.List<String> metricName;

    /** metricName filter. */
    public java.util.List<String> getMetricName() {
        return metricName;
    }
    /** namespace filter. */
    private java.util.List<String> namespace;

    /** namespace filter. */
    public java.util.List<String> getNamespace() {
        return namespace;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMonitoringTemplatesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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

        /** The ID of the compartment in which data is listed. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which data is listed.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return monitoring template based on input monitoringTemplateId */
        private String monitoringTemplateId = null;

        /**
         * A filter to return monitoring template based on input monitoringTemplateId
         *
         * @param monitoringTemplateId the value to set
         * @return this builder instance
         */
        public Builder monitoringTemplateId(String monitoringTemplateId) {
            this.monitoringTemplateId = monitoringTemplateId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeUpdated
         * is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeUpdated
         * is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** A filter to return monitoring template based on name. */
        private String displayName = null;

        /**
         * A filter to return monitoring template based on name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** A filter to return monitoring template based on input status */
        private com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleDetails status =
                null;

        /**
         * A filter to return monitoring template based on input status
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleDetails status) {
            this.status = status;
            return this;
        }

        /** A filter to return monitoring template based on Lifecycle State */
        private com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleStates
                lifecycleState = null;

        /**
         * A filter to return monitoring template based on Lifecycle State
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.stackmonitoring.model.MonitoringTemplateLifeCycleStates
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** Multiple resource types filter. */
        private java.util.List<String> resourceTypes = null;

        /**
         * Multiple resource types filter.
         *
         * @param resourceTypes the value to set
         * @return this builder instance
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Singular setter. Multiple resource types filter.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder resourceTypes(String singularValue) {
            return this.resourceTypes(java.util.Arrays.asList(singularValue));
        }

        /** metricName filter. */
        private java.util.List<String> metricName = null;

        /**
         * metricName filter.
         *
         * @param metricName the value to set
         * @return this builder instance
         */
        public Builder metricName(java.util.List<String> metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Singular setter. metricName filter.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder metricName(String singularValue) {
            return this.metricName(java.util.Arrays.asList(singularValue));
        }

        /** namespace filter. */
        private java.util.List<String> namespace = null;

        /**
         * namespace filter.
         *
         * @param namespace the value to set
         * @return this builder instance
         */
        public Builder namespace(java.util.List<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Singular setter. namespace filter.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder namespace(String singularValue) {
            return this.namespace(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListMonitoringTemplatesRequest o) {
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            monitoringTemplateId(o.getMonitoringTemplateId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            displayName(o.getDisplayName());
            status(o.getStatus());
            lifecycleState(o.getLifecycleState());
            resourceTypes(o.getResourceTypes());
            metricName(o.getMetricName());
            namespace(o.getNamespace());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMonitoringTemplatesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMonitoringTemplatesRequest
         */
        public ListMonitoringTemplatesRequest build() {
            ListMonitoringTemplatesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMonitoringTemplatesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMonitoringTemplatesRequest
         */
        public ListMonitoringTemplatesRequest buildWithoutInvocationCallback() {
            ListMonitoringTemplatesRequest request = new ListMonitoringTemplatesRequest();
            request.opcRequestId = opcRequestId;
            request.compartmentId = compartmentId;
            request.monitoringTemplateId = monitoringTemplateId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.displayName = displayName;
            request.status = status;
            request.lifecycleState = lifecycleState;
            request.resourceTypes = resourceTypes;
            request.metricName = metricName;
            request.namespace = namespace;
            return request;
            // new ListMonitoringTemplatesRequest(opcRequestId, compartmentId, monitoringTemplateId,
            // limit, page, sortOrder, sortBy, displayName, status, lifecycleState, resourceTypes,
            // metricName, namespace);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .compartmentId(compartmentId)
                .monitoringTemplateId(monitoringTemplateId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .displayName(displayName)
                .status(status)
                .lifecycleState(lifecycleState)
                .resourceTypes(resourceTypes)
                .metricName(metricName)
                .namespace(namespace);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",monitoringTemplateId=").append(String.valueOf(this.monitoringTemplateId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",resourceTypes=").append(String.valueOf(this.resourceTypes));
        sb.append(",metricName=").append(String.valueOf(this.metricName));
        sb.append(",namespace=").append(String.valueOf(this.namespace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMonitoringTemplatesRequest)) {
            return false;
        }

        ListMonitoringTemplatesRequest other = (ListMonitoringTemplatesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.monitoringTemplateId, other.monitoringTemplateId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.resourceTypes, other.resourceTypes)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.namespace, other.namespace);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.monitoringTemplateId == null
                                ? 43
                                : this.monitoringTemplateId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypes == null ? 43 : this.resourceTypes.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        return result;
    }
}
