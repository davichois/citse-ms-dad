package com.maestra.citse.service;

import com.maestra.citse.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();

    Persona findById(int id_persona);

    Persona deleteById(int id_persona);

}
