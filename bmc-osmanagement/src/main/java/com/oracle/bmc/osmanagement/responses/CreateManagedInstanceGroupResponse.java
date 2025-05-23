/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class CreateManagedInstanceGroupResponse extends com.oracle.bmc.responses.BmcResponse {
    /** A link to the created Managed Instance Group */
    private String location;

    /**
     * A link to the created Managed Instance Group
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code ManagedInstanceGroup} instance. */
    private com.oracle.bmc.osmanagement.model.ManagedInstanceGroup managedInstanceGroup;

    /**
     * The returned {@code ManagedInstanceGroup} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.osmanagement.model.ManagedInstanceGroup getManagedInstanceGroup() {
        return managedInstanceGroup;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "opcRequestId",
        "etag",
        "managedInstanceGroup"
    })
    private CreateManagedInstanceGroupResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String location,
            String opcRequestId,
            String etag,
            com.oracle.bmc.osmanagement.model.ManagedInstanceGroup managedInstanceGroup) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.managedInstanceGroup = managedInstanceGroup;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateManagedInstanceGroupResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** A link to the created Managed Instance Group */
        private String location;

        /**
         * A link to the created Managed Instance Group
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code ManagedInstanceGroup} instance. */
        private com.oracle.bmc.osmanagement.model.ManagedInstanceGroup managedInstanceGroup;

        /**
         * The returned {@code ManagedInstanceGroup} instance.
         *
         * @param managedInstanceGroup the value to set
         * @return this builder
         */
        public Builder managedInstanceGroup(
                com.oracle.bmc.osmanagement.model.ManagedInstanceGroup managedInstanceGroup) {
            this.managedInstanceGroup = managedInstanceGroup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateManagedInstanceGroupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            managedInstanceGroup(o.getManagedInstanceGroup());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateManagedInstanceGroupResponse build() {
            return new CreateManagedInstanceGroupResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    opcRequestId,
                    etag,
                    managedInstanceGroup);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",managedInstanceGroup=").append(String.valueOf(managedInstanceGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateManagedInstanceGroupResponse)) {
            return false;
        }

        CreateManagedInstanceGroupResponse other = (CreateManagedInstanceGroupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.managedInstanceGroup, other.managedInstanceGroup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroup == null
                                ? 43
                                : this.managedInstanceGroup.hashCode());
        return result;
    }
}
