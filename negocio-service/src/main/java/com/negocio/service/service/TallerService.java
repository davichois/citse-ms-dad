package com.negocio.service.service;

import com.negocio.service.entity.Taller;

import java.util.List;

public interface TallerService {

    List<Taller> findAll();

    Taller findById(int id_taller);

    Taller deleteById(int id_taller);

}
