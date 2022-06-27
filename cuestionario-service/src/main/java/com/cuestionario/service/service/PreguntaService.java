package com.cuestionario.service.service;

import com.cuestionario.service.entity.Pregunta;

import java.util.List;

public interface PreguntaService {

    List<Pregunta> findAll();

    Pregunta findById(int id_pregunta);

}
