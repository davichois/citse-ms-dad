package com.negocio.service.serviceImp;

import com.negocio.service.entity.EntidadProyecto;
import com.negocio.service.repository.EPRepository;
import com.negocio.service.service.EntidadProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EPServiceImp implements EntidadProyectoService {

    @Autowired
    private EPRepository epRepository;


    @Override
    public List<EntidadProyecto> findAll() {
        return epRepository.findAll();
    }

    @Override
    public EntidadProyecto findById(int id_entidad_proyecto) {
        return epRepository.findById(id_entidad_proyecto).orElse(null);
    }

    @Override
    public EntidadProyecto deleteById(int id_entidad_proyecto) {
        EntidadProyecto EPestado= findById(id_entidad_proyecto);
        EPestado.setEsEntidadProyecto(false);
        epRepository.save(EPestado);
        return EPestado;
    }

}
