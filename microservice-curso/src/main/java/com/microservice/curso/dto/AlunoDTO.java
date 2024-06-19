package com.microservice.curso.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO {

    private String nome;
    private String sobrenome;
    private String email;
    private Long cursoId;

}
