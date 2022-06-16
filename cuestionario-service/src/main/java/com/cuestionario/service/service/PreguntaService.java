package com.cuestionario.service.service;

import com.cuestionario.service.entity.Pregunta;

import java.util.Map;

public interface PreguntaService {
    Map<String,Object> findAll();
    public Pregunta findById(int id);
    public Pregunta save(Pregunta pregunta);
}
