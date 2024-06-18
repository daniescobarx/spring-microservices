package com.microservice.aluno.service;

import com.microservice.aluno.entities.Estudante;

import java.util.List;

public interface IEstudanteService {

    List<Estudante> findAll();

    Estudante findByid(Long id);

    void save(Estudante estudante);

    List<Estudante> findByIdCurso(Long idCurso);
}
