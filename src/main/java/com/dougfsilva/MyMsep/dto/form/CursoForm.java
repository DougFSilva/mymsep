package com.dougfsilva.MyMsep.dto.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CursoForm(
		
		@NotBlank(message = "O Eixo Tecnológico é obrigatório.")
		String eixoTecnologico,
		
		@NotBlank(message = "A Habilitação é obrigatória.")
		String habilitacao,
		
		@NotNull(message = "A Carga Horária é obrigatória.")
		@Min(value = 1, message = "A Carga Horária deve ser de pelo menos 1 hora.")
		int cargaHoraria
		
		) {

}
