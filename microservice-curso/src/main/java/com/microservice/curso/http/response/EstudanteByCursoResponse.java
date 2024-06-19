package com.microservice.curso.http.response;

import com.microservice.curso.dto.EstudanteDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstudanteByCursoResponse {

    private String nomeCurso;
    private String professor;
    private List<EstudanteDTO> estudanteDTOList;
}
