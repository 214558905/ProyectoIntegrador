package com.rafael.falconi.Api.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EditEventException extends Exception{
	 private static final long serialVersionUID = -7717691994704695707L;

	    public EditEventException(String message) {
	        super(message);
	    }
}
