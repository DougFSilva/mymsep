package com.dougfsilva.MyMsep.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dougfsilva.MyMsep.dto.UsuarioDto;
import com.dougfsilva.MyMsep.models.usuario.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(source = "perfil.tipo.nome", target = "perfil")
    UsuarioDto toDto(Usuario usuario); 

    Usuario toUsuario(UsuarioDto dto);
    
    List<UsuarioDto> toDto(List<Usuario> usuarios);
    
    List<Usuario> toUsuarios(List<UsuarioDto> usuariosDto);
}
