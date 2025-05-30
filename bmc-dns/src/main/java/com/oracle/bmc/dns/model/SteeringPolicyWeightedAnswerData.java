/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SteeringPolicyWeightedAnswerData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SteeringPolicyWeightedAnswerData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"answerCondition", "value"})
    public SteeringPolicyWeightedAnswerData(String answerCondition, Integer value) {
        super();
        this.answerCondition = answerCondition;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An expression that is used to select a set of answers that match a condition. For
         * example, answers with matching pool properties.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
        private String answerCondition;

        /**
         * An expression that is used to select a set of answers that match a condition. For
         * example, answers with matching pool properties.
         *
         * @param answerCondition the value to set
         * @return this builder
         */
        public Builder answerCondition(String answerCondition) {
            this.answerCondition = answerCondition;
            this.__explicitlySet__.add("answerCondition");
            return this;
        }
        /**
         * The weight assigned to the set of selected answers. Answers with a higher weight will be
         * served more frequently. Answers can be given a value between {@code 0} and {@code 255}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Integer value;

        /**
         * The weight assigned to the set of selected answers. Answers with a higher weight will be
         * served more frequently. Answers can be given a value between {@code 0} and {@code 255}.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(Integer value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyWeightedAnswerData build() {
            SteeringPolicyWeightedAnswerData model =
                    new SteeringPolicyWeightedAnswerData(this.answerCondition, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyWeightedAnswerData model) {
            if (model.wasPropertyExplicitlySet("answerCondition")) {
                this.answerCondition(model.getAnswerCondition());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * An expression that is used to select a set of answers that match a condition. For example,
     * answers with matching pool properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("answerCondition")
    private final String answerCondition;

    /**
     * An expression that is used to select a set of answers that match a condition. For example,
     * answers with matching pool properties.
     *
     * @return the value
     */
    public String getAnswerCondition() {
        return answerCondition;
    }

    /**
     * The weight assigned to the set of selected answers. Answers with a higher weight will be
     * served more frequently. Answers can be given a value between {@code 0} and {@code 255}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Integer value;

    /**
     * The weight assigned to the set of selected answers. Answers with a higher weight will be
     * served more frequently. Answers can be given a value between {@code 0} and {@code 255}.
     *
     * @return the value
     */
    public Integer getValue() {
        return value;
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
        sb.append("SteeringPolicyWeightedAnswerData(");
        sb.append("super=").append(super.toString());
        sb.append("answerCondition=").append(String.valueOf(this.answerCondition));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyWeightedAnswerData)) {
            return false;
        }

        SteeringPolicyWeightedAnswerData other = (SteeringPolicyWeightedAnswerData) o;
        return java.util.Objects.equals(this.answerCondition, other.answerCondition)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.answerCondition == null ? 43 : this.answerCondition.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
