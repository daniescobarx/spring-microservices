package com.microservice.aluno.service;

import com.microservice.aluno.entities.Aluno;

import java.util.List;

public interface IAlunoService {

    List<Aluno> findAll();

    Aluno findByid(Long id);

    void save(Aluno aluno);

    List<Aluno> findBycursoId(Long cursoId);
}
