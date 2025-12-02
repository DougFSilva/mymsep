package com.dougfsilva.MyMsep.models;

import com.dougfsilva.MyMsep.models.enums.AvaliacaoCriterio;
import com.dougfsilva.MyMsep.models.enums.TipoCriterio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "criterios_de_avaliacao")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString class CriterioDeAvaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
	private Capacidade capacidade;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoCriterio tipoCriterio;
	
	@Column(nullable = false)
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private AvaliacaoCriterio avaliacao;
	
}
