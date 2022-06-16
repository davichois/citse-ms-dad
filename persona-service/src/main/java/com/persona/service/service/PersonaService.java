package com.persona.service.service;

import com.persona.service.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();

    Persona findById(int id_persona);

    Persona deleteById(int id_persona);

}
