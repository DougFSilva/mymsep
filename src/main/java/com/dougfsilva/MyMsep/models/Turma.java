package com.dougfsilva.MyMsep.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "turmas")
@Data
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
	private Curso curso;
	
	@Column(nullable = false)
	private String codigo;
	
	@Column(nullable = false)
	private String numero;
	
	private LocalDate dataCriacao;
	
}
