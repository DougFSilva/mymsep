package com.dougfsilva.MyMsep.dto.response;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class PlanoDeEnsinoResponse {

	private Long id;
	private String objetivo;
	private String curso;
	private String modulo;
	private String turma;
	private String unidadeCurricular;
	private int cargaHoraria;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private UsuarioResponse proprietario;

}
