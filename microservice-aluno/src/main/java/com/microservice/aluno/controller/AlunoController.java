package com.microservice.aluno.controller;

import com.microservice.aluno.entities.Aluno;
import com.microservice.aluno.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudante")
public class AlunoController {

    @Autowired
    private IAlunoService alunoService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEstudante(@RequestBody Aluno estudante){
        alunoService.save(estudante);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllEstudante(){
        return ResponseEntity.ok(alunoService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(alunoService.findByid(id));
    }

    @GetMapping("/search-by-curso/{idCurso}")
    public ResponseEntity<?> findByIdCurso(@PathVariable Long idCurso){
        return ResponseEntity.ok(alunoService.findByIdCurso(idCurso));
    }
}
