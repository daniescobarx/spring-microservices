package com.microservice.curso.service;

import com.microservice.curso.client.AlunoClient;
import com.microservice.curso.dto.AlunoDTO;
import com.microservice.curso.entities.Curso;
import com.microservice.curso.http.response.AlunoByCursoResponse;
import com.microservice.curso.persistence.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    private final ICursoRepository cursoRepository;
    private final AlunoClient alunoClient;

    @Autowired
    public CursoServiceImpl(ICursoRepository cursoRepository, AlunoClient alunoClient) {
        this.cursoRepository = cursoRepository;
        this.alunoClient = alunoClient;
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
    public AlunoByCursoResponse findAlunosByIdCurso(Long idCurso) {
        //consulta do curso
        Curso curso = cursoRepository.findById(idCurso).orElse(new Curso());

        //estudantes list
        List<AlunoDTO> alunoDTOList = alunoClient.findAllAlunoByCurso(idCurso);

        return AlunoByCursoResponse.builder()
                .nomeCurso(curso.getNome())
                .professor(curso.getProfessor())
                .AlunoDTOList(alunoDTOList)
                .build();
    }
}
