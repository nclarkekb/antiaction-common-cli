/*
 * Created on 06/02/2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.antiaction.common.cli;

import java.io.IOException;

public class ParseException extends IOException {

	/**
	 * UID.
	 */
	private static final long serialVersionUID = -8007926073603384778L;

	public ParseException() {
		super();
	}

	public ParseException(String message) {
		super( message );
	}

	/*
	public ParseException(String message, Throwable cause) {
		super( message, cause );
	}

	public ParseException(Throwable cause) {
		super( cause );
	}
	*/

}
