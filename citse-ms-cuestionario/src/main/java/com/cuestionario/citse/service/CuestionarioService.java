package com.cuestionario.citse.service;

import com.cuestionario.citse.entity.Cuestionario;

import java.util.List;

public interface CuestionarioService {

    List<Cuestionario> findAll();

    Cuestionario findById(int id_cuestionario);

}
