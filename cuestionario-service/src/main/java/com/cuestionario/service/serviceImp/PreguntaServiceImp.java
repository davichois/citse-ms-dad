package com.cuestionario.service.serviceImp;

import com.cuestionario.service.entity.Pregunta;
import com.cuestionario.service.repository.PreguntaRepository;
import com.cuestionario.service.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaServiceImp implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;


    @Override
    public List<Pregunta> findAll() {
        return preguntaRepository.findAll();
    }

    @Override
    public Pregunta findById(int id_pregunta) {
        return preguntaRepository.findById(id_pregunta).orElse(null);
    }
}
