package com.tipo.service.service;

import com.tipo.service.entity.Familia;

import java.util.List;

public interface FamiliaService {

    List<Familia> findAll();

    Familia findById(int id_familia);

}
