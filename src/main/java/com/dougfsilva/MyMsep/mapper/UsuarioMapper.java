package com.dougfsilva.MyMsep.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dougfsilva.MyMsep.dto.response.UsuarioResponse;
import com.dougfsilva.MyMsep.models.usuario.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(source = "perfil.tipo.nome", target = "perfil")
    UsuarioResponse toDto(Usuario usuario); 

    Usuario toUsuario(UsuarioResponse dto);
    
    List<UsuarioResponse> toDto(List<Usuario> usuarios);
    
    List<Usuario> toUsuarios(List<UsuarioResponse> usuariosDto);
}
