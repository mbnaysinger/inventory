package com.inventory.exception;

import java.text.MessageFormat;

import org.springframework.http.HttpStatus;

public class MaxResultsExcedeLimiteException extends AppException {

	private static final long serialVersionUID = 1L;

	private static final String MESSAGE = "A consulta solicitada não pode ser executada pois a quantidade de registros solicitados excede a quantidade máxima permitida.";
	
	private static final String MESSAGE_DEVELOPER = "Consultas com tamanho de página superior a {0} não são permitidas.";

	public MaxResultsExcedeLimiteException(Integer maxResultsSupported) {
		super(MESSAGE, MessageFormat.format(MESSAGE_DEVELOPER, maxResultsSupported), HttpStatus.BAD_REQUEST);
	}

}
