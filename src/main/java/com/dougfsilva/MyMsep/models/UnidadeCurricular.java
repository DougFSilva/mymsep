package com.dougfsilva.MyMsep.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UnidadeCurricular {

	@Column(nullable = false)
	private String unidadeCurricular;

	@Column(nullable = false)
	private int cargaHoraria;
}
