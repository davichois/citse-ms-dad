package com.participante.citse.service;

import com.participante.citse.entity.PPTCuestionario;

import java.util.List;

public interface PPTCuestionarioService {
    public List<PPTCuestionario> findAll();
    public PPTCuestionario findById(Integer id);
    public PPTCuestionario save(PPTCuestionario pptCuestionario);
    public void deleteById(Integer id);
}
