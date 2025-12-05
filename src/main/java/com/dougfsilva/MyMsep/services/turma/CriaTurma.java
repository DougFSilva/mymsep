package com.dougfsilva.MyMsep.services.turma;

import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.dto.form.TurmaForm;
import com.dougfsilva.MyMsep.models.Curso;
import com.dougfsilva.MyMsep.models.Turma;
import com.dougfsilva.MyMsep.repository.CursoRepository;
import com.dougfsilva.MyMsep.repository.TurmaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CriaTurma {

	private final TurmaRepository turmaRepository;
	private final CursoRepository cursoRepository;
	
	public Turma criar(TurmaForm form) {
		Curso curso = cursoRepository.findByIdOrElseThrow(form.cursoId());
		Turma turma = new Turma(null, curso, form.codigo(), form.numero(), form.dataCriacao());
		return turmaRepository.save(turma);
	}
}
