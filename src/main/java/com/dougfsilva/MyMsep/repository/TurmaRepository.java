package com.dougfsilva.MyMsep.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dougfsilva.MyMsep.exceptions.ObjetoNaoEncontradoException;
import com.dougfsilva.MyMsep.models.Curso;
import com.dougfsilva.MyMsep.models.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {

	default Turma findByIdOrElseThrow(Long id) {
		return findById(id).orElseThrow(
				() -> new ObjetoNaoEncontradoException(String.format("Turma com id %d não encontrado!", id)));
	}
	
	Page<Turma> findByCurso(Curso curso, Pageable paginacao);

	Page<Turma> findAll(Pageable paginacao);
	
	boolean existsByCurso(Curso curso);
	
}