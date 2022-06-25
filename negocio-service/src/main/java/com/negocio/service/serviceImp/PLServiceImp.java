package com.negocio.service.serviceImp;

import com.negocio.service.entity.ProyectoLugar;
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
    public List<ProyectoLugar> findAll() {
        return repo.findAll();
    }

    @Override
    public ProyectoLugar findById(int id_proyecto_lugar) {
        return repo.findById(id_proyecto_lugar).orElse(null);
    }

    @Override
    public ProyectoLugar deleteById(int id_proyecto_lugar) {
        ProyectoLugar PLestado= findById(id_proyecto_lugar);
        PLestado.setEs_proyecto_lugar(false);
        repo.save(PLestado);
        return PLestado;
    }
}
