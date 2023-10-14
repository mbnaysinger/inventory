package com.inventory.exception;

import org.springframework.http.HttpStatus;

public class MaxResultsNaoInformadoException extends AppException {

	private static final long serialVersionUID = 1L;

	private static final String MESSAGE = "Tamanho máximo de página não informado para consulta solicitada.";

	private static final String DEVELOPER_MESSAGE = "Tamanho máximo de página não informado para consulta solicitada. Informe o tamanho de página desejado através do parâmetro maxResults.";

	public MaxResultsNaoInformadoException() {
		super(MESSAGE, DEVELOPER_MESSAGE, HttpStatus.BAD_REQUEST);
	}

}
