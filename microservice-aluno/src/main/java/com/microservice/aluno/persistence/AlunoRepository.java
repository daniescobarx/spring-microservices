package com.microservice.aluno.persistence;

import com.microservice.aluno.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

    List<Aluno> findAllByCursoId(Long cursoId);

}
