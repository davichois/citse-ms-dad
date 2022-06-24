package com.negocio.service.serviceImp;

import com.negocio.service.entity.Entidad_Proyecto;
import com.negocio.service.repository.EPRepository;
import com.negocio.service.service.EntidadProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EPServiceImp implements EntidadProyectoService {

    @Autowired
    private EPRepository repo;


    @Override
    public List<Entidad_Proyecto> findAll() {
        return repo.findAll();
    }

    @Override
    public Entidad_Proyecto findById(int id_entidad_proyecto) {
        return repo.findById(id_entidad_proyecto).orElse(null);
    }

    @Override
    public Entidad_Proyecto deleteById(int id_entidad_proyecto) {
        Entidad_Proyecto EPestado= findById(id_entidad_proyecto);
        EPestado.setEs_entidad_proyecto(false);
        repo.save(EPestado);
        return EPestado;
    }
}
