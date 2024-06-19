package com.microservice.curso.client;

import com.microservice.curso.dto.AlunoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-aluno", url = "localhost:8090/api/estudante")
public interface AlunoClient {

    @GetMapping("/search-by-curso/{idCurso}")
    List<AlunoDTO> findAllEstudanteByCurso(@PathVariable Long idCurso);
}
