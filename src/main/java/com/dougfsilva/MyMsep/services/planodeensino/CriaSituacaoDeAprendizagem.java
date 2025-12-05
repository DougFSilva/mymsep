package com.dougfsilva.MyMsep.services.planodeensino;

import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.dto.form.SituacaoDeAprendizagemForm;
import com.dougfsilva.MyMsep.models.PlanoDeEnsino;
import com.dougfsilva.MyMsep.models.SituacaoDeAprendizagem;
import com.dougfsilva.MyMsep.repository.PlanoDeEnsinoRepository;
import com.dougfsilva.MyMsep.repository.SituacaoDeAprendizagemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CriaSituacaoDeAprendizagem {

	private final SituacaoDeAprendizagemRepository repository;
	private final PlanoDeEnsinoRepository planoDeEnsinoRepository;
	
	public SituacaoDeAprendizagem criar(SituacaoDeAprendizagemForm form) {
		PlanoDeEnsino planoDeEnsino = planoDeEnsinoRepository.findByIdOrElseThrow(form.planoDeEnsinoId());
		SituacaoDeAprendizagem situacaoDeAprendizagem = new SituacaoDeAprendizagem(
				planoDeEnsino, 
				form.contexto(), 
				form.desafio(), 
				form.resultadoEsperado(), 
				form.dataInicio(), 
				form.dataFim(), 
				form.cargaHoraria(), 
				form.estrategiaDesafiadora());
		return repository.save(situacaoDeAprendizagem);
	}
}
