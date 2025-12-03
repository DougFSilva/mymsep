package com.dougfsilva.MyMsep.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.dougfsilva.MyMsep.dto.PlanoDeEnsinoDto;
import com.dougfsilva.MyMsep.models.PlanoDeEnsino;

@Mapper(componentModel = "spring")
public interface PlanoDeEnsinoMapper {

	PlanoDeEnsinoDto toDto(PlanoDeEnsino planoDeEnsino);

	PlanoDeEnsino toPlanoDeEnsino(PlanoDeEnsinoDto dto);

	List<PlanoDeEnsinoDto> toDto(List<PlanoDeEnsino> planosDeEnsino);

	List<PlanoDeEnsino> toPlanosDeEnsino(List<PlanoDeEnsinoDto> planosDeEnsinoDto);

}
