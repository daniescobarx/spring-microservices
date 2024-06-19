package com.microservice.aluno.service;
import com.microservice.aluno.entities.Aluno;
import com.microservice.aluno.persistence.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService{

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno findByid(Long id) {
        return alunoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Aluno estudante) {
        alunoRepository.save(estudante);
    }

    @Override
    public List<Aluno> findByIdCurso(Long idCurso) {
        return alunoRepository.findAllByCursoId(idCurso);
    }
}
