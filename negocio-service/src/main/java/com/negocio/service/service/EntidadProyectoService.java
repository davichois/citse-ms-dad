package com.negocio.service.service;

import com.negocio.service.entity.Entidad_Proyecto;

import java.util.List;

public interface EntidadProyectoService {
    List<Entidad_Proyecto> findAll();

    Entidad_Proyecto findById(int id_entidad_proyecto);

    Entidad_Proyecto deleteById(int id_entidad_proyecto);
}
