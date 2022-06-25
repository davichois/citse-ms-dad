package com.maestra.service.service;

import com.maestra.service.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();

    Persona findById(int id_persona);

    Persona deleteById(int id_persona);

}
