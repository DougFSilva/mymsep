package com.dougfsilva.MyMsep.dto.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record PlanoDeEnsinoForm(
		
		@NotBlank(message = "O objetivo é obrigatório.")
        @Size(min = 3, message = "O objetivo deve ter ao menos 3 caracteres.")
        String objetivo,

        @NotBlank(message = "O curso é obrigatório.")
        @Size(min = 2, message = "O curso deve ter ao menos 2 caracteres.")
        String curso,

        String modulo,

        @NotBlank(message = "A turma é obrigatória.")
        String turma,

        @NotBlank(message = "A unidade curricular é obrigatória.")
        @Size(min = 2, message = "A unidade curricular deve ter ao menos 2 caracteres.")
        String unidadeCurricular,

        @Positive(message = "A carga horária deve ser um número positivo.")
        int cargaHoraria,

        @NotNull(message = "A data de início é obrigatória.")
        LocalDate dataInicio,

        @NotNull(message = "A data de fim é obrigatória.")
        LocalDate dataFim

) {

}
