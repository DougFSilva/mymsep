package com.dougfsilva.MyMsep.services.turma;

import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.exceptions.ErroDeOperacaoComTurmaException;
import com.dougfsilva.MyMsep.models.Turma;
import com.dougfsilva.MyMsep.repository.PlanoDeEnsinoRepository;
import com.dougfsilva.MyMsep.repository.TurmaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeletaTurma {

	private final PlanoDeEnsinoRepository planoDeEnsinoRepository;
	private final TurmaRepository turmaRepository;
	
	public void deletar(Long id) {
		Turma turma = turmaRepository.findByIdOrElseThrow(id);
		validarTurmaSemPlanoDeEnsino(turma);
		turmaRepository.delete(turma);
	}
	
	private void validarTurmaSemPlanoDeEnsino(Turma turma) {
		if (planoDeEnsinoRepository.existsByTurma(turma)) {
			throw new ErroDeOperacaoComTurmaException(
					"Não é possível realizar a operação. A turma possui planos de ensino associados."); 
		}
	}
}
