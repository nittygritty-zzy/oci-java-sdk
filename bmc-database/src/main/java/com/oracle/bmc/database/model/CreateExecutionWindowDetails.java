/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request to create an execution window resource under an execution resource. <br>
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
        builder = CreateExecutionWindowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateExecutionWindowDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "executionResourceId",
        "timeScheduled",
        "windowDurationInMins",
        "isEnforcedDuration",
        "freeformTags",
        "definedTags"
    })
    public CreateExecutionWindowDetails(
            String compartmentId,
            String executionResourceId,
            java.util.Date timeScheduled,
            Integer windowDurationInMins,
            Boolean isEnforcedDuration,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.executionResourceId = executionResourceId;
        this.timeScheduled = timeScheduled;
        this.windowDurationInMins = windowDurationInMins;
        this.isEnforcedDuration = isEnforcedDuration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * execution resource the execution window belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executionResourceId")
        private String executionResourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * execution resource the execution window belongs to.
         *
         * @param executionResourceId the value to set
         * @return this builder
         */
        public Builder executionResourceId(String executionResourceId) {
            this.executionResourceId = executionResourceId;
            this.__explicitlySet__.add("executionResourceId");
            return this;
        }
        /** The scheduled start date and time of the execution window. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The scheduled start date and time of the execution window.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /**
         * Duration window allows user to set a duration they plan to allocate for Scheduling
         * window. The duration is in minutes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("windowDurationInMins")
        private Integer windowDurationInMins;

        /**
         * Duration window allows user to set a duration they plan to allocate for Scheduling
         * window. The duration is in minutes.
         *
         * @param windowDurationInMins the value to set
         * @return this builder
         */
        public Builder windowDurationInMins(Integer windowDurationInMins) {
            this.windowDurationInMins = windowDurationInMins;
            this.__explicitlySet__.add("windowDurationInMins");
            return this;
        }
        /**
         * Indicates if duration the user plans to allocate for scheduling window is strictly
         * enforced. The default value is {@code FALSE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedDuration")
        private Boolean isEnforcedDuration;

        /**
         * Indicates if duration the user plans to allocate for scheduling window is strictly
         * enforced. The default value is {@code FALSE}.
         *
         * @param isEnforcedDuration the value to set
         * @return this builder
         */
        public Builder isEnforcedDuration(Boolean isEnforcedDuration) {
            this.isEnforcedDuration = isEnforcedDuration;
            this.__explicitlySet__.add("isEnforcedDuration");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExecutionWindowDetails build() {
            CreateExecutionWindowDetails model =
                    new CreateExecutionWindowDetails(
                            this.compartmentId,
                            this.executionResourceId,
                            this.timeScheduled,
                            this.windowDurationInMins,
                            this.isEnforcedDuration,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExecutionWindowDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("executionResourceId")) {
                this.executionResourceId(model.getExecutionResourceId());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("windowDurationInMins")) {
                this.windowDurationInMins(model.getWindowDurationInMins());
            }
            if (model.wasPropertyExplicitlySet("isEnforcedDuration")) {
                this.isEnforcedDuration(model.getIsEnforcedDuration());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * execution resource the execution window belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionResourceId")
    private final String executionResourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * execution resource the execution window belongs to.
     *
     * @return the value
     */
    public String getExecutionResourceId() {
        return executionResourceId;
    }

    /** The scheduled start date and time of the execution window. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The scheduled start date and time of the execution window.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * Duration window allows user to set a duration they plan to allocate for Scheduling window.
     * The duration is in minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("windowDurationInMins")
    private final Integer windowDurationInMins;

    /**
     * Duration window allows user to set a duration they plan to allocate for Scheduling window.
     * The duration is in minutes.
     *
     * @return the value
     */
    public Integer getWindowDurationInMins() {
        return windowDurationInMins;
    }

    /**
     * Indicates if duration the user plans to allocate for scheduling window is strictly enforced.
     * The default value is {@code FALSE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedDuration")
    private final Boolean isEnforcedDuration;

    /**
     * Indicates if duration the user plans to allocate for scheduling window is strictly enforced.
     * The default value is {@code FALSE}.
     *
     * @return the value
     */
    public Boolean getIsEnforcedDuration() {
        return isEnforcedDuration;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("CreateExecutionWindowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", executionResourceId=").append(String.valueOf(this.executionResourceId));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", windowDurationInMins=").append(String.valueOf(this.windowDurationInMins));
        sb.append(", isEnforcedDuration=").append(String.valueOf(this.isEnforcedDuration));
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
        if (!(o instanceof CreateExecutionWindowDetails)) {
            return false;
        }

        CreateExecutionWindowDetails other = (CreateExecutionWindowDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.executionResourceId, other.executionResourceId)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.windowDurationInMins, other.windowDurationInMins)
                && java.util.Objects.equals(this.isEnforcedDuration, other.isEnforcedDuration)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionResourceId == null
                                ? 43
                                : this.executionResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.windowDurationInMins == null
                                ? 43
                                : this.windowDurationInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnforcedDuration == null
                                ? 43
                                : this.isEnforcedDuration.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
