package com.dougfsilva.MyMsep.services.curso;

import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.dto.form.CursoForm;
import com.dougfsilva.MyMsep.models.Curso;
import com.dougfsilva.MyMsep.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CriarCurso {

	private final CursoRepository cursoRepository;
	
	public Curso criar(CursoForm form) {
		Curso curso = new Curso(
				null, 
				form.eixoTecnologico(), 
				form.habilitacao(), 
				form.cargaHoraria());
		return cursoRepository.save(curso);
		
	}
	
}
	
