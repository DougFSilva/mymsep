package com.dougfsilva.MyMsep.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dougfsilva.MyMsep.exceptions.ObjetoNaoEncontradoException;
import com.dougfsilva.MyMsep.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	default Curso findByIdOrElseThrow(Long id) {
		return findById(id).orElseThrow(
				() -> new ObjetoNaoEncontradoException(String.format("Curso com id %d não encontrado!", id)));
	}

	Page<Curso> findAll(Pageable paginacao);

}
