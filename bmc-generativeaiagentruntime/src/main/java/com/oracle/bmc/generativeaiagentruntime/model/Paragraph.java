/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The paragraph of the generated message that contains a citation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Paragraph.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Paragraph extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"text", "start", "end"})
    public Paragraph(String text, Integer start, Integer end) {
        super();
        this.text = text;
        this.start = start;
        this.end = end;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The part of the generated message that contains a citation. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The part of the generated message that contains a citation.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** Where the text with a citation starts in the generated message. */
        @com.fasterxml.jackson.annotation.JsonProperty("start")
        private Integer start;

        /**
         * Where the text with a citation starts in the generated message.
         *
         * @param start the value to set
         * @return this builder
         */
        public Builder start(Integer start) {
            this.start = start;
            this.__explicitlySet__.add("start");
            return this;
        }
        /** Where the text with a citation ends in the generated message. */
        @com.fasterxml.jackson.annotation.JsonProperty("end")
        private Integer end;

        /**
         * Where the text with a citation ends in the generated message.
         *
         * @param end the value to set
         * @return this builder
         */
        public Builder end(Integer end) {
            this.end = end;
            this.__explicitlySet__.add("end");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Paragraph build() {
            Paragraph model = new Paragraph(this.text, this.start, this.end);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Paragraph model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("start")) {
                this.start(model.getStart());
            }
            if (model.wasPropertyExplicitlySet("end")) {
                this.end(model.getEnd());
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

    /** The part of the generated message that contains a citation. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The part of the generated message that contains a citation.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** Where the text with a citation starts in the generated message. */
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    private final Integer start;

    /**
     * Where the text with a citation starts in the generated message.
     *
     * @return the value
     */
    public Integer getStart() {
        return start;
    }

    /** Where the text with a citation ends in the generated message. */
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    private final Integer end;

    /**
     * Where the text with a citation ends in the generated message.
     *
     * @return the value
     */
    public Integer getEnd() {
        return end;
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
        sb.append("Paragraph(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", start=").append(String.valueOf(this.start));
        sb.append(", end=").append(String.valueOf(this.end));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Paragraph)) {
            return false;
        }

        Paragraph other = (Paragraph) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.start, other.start)
                && java.util.Objects.equals(this.end, other.end)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.start == null ? 43 : this.start.hashCode());
        result = (result * PRIME) + (this.end == null ? 43 : this.end.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
