package com.maestra.service.serviceImp;

import com.maestra.service.entity.Comunidad;
import com.maestra.service.repository.ComunidadRepository;
import com.maestra.service.service.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunidadServiceImp implements ComunidadService {

    @Autowired
    private ComunidadRepository comunidadRepository;


    @Override
    public List<Comunidad> findAll() {
        return comunidadRepository.findAll();
    }

    @Override
    public Comunidad findById(int id_comunidad) {
        return comunidadRepository.findById(id_comunidad).orElseThrow();
    }

    @Override
    public Comunidad deleteById(int id_comunidad) {
        Comunidad comunidadState = findById(id_comunidad);
        comunidadState.setEs_comunidad(false);
        comunidadRepository.save(comunidadState);
        return comunidadState;
    }
}
