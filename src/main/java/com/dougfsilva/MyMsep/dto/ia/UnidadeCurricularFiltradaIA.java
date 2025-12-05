package com.dougfsilva.MyMsep.dto.ia;

import java.util.List;

public record UnidadeCurricularFiltradaIA(
		int cargaHoraria,
		List<CapacidadeFiltradaIA> capacidadesTecnicas,
		List<CapacidadeFiltradaIA> capacidadesSocioEmocionais,
		List<ConhecimentoFiltradoIA> conhecimentos
		
		) {

}
