package com.negocio.service.serviceImp;

import com.negocio.service.entity.Proyecto_Lugar;
import com.negocio.service.repository.PLRepository;
import com.negocio.service.service.ProyectoLugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PLServiceImp implements ProyectoLugarService {

    @Autowired
    private PLRepository repo;

    @Override
    public List<Proyecto_Lugar> findAll() {
        return repo.findAll();
    }

    @Override
    public Proyecto_Lugar findById(int id_proyecto_lugar) {
        return repo.findById(id_proyecto_lugar).orElse(null);
    }

    @Override
    public Proyecto_Lugar deleteById(int id_proyecto_lugar) {
        Proyecto_Lugar PLestado= findById(id_proyecto_lugar);
        PLestado.setEs_proyecto_lugar(false);
        repo.save(PLestado);
        return PLestado;
    }
}
