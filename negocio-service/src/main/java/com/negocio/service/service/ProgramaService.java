package com.negocio.service.service;

import com.negocio.service.entity.Programa;

import java.util.List;

public interface ProgramaService {

    List<Programa> findAll();

    Programa findById(int id_programa);

    Programa deleteById(int id_programa);

}
