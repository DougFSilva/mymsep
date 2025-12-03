package com.dougfsilva.MyMsep.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dougfsilva.MyMsep.models.PlanoDeEnsino;

public interface PlanoDeEnsinoRepository extends JpaRepository<PlanoDeEnsino, Long> {

	Page<PlanoDeEnsino> findAll(Pageable paginacao);
}
