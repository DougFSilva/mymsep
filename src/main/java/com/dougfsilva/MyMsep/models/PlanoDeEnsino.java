package com.dougfsilva.MyMsep.models;

import java.time.LocalDate;

import com.dougfsilva.MyMsep.models.usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "planos_de_ensino")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanoDeEnsino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Turma curso;
	
	@Embedded
	private UnidadeCurricular unidadeCurricular;
	
	@Column(nullable = false)
	private LocalDate dataInicio;
	
	@Column(nullable = false)
	private LocalDate dataFim;
	
	@ManyToOne
	private Usuario proprietario;
	
}
