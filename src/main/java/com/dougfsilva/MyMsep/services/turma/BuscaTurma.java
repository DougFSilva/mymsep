package com.dougfsilva.MyMsep.services.turma;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.models.Curso;
import com.dougfsilva.MyMsep.models.Turma;
import com.dougfsilva.MyMsep.repository.CursoRepository;
import com.dougfsilva.MyMsep.repository.TurmaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BuscaTurma {

	private final TurmaRepository turmaRepository;
	private final CursoRepository cursoRepository;
	
	public Turma buscarPeloId(Long id) {
		return turmaRepository.findByIdOrElseThrow(id);
	}
	
	public Page<Turma> buscarPeloCurso(Long cursoId, Pageable pageable) {
		Curso curso = cursoRepository.findByIdOrElseThrow(cursoId);
		return turmaRepository.findByCurso(curso, pageable);
	}
	
	public Page<Turma> buscarTodos(Pageable paginacao) {
		return turmaRepository.findAll(paginacao);
	}
}
