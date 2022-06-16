package com.ubigeo.service.service;

import com.ubigeo.service.entity.Departamento;

import java.util.List;
import java.util.Map;

public interface DepartamentoService {
    Map<String,Object> findAll();
    public Departamento findById(int id);
    public Departamento save(Departamento departamento);
    public void delete(Departamento departamento);

}
