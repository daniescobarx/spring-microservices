package com.microservice.curso.http.response;

import com.microservice.curso.dto.AlunoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunoByCursoResponse {

    private String nomeCurso;
    private String professor;
    private List<AlunoDTO> estudanteDTOList;
}
