/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Globally distributed database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedDatabaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedDatabaseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "databaseVersion",
        "lifecycleState",
        "lifecycleDetails",
        "connectionStrings",
        "prefix",
        "privateEndpointIds",
        "shardingMethod",
        "characterSet",
        "ncharacterSet",
        "chunks",
        "listenerPort",
        "listenerPortTls",
        "onsPortLocal",
        "onsPortRemote",
        "replicationMethod",
        "replicationFactor",
        "replicationUnit",
        "dbDeploymentType",
        "metadata",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DistributedDatabaseSummary(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String databaseVersion,
            DistributedDatabase.LifecycleState lifecycleState,
            String lifecycleDetails,
            DistributedDbConnectionString connectionStrings,
            String prefix,
            java.util.List<String> privateEndpointIds,
            DistributedDatabase.ShardingMethod shardingMethod,
            String characterSet,
            String ncharacterSet,
            Integer chunks,
            Integer listenerPort,
            Integer listenerPortTls,
            Integer onsPortLocal,
            Integer onsPortRemote,
            DistributedDatabase.ReplicationMethod replicationMethod,
            Integer replicationFactor,
            Integer replicationUnit,
            DbDeploymentType dbDeploymentType,
            DistributedDbMetadata metadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.databaseVersion = databaseVersion;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.connectionStrings = connectionStrings;
        this.prefix = prefix;
        this.privateEndpointIds = privateEndpointIds;
        this.shardingMethod = shardingMethod;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.chunks = chunks;
        this.listenerPort = listenerPort;
        this.listenerPortTls = listenerPortTls;
        this.onsPortLocal = onsPortLocal;
        this.onsPortRemote = onsPortRemote;
        this.replicationMethod = replicationMethod;
        this.replicationFactor = replicationFactor;
        this.replicationUnit = replicationUnit;
        this.dbDeploymentType = dbDeploymentType;
        this.metadata = metadata;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the Globally distributed database.
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
         * The time the Globally distributed database was created. An RFC3339 formatted datetime
         * string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Globally distributed database was created. An RFC3339 formatted datetime
         * string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the Globally distributed database was last updated. An RFC3339 formatted
         * datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Globally distributed database was last updated. An RFC3339 formatted
         * datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Oracle Database version for the shards and catalog used in Globally distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * Oracle Database version for the shards and catalog used in Globally distributed database.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** Lifecycle state of sharded database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DistributedDatabase.LifecycleState lifecycleState;

        /**
         * Lifecycle state of sharded database.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(DistributedDatabase.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The lifecycleDetails for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The lifecycleDetails for the Globally distributed database.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private DistributedDbConnectionString connectionStrings;

        public Builder connectionStrings(DistributedDbConnectionString connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
            return this;
        }
        /**
         * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
         * allowed. First character has to be a letter followed by any combination of letter and
         * number.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
         * allowed. First character has to be a letter followed by any combination of letter and
         * number.
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private endpoint associated with Globally distributed autonomous database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIds")
        private java.util.List<String> privateEndpointIds;

        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private endpoint associated with Globally distributed autonomous database.
         *
         * @param privateEndpointIds the value to set
         * @return this builder
         */
        public Builder privateEndpointIds(java.util.List<String> privateEndpointIds) {
            this.privateEndpointIds = privateEndpointIds;
            this.__explicitlySet__.add("privateEndpointIds");
            return this;
        }
        /** Sharding Methods for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
        private DistributedDatabase.ShardingMethod shardingMethod;

        /**
         * Sharding Methods for the Globally distributed database.
         *
         * @param shardingMethod the value to set
         * @return this builder
         */
        public Builder shardingMethod(DistributedDatabase.ShardingMethod shardingMethod) {
            this.shardingMethod = shardingMethod;
            this.__explicitlySet__.add("shardingMethod");
            return this;
        }
        /** The character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the database.
         *
         * @param characterSet the value to set
         * @return this builder
         */
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /** The national character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the database.
         *
         * @param ncharacterSet the value to set
         * @return this builder
         */
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }
        /**
         * The default number of unique chunks in a shardspace. The value of chunks must be greater
         * than 2 times the size of the largest shardgroup in any shardspace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("chunks")
        private Integer chunks;

        /**
         * The default number of unique chunks in a shardspace. The value of chunks must be greater
         * than 2 times the size of the largest shardgroup in any shardspace.
         *
         * @param chunks the value to set
         * @return this builder
         */
        public Builder chunks(Integer chunks) {
            this.chunks = chunks;
            this.__explicitlySet__.add("chunks");
            return this;
        }
        /** The listener port number for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The listener port number for the Globally distributed database.
         *
         * @param listenerPort the value to set
         * @return this builder
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }
        /** The TLS listener port number for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
        private Integer listenerPortTls;

        /**
         * The TLS listener port number for the Globally distributed database.
         *
         * @param listenerPortTls the value to set
         * @return this builder
         */
        public Builder listenerPortTls(Integer listenerPortTls) {
            this.listenerPortTls = listenerPortTls;
            this.__explicitlySet__.add("listenerPortTls");
            return this;
        }
        /** Ons local port number for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
        private Integer onsPortLocal;

        /**
         * Ons local port number for the Globally distributed database.
         *
         * @param onsPortLocal the value to set
         * @return this builder
         */
        public Builder onsPortLocal(Integer onsPortLocal) {
            this.onsPortLocal = onsPortLocal;
            this.__explicitlySet__.add("onsPortLocal");
            return this;
        }
        /** Ons remote port number for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
        private Integer onsPortRemote;

        /**
         * Ons remote port number for the Globally distributed database.
         *
         * @param onsPortRemote the value to set
         * @return this builder
         */
        public Builder onsPortRemote(Integer onsPortRemote) {
            this.onsPortRemote = onsPortRemote;
            this.__explicitlySet__.add("onsPortRemote");
            return this;
        }
        /**
         * The Replication method for Globally distributed database. Use RAFT for Raft replication,
         * and DG for DataGuard. If replicationMethod is not provided, it defaults to DG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
        private DistributedDatabase.ReplicationMethod replicationMethod;

        /**
         * The Replication method for Globally distributed database. Use RAFT for Raft replication,
         * and DG for DataGuard. If replicationMethod is not provided, it defaults to DG.
         *
         * @param replicationMethod the value to set
         * @return this builder
         */
        public Builder replicationMethod(DistributedDatabase.ReplicationMethod replicationMethod) {
            this.replicationMethod = replicationMethod;
            this.__explicitlySet__.add("replicationMethod");
            return this;
        }
        /**
         * The Replication factor for RAFT replication based Globally distributed database.
         * Currently supported values are 3, 5 and 7.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
        private Integer replicationFactor;

        /**
         * The Replication factor for RAFT replication based Globally distributed database.
         * Currently supported values are 3, 5 and 7.
         *
         * @param replicationFactor the value to set
         * @return this builder
         */
        public Builder replicationFactor(Integer replicationFactor) {
            this.replicationFactor = replicationFactor;
            this.__explicitlySet__.add("replicationFactor");
            return this;
        }
        /**
         * For RAFT replication based Globally distributed database, the value should be atleast
         * twice the number of shards.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationUnit")
        private Integer replicationUnit;

        /**
         * For RAFT replication based Globally distributed database, the value should be atleast
         * twice the number of shards.
         *
         * @param replicationUnit the value to set
         * @return this builder
         */
        public Builder replicationUnit(Integer replicationUnit) {
            this.replicationUnit = replicationUnit;
            this.__explicitlySet__.add("replicationUnit");
            return this;
        }
        /** The distributed database deployment type. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbDeploymentType")
        private DbDeploymentType dbDeploymentType;

        /**
         * The distributed database deployment type.
         *
         * @param dbDeploymentType the value to set
         * @return this builder
         */
        public Builder dbDeploymentType(DbDeploymentType dbDeploymentType) {
            this.dbDeploymentType = dbDeploymentType;
            this.__explicitlySet__.add("dbDeploymentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private DistributedDbMetadata metadata;

        public Builder metadata(DistributedDbMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedDatabaseSummary build() {
            DistributedDatabaseSummary model =
                    new DistributedDatabaseSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.databaseVersion,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.connectionStrings,
                            this.prefix,
                            this.privateEndpointIds,
                            this.shardingMethod,
                            this.characterSet,
                            this.ncharacterSet,
                            this.chunks,
                            this.listenerPort,
                            this.listenerPortTls,
                            this.onsPortLocal,
                            this.onsPortRemote,
                            this.replicationMethod,
                            this.replicationFactor,
                            this.replicationUnit,
                            this.dbDeploymentType,
                            this.metadata,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDatabaseSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("connectionStrings")) {
                this.connectionStrings(model.getConnectionStrings());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIds")) {
                this.privateEndpointIds(model.getPrivateEndpointIds());
            }
            if (model.wasPropertyExplicitlySet("shardingMethod")) {
                this.shardingMethod(model.getShardingMethod());
            }
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("chunks")) {
                this.chunks(model.getChunks());
            }
            if (model.wasPropertyExplicitlySet("listenerPort")) {
                this.listenerPort(model.getListenerPort());
            }
            if (model.wasPropertyExplicitlySet("listenerPortTls")) {
                this.listenerPortTls(model.getListenerPortTls());
            }
            if (model.wasPropertyExplicitlySet("onsPortLocal")) {
                this.onsPortLocal(model.getOnsPortLocal());
            }
            if (model.wasPropertyExplicitlySet("onsPortRemote")) {
                this.onsPortRemote(model.getOnsPortRemote());
            }
            if (model.wasPropertyExplicitlySet("replicationMethod")) {
                this.replicationMethod(model.getReplicationMethod());
            }
            if (model.wasPropertyExplicitlySet("replicationFactor")) {
                this.replicationFactor(model.getReplicationFactor());
            }
            if (model.wasPropertyExplicitlySet("replicationUnit")) {
                this.replicationUnit(model.getReplicationUnit());
            }
            if (model.wasPropertyExplicitlySet("dbDeploymentType")) {
                this.dbDeploymentType(model.getDbDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * Globally distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed database.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed database compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed database compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the Globally distributed database.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The time the Globally distributed database was created. An RFC3339 formatted datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Globally distributed database was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Globally distributed database was last updated. An RFC3339 formatted datetime
     * string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Globally distributed database was last updated. An RFC3339 formatted datetime
     * string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Oracle Database version for the shards and catalog used in Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * Oracle Database version for the shards and catalog used in Globally distributed database.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** Lifecycle state of sharded database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DistributedDatabase.LifecycleState lifecycleState;

    /**
     * Lifecycle state of sharded database.
     *
     * @return the value
     */
    public DistributedDatabase.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The lifecycleDetails for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The lifecycleDetails for the Globally distributed database.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    private final DistributedDbConnectionString connectionStrings;

    public DistributedDbConnectionString getConnectionStrings() {
        return connectionStrings;
    }

    /**
     * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
     * allowed. First character has to be a letter followed by any combination of letter and number.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
     * allowed. First character has to be a letter followed by any combination of letter and number.
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private
     * endpoint associated with Globally distributed autonomous database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIds")
    private final java.util.List<String> privateEndpointIds;

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private
     * endpoint associated with Globally distributed autonomous database.
     *
     * @return the value
     */
    public java.util.List<String> getPrivateEndpointIds() {
        return privateEndpointIds;
    }

    /** Sharding Methods for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
    private final DistributedDatabase.ShardingMethod shardingMethod;

    /**
     * Sharding Methods for the Globally distributed database.
     *
     * @return the value
     */
    public DistributedDatabase.ShardingMethod getShardingMethod() {
        return shardingMethod;
    }

    /** The character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the database.
     *
     * @return the value
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /** The national character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the database.
     *
     * @return the value
     */
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The default number of unique chunks in a shardspace. The value of chunks must be greater than
     * 2 times the size of the largest shardgroup in any shardspace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chunks")
    private final Integer chunks;

    /**
     * The default number of unique chunks in a shardspace. The value of chunks must be greater than
     * 2 times the size of the largest shardgroup in any shardspace.
     *
     * @return the value
     */
    public Integer getChunks() {
        return chunks;
    }

    /** The listener port number for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The listener port number for the Globally distributed database.
     *
     * @return the value
     */
    public Integer getListenerPort() {
        return listenerPort;
    }

    /** The TLS listener port number for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
    private final Integer listenerPortTls;

    /**
     * The TLS listener port number for the Globally distributed database.
     *
     * @return the value
     */
    public Integer getListenerPortTls() {
        return listenerPortTls;
    }

    /** Ons local port number for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
    private final Integer onsPortLocal;

    /**
     * Ons local port number for the Globally distributed database.
     *
     * @return the value
     */
    public Integer getOnsPortLocal() {
        return onsPortLocal;
    }

    /** Ons remote port number for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
    private final Integer onsPortRemote;

    /**
     * Ons remote port number for the Globally distributed database.
     *
     * @return the value
     */
    public Integer getOnsPortRemote() {
        return onsPortRemote;
    }

    /**
     * The Replication method for Globally distributed database. Use RAFT for Raft replication, and
     * DG for DataGuard. If replicationMethod is not provided, it defaults to DG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
    private final DistributedDatabase.ReplicationMethod replicationMethod;

    /**
     * The Replication method for Globally distributed database. Use RAFT for Raft replication, and
     * DG for DataGuard. If replicationMethod is not provided, it defaults to DG.
     *
     * @return the value
     */
    public DistributedDatabase.ReplicationMethod getReplicationMethod() {
        return replicationMethod;
    }

    /**
     * The Replication factor for RAFT replication based Globally distributed database. Currently
     * supported values are 3, 5 and 7.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
    private final Integer replicationFactor;

    /**
     * The Replication factor for RAFT replication based Globally distributed database. Currently
     * supported values are 3, 5 and 7.
     *
     * @return the value
     */
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /**
     * For RAFT replication based Globally distributed database, the value should be atleast twice
     * the number of shards.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationUnit")
    private final Integer replicationUnit;

    /**
     * For RAFT replication based Globally distributed database, the value should be atleast twice
     * the number of shards.
     *
     * @return the value
     */
    public Integer getReplicationUnit() {
        return replicationUnit;
    }

    /** The distributed database deployment type. */
    public enum DbDeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
        ExadbXs("EXADB_XS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DbDeploymentType.class);

        private final String value;
        private static java.util.Map<String, DbDeploymentType> map;

        static {
            map = new java.util.HashMap<>();
            for (DbDeploymentType v : DbDeploymentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DbDeploymentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbDeploymentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DbDeploymentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The distributed database deployment type. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbDeploymentType")
    private final DbDeploymentType dbDeploymentType;

    /**
     * The distributed database deployment type.
     *
     * @return the value
     */
    public DbDeploymentType getDbDeploymentType() {
        return dbDeploymentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final DistributedDbMetadata metadata;

    public DistributedDbMetadata getMetadata() {
        return metadata;
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("DistributedDatabaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", connectionStrings=").append(String.valueOf(this.connectionStrings));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", privateEndpointIds=").append(String.valueOf(this.privateEndpointIds));
        sb.append(", shardingMethod=").append(String.valueOf(this.shardingMethod));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", chunks=").append(String.valueOf(this.chunks));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortTls=").append(String.valueOf(this.listenerPortTls));
        sb.append(", onsPortLocal=").append(String.valueOf(this.onsPortLocal));
        sb.append(", onsPortRemote=").append(String.valueOf(this.onsPortRemote));
        sb.append(", replicationMethod=").append(String.valueOf(this.replicationMethod));
        sb.append(", replicationFactor=").append(String.valueOf(this.replicationFactor));
        sb.append(", replicationUnit=").append(String.valueOf(this.replicationUnit));
        sb.append(", dbDeploymentType=").append(String.valueOf(this.dbDeploymentType));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedDatabaseSummary)) {
            return false;
        }

        DistributedDatabaseSummary other = (DistributedDatabaseSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.connectionStrings, other.connectionStrings)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.privateEndpointIds, other.privateEndpointIds)
                && java.util.Objects.equals(this.shardingMethod, other.shardingMethod)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.chunks, other.chunks)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortTls, other.listenerPortTls)
                && java.util.Objects.equals(this.onsPortLocal, other.onsPortLocal)
                && java.util.Objects.equals(this.onsPortRemote, other.onsPortRemote)
                && java.util.Objects.equals(this.replicationMethod, other.replicationMethod)
                && java.util.Objects.equals(this.replicationFactor, other.replicationFactor)
                && java.util.Objects.equals(this.replicationUnit, other.replicationUnit)
                && java.util.Objects.equals(this.dbDeploymentType, other.dbDeploymentType)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStrings == null ? 43 : this.connectionStrings.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIds == null
                                ? 43
                                : this.privateEndpointIds.hashCode());
        result =
                (result * PRIME)
                        + (this.shardingMethod == null ? 43 : this.shardingMethod.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.chunks == null ? 43 : this.chunks.hashCode());
        result = (result * PRIME) + (this.listenerPort == null ? 43 : this.listenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.listenerPortTls == null ? 43 : this.listenerPortTls.hashCode());
        result = (result * PRIME) + (this.onsPortLocal == null ? 43 : this.onsPortLocal.hashCode());
        result =
                (result * PRIME)
                        + (this.onsPortRemote == null ? 43 : this.onsPortRemote.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationMethod == null ? 43 : this.replicationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationFactor == null ? 43 : this.replicationFactor.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationUnit == null ? 43 : this.replicationUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.dbDeploymentType == null ? 43 : this.dbDeploymentType.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
