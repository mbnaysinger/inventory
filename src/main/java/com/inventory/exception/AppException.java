package com.inventory.exception;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.http.HttpStatus;

public class AppException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	private final HttpStatus status;

	private final String developerMessage;

	public AppException(String message) {
		super(message);
		this.status = null;
		this.developerMessage = null;
	}
	
	public AppException(String message, String developerMessage, HttpStatus status) {
		super(message);
		this.developerMessage = developerMessage;
		this.status = status;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
