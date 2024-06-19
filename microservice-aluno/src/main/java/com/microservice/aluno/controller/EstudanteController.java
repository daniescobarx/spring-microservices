package com.microservice.aluno.controller;

import com.microservice.aluno.entities.Estudante;
import com.microservice.aluno.service.IEstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudante")
public class EstudanteController {

    @Autowired
    private IEstudanteService estudanteService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEstudante(@RequestBody Estudante estudante){
        estudanteService.save(estudante);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllEstudante(){
        return ResponseEntity.ok(estudanteService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(estudanteService.findByid(id));
    }

    @GetMapping("/search-by-curso/{idCurso}")
    public ResponseEntity<?> findByIdCurso(@PathVariable Long idCurso){
        return ResponseEntity.ok(estudanteService.findByIdCurso(idCurso));
    }
}
