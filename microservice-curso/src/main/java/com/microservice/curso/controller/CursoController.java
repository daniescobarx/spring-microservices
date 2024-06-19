package com.microservice.curso.controller;

import com.microservice.curso.entities.Curso;
import com.microservice.curso.persistence.ICursoRepository;
import com.microservice.curso.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAluno(@RequestBody Curso curso){
        cursoService.save(curso);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllAluno(){
        return ResponseEntity.ok(cursoService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(cursoService.findById(id));
    }

    @GetMapping("/search-aluno/{idCurso}")
    public ResponseEntity<?> findAlunoByIdCurso(@PathVariable Long idCurso){
        return ResponseEntity.ok(cursoService.findAlunosByIdCurso(idCurso));
    }



}
