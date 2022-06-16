package com.tipo.service.service;

import com.tipo.service.entity.Tipo;

import java.util.List;

public interface TipoService {

    List<Tipo> findAll();

    Tipo findById(int id_tipo);

}
