/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Available capability in a specific On-premise vantage point. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailableCapability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailableCapability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"capability", "count"})
    public AvailableCapability(String capability, Integer count) {
        super();
        this.capability = capability;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Capability of an On-premise vantage point worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("capability")
        private String capability;

        /**
         * Capability of an On-premise vantage point worker.
         *
         * @param capability the value to set
         * @return this builder
         */
        public Builder capability(String capability) {
            this.capability = capability;
            this.__explicitlySet__.add("capability");
            return this;
        }
        /** Count of available capability in a specific On-premise vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Count of available capability in a specific On-premise vantage point.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableCapability build() {
            AvailableCapability model = new AvailableCapability(this.capability, this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableCapability model) {
            if (model.wasPropertyExplicitlySet("capability")) {
                this.capability(model.getCapability());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Capability of an On-premise vantage point worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("capability")
    private final String capability;

    /**
     * Capability of an On-premise vantage point worker.
     *
     * @return the value
     */
    public String getCapability() {
        return capability;
    }

    /** Count of available capability in a specific On-premise vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Count of available capability in a specific On-premise vantage point.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AvailableCapability(");
        sb.append("super=").append(super.toString());
        sb.append("capability=").append(String.valueOf(this.capability));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableCapability)) {
            return false;
        }

        AvailableCapability other = (AvailableCapability) o;
        return java.util.Objects.equals(this.capability, other.capability)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.capability == null ? 43 : this.capability.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
