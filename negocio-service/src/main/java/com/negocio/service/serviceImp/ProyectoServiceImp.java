package com.negocio.service.serviceImp;

import com.negocio.service.entity.Proyecto;
import com.negocio.service.repository.ProyectoRepository;
import com.negocio.service.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoServiceImp implements ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;


    @Override
    public List<Proyecto> findAll() {
        return proyectoRepository.findAll();
    }

    @Override
    public Proyecto findById(int id_proyecto) {
        return proyectoRepository.findById(id_proyecto).orElseThrow();
    }

    @Override
    public Proyecto deleteById(int id_proyecto) {
        Proyecto proyectoState = findById(id_proyecto);
        proyectoState.setEs_proyecto(false);
        proyectoRepository.save(proyectoState);
        return proyectoState;
    }
}
