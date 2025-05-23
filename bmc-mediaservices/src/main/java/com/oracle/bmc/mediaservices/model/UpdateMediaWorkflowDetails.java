/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * The information to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMediaWorkflowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMediaWorkflowDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "tasks",
        "mediaWorkflowConfigurationIds",
        "parameters",
        "freeformTags",
        "definedTags"
    })
    public UpdateMediaWorkflowDetails(
            String displayName,
            java.util.List<MediaWorkflowTask> tasks,
            java.util.List<String> mediaWorkflowConfigurationIds,
            java.util.Map<String, Object> parameters,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.tasks = tasks;
        this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
        this.parameters = parameters;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name for the MediaWorkflow. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name for the MediaWorkflow. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this
         * array must be unique within the array.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tasks")
        private java.util.List<MediaWorkflowTask> tasks;

        /**
         * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this
         * array must be unique within the array.
         *
         * @param tasks the value to set
         * @return this builder
         */
        public Builder tasks(java.util.List<MediaWorkflowTask> tasks) {
            this.tasks = tasks;
            this.__explicitlySet__.add("tasks");
            return this;
        }
        /**
         * Configurations to be applied to all jobs for this workflow. Parameters in these
         * configurations are overridden by parameters in the MediaWorkflowConfigurations of the
         * MediaWorkflogJob and the parameters of the MediaWorkflowJob.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
        private java.util.List<String> mediaWorkflowConfigurationIds;

        /**
         * Configurations to be applied to all jobs for this workflow. Parameters in these
         * configurations are overridden by parameters in the MediaWorkflowConfigurations of the
         * MediaWorkflogJob and the parameters of the MediaWorkflowJob.
         *
         * @param mediaWorkflowConfigurationIds the value to set
         * @return this builder
         */
        public Builder mediaWorkflowConfigurationIds(
                java.util.List<String> mediaWorkflowConfigurationIds) {
            this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
            this.__explicitlySet__.add("mediaWorkflowConfigurationIds");
            return this;
        }
        /**
         * JSON object representing named parameters and their default values that can be referenced
         * throughout this workflow. The values declared here can be overridden by the
         * MediaWorkflowConfigurations or parameters supplied when creating MediaWorkflowJobs from
         * this MediaWorkflow.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, Object> parameters;

        /**
         * JSON object representing named parameters and their default values that can be referenced
         * throughout this workflow. The values declared here can be overridden by the
         * MediaWorkflowConfigurations or parameters supplied when creating MediaWorkflowJobs from
         * this MediaWorkflow.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.Map<String, Object> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public UpdateMediaWorkflowDetails build() {
            UpdateMediaWorkflowDetails model =
                    new UpdateMediaWorkflowDetails(
                            this.displayName,
                            this.tasks,
                            this.mediaWorkflowConfigurationIds,
                            this.parameters,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMediaWorkflowDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("tasks")) {
                this.tasks(model.getTasks());
            }
            if (model.wasPropertyExplicitlySet("mediaWorkflowConfigurationIds")) {
                this.mediaWorkflowConfigurationIds(model.getMediaWorkflowConfigurationIds());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
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
     * Name for the MediaWorkflow. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name for the MediaWorkflow. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array
     * must be unique within the array.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    private final java.util.List<MediaWorkflowTask> tasks;

    /**
     * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array
     * must be unique within the array.
     *
     * @return the value
     */
    public java.util.List<MediaWorkflowTask> getTasks() {
        return tasks;
    }

    /**
     * Configurations to be applied to all jobs for this workflow. Parameters in these
     * configurations are overridden by parameters in the MediaWorkflowConfigurations of the
     * MediaWorkflogJob and the parameters of the MediaWorkflowJob.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
    private final java.util.List<String> mediaWorkflowConfigurationIds;

    /**
     * Configurations to be applied to all jobs for this workflow. Parameters in these
     * configurations are overridden by parameters in the MediaWorkflowConfigurations of the
     * MediaWorkflogJob and the parameters of the MediaWorkflowJob.
     *
     * @return the value
     */
    public java.util.List<String> getMediaWorkflowConfigurationIds() {
        return mediaWorkflowConfigurationIds;
    }

    /**
     * JSON object representing named parameters and their default values that can be referenced
     * throughout this workflow. The values declared here can be overridden by the
     * MediaWorkflowConfigurations or parameters supplied when creating MediaWorkflowJobs from this
     * MediaWorkflow.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, Object> parameters;

    /**
     * JSON object representing named parameters and their default values that can be referenced
     * throughout this workflow. The values declared here can be overridden by the
     * MediaWorkflowConfigurations or parameters supplied when creating MediaWorkflowJobs from this
     * MediaWorkflow.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getParameters() {
        return parameters;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
        sb.append("UpdateMediaWorkflowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(", mediaWorkflowConfigurationIds=")
                .append(String.valueOf(this.mediaWorkflowConfigurationIds));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
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
        if (!(o instanceof UpdateMediaWorkflowDetails)) {
            return false;
        }

        UpdateMediaWorkflowDetails other = (UpdateMediaWorkflowDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.tasks, other.tasks)
                && java.util.Objects.equals(
                        this.mediaWorkflowConfigurationIds, other.mediaWorkflowConfigurationIds)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaWorkflowConfigurationIds == null
                                ? 43
                                : this.mediaWorkflowConfigurationIds.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
