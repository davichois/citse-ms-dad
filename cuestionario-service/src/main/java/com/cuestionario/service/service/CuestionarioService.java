package com.cuestionario.service.service;

import com.cuestionario.service.entity.Cuestionario;

import java.util.Map;

public interface CuestionarioService {
    Map<String,Object> findAll();
    public Cuestionario findById(int Id);
    public Cuestionario save(Cuestionario cuestionario);
    public void delete(Cuestionario cuestionario);
}
