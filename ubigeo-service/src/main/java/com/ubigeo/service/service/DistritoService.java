package com.ubigeo.service.service;

import com.ubigeo.service.entity.Distrito;

import java.util.List;
import java.util.Map;

public interface DistritoService {
    Map<String,Object> findAll();
    public Distrito findById(int id);
    public Distrito save(Distrito distrito);
    public void delete(Distrito distrito);
}
