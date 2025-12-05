package com.dougfsilva.MyMsep.services.curso;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.models.Curso;
import com.dougfsilva.MyMsep.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BuscaCurso {

	private final CursoRepository cursoRepository;
	
	public Curso buscarPeloId(Long id) {
		return cursoRepository.findByIdOrElseThrow(id);
	}
	
	public Page<Curso> buscarTodos(Pageable paginacao) {
		return cursoRepository.findAll(paginacao);
	}

}
