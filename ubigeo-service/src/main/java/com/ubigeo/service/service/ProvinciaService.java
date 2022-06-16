package com.ubigeo.service.service;

import com.ubigeo.service.entity.Provincia;

import java.util.List;
import java.util.Map;

public interface ProvinciaService {

    Map<String,Object> findAll();
    public Provincia findById(int id);
    public Provincia save(Provincia provincia);
    public void delete(Provincia provincia);
}
