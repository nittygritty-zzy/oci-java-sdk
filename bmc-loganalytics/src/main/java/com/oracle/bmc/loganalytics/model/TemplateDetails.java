/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * details for scheduled task using template <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TemplateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TemplateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"templateId", "templateParams"})
    public TemplateDetails(String templateId, java.util.List<TemplateParams> templateParams) {
        super();
        this.templateId = templateId;
        this.templateParams = templateParams;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Config template Id of a particular template. */
        @com.fasterxml.jackson.annotation.JsonProperty("templateId")
        private String templateId;

        /**
         * The Config template Id of a particular template.
         *
         * @param templateId the value to set
         * @return this builder
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            this.__explicitlySet__.add("templateId");
            return this;
        }
        /** To store macro params. */
        @com.fasterxml.jackson.annotation.JsonProperty("templateParams")
        private java.util.List<TemplateParams> templateParams;

        /**
         * To store macro params.
         *
         * @param templateParams the value to set
         * @return this builder
         */
        public Builder templateParams(java.util.List<TemplateParams> templateParams) {
            this.templateParams = templateParams;
            this.__explicitlySet__.add("templateParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TemplateDetails build() {
            TemplateDetails model = new TemplateDetails(this.templateId, this.templateParams);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TemplateDetails model) {
            if (model.wasPropertyExplicitlySet("templateId")) {
                this.templateId(model.getTemplateId());
            }
            if (model.wasPropertyExplicitlySet("templateParams")) {
                this.templateParams(model.getTemplateParams());
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

    /** The Config template Id of a particular template. */
    @com.fasterxml.jackson.annotation.JsonProperty("templateId")
    private final String templateId;

    /**
     * The Config template Id of a particular template.
     *
     * @return the value
     */
    public String getTemplateId() {
        return templateId;
    }

    /** To store macro params. */
    @com.fasterxml.jackson.annotation.JsonProperty("templateParams")
    private final java.util.List<TemplateParams> templateParams;

    /**
     * To store macro params.
     *
     * @return the value
     */
    public java.util.List<TemplateParams> getTemplateParams() {
        return templateParams;
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
        sb.append("TemplateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("templateId=").append(String.valueOf(this.templateId));
        sb.append(", templateParams=").append(String.valueOf(this.templateParams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TemplateDetails)) {
            return false;
        }

        TemplateDetails other = (TemplateDetails) o;
        return java.util.Objects.equals(this.templateId, other.templateId)
                && java.util.Objects.equals(this.templateParams, other.templateParams)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.templateId == null ? 43 : this.templateId.hashCode());
        result =
                (result * PRIME)
                        + (this.templateParams == null ? 43 : this.templateParams.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
