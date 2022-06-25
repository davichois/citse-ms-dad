package com.negocio.service.service;

import com.negocio.service.entity.EntidadProyecto;

import java.util.List;

public interface EntidadProyectoService {
    List<EntidadProyecto> findAll();

    EntidadProyecto findById(int id_entidad_proyecto);

    EntidadProyecto deleteById(int id_entidad_proyecto);
}
