package com.negocio.service.service;

import com.negocio.service.entity.Proyecto;

import java.util.List;

public interface ProyectoService {

    List<Proyecto> findAll();

    Proyecto findById(int id_proyecto);

    Proyecto deleteById(int id_proyecto);

}
