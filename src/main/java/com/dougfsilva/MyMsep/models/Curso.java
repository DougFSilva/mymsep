package com.dougfsilva.MyMsep.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cursos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable = false)
	private String eixoTecnologico;
	
	@Column(nullable = false)
	private String habilitacao;
	
	@Column(nullable = false)
	private int cargaHoraria;
}
