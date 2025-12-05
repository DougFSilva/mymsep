package com.dougfsilva.MyMsep.dto.form;

import java.time.LocalDate;

import com.dougfsilva.MyMsep.models.enums.EstrategiaDesafiadora;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record SituacaoDeAprendizagemForm(
		
		@NotNull(message = "O ID do plano de ensino é obrigatório.")
        Long planoDeEnsinoId,

        @NotBlank(message = "O contexto é obrigatório.")
        @Size(min = 3, message = "O contexto deve ter ao menos 3 caracteres.")
        String contexto,

        @NotBlank(message = "O desafio é obrigatório.")
        @Size(min = 3, message = "O desafio deve ter ao menos 3 caracteres.")
        String desafio,

        @NotBlank(message = "O resultado esperado é obrigatório.")
        @Size(min = 3, message = "O resultado esperado deve ter ao menos 3 caracteres.")
        String resultadoEsperado,

        @NotNull(message = "A data de início é obrigatória.")
        LocalDate dataInicio,

        @NotNull(message = "A data de fim é obrigatória.")
        LocalDate dataFim,

        @Positive(message = "A carga horária deve ser um número positivo.")
        int cargaHoraria,

        @NotNull(message = "A estratégia desafiadora é obrigatória.")
        EstrategiaDesafiadora estrategiaDesafiadora

       ) {

}
