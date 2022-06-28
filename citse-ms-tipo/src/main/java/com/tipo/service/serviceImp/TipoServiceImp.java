package com.tipo.service.serviceImp;

import com.tipo.service.entity.Tipo;
import com.tipo.service.repository.TipoRepository;
import com.tipo.service.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoServiceImp implements TipoService {

    @Autowired
    private TipoRepository tipoRepository;


    @Override
    public List<Tipo> findAll() {
        return tipoRepository.findAll();
    }

    @Override
    public Tipo findById(int id_tipo) {
        return tipoRepository.findById(id_tipo).orElseThrow();
    }

}
