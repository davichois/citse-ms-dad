package com.ubigeo.service.service;

import com.ubigeo.service.entity.Departamento;

import java.util.List;

public interface DepartamentoService {

    List<Departamento> findAll();

    Departamento findById(int idDepartamento);

    Departamento save(Departamento departamento);

    String delete(int idDepartamento);

}
