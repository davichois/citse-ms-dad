package com.negocio.service.service;

import com.negocio.service.entity.Proyecto_Lugar;

import java.util.List;

public interface ProyectoLugarService {
    List<Proyecto_Lugar> findAll();

    Proyecto_Lugar findById(int id_proyecto_lugar);

    Proyecto_Lugar deleteById(int id_proyecto_lugar);
}
