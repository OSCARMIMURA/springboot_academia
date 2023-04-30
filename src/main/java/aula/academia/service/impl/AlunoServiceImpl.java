	
package aula.academia.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula.academia.entity.Aluno;
import aula.academia.entity.AvaliacaoFisica;
import aula.academia.form.AlunoForm;
import aula.academia.form.AlunoUpdateForm;
import aula.academia.repository.AlunoRepository;
import aula.academia.service.IAlunoService;
import aula.academia.utils.JavaTimeUtils;

@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository repository;

  @Override
  public Aluno create(AlunoForm form) {
    Aluno aluno = new Aluno();
    
    aluno.setNome(form.getNome());
    aluno.setBairro(form.getBairro());
    aluno.setDataDeNascimento(form.getDataDeNascimento());

    return repository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return null;
  }

  @Override
  public List<Aluno> getAll(String dataDeNascimento) {

    if(dataDeNascimento == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDataDeNascimento(localDate);
    }

  }

	/*
	 * @Override public Aluno update(Long id, AlunoForm formUpdate) { return null; }
	 */

  @Override
  public void delete(Long id) {
  }

  @Override
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    Aluno aluno = repository.findById(id).get();

    return aluno. getAvaliacoes();

  }

}
