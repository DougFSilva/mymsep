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
@Table(name = "conhecimentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conhecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String topico;
	
}
