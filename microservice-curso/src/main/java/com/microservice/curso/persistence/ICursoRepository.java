package com.microservice.curso.persistence;

import com.microservice.curso.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {

}
