package com.microservice.curso.service;

import com.microservice.curso.entities.Curso;
import com.microservice.curso.http.response.EstudanteByCursoResponse;

import java.util.List;

public interface ICursoService {

    List<Curso> findAll();

    Curso findById(Long id);

    void save(Curso curso);

    EstudanteByCursoResponse findEstudantesByIdCurso(Long idCurso);
}
