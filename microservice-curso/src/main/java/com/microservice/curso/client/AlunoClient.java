package com.microservice.curso.client;

import com.microservice.curso.dto.AlunoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-aluno", url = "localhost:8080/api/aluno")
public interface AlunoClient {

    @GetMapping("/search-by-curso/{cursoId}")
    List<AlunoDTO> findAllAlunoByCurso(@PathVariable Long cursoId);
}
