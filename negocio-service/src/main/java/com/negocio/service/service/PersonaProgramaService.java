package com.negocio.service.service;

import com.negocio.service.entity.PersonaPrograma;

import java.util.List;

public interface PersonaProgramaService {

    List<PersonaPrograma> findAll();

    PersonaPrograma findById(int id_persona_programa);

}
