package com.microservice.aluno.service;
import com.microservice.aluno.entities.Estudante;
import com.microservice.aluno.persistence.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudanteServiceImpl implements IEstudanteService{

    @Autowired
    private EstudanteRepository estudanteRepository;

    @Override
    public List<Estudante> findAll() {
        return estudanteRepository.findAll();
    }

    @Override
    public Estudante findByid(Long id) {
        return estudanteRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Estudante estudante) {
        estudanteRepository.save(estudante);
    }

    @Override
    public List<Estudante> findByIdCurso(Long idCurso) {
        return estudanteRepository.findAllByCursoId(idCurso);
    }
}
