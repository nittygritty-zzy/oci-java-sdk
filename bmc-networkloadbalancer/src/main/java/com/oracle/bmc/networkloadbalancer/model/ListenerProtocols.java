/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/** Protocols supported for the listener of the network load balancer. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public enum ListenerProtocols implements com.oracle.bmc.http.internal.BmcEnum {
    Any("ANY"),
    Tcp("TCP"),
    Udp("UDP"),
    TcpAndUdp("TCP_AND_UDP"),
    L3Ip("L3IP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListenerProtocols.class);

    private final String value;
    private static java.util.Map<String, ListenerProtocols> map;

    static {
        map = new java.util.HashMap<>();
        for (ListenerProtocols v : ListenerProtocols.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ListenerProtocols(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ListenerProtocols create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ListenerProtocols', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
