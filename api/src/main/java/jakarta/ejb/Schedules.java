/*
 * Copyright (c) 2006, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ejb;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Applied to a timer callback method to schedule multiple calendar-based
 * timers for the method.
 *
 * The method to which the <code>Schedules</code> annotation is applied
 * must have one of the following signatures, where <code>&lt;METHOD&gt;</code>
 * designates the method name:
 * <p>
 * <pre>
 * void &#060;METHOD&#062;()
 * void &#060;METHOD&#062;(Timer timer)
 * </pre>
 *
 * @see Schedule
 *
 * @since EJB 3.1
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface Schedules {

    /**
     * One or more calendar-based timer specifications.
     */
    Schedule[] value();
}
