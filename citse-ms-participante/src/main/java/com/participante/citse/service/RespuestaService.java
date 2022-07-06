package com.participante.citse.service;

import com.participante.citse.entity.Respuesta;

import java.util.List;

public interface RespuestaService {
    public List<Respuesta> findAll();
    public Respuesta findById(Integer id);
    public Respuesta save(Respuesta respuesta);
    public void delete(Integer id);
}
