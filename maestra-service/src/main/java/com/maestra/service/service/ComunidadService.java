package com.maestra.service.service;

import com.maestra.service.entity.Comunidad;

import java.util.List;

public interface ComunidadService {

    List<Comunidad> findAll();

    Comunidad findById(int id_comunidad);

    Comunidad deleteById(int id_comunidad);

}
