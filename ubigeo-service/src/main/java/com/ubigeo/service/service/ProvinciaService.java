package com.ubigeo.service.service;

import com.ubigeo.service.entity.Distrito;
import com.ubigeo.service.entity.Provincia;

import java.util.List;
import java.util.Map;

public interface ProvinciaService {

    List<Provincia> findAll();

    Provincia findById(int idProvincia);

    Provincia save(Provincia provincia);

    String delete(int idProvincia);

}
