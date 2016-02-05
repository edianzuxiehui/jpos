/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2010 Alejandro P. Revilla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.core;


/**
 * @author apr@cs.com.uy
 * @version $Id: VolatileSequencerMBean.java 2854 2010-01-02 10:34:31Z apr $
 * @since jPOS 1.3.9
 */
public interface VolatileSequencerMBean {
    public String[] getCounterNames ();
    public int get (String counterName, int add);
    public int set (String counterName, int value);
}
