package com.participante.citse.service;

import com.participante.citse.entity.PPTaller;

import java.util.List;

public interface PPTallerService {
    public List<PPTaller> findAll();
    public PPTaller findById(Integer id);
    public PPTaller save(PPTaller ppTaller);
    public void deleteById(Integer id);
}
