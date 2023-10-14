package com.inventory.controller;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.inventory.exception.AppException;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

	@ExceptionHandler(AppException.class)
	public final ResponseEntity<ErrorMessage> handleAppException(AppException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex);
		return new ResponseEntity<>(errorMessage, ex.getStatus());
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMessage> handleGenericException(Exception ex) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(ex.getLocalizedMessage());
		errorMessage.setDeveloperMessage(ExceptionUtils.getStackTrace(ex));
		errorMessage.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
