/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

/** Defines the strategy that determines when no more poll attempts should be made. */
public interface TerminationStrategy {
    /**
     * Returns whether or not polling should be terminated.
     *
     * @param context The context after the last poll attempt.
     * @return true to terminate polling, false to continue.
     */
    boolean shouldTerminate(WaitContext context);
}
