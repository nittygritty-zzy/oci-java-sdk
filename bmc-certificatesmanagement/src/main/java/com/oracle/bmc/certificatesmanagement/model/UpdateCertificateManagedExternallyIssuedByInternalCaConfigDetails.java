/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details for updating an externally managed certificate which is issued by a private
 * certificate authority (CA). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails
        extends UpdateCertificateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stage")
        private Stage stage;

        public Builder stage(Stage stage) {
            this.stage = stage;
            this.__explicitlySet__.add("stage");
            return this;
        }
        /** The certificate signing request (in PEM format). */
        @com.fasterxml.jackson.annotation.JsonProperty("csrPem")
        private String csrPem;

        /**
         * The certificate signing request (in PEM format).
         *
         * @param csrPem the value to set
         * @return this builder
         */
        public Builder csrPem(String csrPem) {
            this.csrPem = csrPem;
            this.__explicitlySet__.add("csrPem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails build() {
            UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails model =
                    new UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails(
                            this.versionName, this.stage, this.csrPem, this.validity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails model) {
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("stage")) {
                this.stage(model.getStage());
            }
            if (model.wasPropertyExplicitlySet("csrPem")) {
                this.csrPem(model.getCsrPem());
            }
            if (model.wasPropertyExplicitlySet("validity")) {
                this.validity(model.getValidity());
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

    @Deprecated
    public UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails(
            String versionName, Stage stage, String csrPem, Validity validity) {
        super(versionName, stage);
        this.csrPem = csrPem;
        this.validity = validity;
    }

    /** The certificate signing request (in PEM format). */
    @com.fasterxml.jackson.annotation.JsonProperty("csrPem")
    private final String csrPem;

    /**
     * The certificate signing request (in PEM format).
     *
     * @return the value
     */
    public String getCsrPem() {
        return csrPem;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
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
        sb.append("UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", csrPem=").append(String.valueOf(this.csrPem));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails)) {
            return false;
        }

        UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails other =
                (UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails) o;
        return java.util.Objects.equals(this.csrPem, other.csrPem)
                && java.util.Objects.equals(this.validity, other.validity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.csrPem == null ? 43 : this.csrPem.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        return result;
    }
}
