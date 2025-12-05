package com.dougfsilva.MyMsep.services.curso;

import org.springframework.stereotype.Service;

import com.dougfsilva.MyMsep.exceptions.ErroDeOperacaoComCursoException;
import com.dougfsilva.MyMsep.models.Curso;
import com.dougfsilva.MyMsep.repository.CursoRepository;
import com.dougfsilva.MyMsep.repository.TurmaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeletarCurso {

	private final CursoRepository cursoRepository;
	private final TurmaRepository turmaRepository;

	public void deletar(Long id) {
		Curso curso = cursoRepository.findByIdOrElseThrow(id);
		validarCursoSemTurmas(curso);
		cursoRepository.delete(curso);
	}

	private void validarCursoSemTurmas(Curso curso) {
		if (turmaRepository.existsByCurso(curso)) {
			throw new ErroDeOperacaoComCursoException(
					"Não é possível realizar a operação. O curso possui turmas associadas.");
		}
	}
}
