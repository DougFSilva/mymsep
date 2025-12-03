package com.dougfsilva.MyMsep.services.usuario;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.models.usuario.Usuario;

@Service
public class BuscaUsuarioAutenticado {

	public Usuario buscar() {
		return (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
}
