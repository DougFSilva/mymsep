package com.dougfsilva.MyMsep.dto.ia;

import java.util.List;

public record PlanoDeCursoFiltradoIA(
		String nomeDoCurso,
		int cargaHoraria,
		List<UnidadeCurricularFiltradaIA> unidadesCurriculares
		) {

}
