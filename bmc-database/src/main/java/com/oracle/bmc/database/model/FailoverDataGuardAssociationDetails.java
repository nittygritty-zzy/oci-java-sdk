/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Data Guard association failover parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FailoverDataGuardAssociationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FailoverDataGuardAssociationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseAdminPassword"})
    public FailoverDataGuardAssociationDetails(String databaseAdminPassword) {
        super();
        this.databaseAdminPassword = databaseAdminPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The DB system administrator password. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private String databaseAdminPassword;

        /**
         * The DB system administrator password.
         *
         * @param databaseAdminPassword the value to set
         * @return this builder
         */
        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FailoverDataGuardAssociationDetails build() {
            FailoverDataGuardAssociationDetails model =
                    new FailoverDataGuardAssociationDetails(this.databaseAdminPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FailoverDataGuardAssociationDetails model) {
            if (model.wasPropertyExplicitlySet("databaseAdminPassword")) {
                this.databaseAdminPassword(model.getDatabaseAdminPassword());
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

    /** The DB system administrator password. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    private final String databaseAdminPassword;

    /**
     * The DB system administrator password.
     *
     * @return the value
     */
    public String getDatabaseAdminPassword() {
        return databaseAdminPassword;
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
        sb.append("FailoverDataGuardAssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseAdminPassword=").append(String.valueOf(this.databaseAdminPassword));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FailoverDataGuardAssociationDetails)) {
            return false;
        }

        FailoverDataGuardAssociationDetails other = (FailoverDataGuardAssociationDetails) o;
        return java.util.Objects.equals(this.databaseAdminPassword, other.databaseAdminPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseAdminPassword == null
                                ? 43
                                : this.databaseAdminPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
