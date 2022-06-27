package com.cuestionario.service.service;

import com.cuestionario.service.entity.Cuestionario;

import java.util.List;

public interface CuestionarioService {

    List<Cuestionario> findAll();

    Cuestionario findById(int id_cuestionario);

}
