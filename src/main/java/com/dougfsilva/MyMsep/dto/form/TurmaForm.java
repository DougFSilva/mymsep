package com.dougfsilva.MyMsep.dto.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TurmaForm(

		@NotNull(message = "O id do curso é obrigatório") 
		Long cursoId,

		@NotBlank(message = "O código da turma é obrigatório") 
		@Size(min = 3, max = 20, message = "O código da turma deve ter entre 3 e 20 caracteres") 
		String codigo,

		@Size(max = 10, message = "O número da turma deve ter no máximo 10 caracteres") 
		String numero,

		@NotNull(message = "A data de criação é obrigatória")
		LocalDate dataCriacao) {

}
