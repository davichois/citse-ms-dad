package com.negocio.service.service;

import com.negocio.service.entity.ProyectoLugar;

import java.util.List;

public interface ProyectoLugarService {
    List<ProyectoLugar> findAll();

    ProyectoLugar findById(int id_proyecto_lugar);

    ProyectoLugar deleteById(int id_proyecto_lugar);
}
