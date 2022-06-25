package com.negocio.service.service;

import com.negocio.service.entity.PersonaTaller;

import java.util.List;

public interface PersonaTallerService {

    List<PersonaTaller> findAll();

    PersonaTaller findById(int id_persona_taller);

    PersonaTaller deleteById(int id_persona_taller);

}
