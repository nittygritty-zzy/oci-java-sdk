/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Details of the request to start a Java migration analyses. The analyses requires the managed
 * instance OCID, deployed application key, source JDK version, and target JDK version of each
 * selected application. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestDeployedApplicationMigrationAnalysesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestDeployedApplicationMigrationAnalysesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targets"})
    public RequestDeployedApplicationMigrationAnalysesDetails(
            java.util.List<DeployedApplicationMigrationAnalysesTarget> targets) {
        super();
        this.targets = targets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An array of migration analyses requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<DeployedApplicationMigrationAnalysesTarget> targets;

        /**
         * An array of migration analyses requests.
         *
         * @param targets the value to set
         * @return this builder
         */
        public Builder targets(java.util.List<DeployedApplicationMigrationAnalysesTarget> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestDeployedApplicationMigrationAnalysesDetails build() {
            RequestDeployedApplicationMigrationAnalysesDetails model =
                    new RequestDeployedApplicationMigrationAnalysesDetails(this.targets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestDeployedApplicationMigrationAnalysesDetails model) {
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
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

    /** An array of migration analyses requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<DeployedApplicationMigrationAnalysesTarget> targets;

    /**
     * An array of migration analyses requests.
     *
     * @return the value
     */
    public java.util.List<DeployedApplicationMigrationAnalysesTarget> getTargets() {
        return targets;
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
        sb.append("RequestDeployedApplicationMigrationAnalysesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targets=").append(String.valueOf(this.targets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestDeployedApplicationMigrationAnalysesDetails)) {
            return false;
        }

        RequestDeployedApplicationMigrationAnalysesDetails other =
                (RequestDeployedApplicationMigrationAnalysesDetails) o;
        return java.util.Objects.equals(this.targets, other.targets) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
