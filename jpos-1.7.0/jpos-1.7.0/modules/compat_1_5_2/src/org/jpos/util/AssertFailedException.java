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

package org.jpos.util;

import org.jpos.iso.ISOException;

/**
 * AssertFailedException
 * @author  <a href="mailto:apr@cs.com.uy">Alejandro P. Revilla</a>
 * @version $Revision: 2854 $ $Date: 2010-01-02 08:34:31 -0200 (Sat, 02 Jan 2010) $
 */
public class AssertFailedException extends ISOException {
    public AssertFailedException() {
        super();
    }
    public AssertFailedException (String s) {
        super(s);
    }
    public AssertFailedException (Exception nested) {
        super(nested);
    }
    public AssertFailedException (String s, Exception nested) {
        super(s, nested);
    }
}