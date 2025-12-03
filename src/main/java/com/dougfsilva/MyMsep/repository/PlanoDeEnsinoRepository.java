package com.dougfsilva.MyMsep.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dougfsilva.MyMsep.exceptions.ObjetoNaoEncontradoException;
import com.dougfsilva.MyMsep.models.PlanoDeEnsino;

public interface PlanoDeEnsinoRepository extends JpaRepository<PlanoDeEnsino, Long> {
	
	default PlanoDeEnsino findByIdOrElseThrow(Long id) {
		return findById(id).orElseThrow(() -> 
		new ObjetoNaoEncontradoException(String.format("Plano de Ensino com id %d não encontrado!", id)));
	}

	Page<PlanoDeEnsino> findAll(Pageable paginacao);
}
