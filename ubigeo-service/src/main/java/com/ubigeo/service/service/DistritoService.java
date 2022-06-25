package com.ubigeo.service.service;

import com.ubigeo.service.entity.Distrito;

import java.util.List;

public interface DistritoService {

    List<Distrito> findAll();

    Distrito findById(int idDistrito);

    Distrito save(Distrito distrito);

    String delete(int idDistrito);

}
