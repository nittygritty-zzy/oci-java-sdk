/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to enable a Database Management feature for an external non-container
 * database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnableExternalNonContainerDatabaseManagementFeatureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnableExternalNonContainerDatabaseManagementFeatureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"featureDetails"})
    public EnableExternalNonContainerDatabaseManagementFeatureDetails(
            ExternalDatabaseFeatureDetails featureDetails) {
        super();
        this.featureDetails = featureDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("featureDetails")
        private ExternalDatabaseFeatureDetails featureDetails;

        public Builder featureDetails(ExternalDatabaseFeatureDetails featureDetails) {
            this.featureDetails = featureDetails;
            this.__explicitlySet__.add("featureDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableExternalNonContainerDatabaseManagementFeatureDetails build() {
            EnableExternalNonContainerDatabaseManagementFeatureDetails model =
                    new EnableExternalNonContainerDatabaseManagementFeatureDetails(
                            this.featureDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableExternalNonContainerDatabaseManagementFeatureDetails model) {
            if (model.wasPropertyExplicitlySet("featureDetails")) {
                this.featureDetails(model.getFeatureDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("featureDetails")
    private final ExternalDatabaseFeatureDetails featureDetails;

    public ExternalDatabaseFeatureDetails getFeatureDetails() {
        return featureDetails;
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
        sb.append("EnableExternalNonContainerDatabaseManagementFeatureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("featureDetails=").append(String.valueOf(this.featureDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableExternalNonContainerDatabaseManagementFeatureDetails)) {
            return false;
        }

        EnableExternalNonContainerDatabaseManagementFeatureDetails other =
                (EnableExternalNonContainerDatabaseManagementFeatureDetails) o;
        return java.util.Objects.equals(this.featureDetails, other.featureDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.featureDetails == null ? 43 : this.featureDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
