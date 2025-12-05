package com.dougfsilva.MyMsep.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.dougfsilva.MyMsep.dto.response.PlanoDeEnsinoResponse;
import com.dougfsilva.MyMsep.models.PlanoDeEnsino;

@Mapper(componentModel = "spring")
public interface PlanoDeEnsinoMapper {

	PlanoDeEnsinoResponse toDto(PlanoDeEnsino planoDeEnsino);

	PlanoDeEnsino toPlanoDeEnsino(PlanoDeEnsinoResponse dto);

	List<PlanoDeEnsinoResponse> toDto(List<PlanoDeEnsino> planosDeEnsino);

	List<PlanoDeEnsino> toPlanosDeEnsino(List<PlanoDeEnsinoResponse> planosDeEnsinoDto);

}
