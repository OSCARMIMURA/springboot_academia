package aula.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula.academia.entity.Aluno;
import aula.academia.entity.AvaliacaoFisica;
import aula.academia.form.AvaliacaoFisicaForm;
import aula.academia.repository.AlunoRepository;
import aula.academia.repository.AvaliacaoFisicaRepository;
import aula.academia.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(form.getPeso());
    avaliacaoFisica.setAltura(form.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return null;
  }

  @Override
  public List<AvaliacaoFisica> getAll() {

    return avaliacaoFisicaRepository.findAll();
  }

	/*
	 * @Override public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm
	 * formUpdate) { return null; }
	 */

  @Override
  public void delete(Long id) {

  }
}
