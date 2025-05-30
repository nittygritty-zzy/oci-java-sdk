/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateFleetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateFleetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "notificationPreferences",
        "isTargetAutoConfirm",
        "resourceSelection",
        "products",
        "freeformTags",
        "definedTags"
    })
    public UpdateFleetDetails(
            String displayName,
            String description,
            java.util.List<NotificationPreference> notificationPreferences,
            Boolean isTargetAutoConfirm,
            ResourceSelection resourceSelection,
            java.util.List<String> products,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.notificationPreferences = notificationPreferences;
        this.isTargetAutoConfirm = isTargetAutoConfirm;
        this.resourceSelection = resourceSelection;
        this.products = products;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
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
         * A user-friendly description. To provide some insight about the resource. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. To provide some insight about the resource. Avoid entering
         * confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Notification Preferences associated with the Fleet. An UPDATE operation replaces the
         * existing notification preferences list entirely
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
        private java.util.List<NotificationPreference> notificationPreferences;

        /**
         * Notification Preferences associated with the Fleet. An UPDATE operation replaces the
         * existing notification preferences list entirely
         *
         * @param notificationPreferences the value to set
         * @return this builder
         */
        public Builder notificationPreferences(
                java.util.List<NotificationPreference> notificationPreferences) {
            this.notificationPreferences = notificationPreferences;
            this.__explicitlySet__.add("notificationPreferences");
            return this;
        }
        /**
         * A value that represents if auto-confirming of the targets can be enabled. This will allow
         * targets to be auto-confirmed in the fleet without manual intervention.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTargetAutoConfirm")
        private Boolean isTargetAutoConfirm;

        /**
         * A value that represents if auto-confirming of the targets can be enabled. This will allow
         * targets to be auto-confirmed in the fleet without manual intervention.
         *
         * @param isTargetAutoConfirm the value to set
         * @return this builder
         */
        public Builder isTargetAutoConfirm(Boolean isTargetAutoConfirm) {
            this.isTargetAutoConfirm = isTargetAutoConfirm;
            this.__explicitlySet__.add("isTargetAutoConfirm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceSelection")
        private ResourceSelection resourceSelection;

        public Builder resourceSelection(ResourceSelection resourceSelection) {
            this.resourceSelection = resourceSelection;
            this.__explicitlySet__.add("resourceSelection");
            return this;
        }
        /** Products associated with the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<String> products;

        /**
         * Products associated with the Fleet.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<String> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
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

        public UpdateFleetDetails build() {
            UpdateFleetDetails model =
                    new UpdateFleetDetails(
                            this.displayName,
                            this.description,
                            this.notificationPreferences,
                            this.isTargetAutoConfirm,
                            this.resourceSelection,
                            this.products,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFleetDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("notificationPreferences")) {
                this.notificationPreferences(model.getNotificationPreferences());
            }
            if (model.wasPropertyExplicitlySet("isTargetAutoConfirm")) {
                this.isTargetAutoConfirm(model.getIsTargetAutoConfirm());
            }
            if (model.wasPropertyExplicitlySet("resourceSelection")) {
                this.resourceSelection(model.getResourceSelection());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description. To provide some insight about the resource. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. To provide some insight about the resource. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Notification Preferences associated with the Fleet. An UPDATE operation replaces the existing
     * notification preferences list entirely
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
    private final java.util.List<NotificationPreference> notificationPreferences;

    /**
     * Notification Preferences associated with the Fleet. An UPDATE operation replaces the existing
     * notification preferences list entirely
     *
     * @return the value
     */
    public java.util.List<NotificationPreference> getNotificationPreferences() {
        return notificationPreferences;
    }

    /**
     * A value that represents if auto-confirming of the targets can be enabled. This will allow
     * targets to be auto-confirmed in the fleet without manual intervention.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTargetAutoConfirm")
    private final Boolean isTargetAutoConfirm;

    /**
     * A value that represents if auto-confirming of the targets can be enabled. This will allow
     * targets to be auto-confirmed in the fleet without manual intervention.
     *
     * @return the value
     */
    public Boolean getIsTargetAutoConfirm() {
        return isTargetAutoConfirm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceSelection")
    private final ResourceSelection resourceSelection;

    public ResourceSelection getResourceSelection() {
        return resourceSelection;
    }

    /** Products associated with the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<String> products;

    /**
     * Products associated with the Fleet.
     *
     * @return the value
     */
    public java.util.List<String> getProducts() {
        return products;
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
        sb.append("UpdateFleetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", notificationPreferences=")
                .append(String.valueOf(this.notificationPreferences));
        sb.append(", isTargetAutoConfirm=").append(String.valueOf(this.isTargetAutoConfirm));
        sb.append(", resourceSelection=").append(String.valueOf(this.resourceSelection));
        sb.append(", products=").append(String.valueOf(this.products));
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
        if (!(o instanceof UpdateFleetDetails)) {
            return false;
        }

        UpdateFleetDetails other = (UpdateFleetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.notificationPreferences, other.notificationPreferences)
                && java.util.Objects.equals(this.isTargetAutoConfirm, other.isTargetAutoConfirm)
                && java.util.Objects.equals(this.resourceSelection, other.resourceSelection)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationPreferences == null
                                ? 43
                                : this.notificationPreferences.hashCode());
        result =
                (result * PRIME)
                        + (this.isTargetAutoConfirm == null
                                ? 43
                                : this.isTargetAutoConfirm.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceSelection == null ? 43 : this.resourceSelection.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
