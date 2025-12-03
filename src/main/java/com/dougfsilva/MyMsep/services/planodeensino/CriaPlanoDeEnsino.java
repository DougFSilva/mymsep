package com.dougfsilva.MyMsep.services.planodeensino;

import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.dto.PlanoDeEnsinoForm;
import com.dougfsilva.MyMsep.models.PlanoDeEnsino;
import com.dougfsilva.MyMsep.models.usuario.Usuario;
import com.dougfsilva.MyMsep.repository.PlanoDeEnsinoRepository;
import com.dougfsilva.MyMsep.services.usuario.BuscaUsuarioAutenticado;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CriaPlanoDeEnsino {

	private final PlanoDeEnsinoRepository repository;
	private final BuscaUsuarioAutenticado buscaUsuarioAutenticado;
	
	public PlanoDeEnsino criar(PlanoDeEnsinoForm form) {
		Usuario usuario = buscaUsuarioAutenticado.buscar();
		PlanoDeEnsino planoDeEnsino = new PlanoDeEnsino(
				null, 
				form.objetivo(), 
				form.curso(), 
				form.modulo(), 
				form.turma(), 
				form.unidadeCurricular(), 
				form.cargaHoraria(), 
				form.dataInicio(), 
				form.dataFim(), 
				usuario);
		return repository.save(planoDeEnsino);
	}
}
