package com.dougfsilva.MyMsep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougfsilva.MyMsep.models.PlanoDeEnsino;
import com.dougfsilva.MyMsep.models.SituacaoDeAprendizagem;

public interface SituacaoDeAprendizagemRepository extends JpaRepository<SituacaoDeAprendizagem, Long>{

	boolean existsByPlanoDeEnsino(PlanoDeEnsino planoDeEnsino);
}
