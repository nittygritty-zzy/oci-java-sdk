/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Customizable details when performing cloning of a migration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination",
        defaultImpl = CloneMigrationDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OracleCloneMigrationDetails.class,
            name = "ORACLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MySqlCloneMigrationDetails.class,
            name = "MYSQL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CloneMigrationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "sourceDatabaseConnectionId",
        "targetDatabaseConnectionId",
        "freeformTags",
        "definedTags"
    })
    protected CloneMigrationDetails(
            String displayName,
            String compartmentId,
            String sourceDatabaseConnectionId,
            String targetDatabaseConnectionId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
        this.targetDatabaseConnectionId = targetDatabaseConnectionId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
    private final String sourceDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getSourceDatabaseConnectionId() {
        return sourceDatabaseConnectionId;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
    private final String targetDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getTargetDatabaseConnectionId() {
        return targetDatabaseConnectionId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see Resource Tags. Example: {"Department":
     * "Finance"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see Resource Tags. Example: {"Department":
     * "Finance"}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CloneMigrationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceDatabaseConnectionId=")
                .append(String.valueOf(this.sourceDatabaseConnectionId));
        sb.append(", targetDatabaseConnectionId=")
                .append(String.valueOf(this.targetDatabaseConnectionId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloneMigrationDetails)) {
            return false;
        }

        CloneMigrationDetails other = (CloneMigrationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.sourceDatabaseConnectionId, other.sourceDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.targetDatabaseConnectionId, other.targetDatabaseConnectionId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabaseConnectionId == null
                                ? 43
                                : this.sourceDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseConnectionId == null
                                ? 43
                                : this.targetDatabaseConnectionId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
