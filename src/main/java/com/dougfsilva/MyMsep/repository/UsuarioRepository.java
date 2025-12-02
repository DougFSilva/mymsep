package com.dougfsilva.MyMsep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougfsilva.MyMsep.models.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
