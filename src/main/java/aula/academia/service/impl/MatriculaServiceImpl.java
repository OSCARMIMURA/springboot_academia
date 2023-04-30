package aula.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula.academia.entity.Aluno;
import aula.academia.entity.Matricula;
import aula.academia.form.MatriculaForm;
import aula.academia.repository.AlunoRepository;
import aula.academia.repository.MatriculaRepository;
import aula.academia.service.IMatriculaService;


@Service
public class MatriculaServiceImpl implements IMatriculaService {

  @Autowired
  private MatriculaRepository matriculaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public Matricula create(MatriculaForm form) {
    Matricula matricula = new Matricula();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    matricula.setAluno(aluno);

    return matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return matriculaRepository.findById(id).get();
  }

  @Override
  public List<Matricula> getAll(String bairro) {

    if(bairro == null){
      return matriculaRepository.findAll();
    }else{
      return matriculaRepository.findAlunosMatriculadosBairro(bairro);
    }

  }

  @Override
  public void delete(Long id) {}



}
