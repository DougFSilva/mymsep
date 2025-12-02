package com.dougfsilva.MyMsep.models;

import java.time.LocalDate;

import com.dougfsilva.MyMsep.models.usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "planos_de_ensino")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PlanoDeEnsino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String objetivo;
	
	@Column(nullable = false)
	private String curso;
	
	private String modulo;
	
	@Column(nullable = false)
	private String turma;
	
	@Column(nullable = false)
	private String unidadeCurricular;
	
	@Column(nullable = false)
	private int cargaHoraria;
	
	@Column(nullable = false)
	private LocalDate dataInicio;
	
	@Column(nullable = false)
	private LocalDate dataFim;
	
	@ManyToOne
	private Usuario proprietario;
	
}
