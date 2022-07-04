package com.maestra.citse.serviceImp;

import com.maestra.citse.entity.Comunidad;
import com.maestra.citse.repository.ComunidadRepository;
import com.maestra.citse.service.ComunidadService;
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
        comunidadState.setEsComunidad(false);
        comunidadRepository.save(comunidadState);
        return comunidadState;
    }

    @Override
    public Comunidad save(Comunidad comunidad) {
        return comunidadRepository.save(comunidad);
    }
}
