/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The configuration details of collection rule to enable automatic log collection from an object
 * storage bucket. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateLogAnalyticsObjectCollectionRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLogAnalyticsObjectCollectionRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "compartmentId",
        "osNamespace",
        "osBucketName",
        "collectionType",
        "pollSince",
        "pollTill",
        "logGroupId",
        "logSourceName",
        "entityId",
        "charEncoding",
        "isEnabled",
        "timezone",
        "logSet",
        "logSetKey",
        "logSetExtRegex",
        "overrides",
        "objectNameFilters",
        "logType",
        "isForceHistoricCollection",
        "streamId",
        "streamCursorType",
        "streamCursorTime",
        "definedTags",
        "freeformTags"
    })
    public CreateLogAnalyticsObjectCollectionRuleDetails(
            String name,
            String description,
            String compartmentId,
            String osNamespace,
            String osBucketName,
            ObjectCollectionRuleCollectionTypes collectionType,
            String pollSince,
            String pollTill,
            String logGroupId,
            String logSourceName,
            String entityId,
            String charEncoding,
            Boolean isEnabled,
            String timezone,
            String logSet,
            LogSetKeyTypes logSetKey,
            String logSetExtRegex,
            java.util.Map<String, java.util.List<PropertyOverride>> overrides,
            java.util.List<String> objectNameFilters,
            LogTypes logType,
            Boolean isForceHistoricCollection,
            String streamId,
            StreamCursorTypes streamCursorType,
            java.util.Date streamCursorTime,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.name = name;
        this.description = description;
        this.compartmentId = compartmentId;
        this.osNamespace = osNamespace;
        this.osBucketName = osBucketName;
        this.collectionType = collectionType;
        this.pollSince = pollSince;
        this.pollTill = pollTill;
        this.logGroupId = logGroupId;
        this.logSourceName = logSourceName;
        this.entityId = entityId;
        this.charEncoding = charEncoding;
        this.isEnabled = isEnabled;
        this.timezone = timezone;
        this.logSet = logSet;
        this.logSetKey = logSetKey;
        this.logSetExtRegex = logSetExtRegex;
        this.overrides = overrides;
        this.objectNameFilters = objectNameFilters;
        this.logType = logType;
        this.isForceHistoricCollection = isForceHistoricCollection;
        this.streamId = streamId;
        this.streamCursorType = streamCursorType;
        this.streamCursorTime = streamCursorTime;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique name given to the rule. The name must be unique within the tenancy, and cannot
         * be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique name given to the rule. The name must be unique within the tenancy, and cannot
         * be modified.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A string that describes the details of the rule. It does not have to be unique, and can
         * be changed. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A string that describes the details of the rule. It does not have to be unique, and can
         * be changed. Avoid entering confidential information.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to which this rule belongs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to which this rule belongs.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Object Storage namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("osNamespace")
        private String osNamespace;

        /**
         * Object Storage namespace.
         *
         * @param osNamespace the value to set
         * @return this builder
         */
        public Builder osNamespace(String osNamespace) {
            this.osNamespace = osNamespace;
            this.__explicitlySet__.add("osNamespace");
            return this;
        }
        /** Name of the Object Storage bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("osBucketName")
        private String osBucketName;

        /**
         * Name of the Object Storage bucket.
         *
         * @param osBucketName the value to set
         * @return this builder
         */
        public Builder osBucketName(String osBucketName) {
            this.osBucketName = osBucketName;
            this.__explicitlySet__.add("osBucketName");
            return this;
        }
        /** The type of collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
        private ObjectCollectionRuleCollectionTypes collectionType;

        /**
         * The type of collection.
         *
         * @param collectionType the value to set
         * @return this builder
         */
        public Builder collectionType(ObjectCollectionRuleCollectionTypes collectionType) {
            this.collectionType = collectionType;
            this.__explicitlySet__.add("collectionType");
            return this;
        }
        /**
         * The oldest time of the file in the bucket to consider for collection. Accepted values
         * are: BEGINNING or CURRENT_TIME or RFC3339 formatted datetime string. Use this for
         * HISTORIC or HISTORIC_LIVE collection types. When collectionType is LIVE, specifying
         * pollSince value other than CURRENT_TIME will result in error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pollSince")
        private String pollSince;

        /**
         * The oldest time of the file in the bucket to consider for collection. Accepted values
         * are: BEGINNING or CURRENT_TIME or RFC3339 formatted datetime string. Use this for
         * HISTORIC or HISTORIC_LIVE collection types. When collectionType is LIVE, specifying
         * pollSince value other than CURRENT_TIME will result in error.
         *
         * @param pollSince the value to set
         * @return this builder
         */
        public Builder pollSince(String pollSince) {
            this.pollSince = pollSince;
            this.__explicitlySet__.add("pollSince");
            return this;
        }
        /**
         * The newest time of the file in the bucket to consider for collection. Accepted values
         * are: CURRENT_TIME or RFC3339 formatted datetime string. Use this for HISTORIC collection
         * type. When collectionType is LIVE or HISTORIC_LIVE, specifying pollTill will result in
         * error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pollTill")
        private String pollTill;

        /**
         * The newest time of the file in the bucket to consider for collection. Accepted values
         * are: CURRENT_TIME or RFC3339 formatted datetime string. Use this for HISTORIC collection
         * type. When collectionType is LIVE or HISTORIC_LIVE, specifying pollTill will result in
         * error.
         *
         * @param pollTill the value to set
         * @return this builder
         */
        public Builder pollTill(String pollTill) {
            this.pollTill = pollTill;
            this.__explicitlySet__.add("pollTill");
            return this;
        }
        /** Logging Analytics Log group OCID to associate the processed logs with. */
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * Logging Analytics Log group OCID to associate the processed logs with.
         *
         * @param logGroupId the value to set
         * @return this builder
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /** Name of the Logging Analytics Source to use for the processing. */
        @com.fasterxml.jackson.annotation.JsonProperty("logSourceName")
        private String logSourceName;

        /**
         * Name of the Logging Analytics Source to use for the processing.
         *
         * @param logSourceName the value to set
         * @return this builder
         */
        public Builder logSourceName(String logSourceName) {
            this.logSourceName = logSourceName;
            this.__explicitlySet__.add("logSourceName");
            return this;
        }
        /**
         * Logging Analytics entity OCID. Associates the processed logs with the given entity
         * (optional).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * Logging Analytics entity OCID. Associates the processed logs with the given entity
         * (optional).
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * An optional character encoding to aid in detecting the character encoding of the contents
         * of the objects while processing. It is recommended to set this value as ISO_8859_1 when
         * configuring content of the objects having more numeric characters, and very few
         * alphabets. For e.g. this applies when configuring VCN Flow Logs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("charEncoding")
        private String charEncoding;

        /**
         * An optional character encoding to aid in detecting the character encoding of the contents
         * of the objects while processing. It is recommended to set this value as ISO_8859_1 when
         * configuring content of the objects having more numeric characters, and very few
         * alphabets. For e.g. this applies when configuring VCN Flow Logs.
         *
         * @param charEncoding the value to set
         * @return this builder
         */
        public Builder charEncoding(String charEncoding) {
            this.charEncoding = charEncoding;
            this.__explicitlySet__.add("charEncoding");
            return this;
        }
        /** Whether or not this rule is currently enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether or not this rule is currently enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Timezone to be used when processing log entries whose timestamps do not include an
         * explicit timezone. When this property is not specified, the timezone of the entity
         * specified is used. If the entity is also not specified or do not have a valid timezone
         * then UTC is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * Timezone to be used when processing log entries whose timestamps do not include an
         * explicit timezone. When this property is not specified, the timezone of the entity
         * specified is used. If the entity is also not specified or do not have a valid timezone
         * then UTC is used.
         *
         * @param timezone the value to set
         * @return this builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * The logSet to be associated with the processed logs. The logSet feature can be used by
         * customers with high volume of data and this feature has to be enabled for a given tenancy
         * prior to its usage. When logSetExtRegex value is provided, it will take precedence over
         * this logSet value and logSet will be computed dynamically using logSetKey and
         * logSetExtRegex.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logSet")
        private String logSet;

        /**
         * The logSet to be associated with the processed logs. The logSet feature can be used by
         * customers with high volume of data and this feature has to be enabled for a given tenancy
         * prior to its usage. When logSetExtRegex value is provided, it will take precedence over
         * this logSet value and logSet will be computed dynamically using logSetKey and
         * logSetExtRegex.
         *
         * @param logSet the value to set
         * @return this builder
         */
        public Builder logSet(String logSet) {
            this.logSet = logSet;
            this.__explicitlySet__.add("logSet");
            return this;
        }
        /**
         * An optional parameter to indicate from where the logSet to be extracted using
         * logSetExtRegex. Default value is OBJECT_PATH (e.g.
         * /n/<namespace>/b/<bucketname>/o/<objectname>).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logSetKey")
        private LogSetKeyTypes logSetKey;

        /**
         * An optional parameter to indicate from where the logSet to be extracted using
         * logSetExtRegex. Default value is OBJECT_PATH (e.g.
         * /n/<namespace>/b/<bucketname>/o/<objectname>).
         *
         * @param logSetKey the value to set
         * @return this builder
         */
        public Builder logSetKey(LogSetKeyTypes logSetKey) {
            this.logSetKey = logSetKey;
            this.__explicitlySet__.add("logSetKey");
            return this;
        }
        /**
         * The regex to be applied against given logSetKey. Regex has to be in string escaped
         * format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logSetExtRegex")
        private String logSetExtRegex;

        /**
         * The regex to be applied against given logSetKey. Regex has to be in string escaped
         * format.
         *
         * @param logSetExtRegex the value to set
         * @return this builder
         */
        public Builder logSetExtRegex(String logSetExtRegex) {
            this.logSetExtRegex = logSetExtRegex;
            this.__explicitlySet__.add("logSetExtRegex");
            return this;
        }
        /**
         * The override is used to modify some important configuration properties for objects
         * matching a specific pattern inside the bucket. Supported propeties for override are:
         * logSourceName, charEncoding, entityId. Supported matchType for override are "contains".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("overrides")
        private java.util.Map<String, java.util.List<PropertyOverride>> overrides;

        /**
         * The override is used to modify some important configuration properties for objects
         * matching a specific pattern inside the bucket. Supported propeties for override are:
         * logSourceName, charEncoding, entityId. Supported matchType for override are "contains".
         *
         * @param overrides the value to set
         * @return this builder
         */
        public Builder overrides(
                java.util.Map<String, java.util.List<PropertyOverride>> overrides) {
            this.overrides = overrides;
            this.__explicitlySet__.add("overrides");
            return this;
        }
        /**
         * When the filters are provided, only the objects matching the filters are picked up for
         * processing. The matchType supported is exact match and accommodates wildcard "*". For
         * more information on filters, see [Event
         * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectNameFilters")
        private java.util.List<String> objectNameFilters;

        /**
         * When the filters are provided, only the objects matching the filters are picked up for
         * processing. The matchType supported is exact match and accommodates wildcard "*". For
         * more information on filters, see [Event
         * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
         *
         * @param objectNameFilters the value to set
         * @return this builder
         */
        public Builder objectNameFilters(java.util.List<String> objectNameFilters) {
            this.objectNameFilters = objectNameFilters;
            this.__explicitlySet__.add("objectNameFilters");
            return this;
        }
        /** Type of files/objects in this object collection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private LogTypes logType;

        /**
         * Type of files/objects in this object collection rule.
         *
         * @param logType the value to set
         * @return this builder
         */
        public Builder logType(LogTypes logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
            return this;
        }
        /**
         * Flag to allow historic collection if poll period overlaps with existing ACTIVE collection
         * rule
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceHistoricCollection")
        private Boolean isForceHistoricCollection;

        /**
         * Flag to allow historic collection if poll period overlaps with existing ACTIVE collection
         * rule
         *
         * @param isForceHistoricCollection the value to set
         * @return this builder
         */
        public Builder isForceHistoricCollection(Boolean isForceHistoricCollection) {
            this.isForceHistoricCollection = isForceHistoricCollection;
            this.__explicitlySet__.add("isForceHistoricCollection");
            return this;
        }
        /**
         * A Stream OCID is required for Object Collection rules of type LIVE or HISTORIC_LIVE,
         * which will be used by Logging Analytics while creating Event Rule and consume the event
         * notifications created by the Object Storage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streamId")
        private String streamId;

        /**
         * A Stream OCID is required for Object Collection rules of type LIVE or HISTORIC_LIVE,
         * which will be used by Logging Analytics while creating Event Rule and consume the event
         * notifications created by the Object Storage.
         *
         * @param streamId the value to set
         * @return this builder
         */
        public Builder streamId(String streamId) {
            this.streamId = streamId;
            this.__explicitlySet__.add("streamId");
            return this;
        }
        /**
         * Cursor type used to fetch messages from stream. When the streamCursorType is set to
         * DEFAULT, the existing cursor position will be used if already set by any previous
         * objection collection rule(s) using the same stream. Otherwise, the behaviour is to
         * consume from the oldest available message in the stream. When the streamCursorType is set
         * to TRIM_HORIZON, the behaviour is to start consuming from the oldest available message in
         * the stream. When the streamCursorType is set to LATEST, the behavior is to start
         * consuming messages that were published after the creation of this rule. When the
         * streamCursorType is set to AT_TIME, the behavior is to start consuming from a given time.
         * For more information on cursor types, see [Stream Consumer
         * Groups](https://docs.oracle.com/en-us/iaas/Content/Streaming/Tasks/using_consumer_groups.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streamCursorType")
        private StreamCursorTypes streamCursorType;

        /**
         * Cursor type used to fetch messages from stream. When the streamCursorType is set to
         * DEFAULT, the existing cursor position will be used if already set by any previous
         * objection collection rule(s) using the same stream. Otherwise, the behaviour is to
         * consume from the oldest available message in the stream. When the streamCursorType is set
         * to TRIM_HORIZON, the behaviour is to start consuming from the oldest available message in
         * the stream. When the streamCursorType is set to LATEST, the behavior is to start
         * consuming messages that were published after the creation of this rule. When the
         * streamCursorType is set to AT_TIME, the behavior is to start consuming from a given time.
         * For more information on cursor types, see [Stream Consumer
         * Groups](https://docs.oracle.com/en-us/iaas/Content/Streaming/Tasks/using_consumer_groups.htm).
         *
         * @param streamCursorType the value to set
         * @return this builder
         */
        public Builder streamCursorType(StreamCursorTypes streamCursorType) {
            this.streamCursorType = streamCursorType;
            this.__explicitlySet__.add("streamCursorType");
            return this;
        }
        /** The time from which to consume the objects, if streamCursorType is AT_TIME. */
        @com.fasterxml.jackson.annotation.JsonProperty("streamCursorTime")
        private java.util.Date streamCursorTime;

        /**
         * The time from which to consume the objects, if streamCursorType is AT_TIME.
         *
         * @param streamCursorTime the value to set
         * @return this builder
         */
        public Builder streamCursorTime(java.util.Date streamCursorTime) {
            this.streamCursorTime = streamCursorTime;
            this.__explicitlySet__.add("streamCursorTime");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLogAnalyticsObjectCollectionRuleDetails build() {
            CreateLogAnalyticsObjectCollectionRuleDetails model =
                    new CreateLogAnalyticsObjectCollectionRuleDetails(
                            this.name,
                            this.description,
                            this.compartmentId,
                            this.osNamespace,
                            this.osBucketName,
                            this.collectionType,
                            this.pollSince,
                            this.pollTill,
                            this.logGroupId,
                            this.logSourceName,
                            this.entityId,
                            this.charEncoding,
                            this.isEnabled,
                            this.timezone,
                            this.logSet,
                            this.logSetKey,
                            this.logSetExtRegex,
                            this.overrides,
                            this.objectNameFilters,
                            this.logType,
                            this.isForceHistoricCollection,
                            this.streamId,
                            this.streamCursorType,
                            this.streamCursorTime,
                            this.definedTags,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLogAnalyticsObjectCollectionRuleDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("osNamespace")) {
                this.osNamespace(model.getOsNamespace());
            }
            if (model.wasPropertyExplicitlySet("osBucketName")) {
                this.osBucketName(model.getOsBucketName());
            }
            if (model.wasPropertyExplicitlySet("collectionType")) {
                this.collectionType(model.getCollectionType());
            }
            if (model.wasPropertyExplicitlySet("pollSince")) {
                this.pollSince(model.getPollSince());
            }
            if (model.wasPropertyExplicitlySet("pollTill")) {
                this.pollTill(model.getPollTill());
            }
            if (model.wasPropertyExplicitlySet("logGroupId")) {
                this.logGroupId(model.getLogGroupId());
            }
            if (model.wasPropertyExplicitlySet("logSourceName")) {
                this.logSourceName(model.getLogSourceName());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("charEncoding")) {
                this.charEncoding(model.getCharEncoding());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("logSet")) {
                this.logSet(model.getLogSet());
            }
            if (model.wasPropertyExplicitlySet("logSetKey")) {
                this.logSetKey(model.getLogSetKey());
            }
            if (model.wasPropertyExplicitlySet("logSetExtRegex")) {
                this.logSetExtRegex(model.getLogSetExtRegex());
            }
            if (model.wasPropertyExplicitlySet("overrides")) {
                this.overrides(model.getOverrides());
            }
            if (model.wasPropertyExplicitlySet("objectNameFilters")) {
                this.objectNameFilters(model.getObjectNameFilters());
            }
            if (model.wasPropertyExplicitlySet("logType")) {
                this.logType(model.getLogType());
            }
            if (model.wasPropertyExplicitlySet("isForceHistoricCollection")) {
                this.isForceHistoricCollection(model.getIsForceHistoricCollection());
            }
            if (model.wasPropertyExplicitlySet("streamId")) {
                this.streamId(model.getStreamId());
            }
            if (model.wasPropertyExplicitlySet("streamCursorType")) {
                this.streamCursorType(model.getStreamCursorType());
            }
            if (model.wasPropertyExplicitlySet("streamCursorTime")) {
                this.streamCursorTime(model.getStreamCursorTime());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * A unique name given to the rule. The name must be unique within the tenancy, and cannot be
     * modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique name given to the rule. The name must be unique within the tenancy, and cannot be
     * modified.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A string that describes the details of the rule. It does not have to be unique, and can be
     * changed. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A string that describes the details of the rule. It does not have to be unique, and can be
     * changed. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to which this rule belongs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to which this rule belongs.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Object Storage namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("osNamespace")
    private final String osNamespace;

    /**
     * Object Storage namespace.
     *
     * @return the value
     */
    public String getOsNamespace() {
        return osNamespace;
    }

    /** Name of the Object Storage bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("osBucketName")
    private final String osBucketName;

    /**
     * Name of the Object Storage bucket.
     *
     * @return the value
     */
    public String getOsBucketName() {
        return osBucketName;
    }

    /** The type of collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
    private final ObjectCollectionRuleCollectionTypes collectionType;

    /**
     * The type of collection.
     *
     * @return the value
     */
    public ObjectCollectionRuleCollectionTypes getCollectionType() {
        return collectionType;
    }

    /**
     * The oldest time of the file in the bucket to consider for collection. Accepted values are:
     * BEGINNING or CURRENT_TIME or RFC3339 formatted datetime string. Use this for HISTORIC or
     * HISTORIC_LIVE collection types. When collectionType is LIVE, specifying pollSince value other
     * than CURRENT_TIME will result in error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pollSince")
    private final String pollSince;

    /**
     * The oldest time of the file in the bucket to consider for collection. Accepted values are:
     * BEGINNING or CURRENT_TIME or RFC3339 formatted datetime string. Use this for HISTORIC or
     * HISTORIC_LIVE collection types. When collectionType is LIVE, specifying pollSince value other
     * than CURRENT_TIME will result in error.
     *
     * @return the value
     */
    public String getPollSince() {
        return pollSince;
    }

    /**
     * The newest time of the file in the bucket to consider for collection. Accepted values are:
     * CURRENT_TIME or RFC3339 formatted datetime string. Use this for HISTORIC collection type.
     * When collectionType is LIVE or HISTORIC_LIVE, specifying pollTill will result in error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pollTill")
    private final String pollTill;

    /**
     * The newest time of the file in the bucket to consider for collection. Accepted values are:
     * CURRENT_TIME or RFC3339 formatted datetime string. Use this for HISTORIC collection type.
     * When collectionType is LIVE or HISTORIC_LIVE, specifying pollTill will result in error.
     *
     * @return the value
     */
    public String getPollTill() {
        return pollTill;
    }

    /** Logging Analytics Log group OCID to associate the processed logs with. */
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * Logging Analytics Log group OCID to associate the processed logs with.
     *
     * @return the value
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    /** Name of the Logging Analytics Source to use for the processing. */
    @com.fasterxml.jackson.annotation.JsonProperty("logSourceName")
    private final String logSourceName;

    /**
     * Name of the Logging Analytics Source to use for the processing.
     *
     * @return the value
     */
    public String getLogSourceName() {
        return logSourceName;
    }

    /**
     * Logging Analytics entity OCID. Associates the processed logs with the given entity
     * (optional).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * Logging Analytics entity OCID. Associates the processed logs with the given entity
     * (optional).
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * An optional character encoding to aid in detecting the character encoding of the contents of
     * the objects while processing. It is recommended to set this value as ISO_8859_1 when
     * configuring content of the objects having more numeric characters, and very few alphabets.
     * For e.g. this applies when configuring VCN Flow Logs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("charEncoding")
    private final String charEncoding;

    /**
     * An optional character encoding to aid in detecting the character encoding of the contents of
     * the objects while processing. It is recommended to set this value as ISO_8859_1 when
     * configuring content of the objects having more numeric characters, and very few alphabets.
     * For e.g. this applies when configuring VCN Flow Logs.
     *
     * @return the value
     */
    public String getCharEncoding() {
        return charEncoding;
    }

    /** Whether or not this rule is currently enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether or not this rule is currently enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Timezone to be used when processing log entries whose timestamps do not include an explicit
     * timezone. When this property is not specified, the timezone of the entity specified is used.
     * If the entity is also not specified or do not have a valid timezone then UTC is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * Timezone to be used when processing log entries whose timestamps do not include an explicit
     * timezone. When this property is not specified, the timezone of the entity specified is used.
     * If the entity is also not specified or do not have a valid timezone then UTC is used.
     *
     * @return the value
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * The logSet to be associated with the processed logs. The logSet feature can be used by
     * customers with high volume of data and this feature has to be enabled for a given tenancy
     * prior to its usage. When logSetExtRegex value is provided, it will take precedence over this
     * logSet value and logSet will be computed dynamically using logSetKey and logSetExtRegex.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logSet")
    private final String logSet;

    /**
     * The logSet to be associated with the processed logs. The logSet feature can be used by
     * customers with high volume of data and this feature has to be enabled for a given tenancy
     * prior to its usage. When logSetExtRegex value is provided, it will take precedence over this
     * logSet value and logSet will be computed dynamically using logSetKey and logSetExtRegex.
     *
     * @return the value
     */
    public String getLogSet() {
        return logSet;
    }

    /**
     * An optional parameter to indicate from where the logSet to be extracted using logSetExtRegex.
     * Default value is OBJECT_PATH (e.g. /n/<namespace>/b/<bucketname>/o/<objectname>).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logSetKey")
    private final LogSetKeyTypes logSetKey;

    /**
     * An optional parameter to indicate from where the logSet to be extracted using logSetExtRegex.
     * Default value is OBJECT_PATH (e.g. /n/<namespace>/b/<bucketname>/o/<objectname>).
     *
     * @return the value
     */
    public LogSetKeyTypes getLogSetKey() {
        return logSetKey;
    }

    /**
     * The regex to be applied against given logSetKey. Regex has to be in string escaped format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logSetExtRegex")
    private final String logSetExtRegex;

    /**
     * The regex to be applied against given logSetKey. Regex has to be in string escaped format.
     *
     * @return the value
     */
    public String getLogSetExtRegex() {
        return logSetExtRegex;
    }

    /**
     * The override is used to modify some important configuration properties for objects matching a
     * specific pattern inside the bucket. Supported propeties for override are: logSourceName,
     * charEncoding, entityId. Supported matchType for override are "contains".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    private final java.util.Map<String, java.util.List<PropertyOverride>> overrides;

    /**
     * The override is used to modify some important configuration properties for objects matching a
     * specific pattern inside the bucket. Supported propeties for override are: logSourceName,
     * charEncoding, entityId. Supported matchType for override are "contains".
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<PropertyOverride>> getOverrides() {
        return overrides;
    }

    /**
     * When the filters are provided, only the objects matching the filters are picked up for
     * processing. The matchType supported is exact match and accommodates wildcard "*". For more
     * information on filters, see [Event
     * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectNameFilters")
    private final java.util.List<String> objectNameFilters;

    /**
     * When the filters are provided, only the objects matching the filters are picked up for
     * processing. The matchType supported is exact match and accommodates wildcard "*". For more
     * information on filters, see [Event
     * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
     *
     * @return the value
     */
    public java.util.List<String> getObjectNameFilters() {
        return objectNameFilters;
    }

    /** Type of files/objects in this object collection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    private final LogTypes logType;

    /**
     * Type of files/objects in this object collection rule.
     *
     * @return the value
     */
    public LogTypes getLogType() {
        return logType;
    }

    /**
     * Flag to allow historic collection if poll period overlaps with existing ACTIVE collection
     * rule
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceHistoricCollection")
    private final Boolean isForceHistoricCollection;

    /**
     * Flag to allow historic collection if poll period overlaps with existing ACTIVE collection
     * rule
     *
     * @return the value
     */
    public Boolean getIsForceHistoricCollection() {
        return isForceHistoricCollection;
    }

    /**
     * A Stream OCID is required for Object Collection rules of type LIVE or HISTORIC_LIVE, which
     * will be used by Logging Analytics while creating Event Rule and consume the event
     * notifications created by the Object Storage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streamId")
    private final String streamId;

    /**
     * A Stream OCID is required for Object Collection rules of type LIVE or HISTORIC_LIVE, which
     * will be used by Logging Analytics while creating Event Rule and consume the event
     * notifications created by the Object Storage.
     *
     * @return the value
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * Cursor type used to fetch messages from stream. When the streamCursorType is set to DEFAULT,
     * the existing cursor position will be used if already set by any previous objection collection
     * rule(s) using the same stream. Otherwise, the behaviour is to consume from the oldest
     * available message in the stream. When the streamCursorType is set to TRIM_HORIZON, the
     * behaviour is to start consuming from the oldest available message in the stream. When the
     * streamCursorType is set to LATEST, the behavior is to start consuming messages that were
     * published after the creation of this rule. When the streamCursorType is set to AT_TIME, the
     * behavior is to start consuming from a given time. For more information on cursor types, see
     * [Stream Consumer
     * Groups](https://docs.oracle.com/en-us/iaas/Content/Streaming/Tasks/using_consumer_groups.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streamCursorType")
    private final StreamCursorTypes streamCursorType;

    /**
     * Cursor type used to fetch messages from stream. When the streamCursorType is set to DEFAULT,
     * the existing cursor position will be used if already set by any previous objection collection
     * rule(s) using the same stream. Otherwise, the behaviour is to consume from the oldest
     * available message in the stream. When the streamCursorType is set to TRIM_HORIZON, the
     * behaviour is to start consuming from the oldest available message in the stream. When the
     * streamCursorType is set to LATEST, the behavior is to start consuming messages that were
     * published after the creation of this rule. When the streamCursorType is set to AT_TIME, the
     * behavior is to start consuming from a given time. For more information on cursor types, see
     * [Stream Consumer
     * Groups](https://docs.oracle.com/en-us/iaas/Content/Streaming/Tasks/using_consumer_groups.htm).
     *
     * @return the value
     */
    public StreamCursorTypes getStreamCursorType() {
        return streamCursorType;
    }

    /** The time from which to consume the objects, if streamCursorType is AT_TIME. */
    @com.fasterxml.jackson.annotation.JsonProperty("streamCursorTime")
    private final java.util.Date streamCursorTime;

    /**
     * The time from which to consume the objects, if streamCursorType is AT_TIME.
     *
     * @return the value
     */
    public java.util.Date getStreamCursorTime() {
        return streamCursorTime;
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
        sb.append("CreateLogAnalyticsObjectCollectionRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", osNamespace=").append(String.valueOf(this.osNamespace));
        sb.append(", osBucketName=").append(String.valueOf(this.osBucketName));
        sb.append(", collectionType=").append(String.valueOf(this.collectionType));
        sb.append(", pollSince=").append(String.valueOf(this.pollSince));
        sb.append(", pollTill=").append(String.valueOf(this.pollTill));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", logSourceName=").append(String.valueOf(this.logSourceName));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", charEncoding=").append(String.valueOf(this.charEncoding));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", logSet=").append(String.valueOf(this.logSet));
        sb.append(", logSetKey=").append(String.valueOf(this.logSetKey));
        sb.append(", logSetExtRegex=").append(String.valueOf(this.logSetExtRegex));
        sb.append(", overrides=").append(String.valueOf(this.overrides));
        sb.append(", objectNameFilters=").append(String.valueOf(this.objectNameFilters));
        sb.append(", logType=").append(String.valueOf(this.logType));
        sb.append(", isForceHistoricCollection=")
                .append(String.valueOf(this.isForceHistoricCollection));
        sb.append(", streamId=").append(String.valueOf(this.streamId));
        sb.append(", streamCursorType=").append(String.valueOf(this.streamCursorType));
        sb.append(", streamCursorTime=").append(String.valueOf(this.streamCursorTime));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLogAnalyticsObjectCollectionRuleDetails)) {
            return false;
        }

        CreateLogAnalyticsObjectCollectionRuleDetails other =
                (CreateLogAnalyticsObjectCollectionRuleDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.osNamespace, other.osNamespace)
                && java.util.Objects.equals(this.osBucketName, other.osBucketName)
                && java.util.Objects.equals(this.collectionType, other.collectionType)
                && java.util.Objects.equals(this.pollSince, other.pollSince)
                && java.util.Objects.equals(this.pollTill, other.pollTill)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logSourceName, other.logSourceName)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.charEncoding, other.charEncoding)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.logSet, other.logSet)
                && java.util.Objects.equals(this.logSetKey, other.logSetKey)
                && java.util.Objects.equals(this.logSetExtRegex, other.logSetExtRegex)
                && java.util.Objects.equals(this.overrides, other.overrides)
                && java.util.Objects.equals(this.objectNameFilters, other.objectNameFilters)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(
                        this.isForceHistoricCollection, other.isForceHistoricCollection)
                && java.util.Objects.equals(this.streamId, other.streamId)
                && java.util.Objects.equals(this.streamCursorType, other.streamCursorType)
                && java.util.Objects.equals(this.streamCursorTime, other.streamCursorTime)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.osNamespace == null ? 43 : this.osNamespace.hashCode());
        result = (result * PRIME) + (this.osBucketName == null ? 43 : this.osBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.collectionType == null ? 43 : this.collectionType.hashCode());
        result = (result * PRIME) + (this.pollSince == null ? 43 : this.pollSince.hashCode());
        result = (result * PRIME) + (this.pollTill == null ? 43 : this.pollTill.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.logSourceName == null ? 43 : this.logSourceName.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.charEncoding == null ? 43 : this.charEncoding.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + (this.logSet == null ? 43 : this.logSet.hashCode());
        result = (result * PRIME) + (this.logSetKey == null ? 43 : this.logSetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.logSetExtRegex == null ? 43 : this.logSetExtRegex.hashCode());
        result = (result * PRIME) + (this.overrides == null ? 43 : this.overrides.hashCode());
        result =
                (result * PRIME)
                        + (this.objectNameFilters == null ? 43 : this.objectNameFilters.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceHistoricCollection == null
                                ? 43
                                : this.isForceHistoricCollection.hashCode());
        result = (result * PRIME) + (this.streamId == null ? 43 : this.streamId.hashCode());
        result =
                (result * PRIME)
                        + (this.streamCursorType == null ? 43 : this.streamCursorType.hashCode());
        result =
                (result * PRIME)
                        + (this.streamCursorTime == null ? 43 : this.streamCursorTime.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
