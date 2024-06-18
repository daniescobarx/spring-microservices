package com.microservice.aluno.persistence;

import com.microservice.aluno.entities.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long>{

    List<Estudante> findAllByCursoId(Long idCurso);

}
