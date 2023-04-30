package aula.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aula.academia.entity.AvaliacaoFisica;


@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {

}
