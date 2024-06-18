package com.microservice.curso.service;

import com.microservice.curso.entities.Curso;
import com.microservice.curso.persistence.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> findAll() {
        return (List<Curso>) cursoRepository.findAll();
    }

    @Override
    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Curso curso) {
        cursoRepository.save(curso);
    }
}
