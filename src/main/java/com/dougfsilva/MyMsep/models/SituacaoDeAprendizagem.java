package com.dougfsilva.MyMsep.models;

import java.time.LocalDate;
import java.util.List;

import com.dougfsilva.MyMsep.models.enums.EstrategiaDesafiadora;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "situacoes_de_aprendizagem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SituacaoDeAprendizagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private PlanoDeEnsino planoDeEnsino;
	
	@Column(nullable = false)
	private String contexto;
	
	@Column(nullable = false)
	private String desafio;
	
	@Column(nullable = false)
	private String resultadoEsperado;
	
	@Column(nullable = false)
	private LocalDate dataInicio;
	
	@Column(nullable = false)
	private LocalDate dataFim;
	
	@Column(nullable = false)
	private int cargaHoraria;
	
	@Enumerated(EnumType.STRING)
	private EstrategiaDesafiadora estrategiaDesafiadora;
	
	@ManyToMany
	@JoinTable(
	        name = "situacoes_capacidades",
	        joinColumns = @JoinColumn(name = "situacao_id"),
	        inverseJoinColumns = @JoinColumn(name = "capacidade_id")
	    )
	private List<Capacidade> capacidades;
	
	@ManyToMany
	@JoinTable(
	        name = "situacoes_conhecimentos",
	        joinColumns = @JoinColumn(name = "situacao_id"),
	        inverseJoinColumns = @JoinColumn(name = "conhecimento_id")
	    )
	private List<Conhecimento> conhecimentos;

	public SituacaoDeAprendizagem(PlanoDeEnsino planoDeEnsino, String contexto, String desafio,
			String resultadoEsperado, LocalDate dataInicio, LocalDate dataFim, int cargaHoraria,
			EstrategiaDesafiadora estrategiaDesafiadora) {
		this.planoDeEnsino = planoDeEnsino;
		this.contexto = contexto;
		this.desafio = desafio;
		this.resultadoEsperado = resultadoEsperado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cargaHoraria = cargaHoraria;
		this.estrategiaDesafiadora = estrategiaDesafiadora;
	}
	
	
}
