package com.dougfsilva.MyMsep.models;

import jakarta.persistence.Column;
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
@Table(name = "niveis_de_desempenho")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NivelDesempenho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
	private PlanoDeEnsino planoDeEnsino;
	
	@Column(nullable = false)
	private int indice;
	
	private int criteriosCriticosAtingidos;
	private int criteriosDesejaveisAtingidos;
	private int nota;
	
}
