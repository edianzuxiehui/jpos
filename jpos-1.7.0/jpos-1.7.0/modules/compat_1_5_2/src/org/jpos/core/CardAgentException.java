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
import org.jpos.iso.ISOException;

/**
 * @author apr@cs.com.uy
 * @version $Id: CardAgentException.java 2854 2010-01-02 10:34:31Z apr $
 * @since jPOS 1.1
 */
public class CardAgentException extends ISOException {
    public CardAgentException () {
        super();
    }
    public CardAgentException (String s) {
        super(s);
    }
    public CardAgentException (Exception e) {
        super(e);
    }
    public CardAgentException (String s, Exception e) {
        super(s, e);
    }
    protected String getTagName() {
        return "card-agent-exception";
    }
}