package com.dougfsilva.MyMsep.services.curso;

import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.dto.form.CursoForm;
import com.dougfsilva.MyMsep.models.Curso;
import com.dougfsilva.MyMsep.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EditaCurso {

	private final CursoRepository cursoRepository;
	
	public Curso editar(Long id, CursoForm form) {
		Curso curso = cursoRepository.findByIdOrElseThrow(id);
		curso.setEixoTecnologico(form.eixoTecnologico());
		curso.setHabilitacao(form.habilitacao());
		curso.setCargaHoraria(form.cargaHoraria());
		return cursoRepository.save(curso);
	}

}
