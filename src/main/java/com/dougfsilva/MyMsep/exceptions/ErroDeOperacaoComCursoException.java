package com.dougfsilva.MyMsep.exceptions;

public class ErroDeOperacaoComCursoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ErroDeOperacaoComCursoException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErroDeOperacaoComCursoException(String message) {
		super(message);
	}

}
