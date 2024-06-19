package com.microservice.curso.service;

import com.microservice.curso.client.EstudanteClient;
import com.microservice.curso.dto.AlunoDTO;
import com.microservice.curso.entities.Curso;
import com.microservice.curso.http.response.AlunoByCursoResponse;
import com.microservice.curso.http.response.EstudanteByCursoResponse;
import com.microservice.curso.persistence.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    private final ICursoRepository cursoRepository;
    private final EstudanteClient estudanteClient;

    @Autowired
    public CursoServiceImpl(ICursoRepository cursoRepository, EstudanteClient estudanteClient) {
        this.cursoRepository = cursoRepository;
        this.estudanteClient = estudanteClient;
    }

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

    @Override
    public AlunoByCursoResponse findEstudantesByIdCurso(Long idCurso) {
        //consulta do curso
        Curso curso = cursoRepository.findById(idCurso).orElse(new Curso());

        //estudantes list
        List<AlunoDTO> estudanteDTOList = estudanteClient.findAllEstudanteByCurso(idCurso);

        return EstudanteByCursoResponse.builder()
                .nomeCurso(curso.getNome())
                .professor(curso.getProfessor())
                .estudanteDTOList(estudanteDTOList)
                .build();
    }
}
